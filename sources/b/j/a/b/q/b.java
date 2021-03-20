package b.j.a.b.q;

import b.e.a.a.a;
import b.j.a.b.g;
import b.j.a.b.h;
import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.b.s.f;
import b.j.a.b.t.d;
import b.j.a.b.w.c;
import b.j.a.b.w.k;
import b.j.a.b.w.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

public abstract class b extends c {
    public int A = 1;
    public int B;
    public d C;
    public l D;
    public final k E;
    public char[] F;
    public boolean G;
    public c H;
    public byte[] I;
    public int J = 0;
    public int K;
    public long L;
    public double M;
    public BigInteger N;
    public BigDecimal O;
    public boolean P;
    public int Q;
    public final b.j.a.b.s.b s;
    public boolean t;
    public int u;
    public int v;
    public long w;
    public int x = 1;
    public int y;
    public long z;

    public b(b.j.a.b.s.b bVar, int i2) {
        super(i2);
        boolean z2 = true;
        this.s = bVar;
        this.E = new k(bVar.d);
        this.C = new d((d) null, (i.a.STRICT_DUPLICATE_DETECTION.f1426i & i2) == 0 ? false : z2 ? new b.j.a.b.t.b(this) : null, 0, 1, 0);
    }

    public static int[] I1(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : Arrays.copyOf(iArr, iArr.length + i2);
    }

    public char A1(char c) {
        if (N0(i.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && N0(i.a.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder y2 = a.y("Unrecognized character escape ");
        y2.append(c.c1(c));
        throw new h(this, y2.toString());
    }

    public int B1() {
        if (this.f1459i != l.VALUE_NUMBER_INT || this.Q > 9) {
            C1(1);
            if ((this.J & 1) == 0) {
                H1();
            }
            return this.K;
        }
        int g2 = this.E.g(this.P);
        this.K = g2;
        this.J = 1;
        return g2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8 A[Catch:{ NumberFormatException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0 A[Catch:{ NumberFormatException -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1(int r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            b.j.a.b.l r2 = r1.f1459i
            b.j.a.b.l r3 = b.j.a.b.l.VALUE_NUMBER_INT
            r4 = 8
            java.lang.String r5 = ")"
            java.lang.String r6 = "Malformed numeric value ("
            r7 = 0
            if (r2 != r3) goto L_0x0115
            int r2 = r1.Q
            r3 = 9
            r8 = 1
            if (r2 > r3) goto L_0x0025
            b.j.a.b.w.k r0 = r1.E
            boolean r2 = r1.P
            int r0 = r0.g(r2)
            r1.K = r0
            r1.J = r8
            return
        L_0x0025:
            r3 = 18
            r9 = 2
            r10 = 0
            if (r2 > r3) goto L_0x0085
            b.j.a.b.w.k r0 = r1.E
            boolean r3 = r1.P
            int r4 = r0.c
            if (r4 < 0) goto L_0x0049
            char[] r5 = r0.f1577b
            if (r5 == 0) goto L_0x0049
            if (r3 == 0) goto L_0x0042
            int r4 = r4 + r8
            int r0 = r0.d
            int r0 = r0 - r8
            long r3 = b.j.a.b.s.f.g(r5, r4, r0)
            goto L_0x0054
        L_0x0042:
            int r0 = r0.d
            long r3 = b.j.a.b.s.f.g(r5, r4, r0)
            goto L_0x005e
        L_0x0049:
            if (r3 == 0) goto L_0x0056
            char[] r3 = r0.f1580h
            int r0 = r0.f1581i
            int r0 = r0 - r8
            long r3 = b.j.a.b.s.f.g(r3, r8, r0)
        L_0x0054:
            long r3 = -r3
            goto L_0x005e
        L_0x0056:
            char[] r3 = r0.f1580h
            int r0 = r0.f1581i
            long r3 = b.j.a.b.s.f.g(r3, r10, r0)
        L_0x005e:
            r0 = 10
            if (r2 != r0) goto L_0x0080
            boolean r0 = r1.P
            if (r0 == 0) goto L_0x0073
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            int r0 = (int) r3
            r1.K = r0
            r1.J = r8
            return
        L_0x0073:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0080
            int r0 = (int) r3
            r1.K = r0
            r1.J = r8
            return
        L_0x0080:
            r1.L = r3
            r1.J = r9
            return
        L_0x0085:
            b.j.a.b.w.k r2 = r1.E
            java.lang.String r2 = r2.h()
            int r3 = r1.Q     // Catch:{ NumberFormatException -> 0x00fc }
            b.j.a.b.w.k r11 = r1.E     // Catch:{ NumberFormatException -> 0x00fc }
            char[] r11 = r11.n()     // Catch:{ NumberFormatException -> 0x00fc }
            b.j.a.b.w.k r12 = r1.E     // Catch:{ NumberFormatException -> 0x00fc }
            int r12 = r12.o()     // Catch:{ NumberFormatException -> 0x00fc }
            boolean r13 = r1.P     // Catch:{ NumberFormatException -> 0x00fc }
            if (r13 == 0) goto L_0x009f
            int r12 = r12 + 1
        L_0x009f:
            if (r13 == 0) goto L_0x00a4
            java.lang.String r13 = b.j.a.b.s.f.a     // Catch:{ NumberFormatException -> 0x00fc }
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r13 = b.j.a.b.s.f.f1479b     // Catch:{ NumberFormatException -> 0x00fc }
        L_0x00a6:
            int r14 = r13.length()     // Catch:{ NumberFormatException -> 0x00fc }
            if (r3 >= r14) goto L_0x00ad
            goto L_0x00c5
        L_0x00ad:
            if (r3 <= r14) goto L_0x00b0
            goto L_0x00c6
        L_0x00b0:
            r3 = r10
        L_0x00b1:
            if (r3 >= r14) goto L_0x00c5
            int r15 = r12 + r3
            char r15 = r11[r15]     // Catch:{ NumberFormatException -> 0x00fc }
            char r16 = r13.charAt(r3)     // Catch:{ NumberFormatException -> 0x00fc }
            int r15 = r15 - r16
            if (r15 == 0) goto L_0x00c2
            if (r15 >= 0) goto L_0x00c6
            goto L_0x00c5
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00c5:
            r10 = r8
        L_0x00c6:
            if (r10 == 0) goto L_0x00d0
            long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x00fc }
            r1.L = r3     // Catch:{ NumberFormatException -> 0x00fc }
            r4 = r9
            goto L_0x00ed
        L_0x00d0:
            if (r0 == r8) goto L_0x00f0
            if (r0 != r9) goto L_0x00d5
            goto L_0x00f0
        L_0x00d5:
            if (r0 == r4) goto L_0x00e7
            r3 = 32
            if (r0 != r3) goto L_0x00dc
            goto L_0x00e7
        L_0x00dc:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x00fc }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x00fc }
            r1.N = r0     // Catch:{ NumberFormatException -> 0x00fc }
            r0 = 4
            r1.J = r0     // Catch:{ NumberFormatException -> 0x00fc }
            goto L_0x00ef
        L_0x00e7:
            double r7 = b.j.a.b.s.f.c(r2)     // Catch:{ NumberFormatException -> 0x00fc }
            r1.M = r7     // Catch:{ NumberFormatException -> 0x00fc }
        L_0x00ed:
            r1.J = r4     // Catch:{ NumberFormatException -> 0x00fc }
        L_0x00ef:
            return
        L_0x00f0:
            if (r0 != r8) goto L_0x00f8
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_NUMBER_INT     // Catch:{ NumberFormatException -> 0x00fc }
            r1.o1(r2, r0)     // Catch:{ NumberFormatException -> 0x00fc }
            throw r7
        L_0x00f8:
            r1.q1(r2)     // Catch:{ NumberFormatException -> 0x00fc }
            throw r7
        L_0x00fc:
            r0 = move-exception
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r6)
            java.lang.String r2 = r1.f1(r2)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            b.j.a.b.h r3 = new b.j.a.b.h
            r3.<init>(r1, r2, r0)
            throw r3
        L_0x0115:
            b.j.a.b.l r3 = b.j.a.b.l.VALUE_NUMBER_FLOAT
            if (r2 != r3) goto L_0x0156
            r2 = 16
            if (r0 != r2) goto L_0x0128
            b.j.a.b.w.k r0 = r1.E     // Catch:{ NumberFormatException -> 0x0137 }
            java.math.BigDecimal r0 = r0.f()     // Catch:{ NumberFormatException -> 0x0137 }
            r1.O = r0     // Catch:{ NumberFormatException -> 0x0137 }
            r1.J = r2     // Catch:{ NumberFormatException -> 0x0137 }
            goto L_0x0136
        L_0x0128:
            b.j.a.b.w.k r0 = r1.E     // Catch:{ NumberFormatException -> 0x0137 }
            java.lang.String r0 = r0.h()     // Catch:{ NumberFormatException -> 0x0137 }
            double r2 = b.j.a.b.s.f.c(r0)     // Catch:{ NumberFormatException -> 0x0137 }
            r1.M = r2     // Catch:{ NumberFormatException -> 0x0137 }
            r1.J = r4     // Catch:{ NumberFormatException -> 0x0137 }
        L_0x0136:
            return
        L_0x0137:
            r0 = move-exception
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            b.j.a.b.w.k r3 = r1.E
            java.lang.String r3 = r3.h()
            java.lang.String r3 = r1.f1(r3)
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            b.j.a.b.h r3 = new b.j.a.b.h
            r3.<init>(r1, r2, r0)
            throw r3
        L_0x0156:
            java.lang.String r0 = "Current token (%s) not numeric, can not use numeric value accessors"
            r1.g1(r0, r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.q.b.C1(int):void");
    }

    public void D1() {
        this.E.p();
        char[] cArr = this.F;
        if (cArr != null) {
            this.F = null;
            b.j.a.b.s.b bVar = this.s;
            Objects.requireNonNull(bVar);
            bVar.c(cArr, bVar.f1472j);
            bVar.f1472j = null;
            bVar.d.f1548b.set(3, cArr);
        }
    }

    public void E1(int i2, char c) {
        d dVar = this.C;
        throw new h(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i2), Character.valueOf(c), dVar.h(), new g(y1(), -1, dVar.f1509h, dVar.f1510i)}));
    }

    public void F1(int i2, String str) {
        if (!N0(i.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            StringBuilder y2 = a.y("Illegal unquoted character (");
            y2.append(c.c1((char) i2));
            y2.append("): has to be escaped using backslash to be included in ");
            y2.append(str);
            throw new h(this, y2.toString());
        }
    }

    public String G1() {
        return N0(i.a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public BigInteger H() {
        BigInteger bigInteger;
        BigDecimal bigDecimal;
        long j2;
        int i2 = this.J;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                C1(4);
            }
            int i3 = this.J;
            if ((i3 & 4) == 0) {
                if ((i3 & 16) != 0) {
                    bigDecimal = this.O;
                } else {
                    if ((i3 & 2) != 0) {
                        j2 = this.L;
                    } else if ((i3 & 1) != 0) {
                        j2 = (long) this.K;
                    } else if ((i3 & 8) != 0) {
                        bigDecimal = BigDecimal.valueOf(this.M);
                    } else {
                        m.a();
                        throw null;
                    }
                    bigInteger = BigInteger.valueOf(j2);
                    this.N = bigInteger;
                    this.J |= 4;
                }
                bigInteger = bigDecimal.toBigInteger();
                this.N = bigInteger;
                this.J |= 4;
            }
        }
        return this.N;
    }

    public void H1() {
        int intValue;
        int i2 = this.J;
        if ((i2 & 2) != 0) {
            long j2 = this.L;
            int i3 = (int) j2;
            if (((long) i3) == j2) {
                this.K = i3;
            } else {
                o1(x0(), this.f1459i);
                throw null;
            }
        } else {
            if ((i2 & 4) != 0) {
                if (c.f1452k.compareTo(this.N) > 0 || c.f1453l.compareTo(this.N) < 0) {
                    n1();
                    throw null;
                }
                intValue = this.N.intValue();
            } else if ((i2 & 8) != 0) {
                double d = this.M;
                if (d < -2.147483648E9d || d > 2.147483647E9d) {
                    n1();
                    throw null;
                }
                intValue = (int) d;
            } else if ((i2 & 16) == 0) {
                m.a();
                throw null;
            } else if (c.f1458q.compareTo(this.O) > 0 || c.r.compareTo(this.O) < 0) {
                n1();
                throw null;
            } else {
                intValue = this.O.intValue();
            }
            this.K = intValue;
        }
        this.J |= 1;
    }

    public IllegalArgumentException J1(b.j.a.b.a aVar, int i2, int i3, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        boolean z2 = false;
        if (i2 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i2), Integer.valueOf(i3 + 1)});
        } else {
            if (i2 == aVar.f1370m) {
                z2 = true;
            }
            if (z2) {
                StringBuilder y2 = a.y("Unexpected padding character ('");
                y2.append(aVar.f1370m);
                y2.append("') as character #");
                y2.append(i3 + 1);
                y2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
                str2 = y2.toString();
            } else {
                if (!Character.isDefined(i2) || Character.isISOControl(i2)) {
                    sb = new StringBuilder();
                    str3 = "Illegal character (code 0x";
                } else {
                    sb = a.y("Illegal character '");
                    sb.append((char) i2);
                    str3 = "' (code 0x";
                }
                sb.append(str3);
                sb.append(Integer.toHexString(i2));
                sb.append(") in base64 content");
                str2 = sb.toString();
            }
        }
        if (str != null) {
            str2 = a.n(str2, ": ", str);
        }
        return new IllegalArgumentException(str2);
    }

    public boolean K0() {
        l lVar = this.f1459i;
        if (lVar == l.VALUE_STRING) {
            return true;
        }
        if (lVar == l.FIELD_NAME) {
            return this.G;
        }
        return false;
    }

    public final l K1(String str, double d) {
        k kVar = this.E;
        kVar.f1577b = null;
        kVar.c = -1;
        kVar.d = 0;
        kVar.f1582j = str;
        kVar.f1583k = null;
        if (kVar.f) {
            kVar.d();
        }
        kVar.f1581i = 0;
        this.M = d;
        this.J = 8;
        return l.VALUE_NUMBER_FLOAT;
    }

    public final l L1(boolean z2, int i2) {
        this.P = z2;
        this.Q = i2;
        this.J = 0;
        return l.VALUE_NUMBER_INT;
    }

    public boolean Q0() {
        if (this.f1459i != l.VALUE_NUMBER_FLOAT || (this.J & 8) == 0) {
            return false;
        }
        double d = this.M;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    public i V0(int i2, int i3) {
        int i4 = this.f1416h;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this.f1416h = i5;
            s1(i5, i6);
        }
        return this;
    }

    public void Y0(Object obj) {
        this.C.f1508g = obj;
    }

    @Deprecated
    public i Z0(int i2) {
        int i3 = this.f1416h ^ i2;
        if (i3 != 0) {
            this.f1416h = i2;
            s1(i2, i3);
        }
        return this;
    }

    public void close() {
        if (!this.t) {
            this.u = Math.max(this.u, this.v);
            this.t = true;
            try {
                t1();
            } finally {
                D1();
            }
        }
    }

    public void d1() {
        if (!this.C.f()) {
            String str = this.C.d() ? "Array" : "Object";
            d dVar = this.C;
            j1(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, new g(y1(), -1, dVar.f1509h, dVar.f1510i)}), (l) null);
            throw null;
        }
    }

    public String e0() {
        d dVar;
        l lVar = this.f1459i;
        if ((lVar == l.START_OBJECT || lVar == l.START_ARRAY) && (dVar = this.C.c) != null) {
            return dVar.f;
        }
        return this.C.f;
    }

    public BigDecimal m0() {
        BigDecimal bigDecimal;
        long j2;
        int i2 = this.J;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                C1(16);
            }
            int i3 = this.J;
            if ((i3 & 16) == 0) {
                if ((i3 & 8) != 0) {
                    String x0 = x0();
                    String str = f.a;
                    try {
                        this.O = new BigDecimal(x0);
                    } catch (NumberFormatException unused) {
                        throw f.a(x0);
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        bigDecimal = new BigDecimal(this.N);
                    } else {
                        if ((i3 & 2) != 0) {
                            j2 = this.L;
                        } else if ((i3 & 1) != 0) {
                            j2 = (long) this.K;
                        } else {
                            m.a();
                            throw null;
                        }
                        bigDecimal = BigDecimal.valueOf(j2);
                    }
                    this.O = bigDecimal;
                }
                this.J |= 16;
            }
        }
        return this.O;
    }

    public double n0() {
        double d;
        int i2 = this.J;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                C1(8);
            }
            int i3 = this.J;
            if ((i3 & 8) == 0) {
                if ((i3 & 16) != 0) {
                    d = this.O.doubleValue();
                } else if ((i3 & 4) != 0) {
                    d = this.N.doubleValue();
                } else if ((i3 & 2) != 0) {
                    d = (double) this.L;
                } else if ((i3 & 1) != 0) {
                    d = (double) this.K;
                } else {
                    m.a();
                    throw null;
                }
                this.M = d;
                this.J |= 8;
            }
        }
        return this.M;
    }

    public float p0() {
        return (float) n0();
    }

    public int q0() {
        int i2 = this.J;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return B1();
            }
            if ((i2 & 1) == 0) {
                H1();
            }
        }
        return this.K;
    }

    public long r0() {
        long j2;
        int i2 = this.J;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                C1(2);
            }
            int i3 = this.J;
            if ((i3 & 2) == 0) {
                if ((i3 & 1) != 0) {
                    j2 = (long) this.K;
                } else if ((i3 & 4) != 0) {
                    if (c.f1454m.compareTo(this.N) > 0 || c.f1455n.compareTo(this.N) < 0) {
                        p1();
                        throw null;
                    }
                    j2 = this.N.longValue();
                } else if ((i3 & 8) != 0) {
                    double d = this.M;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        p1();
                        throw null;
                    }
                    j2 = (long) d;
                } else if ((i3 & 16) == 0) {
                    m.a();
                    throw null;
                } else if (c.f1456o.compareTo(this.O) > 0 || c.f1457p.compareTo(this.O) < 0) {
                    p1();
                    throw null;
                } else {
                    j2 = this.O.longValue();
                }
                this.L = j2;
                this.J |= 2;
            }
        }
        return this.L;
    }

    public i.b s0() {
        if (this.J == 0) {
            C1(0);
        }
        if (this.f1459i != l.VALUE_NUMBER_INT) {
            return (this.J & 16) != 0 ? i.b.BIG_DECIMAL : i.b.DOUBLE;
        }
        int i2 = this.J;
        return (i2 & 1) != 0 ? i.b.INT : (i2 & 2) != 0 ? i.b.LONG : i.b.BIG_INTEGER;
    }

    public void s1(int i2, int i3) {
        int i4 = i.a.STRICT_DUPLICATE_DETECTION.f1426i;
        if ((i3 & i4) != 0 && (i2 & i4) != 0) {
            d dVar = this.C;
            dVar.d = dVar.d == null ? new b.j.a.b.t.b(this) : null;
            this.C = dVar;
        }
    }

    public Number t0() {
        if (this.J == 0) {
            C1(0);
        }
        if (this.f1459i == l.VALUE_NUMBER_INT) {
            int i2 = this.J;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this.K);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this.L);
            }
            return (i2 & 4) != 0 ? this.N : this.O;
        }
        int i3 = this.J;
        if ((i3 & 16) != 0) {
            return this.O;
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.M);
        }
        m.a();
        throw null;
    }

    public abstract void t1();

    public final int u1(b.j.a.b.a aVar, char c, int i2) {
        if (c == '\\') {
            char w1 = w1();
            if (w1 <= ' ' && i2 == 0) {
                return -1;
            }
            int d = aVar.d(w1);
            if (d >= 0 || (d == -2 && i2 >= 2)) {
                return d;
            }
            throw J1(aVar, w1, i2, (String) null);
        }
        throw J1(aVar, c, i2, (String) null);
    }

    public b.j.a.b.k v0() {
        return this.C;
    }

    public final int v1(b.j.a.b.a aVar, int i2, int i3) {
        if (i2 == 92) {
            char w1 = w1();
            if (w1 <= ' ' && i3 == 0) {
                return -1;
            }
            int e2 = aVar.e(w1);
            if (e2 >= 0 || e2 == -2) {
                return e2;
            }
            throw J1(aVar, w1, i3, (String) null);
        }
        throw J1(aVar, i2, i3, (String) null);
    }

    public abstract char w1();

    public c x1() {
        c cVar = this.H;
        if (cVar == null) {
            this.H = new c((b.j.a.b.w.a) null, 500);
        } else {
            cVar.H();
        }
        return this.H;
    }

    public Object y1() {
        if (i.a.INCLUDE_SOURCE_IN_LOCATION.d(this.f1416h)) {
            return this.s.a;
        }
        return null;
    }

    public void z1(b.j.a.b.a aVar) {
        throw new h(this, aVar.k());
    }
}
