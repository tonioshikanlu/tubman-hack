package b.j.a.c.h0;

import b.j.a.a.r;
import b.j.a.b.s.i;
import b.j.a.c.e0.h;
import b.j.a.c.e0.r;
import b.j.a.c.f0.f;
import b.j.a.c.h0.s.l;
import b.j.a.c.h0.t.d;
import b.j.a.c.j0.b;
import b.j.a.c.j0.g;
import b.j.a.c.n;
import b.j.a.c.s;
import b.j.a.c.t;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@a
public class c extends m implements Serializable {
    public static final /* synthetic */ int B = 0;
    public transient HashMap<Object, Object> A;

    /* renamed from: k  reason: collision with root package name */
    public final i f2037k;

    /* renamed from: l  reason: collision with root package name */
    public final t f2038l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.i f2039m;

    /* renamed from: n  reason: collision with root package name */
    public final b.j.a.c.i f2040n;

    /* renamed from: o  reason: collision with root package name */
    public b.j.a.c.i f2041o;

    /* renamed from: p  reason: collision with root package name */
    public final transient b f2042p;

    /* renamed from: q  reason: collision with root package name */
    public final h f2043q;
    public transient Method r;
    public transient Field s;
    public n<Object> t;
    public n<Object> u;
    public f v;
    public transient l w;
    public final boolean x;
    public final Object y;
    public final Class<?>[] z;

    public c() {
        super(s.f2294q);
        this.f2043q = null;
        this.f2042p = null;
        this.f2037k = null;
        this.f2038l = null;
        this.z = null;
        this.f2039m = null;
        this.t = null;
        this.w = null;
        this.v = null;
        this.f2040n = null;
        this.r = null;
        this.s = null;
        this.x = false;
        this.y = null;
        this.u = null;
    }

    public c(r rVar, h hVar, b bVar, b.j.a.c.i iVar, n<?> nVar, f fVar, b.j.a.c.i iVar2, boolean z2, Object obj, Class<?>[] clsArr) {
        super(rVar);
        this.f2043q = hVar;
        this.f2042p = bVar;
        this.f2037k = new i(rVar.getName());
        this.f2038l = rVar.E();
        this.f2039m = iVar;
        this.t = nVar;
        this.w = nVar == null ? l.b.f2067b : null;
        this.v = fVar;
        this.f2040n = iVar2;
        if (hVar instanceof b.j.a.c.e0.f) {
            this.r = null;
            this.s = (Field) hVar.j();
        } else {
            if (hVar instanceof b.j.a.c.e0.i) {
                this.r = (Method) hVar.j();
            } else {
                this.r = null;
            }
            this.s = null;
        }
        this.x = z2;
        this.y = obj;
        this.u = null;
        this.z = clsArr;
    }

    public c(c cVar, i iVar) {
        super((m) cVar);
        this.f2037k = iVar;
        this.f2038l = cVar.f2038l;
        this.f2043q = cVar.f2043q;
        this.f2042p = cVar.f2042p;
        this.f2039m = cVar.f2039m;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        if (cVar.A != null) {
            this.A = new HashMap<>(cVar.A);
        }
        this.f2040n = cVar.f2040n;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        this.v = cVar.v;
        this.f2041o = cVar.f2041o;
    }

    public c(c cVar, t tVar) {
        super((m) cVar);
        this.f2037k = new i(tVar.f2305h);
        this.f2038l = cVar.f2038l;
        this.f2042p = cVar.f2042p;
        this.f2039m = cVar.f2039m;
        this.f2043q = cVar.f2043q;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        if (cVar.A != null) {
            this.A = new HashMap<>(cVar.A);
        }
        this.f2040n = cVar.f2040n;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        this.v = cVar.v;
        this.f2041o = cVar.f2041o;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.reflect.Type, java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r0 = r7.f2323k.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r0 = r7.f2323k.a(r7.f2320h.f1609i.f1589k.b((b.j.a.c.i0.c) null, r6, b.j.a.c.i0.n.f2185l));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r0 = r7.o(r6);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<java.lang.Object> a(b.j.a.c.h0.s.l r5, java.lang.Class<?> r6, b.j.a.c.y r7) {
        /*
            r4 = this;
            b.j.a.c.i r0 = r4.f2041o
            if (r0 == 0) goto L_0x0018
            b.j.a.c.i r6 = r7.d(r0, r6)
            b.j.a.c.n r7 = r7.w(r6, r4)
            b.j.a.c.h0.s.l$d r0 = new b.j.a.c.h0.s.l$d
            java.lang.Class<?> r6 = r6.f2152h
            b.j.a.c.h0.s.l r6 = r5.b(r6, r7)
            r0.<init>(r7, r6)
            goto L_0x0055
        L_0x0018:
            b.j.a.c.h0.s.m r0 = r7.f2329q
            b.j.a.c.n r0 = r0.b(r6)
            if (r0 != 0) goto L_0x0048
            b.j.a.c.h0.o r0 = r7.f2323k
            b.j.a.c.n r0 = r0.b(r6)
            if (r0 != 0) goto L_0x0048
            b.j.a.c.h0.o r0 = r7.f2323k
            b.j.a.c.w r1 = r7.f2320h
            b.j.a.c.a0.a r1 = r1.f1609i
            b.j.a.c.i0.n r1 = r1.f1589k
            b.j.a.c.i0.m r2 = b.j.a.c.i0.n.f2185l
            r3 = 0
            b.j.a.c.i r1 = r1.b(r3, r6, r2)
            b.j.a.c.n r0 = r0.a(r1)
            if (r0 != 0) goto L_0x0048
            b.j.a.c.n r0 = r7.o(r6)
            if (r0 != 0) goto L_0x0048
            b.j.a.c.n r7 = r7.E(r6)
            goto L_0x004c
        L_0x0048:
            b.j.a.c.n r7 = r7.F(r0, r4)
        L_0x004c:
            b.j.a.c.h0.s.l$d r0 = new b.j.a.c.h0.s.l$d
            b.j.a.c.h0.s.l r6 = r5.b(r6, r7)
            r0.<init>(r7, r6)
        L_0x0055:
            b.j.a.c.h0.s.l r6 = r0.f2069b
            if (r5 == r6) goto L_0x005b
            r4.w = r6
        L_0x005b:
            b.j.a.c.n<java.lang.Object> r5 = r0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.c.a(b.j.a.c.h0.s.l, java.lang.Class, b.j.a.c.y):b.j.a.c.n");
    }

    public boolean b(y yVar, n nVar) {
        if (!yVar.K(x.FAIL_ON_SELF_REFERENCES) || nVar.i() || !(nVar instanceof d)) {
            return false;
        }
        yVar.l(this.f2039m, "Direct self-reference leading to cycle");
        throw null;
    }

    public void c(n<Object> nVar) {
        n<Object> nVar2 = this.u;
        if (nVar2 == null || nVar2 == nVar) {
            this.u = nVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{g.f(this.u), g.f(nVar)}));
        }
    }

    public b.j.a.c.i d() {
        return this.f2039m;
    }

    public h e() {
        return this.f2043q;
    }

    public void f(n<Object> nVar) {
        n<Object> nVar2 = this.t;
        if (nVar2 == null || nVar2 == nVar) {
            this.t = nVar;
        } else {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{g.f(this.t), g.f(nVar)}));
        }
    }

    public c g(b.j.a.c.j0.r rVar) {
        String a = rVar.a(this.f2037k.f1484h);
        if (a.equals(this.f2037k.f1484h)) {
            return this;
        }
        return new c(this, t.a(a));
    }

    public String getName() {
        return this.f2037k.f1484h;
    }

    public t h() {
        return new t(this.f2037k.f1484h);
    }

    public void i(Object obj, b.j.a.b.f fVar, y yVar) {
        Method method = this.r;
        Object invoke = method == null ? this.s.get(obj) : method.invoke(obj, (Object[]) null);
        if (invoke == null) {
            n<Object> nVar = this.u;
            if (nVar != null) {
                nVar.f(null, fVar, yVar);
            } else {
                fVar.u0();
            }
        } else {
            n<Object> nVar2 = this.t;
            if (nVar2 == null) {
                Class<?> cls = invoke.getClass();
                l lVar = this.w;
                n<Object> c = lVar.c(cls);
                nVar2 = c == null ? a(lVar, cls, yVar) : c;
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                if (r.a.NON_EMPTY == obj2) {
                    if (nVar2.d(yVar, invoke)) {
                        n<Object> nVar3 = this.u;
                        if (nVar3 != null) {
                            nVar3.f(null, fVar, yVar);
                            return;
                        } else {
                            fVar.u0();
                            return;
                        }
                    }
                } else if (obj2.equals(invoke)) {
                    n<Object> nVar4 = this.u;
                    if (nVar4 != null) {
                        nVar4.f(null, fVar, yVar);
                        return;
                    } else {
                        fVar.u0();
                        return;
                    }
                }
            }
            if (invoke == obj) {
                b(yVar, nVar2);
            }
            f fVar2 = this.v;
            if (fVar2 == null) {
                nVar2.f(invoke, fVar, yVar);
            } else {
                nVar2.g(invoke, fVar, yVar, fVar2);
            }
        }
    }

    public void k(Object obj, b.j.a.b.f fVar, y yVar) {
        Method method = this.r;
        Object invoke = method == null ? this.s.get(obj) : method.invoke(obj, (Object[]) null);
        if (invoke != null) {
            n<Object> nVar = this.t;
            if (nVar == null) {
                Class<?> cls = invoke.getClass();
                l lVar = this.w;
                n<Object> c = lVar.c(cls);
                nVar = c == null ? a(lVar, cls, yVar) : c;
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                if (r.a.NON_EMPTY == obj2) {
                    if (nVar.d(yVar, invoke)) {
                        return;
                    }
                } else if (obj2.equals(invoke)) {
                    return;
                }
            }
            if (invoke == obj) {
                b(yVar, nVar);
            }
            fVar.s0(this.f2037k);
            f fVar2 = this.v;
            if (fVar2 == null) {
                nVar.f(invoke, fVar, yVar);
            } else {
                nVar.g(invoke, fVar, yVar, fVar2);
            }
        } else if (this.u != null) {
            fVar.s0(this.f2037k);
            this.u.f(null, fVar, yVar);
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder x2 = b.e.a.a.a.x(40, "property '");
        x2.append(this.f2037k.f1484h);
        x2.append("' (");
        if (this.r != null) {
            x2.append("via method ");
            x2.append(this.r.getDeclaringClass().getName());
            x2.append("#");
            str = this.r.getName();
        } else if (this.s != null) {
            x2.append("field \"");
            x2.append(this.s.getDeclaringClass().getName());
            x2.append("#");
            str = this.s.getName();
        } else {
            str = "virtual";
        }
        x2.append(str);
        if (this.t == null) {
            str2 = ", no static serializer";
        } else {
            StringBuilder y2 = b.e.a.a.a.y(", static serializer of type ");
            y2.append(this.t.getClass().getName());
            str2 = y2.toString();
        }
        return b.e.a.a.a.p(x2, str2, ')');
    }
}
