package b.l.a.d.a.b;

import b.l.a.c.b.a;
import b.l.a.d.a.e.b0;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

public final class r1 {
    public static final f c = new f("PatchSliceTaskHandler");
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<n2> f4619b;

    public r1(t tVar, c0<n2> c0Var) {
        this.a = tVar;
        this.f4619b = c0Var;
    }

    public final void a(q1 q1Var) {
        InputStream inputStream;
        File j2 = this.a.j(q1Var.f4647b, q1Var.c, q1Var.d);
        t tVar = this.a;
        String str = q1Var.f4647b;
        int i2 = q1Var.c;
        long j3 = q1Var.d;
        String str2 = q1Var.f4611h;
        Objects.requireNonNull(tVar);
        File file = new File(new File(tVar.j(str, i2, j3), "_metadata"), str2);
        try {
            inputStream = q1Var.f4613j;
            if (q1Var.f4610g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            v vVar = new v(j2, file);
            File k2 = this.a.k(q1Var.f4647b, q1Var.f4609e, q1Var.f, q1Var.f4611h);
            if (!k2.exists()) {
                k2.mkdirs();
            }
            t1 t1Var = new t1(this.a, q1Var.f4647b, q1Var.f4609e, q1Var.f, q1Var.f4611h);
            a.j0(vVar, inputStream, new j0(k2, t1Var), q1Var.f4612i);
            t1Var.d(0);
            inputStream.close();
            c.b(4, "Patching and extraction finished for slice %s of pack %s.", new Object[]{q1Var.f4611h, q1Var.f4647b});
            this.f4619b.a().g(q1Var.a, q1Var.f4647b, q1Var.f4611h, 0);
            try {
                q1Var.f4613j.close();
                return;
            } catch (IOException unused) {
                c.b(5, "Could not close file for slice %s of pack %s.", new Object[]{q1Var.f4611h, q1Var.f4647b});
                return;
            }
        } catch (IOException e2) {
            c.b(6, "IOException during patching %s.", new Object[]{e2.getMessage()});
            throw new g0(String.format("Error patching slice %s of pack %s.", new Object[]{q1Var.f4611h, q1Var.f4647b}), e2, q1Var.a);
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }
}
