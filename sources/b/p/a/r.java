package b.p.a;

import b.e.a.a.a;
import b.p.a.q;
import java.io.EOFException;
import java.util.Objects;
import o.e;
import o.g;
import o.h;

public final class r extends q {
    public static final h r = h.j("'\\");
    public static final h s = h.j("\"\\");
    public static final h t = h.j("{}[]:, \n\t\r\f/\\;#=");
    public static final h u = h.j("\n\r");
    public static final h v = h.j("*/");

    /* renamed from: l  reason: collision with root package name */
    public final g f6399l;

    /* renamed from: m  reason: collision with root package name */
    public final e f6400m;

    /* renamed from: n  reason: collision with root package name */
    public int f6401n = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f6402o;

    /* renamed from: p  reason: collision with root package name */
    public int f6403p;

    /* renamed from: q  reason: collision with root package name */
    public String f6404q;

    public r(g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.f6399l = gVar;
        this.f6400m = gVar.d();
        k0(6);
    }

    public final void A0(h hVar) {
        while (true) {
            long P = this.f6399l.P(hVar);
            if (P == -1) {
                p0("Unterminated string");
                throw null;
            } else if (this.f6400m.N(P) == 92) {
                this.f6400m.skip(P + 1);
                z0();
            } else {
                this.f6400m.skip(P + 1);
                return;
            }
        }
    }

    public final void B0() {
        long P = this.f6399l.P(t);
        e eVar = this.f6400m;
        if (P == -1) {
            P = eVar.f10453i;
        }
        eVar.skip(P);
    }

    public boolean N() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double O() {
        /*
            r8 = this;
            int r0 = r8.f6401n
            if (r0 != 0) goto L_0x0008
            int r0 = r8.r0()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.f6401n = r2
            int[] r0 = r8.f6387k
            int r1 = r8.f6384h
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.f6402o
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0033
            o.e r0 = r8.f6400m
            int r1 = r8.f6403p
            long r6 = (long) r1
            java.lang.String r0 = r0.n0(r6)
            goto L_0x004d
        L_0x0033:
            r1 = 9
            if (r0 != r1) goto L_0x003a
            o.h r0 = s
            goto L_0x0040
        L_0x003a:
            r1 = 8
            if (r0 != r1) goto L_0x0045
            o.h r0 = r
        L_0x0040:
            java.lang.String r0 = r8.x0(r0)
            goto L_0x004d
        L_0x0045:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.y0()
        L_0x004d:
            r8.f6404q = r0
            goto L_0x0052
        L_0x0050:
            if (r0 != r4) goto L_0x00b6
        L_0x0052:
            r8.f6401n = r4
            java.lang.String r0 = r8.f6404q     // Catch:{ NumberFormatException -> 0x0099 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x0078
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x0078
            r3 = 0
            r8.f6404q = r3
            r8.f6401n = r2
            int[] r2 = r8.f6387k
            int r3 = r8.f6384h
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x0078:
            b.p.a.o r2 = new b.p.a.o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.H()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0099:
            b.p.a.n r0 = new b.p.a.n
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r3)
            java.lang.String r2 = r8.f6404q
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.H()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            b.p.a.n r0 = new b.p.a.n
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r3)
            b.p.a.q$b r2 = r8.g0()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.H()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.a.r.O():double");
    }

    public int S() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 16) {
            long j2 = this.f6402o;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f6401n = 0;
                int[] iArr = this.f6387k;
                int i4 = this.f6384h - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder y = a.y("Expected an int but was ");
            y.append(this.f6402o);
            y.append(" at path ");
            y.append(H());
            throw new n(y.toString());
        }
        if (i2 == 17) {
            this.f6404q = this.f6400m.n0((long) this.f6403p);
        } else if (i2 == 9 || i2 == 8) {
            String x0 = x0(i2 == 9 ? s : r);
            this.f6404q = x0;
            try {
                int parseInt = Integer.parseInt(x0);
                this.f6401n = 0;
                int[] iArr2 = this.f6387k;
                int i5 = this.f6384h - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            StringBuilder y2 = a.y("Expected an int but was ");
            y2.append(g0());
            y2.append(" at path ");
            y2.append(H());
            throw new n(y2.toString());
        }
        this.f6401n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6404q);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.f6404q = null;
                this.f6401n = 0;
                int[] iArr3 = this.f6387k;
                int i7 = this.f6384h - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            StringBuilder y3 = a.y("Expected an int but was ");
            y3.append(this.f6404q);
            y3.append(" at path ");
            y3.append(H());
            throw new n(y3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder y4 = a.y("Expected an int but was ");
            y4.append(this.f6404q);
            y4.append(" at path ");
            y4.append(H());
            throw new n(y4.toString());
        }
    }

    public <T> T Y() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 7) {
            this.f6401n = 0;
            int[] iArr = this.f6387k;
            int i3 = this.f6384h - 1;
            iArr[i3] = iArr[i3] + 1;
            return null;
        }
        StringBuilder y = a.y("Expected null but was ");
        y.append(g0());
        y.append(" at path ");
        y.append(H());
        throw new n(y.toString());
    }

    public void b() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 3) {
            k0(1);
            this.f6387k[this.f6384h - 1] = 0;
            this.f6401n = 0;
            return;
        }
        StringBuilder y = a.y("Expected BEGIN_ARRAY but was ");
        y.append(g0());
        y.append(" at path ");
        y.append(H());
        throw new n(y.toString());
    }

    public void close() {
        this.f6401n = 0;
        this.f6385i[0] = 8;
        this.f6384h = 1;
        e eVar = this.f6400m;
        eVar.skip(eVar.f10453i);
        this.f6399l.close();
    }

    public void e() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 1) {
            k0(3);
            this.f6401n = 0;
            return;
        }
        StringBuilder y = a.y("Expected BEGIN_OBJECT but was ");
        y.append(g0());
        y.append(" at path ");
        y.append(H());
        throw new n(y.toString());
    }

    public String e0() {
        String str;
        h hVar;
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 10) {
            str = y0();
        } else {
            if (i2 == 9) {
                hVar = s;
            } else if (i2 == 8) {
                hVar = r;
            } else if (i2 == 11) {
                str = this.f6404q;
                this.f6404q = null;
            } else if (i2 == 16) {
                str = Long.toString(this.f6402o);
            } else if (i2 == 17) {
                str = this.f6400m.n0((long) this.f6403p);
            } else {
                StringBuilder y = a.y("Expected a string but was ");
                y.append(g0());
                y.append(" at path ");
                y.append(H());
                throw new n(y.toString());
            }
            str = x0(hVar);
        }
        this.f6401n = 0;
        int[] iArr = this.f6387k;
        int i3 = this.f6384h - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public q.b g0() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        switch (i2) {
            case 1:
                return q.b.BEGIN_OBJECT;
            case 2:
                return q.b.END_OBJECT;
            case 3:
                return q.b.BEGIN_ARRAY;
            case 4:
                return q.b.END_ARRAY;
            case 5:
            case 6:
                return q.b.BOOLEAN;
            case 7:
                return q.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return q.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return q.b.NAME;
            case 16:
            case 17:
                return q.b.NUMBER;
            case 18:
                return q.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int m0(q.a aVar) {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return s0(this.f6404q, aVar);
        }
        int l0 = this.f6399l.l0(aVar.f6388b);
        if (l0 != -1) {
            this.f6401n = 0;
            this.f6386j[this.f6384h - 1] = aVar.a[l0];
            return l0;
        }
        String str = this.f6386j[this.f6384h - 1];
        String v0 = v0();
        int s0 = s0(v0, aVar);
        if (s0 == -1) {
            this.f6401n = 15;
            this.f6404q = v0;
            this.f6386j[this.f6384h - 1] = str;
        }
        return s0;
    }

    public void n0() {
        h hVar;
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 14) {
            B0();
        } else {
            if (i2 == 13) {
                hVar = s;
            } else if (i2 == 12) {
                hVar = r;
            } else if (i2 != 15) {
                StringBuilder y = a.y("Expected a name but was ");
                y.append(g0());
                y.append(" at path ");
                y.append(H());
                throw new n(y.toString());
            }
            A0(hVar);
        }
        this.f6401n = 0;
        this.f6386j[this.f6384h - 1] = "null";
    }

    public void o0() {
        h hVar;
        int i2 = 0;
        do {
            int i3 = this.f6401n;
            if (i3 == 0) {
                i3 = r0();
            }
            if (i3 == 3) {
                k0(1);
            } else if (i3 == 1) {
                k0(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder y = a.y("Expected a value but was ");
                        y.append(g0());
                        y.append(" at path ");
                        y.append(H());
                        throw new n(y.toString());
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder y2 = a.y("Expected a value but was ");
                        y2.append(g0());
                        y2.append(" at path ");
                        y2.append(H());
                        throw new n(y2.toString());
                    }
                } else if (i3 == 14 || i3 == 10) {
                    B0();
                    this.f6401n = 0;
                } else {
                    if (i3 == 9 || i3 == 13) {
                        hVar = s;
                    } else if (i3 == 8 || i3 == 12) {
                        hVar = r;
                    } else {
                        if (i3 == 17) {
                            this.f6400m.skip((long) this.f6403p);
                        } else if (i3 == 18) {
                            StringBuilder y3 = a.y("Expected a value but was ");
                            y3.append(g0());
                            y3.append(" at path ");
                            y3.append(H());
                            throw new n(y3.toString());
                        }
                        this.f6401n = 0;
                    }
                    A0(hVar);
                    this.f6401n = 0;
                }
                this.f6384h--;
                this.f6401n = 0;
            }
            i2++;
            this.f6401n = 0;
        } while (i2 != 0);
        int[] iArr = this.f6387k;
        int i4 = this.f6384h;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f6386j[i4 - 1] = "null";
    }

    public void q() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 4) {
            int i3 = this.f6384h - 1;
            this.f6384h = i3;
            int[] iArr = this.f6387k;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6401n = 0;
            return;
        }
        StringBuilder y = a.y("Expected END_ARRAY but was ");
        y.append(g0());
        y.append(" at path ");
        y.append(H());
        throw new n(y.toString());
    }

    public final void q0() {
        p0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01af, code lost:
        if (u0(r2) != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b1, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b2, code lost:
        if (r4 != r2) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b4, code lost:
        if (r7 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ba, code lost:
        if (r8 != Long.MIN_VALUE) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bc, code lost:
        if (r10 == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c2, code lost:
        if (r8 != 0) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c4, code lost:
        if (r10 != false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c6, code lost:
        if (r10 == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01c9, code lost:
        r8 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ca, code lost:
        r0.f6402o = r8;
        r0.f6400m.skip((long) r1);
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d5, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d6, code lost:
        if (r4 == r2) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d8, code lost:
        if (r4 == 4) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01db, code lost:
        if (r4 != 7) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01dd, code lost:
        r0.f6403p = r1;
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e1, code lost:
        r15 = r1;
        r0.f6401n = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r0() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f6385i
            int r2 = r0.f6384h
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 9
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 3
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 2
            r15 = 0
            r5 = 4
            r16 = 0
            r6 = 1
            if (r3 != r6) goto L_0x0022
            int r2 = r2 - r6
            r1[r2] = r14
            goto L_0x0084
        L_0x0022:
            if (r3 != r14) goto L_0x0040
            int r1 = r0.w0(r6)
            o.e r2 = r0.f6400m
            r2.readByte()
            if (r1 == r9) goto L_0x0084
            if (r1 == r8) goto L_0x003c
            if (r1 != r7) goto L_0x0036
            r0.f6401n = r5
            return r5
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            r0.p0(r1)
            throw r16
        L_0x003c:
            r17.q0()
            throw r16
        L_0x0040:
            if (r3 == r10) goto L_0x026a
            if (r3 != r13) goto L_0x0046
            goto L_0x026a
        L_0x0046:
            if (r3 != r5) goto L_0x0066
            int r2 = r2 - r6
            r1[r2] = r13
            int r1 = r0.w0(r6)
            o.e r2 = r0.f6400m
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x0084
            r2 = 61
            if (r1 == r2) goto L_0x0062
            java.lang.String r1 = "Expected ':'"
            r0.p0(r1)
            throw r16
        L_0x0062:
            r17.q0()
            throw r16
        L_0x0066:
            if (r3 != r12) goto L_0x006c
            int r2 = r2 - r6
            r1[r2] = r11
            goto L_0x0084
        L_0x006c:
            if (r3 != r11) goto L_0x007e
            int r1 = r0.w0(r15)
            r2 = -1
            if (r1 != r2) goto L_0x007a
            r1 = 18
        L_0x0077:
            r0.f6401n = r1
            return r1
        L_0x007a:
            r17.q0()
            throw r16
        L_0x007e:
            if (r3 == r4) goto L_0x0269
            r1 = 8
            if (r3 == r1) goto L_0x0261
        L_0x0084:
            int r1 = r0.w0(r6)
            r2 = 34
            if (r1 == r2) goto L_0x0259
            r2 = 39
            if (r1 == r2) goto L_0x0255
            if (r1 == r9) goto L_0x0245
            if (r1 == r8) goto L_0x0245
            r2 = 91
            if (r1 == r2) goto L_0x023d
            if (r1 == r7) goto L_0x0233
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x022b
            o.e r1 = r0.f6400m
            r2 = 0
            byte r1 = r1.N(r2)
            r4 = 116(0x74, float:1.63E-43)
            if (r1 == r4) goto L_0x00d0
            r4 = 84
            if (r1 != r4) goto L_0x00af
            goto L_0x00d0
        L_0x00af:
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L_0x00ca
            r4 = 70
            if (r1 != r4) goto L_0x00b8
            goto L_0x00ca
        L_0x00b8:
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L_0x00c4
            r4 = 78
            if (r1 != r4) goto L_0x00c1
            goto L_0x00c4
        L_0x00c1:
            r7 = r15
            goto L_0x0126
        L_0x00c4:
            java.lang.String r1 = "null"
            java.lang.String r4 = "NULL"
            r7 = r11
            goto L_0x00d5
        L_0x00ca:
            java.lang.String r1 = "false"
            java.lang.String r4 = "FALSE"
            r7 = r12
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r1 = "true"
            java.lang.String r4 = "TRUE"
            r7 = r13
        L_0x00d5:
            int r8 = r1.length()
            r9 = r6
        L_0x00da:
            if (r9 >= r8) goto L_0x0105
            o.g r15 = r0.f6399l
            int r11 = r9 + 1
            long r12 = (long) r11
            boolean r12 = r15.t(r12)
            if (r12 != 0) goto L_0x00e9
        L_0x00e7:
            r7 = 0
            goto L_0x0126
        L_0x00e9:
            o.e r12 = r0.f6400m
            r15 = r11
            long r10 = (long) r9
            byte r10 = r12.N(r10)
            char r11 = r1.charAt(r9)
            if (r10 == r11) goto L_0x00fe
            char r9 = r4.charAt(r9)
            if (r10 == r9) goto L_0x00fe
            goto L_0x00e7
        L_0x00fe:
            r9 = r15
            r10 = 3
            r11 = 7
            r12 = 6
            r13 = 5
            r15 = 0
            goto L_0x00da
        L_0x0105:
            o.g r1 = r0.f6399l
            int r4 = r8 + 1
            long r9 = (long) r4
            boolean r1 = r1.t(r9)
            if (r1 == 0) goto L_0x011e
            o.e r1 = r0.f6400m
            long r9 = (long) r8
            byte r1 = r1.N(r9)
            boolean r1 = r0.u0(r1)
            if (r1 == 0) goto L_0x011e
            goto L_0x00e7
        L_0x011e:
            o.e r1 = r0.f6400m
            long r8 = (long) r8
            r1.skip(r8)
            r0.f6401n = r7
        L_0x0126:
            if (r7 == 0) goto L_0x0129
            return r7
        L_0x0129:
            r8 = r2
            r7 = r6
            r1 = 0
            r4 = 0
            r10 = 0
        L_0x012e:
            o.g r11 = r0.f6399l
            int r12 = r1 + 1
            long r2 = (long) r12
            boolean r2 = r11.t(r2)
            if (r2 != 0) goto L_0x013c
            r2 = r14
            goto L_0x01b2
        L_0x013c:
            o.e r2 = r0.f6400m
            long r13 = (long) r1
            byte r2 = r2.N(r13)
            r13 = 43
            if (r2 == r13) goto L_0x0202
            r13 = 69
            if (r2 == r13) goto L_0x01f8
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto L_0x01f8
            r13 = 45
            if (r2 == r13) goto L_0x01ec
            r13 = 46
            if (r2 == r13) goto L_0x01e5
            r13 = 48
            if (r2 < r13) goto L_0x01ab
            r13 = 57
            if (r2 <= r13) goto L_0x0160
            goto L_0x01ab
        L_0x0160:
            if (r4 == r6) goto L_0x01a1
            if (r4 != 0) goto L_0x0165
            goto L_0x01a1
        L_0x0165:
            r1 = 2
            if (r4 != r1) goto L_0x018f
            r13 = 0
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0170
            goto L_0x020f
        L_0x0170:
            r13 = 10
            long r13 = r13 * r8
            int r2 = r2 + -48
            long r1 = (long) r2
            long r13 = r13 - r1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0189
            if (r1 != 0) goto L_0x0187
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r1 = 0
            goto L_0x018a
        L_0x0189:
            r1 = r6
        L_0x018a:
            r1 = r1 & r7
            r7 = r1
            r8 = r13
            r3 = 6
            goto L_0x01a8
        L_0x018f:
            r1 = 3
            if (r4 != r1) goto L_0x0197
            r4 = r5
            r2 = 7
            r3 = 6
            goto L_0x0209
        L_0x0197:
            r1 = 5
            r3 = 6
            if (r4 == r1) goto L_0x019d
            if (r4 != r3) goto L_0x01a8
        L_0x019d:
            r2 = 7
            r4 = 7
            goto L_0x0209
        L_0x01a1:
            r3 = 6
            int r2 = r2 + -48
            int r1 = -r2
            long r1 = (long) r1
            r8 = r1
            r4 = 2
        L_0x01a8:
            r2 = 7
            goto L_0x0209
        L_0x01ab:
            boolean r2 = r0.u0(r2)
            if (r2 != 0) goto L_0x020f
            r2 = 2
        L_0x01b2:
            if (r4 != r2) goto L_0x01d6
            if (r7 == 0) goto L_0x01d5
            r2 = -9223372036854775808
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x01be
            if (r10 == 0) goto L_0x01d5
        L_0x01be:
            r2 = 0
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x01c6
            if (r10 != 0) goto L_0x01d5
        L_0x01c6:
            if (r10 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            long r8 = -r8
        L_0x01ca:
            r0.f6402o = r8
            o.e r2 = r0.f6400m
            long r3 = (long) r1
            r2.skip(r3)
            r1 = 16
            goto L_0x01e1
        L_0x01d5:
            r2 = 2
        L_0x01d6:
            if (r4 == r2) goto L_0x01dd
            if (r4 == r5) goto L_0x01dd
            r2 = 7
            if (r4 != r2) goto L_0x020f
        L_0x01dd:
            r0.f6403p = r1
            r1 = 17
        L_0x01e1:
            r15 = r1
            r0.f6401n = r15
            goto L_0x0210
        L_0x01e5:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r4 != r1) goto L_0x020f
            r1 = 3
            goto L_0x0208
        L_0x01ec:
            r1 = 2
            r2 = 7
            r3 = 6
            if (r4 != 0) goto L_0x01f4
            r4 = r6
            r10 = r4
            goto L_0x0209
        L_0x01f4:
            r14 = 5
            if (r4 != r14) goto L_0x020f
            goto L_0x0207
        L_0x01f8:
            r1 = 2
            r2 = 7
            r3 = 6
            r14 = 5
            if (r4 == r1) goto L_0x0200
            if (r4 != r5) goto L_0x020f
        L_0x0200:
            r4 = r14
            goto L_0x0209
        L_0x0202:
            r2 = 7
            r3 = 6
            r14 = 5
            if (r4 != r14) goto L_0x020f
        L_0x0207:
            r1 = r3
        L_0x0208:
            r4 = r1
        L_0x0209:
            r1 = r12
            r2 = 0
            r14 = 2
            goto L_0x012e
        L_0x020f:
            r15 = 0
        L_0x0210:
            if (r15 == 0) goto L_0x0213
            return r15
        L_0x0213:
            o.e r1 = r0.f6400m
            r2 = 0
            byte r1 = r1.N(r2)
            boolean r1 = r0.u0(r1)
            if (r1 != 0) goto L_0x0227
            java.lang.String r1 = "Expected value"
            r0.p0(r1)
            throw r16
        L_0x0227:
            r17.q0()
            throw r16
        L_0x022b:
            o.e r1 = r0.f6400m
            r1.readByte()
            r0.f6401n = r6
            return r6
        L_0x0233:
            if (r3 != r6) goto L_0x0245
            o.e r1 = r0.f6400m
            r1.readByte()
            r0.f6401n = r5
            return r5
        L_0x023d:
            o.e r1 = r0.f6400m
            r1.readByte()
            r1 = 3
            goto L_0x0077
        L_0x0245:
            if (r3 == r6) goto L_0x0251
            r1 = 2
            if (r3 != r1) goto L_0x024b
            goto L_0x0251
        L_0x024b:
            java.lang.String r1 = "Unexpected value"
            r0.p0(r1)
            throw r16
        L_0x0251:
            r17.q0()
            throw r16
        L_0x0255:
            r17.q0()
            throw r16
        L_0x0259:
            o.e r1 = r0.f6400m
            r1.readByte()
            r0.f6401n = r4
            return r4
        L_0x0261:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0269:
            throw r16
        L_0x026a:
            int r2 = r2 - r6
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x028e
            int r2 = r0.w0(r6)
            o.e r4 = r0.f6400m
            r4.readByte()
            if (r2 == r9) goto L_0x028e
            if (r2 == r8) goto L_0x028a
            if (r2 != r1) goto L_0x0284
        L_0x0281:
            r1 = 2
            goto L_0x0077
        L_0x0284:
            java.lang.String r1 = "Unterminated object"
            r0.p0(r1)
            throw r16
        L_0x028a:
            r17.q0()
            throw r16
        L_0x028e:
            int r2 = r0.w0(r6)
            r4 = 34
            if (r2 == r4) goto L_0x02b8
            r4 = 39
            if (r2 == r4) goto L_0x02af
            if (r2 != r1) goto L_0x02ab
            r1 = 5
            if (r3 == r1) goto L_0x02a5
            o.e r1 = r0.f6400m
            r1.readByte()
            goto L_0x0281
        L_0x02a5:
            java.lang.String r1 = "Expected name"
            r0.p0(r1)
            throw r16
        L_0x02ab:
            r17.q0()
            throw r16
        L_0x02af:
            o.e r1 = r0.f6400m
            r1.readByte()
            r17.q0()
            throw r16
        L_0x02b8:
            o.e r1 = r0.f6400m
            r1.readByte()
            r1 = 13
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.a.r.r0():int");
    }

    public final int s0(String str, q.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.f6401n = 0;
                this.f6386j[this.f6384h - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    public final int t0(String str, q.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.f6401n = 0;
                int[] iArr = this.f6387k;
                int i3 = this.f6384h - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder y = a.y("JsonReader(");
        y.append(this.f6399l);
        y.append(")");
        return y.toString();
    }

    public final boolean u0(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        q0();
        throw null;
    }

    public String v0() {
        String str;
        h hVar;
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 14) {
            str = y0();
        } else {
            if (i2 == 13) {
                hVar = s;
            } else if (i2 == 12) {
                hVar = r;
            } else if (i2 == 15) {
                str = this.f6404q;
                this.f6404q = null;
            } else {
                StringBuilder y = a.y("Expected a name but was ");
                y.append(g0());
                y.append(" at path ");
                y.append(H());
                throw new n(y.toString());
            }
            str = x0(hVar);
        }
        this.f6401n = 0;
        this.f6386j[this.f6384h - 1] = str;
        return str;
    }

    public final int w0(boolean z) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (this.f6399l.t((long) i3)) {
                byte N = this.f6400m.N((long) i2);
                if (N == 10 || N == 32 || N == 13 || N == 9) {
                    i2 = i3;
                } else {
                    this.f6400m.skip((long) (i3 - 1));
                    if (N == 47) {
                        if (!this.f6399l.t(2)) {
                            return N;
                        }
                        q0();
                        throw null;
                    } else if (N != 35) {
                        return N;
                    } else {
                        q0();
                        throw null;
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String x0(h hVar) {
        StringBuilder sb = null;
        while (true) {
            long P = this.f6399l.P(hVar);
            if (P == -1) {
                p0("Unterminated string");
                throw null;
            } else if (this.f6400m.N(P) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6400m.n0(P));
                this.f6400m.readByte();
                sb.append(z0());
            } else {
                String n0 = this.f6400m.n0(P);
                if (sb == null) {
                    this.f6400m.readByte();
                    return n0;
                }
                sb.append(n0);
                this.f6400m.readByte();
                return sb.toString();
            }
        }
    }

    public final String y0() {
        long P = this.f6399l.P(t);
        return P != -1 ? this.f6400m.n0(P) : this.f6400m.m0();
    }

    public void z() {
        int i2 = this.f6401n;
        if (i2 == 0) {
            i2 = r0();
        }
        if (i2 == 2) {
            int i3 = this.f6384h - 1;
            this.f6384h = i3;
            this.f6386j[i3] = null;
            int[] iArr = this.f6387k;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6401n = 0;
            return;
        }
        StringBuilder y = a.y("Expected END_OBJECT but was ");
        y.append(g0());
        y.append(" at path ");
        y.append(H());
        throw new n(y.toString());
    }

    public final char z0() {
        int i2;
        int i3;
        if (this.f6399l.t(1)) {
            byte readByte = this.f6400m.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                StringBuilder y = a.y("Invalid escape sequence: \\");
                y.append((char) readByte);
                p0(y.toString());
                throw null;
            } else if (this.f6399l.t(4)) {
                char c = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte N = this.f6400m.N((long) i4);
                    char c2 = (char) (c << 4);
                    if (N < 48 || N > 57) {
                        if (N >= 97 && N <= 102) {
                            i3 = N - 97;
                        } else if (N < 65 || N > 70) {
                            StringBuilder y2 = a.y("\\u");
                            y2.append(this.f6400m.n0(4));
                            p0(y2.toString());
                            throw null;
                        } else {
                            i3 = N - 65;
                        }
                        i2 = i3 + 10;
                    } else {
                        i2 = N - 48;
                    }
                    c = (char) (i2 + c2);
                }
                this.f6400m.skip(4);
                return c;
            } else {
                StringBuilder y3 = a.y("Unterminated escape sequence at path ");
                y3.append(H());
                throw new EOFException(y3.toString());
            }
        } else {
            p0("Unterminated escape sequence");
            throw null;
        }
    }
}
