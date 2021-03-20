package b.j.a.c.h0;

import b.j.a.a.i0;
import b.j.a.b.f;
import b.j.a.b.o;
import b.j.a.b.s.i;
import b.j.a.c.c0.b;
import b.j.a.c.d;
import b.j.a.c.e0.r;
import b.j.a.c.h0.s.t;
import b.j.a.c.j0.g;
import b.j.a.c.k;
import b.j.a.c.n;
import b.j.a.c.w;
import b.j.a.c.x;
import b.j.a.c.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class j extends y implements Serializable {
    public transient Map<Object, t> v;
    public transient ArrayList<i0<?>> w;
    public transient f x;

    public static final class a extends j {
        public a() {
        }

        public a(y yVar, w wVar, p pVar) {
            super(yVar, wVar, pVar);
        }
    }

    public j() {
    }

    public j(y yVar, w wVar, p pVar) {
        super(yVar, wVar, pVar);
    }

    public Object H(r rVar, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Objects.requireNonNull(this.f2320h.f1609i);
        return g.h(cls, this.f2320h.b());
    }

    public boolean I(Object obj) {
        try {
            return obj.equals((Object) null);
        } catch (Throwable th) {
            b bVar = new b(this.x, String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{obj.getClass().getName(), th.getClass().getName(), g.i(th)}), e(obj.getClass()));
            bVar.initCause(th);
            throw bVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<b.j.a.c.n$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: b.j.a.c.n<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> N(b.j.a.c.e0.a r3, java.lang.Object r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof b.j.a.c.n
            if (r0 == 0) goto L_0x0007
            b.j.a.c.n r4 = (b.j.a.c.n) r4
            goto L_0x0035
        L_0x0007:
            boolean r0 = r4 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L_0x005f
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<b.j.a.c.n$a> r0 = b.j.a.c.n.a.class
            if (r4 == r0) goto L_0x005e
            boolean r0 = b.j.a.c.j0.g.t(r4)
            if (r0 == 0) goto L_0x0019
            goto L_0x005e
        L_0x0019:
            java.lang.Class<b.j.a.c.n> r0 = b.j.a.c.n.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x0040
            b.j.a.c.w r3 = r2.f2320h
            b.j.a.c.a0.a r3 = r3.f1609i
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.w r3 = r2.f2320h
            boolean r3 = r3.b()
            java.lang.Object r3 = b.j.a.c.j0.g.h(r4, r3)
            r4 = r3
            b.j.a.c.n r4 = (b.j.a.c.n) r4
        L_0x0035:
            boolean r3 = r4 instanceof b.j.a.c.h0.n
            if (r3 == 0) goto L_0x003f
            r3 = r4
            b.j.a.c.h0.n r3 = (b.j.a.c.h0.n) r3
            r3.b(r2)
        L_0x003f:
            return r4
        L_0x0040:
            b.j.a.c.i r3 = r3.f()
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<JsonSerializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.l(r3, r4)
            throw r1
        L_0x005e:
            return r1
        L_0x005f:
            b.j.a.c.i r3 = r3.f()
            java.lang.String r0 = "AnnotationIntrospector returned serializer definition of type "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.l(r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.j.N(b.j.a.c.e0.a, java.lang.Object):b.j.a.c.n");
    }

    public final void O(f fVar, Object obj, n<Object> nVar, b.j.a.c.t tVar) {
        try {
            fVar.N0();
            w wVar = this.f2320h;
            o oVar = tVar.f2307j;
            if (oVar == null) {
                if (wVar == null) {
                    oVar = new i(tVar.f2305h);
                } else {
                    oVar = new i(tVar.f2305h);
                }
                tVar.f2307j = oVar;
            }
            fVar.s0(oVar);
            nVar.f(obj, fVar, this);
            fVar.r0();
        } catch (Exception e2) {
            throw P(fVar, e2);
        }
    }

    public final IOException P(f fVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String i2 = g.i(exc);
        if (i2 == null) {
            StringBuilder y = b.e.a.a.a.y("[no message for ");
            y.append(exc.getClass().getName());
            y.append("]");
            i2 = y.toString();
        }
        return new k((Closeable) fVar, i2, (Throwable) exc);
    }

    public void Q(f fVar, Object obj) {
        this.x = fVar;
        if (obj == null) {
            try {
                this.f2327o.f(null, fVar, this);
            } catch (Exception e2) {
                throw P(fVar, e2);
            }
        } else {
            Class<?> cls = obj.getClass();
            n<Object> x2 = x(cls, true, (d) null);
            w wVar = this.f2320h;
            b.j.a.c.t tVar = wVar.f1612m;
            if (tVar == null) {
                if (wVar.w(x.WRAP_ROOT_VALUE)) {
                    w wVar2 = this.f2320h;
                    b.j.a.c.t tVar2 = wVar2.f1612m;
                    if (tVar2 == null) {
                        tVar2 = wVar2.f1615p.a(cls, wVar2);
                    }
                    O(fVar, obj, x2, tVar2);
                    return;
                }
            } else if (!tVar.e()) {
                O(fVar, obj, x2, tVar);
                return;
            }
            try {
                x2.f(obj, fVar, this);
            } catch (Exception e3) {
                throw P(fVar, e3);
            }
        }
    }

    public t v(Object obj, i0<?> i0Var) {
        Map<Object, t> map = this.v;
        if (map == null) {
            this.v = K(x.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap<>() : new IdentityHashMap<>();
        } else {
            t tVar = map.get(obj);
            if (tVar != null) {
                return tVar;
            }
        }
        i0<?> i0Var2 = null;
        ArrayList<i0<?>> arrayList = this.w;
        if (arrayList != null) {
            int i2 = 0;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                i0<?> i0Var3 = this.w.get(i2);
                if (i0Var3.a(i0Var)) {
                    i0Var2 = i0Var3;
                    break;
                }
                i2++;
            }
        } else {
            this.w = new ArrayList<>(8);
        }
        if (i0Var2 == null) {
            i0Var2 = i0Var.f(this);
            this.w.add(i0Var2);
        }
        t tVar2 = new t(i0Var2);
        this.v.put(obj, tVar2);
        return tVar2;
    }
}
