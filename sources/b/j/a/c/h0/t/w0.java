package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.j0.z;
import b.j.a.c.y;
import b.j.a.c.z.a;

@a
public class w0 extends s0<z> {
    public w0() {
        super(z.class);
    }

    public /* bridge */ /* synthetic */ void f(Object obj, f fVar, y yVar) {
        q((z) obj, fVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        z zVar = (z) obj;
        b e2 = fVar2.e(fVar, fVar2.d(zVar, l.VALUE_EMBEDDED_OBJECT));
        q(zVar, fVar);
        fVar2.f(fVar, e2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(b.j.a.c.j0.z r8, b.j.a.b.f r9) {
        /*
            r7 = this;
            b.j.a.c.j0.z$b r0 = r8.f2262p
            boolean r8 = r8.f2260n
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0013
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r3 = r0.d
            if (r3 == 0) goto L_0x000e
            r3 = r1
            goto L_0x000f
        L_0x000e:
            r3 = r2
        L_0x000f:
            if (r3 == 0) goto L_0x0013
            r3 = r1
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            r4 = -1
        L_0x0015:
            int r4 = r4 + r1
            r5 = 16
            if (r4 < r5) goto L_0x002e
            b.j.a.c.j0.z$b r0 = r0.a
            if (r0 != 0) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            if (r8 == 0) goto L_0x002c
            java.util.TreeMap<java.lang.Integer, java.lang.Object> r3 = r0.d
            if (r3 == 0) goto L_0x0027
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            r4 = r2
        L_0x002e:
            b.j.a.b.l r5 = r0.k(r4)
            if (r5 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            if (r3 == 0) goto L_0x0049
            java.lang.Object r6 = b.j.a.c.j0.z.b.a(r0, r4)
            if (r6 == 0) goto L_0x0040
            r9.E0(r6)
        L_0x0040:
            java.lang.Object r6 = b.j.a.c.j0.z.b.b(r0, r4)
            if (r6 == 0) goto L_0x0049
            r9.T0(r6)
        L_0x0049:
            int r5 = r5.ordinal()
            switch(r5) {
                case 1: goto L_0x0168;
                case 2: goto L_0x0163;
                case 3: goto L_0x015e;
                case 4: goto L_0x0159;
                case 5: goto L_0x0143;
                case 6: goto L_0x010c;
                case 7: goto L_0x00f6;
                case 8: goto L_0x00b3;
                case 9: goto L_0x0060;
                case 10: goto L_0x005c;
                case 11: goto L_0x0058;
                case 12: goto L_0x008c;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Internal error: should never end up through this code path"
            r8.<init>(r9)
            throw r8
        L_0x0058:
            r9.o0(r2)
            goto L_0x0015
        L_0x005c:
            r9.o0(r1)
            goto L_0x0015
        L_0x0060:
            java.lang.Object[] r5 = r0.c
            r5 = r5[r4]
            boolean r6 = r5 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0072
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.v0(r5)
            goto L_0x0015
        L_0x0072:
            boolean r6 = r5 instanceof java.math.BigDecimal
            if (r6 == 0) goto L_0x007c
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            r9.A0(r5)
            goto L_0x0015
        L_0x007c:
            boolean r6 = r5 instanceof java.lang.Float
            if (r6 == 0) goto L_0x008a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r9.w0(r5)
            goto L_0x0015
        L_0x008a:
            if (r5 != 0) goto L_0x0090
        L_0x008c:
            r9.u0()
            goto L_0x0015
        L_0x0090:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x009b
            java.lang.String r5 = (java.lang.String) r5
            r9.z0(r5)
            goto L_0x0015
        L_0x009b:
            b.j.a.b.e r8 = new b.j.a.b.e
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            r0[r2] = r1
            java.lang.String r1 = "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0, r9)
            throw r8
        L_0x00b3:
            java.lang.Object[] r5 = r0.c
            r5 = r5[r4]
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x00c2
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x00f1
        L_0x00c2:
            boolean r6 = r5 instanceof java.math.BigInteger
            if (r6 == 0) goto L_0x00cd
            java.math.BigInteger r5 = (java.math.BigInteger) r5
            r9.B0(r5)
            goto L_0x0015
        L_0x00cd:
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L_0x00dc
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r9.y0(r5)
            goto L_0x0015
        L_0x00dc:
            boolean r6 = r5 instanceof java.lang.Short
            if (r6 == 0) goto L_0x00eb
            java.lang.Short r5 = (java.lang.Short) r5
            short r5 = r5.shortValue()
            r9.C0(r5)
            goto L_0x0015
        L_0x00eb:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x00f1:
            r9.x0(r5)
            goto L_0x0015
        L_0x00f6:
            java.lang.Object[] r5 = r0.c
            r5 = r5[r4]
            boolean r6 = r5 instanceof b.j.a.b.o
            if (r6 == 0) goto L_0x0105
            b.j.a.b.o r5 = (b.j.a.b.o) r5
            r9.P0(r5)
            goto L_0x0015
        L_0x0105:
            java.lang.String r5 = (java.lang.String) r5
            r9.Q0(r5)
            goto L_0x0015
        L_0x010c:
            java.lang.Object[] r5 = r0.c
            r5 = r5[r4]
            boolean r6 = r5 instanceof b.j.a.c.j0.v
            if (r6 == 0) goto L_0x0135
            b.j.a.c.j0.v r5 = (b.j.a.c.j0.v) r5
            java.lang.Object r5 = r5.f2238h
            boolean r6 = r5 instanceof b.j.a.c.m
            if (r6 == 0) goto L_0x0121
            r9.D0(r5)
            goto L_0x0015
        L_0x0121:
            boolean r6 = r5 instanceof b.j.a.b.o
            if (r6 == 0) goto L_0x012c
            b.j.a.b.o r5 = (b.j.a.b.o) r5
            r9.J0(r5)
            goto L_0x0015
        L_0x012c:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r9.K0(r5)
            goto L_0x0015
        L_0x0135:
            boolean r6 = r5 instanceof b.j.a.c.m
            if (r6 == 0) goto L_0x013e
            r9.D0(r5)
            goto L_0x0015
        L_0x013e:
            r9.p0(r5)
            goto L_0x0015
        L_0x0143:
            java.lang.Object[] r5 = r0.c
            r5 = r5[r4]
            boolean r6 = r5 instanceof b.j.a.b.o
            if (r6 == 0) goto L_0x0152
            b.j.a.b.o r5 = (b.j.a.b.o) r5
            r9.s0(r5)
            goto L_0x0015
        L_0x0152:
            java.lang.String r5 = (java.lang.String) r5
            r9.t0(r5)
            goto L_0x0015
        L_0x0159:
            r9.q0()
            goto L_0x0015
        L_0x015e:
            r9.L0()
            goto L_0x0015
        L_0x0163:
            r9.r0()
            goto L_0x0015
        L_0x0168:
            r9.N0()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.w0.q(b.j.a.c.j0.z, b.j.a.b.f):void");
    }
}
