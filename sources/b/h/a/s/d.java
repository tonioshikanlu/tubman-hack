package b.h.a.s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class d extends InputStream {

    /* renamed from: j  reason: collision with root package name */
    public static final Queue<d> f1009j = new ArrayDeque(0);

    /* renamed from: h  reason: collision with root package name */
    public InputStream f1010h;

    /* renamed from: i  reason: collision with root package name */
    public IOException f1011i;

    static {
        char[] cArr = j.a;
    }

    public int available() {
        return this.f1010h.available();
    }

    public void b() {
        this.f1011i = null;
        this.f1010h = null;
        Queue<d> queue = f1009j;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void close() {
        this.f1010h.close();
    }

    public void mark(int i2) {
        this.f1010h.mark(i2);
    }

    public boolean markSupported() {
        return this.f1010h.markSupported();
    }

    public int read() {
        try {
            return this.f1010h.read();
        } catch (IOException e2) {
            this.f1011i = e2;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f1010h.read(bArr);
        } catch (IOException e2) {
            this.f1011i = e2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f1010h.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f1011i = e2;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f1010h.reset();
    }

    public long skip(long j2) {
        try {
            return this.f1010h.skip(j2);
        } catch (IOException e2) {
            this.f1011i = e2;
            return 0;
        }
    }
}
