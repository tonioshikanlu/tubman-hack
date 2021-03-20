package b.j.a.c.h0.s;

import b.e.a.a.a;
import b.j.a.a.i0;
import b.j.a.a.k0;
import b.j.a.c.e0.y;
import b.j.a.c.h0.c;
import java.lang.reflect.Method;

public class k extends k0 {

    /* renamed from: i  reason: collision with root package name */
    public final c f2064i;

    public k(y yVar, c cVar) {
        super(yVar.d);
        this.f2064i = cVar;
    }

    public k(Class<?> cls, c cVar) {
        super(cls);
        this.f2064i = cVar;
    }

    public boolean a(i0<?> i0Var) {
        if (i0Var.getClass() != k.class) {
            return false;
        }
        k kVar = (k) i0Var;
        if (kVar.f1333h == this.f1333h && kVar.f2064i == this.f2064i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b.j.a.a.i0<java.lang.Object>, b.j.a.c.h0.s.k] */
    /* JADX WARNING: type inference failed for: r0v2, types: [b.j.a.a.i0<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.a.i0<java.lang.Object> b(java.lang.Class<?> r3) {
        /*
            r2 = this;
            java.lang.Class<?> r0 = r2.f1333h
            if (r3 != r0) goto L_0x0006
            r0 = r2
            goto L_0x000d
        L_0x0006:
            b.j.a.c.h0.s.k r0 = new b.j.a.c.h0.s.k
            b.j.a.c.h0.c r1 = r2.f2064i
            r0.<init>((java.lang.Class<?>) r3, (b.j.a.c.h0.c) r1)
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.s.k.b(java.lang.Class):b.j.a.a.i0");
    }

    public Object c(Object obj) {
        try {
            c cVar = this.f2064i;
            Method method = cVar.r;
            return method == null ? cVar.s.get(obj) : method.invoke(obj, (Object[]) null);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            StringBuilder y = a.y("Problem accessing property '");
            y.append(this.f2064i.f2037k.f1484h);
            y.append("': ");
            y.append(e3.getMessage());
            throw new IllegalStateException(y.toString(), e3);
        }
    }

    public i0.a e(Object obj) {
        return new i0.a(k.class, this.f1333h, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b.j.a.a.i0<java.lang.Object>, b.j.a.c.h0.s.k] */
    public i0<Object> f(Object obj) {
        return this;
    }
}
