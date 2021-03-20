package b.l.d.q.f.h;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    public static final Logger f5134n = Logger.getLogger(c.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public final RandomAccessFile f5135h;

    /* renamed from: i  reason: collision with root package name */
    public int f5136i;

    /* renamed from: j  reason: collision with root package name */
    public int f5137j;

    /* renamed from: k  reason: collision with root package name */
    public b f5138k;

    /* renamed from: l  reason: collision with root package name */
    public b f5139l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f5140m = new byte[16];

    public class a implements d {
        public boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f5141b;

        public a(c cVar, StringBuilder sb) {
            this.f5141b = sb;
        }

        public void read(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.f5141b.append(", ");
            }
            this.f5141b.append(i2);
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5142b;

        public b(int i2, int i3) {
            this.a = i2;
            this.f5142b = i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return b.e.a.a.a.o(sb, this.f5142b, "]");
        }
    }

    public interface d {
        void read(InputStream inputStream, int i2);
    }

    /* JADX INFO: finally extract failed */
    public c(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    o0(bArr, i2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f5135h = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(this.f5140m);
        int S = S(this.f5140m, 0);
        this.f5136i = S;
        if (((long) S) <= randomAccessFile2.length()) {
            this.f5137j = S(this.f5140m, 4);
            int S2 = S(this.f5140m, 8);
            int S3 = S(this.f5140m, 12);
            this.f5138k = O(S2);
            this.f5139l = O(S3);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("File is truncated. Expected length: ");
        y.append(this.f5136i);
        y.append(", Actual length: ");
        y.append(randomAccessFile2.length());
        throw new IOException(y.toString());
    }

    public static int S(byte[] bArr, int i2) {
        return ((bArr[i2] & ExifInterface.MARKER) << 24) + ((bArr[i2 + 1] & ExifInterface.MARKER) << 16) + ((bArr[i2 + 2] & ExifInterface.MARKER) << 8) + (bArr[i2 + 3] & ExifInterface.MARKER);
    }

    public static int b(c cVar, int i2) {
        int i3 = cVar.f5136i;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public static void o0(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public synchronized void H(d dVar) {
        int i2 = this.f5138k.a;
        for (int i3 = 0; i3 < this.f5137j; i3++) {
            b O = O(i2);
            dVar.read(new C0078c(O, (a) null), O.f5142b);
            i2 = m0(O.a + 4 + O.f5142b);
        }
    }

    public synchronized boolean N() {
        return this.f5137j == 0;
    }

    public final b O(int i2) {
        if (i2 == 0) {
            return b.c;
        }
        this.f5135h.seek((long) i2);
        return new b(i2, this.f5135h.readInt());
    }

    public synchronized void Y() {
        if (N()) {
            throw new NoSuchElementException();
        } else if (this.f5137j == 1) {
            q();
        } else {
            b bVar = this.f5138k;
            int m0 = m0(bVar.a + 4 + bVar.f5142b);
            e0(m0, this.f5140m, 0, 4);
            int S = S(this.f5140m, 0);
            n0(this.f5136i, this.f5137j - 1, m0, this.f5139l.a);
            this.f5137j--;
            this.f5138k = new b(m0, S);
        }
    }

    public synchronized void close() {
        this.f5135h.close();
    }

    public void e(byte[] bArr) {
        int i2;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    z(length);
                    boolean N = N();
                    if (N) {
                        i2 = 16;
                    } else {
                        b bVar = this.f5139l;
                        i2 = m0(bVar.a + 4 + bVar.f5142b);
                    }
                    b bVar2 = new b(i2, length);
                    o0(this.f5140m, 0, length);
                    g0(bVar2.a, this.f5140m, 0, 4);
                    g0(bVar2.a + 4, bArr, 0, length);
                    n0(this.f5136i, this.f5137j + 1, N ? bVar2.a : this.f5138k.a, bVar2.a);
                    this.f5139l = bVar2;
                    this.f5137j++;
                    if (N) {
                        this.f5138k = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void e0(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int i5 = this.f5136i;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.f5135h.seek((long) i2);
            randomAccessFile = this.f5135h;
        } else {
            int i6 = i5 - i2;
            this.f5135h.seek((long) i2);
            this.f5135h.readFully(bArr, i3, i6);
            this.f5135h.seek(16);
            randomAccessFile = this.f5135h;
            i3 += i6;
            i4 -= i6;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    public final void g0(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int i5 = this.f5136i;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.f5135h.seek((long) i2);
            randomAccessFile = this.f5135h;
        } else {
            int i6 = i5 - i2;
            this.f5135h.seek((long) i2);
            this.f5135h.write(bArr, i3, i6);
            this.f5135h.seek(16);
            randomAccessFile = this.f5135h;
            i3 += i6;
            i4 -= i6;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    public int k0() {
        if (this.f5137j == 0) {
            return 16;
        }
        b bVar = this.f5139l;
        int i2 = bVar.a;
        int i3 = this.f5138k.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.f5142b + 16 : (((i2 + 4) + bVar.f5142b) + this.f5136i) - i3;
    }

    public final int m0(int i2) {
        int i3 = this.f5136i;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void n0(int i2, int i3, int i4, int i5) {
        byte[] bArr = this.f5140m;
        int[] iArr = {i2, i3, i4, i5};
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            o0(bArr, i6, iArr[i7]);
            i6 += 4;
        }
        this.f5135h.seek(0);
        this.f5135h.write(this.f5140m);
    }

    public synchronized void q() {
        n0(4096, 0, 0, 0);
        this.f5137j = 0;
        b bVar = b.c;
        this.f5138k = bVar;
        this.f5139l = bVar;
        if (this.f5136i > 4096) {
            this.f5135h.setLength((long) 4096);
            this.f5135h.getChannel().force(true);
        }
        this.f5136i = 4096;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5136i);
        sb.append(", size=");
        sb.append(this.f5137j);
        sb.append(", first=");
        sb.append(this.f5138k);
        sb.append(", last=");
        sb.append(this.f5139l);
        sb.append(", element lengths=[");
        try {
            H(new a(this, sb));
        } catch (IOException e2) {
            f5134n.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void z(int i2) {
        int i3 = i2 + 4;
        int k0 = this.f5136i - k0();
        if (k0 < i3) {
            int i4 = this.f5136i;
            do {
                k0 += i4;
                i4 <<= 1;
            } while (k0 < i3);
            this.f5135h.setLength((long) i4);
            this.f5135h.getChannel().force(true);
            b bVar = this.f5139l;
            int m0 = m0(bVar.a + 4 + bVar.f5142b);
            if (m0 < this.f5138k.a) {
                FileChannel channel = this.f5135h.getChannel();
                channel.position((long) this.f5136i);
                long j2 = (long) (m0 - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f5139l.a;
            int i6 = this.f5138k.a;
            if (i5 < i6) {
                int i7 = (this.f5136i + i5) - 16;
                n0(i4, this.f5137j, i6, i7);
                this.f5139l = new b(i7, this.f5139l.f5142b);
            } else {
                n0(i4, this.f5137j, i6, i5);
            }
            this.f5136i = i4;
        }
    }

    /* renamed from: b.l.d.q.f.h.c$c  reason: collision with other inner class name */
    public final class C0078c extends InputStream {

        /* renamed from: h  reason: collision with root package name */
        public int f5143h;

        /* renamed from: i  reason: collision with root package name */
        public int f5144i;

        public C0078c(b bVar, a aVar) {
            int i2 = bVar.a + 4;
            int i3 = c.this.f5136i;
            this.f5143h = i2 >= i3 ? (i2 + 16) - i3 : i2;
            this.f5144i = bVar.f5142b;
        }

        public int read() {
            if (this.f5144i == 0) {
                return -1;
            }
            c.this.f5135h.seek((long) this.f5143h);
            int read = c.this.f5135h.read();
            this.f5143h = c.b(c.this, this.f5143h + 1);
            this.f5144i--;
            return read;
        }

        public int read(byte[] bArr, int i2, int i3) {
            Objects.requireNonNull(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f5144i;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            c.this.e0(this.f5143h, bArr, i2, i3);
            this.f5143h = c.b(c.this, this.f5143h + i3);
            this.f5144i -= i3;
            return i3;
        }
    }
}
