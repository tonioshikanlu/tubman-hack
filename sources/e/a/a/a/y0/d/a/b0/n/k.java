package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.d0.q;
import e.a.a.a.y0.d.a.d0.w;
import e.a.a.a.y0.d.a.z.g;
import e.a.a.a.y0.d.a.z.j;
import e.a.a.a.y0.j.y.c;
import e.a.a.a.y0.j.y.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.m.d0;
import e.a.l;
import e.t.o;
import e.t.p;
import e.x.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class k extends e.a.a.a.y0.j.y.j {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ l[] f8424m;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.l.i<Collection<e.a.a.a.y0.b.k>> f8425b;
    public final e.a.a.a.y0.l.i<b> c;
    public final e.a.a.a.y0.l.g<e.a.a.a.y0.f.d, Collection<l0>> d;

    /* renamed from: e  reason: collision with root package name */
    public final e.a.a.a.y0.l.h<e.a.a.a.y0.f.d, f0> f8426e;
    public final e.a.a.a.y0.l.g<e.a.a.a.y0.f.d, Collection<l0>> f;

    /* renamed from: g  reason: collision with root package name */
    public final e.a.a.a.y0.l.i f8427g;

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.l.i f8428h;

    /* renamed from: i  reason: collision with root package name */
    public final e.a.a.a.y0.l.i f8429i;

    /* renamed from: j  reason: collision with root package name */
    public final e.a.a.a.y0.l.g<e.a.a.a.y0.f.d, List<f0>> f8430j;

    /* renamed from: k  reason: collision with root package name */
    public final e.a.a.a.y0.d.a.b0.h f8431k;

    /* renamed from: l  reason: collision with root package name */
    public final k f8432l;

    public static final class a {
        public final d0 a;

        /* renamed from: b  reason: collision with root package name */
        public final d0 f8433b = null;
        public final List<w0> c;
        public final List<r0> d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8434e;
        public final List<String> f;

        public a(d0 d0Var, d0 d0Var2, List<? extends w0> list, List<? extends r0> list2, boolean z, List<String> list3) {
            e.x.c.i.e(d0Var, "returnType");
            e.x.c.i.e(list, "valueParameters");
            e.x.c.i.e(list2, "typeParameters");
            e.x.c.i.e(list3, "errors");
            this.a = d0Var;
            this.c = list;
            this.d = list2;
            this.f8434e = z;
            this.f = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e.x.c.i.a(this.a, aVar.a) && e.x.c.i.a(this.f8433b, aVar.f8433b) && e.x.c.i.a(this.c, aVar.c) && e.x.c.i.a(this.d, aVar.d) && this.f8434e == aVar.f8434e && e.x.c.i.a(this.f, aVar.f);
        }

        public int hashCode() {
            d0 d0Var = this.a;
            int i2 = 0;
            int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
            d0 d0Var2 = this.f8433b;
            int hashCode2 = (hashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31;
            List<w0> list = this.c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<r0> list2 = this.d;
            int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.f8434e;
            if (z) {
                z = true;
            }
            int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
            List<String> list3 = this.f;
            if (list3 != null) {
                i2 = list3.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("MethodSignatureData(returnType=");
            y.append(this.a);
            y.append(", receiverType=");
            y.append(this.f8433b);
            y.append(", valueParameters=");
            y.append(this.c);
            y.append(", typeParameters=");
            y.append(this.d);
            y.append(", hasStableParameterNames=");
            y.append(this.f8434e);
            y.append(", errors=");
            y.append(this.f);
            y.append(")");
            return y.toString();
        }
    }

    public static final class b {
        public final List<w0> a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8435b;

        public b(List<? extends w0> list, boolean z) {
            e.x.c.i.e(list, "descriptors");
            this.a = list;
            this.f8435b = z;
        }
    }

    public static final class c extends e.x.c.k implements e.x.b.a<Collection<? extends e.a.a.a.y0.b.k>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8436h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(0);
            this.f8436h = kVar;
        }

        public Object e() {
            k kVar = this.f8436h;
            e.a.a.a.y0.j.y.d dVar = e.a.a.a.y0.j.y.d.f9446n;
            Objects.requireNonNull(e.a.a.a.y0.j.y.i.a);
            e.x.b.l<e.a.a.a.y0.f.d, Boolean> lVar = i.a.a;
            Objects.requireNonNull(kVar);
            e.x.c.i.e(dVar, "kindFilter");
            e.x.c.i.e(lVar, "nameFilter");
            e.a.a.a.y0.c.a.d dVar2 = e.a.a.a.y0.c.a.d.WHEN_GET_ALL_DESCRIPTORS;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            d.a aVar = e.a.a.a.y0.j.y.d.u;
            if (dVar.a(e.a.a.a.y0.j.y.d.f9443k)) {
                for (e.a.a.a.y0.f.d next : kVar.h(dVar, lVar)) {
                    if (lVar.invoke(next).booleanValue()) {
                        e.a.a.a.y0.m.o1.c.e(linkedHashSet, kVar.b(next, dVar2));
                    }
                }
            }
            d.a aVar2 = e.a.a.a.y0.j.y.d.u;
            if (dVar.a(e.a.a.a.y0.j.y.d.f9440h) && !dVar.f9450b.contains(c.a.f9437b)) {
                for (e.a.a.a.y0.f.d next2 : kVar.i(dVar, lVar)) {
                    if (lVar.invoke(next2).booleanValue()) {
                        linkedHashSet.addAll(kVar.a(next2, dVar2));
                    }
                }
            }
            d.a aVar3 = e.a.a.a.y0.j.y.d.u;
            if (dVar.a(e.a.a.a.y0.j.y.d.f9441i) && !dVar.f9450b.contains(c.a.f9437b)) {
                for (e.a.a.a.y0.f.d next3 : kVar.n(dVar, lVar)) {
                    if (lVar.invoke(next3).booleanValue()) {
                        linkedHashSet.addAll(kVar.d(next3, dVar2));
                    }
                }
            }
            return e.t.g.W(linkedHashSet);
        }
    }

    public static final class d extends e.x.c.k implements e.x.b.a<Set<? extends e.a.a.a.y0.f.d>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8437h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(0);
            this.f8437h = kVar;
        }

        public Object e() {
            return this.f8437h.h(e.a.a.a.y0.j.y.d.f9448p, (e.x.b.l<? super e.a.a.a.y0.f.d, Boolean>) null);
        }
    }

    public static final class e extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.f.d, f0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8438h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(k kVar) {
            super(1);
            this.f8438h = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
            if (e.a.a.a.y0.a.n.a(r4) != false) goto L_0x0113;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                e.a.a.a.y0.f.d r14 = (e.a.a.a.y0.f.d) r14
                java.lang.String r0 = "name"
                e.x.c.i.e(r14, r0)
                e.a.a.a.y0.d.a.b0.n.k r0 = r13.f8438h
                e.a.a.a.y0.d.a.b0.n.k r1 = r0.f8432l
                if (r1 == 0) goto L_0x0017
                e.a.a.a.y0.l.h<e.a.a.a.y0.f.d, e.a.a.a.y0.b.f0> r0 = r1.f8426e
                java.lang.Object r14 = r0.invoke(r14)
                e.a.a.a.y0.b.f0 r14 = (e.a.a.a.y0.b.f0) r14
                goto L_0x013b
            L_0x0017:
                e.a.a.a.y0.l.i<e.a.a.a.y0.d.a.b0.n.b> r0 = r0.c
                java.lang.Object r0 = r0.e()
                e.a.a.a.y0.d.a.b0.n.b r0 = (e.a.a.a.y0.d.a.b0.n.b) r0
                e.a.a.a.y0.d.a.d0.n r14 = r0.b(r14)
                r0 = 0
                if (r14 == 0) goto L_0x013a
                boolean r1 = r14.A()
                if (r1 != 0) goto L_0x013a
                e.a.a.a.y0.d.a.b0.n.k r1 = r13.f8438h
                java.util.Objects.requireNonNull(r1)
                boolean r2 = r14.z()
                r3 = 1
                r8 = r2 ^ 1
                e.a.a.a.y0.d.a.b0.h r2 = r1.f8431k
                e.a.a.a.y0.b.a1.h r5 = b.q.a.a.H2(r2, r14)
                e.a.a.a.y0.b.k r4 = r1.p()
                e.a.a.a.y0.b.v r6 = e.a.a.a.y0.b.v.FINAL
                e.a.a.a.y0.b.z0 r7 = r14.getVisibility()
                e.a.a.a.y0.f.d r9 = r14.getName()
                e.a.a.a.y0.d.a.b0.h r2 = r1.f8431k
                e.a.a.a.y0.d.a.b0.c r2 = r2.c
                e.a.a.a.y0.d.a.c0.b r2 = r2.f8351j
                e.a.a.a.y0.d.a.c0.a r10 = r2.a(r14)
                boolean r2 = r14.z()
                r12 = 0
                if (r2 == 0) goto L_0x0065
                boolean r2 = r14.isStatic()
                if (r2 == 0) goto L_0x0065
                r11 = r3
                goto L_0x0066
            L_0x0065:
                r11 = r12
            L_0x0066:
                e.a.a.a.y0.d.a.a0.g r2 = e.a.a.a.y0.d.a.a0.g.X0(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r4 = "JavaPropertyDescriptor.c…d.isFinalStatic\n        )"
                e.x.c.i.d(r2, r4)
                r2.V0(r0, r0, r0, r0)
                e.a.a.a.y0.d.a.b0.h r4 = r1.f8431k
                e.a.a.a.y0.d.a.b0.o.g r4 = r4.f8366b
                e.a.a.a.y0.d.a.d0.v r5 = r14.d()
                e.a.a.a.y0.d.a.z.k r6 = e.a.a.a.y0.d.a.z.k.COMMON
                r7 = 3
                e.a.a.a.y0.d.a.b0.o.a r6 = e.a.a.a.y0.d.a.b0.o.i.c(r6, r12, r0, r7)
                e.a.a.a.y0.m.d0 r4 = r4.d(r5, r6)
                boolean r5 = e.a.a.a.y0.a.g.J(r4)
                if (r5 != 0) goto L_0x0091
                boolean r5 = e.a.a.a.y0.a.g.L(r4)
                if (r5 == 0) goto L_0x00aa
            L_0x0091:
                boolean r5 = r14.z()
                if (r5 == 0) goto L_0x009f
                boolean r5 = r14.isStatic()
                if (r5 == 0) goto L_0x009f
                r5 = r3
                goto L_0x00a0
            L_0x009f:
                r5 = r12
            L_0x00a0:
                if (r5 == 0) goto L_0x00aa
                boolean r5 = r14.M()
                if (r5 == 0) goto L_0x00aa
                r5 = r3
                goto L_0x00ab
            L_0x00aa:
                r5 = r12
            L_0x00ab:
                if (r5 == 0) goto L_0x00b6
                e.a.a.a.y0.m.d0 r4 = e.a.a.a.y0.m.f1.i(r4)
                java.lang.String r5 = "TypeUtils.makeNotNullable(propertyType)"
                e.x.c.i.d(r4, r5)
            L_0x00b6:
                e.t.o r5 = e.t.o.f7934h
                e.a.a.a.y0.b.i0 r6 = r1.o()
                r2.W0(r4, r5, r6, r0)
                e.a.a.a.y0.m.d0 r4 = r2.d()
                if (r4 == 0) goto L_0x0134
                boolean r0 = r2.Q()
                if (r0 != 0) goto L_0x0112
                boolean r0 = b.q.a.a.I1(r4)
                if (r0 == 0) goto L_0x00d2
                goto L_0x0112
            L_0x00d2:
                boolean r0 = e.a.a.a.y0.m.f1.b(r4)
                if (r0 == 0) goto L_0x00d9
                goto L_0x0113
            L_0x00d9:
                e.a.a.a.y0.a.g r0 = e.a.a.a.y0.j.v.b.f(r2)
                boolean r5 = e.a.a.a.y0.a.g.J(r4)
                if (r5 != 0) goto L_0x0113
                e.a.a.a.y0.m.l1.d r5 = e.a.a.a.y0.m.l1.d.a
                e.a.a.a.y0.m.k0 r6 = r0.w()
                boolean r6 = r5.b(r6, r4)
                if (r6 != 0) goto L_0x0113
                java.lang.String r6 = "Number"
                e.a.a.a.y0.b.e r6 = r0.j(r6)
                e.a.a.a.y0.m.k0 r6 = r6.s()
                boolean r6 = r5.b(r6, r4)
                if (r6 != 0) goto L_0x0113
                e.a.a.a.y0.m.k0 r0 = r0.f()
                boolean r0 = r5.b(r0, r4)
                if (r0 != 0) goto L_0x0113
                e.a.a.a.y0.a.n r0 = e.a.a.a.y0.a.n.f7690e
                boolean r0 = e.a.a.a.y0.a.n.a(r4)
                if (r0 == 0) goto L_0x0112
                goto L_0x0113
            L_0x0112:
                r3 = r12
            L_0x0113:
                if (r3 == 0) goto L_0x0127
                e.a.a.a.y0.d.a.b0.h r0 = r1.f8431k
                e.a.a.a.y0.d.a.b0.c r0 = r0.c
                e.a.a.a.y0.l.m r0 = r0.a
                e.a.a.a.y0.d.a.b0.n.l r3 = new e.a.a.a.y0.d.a.b0.n.l
                r3.<init>(r1, r14, r2)
                e.a.a.a.y0.l.j r14 = r0.d(r3)
                r2.K0(r14)
            L_0x0127:
                e.a.a.a.y0.d.a.b0.h r14 = r1.f8431k
                e.a.a.a.y0.d.a.b0.c r14 = r14.c
                e.a.a.a.y0.d.a.z.g r14 = r14.f8348g
                e.a.a.a.y0.d.a.z.g$a r14 = (e.a.a.a.y0.d.a.z.g.a) r14
                java.util.Objects.requireNonNull(r14)
                r14 = r2
                goto L_0x013b
            L_0x0134:
                r14 = 60
                e.a.a.a.y0.j.g.a(r14)
                throw r0
            L_0x013a:
                r14 = r0
            L_0x013b:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.n.k.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.f.d, Collection<? extends l0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8439h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(1);
            this.f8439h = kVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
            e.x.c.i.e(dVar, "name");
            k kVar = this.f8439h.f8432l;
            if (kVar != null) {
                return (Collection) ((e.m) kVar.d).invoke(dVar);
            }
            ArrayList arrayList = new ArrayList();
            for (q s : ((b) this.f8439h.c.e()).d(dVar)) {
                e.a.a.a.y0.d.a.a0.f s2 = this.f8439h.s(s);
                if (this.f8439h.q(s2)) {
                    Objects.requireNonNull((g.a) this.f8439h.f8431k.c.f8348g);
                    arrayList.add(s2);
                }
            }
            return arrayList;
        }
    }

    public static final class g extends e.x.c.k implements e.x.b.a<b> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8440h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(k kVar) {
            super(0);
            this.f8440h = kVar;
        }

        public Object e() {
            return this.f8440h.j();
        }
    }

    public static final class h extends e.x.c.k implements e.x.b.a<Set<? extends e.a.a.a.y0.f.d>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8441h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(k kVar) {
            super(0);
            this.f8441h = kVar;
        }

        public Object e() {
            return this.f8441h.i(e.a.a.a.y0.j.y.d.f9449q, (e.x.b.l<? super e.a.a.a.y0.f.d, Boolean>) null);
        }
    }

    public static final class i extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.f.d, Collection<? extends l0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8442h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(k kVar) {
            super(1);
            this.f8442h = kVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
            e.x.c.i.e(dVar, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((e.m) this.f8442h.d).invoke(dVar));
            Objects.requireNonNull(this.f8442h);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : linkedHashSet) {
                String H = b.q.a.a.H((l0) next, false, false, 2);
                Object obj2 = linkedHashMap.get(H);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(H, obj2);
                }
                ((List) obj2).add(next);
            }
            for (List list : linkedHashMap.values()) {
                if (list.size() != 1) {
                    Collection Q2 = b.q.a.a.Q2(list, m.f8448h);
                    linkedHashSet.removeAll(list);
                    linkedHashSet.addAll(Q2);
                }
            }
            this.f8442h.l(linkedHashSet, dVar);
            e.a.a.a.y0.d.a.b0.h hVar = this.f8442h.f8431k;
            return e.t.g.W(hVar.c.r.a(hVar, linkedHashSet));
        }
    }

    public static final class j extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.f.d, List<? extends f0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8443h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(k kVar) {
            super(1);
            this.f8443h = kVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
            e.x.c.i.e(dVar, "name");
            ArrayList arrayList = new ArrayList();
            e.a.a.a.y0.m.o1.c.e(arrayList, this.f8443h.f8426e.invoke(dVar));
            this.f8443h.m(dVar, arrayList);
            if (e.a.a.a.y0.j.g.m(this.f8443h.p())) {
                return e.t.g.W(arrayList);
            }
            e.a.a.a.y0.d.a.b0.h hVar = this.f8443h.f8431k;
            return e.t.g.W(hVar.c.r.a(hVar, arrayList));
        }
    }

    /* renamed from: e.a.a.a.y0.d.a.b0.n.k$k  reason: collision with other inner class name */
    public static final class C0175k extends e.x.c.k implements e.x.b.a<Set<? extends e.a.a.a.y0.f.d>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f8444h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0175k(k kVar) {
            super(0);
            this.f8444h = kVar;
        }

        public Object e() {
            return this.f8444h.n(e.a.a.a.y0.j.y.d.r, (e.x.b.l<? super e.a.a.a.y0.f.d, Boolean>) null);
        }
    }

    static {
        Class<k> cls = k.class;
        f8424m = new l[]{v.c(new e.x.c.q(v.a(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), v.c(new e.x.c.q(v.a(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), v.c(new e.x.c.q(v.a(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public k(e.a.a.a.y0.d.a.b0.h hVar, k kVar) {
        e.x.c.i.e(hVar, "c");
        this.f8431k = hVar;
        this.f8432l = kVar;
        this.f8425b = hVar.c.a.g(new c(this), o.f7934h);
        this.c = hVar.c.a.a(new g(this));
        this.d = hVar.c.a.h(new f(this));
        this.f8426e = hVar.c.a.i(new e(this));
        this.f = hVar.c.a.h(new i(this));
        this.f8427g = hVar.c.a.a(new h(this));
        this.f8428h = hVar.c.a.a(new C0175k(this));
        this.f8429i = hVar.c.a.a(new d(this));
        this.f8430j = hVar.c.a.h(new j(this));
    }

    public Collection<l0> a(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        return !e().contains(dVar) ? o.f7934h : (Collection) ((e.m) this.f).invoke(dVar);
    }

    public Collection<e.a.a.a.y0.b.k> c(e.a.a.a.y0.j.y.d dVar, e.x.b.l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        e.x.c.i.e(lVar, "nameFilter");
        return (Collection) this.f8425b.e();
    }

    public Collection<f0> d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        return !f().contains(dVar) ? o.f7934h : (Collection) ((e.m) this.f8430j).invoke(dVar);
    }

    public Set<e.a.a.a.y0.f.d> e() {
        return (Set) b.q.a.a.j1(this.f8427g, f8424m[0]);
    }

    public Set<e.a.a.a.y0.f.d> f() {
        return (Set) b.q.a.a.j1(this.f8428h, f8424m[1]);
    }

    public Set<e.a.a.a.y0.f.d> g() {
        return (Set) b.q.a.a.j1(this.f8429i, f8424m[2]);
    }

    public abstract Set<e.a.a.a.y0.f.d> h(e.a.a.a.y0.j.y.d dVar, e.x.b.l<? super e.a.a.a.y0.f.d, Boolean> lVar);

    public abstract Set<e.a.a.a.y0.f.d> i(e.a.a.a.y0.j.y.d dVar, e.x.b.l<? super e.a.a.a.y0.f.d, Boolean> lVar);

    public abstract b j();

    public final d0 k(q qVar, e.a.a.a.y0.d.a.b0.h hVar) {
        e.x.c.i.e(qVar, "method");
        e.x.c.i.e(hVar, "c");
        return hVar.f8366b.d(qVar.f(), e.a.a.a.y0.d.a.b0.o.i.c(e.a.a.a.y0.d.a.z.k.COMMON, qVar.N().E(), (r0) null, 2));
    }

    public abstract void l(Collection<l0> collection, e.a.a.a.y0.f.d dVar);

    public abstract void m(e.a.a.a.y0.f.d dVar, Collection<f0> collection);

    public abstract Set<e.a.a.a.y0.f.d> n(e.a.a.a.y0.j.y.d dVar, e.x.b.l<? super e.a.a.a.y0.f.d, Boolean> lVar);

    public abstract i0 o();

    public abstract e.a.a.a.y0.b.k p();

    public boolean q(e.a.a.a.y0.d.a.a0.f fVar) {
        e.x.c.i.e(fVar, "$this$isVisibleAsFunction");
        return true;
    }

    public abstract a r(q qVar, List<? extends r0> list, d0 d0Var, List<? extends w0> list2);

    public final e.a.a.a.y0.d.a.a0.f s(q qVar) {
        i0 i0Var;
        q qVar2 = qVar;
        e.x.c.i.e(qVar2, "method");
        e.a.a.a.y0.b.a1.h H2 = b.q.a.a.H2(this.f8431k, qVar2);
        e.a.a.a.y0.b.k p2 = p();
        e.a.a.a.y0.f.d name = qVar.getName();
        e.a.a.a.y0.d.a.c0.a a2 = this.f8431k.c.f8351j.a(qVar2);
        if (p2 == null) {
            e.a.a.a.y0.d.a.a0.f.c0(5);
            throw null;
        } else if (name == null) {
            e.a.a.a.y0.d.a.a0.f.c0(7);
            throw null;
        } else if (a2 != null) {
            e.a.a.a.y0.d.a.a0.f fVar = new e.a.a.a.y0.d.a.a0.f(p2, (l0) null, H2, name, b.a.DECLARATION, a2);
            e.x.c.i.d(fVar, "JavaMethodDescriptor.cre….source(method)\n        )");
            e.a.a.a.y0.d.a.b0.h z = b.q.a.a.z(this.f8431k, fVar, qVar2, 0);
            List<w> B = qVar.B();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(B, 10));
            for (w a3 : B) {
                r0 a4 = z.d.a(a3);
                e.x.c.i.c(a4);
                arrayList.add(a4);
            }
            b t = t(z, fVar, qVar.n());
            a r = r(qVar2, arrayList, k(qVar2, z), t.a);
            d0 d0Var = r.f8433b;
            if (d0Var != null) {
                Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
                i0Var = b.q.a.a.Y(fVar, d0Var, h.a.a);
            } else {
                i0Var = null;
            }
            e.a.a.a.y0.d.a.a0.f fVar2 = fVar;
            fVar.f1(i0Var, o(), r.d, r.c, r.a, qVar.c() ? e.a.a.a.y0.b.v.ABSTRACT : qVar.z() ^ true ? e.a.a.a.y0.b.v.OPEN : e.a.a.a.y0.b.v.FINAL, qVar.getVisibility(), r.f8433b != null ? b.q.a.a.r2(new e.j(e.a.a.a.y0.d.a.a0.f.L, e.t.g.o(t.a))) : p.f7935h);
            fVar2.g1(r.f8434e, t.f8435b);
            if (!(!r.f.isEmpty())) {
                return fVar2;
            }
            e.a.a.a.y0.d.a.z.j jVar = z.c.f8347e;
            List<String> list = r.f;
            Objects.requireNonNull((j.a) jVar);
            if (list == null) {
                j.a.a(6);
                throw null;
            }
            throw new UnsupportedOperationException("Should not be called");
        } else {
            e.a.a.a.y0.d.a.a0.f.c0(8);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.d.a.b0.n.k.b t(e.a.a.a.y0.d.a.b0.h r23, e.a.a.a.y0.b.s r24, java.util.List<? extends e.a.a.a.y0.d.a.d0.y> r25) {
        /*
            r22 = this;
            r0 = r23
            r13 = r24
            java.lang.String r1 = "c"
            e.x.c.i.e(r0, r1)
            java.lang.String r1 = "function"
            e.x.c.i.e(r13, r1)
            java.lang.String r1 = "jValueParameters"
            r14 = r25
            e.x.c.i.e(r14, r1)
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            java.lang.Iterable r1 = e.t.g.e0(r25)
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = b.q.a.a.C(r1, r2)
            r12.<init>(r2)
            e.t.s r1 = (e.t.s) r1
            java.util.Iterator r16 = r1.iterator()
            r11 = 0
            r1 = r11
        L_0x0031:
            r2 = r16
            e.t.t r2 = (e.t.t) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x017b
            java.lang.Object r2 = r2.next()
            e.t.r r2 = (e.t.r) r2
            int r4 = r2.a
            T r2 = r2.f7937b
            e.a.a.a.y0.d.a.d0.y r2 = (e.a.a.a.y0.d.a.d0.y) r2
            e.a.a.a.y0.b.a1.h r5 = b.q.a.a.H2(r0, r2)
            e.a.a.a.y0.d.a.z.k r3 = e.a.a.a.y0.d.a.z.k.COMMON
            r6 = 3
            r7 = 0
            e.a.a.a.y0.d.a.b0.o.a r3 = e.a.a.a.y0.d.a.b0.o.i.c(r3, r11, r7, r6)
            e.a.a.a.y0.f.b r6 = e.a.a.a.y0.d.a.t.f8584l
            java.lang.String r8 = "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME"
            e.x.c.i.d(r6, r8)
            r8 = r5
            e.a.a.a.y0.d.a.b0.f r8 = (e.a.a.a.y0.d.a.b0.f) r8
            e.a.a.a.y0.b.a1.c r6 = r8.i(r6)
            if (r6 == 0) goto L_0x0077
            e.a.a.a.y0.j.t.g r6 = e.a.a.a.y0.j.v.b.b(r6)
            if (r6 == 0) goto L_0x0077
            boolean r8 = r6 instanceof e.a.a.a.y0.j.t.x
            if (r8 != 0) goto L_0x006e
            r6 = r7
        L_0x006e:
            e.a.a.a.y0.j.t.x r6 = (e.a.a.a.y0.j.t.x) r6
            if (r6 == 0) goto L_0x0077
            T r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0078
        L_0x0077:
            r6 = r7
        L_0x0078:
            boolean r8 = r2.l()
            r9 = 1
            if (r8 == 0) goto L_0x00bc
            e.a.a.a.y0.d.a.d0.v r8 = r2.d()
            boolean r10 = r8 instanceof e.a.a.a.y0.d.a.d0.f
            if (r10 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r7 = r8
        L_0x0089:
            e.a.a.a.y0.d.a.d0.f r7 = (e.a.a.a.y0.d.a.d0.f) r7
            if (r7 == 0) goto L_0x00a5
            e.a.a.a.y0.d.a.b0.o.g r8 = r0.f8366b
            e.a.a.a.y0.m.d0 r3 = r8.c(r7, r3, r9)
            e.a.a.a.y0.d.a.b0.c r7 = r0.c
            e.a.a.a.y0.b.w r7 = r7.f8356o
            e.a.a.a.y0.a.g r7 = r7.v()
            e.a.a.a.y0.m.d0 r7 = r7.g(r3)
            e.j r8 = new e.j
            r8.<init>(r3, r7)
            goto L_0x00cb
        L_0x00a5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Vararg parameter should be an array: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            e.a.a.a.y0.d.a.b0.o.g r8 = r0.f8366b
            e.a.a.a.y0.d.a.d0.v r10 = r2.d()
            e.a.a.a.y0.m.d0 r3 = r8.d(r10, r3)
            e.j r8 = new e.j
            r8.<init>(r3, r7)
        L_0x00cb:
            A r3 = r8.f7906h
            r7 = r3
            e.a.a.a.y0.m.d0 r7 = (e.a.a.a.y0.m.d0) r7
            B r3 = r8.f7907i
            r17 = r3
            e.a.a.a.y0.m.d0 r17 = (e.a.a.a.y0.m.d0) r17
            r3 = r13
            e.a.a.a.y0.b.c1.m r3 = (e.a.a.a.y0.b.c1.m) r3
            e.a.a.a.y0.f.d r3 = r3.getName()
            java.lang.String r3 = r3.e()
            java.lang.String r8 = "equals"
            boolean r3 = e.x.c.i.a(r3, r8)
            if (r3 == 0) goto L_0x010b
            int r3 = r25.size()
            if (r3 != r9) goto L_0x010b
            e.a.a.a.y0.d.a.b0.c r3 = r0.c
            e.a.a.a.y0.b.w r3 = r3.f8356o
            e.a.a.a.y0.a.g r3 = r3.v()
            e.a.a.a.y0.m.k0 r3 = r3.p()
            boolean r3 = e.x.c.i.a(r3, r7)
            if (r3 == 0) goto L_0x010b
            java.lang.String r3 = "other"
            e.a.a.a.y0.f.d r3 = e.a.a.a.y0.f.d.l(r3)
        L_0x0107:
            r18 = r1
            r6 = r3
            goto L_0x0148
        L_0x010b:
            if (r6 == 0) goto L_0x0123
            int r3 = r6.length()
            if (r3 <= 0) goto L_0x0115
            r3 = r9
            goto L_0x0116
        L_0x0115:
            r3 = r11
        L_0x0116:
            if (r3 == 0) goto L_0x0123
            boolean r3 = r15.add(r6)
            if (r3 == 0) goto L_0x0123
            e.a.a.a.y0.f.d r3 = e.a.a.a.y0.f.d.l(r6)
            goto L_0x0107
        L_0x0123:
            e.a.a.a.y0.f.d r3 = r2.getName()
            if (r3 != 0) goto L_0x012a
            r1 = r9
        L_0x012a:
            if (r3 == 0) goto L_0x012d
            goto L_0x0107
        L_0x012d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = 112(0x70, float:1.57E-43)
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            e.a.a.a.y0.f.d r3 = e.a.a.a.y0.f.d.l(r3)
            java.lang.String r6 = "Name.identifier(\"p$index\")"
            e.x.c.i.d(r3, r6)
            goto L_0x0107
        L_0x0148:
            java.lang.String r1 = "if (function.name.asStri…(\"p$index\")\n            }"
            e.x.c.i.d(r6, r1)
            e.a.a.a.y0.b.c1.n0 r10 = new e.a.a.a.y0.b.c1.n0
            r3 = 0
            r8 = 0
            r9 = 0
            r19 = 0
            e.a.a.a.y0.d.a.b0.c r1 = r0.c
            e.a.a.a.y0.d.a.c0.b r1 = r1.f8351j
            e.a.a.a.y0.d.a.c0.a r20 = r1.a(r2)
            r1 = r10
            r2 = r24
            r21 = r10
            r10 = r19
            r19 = r11
            r11 = r17
            r0 = r12
            r12 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r21
            r0.add(r1)
            r12 = r0
            r1 = r18
            r11 = r19
            r0 = r23
            goto L_0x0031
        L_0x017b:
            r0 = r12
            java.util.List r0 = e.t.g.W(r0)
            e.a.a.a.y0.d.a.b0.n.k$b r2 = new e.a.a.a.y0.d.a.b0.n.k$b
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.n.k.t(e.a.a.a.y0.d.a.b0.h, e.a.a.a.y0.b.s, java.util.List):e.a.a.a.y0.d.a.b0.n.k$b");
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Lazy scope for ");
        y.append(p());
        return y.toString();
    }
}
