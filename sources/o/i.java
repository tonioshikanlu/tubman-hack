package o;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class i implements x {

    /* renamed from: h  reason: collision with root package name */
    public boolean f10460h;

    /* renamed from: i  reason: collision with root package name */
    public final f f10461i;

    /* renamed from: j  reason: collision with root package name */
    public final Deflater f10462j;

    public i(x xVar, Deflater deflater) {
        e.x.c.i.e(xVar, "sink");
        e.x.c.i.e(deflater, "deflater");
        f l2 = c.l(xVar);
        e.x.c.i.e(l2, "sink");
        e.x.c.i.e(deflater, "deflater");
        this.f10461i = l2;
        this.f10462j = deflater;
    }

    @IgnoreJRERequirement
    public final void b(boolean z) {
        u q0;
        e d = this.f10461i.d();
        while (true) {
            q0 = d.q0(1);
            Deflater deflater = this.f10462j;
            byte[] bArr = q0.a;
            int i2 = q0.c;
            int i3 = 8192 - i2;
            int deflate = z ? deflater.deflate(bArr, i2, i3, 2) : deflater.deflate(bArr, i2, i3);
            if (deflate > 0) {
                q0.c += deflate;
                d.f10453i += (long) deflate;
                this.f10461i.Q();
            } else if (this.f10462j.needsInput()) {
                break;
            }
        }
        if (q0.f10489b == q0.c) {
            d.f10452h = q0.a();
            v.a(q0);
        }
    }

    public void close() {
        if (!this.f10460h) {
            Throwable th = null;
            try {
                this.f10462j.finish();
                b(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f10462j.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f10461i.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f10460h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public a0 f() {
        return this.f10461i.f();
    }

    public void flush() {
        b(true);
        this.f10461i.flush();
    }

    public void j(e eVar, long j2) {
        e.x.c.i.e(eVar, "source");
        c.p(eVar.f10453i, 0, j2);
        while (j2 > 0) {
            u uVar = eVar.f10452h;
            e.x.c.i.c(uVar);
            int min = (int) Math.min(j2, (long) (uVar.c - uVar.f10489b));
            this.f10462j.setInput(uVar.a, uVar.f10489b, min);
            b(false);
            long j3 = (long) min;
            eVar.f10453i -= j3;
            int i2 = uVar.f10489b + min;
            uVar.f10489b = i2;
            if (i2 == uVar.c) {
                eVar.f10452h = uVar.a();
                v.a(uVar);
            }
            j2 -= j3;
        }
    }

    public String toString() {
        StringBuilder y = a.y("DeflaterSink(");
        y.append(this.f10461i);
        y.append(')');
        return y.toString();
    }
}
