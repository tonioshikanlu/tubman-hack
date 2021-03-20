package e.a.a.a.y0.m;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.o.l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class b extends h implements v0 {

    /* renamed from: b  reason: collision with root package name */
    public int f9647b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(m mVar) {
        super(mVar);
        if (mVar != null) {
            this.f9647b = 0;
            return;
        }
        n(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void n(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "hasMeaningfulFqName"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.b.n(int):void");
    }

    public static boolean p(h hVar) {
        if (hVar != null) {
            return !w.j(hVar) && !g.t(hVar);
        }
        n(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0) || obj.hashCode() != hashCode()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.g().size() != g().size()) {
            return false;
        }
        e o2 = d();
        h d = v0Var.d();
        if (!p(o2) || ((d != null && !p(d)) || !(d instanceof e))) {
            return false;
        }
        e eVar = (e) d;
        if (o2.getName().equals(eVar.getName())) {
            k b2 = o2.b();
            k b3 = eVar.b();
            while (b2 != null && b3 != null) {
                if (b2 instanceof w) {
                    return b3 instanceof w;
                }
                if (!(b3 instanceof w)) {
                    if (b2 instanceof y) {
                        if ((b3 instanceof y) && ((y) b2).e().equals(((y) b3).e())) {
                            return true;
                        }
                    } else if (!(b3 instanceof y) && b2.getName().equals(b3.getName())) {
                        b2 = b2.b();
                        b3 = b3.b();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f9647b;
        if (i2 != 0) {
            return i2;
        }
        e o2 = d();
        int hashCode = p(o2) ? g.g(o2).hashCode() : System.identityHashCode(this);
        this.f9647b = hashCode;
        return hashCode;
    }

    public d0 i() {
        if (e.a.a.a.y0.a.g.K(d())) {
            return null;
        }
        return v().f();
    }

    public Collection<d0> j(boolean z) {
        k b2 = d().b();
        if (!(b2 instanceof e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            n(3);
            throw null;
        }
        l lVar = new l();
        e eVar = (e) b2;
        lVar.add(eVar.s());
        e B0 = eVar.B0();
        if (z && B0 != null) {
            lVar.add(B0.s());
        }
        return lVar;
    }

    /* renamed from: o */
    public abstract e d();

    public e.a.a.a.y0.a.g v() {
        e.a.a.a.y0.a.g f = e.a.a.a.y0.j.v.b.f(d());
        if (f != null) {
            return f;
        }
        n(1);
        throw null;
    }
}
