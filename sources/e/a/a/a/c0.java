package e.a.a.a;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.z0;
import e.a.h;
import e.a.i;
import e.a.l;
import e.r;
import e.t.g;
import e.x.c.b;
import e.x.c.i;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Matcher;

public abstract class c0<V> extends g<V> implements l<V> {

    /* renamed from: q  reason: collision with root package name */
    public static final Object f7496q = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final o0<Field> f7497k;

    /* renamed from: l  reason: collision with root package name */
    public final n0<f0> f7498l;

    /* renamed from: m  reason: collision with root package name */
    public final n f7499m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7500n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7501o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f7502p;

    public static abstract class a<PropertyType, ReturnType> extends g<ReturnType> implements h<ReturnType>, l.a<PropertyType> {
        public n B() {
            return H().f7499m;
        }

        public e.a.a.a.x0.h<?> C() {
            return null;
        }

        public boolean F() {
            Object obj = H().f7502p;
            int i2 = e.x.c.b.f7970n;
            return !i.a(obj, b.a.f7977h);
        }

        public abstract e0 G();

        public abstract c0<PropertyType> H();
    }

    public static abstract class b<V> extends a<V, V> implements l.b<V> {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ l[] f7503m;

        /* renamed from: k  reason: collision with root package name */
        public final n0 f7504k = b.q.a.a.k2(new C0128b(this));

        /* renamed from: l  reason: collision with root package name */
        public final o0 f7505l = b.q.a.a.i2(new a(this));

        public static final class a extends k implements e.x.b.a<e.a.a.a.x0.h<?>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ b f7506h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.f7506h = bVar;
            }

            public Object e() {
                return b.q.a.a.g(this.f7506h, true);
            }
        }

        /* renamed from: e.a.a.a.c0$b$b  reason: collision with other inner class name */
        public static final class C0128b extends k implements e.x.b.a<g0> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ b f7507h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0128b(b bVar) {
                super(0);
                this.f7507h = bVar;
            }

            public Object e() {
                g0 j2 = this.f7507h.H().D().j();
                if (j2 != null) {
                    return j2;
                }
                f0 H = this.f7507h.H().D();
                Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
                return b.q.a.a.U(H, h.a.a);
            }
        }

        static {
            Class<b> cls = b.class;
            f7503m = new l[]{v.c(new q(v.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), v.c(new q(v.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public e.a.a.a.y0.b.b D() {
            n0 n0Var = this.f7504k;
            l lVar = f7503m[0];
            return (g0) n0Var.e();
        }

        public e0 G() {
            n0 n0Var = this.f7504k;
            l lVar = f7503m[0];
            return (g0) n0Var.e();
        }

        public String getName() {
            return b.e.a.a.a.p(b.e.a.a.a.y("<get-"), H().f7500n, '>');
        }

        public e.a.a.a.x0.h<?> u() {
            o0 o0Var = this.f7505l;
            l lVar = f7503m[1];
            return (e.a.a.a.x0.h) o0Var.e();
        }
    }

    public static abstract class c<V> extends a<V, r> implements i.a<V> {

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ l[] f7508m;

        /* renamed from: k  reason: collision with root package name */
        public final n0 f7509k = b.q.a.a.k2(new b(this));

        /* renamed from: l  reason: collision with root package name */
        public final o0 f7510l = b.q.a.a.i2(new a(this));

        public static final class a extends k implements e.x.b.a<e.a.a.a.x0.h<?>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ c f7511h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.f7511h = cVar;
            }

            public Object e() {
                return b.q.a.a.g(this.f7511h, false);
            }
        }

        public static final class b extends k implements e.x.b.a<h0> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ c f7512h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(0);
                this.f7512h = cVar;
            }

            public Object e() {
                h0 m2 = this.f7512h.H().D().m();
                if (m2 != null) {
                    return m2;
                }
                f0 H = this.f7512h.H().D();
                Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
                e.a.a.a.y0.b.a1.h hVar = h.a.a;
                return b.q.a.a.V(H, hVar, hVar);
            }
        }

        static {
            Class<c> cls = c.class;
            f7508m = new l[]{v.c(new q(v.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), v.c(new q(v.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        public e.a.a.a.y0.b.b D() {
            n0 n0Var = this.f7509k;
            l lVar = f7508m[0];
            return (h0) n0Var.e();
        }

        public e0 G() {
            n0 n0Var = this.f7509k;
            l lVar = f7508m[0];
            return (h0) n0Var.e();
        }

        public String getName() {
            return b.e.a.a.a.p(b.e.a.a.a.y("<set-"), H().f7500n, '>');
        }

        public e.a.a.a.x0.h<?> u() {
            o0 o0Var = this.f7510l;
            l lVar = f7508m[1];
            return (e.a.a.a.x0.h) o0Var.e();
        }
    }

    public static final class d extends k implements e.x.b.a<f0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c0 f7513h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c0 c0Var) {
            super(0);
            this.f7513h = c0Var;
        }

        public Object e() {
            Object obj;
            String str;
            c0 c0Var = this.f7513h;
            n nVar = c0Var.f7499m;
            String str2 = c0Var.f7500n;
            String str3 = c0Var.f7501o;
            Objects.requireNonNull(nVar);
            e.x.c.i.e(str2, "name");
            e.x.c.i.e(str3, "signature");
            e.c0.d dVar = n.f7562i;
            Objects.requireNonNull(dVar);
            e.x.c.i.e(str3, "input");
            Matcher matcher = dVar.f9887h.matcher(str3);
            e.x.c.i.d(matcher, "nativePattern.matcher(input)");
            e.c0.c cVar = !matcher.matches() ? null : new e.c0.c(matcher, str3);
            boolean z = true;
            if (cVar != null) {
                e.x.c.i.e(cVar, "match");
                String str4 = cVar.a().get(1);
                f0 C = nVar.C(Integer.parseInt(str4));
                if (C != null) {
                    return C;
                }
                StringBuilder C2 = b.e.a.a.a.C("Local property #", str4, " not found in ");
                C2.append(nVar.e());
                throw new l0(C2.toString());
            }
            e.a.a.a.y0.f.d l2 = e.a.a.a.y0.f.d.l(str2);
            e.x.c.i.d(l2, "Name.identifier(name)");
            Collection<f0> F = nVar.F(l2);
            ArrayList arrayList = new ArrayList();
            for (T next : F) {
                t0 t0Var = t0.f7583b;
                if (e.x.c.i.a(t0.c((f0) next).a(), str3)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        z0 visibility = ((f0) next2).getVisibility();
                        Object obj2 = linkedHashMap.get(visibility);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(visibility, obj2);
                        }
                        ((List) obj2).add(next2);
                    }
                    q qVar = q.f7575h;
                    e.x.c.i.e(linkedHashMap, "$this$toSortedMap");
                    e.x.c.i.e(qVar, "comparator");
                    TreeMap treeMap = new TreeMap(qVar);
                    treeMap.putAll(linkedHashMap);
                    Collection values = treeMap.values();
                    e.x.c.i.d(values, "properties\n             …                }).values");
                    List list = (List) g.y(values);
                    if (list.size() == 1) {
                        e.x.c.i.d(list, "mostVisibleProperties");
                        obj = g.o(list);
                    } else {
                        e.a.a.a.y0.f.d l3 = e.a.a.a.y0.f.d.l(str2);
                        e.x.c.i.d(l3, "Name.identifier(name)");
                        String x = g.x(nVar.F(l3), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, p.f7573h, 30);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Property '");
                        sb.append(str2);
                        sb.append("' (JVM signature: ");
                        sb.append(str3);
                        sb.append(") not resolved in ");
                        sb.append(nVar);
                        sb.append(':');
                        if (x.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            str = " no members found";
                        } else {
                            str = 10 + x;
                        }
                        sb.append(str);
                        throw new l0(sb.toString());
                    }
                } else {
                    obj = g.O(arrayList);
                }
                return (f0) obj;
            }
            throw new l0("Property '" + str2 + "' (JVM signature: " + str3 + ") not resolved in " + nVar);
        }
    }

    public static final class e extends k implements e.x.b.a<Field> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c0 f7514h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c0 c0Var) {
            super(0);
            this.f7514h = c0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
            if (((r4 == null || !r4.k().x(e.a.a.a.y0.d.a.s.a)) ? r1.k().x(e.a.a.a.y0.d.a.s.a) : true) != false) goto L_0x0084;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5 A[SYNTHETIC, Splitter:B:38:0x00b5] */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e() {
            /*
                r8 = this;
                e.a.a.a.t0 r0 = e.a.a.a.t0.f7583b
                e.a.a.a.c0 r0 = r8.f7514h
                e.a.a.a.y0.b.f0 r0 = r0.D()
                e.a.a.a.f r0 = e.a.a.a.t0.c(r0)
                boolean r1 = r0 instanceof e.a.a.a.f.c
                r2 = 0
                if (r1 == 0) goto L_0x00c8
                e.a.a.a.f$c r0 = (e.a.a.a.f.c) r0
                e.a.a.a.y0.b.f0 r1 = r0.f7524b
                e.a.a.a.y0.e.a0.b.h r3 = e.a.a.a.y0.e.a0.b.h.f8770b
                e.a.a.a.y0.e.n r4 = r0.c
                e.a.a.a.y0.e.z.c r5 = r0.f7525e
                e.a.a.a.y0.e.z.e r6 = r0.f
                r7 = 1
                e.a.a.a.y0.e.a0.b.e$a r3 = r3.b(r4, r5, r6, r7)
                if (r3 == 0) goto L_0x00da
                e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.s.a
                if (r1 == 0) goto L_0x00c2
                e.a.a.a.y0.b.b$a r4 = r1.i()
                e.a.a.a.y0.b.b$a r5 = e.a.a.a.y0.b.b.a.FAKE_OVERRIDE
                r6 = 0
                if (r4 != r5) goto L_0x0032
                goto L_0x0083
            L_0x0032:
                e.a.a.a.y0.b.k r4 = r1.b()
                if (r4 == 0) goto L_0x00bc
                boolean r5 = e.a.a.a.y0.j.g.p(r4)
                if (r5 == 0) goto L_0x0054
                e.a.a.a.y0.b.k r5 = r4.b()
                boolean r5 = e.a.a.a.y0.j.g.o(r5)
                if (r5 == 0) goto L_0x0054
                e.a.a.a.y0.b.e r4 = (e.a.a.a.y0.b.e) r4
                e.a.a.a.y0.a.c r5 = e.a.a.a.y0.a.c.f7640b
                boolean r4 = e.a.a.a.y0.a.c.a(r4)
                if (r4 != 0) goto L_0x0054
                r4 = r7
                goto L_0x0055
            L_0x0054:
                r4 = r6
            L_0x0055:
                if (r4 == 0) goto L_0x0058
                goto L_0x0084
            L_0x0058:
                e.a.a.a.y0.b.k r4 = r1.b()
                boolean r4 = e.a.a.a.y0.j.g.p(r4)
                if (r4 == 0) goto L_0x0083
                e.a.a.a.y0.b.p r4 = r1.d0()
                if (r4 == 0) goto L_0x0076
                e.a.a.a.y0.b.a1.h r4 = r4.k()
                e.a.a.a.y0.f.b r5 = e.a.a.a.y0.d.a.s.a
                boolean r4 = r4.x(r5)
                if (r4 == 0) goto L_0x0076
                r4 = r7
                goto L_0x0080
            L_0x0076:
                e.a.a.a.y0.b.a1.h r4 = r1.k()
                e.a.a.a.y0.f.b r5 = e.a.a.a.y0.d.a.s.a
                boolean r4 = r4.x(r5)
            L_0x0080:
                if (r4 == 0) goto L_0x0083
                goto L_0x0084
            L_0x0083:
                r7 = r6
            L_0x0084:
                if (r7 != 0) goto L_0x00a7
                e.a.a.a.y0.e.n r0 = r0.c
                boolean r0 = e.a.a.a.y0.e.a0.b.h.d(r0)
                if (r0 == 0) goto L_0x008f
                goto L_0x00a7
            L_0x008f:
                e.a.a.a.y0.b.k r0 = r1.b()
                boolean r1 = r0 instanceof e.a.a.a.y0.b.e
                if (r1 == 0) goto L_0x009e
                e.a.a.a.y0.b.e r0 = (e.a.a.a.y0.b.e) r0
                java.lang.Class r0 = e.a.a.a.v0.j(r0)
                goto L_0x00b3
            L_0x009e:
                e.a.a.a.c0 r0 = r8.f7514h
                e.a.a.a.n r0 = r0.f7499m
                java.lang.Class r0 = r0.e()
                goto L_0x00b3
            L_0x00a7:
                e.a.a.a.c0 r0 = r8.f7514h
                e.a.a.a.n r0 = r0.f7499m
                java.lang.Class r0 = r0.e()
                java.lang.Class r0 = r0.getEnclosingClass()
            L_0x00b3:
                if (r0 == 0) goto L_0x00da
                java.lang.String r1 = r3.a     // Catch:{ NoSuchFieldException -> 0x00da }
                java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00da }
                goto L_0x00da
            L_0x00bc:
                r0 = 11
                e.a.a.a.y0.d.a.s.a(r0)
                throw r2
            L_0x00c2:
                r0 = 10
                e.a.a.a.y0.d.a.s.a(r0)
                throw r2
            L_0x00c8:
                boolean r1 = r0 instanceof e.a.a.a.f.a
                if (r1 == 0) goto L_0x00d1
                e.a.a.a.f$a r0 = (e.a.a.a.f.a) r0
                java.lang.reflect.Field r2 = r0.a
                goto L_0x00da
            L_0x00d1:
                boolean r1 = r0 instanceof e.a.a.a.f.b
                if (r1 == 0) goto L_0x00d6
                goto L_0x00da
            L_0x00d6:
                boolean r0 = r0 instanceof e.a.a.a.f.d
                if (r0 == 0) goto L_0x00db
            L_0x00da:
                return r2
            L_0x00db:
                e.h r0 = new e.h
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.c0.e.e():java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(e.a.a.a.n r8, e.a.a.a.y0.b.f0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            e.x.c.i.e(r8, r0)
            java.lang.String r0 = "descriptor"
            e.x.c.i.e(r9, r0)
            e.a.a.a.y0.f.d r0 = r9.getName()
            java.lang.String r3 = r0.e()
            java.lang.String r0 = "descriptor.name.asString()"
            e.x.c.i.d(r3, r0)
            e.a.a.a.t0 r0 = e.a.a.a.t0.f7583b
            e.a.a.a.f r0 = e.a.a.a.t0.c(r9)
            java.lang.String r4 = r0.a()
            e.x.c.b$a r6 = e.x.c.b.a.f7977h
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.c0.<init>(e.a.a.a.n, e.a.a.a.y0.b.f0):void");
    }

    public c0(n nVar, String str, String str2, f0 f0Var, Object obj) {
        this.f7499m = nVar;
        this.f7500n = str;
        this.f7501o = str2;
        this.f7502p = obj;
        o0<Field> i2 = b.q.a.a.i2(new e(this));
        e.x.c.i.d(i2, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.f7497k = i2;
        n0<f0> j2 = b.q.a.a.j2(f0Var, new d(this));
        e.x.c.i.d(j2, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.f7498l = j2;
    }

    public n B() {
        return this.f7499m;
    }

    public e.a.a.a.x0.h<?> C() {
        Objects.requireNonNull(I());
        return null;
    }

    public boolean F() {
        Object obj = this.f7502p;
        int i2 = e.x.c.b.f7970n;
        return !e.x.c.i.a(obj, b.a.f7977h);
    }

    public final Field G() {
        if (D().p0()) {
            return J();
        }
        return null;
    }

    /* renamed from: H */
    public f0 D() {
        f0 e2 = this.f7498l.e();
        e.x.c.i.d(e2, "_descriptor()");
        return e2;
    }

    public abstract b<V> I();

    public final Field J() {
        return this.f7497k.e();
    }

    public boolean equals(Object obj) {
        c0<?> c2 = v0.c(obj);
        if (c2 == null || !e.x.c.i.a(this.f7499m, c2.f7499m) || !e.x.c.i.a(this.f7500n, c2.f7500n) || !e.x.c.i.a(this.f7501o, c2.f7501o) || !e.x.c.i.a(this.f7502p, c2.f7502p)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f7500n;
    }

    public int hashCode() {
        int hashCode = this.f7500n.hashCode();
        return this.f7501o.hashCode() + ((hashCode + (this.f7499m.hashCode() * 31)) * 31);
    }

    public String toString() {
        r0 r0Var = r0.f7577b;
        return r0.d(D());
    }

    public e.a.a.a.x0.h<?> u() {
        return I().u();
    }
}
