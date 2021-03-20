package b.l.b.a.c;

import java.io.Closeable;
import java.io.Flushable;

public abstract class d implements Closeable, Flushable {
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0128, code lost:
        if (r11 == null) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r11, java.lang.Object r12) {
        /*
            r10 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Class r0 = r12.getClass()
            boolean r1 = b.l.b.a.d.g.c(r12)
            if (r1 == 0) goto L_0x000f
            goto L_0x012a
        L_0x000f:
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L_0x001f
            java.lang.String r12 = (java.lang.String) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (b.l.b.a.c.j.b) r11
            b.j.a.b.f r11 = r11.f4767h
            r11.Q0(r12)
            goto L_0x01a7
        L_0x001f:
            boolean r1 = r12 instanceof java.lang.Number
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00c4
            if (r11 == 0) goto L_0x002d
            java.lang.String r11 = r12.toString()
            goto L_0x0134
        L_0x002d:
            boolean r11 = r12 instanceof java.math.BigDecimal
            if (r11 == 0) goto L_0x003d
            java.math.BigDecimal r12 = (java.math.BigDecimal) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (b.l.b.a.c.j.b) r11
            b.j.a.b.f r11 = r11.f4767h
            r11.A0(r12)
            goto L_0x01a7
        L_0x003d:
            boolean r11 = r12 instanceof java.math.BigInteger
            if (r11 == 0) goto L_0x004d
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            r11 = r10
            b.l.b.a.c.j.b r11 = (b.l.b.a.c.j.b) r11
            b.j.a.b.f r11 = r11.f4767h
            r11.B0(r12)
            goto L_0x01a7
        L_0x004d:
            boolean r11 = r12 instanceof java.lang.Long
            if (r11 == 0) goto L_0x0061
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            r0 = r10
            b.l.b.a.c.j.b r0 = (b.l.b.a.c.j.b) r0
            b.j.a.b.f r0 = r0.f4767h
            r0.y0(r11)
            goto L_0x01a7
        L_0x0061:
            boolean r11 = r12 instanceof java.lang.Float
            if (r11 == 0) goto L_0x0086
            java.lang.Number r12 = (java.lang.Number) r12
            float r11 = r12.floatValue()
            boolean r12 = java.lang.Float.isInfinite(r11)
            if (r12 != 0) goto L_0x0078
            boolean r12 = java.lang.Float.isNaN(r11)
            if (r12 != 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r2 = r3
        L_0x0079:
            b.l.a.c.b.a.q(r2)
            r12 = r10
            b.l.b.a.c.j.b r12 = (b.l.b.a.c.j.b) r12
            b.j.a.b.f r12 = r12.f4767h
            r12.w0(r11)
            goto L_0x01a7
        L_0x0086:
            boolean r11 = r12 instanceof java.lang.Integer
            if (r11 != 0) goto L_0x00b4
            boolean r11 = r12 instanceof java.lang.Short
            if (r11 != 0) goto L_0x00b4
            boolean r11 = r12 instanceof java.lang.Byte
            if (r11 == 0) goto L_0x0093
            goto L_0x00b4
        L_0x0093:
            java.lang.Number r12 = (java.lang.Number) r12
            double r11 = r12.doubleValue()
            boolean r0 = java.lang.Double.isInfinite(r11)
            if (r0 != 0) goto L_0x00a6
            boolean r0 = java.lang.Double.isNaN(r11)
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r2 = r3
        L_0x00a7:
            b.l.a.c.b.a.q(r2)
            r0 = r10
            b.l.b.a.c.j.b r0 = (b.l.b.a.c.j.b) r0
            b.j.a.b.f r0 = r0.f4767h
            r0.v0(r11)
            goto L_0x01a7
        L_0x00b4:
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r12.intValue()
            r12 = r10
            b.l.b.a.c.j.b r12 = (b.l.b.a.c.j.b) r12
            b.j.a.b.f r12 = r12.f4767h
            r12.x0(r11)
            goto L_0x01a7
        L_0x00c4:
            boolean r1 = r12 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x00d8
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            r12 = r10
            b.l.b.a.c.j.b r12 = (b.l.b.a.c.j.b) r12
            b.j.a.b.f r12 = r12.f4767h
            r12.o0(r11)
            goto L_0x01a7
        L_0x00d8:
            boolean r1 = r12 instanceof b.l.b.a.d.i
            if (r1 == 0) goto L_0x00e3
            b.l.b.a.d.i r12 = (b.l.b.a.d.i) r12
            java.lang.String r11 = r12.b()
            goto L_0x0134
        L_0x00e3:
            boolean r1 = r12 instanceof java.lang.Iterable
            if (r1 != 0) goto L_0x00ed
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x011a
        L_0x00ed:
            boolean r1 = r12 instanceof java.util.Map
            if (r1 != 0) goto L_0x011a
            boolean r1 = r12 instanceof b.l.b.a.d.k
            if (r1 != 0) goto L_0x011a
            r0 = r10
            b.l.b.a.c.j.b r0 = (b.l.b.a.c.j.b) r0
            b.j.a.b.f r1 = r0.f4767h
            r1.L0()
            java.lang.Iterable r12 = b.l.b.a.d.l.l(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0105:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0113
            java.lang.Object r1 = r12.next()
            r10.b(r11, r1)
            goto L_0x0105
        L_0x0113:
            b.j.a.b.f r11 = r0.f4767h
            r11.q0()
            goto L_0x01a7
        L_0x011a:
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L_0x013e
            java.lang.Enum r12 = (java.lang.Enum) r12
            b.l.b.a.d.j r11 = b.l.b.a.d.j.c(r12)
            java.lang.String r11 = r11.d
            if (r11 != 0) goto L_0x0134
        L_0x012a:
            r11 = r10
            b.l.b.a.c.j.b r11 = (b.l.b.a.c.j.b) r11
            b.j.a.b.f r11 = r11.f4767h
            r11.u0()
            goto L_0x01a7
        L_0x0134:
            r12 = r10
            b.l.b.a.c.j.b r12 = (b.l.b.a.c.j.b) r12
            b.j.a.b.f r12 = r12.f4767h
            r12.Q0(r11)
            goto L_0x01a7
        L_0x013e:
            r1 = r10
            b.l.b.a.c.j.b r1 = (b.l.b.a.c.j.b) r1
            b.j.a.b.f r4 = r1.f4767h
            r4.N0()
            boolean r4 = r12 instanceof java.util.Map
            if (r4 == 0) goto L_0x0150
            boolean r4 = r12 instanceof b.l.b.a.d.k
            if (r4 != 0) goto L_0x0150
            r4 = r2
            goto L_0x0151
        L_0x0150:
            r4 = r3
        L_0x0151:
            r5 = 0
            if (r4 == 0) goto L_0x0156
            r0 = r5
            goto L_0x015a
        L_0x0156:
            b.l.b.a.d.e r0 = b.l.b.a.d.e.b(r0)
        L_0x015a:
            java.util.Map r12 = b.l.b.a.d.g.e(r12)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0166:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x01a2
            java.lang.Object r6 = r12.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            if (r7 == 0) goto L_0x0166
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            if (r4 == 0) goto L_0x0182
            r8 = r11
            goto L_0x0199
        L_0x0182:
            b.l.b.a.d.j r8 = r0.a(r6)
            if (r8 != 0) goto L_0x018a
            r8 = r5
            goto L_0x018c
        L_0x018a:
            java.lang.reflect.Field r8 = r8.f4812b
        L_0x018c:
            if (r8 == 0) goto L_0x0198
            java.lang.Class<b.l.b.a.c.h> r9 = b.l.b.a.c.h.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r9)
            if (r8 == 0) goto L_0x0198
            r8 = r2
            goto L_0x0199
        L_0x0198:
            r8 = r3
        L_0x0199:
            b.j.a.b.f r9 = r1.f4767h
            r9.t0(r6)
            r10.b(r8, r7)
            goto L_0x0166
        L_0x01a2:
            b.j.a.b.f r11 = r1.f4767h
            r11.r0()
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.c.d.b(boolean, java.lang.Object):void");
    }
}
