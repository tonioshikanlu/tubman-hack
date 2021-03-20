package b.l.f.c0;

import b.l.f.e;
import b.l.f.m;
import b.l.f.p;
import b.l.f.y.a;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public final class q extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final y[] f5647b = new y[0];
    public final y[] a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(java.util.Map<b.l.f.e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            b.l.f.e r0 = b.l.f.e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0054
            b.l.f.a r1 = b.l.f.a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0024
            b.l.f.c0.i r1 = new b.l.f.c0.i
            r1.<init>()
            goto L_0x0031
        L_0x0024:
            b.l.f.a r1 = b.l.f.a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0034
            b.l.f.c0.t r1 = new b.l.f.c0.t
            r1.<init>()
        L_0x0031:
            r0.add(r1)
        L_0x0034:
            b.l.f.a r1 = b.l.f.a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0044
            b.l.f.c0.k r1 = new b.l.f.c0.k
            r1.<init>()
            r0.add(r1)
        L_0x0044:
            b.l.f.a r1 = b.l.f.a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0054
            b.l.f.c0.a0 r3 = new b.l.f.c0.a0
            r3.<init>()
            r0.add(r3)
        L_0x0054:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0072
            b.l.f.c0.i r3 = new b.l.f.c0.i
            r3.<init>()
            r0.add(r3)
            b.l.f.c0.k r3 = new b.l.f.c0.k
            r3.<init>()
            r0.add(r3)
            b.l.f.c0.a0 r3 = new b.l.f.c0.a0
            r3.<init>()
            r0.add(r3)
        L_0x0072:
            b.l.f.c0.y[] r3 = f5647b
            java.lang.Object[] r3 = r0.toArray(r3)
            b.l.f.c0.y[] r3 = (b.l.f.c0.y[]) r3
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.c0.q.<init>(java.util.Map):void");
    }

    public void c() {
        for (y requireNonNull : this.a) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public b.l.f.q d(int i2, a aVar, Map<e, ?> map) {
        boolean z;
        b.l.f.a aVar2 = b.l.f.a.UPC_A;
        int[] p2 = y.p(aVar);
        y[] yVarArr = this.a;
        int i3 = 0;
        while (i3 < yVarArr.length) {
            try {
                b.l.f.q n2 = yVarArr[i3].n(i2, aVar, p2, map);
                boolean z2 = n2.d == b.l.f.a.EAN_13 && n2.a.charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(aVar2)) {
                        z = false;
                        if (z2 || !z) {
                            return n2;
                        }
                        b.l.f.q qVar = new b.l.f.q(n2.a.substring(1), n2.f5763b, n2.c, aVar2);
                        qVar.a(n2.f5764e);
                        return qVar;
                    }
                }
                z = true;
                if (z2) {
                }
                return n2;
            } catch (p unused) {
                i3++;
            }
        }
        throw m.f5759j;
    }
}
