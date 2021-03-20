package b.j.a.b.w;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class c extends OutputStream {

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f1550l = new byte[0];

    /* renamed from: h  reason: collision with root package name */
    public final LinkedList<byte[]> f1551h = new LinkedList<>();

    /* renamed from: i  reason: collision with root package name */
    public int f1552i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f1553j;

    /* renamed from: k  reason: collision with root package name */
    public int f1554k;

    public c(a aVar, int i2) {
        this.f1553j = aVar == null ? new byte[i2] : aVar.a(2);
    }

    public c(byte[] bArr, int i2) {
        this.f1553j = bArr;
        this.f1554k = i2;
    }

    public void H() {
        this.f1552i = 0;
        this.f1554k = 0;
        if (!this.f1551h.isEmpty()) {
            this.f1551h.clear();
        }
    }

    public byte[] N() {
        int i2 = this.f1552i + this.f1554k;
        if (i2 == 0) {
            return f1550l;
        }
        byte[] bArr = new byte[i2];
        Iterator it = this.f1551h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i3, length);
            i3 += length;
        }
        System.arraycopy(this.f1553j, 0, bArr, i3, this.f1554k);
        int i4 = i3 + this.f1554k;
        if (i4 == i2) {
            if (!this.f1551h.isEmpty()) {
                H();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i2 + ", copied " + i4 + " bytes");
    }

    public final void b() {
        int length = this.f1552i + this.f1553j.length;
        if (length >= 0) {
            this.f1552i = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f1551h.add(this.f1553j);
            this.f1553j = new byte[max];
            this.f1554k = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public void close() {
    }

    public void e(int i2) {
        if (this.f1554k >= this.f1553j.length) {
            b();
        }
        byte[] bArr = this.f1553j;
        int i3 = this.f1554k;
        this.f1554k = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    public void flush() {
    }

    public void q(int i2) {
        int i3 = this.f1554k;
        int i4 = i3 + 2;
        byte[] bArr = this.f1553j;
        if (i4 < bArr.length) {
            int i5 = i3 + 1;
            this.f1554k = i5;
            bArr[i3] = (byte) (i2 >> 16);
            int i6 = i5 + 1;
            this.f1554k = i6;
            bArr[i5] = (byte) (i2 >> 8);
            this.f1554k = i6 + 1;
            bArr[i6] = (byte) i2;
            return;
        }
        e(i2 >> 16);
        e(i2 >> 8);
        e(i2);
    }

    public void write(int i2) {
        e(i2);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        while (true) {
            int min = Math.min(this.f1553j.length - this.f1554k, i3);
            if (min > 0) {
                System.arraycopy(bArr, i2, this.f1553j, this.f1554k, min);
                i2 += min;
                this.f1554k += min;
                i3 -= min;
            }
            if (i3 > 0) {
                b();
            } else {
                return;
            }
        }
    }

    public void z(int i2) {
        int i3 = this.f1554k;
        int i4 = i3 + 1;
        byte[] bArr = this.f1553j;
        if (i4 < bArr.length) {
            int i5 = i3 + 1;
            this.f1554k = i5;
            bArr[i3] = (byte) (i2 >> 8);
            this.f1554k = i5 + 1;
            bArr[i5] = (byte) i2;
            return;
        }
        e(i2 >> 8);
        e(i2);
    }
}
