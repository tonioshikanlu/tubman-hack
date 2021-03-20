package e.a.a.a.y0.j.t;

import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.r;
import e.x.c.i;

public abstract class l extends g<r> {

    public static final class a extends l {

        /* renamed from: b  reason: collision with root package name */
        public final String f9415b;

        public a(String str) {
            i.e(str, "message");
            this.f9415b = str;
        }

        public d0 a(w wVar) {
            i.e(wVar, "module");
            k0 d = e.a.a.a.y0.m.w.d(this.f9415b);
            i.d(d, "ErrorUtils.createErrorType(message)");
            return d;
        }

        public String toString() {
            return this.f9415b;
        }
    }

    public l() {
        super(r.a);
    }

    public Object b() {
        throw new UnsupportedOperationException();
    }
}
