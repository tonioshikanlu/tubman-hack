package b.l.a.d.a.b;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

public final class a0 extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public final g1 f4477h = new g1();

    /* renamed from: i  reason: collision with root package name */
    public byte[] f4478i = new byte[4096];

    /* renamed from: j  reason: collision with root package name */
    public long f4479j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4480k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4481l = false;

    public a0(InputStream inputStream) {
        super(inputStream);
    }

    public final y1 b() {
        byte[] bArr;
        if (this.f4479j > 0) {
            do {
                bArr = this.f4478i;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f4480k || this.f4481l) {
            return new y1((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!e(30)) {
            this.f4480k = true;
            return this.f4477h.b();
        }
        y1 b2 = this.f4477h.b();
        if (b2.f4652e) {
            this.f4481l = true;
            return b2;
        } else if (b2.f4651b != 4294967295L) {
            int i2 = this.f4477h.f - 30;
            long j2 = (long) i2;
            int length = this.f4478i.length;
            if (j2 > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j2);
                this.f4478i = Arrays.copyOf(this.f4478i, length);
            }
            if (!e(i2)) {
                this.f4480k = true;
                return this.f4477h.b();
            }
            y1 b3 = this.f4477h.b();
            this.f4479j = b3.f4651b;
            return b3;
        } else {
            throw new g0("Files bigger than 4GiB are not supported.");
        }
    }

    public final boolean e(int i2) {
        int q2 = q(this.f4478i, 0, i2);
        if (q2 != i2) {
            int i3 = i2 - q2;
            if (q(this.f4478i, q2, i3) != i3) {
                this.f4477h.a(this.f4478i, 0, q2);
                return false;
            }
        }
        this.f4477h.a(this.f4478i, 0, i2);
        return true;
    }

    public final int q(byte[] bArr, int i2, int i3) {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f4479j;
        if (j2 <= 0 || this.f4480k) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i2, (int) Math.min(j2, (long) i3)));
        this.f4479j -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f4480k = true;
        return 0;
    }
}
