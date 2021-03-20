package b.l.f.w;

import b.l.f.c;
import b.l.f.e;
import b.l.f.o;
import b.l.f.q;
import java.util.Map;

public final class b implements o {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005a A[LOOP:0: B:29:0x0058->B:30:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.f.q a(b.l.f.c r11, java.util.Map<b.l.f.e, ?> r12) {
        /*
            r10 = this;
            b.l.f.w.e.a r0 = new b.l.f.w.e.a
            b.l.f.y.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            b.l.f.w.a r2 = r0.a(r11)     // Catch:{ m -> 0x0029, h -> 0x0023 }
            b.l.f.s[] r3 = r2.f5830b     // Catch:{ m -> 0x0029, h -> 0x0023 }
            b.l.f.w.d.a r4 = new b.l.f.w.d.a     // Catch:{ m -> 0x0021, h -> 0x001f }
            r4.<init>()     // Catch:{ m -> 0x0021, h -> 0x001f }
            b.l.f.y.e r2 = r4.a(r2)     // Catch:{ m -> 0x0021, h -> 0x001f }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002d
        L_0x001f:
            r2 = move-exception
            goto L_0x0025
        L_0x0021:
            r2 = move-exception
            goto L_0x002b
        L_0x0023:
            r2 = move-exception
            r3 = r1
        L_0x0025:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002d
        L_0x0029:
            r2 = move-exception
            r3 = r1
        L_0x002b:
            r4 = r3
            r3 = r1
        L_0x002d:
            if (r1 != 0) goto L_0x004a
            r1 = 1
            b.l.f.w.a r0 = r0.a(r1)     // Catch:{ m -> 0x0042, h -> 0x0040 }
            b.l.f.s[] r4 = r0.f5830b     // Catch:{ m -> 0x0042, h -> 0x0040 }
            b.l.f.w.d.a r1 = new b.l.f.w.d.a     // Catch:{ m -> 0x0042, h -> 0x0040 }
            r1.<init>()     // Catch:{ m -> 0x0042, h -> 0x0040 }
            b.l.f.y.e r1 = r1.a(r0)     // Catch:{ m -> 0x0042, h -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r11 = move-exception
            goto L_0x0043
        L_0x0042:
            r11 = move-exception
        L_0x0043:
            if (r2 != 0) goto L_0x0049
            if (r3 == 0) goto L_0x0048
            throw r3
        L_0x0048:
            throw r11
        L_0x0049:
            throw r2
        L_0x004a:
            r6 = r4
            if (r12 == 0) goto L_0x0062
            b.l.f.e r0 = b.l.f.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            b.l.f.t r12 = (b.l.f.t) r12
            if (r12 == 0) goto L_0x0062
            int r0 = r6.length
        L_0x0058:
            if (r11 >= r0) goto L_0x0062
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L_0x0058
        L_0x0062:
            b.l.f.q r11 = new b.l.f.q
            java.lang.String r3 = r1.c
            byte[] r4 = r1.a
            int r5 = r1.f5826b
            b.l.f.a r7 = b.l.f.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List<byte[]> r12 = r1.d
            if (r12 == 0) goto L_0x007d
            b.l.f.r r0 = b.l.f.r.BYTE_SEGMENTS
            r11.b(r0, r12)
        L_0x007d:
            java.lang.String r12 = r1.f5827e
            if (r12 == 0) goto L_0x0086
            b.l.f.r r0 = b.l.f.r.ERROR_CORRECTION_LEVEL
            r11.b(r0, r12)
        L_0x0086:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.w.b.a(b.l.f.c, java.util.Map):b.l.f.q");
    }

    public q b(c cVar) {
        return a(cVar, (Map<e, ?>) null);
    }

    public void c() {
    }
}
