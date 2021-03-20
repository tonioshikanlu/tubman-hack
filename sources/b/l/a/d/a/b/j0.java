package b.l.a.d.a.b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class j0 extends OutputStream {

    /* renamed from: h  reason: collision with root package name */
    public final g1 f4565h = new g1();

    /* renamed from: i  reason: collision with root package name */
    public final File f4566i;

    /* renamed from: j  reason: collision with root package name */
    public final t1 f4567j;

    /* renamed from: k  reason: collision with root package name */
    public long f4568k;

    /* renamed from: l  reason: collision with root package name */
    public long f4569l;

    /* renamed from: m  reason: collision with root package name */
    public FileOutputStream f4570m;

    /* renamed from: n  reason: collision with root package name */
    public y1 f4571n;

    public j0(File file, t1 t1Var) {
        this.f4566i = file;
        this.f4567j = t1Var;
    }

    public final void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i2, int i3) {
        int i4;
        while (i3 > 0) {
            if (this.f4568k == 0 && this.f4569l == 0) {
                int a = this.f4565h.a(bArr, i2, i3);
                if (a != -1) {
                    i2 += a;
                    i3 -= a;
                    y1 b2 = this.f4565h.b();
                    this.f4571n = b2;
                    if (b2.f4652e) {
                        this.f4568k = 0;
                        t1 t1Var = this.f4567j;
                        byte[] bArr2 = b2.f;
                        t1Var.k(bArr2, bArr2.length);
                        this.f4569l = (long) this.f4571n.f.length;
                    } else if (!b2.b() || this.f4571n.a()) {
                        byte[] bArr3 = this.f4571n.f;
                        this.f4567j.k(bArr3, bArr3.length);
                        this.f4568k = this.f4571n.f4651b;
                    } else {
                        this.f4567j.f(this.f4571n.f);
                        File file = new File(this.f4566i, this.f4571n.a);
                        file.getParentFile().mkdirs();
                        this.f4568k = this.f4571n.f4651b;
                        this.f4570m = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f4571n.a()) {
                y1 y1Var = this.f4571n;
                if (y1Var.f4652e) {
                    this.f4567j.h(this.f4569l, bArr, i2, i3);
                    this.f4569l += (long) i3;
                    i4 = i3;
                } else if (y1Var.b()) {
                    i4 = (int) Math.min((long) i3, this.f4568k);
                    this.f4570m.write(bArr, i2, i4);
                    long j2 = this.f4568k - ((long) i4);
                    this.f4568k = j2;
                    if (j2 == 0) {
                        this.f4570m.close();
                    }
                } else {
                    i4 = (int) Math.min((long) i3, this.f4568k);
                    y1 y1Var2 = this.f4571n;
                    int length = y1Var2.f.length;
                    long j3 = y1Var2.f4651b;
                    this.f4567j.h((((long) length) + j3) - this.f4568k, bArr, i2, i4);
                    this.f4568k -= (long) i4;
                }
                i2 += i4;
                i3 -= i4;
            }
        }
    }
}
