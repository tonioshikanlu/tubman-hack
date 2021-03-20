package e.a.a.a.y0.d.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.d.a.t;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.e.a0.b.e;
import e.a.a.a.y0.e.a0.b.h;
import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.k.b.y;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.g;
import e.a.a.a.y0.l.m;
import e.t.o;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class a<A, C> implements e.a.a.a.y0.k.b.c<A, C> {
    public static final Set<e.a.a.a.y0.f.a> c;
    public final g<l, b<A, C>> a;

    /* renamed from: b  reason: collision with root package name */
    public final k f8624b;

    /* renamed from: e.a.a.a.y0.d.b.a$a  reason: collision with other inner class name */
    public enum C0180a {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    public static final class b<A, C> {
        public final Map<o, List<A>> a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<o, C> f8629b;

        public b(Map<o, ? extends List<? extends A>> map, Map<o, ? extends C> map2) {
            i.e(map, "memberAnnotations");
            i.e(map2, "propertyConstants");
            this.a = map;
            this.f8629b = map2;
        }
    }

    public static final class c implements l.c {
        public final /* synthetic */ a a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f8630b;

        public c(a aVar, ArrayList arrayList) {
            this.a = aVar;
            this.f8630b = arrayList;
        }

        public l.a a(e.a.a.a.y0.f.a aVar, m0 m0Var) {
            i.e(aVar, "classId");
            i.e(m0Var, "source");
            return a.k(this.a, aVar, m0Var, this.f8630b);
        }
    }

    public static final class d extends k implements e.x.b.l<l, b<? extends A, ? extends C>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f8631h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(1);
            this.f8631h = aVar;
        }

        public Object invoke(Object obj) {
            l lVar = (l) obj;
            i.e(lVar, "kotlinClass");
            a aVar = this.f8631h;
            Objects.requireNonNull(aVar);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            b bVar = new b(aVar, hashMap, hashMap2);
            i.e(lVar, "kotlinClass");
            lVar.c(bVar, (byte[]) null);
            return new b(hashMap, hashMap2);
        }
    }

    static {
        List<e.a.a.a.y0.f.b> B = e.t.g.B(t.a, t.c, t.d, new e.a.a.a.y0.f.b("java.lang.annotation.Target"), new e.a.a.a.y0.f.b("java.lang.annotation.Retention"), new e.a.a.a.y0.f.b("java.lang.annotation.Documented"));
        ArrayList arrayList = new ArrayList(b.q.a.a.C(B, 10));
        for (e.a.a.a.y0.f.b l2 : B) {
            arrayList.add(e.a.a.a.y0.f.a.l(l2));
        }
        c = e.t.g.d0(arrayList);
    }

    public a(m mVar, k kVar) {
        i.e(mVar, "storageManager");
        i.e(kVar, "kotlinClassFinder");
        this.f8624b = kVar;
        this.a = mVar.h(new d(this));
    }

    public static final l.a k(a aVar, e.a.a.a.y0.f.a aVar2, m0 m0Var, List list) {
        Objects.requireNonNull(aVar);
        if (c.contains(aVar2)) {
            return null;
        }
        return aVar.s(aVar2, m0Var, list);
    }

    public static /* synthetic */ List m(a aVar, y yVar, o oVar, boolean z, boolean z2, Boolean bool, boolean z3, int i2, Object obj) {
        return aVar.l(yVar, oVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z3);
    }

    public static /* synthetic */ o o(a aVar, p pVar, e.a.a.a.y0.e.z.c cVar, e eVar, e.a.a.a.y0.k.b.b bVar, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        return aVar.n(pVar, cVar, eVar, bVar, z);
    }

    public static /* synthetic */ o q(a aVar, n nVar, e.a.a.a.y0.e.z.c cVar, e eVar, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        return aVar.p(nVar, cVar, eVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3);
    }

    public List<A> a(s sVar, e.a.a.a.y0.e.z.c cVar) {
        i.e(sVar, "proto");
        i.e(cVar, "nameResolver");
        Object l2 = sVar.l(e.a.a.a.y0.e.a0.a.f8685h);
        i.d(l2, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<e.a.a.a.y0.e.b> iterable = (Iterable) l2;
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (e.a.a.a.y0.e.b bVar : iterable) {
            i.d(bVar, "it");
            i.e(bVar, "proto");
            i.e(cVar, "nameResolver");
            arrayList.add(((c) this).d.a(bVar, cVar));
        }
        return arrayList;
    }

    public List<A> b(y yVar, n nVar) {
        i.e(yVar, "container");
        i.e(nVar, "proto");
        return t(yVar, nVar, C0180a.BACKING_FIELD);
    }

    public List<A> c(y yVar, p pVar, e.a.a.a.y0.k.b.b bVar) {
        i.e(yVar, "container");
        i.e(pVar, "proto");
        i.e(bVar, "kind");
        o o2 = o(this, pVar, yVar.a, yVar.f9618b, bVar, false, 16, (Object) null);
        if (o2 == null) {
            return o.f7934h;
        }
        i.e(o2, "signature");
        return m(this, yVar, new o(o2.a + '@' + 0, (DefaultConstructorMarker) null), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r11.f != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (b.q.a.a.r1((e.a.a.a.y0.e.i) r11) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (b.q.a.a.s1((e.a.a.a.y0.e.n) r11) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<A> d(e.a.a.a.y0.k.b.y r10, e.a.a.a.y0.h.p r11, e.a.a.a.y0.k.b.b r12, int r13, e.a.a.a.y0.e.u r14) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            e.x.c.i.e(r10, r0)
            java.lang.String r0 = "callableProto"
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = "kind"
            e.x.c.i.e(r12, r0)
            java.lang.String r0 = "proto"
            e.x.c.i.e(r14, r0)
            e.a.a.a.y0.e.z.c r3 = r10.a
            e.a.a.a.y0.e.z.e r4 = r10.f9618b
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r11
            r5 = r12
            e.a.a.a.y0.d.b.o r12 = o(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L_0x009d
            boolean r14 = r11 instanceof e.a.a.a.y0.e.i
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x0034
            e.a.a.a.y0.e.i r11 = (e.a.a.a.y0.e.i) r11
            boolean r11 = b.q.a.a.r1(r11)
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0034:
            boolean r14 = r11 instanceof e.a.a.a.y0.e.n
            if (r14 == 0) goto L_0x0041
            e.a.a.a.y0.e.n r11 = (e.a.a.a.y0.e.n) r11
            boolean r11 = b.q.a.a.s1(r11)
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0041:
            boolean r14 = r11 instanceof e.a.a.a.y0.e.d
            if (r14 == 0) goto L_0x0086
            r11 = r10
            e.a.a.a.y0.k.b.y$a r11 = (e.a.a.a.y0.k.b.y.a) r11
            e.a.a.a.y0.e.c$c r14 = r11.f9619e
            e.a.a.a.y0.e.c$c r2 = e.a.a.a.y0.e.c.C0199c.ENUM_CLASS
            if (r14 != r2) goto L_0x0050
            r0 = 2
            goto L_0x0056
        L_0x0050:
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            int r13 = r13 + r0
            java.lang.String r11 = "signature"
            e.x.c.i.e(r12, r11)
            e.a.a.a.y0.d.b.o r2 = new e.a.a.a.y0.d.b.o
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.a
            r11.append(r12)
            r12 = 64
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r12 = 0
            r2.<init>(r11, r12)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r0 = r9
            r1 = r10
            java.util.List r10 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L_0x0086:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Unsupported message: "
            java.lang.StringBuilder r12 = b.e.a.a.a.y(r12)
            java.lang.Class r11 = r11.getClass()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x009d:
            e.t.o r10 = e.t.o.f7934h
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.b.a.d(e.a.a.a.y0.k.b.y, e.a.a.a.y0.h.p, e.a.a.a.y0.k.b.b, int, e.a.a.a.y0.e.u):java.util.List");
    }

    public List<A> e(y yVar, n nVar) {
        i.e(yVar, "container");
        i.e(nVar, "proto");
        return t(yVar, nVar, C0180a.DELEGATE_FIELD);
    }

    public List<A> f(y.a aVar) {
        i.e(aVar, "container");
        l u = u(aVar);
        if (u != null) {
            ArrayList arrayList = new ArrayList(1);
            c cVar = new c(this, arrayList);
            i.e(u, "kotlinClass");
            u.b(cVar, (byte[]) null);
            return arrayList;
        }
        StringBuilder y = b.e.a.a.a.y("Class for loading annotations is not found: ");
        e.a.a.a.y0.f.b b2 = aVar.d.b();
        i.d(b2, "classId.asSingleFqName()");
        y.append(b2);
        throw new IllegalStateException(y.toString().toString());
    }

    public List<A> g(q qVar, e.a.a.a.y0.e.z.c cVar) {
        i.e(qVar, "proto");
        i.e(cVar, "nameResolver");
        Object l2 = qVar.l(e.a.a.a.y0.e.a0.a.f);
        i.d(l2, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<e.a.a.a.y0.e.b> iterable = (Iterable) l2;
        ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
        for (e.a.a.a.y0.e.b bVar : iterable) {
            i.d(bVar, "it");
            i.e(bVar, "proto");
            i.e(cVar, "nameResolver");
            arrayList.add(((c) this).d.a(bVar, cVar));
        }
        return arrayList;
    }

    public List<A> h(y yVar, p pVar, e.a.a.a.y0.k.b.b bVar) {
        i.e(yVar, "container");
        i.e(pVar, "proto");
        i.e(bVar, "kind");
        if (bVar == e.a.a.a.y0.k.b.b.PROPERTY) {
            return t(yVar, (n) pVar, C0180a.PROPERTY);
        }
        o o2 = o(this, pVar, yVar.a, yVar.f9618b, bVar, false, 16, (Object) null);
        return o2 != null ? m(this, yVar, o2, false, false, (Boolean) null, false, 60, (Object) null) : o.f7934h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C i(e.a.a.a.y0.k.b.y r14, e.a.a.a.y0.e.n r15, e.a.a.a.y0.m.d0 r16) {
        /*
            r13 = this;
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.String r0 = "container"
            e.x.c.i.e(r14, r0)
            java.lang.String r0 = "proto"
            e.x.c.i.e(r15, r0)
            java.lang.String r0 = "expectedType"
            r9 = r16
            e.x.c.i.e(r9, r0)
            e.a.a.a.y0.e.z.b$b r0 = e.a.a.a.y0.e.z.b.x
            int r1 = r8.f8984k
            java.lang.Boolean r4 = r0.d(r1)
            boolean r5 = e.a.a.a.y0.e.a0.b.h.d(r15)
            r2 = 1
            r3 = 1
            r0 = r13
            r1 = r14
            e.a.a.a.y0.d.b.l r0 = r0.r(r1, r2, r3, r4, r5)
            r10 = 0
            if (r0 == 0) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            boolean r0 = r7 instanceof e.a.a.a.y0.k.b.y.a
            if (r0 == 0) goto L_0x0039
            r0 = r7
            e.a.a.a.y0.k.b.y$a r0 = (e.a.a.a.y0.k.b.y.a) r0
            e.a.a.a.y0.d.b.l r0 = r13.u(r0)
        L_0x0037:
            r11 = r0
            goto L_0x003a
        L_0x0039:
            r11 = r10
        L_0x003a:
            if (r11 == 0) goto L_0x00eb
            e.a.a.a.y0.d.b.w.a r0 = r11.a()
            e.a.a.a.y0.e.a0.b.f r0 = r0.f8658b
            e.a.a.a.y0.d.b.d$a r1 = e.a.a.a.y0.d.b.d.f8642g
            e.a.a.a.y0.e.a0.b.f r1 = e.a.a.a.y0.d.b.d.f
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "version"
            e.x.c.i.e(r1, r2)
            int r2 = r1.a
            int r3 = r1.f9183b
            int r1 = r1.c
            int r4 = r0.a
            r5 = 1
            if (r4 <= r2) goto L_0x005a
            goto L_0x006c
        L_0x005a:
            r12 = 0
            if (r4 >= r2) goto L_0x005e
            goto L_0x006b
        L_0x005e:
            int r2 = r0.f9183b
            if (r2 <= r3) goto L_0x0063
            goto L_0x006c
        L_0x0063:
            if (r2 >= r3) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            int r0 = r0.c
            if (r0 < r1) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r5 = r12
        L_0x006c:
            e.a.a.a.y0.e.z.c r2 = r7.a
            e.a.a.a.y0.e.z.e r3 = r7.f9618b
            e.a.a.a.y0.k.b.b r4 = e.a.a.a.y0.k.b.b.PROPERTY
            r0 = r13
            r1 = r15
            e.a.a.a.y0.d.b.o r0 = r0.n(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00eb
            e.a.a.a.y0.l.g<e.a.a.a.y0.d.b.l, e.a.a.a.y0.d.b.a$b<A, C>> r1 = r6.a
            e.a.a.a.y0.l.e$m r1 = (e.a.a.a.y0.l.e.m) r1
            java.lang.Object r1 = r1.invoke(r11)
            e.a.a.a.y0.d.b.a$b r1 = (e.a.a.a.y0.d.b.a.b) r1
            java.util.Map<e.a.a.a.y0.d.b.o, C> r1 = r1.f8629b
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x00eb
            boolean r1 = e.a.a.a.y0.a.n.a(r16)
            if (r1 == 0) goto L_0x00ea
            e.a.a.a.y0.j.t.g r0 = (e.a.a.a.y0.j.t.g) r0
            java.lang.String r1 = "constant"
            e.x.c.i.e(r0, r1)
            boolean r1 = r0 instanceof e.a.a.a.y0.j.t.d
            if (r1 == 0) goto L_0x00ae
            e.a.a.a.y0.j.t.y r1 = new e.a.a.a.y0.j.t.y
            e.a.a.a.y0.j.t.d r0 = (e.a.a.a.y0.j.t.d) r0
            T r0 = r0.a
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            r1.<init>(r0)
        L_0x00ac:
            r0 = r1
            goto L_0x00ea
        L_0x00ae:
            boolean r1 = r0 instanceof e.a.a.a.y0.j.t.w
            if (r1 == 0) goto L_0x00c2
            e.a.a.a.y0.j.t.b0 r1 = new e.a.a.a.y0.j.t.b0
            e.a.a.a.y0.j.t.w r0 = (e.a.a.a.y0.j.t.w) r0
            T r0 = r0.a
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r1.<init>(r0)
            goto L_0x00ac
        L_0x00c2:
            boolean r1 = r0 instanceof e.a.a.a.y0.j.t.n
            if (r1 == 0) goto L_0x00d6
            e.a.a.a.y0.j.t.z r1 = new e.a.a.a.y0.j.t.z
            e.a.a.a.y0.j.t.n r0 = (e.a.a.a.y0.j.t.n) r0
            T r0 = r0.a
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.<init>(r0)
            goto L_0x00ac
        L_0x00d6:
            boolean r1 = r0 instanceof e.a.a.a.y0.j.t.u
            if (r1 == 0) goto L_0x00ea
            e.a.a.a.y0.j.t.a0 r1 = new e.a.a.a.y0.j.t.a0
            e.a.a.a.y0.j.t.u r0 = (e.a.a.a.y0.j.t.u) r0
            T r0 = r0.a
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.<init>(r2)
            goto L_0x00ac
        L_0x00ea:
            return r0
        L_0x00eb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.b.a.i(e.a.a.a.y0.k.b.y, e.a.a.a.y0.e.n, e.a.a.a.y0.m.d0):java.lang.Object");
    }

    public List<A> j(y yVar, e.a.a.a.y0.e.g gVar) {
        i.e(yVar, "container");
        i.e(gVar, "proto");
        String a2 = yVar.a.a(gVar.f8897k);
        String c2 = ((y.a) yVar).d.c();
        i.d(c2, "(container as ProtoConta…Class).classId.asString()");
        String a3 = e.a.a.a.y0.e.a0.b.b.a(c2);
        i.e(a2, "name");
        i.e(a3, "desc");
        return m(this, yVar, new o(a2 + '#' + a3, (DefaultConstructorMarker) null), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public final List<A> l(y yVar, o oVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> list;
        o oVar2 = o.f7934h;
        l r = r(yVar, z, z2, bool, z3);
        if (r == null) {
            r = yVar instanceof y.a ? u((y.a) yVar) : null;
        }
        return (r == null || (list = ((b) ((e.m) this.a).invoke(r)).a.get(oVar)) == null) ? oVar2 : list;
    }

    public final o n(p pVar, e.a.a.a.y0.e.z.c cVar, e.a.a.a.y0.e.z.e eVar, e.a.a.a.y0.k.b.b bVar, boolean z) {
        e.b bVar2;
        o oVar;
        if (pVar instanceof e.a.a.a.y0.e.d) {
            bVar2 = h.f8770b.a((e.a.a.a.y0.e.d) pVar, cVar, eVar);
            if (bVar2 == null) {
                return null;
            }
        } else if (pVar instanceof e.a.a.a.y0.e.i) {
            bVar2 = h.f8770b.c((e.a.a.a.y0.e.i) pVar, cVar, eVar);
            if (bVar2 == null) {
                return null;
            }
        } else if (!(pVar instanceof n)) {
            return null;
        } else {
            h.f<n, a.d> fVar = e.a.a.a.y0.e.a0.a.d;
            i.d(fVar, "propertySignature");
            a.d dVar = (a.d) b.q.a.a.I0((h.d) pVar, fVar);
            if (dVar == null) {
                return null;
            }
            int ordinal = bVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 || !dVar.k()) {
                        return null;
                    }
                    a.c cVar2 = dVar.f8721m;
                    i.d(cVar2, "signature.setter");
                    i.e(cVar, "nameResolver");
                    i.e(cVar2, "signature");
                    String a2 = cVar.a(cVar2.f8707j);
                    String a3 = cVar.a(cVar2.f8708k);
                    i.e(a2, "name");
                    i.e(a3, "desc");
                    oVar = new o(b.e.a.a.a.m(a2, a3), (DefaultConstructorMarker) null);
                } else if (!dVar.j()) {
                    return null;
                } else {
                    a.c cVar3 = dVar.f8720l;
                    i.d(cVar3, "signature.getter");
                    i.e(cVar, "nameResolver");
                    i.e(cVar3, "signature");
                    String a4 = cVar.a(cVar3.f8707j);
                    String a5 = cVar.a(cVar3.f8708k);
                    i.e(a4, "name");
                    i.e(a5, "desc");
                    oVar = new o(b.e.a.a.a.m(a4, a5), (DefaultConstructorMarker) null);
                }
                return oVar;
            }
            return p((n) pVar, cVar, eVar, true, true, z);
        }
        return o.b(bVar2);
    }

    public final o p(n nVar, e.a.a.a.y0.e.z.c cVar, e.a.a.a.y0.e.z.e eVar, boolean z, boolean z2, boolean z3) {
        h.f<n, a.d> fVar = e.a.a.a.y0.e.a0.a.d;
        i.d(fVar, "propertySignature");
        a.d dVar = (a.d) b.q.a.a.I0(nVar, fVar);
        if (dVar != null) {
            if (z) {
                e.a b2 = e.a.a.a.y0.e.a0.b.h.f8770b.b(nVar, cVar, eVar, z3);
                if (b2 != null) {
                    return o.b(b2);
                }
                return null;
            } else if (z2) {
                if ((dVar.f8717i & 2) == 2) {
                    a.c cVar2 = dVar.f8719k;
                    i.d(cVar2, "signature.syntheticMethod");
                    i.e(cVar, "nameResolver");
                    i.e(cVar2, "signature");
                    String a2 = cVar.a(cVar2.f8707j);
                    String a3 = cVar.a(cVar2.f8708k);
                    i.e(a2, "name");
                    i.e(a3, "desc");
                    return new o(b.e.a.a.a.m(a2, a3), (DefaultConstructorMarker) null);
                }
            }
        }
        return null;
    }

    public final l r(y yVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        y.a aVar;
        c.C0199c cVar;
        String str;
        e.a.a.a.y0.f.a aVar2;
        k kVar;
        c.C0199c cVar2 = c.C0199c.INTERFACE;
        if (z) {
            if (bool != null) {
                if (yVar instanceof y.a) {
                    y.a aVar3 = (y.a) yVar;
                    if (aVar3.f9619e == cVar2) {
                        kVar = this.f8624b;
                        aVar2 = aVar3.d.d(e.a.a.a.y0.f.d.l("DefaultImpls"));
                        str = "container.classId.create…EFAULT_IMPLS_CLASS_NAME))";
                        i.d(aVar2, str);
                        return b.q.a.a.n0(kVar, aVar2);
                    }
                }
                if (bool.booleanValue() && (yVar instanceof y.b)) {
                    m0 m0Var = yVar.c;
                    if (!(m0Var instanceof g)) {
                        m0Var = null;
                    }
                    g gVar = (g) m0Var;
                    e.a.a.a.y0.j.w.b bVar = gVar != null ? gVar.c : null;
                    if (bVar != null) {
                        kVar = this.f8624b;
                        String e2 = bVar.e();
                        i.d(e2, "facadeClassName.internalName");
                        aVar2 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(e.c0.h.v(e2, '/', '.', false, 4)));
                        str = "ClassId.topLevel(FqName(…lName.replace('/', '.')))";
                        i.d(aVar2, str);
                        return b.q.a.a.n0(kVar, aVar2);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + yVar + ')').toString());
            }
        }
        if (z2 && (yVar instanceof y.a)) {
            y.a aVar4 = (y.a) yVar;
            if (aVar4.f9619e == c.C0199c.COMPANION_OBJECT && (aVar = aVar4.f9621h) != null && ((cVar = aVar.f9619e) == c.C0199c.CLASS || cVar == c.C0199c.ENUM_CLASS || (z3 && (cVar == cVar2 || cVar == c.C0199c.ANNOTATION_CLASS)))) {
                return u(aVar);
            }
        }
        if (yVar instanceof y.b) {
            m0 m0Var2 = yVar.c;
            if (m0Var2 instanceof g) {
                Objects.requireNonNull(m0Var2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                g gVar2 = (g) m0Var2;
                l lVar = gVar2.d;
                return lVar != null ? lVar : b.q.a.a.n0(this.f8624b, gVar2.d());
            }
        }
        return null;
    }

    public abstract l.a s(e.a.a.a.y0.f.a aVar, m0 m0Var, List<A> list);

    public final List<A> t(y yVar, n nVar, C0180a aVar) {
        y yVar2 = yVar;
        C0180a aVar2 = aVar;
        o oVar = o.f7934h;
        boolean N = b.e.a.a.a.N(e.a.a.a.y0.e.z.b.x, nVar.f8984k, "Flags.IS_CONST.get(proto.flags)");
        boolean d2 = e.a.a.a.y0.e.a0.b.h.d(nVar);
        if (aVar2 == C0180a.PROPERTY) {
            o q2 = q(this, nVar, yVar2.a, yVar2.f9618b, false, true, false, 40, (Object) null);
            return q2 != null ? m(this, yVar, q2, true, false, Boolean.valueOf(N), d2, 8, (Object) null) : oVar;
        }
        o q3 = q(this, nVar, yVar2.a, yVar2.f9618b, true, false, false, 48, (Object) null);
        if (q3 == null) {
            return oVar;
        }
        boolean z = false;
        boolean d3 = e.c0.h.d(q3.a, "$delegate", false, 2);
        if (aVar2 == C0180a.DELEGATE_FIELD) {
            z = true;
        }
        return d3 != z ? oVar : l(yVar, q3, true, true, Boolean.valueOf(N), d2);
    }

    public final l u(y.a aVar) {
        m0 m0Var = aVar.c;
        if (!(m0Var instanceof n)) {
            m0Var = null;
        }
        n nVar = (n) m0Var;
        if (nVar != null) {
            return nVar.f8647b;
        }
        return null;
    }
}
