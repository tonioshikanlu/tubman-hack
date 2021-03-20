package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.j.t.q;
import e.a.a.a.y0.m.b0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.l1.l;
import e.a.a.a.y0.m.n0;
import e.a.a.a.y0.m.p;
import e.a.a.a.y0.m.v0;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s {
    public static final s a = new s();

    public enum a {
        ;

        /* renamed from: e.a.a.a.y0.m.l1.s$a$a  reason: collision with other inner class name */
        public static final class C0225a extends a {
            public C0225a(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
            }

            public a d(i1 i1Var) {
                i.e(i1Var, "nextType");
                return e(i1Var);
            }
        }

        public static final class b extends a {
            public b(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
            }

            public a d(i1 i1Var) {
                i.e(i1Var, "nextType");
                return this;
            }
        }

        public static final class c extends a {
            public c(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
            }

            public a d(i1 i1Var) {
                i.e(i1Var, "nextType");
                return e(i1Var);
            }
        }

        public static final class d extends a {
            public d(String str, int i2) {
                super(str, i2, (DefaultConstructorMarker) null);
            }

            public a d(i1 i1Var) {
                i.e(i1Var, "nextType");
                a e2 = e(i1Var);
                return e2 == a.f9724i ? this : e2;
            }
        }

        /* access modifiers changed from: public */
        a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public abstract a d(i1 i1Var);

        public final a e(i1 i1Var) {
            i.e(i1Var, "$this$resultNullability");
            if (i1Var.X0()) {
                return f9724i;
            }
            i.e(i1Var, "type");
            return e.a.a.a.y0.m.c.a(new b(false, true, false, (f) null, 12), b.q.a.a.o2(i1Var), g.a.b.a) ? f9726k : f9725j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[EDGE_INSN: B:24:0x0052->B:16:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<e.a.a.a.y0.m.k0> a(java.util.Collection<? extends e.a.a.a.y0.m.k0> r8, e.x.b.p<? super e.a.a.a.y0.m.k0, ? super e.a.a.a.y0.m.k0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            e.x.c.i.d(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r8.next()
            e.a.a.a.y0.m.k0 r1 = (e.a.a.a.y0.m.k0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r2.next()
            e.a.a.a.y0.m.k0 r5 = (e.a.a.a.y0.m.k0) r5
            if (r5 == r1) goto L_0x004d
            java.lang.String r6 = "lower"
            e.x.c.i.d(r5, r6)
            java.lang.String r6 = "upper"
            e.x.c.i.d(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004d
            r5 = r3
            goto L_0x004e
        L_0x004d:
            r5 = r4
        L_0x004e:
            if (r5 == 0) goto L_0x0027
            goto L_0x0052
        L_0x0051:
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.s.a(java.util.Collection, e.x.b.p):java.util.Collection");
    }

    public final k0 b(List<? extends k0> list) {
        Object obj;
        Object obj2;
        i.e(list, "types");
        list.size();
        ArrayList arrayList = new ArrayList();
        for (k0 k0Var : list) {
            if (k0Var.W0() instanceof b0) {
                Collection<d0> h2 = k0Var.W0().h();
                i.d(h2, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(b.q.a.a.C(h2, 10));
                for (d0 d0Var : h2) {
                    i.d(d0Var, "it");
                    k0 s3 = b.q.a.a.s3(d0Var);
                    if (k0Var.X0()) {
                        s3 = s3.a1(true);
                    }
                    arrayList2.add(s3);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(k0Var);
            }
        }
        a aVar = a.f9723h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar = aVar.d((i1) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k0 k0Var2 = (k0) it2.next();
            if (aVar == a.f9726k) {
                if (k0Var2 instanceof h) {
                    h hVar = (h) k0Var2;
                    i.e(hVar, "$this$withNotNullProjection");
                    k0Var2 = new h(hVar.f9702i, hVar.f9703j, hVar.f9704k, hVar.f9705l, hVar.f9706m, true);
                }
                i.e(k0Var2, "$this$makeSimpleTypeDefinitelyNotNullOrNotNull");
                k0 i1 = p.i1(k0Var2);
                if (i1 == null) {
                    i1 = n0.b(k0Var2);
                }
                k0Var2 = i1 != null ? i1 : k0Var2.a1(false);
            }
            linkedHashSet.add(k0Var2);
        }
        if (linkedHashSet.size() == 1) {
            obj = e.t.g.N(linkedHashSet);
        } else {
            new t(linkedHashSet);
            Collection<k0> a2 = a(linkedHashSet, new u(this));
            ArrayList arrayList3 = (ArrayList) a2;
            arrayList3.isEmpty();
            i.e(a2, "types");
            k0 k0Var3 = null;
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    Object obj3 = it3.next();
                    while (it3.hasNext()) {
                        k0 k0Var4 = (k0) it3.next();
                        k0 k0Var5 = (k0) obj3;
                        if (!(k0Var5 == null || k0Var4 == null)) {
                            v0 W0 = k0Var5.W0();
                            v0 W02 = k0Var4.W0();
                            boolean z = W0 instanceof q;
                            if (z && (W02 instanceof q)) {
                                q qVar = (q) W0;
                                Set<d0> set = qVar.c;
                                Set<d0> set2 = ((q) W02).c;
                                i.e(set, "$this$union");
                                i.e(set2, "other");
                                Set<T> c0 = e.t.g.c0(set);
                                e.t.g.b(c0, set2);
                                q qVar2 = new q(qVar.a, qVar.f9418b, c0, (DefaultConstructorMarker) null);
                                Objects.requireNonNull(h.f7785e);
                                obj2 = e0.d(h.a.a, qVar2, false);
                                obj3 = obj2;
                            } else if (z) {
                                if (((q) W0).c.contains(k0Var4)) {
                                    obj2 = k0Var4;
                                    obj3 = obj2;
                                }
                            } else if ((W02 instanceof q) && ((q) W02).c.contains(k0Var5)) {
                                obj2 = k0Var5;
                                obj3 = obj2;
                            }
                        }
                        obj2 = null;
                        obj3 = obj2;
                    }
                    k0Var3 = (k0) obj3;
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            if (k0Var3 != null) {
                return k0Var3;
            }
            Objects.requireNonNull(l.f9715b);
            Collection<k0> a3 = a(a2, new v(l.a.a));
            ArrayList arrayList4 = (ArrayList) a3;
            arrayList4.isEmpty();
            if (arrayList4.size() >= 2) {
                return new b0(linkedHashSet).e();
            }
            obj = e.t.g.N(a3);
        }
        return (k0) obj;
    }
}
