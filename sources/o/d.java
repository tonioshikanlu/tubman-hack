package o;

import b.e.a.a.a;
import e.x.c.i;
import java.io.IOException;

public final class d implements z {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f10450h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ z f10451i;

    public d(b bVar, z zVar) {
        this.f10450h = bVar;
        this.f10451i = zVar;
    }

    public long T(e eVar, long j2) {
        i.e(eVar, "sink");
        b bVar = this.f10450h;
        bVar.h();
        try {
            long T = this.f10451i.T(eVar, j2);
            if (!bVar.i()) {
                return T;
            }
            throw bVar.j((IOException) null);
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

    public void close() {
        b bVar = this.f10450h;
        bVar.h();
        try {
            this.f10451i.close();
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
        return this.f10450h;
    }

    public String toString() {
        StringBuilder y = a.y("AsyncTimeout.source(");
        y.append(this.f10451i);
        y.append(')');
        return y.toString();
    }
}
