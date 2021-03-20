package e.a.a.a.y0.k.b.g0;

import b.q.a.a;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.t.g;
import e.t.q;
import e.x.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class i extends h {

    /* renamed from: n  reason: collision with root package name */
    public final b f9560n;

    /* renamed from: o  reason: collision with root package name */
    public final y f9561o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(e.a.a.a.y0.b.y r16, e.a.a.a.y0.e.l r17, e.a.a.a.y0.e.z.c r18, e.a.a.a.y0.e.z.a r19, e.a.a.a.y0.k.b.g0.f r20, e.a.a.a.y0.k.b.j r21, e.x.b.a<? extends java.util.Collection<e.a.a.a.y0.f.d>> r22) {
        /*
            r15 = this;
            r6 = r15
            r14 = r16
            r0 = r17
            java.lang.String r1 = "packageDescriptor"
            e.x.c.i.e(r14, r1)
            java.lang.String r1 = "proto"
            e.x.c.i.e(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r18
            e.x.c.i.e(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r19
            e.x.c.i.e(r3, r1)
            java.lang.String r1 = "components"
            r4 = r21
            e.x.c.i.e(r4, r1)
            java.lang.String r1 = "classNames"
            r5 = r22
            e.x.c.i.e(r5, r1)
            e.a.a.a.y0.e.z.e r10 = new e.a.a.a.y0.e.z.e
            e.a.a.a.y0.e.t r1 = r0.f8958n
            java.lang.String r7 = "proto.typeTable"
            e.x.c.i.d(r1, r7)
            r10.<init>(r1)
            e.a.a.a.y0.e.z.g$a r1 = e.a.a.a.y0.e.z.g.c
            e.a.a.a.y0.e.w r7 = r0.f8959o
            java.lang.String r8 = "proto.versionRequirementTable"
            e.x.c.i.d(r7, r8)
            e.a.a.a.y0.e.z.g r11 = r1.a(r7)
            r7 = r21
            r8 = r16
            r9 = r18
            r12 = r19
            r13 = r20
            e.a.a.a.y0.k.b.l r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List<e.a.a.a.y0.e.i> r2 = r0.f8955k
            java.lang.String r3 = "proto.functionList"
            e.x.c.i.d(r2, r3)
            java.util.List<e.a.a.a.y0.e.n> r3 = r0.f8956l
            java.lang.String r4 = "proto.propertyList"
            e.x.c.i.d(r3, r4)
            java.util.List<e.a.a.a.y0.e.r> r4 = r0.f8957m
            java.lang.String r0 = "proto.typeAliasList"
            e.x.c.i.d(r4, r0)
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f9561o = r14
            e.a.a.a.y0.f.b r0 = r16.e()
            r6.f9560n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.g0.i.<init>(e.a.a.a.y0.b.y, e.a.a.a.y0.e.l, e.a.a.a.y0.e.z.c, e.a.a.a.y0.e.z.a, e.a.a.a.y0.k.b.g0.f, e.a.a.a.y0.k.b.j, e.x.b.a):void");
    }

    public h b(d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        a.A2(this.f9546l.c.f9575j, bVar, this.f9561o, dVar);
        return super.b(dVar, bVar);
    }

    public Collection c(e.a.a.a.y0.j.y.d dVar, l lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        e.x.c.i.e(lVar, "nameFilter");
        Collection<k> i2 = i(dVar, lVar, e.a.a.a.y0.c.a.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<e.a.a.a.y0.b.b1.b> iterable = this.f9546l.c.f9577l;
        ArrayList arrayList = new ArrayList();
        for (e.a.a.a.y0.b.b1.b a : iterable) {
            g.b(arrayList, a.a(this.f9560n));
        }
        return g.I(i2, arrayList);
    }

    public void h(Collection<k> collection, l<? super d, Boolean> lVar) {
        e.x.c.i.e(collection, "result");
        e.x.c.i.e(lVar, "nameFilter");
    }

    public e.a.a.a.y0.f.a l(d dVar) {
        e.x.c.i.e(dVar, "name");
        return new e.a.a.a.y0.f.a(this.f9560n, dVar);
    }

    public Set<d> n() {
        return q.f7936h;
    }

    public Set<d> o() {
        return q.f7936h;
    }

    public Set<d> p() {
        return q.f7936h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(e.a.a.a.y0.f.d r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            e.x.c.i.e(r6, r0)
            e.x.c.i.e(r6, r0)
            java.util.Set r0 = r5.m()
            boolean r0 = r0.contains(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0047
            e.a.a.a.y0.k.b.l r0 = r5.f9546l
            e.a.a.a.y0.k.b.j r0 = r0.c
            java.lang.Iterable<e.a.a.a.y0.b.b1.b> r0 = r0.f9577l
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
            goto L_0x0042
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r0.next()
            e.a.a.a.y0.b.b1.b r3 = (e.a.a.a.y0.b.b1.b) r3
            e.a.a.a.y0.f.b r4 = r5.f9560n
            boolean r3 = r3.b(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = r1
            goto L_0x0043
        L_0x0042:
            r6 = r2
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.g0.i.r(e.a.a.a.y0.f.d):boolean");
    }
}
