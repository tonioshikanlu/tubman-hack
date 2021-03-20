package com.segment.analytics;

import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import com.segment.analytics.PayloadQueue;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile implements Closeable {
    public static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private static final byte[] ZEROES = new byte[4096];
    private final byte[] buffer = new byte[16];
    private int elementCount;
    public int fileLength;
    private Element first;
    private Element last;
    public final RandomAccessFile raf;

    public static class Element {
        public static final int HEADER_LENGTH = 4;
        public static final Element NULL = new Element(0, 0);
        public final int length;
        public final int position;

        public Element(int i2, int i3) {
            this.position = i2;
            this.length = i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            return a.o(sb, this.length, "]");
        }
    }

    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        public ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        public int read() {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek((long) this.position);
            int read = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return read;
        }

        public int read(byte[] bArr, int i2, int i3) {
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.remaining;
            if (i4 == 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            QueueFile.this.ringRead(this.position, bArr, i2, i3);
            this.position = QueueFile.this.wrapPosition(this.position + i3);
            this.remaining -= i3;
            return i3;
        }
    }

    public QueueFile(File file) {
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    public QueueFile(RandomAccessFile randomAccessFile) {
        this.raf = randomAccessFile;
        readHeader();
    }

    private void expandIfNecessary(int i2) {
        int i3 = i2 + 4;
        int remainingBytes = remainingBytes();
        if (remainingBytes < i3) {
            int i4 = this.fileLength;
            while (true) {
                remainingBytes += i4;
                int i5 = i4 << 1;
                if (i5 < i4) {
                    throw new EOFException(a.h("Cannot grow file beyond ", i4, " bytes"));
                } else if (remainingBytes >= i3) {
                    setLength(i5);
                    Element element = this.last;
                    int wrapPosition = wrapPosition(element.position + 4 + element.length);
                    if (wrapPosition <= this.first.position) {
                        FileChannel channel = this.raf.getChannel();
                        channel.position((long) this.fileLength);
                        int i6 = wrapPosition - 16;
                        long j2 = (long) i6;
                        if (channel.transferTo(16, j2, channel) == j2) {
                            ringErase(16, i6);
                        } else {
                            throw new AssertionError("Copied insufficient number of bytes!");
                        }
                    }
                    int i7 = this.last.position;
                    int i8 = this.first.position;
                    if (i7 < i8) {
                        int i9 = (this.fileLength + i7) - 16;
                        writeHeader(i5, this.elementCount, i8, i9);
                        this.last = new Element(i9, this.last.length);
                    } else {
                        writeHeader(i5, this.elementCount, i8, i7);
                    }
                    this.fileLength = i5;
                    return;
                } else {
                    i4 = i5;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private static void initialize(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile open = open(file2);
        try {
            open.setLength(4096);
            open.seek(0);
            byte[] bArr = new byte[16];
            writeInt(bArr, 0, 4096);
            open.write(bArr);
            open.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i2) {
        if (i2 == 0) {
            return Element.NULL;
        }
        ringRead(i2, this.buffer, 0, 4);
        return new Element(i2, readInt(this.buffer, 0));
    }

    private void readHeader() {
        this.raf.seek(0);
        this.raf.readFully(this.buffer);
        this.fileLength = readInt(this.buffer, 0);
        this.elementCount = readInt(this.buffer, 4);
        int readInt = readInt(this.buffer, 8);
        int readInt2 = readInt(this.buffer, 12);
        if (((long) this.fileLength) <= this.raf.length()) {
            int i2 = this.fileLength;
            if (i2 <= 0) {
                throw new IOException(a.o(a.y("File is corrupt; length stored in header ("), this.fileLength, ") is invalid."));
            } else if (readInt < 0 || i2 <= wrapPosition(readInt)) {
                throw new IOException(a.h("File is corrupt; first position stored in header (", readInt, ") is invalid."));
            } else if (readInt2 < 0 || this.fileLength <= wrapPosition(readInt2)) {
                throw new IOException(a.h("File is corrupt; last position stored in header (", readInt2, ") is invalid."));
            } else {
                this.first = readElement(readInt);
                this.last = readElement(readInt2);
            }
        } else {
            StringBuilder y = a.y("File is truncated. Expected length: ");
            y.append(this.fileLength);
            y.append(", Actual length: ");
            y.append(this.raf.length());
            throw new IOException(y.toString());
        }
    }

    private static int readInt(byte[] bArr, int i2) {
        return ((bArr[i2] & ExifInterface.MARKER) << 24) + ((bArr[i2 + 1] & ExifInterface.MARKER) << 16) + ((bArr[i2 + 2] & ExifInterface.MARKER) << 8) + (bArr[i2 + 3] & ExifInterface.MARKER);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    private void ringErase(int i2, int i3) {
        while (i3 > 0) {
            byte[] bArr = ZEROES;
            int min = Math.min(i3, bArr.length);
            ringWrite(i2, bArr, 0, min);
            i3 -= min;
            i2 += min;
        }
    }

    private void ringWrite(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int wrapPosition = wrapPosition(i2);
        int i5 = wrapPosition + i4;
        int i6 = this.fileLength;
        if (i5 <= i6) {
            this.raf.seek((long) wrapPosition);
            randomAccessFile = this.raf;
        } else {
            int i7 = i6 - wrapPosition;
            this.raf.seek((long) wrapPosition);
            this.raf.write(bArr, i3, i7);
            this.raf.seek(16);
            randomAccessFile = this.raf;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    private void setLength(int i2) {
        this.raf.setLength((long) i2);
        this.raf.getChannel().force(true);
    }

    private int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i2 = element.position;
        int i3 = this.first.position;
        return i2 >= i3 ? (i2 - i3) + 4 + element.length + 16 : (((i2 + 4) + element.length) + this.fileLength) - i3;
    }

    private void writeHeader(int i2, int i3, int i4, int i5) {
        writeInt(this.buffer, 0, i2);
        writeInt(this.buffer, 4, i3);
        writeInt(this.buffer, 8, i4);
        writeInt(this.buffer, 12, i5);
        this.raf.seek(0);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public void add(byte[] bArr) {
        add(bArr, 0, bArr.length);
    }

    public synchronized void add(byte[] bArr, int i2, int i3) {
        int i4;
        if (bArr != null) {
            if ((i2 | i3) >= 0) {
                if (i3 <= bArr.length - i2) {
                    expandIfNecessary(i3);
                    boolean isEmpty = isEmpty();
                    if (isEmpty) {
                        i4 = 16;
                    } else {
                        Element element = this.last;
                        i4 = wrapPosition(element.position + 4 + element.length);
                    }
                    Element element2 = new Element(i4, i3);
                    writeInt(this.buffer, 0, i3);
                    ringWrite(element2.position, this.buffer, 0, 4);
                    ringWrite(element2.position + 4, bArr, i2, i3);
                    writeHeader(this.fileLength, this.elementCount + 1, isEmpty ? element2.position : this.first.position, element2.position);
                    this.last = element2;
                    this.elementCount++;
                    if (isEmpty) {
                        this.first = element2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("data == null");
    }

    public synchronized void clear() {
        writeHeader(4096, 0, 0, 0);
        this.raf.seek(16);
        this.raf.write(ZEROES, 0, 4080);
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096);
        }
        this.fileLength = 4096;
    }

    public synchronized void close() {
        this.raf.close();
    }

    public synchronized int forEach(PayloadQueue.ElementVisitor elementVisitor) {
        int i2 = this.first.position;
        int i3 = 0;
        while (true) {
            int i4 = this.elementCount;
            if (i3 >= i4) {
                return i4;
            }
            Element readElement = readElement(i2);
            if (!elementVisitor.read(new ElementInputStream(readElement), readElement.length)) {
                return i3 + 1;
            }
            i2 = wrapPosition(readElement.position + 4 + readElement.length);
            i3++;
        }
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i2 = element.length;
        byte[] bArr = new byte[i2];
        ringRead(element.position + 4, bArr, 0, i2);
        return bArr;
    }

    public synchronized void remove() {
        remove(1);
    }

    public synchronized void remove(int i2) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i2 + ") number of elements.");
        } else if (i2 != 0) {
            int i3 = this.elementCount;
            if (i2 == i3) {
                clear();
            } else if (i2 <= i3) {
                Element element = this.first;
                int i4 = element.position;
                int i5 = element.length;
                int i6 = i4;
                int i7 = 0;
                for (int i8 = 0; i8 < i2; i8++) {
                    i7 += i5 + 4;
                    i6 = wrapPosition(i6 + 4 + i5);
                    ringRead(i6, this.buffer, 0, 4);
                    i5 = readInt(this.buffer, 0);
                }
                writeHeader(this.fileLength, this.elementCount - i2, i6, this.last.position);
                this.elementCount -= i2;
                this.first = new Element(i6, i5);
                ringErase(i4, i7);
            } else {
                throw new IllegalArgumentException("Cannot remove more elements (" + i2 + ") than present in queue (" + this.elementCount + ").");
            }
        }
    }

    public void ringRead(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int wrapPosition = wrapPosition(i2);
        int i5 = wrapPosition + i4;
        int i6 = this.fileLength;
        if (i5 <= i6) {
            this.raf.seek((long) wrapPosition);
            randomAccessFile = this.raf;
        } else {
            int i7 = i6 - wrapPosition;
            this.raf.seek((long) wrapPosition);
            this.raf.readFully(bArr, i3, i7);
            this.raf.seek(16);
            randomAccessFile = this.raf;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach(new PayloadQueue.ElementVisitor() {
                public boolean first = true;

                public boolean read(InputStream inputStream, int i2) {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                    return true;
                }
            });
        } catch (IOException e2) {
            LOGGER.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int wrapPosition(int i2) {
        int i3 = this.fileLength;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }
}
