package e.a.a.a.y0.k.b.g0;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.c;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.k.b.c0;
import e.a.a.a.y0.k.b.l;
import e.a.a.a.y0.m.d0;
import e.t.g;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;

public final class m extends c {
    public final a r;
    public final l s;
    public final s t;

    public static final class a extends k implements e.x.b.a<List<? extends e.a.a.a.y0.b.a1.c>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ m f9565h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(0);
            this.f9565h = mVar;
        }

        public Object e() {
            m mVar = this.f9565h;
            l lVar = mVar.s;
            return g.W(lVar.c.f.a(mVar.t, lVar.d));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(e.a.a.a.y0.k.b.l r11, e.a.a.a.y0.e.s r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = "proto"
            e.x.c.i.e(r12, r0)
            e.a.a.a.y0.k.b.j r0 = r11.c
            e.a.a.a.y0.l.m r2 = r0.f9570b
            e.a.a.a.y0.b.k r3 = r11.f9584e
            e.a.a.a.y0.e.z.c r0 = r11.d
            int r1 = r12.f9086l
            e.a.a.a.y0.f.d r4 = b.q.a.a.X0(r0, r1)
            e.a.a.a.y0.e.s$c r0 = r12.f9088n
            java.lang.String r1 = "proto.variance"
            e.x.c.i.d(r0, r1)
            java.lang.String r1 = "variance"
            e.x.c.i.e(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003c
            r1 = 1
            if (r0 == r1) goto L_0x0039
            r1 = 2
            if (r0 != r1) goto L_0x0033
            e.a.a.a.y0.m.j1 r0 = e.a.a.a.y0.m.j1.INVARIANT
            goto L_0x003e
        L_0x0033:
            e.h r11 = new e.h
            r11.<init>()
            throw r11
        L_0x0039:
            e.a.a.a.y0.m.j1 r0 = e.a.a.a.y0.m.j1.OUT_VARIANCE
            goto L_0x003e
        L_0x003c:
            e.a.a.a.y0.m.j1 r0 = e.a.a.a.y0.m.j1.IN_VARIANCE
        L_0x003e:
            r5 = r0
            boolean r6 = r12.f9087m
            e.a.a.a.y0.b.m0 r8 = e.a.a.a.y0.b.m0.a
            e.a.a.a.y0.b.p0$a r9 = e.a.a.a.y0.b.p0.a.a
            r1 = r10
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.s = r11
            r10.t = r12
            e.a.a.a.y0.k.b.g0.a r12 = new e.a.a.a.y0.k.b.g0.a
            e.a.a.a.y0.k.b.j r11 = r11.c
            e.a.a.a.y0.l.m r11 = r11.f9570b
            e.a.a.a.y0.k.b.g0.m$a r13 = new e.a.a.a.y0.k.b.g0.m$a
            r13.<init>(r10)
            r12.<init>(r11, r13)
            r10.r = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.g0.m.<init>(e.a.a.a.y0.k.b.l, e.a.a.a.y0.e.s, int):void");
    }

    public List<d0> K0() {
        s sVar = this.t;
        e eVar = this.s.f;
        i.e(sVar, "$this$upperBounds");
        i.e(eVar, "typeTable");
        List<q> list = sVar.f9089o;
        boolean z = !list.isEmpty();
        ArrayList arrayList = list;
        if (!z) {
            arrayList = null;
        }
        ArrayList<q> arrayList2 = arrayList;
        if (arrayList == null) {
            List<Integer> list2 = sVar.f9090p;
            i.d(list2, "upperBoundIdList");
            ArrayList arrayList3 = new ArrayList(b.q.a.a.C(list2, 10));
            for (Integer num : list2) {
                i.d(num, "it");
                arrayList3.add(eVar.a(num.intValue()));
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            return b.q.a.a.l2(b.f(this).l());
        }
        c0 c0Var = this.s.a;
        ArrayList arrayList4 = new ArrayList(b.q.a.a.C(arrayList2, 10));
        for (q e2 : arrayList2) {
            arrayList4.add(c0Var.e(e2));
        }
        return arrayList4;
    }

    public h k() {
        return this.r;
    }

    public void w0(d0 d0Var) {
        i.e(d0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
