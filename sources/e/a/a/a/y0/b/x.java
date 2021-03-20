package e.a.a.a.y0.b;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.j;
import e.a.a.a.y0.b.c1.m0;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.g;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.n;
import e.a.a.a.y0.m.v0;
import e.a0.e;
import e.t.o;
import e.t.q;
import e.t.u;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class x {
    public final g<e.a.a.a.y0.f.b, y> a;

    /* renamed from: b  reason: collision with root package name */
    public final g<a, e> f7842b;
    public final m c;
    public final w d;

    public static final class a {
        public final e.a.a.a.y0.f.a a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f7843b;

        public a(e.a.a.a.y0.f.a aVar, List<Integer> list) {
            i.e(aVar, "classId");
            i.e(list, "typeParametersCount");
            this.a = aVar;
            this.f7843b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.f7843b, aVar.f7843b);
        }

        public int hashCode() {
            e.a.a.a.y0.f.a aVar = this.a;
            int i2 = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            List<Integer> list = this.f7843b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("ClassRequest(classId=");
            y.append(this.a);
            y.append(", typeParametersCount=");
            y.append(this.f7843b);
            y.append(")");
            return y.toString();
        }
    }

    public static final class b extends j {

        /* renamed from: o  reason: collision with root package name */
        public final List<r0> f7844o;

        /* renamed from: p  reason: collision with root package name */
        public final n f7845p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f7846q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar, k kVar, e.a.a.a.y0.f.d dVar, boolean z, int i2) {
            super(mVar, kVar, dVar, m0.a, false);
            i.e(mVar, "storageManager");
            i.e(kVar, "container");
            i.e(dVar, "name");
            this.f7846q = z;
            e.a0.d d = e.d(0, i2);
            ArrayList arrayList = new ArrayList(b.q.a.a.C(d, 10));
            Iterator it = d.iterator();
            while (((e.a0.c) it).f7887i) {
                int nextInt = ((u) it).nextInt();
                Objects.requireNonNull(h.f7785e);
                h hVar = h.a.a;
                j1 j1Var = j1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(nextInt);
                arrayList.add(m0.W0(this, hVar, false, j1Var, e.a.a.a.y0.f.d.l(sb.toString()), nextInt, mVar));
            }
            this.f7844o = arrayList;
            this.f7845p = new n(this, b.q.a.a.F(this), b.q.a.a.S2(e.a.a.a.y0.j.v.b.k(this).v().f()), mVar);
        }

        public List<r0> A() {
            return this.f7844o;
        }

        public e B0() {
            return null;
        }

        public boolean J() {
            return false;
        }

        public boolean J0() {
            return false;
        }

        public boolean N() {
            return false;
        }

        public boolean S0() {
            return false;
        }

        public boolean V() {
            return false;
        }

        public e.a.a.a.y0.j.y.i e0(f fVar) {
            i.e(fVar, "kotlinTypeRefiner");
            return i.b.f9460b;
        }

        public Collection<e> g0() {
            return o.f7934h;
        }

        public z0 getVisibility() {
            z0 z0Var = y0.f7850e;
            e.x.c.i.d(z0Var, "Visibilities.PUBLIC");
            return z0Var;
        }

        public f i() {
            return f.CLASS;
        }

        public h k() {
            Objects.requireNonNull(h.f7785e);
            return h.a.a;
        }

        public boolean l() {
            return false;
        }

        public boolean m0() {
            return false;
        }

        public v0 p() {
            return this.f7845p;
        }

        public v q() {
            return v.FINAL;
        }

        public Collection<d> r() {
            return q.f7936h;
        }

        public boolean t() {
            return this.f7846q;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("class ");
            y.append(getName());
            y.append(" (not found)");
            return y.toString();
        }

        public d x0() {
            return null;
        }

        public e.a.a.a.y0.j.y.i y0() {
            return i.b.f9460b;
        }
    }

    public static final class c extends k implements l<a, e> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ x f7847h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(x xVar) {
            super(1);
            this.f7847h = xVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
            if (r1 != null) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                e.a.a.a.y0.b.x$a r9 = (e.a.a.a.y0.b.x.a) r9
                java.lang.String r0 = "<name for destructuring parameter 0>"
                e.x.c.i.e(r9, r0)
                e.a.a.a.y0.f.a r0 = r9.a
                java.util.List<java.lang.Integer> r9 = r9.f7843b
                boolean r1 = r0.c
                if (r1 != 0) goto L_0x0065
                e.a.a.a.y0.f.a r1 = r0.g()
                if (r1 == 0) goto L_0x0028
                e.a.a.a.y0.b.x r2 = r8.f7847h
                java.lang.String r3 = "outerClassId"
                e.x.c.i.d(r1, r3)
                r3 = 1
                java.util.List r3 = e.t.g.k(r9, r3)
                e.a.a.a.y0.b.e r1 = r2.a(r1, r3)
                if (r1 == 0) goto L_0x0028
                goto L_0x003d
            L_0x0028:
                e.a.a.a.y0.b.x r1 = r8.f7847h
                e.a.a.a.y0.l.g<e.a.a.a.y0.f.b, e.a.a.a.y0.b.y> r1 = r1.a
                e.a.a.a.y0.f.b r2 = r0.h()
                java.lang.String r3 = "classId.packageFqName"
                e.x.c.i.d(r2, r3)
                e.a.a.a.y0.l.e$m r1 = (e.a.a.a.y0.l.e.m) r1
                java.lang.Object r1 = r1.invoke(r2)
                e.a.a.a.y0.b.g r1 = (e.a.a.a.y0.b.g) r1
            L_0x003d:
                r4 = r1
                boolean r6 = r0.k()
                e.a.a.a.y0.b.x$b r1 = new e.a.a.a.y0.b.x$b
                e.a.a.a.y0.b.x r2 = r8.f7847h
                e.a.a.a.y0.l.m r3 = r2.c
                e.a.a.a.y0.f.d r5 = r0.j()
                java.lang.String r0 = "classId.shortClassName"
                e.x.c.i.d(r5, r0)
                java.lang.Object r9 = e.t.g.q(r9)
                java.lang.Integer r9 = (java.lang.Integer) r9
                if (r9 == 0) goto L_0x005e
                int r9 = r9.intValue()
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                r7 = r9
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x0065:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.x.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends k implements l<e.a.a.a.y0.f.b, y> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ x f7848h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(x xVar) {
            super(1);
            this.f7848h = xVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.b bVar = (e.a.a.a.y0.f.b) obj;
            e.x.c.i.e(bVar, "fqName");
            return new e.a.a.a.y0.b.c1.o(this.f7848h.d, bVar);
        }
    }

    public x(m mVar, w wVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(wVar, "module");
        this.c = mVar;
        this.d = wVar;
        this.a = mVar.h(new d(this));
        this.f7842b = mVar.h(new c(this));
    }

    public final e a(e.a.a.a.y0.f.a aVar, List<Integer> list) {
        e.x.c.i.e(aVar, "classId");
        e.x.c.i.e(list, "typeParametersCount");
        return (e) ((e.m) this.f7842b).invoke(new a(aVar, list));
    }
}
