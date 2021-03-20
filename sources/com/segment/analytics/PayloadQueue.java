package com.segment.analytics;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

public abstract class PayloadQueue implements Closeable {

    public interface ElementVisitor {
        boolean read(InputStream inputStream, int i2);
    }

    public static class MemoryQueue extends PayloadQueue {
        public final LinkedList<byte[]> queue = new LinkedList<>();

        public void add(byte[] bArr) {
            this.queue.add(bArr);
        }

        public void close() {
        }

        public void forEach(ElementVisitor elementVisitor) {
            int i2 = 0;
            while (i2 < this.queue.size()) {
                byte[] bArr = this.queue.get(i2);
                if (elementVisitor.read(new ByteArrayInputStream(bArr), bArr.length)) {
                    i2++;
                } else {
                    return;
                }
            }
        }

        public void remove(int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                this.queue.remove();
            }
        }

        public int size() {
            return this.queue.size();
        }
    }

    public static class PersistentQueue extends PayloadQueue {
        public final QueueFile queueFile;

        public PersistentQueue(QueueFile queueFile2) {
            this.queueFile = queueFile2;
        }

        public void add(byte[] bArr) {
            this.queueFile.add(bArr);
        }

        public void close() {
            this.queueFile.close();
        }

        public void forEach(ElementVisitor elementVisitor) {
            this.queueFile.forEach(elementVisitor);
        }

        public void remove(int i2) {
            try {
                this.queueFile.remove(i2);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2);
            }
        }

        public int size() {
            return this.queueFile.size();
        }
    }

    public abstract void add(byte[] bArr);

    public abstract void forEach(ElementVisitor elementVisitor);

    public abstract void remove(int i2);

    public abstract int size();
}
