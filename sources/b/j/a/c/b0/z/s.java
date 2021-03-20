package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.b0.v;
import b.j.a.c.b0.z.y;
import b.j.a.c.e0.h;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.k;
import b.j.a.c.t;
import java.io.Closeable;

public class s extends u {
    public final u w;

    public static final class a extends y.a {
        public final s c;
        public final Object d;

        public a(s sVar, v vVar, Class<?> cls, Object obj) {
            super(vVar, cls);
            this.c = sVar;
            this.d = obj;
        }

        public void a(Object obj, Object obj2) {
            if (obj.equals(this.a.f1803k.f1855b.f1304j)) {
                s sVar = this.c;
                sVar.w.B(this.d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public s(u uVar, b.j.a.c.e0.y yVar) {
        super(uVar);
        this.w = uVar;
        this.s = yVar;
    }

    public s(s sVar, j<?> jVar, r rVar) {
        super(sVar, jVar, rVar);
        this.w = sVar.w;
        this.s = sVar.s;
    }

    public s(s sVar, t tVar) {
        super(sVar, tVar);
        this.w = sVar.w;
        this.s = sVar.s;
    }

    public void B(Object obj, Object obj2) {
        this.w.B(obj, obj2);
    }

    public Object D(Object obj, Object obj2) {
        return this.w.D(obj, obj2);
    }

    public u G(t tVar) {
        return new s(this, tVar);
    }

    public u H(r rVar) {
        return new s(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new s(this, jVar, this.f1802q);
    }

    public h e() {
        return this.w.e();
    }

    public void f(i iVar, g gVar, Object obj) {
        g(iVar, gVar, obj);
    }

    public Object g(i iVar, g gVar, Object obj) {
        try {
            return this.w.D(obj, c(iVar, gVar));
        } catch (v e2) {
            if ((this.s == null && this.f1800o.k() == null) ? false : true) {
                e2.f1803k.a(new a(this, e2, this.f1797l.f2152h, obj));
                return null;
            }
            throw new k((Closeable) iVar, "Unresolved forward reference but no identity info", (Throwable) e2);
        }
    }

    public void k(f fVar) {
        u uVar = this.w;
        if (uVar != null) {
            uVar.k(fVar);
        }
    }

    public int n() {
        return this.w.n();
    }
}
