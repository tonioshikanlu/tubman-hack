package o;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.io.OutputStream;

public final class r implements x {

    /* renamed from: h  reason: collision with root package name */
    public final OutputStream f10480h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f10481i;

    public r(OutputStream outputStream, a0 a0Var) {
        i.e(outputStream, "out");
        i.e(a0Var, "timeout");
        this.f10480h = outputStream;
        this.f10481i = a0Var;
    }

    public void close() {
        this.f10480h.close();
    }

    public a0 f() {
        return this.f10481i;
    }

    public void flush() {
        this.f10480h.flush();
    }

    public void j(e eVar, long j2) {
        i.e(eVar, "source");
        c.p(eVar.f10453i, 0, j2);
        while (j2 > 0) {
            this.f10481i.f();
            u uVar = eVar.f10452h;
            i.c(uVar);
            int min = (int) Math.min(j2, (long) (uVar.c - uVar.f10489b));
            this.f10480h.write(uVar.a, uVar.f10489b, min);
            int i2 = uVar.f10489b + min;
            uVar.f10489b = i2;
            long j3 = (long) min;
            j2 -= j3;
            eVar.f10453i -= j3;
            if (i2 == uVar.c) {
                eVar.f10452h = uVar.a();
                v.a(uVar);
            }
        }
    }

    public String toString() {
        StringBuilder y = a.y("sink(");
        y.append(this.f10480h);
        y.append(')');
        return y.toString();
    }
}
