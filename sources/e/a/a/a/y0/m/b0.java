package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.j.y.n;
import e.a.a.a.y0.m.l1.f;
import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class b0 implements v0 {
    public d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<d0> f9648b;
    public final int c;

    public static final class a extends k implements l<f, k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b0 f9649h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var) {
            super(1);
            this.f9649h = b0Var;
        }

        public Object invoke(Object obj) {
            f fVar = (f) obj;
            i.e(fVar, "kotlinTypeRefiner");
            return this.f9649h.a(fVar).e();
        }
    }

    public b0(Collection<? extends d0> collection) {
        i.e(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<d0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f9648b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public boolean b() {
        return false;
    }

    public h d() {
        return null;
    }

    public final k0 e() {
        Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
        return e0.i(h.a.a, this, o.f7934h, false, n.a.a("member scope for intersection type", this.f9648b), new a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return i.a(this.f9648b, ((b0) obj).f9648b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: e.a.a.a.y0.m.b0} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [e.a.a.a.y0.m.d0] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.m.b0 a(e.a.a.a.y0.m.l1.f r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            e.x.c.i.e(r5, r0)
            java.util.LinkedHashSet<e.a.a.a.y0.m.d0> r0 = r4.f9648b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = b.q.a.a.C(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            e.a.a.a.y0.m.d0 r2 = (e.a.a.a.y0.m.d0) r2
            e.a.a.a.y0.m.d0 r2 = r2.Y0(r5)
            r3 = 1
            r1.add(r2)
            r2 = r3
            goto L_0x0017
        L_0x002d:
            r0 = 0
            if (r2 != 0) goto L_0x0031
            goto L_0x0051
        L_0x0031:
            e.a.a.a.y0.m.d0 r2 = r4.a
            if (r2 == 0) goto L_0x0039
            e.a.a.a.y0.m.d0 r0 = r2.Y0(r5)
        L_0x0039:
            java.lang.String r5 = "typesToIntersect"
            e.x.c.i.e(r1, r5)
            r1.isEmpty()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r1)
            r5.hashCode()
            e.a.a.a.y0.m.b0 r1 = new e.a.a.a.y0.m.b0
            r1.<init>(r5)
            r1.a = r0
            r0 = r1
        L_0x0051:
            if (r0 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = r4
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.b0.a(e.a.a.a.y0.m.l1.f):e.a.a.a.y0.m.b0");
    }

    public List<r0> g() {
        return o.f7934h;
    }

    public Collection<d0> h() {
        return this.f9648b;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        List<T> c2;
        LinkedHashSet<d0> linkedHashSet = this.f9648b;
        c0 c0Var = new c0();
        i.e(linkedHashSet, "$this$sortedWith");
        i.e(c0Var, "comparator");
        if (linkedHashSet.size() <= 1) {
            c2 = g.W(linkedHashSet);
        } else {
            Object[] array = linkedHashSet.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            i.e(array, "$this$sortWith");
            i.e(c0Var, "comparator");
            if (array.length > 1) {
                Arrays.sort(array, c0Var);
            }
            c2 = g.c(array);
        }
        return g.x(c2, " & ", "{", "}", 0, (CharSequence) null, (l) null, 56);
    }

    public e.a.a.a.y0.a.g v() {
        e.a.a.a.y0.a.g v = ((d0) this.f9648b.iterator().next()).W0().v();
        i.d(v, "intersectedTypes.iterato…xt().constructor.builtIns");
        return v;
    }
}
