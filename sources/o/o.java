package o;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.io.IOException;
import java.io.InputStream;

public final class o implements z {

    /* renamed from: h  reason: collision with root package name */
    public final InputStream f10475h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f10476i;

    public o(InputStream inputStream, a0 a0Var) {
        i.e(inputStream, "input");
        i.e(a0Var, "timeout");
        this.f10475h = inputStream;
        this.f10476i = a0Var;
    }

    public long T(e eVar, long j2) {
        i.e(eVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 >= 0) {
            try {
                this.f10476i.f();
                u q0 = eVar.q0(1);
                int read = this.f10475h.read(q0.a, q0.c, (int) Math.min(j2, (long) (8192 - q0.c)));
                if (read != -1) {
                    q0.c += read;
                    long j3 = (long) read;
                    eVar.f10453i += j3;
                    return j3;
                } else if (q0.f10489b != q0.c) {
                    return -1;
                } else {
                    eVar.f10452h = q0.a();
                    v.a(q0);
                    return -1;
                }
            } catch (AssertionError e2) {
                if (c.L(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException(a.j("byteCount < 0: ", j2).toString());
        }
    }

    public void close() {
        this.f10475h.close();
    }

    public a0 f() {
        return this.f10476i;
    }

    public String toString() {
        StringBuilder y = a.y("source(");
        y.append(this.f10475h);
        y.append(')');
        return y.toString();
    }
}
