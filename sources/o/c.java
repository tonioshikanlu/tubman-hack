package o;

import b.e.a.a.a;
import e.x.c.i;
import java.io.IOException;

public final class c implements x {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f10448h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x f10449i;

    public c(b bVar, x xVar) {
        this.f10448h = bVar;
        this.f10449i = xVar;
    }

    public void close() {
        b bVar = this.f10448h;
        bVar.h();
        try {
            this.f10449i.close();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e2) {
            e = e2;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i2 = bVar.i();
        }
    }

    public a0 f() {
        return this.f10448h;
    }

    public void flush() {
        b bVar = this.f10448h;
        bVar.h();
        try {
            this.f10449i.flush();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e2) {
            e = e2;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i2 = bVar.i();
        }
    }

    public void j(e eVar, long j2) {
        i.e(eVar, "source");
        e.a.a.a.y0.m.o1.c.p(eVar.f10453i, 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                u uVar = eVar.f10452h;
                while (true) {
                    i.c(uVar);
                    if (j3 >= ((long) 65536)) {
                        break;
                    }
                    j3 += (long) (uVar.c - uVar.f10489b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    }
                    uVar = uVar.f;
                }
                b bVar = this.f10448h;
                bVar.h();
                try {
                    this.f10449i.j(eVar, j3);
                    if (!bVar.i()) {
                        j2 -= j3;
                    } else {
                        throw bVar.j((IOException) null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (bVar.i()) {
                        e = bVar.j(e);
                    }
                    throw e;
                } finally {
                    boolean i2 = bVar.i();
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder y = a.y("AsyncTimeout.sink(");
        y.append(this.f10449i);
        y.append(')');
        return y.toString();
    }
}
