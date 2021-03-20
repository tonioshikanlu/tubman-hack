package b.j.a.b.t;

import b.j.a.b.g;
import b.j.a.b.h;
import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.b.m;
import b.j.a.b.q.b;
import b.j.a.b.s.a;
import b.j.a.b.u.b;
import b.j.a.b.w.c;
import b.j.a.b.w.k;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Objects;

public class f extends b {
    public static final int b0 = i.a.ALLOW_TRAILING_COMMA.f1426i;
    public static final int c0 = i.a.ALLOW_NUMERIC_LEADING_ZEROS.f1426i;
    public static final int d0 = i.a.ALLOW_NON_NUMERIC_NUMBERS.f1426i;
    public static final int e0 = i.a.ALLOW_MISSING_VALUES.f1426i;
    public static final int f0 = i.a.ALLOW_SINGLE_QUOTES.f1426i;
    public static final int g0 = i.a.ALLOW_UNQUOTED_FIELD_NAMES.f1426i;
    public static final int h0 = i.a.ALLOW_COMMENTS.f1426i;
    public static final int i0 = i.a.ALLOW_YAML_COMMENTS.f1426i;
    public static final int[] j0 = a.c;
    public Reader R;
    public char[] S;
    public boolean T;
    public m U;
    public final b.j.a.b.u.b V;
    public final int W;
    public boolean X;
    public long Y;
    public int Z;
    public int a0;

    public f(b.j.a.b.s.b bVar, int i2, Reader reader, m mVar, b.j.a.b.u.b bVar2) {
        super(bVar, i2);
        this.R = reader;
        bVar.a(bVar.f1470h);
        char[] b2 = bVar.d.b(0, 0);
        bVar.f1470h = b2;
        this.S = b2;
        this.u = 0;
        this.v = 0;
        this.U = mVar;
        this.V = bVar2;
        this.W = bVar2.c;
        this.T = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0 != 8) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0() {
        /*
            r3 = this;
            b.j.a.b.l r0 = r3.f1459i
            r1 = 0
            if (r0 == 0) goto L_0x0022
            int r0 = r0.f1441k
            r2 = 6
            if (r0 == r2) goto L_0x0012
            r2 = 7
            if (r0 == r2) goto L_0x001b
            r2 = 8
            if (r0 == r2) goto L_0x001b
            goto L_0x0022
        L_0x0012:
            boolean r0 = r3.X
            if (r0 == 0) goto L_0x001b
            r3.X = r1
            r3.P1()
        L_0x001b:
            b.j.a.b.w.k r0 = r3.E
            int r0 = r0.o()
            return r0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.A0():int");
    }

    public g B0() {
        if (this.f1459i == l.FIELD_NAME) {
            long j2 = this.w;
            return new g(y1(), -1, (this.Y - 1) + j2, this.Z, this.a0);
        }
        return new g(y1(), -1, this.z - 1, this.A, this.B);
    }

    public void D1() {
        char[] cArr;
        b.j.a.b.u.b bVar;
        super.D1();
        b.j.a.b.u.b bVar2 = this.V;
        if ((!bVar2.f1535l) && (bVar = bVar2.a) != null && bVar2.f1529e) {
            b.C0048b bVar3 = new b.C0048b(bVar2);
            int i2 = bVar3.a;
            b.C0048b bVar4 = bVar.f1528b.get();
            if (i2 != bVar4.a) {
                if (i2 > 12000) {
                    bVar3 = new b.C0048b(0, 0, new String[64], new b.a[32]);
                }
                bVar.f1528b.compareAndSet(bVar4, bVar3);
            }
            bVar2.f1535l = true;
        }
        if (this.T && (cArr = this.S) != null) {
            this.S = null;
            b.j.a.b.s.b bVar5 = this.s;
            Objects.requireNonNull(bVar5);
            bVar5.c(cArr, bVar5.f1470h);
            bVar5.f1470h = null;
            bVar5.d.f1548b.set(0, cArr);
        }
    }

    public final String H0() {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_STRING) {
            return lVar == l.FIELD_NAME ? e0() : super.I0((String) null);
        }
        if (this.X) {
            this.X = false;
            P1();
        }
        return this.E.h();
    }

    public final String I0(String str) {
        l lVar = this.f1459i;
        if (lVar != l.VALUE_STRING) {
            return lVar == l.FIELD_NAME ? e0() : super.I0(str);
        }
        if (this.X) {
            this.X = false;
            P1();
        }
        return this.E.h();
    }

    public final void M1(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) i3)) {
            h2(str.substring(0, i2));
            throw null;
        }
    }

    public byte[] N(b.j.a.b.a aVar) {
        byte[] bArr;
        l lVar = this.f1459i;
        if (lVar == l.VALUE_EMBEDDED_OBJECT && (bArr = this.I) != null) {
            return bArr;
        }
        if (lVar == l.VALUE_STRING) {
            if (this.X) {
                try {
                    this.I = O1(aVar);
                    this.X = false;
                } catch (IllegalArgumentException e2) {
                    throw new h(this, "Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e2.getMessage());
                }
            } else if (this.I == null) {
                c x1 = x1();
                b1(x0(), x1, aVar);
                this.I = x1.N();
            }
            return this.I;
        }
        StringBuilder y = b.e.a.a.a.y("Current token (");
        y.append(this.f1459i);
        y.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw new h(this, y.toString());
    }

    public final void N1(int i2) {
        if (i2 == 93) {
            u2();
            if (this.C.d()) {
                this.C = this.C.i();
                this.f1459i = l.END_ARRAY;
            } else {
                E1(i2, '}');
                throw null;
            }
        }
        if (i2 == 125) {
            u2();
            if (this.C.e()) {
                this.C = this.C.i();
                this.f1459i = l.END_OBJECT;
                return;
            }
            E1(i2, ']');
            throw null;
        }
    }

    public byte[] O1(b.j.a.b.a aVar) {
        c x1 = x1();
        while (true) {
            if (this.u >= this.v) {
                U1();
            }
            char[] cArr = this.S;
            int i2 = this.u;
            this.u = i2 + 1;
            char c = cArr[i2];
            if (c > ' ') {
                int d = aVar.d(c);
                if (d < 0) {
                    if (c == '\"') {
                        return x1.N();
                    }
                    d = u1(aVar, c, 0);
                    if (d < 0) {
                        continue;
                    }
                }
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr2 = this.S;
                int i3 = this.u;
                this.u = i3 + 1;
                char c2 = cArr2[i3];
                int d2 = aVar.d(c2);
                if (d2 < 0) {
                    d2 = u1(aVar, c2, 1);
                }
                int i4 = (d << 6) | d2;
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr3 = this.S;
                int i5 = this.u;
                this.u = i5 + 1;
                char c3 = cArr3[i5];
                int d3 = aVar.d(c3);
                if (d3 < 0) {
                    if (d3 != -2) {
                        if (c3 == '\"') {
                            x1.e(i4 >> 4);
                            if (!aVar.f1369l) {
                                return x1.N();
                            }
                            this.u--;
                            z1(aVar);
                            throw null;
                        }
                        d3 = u1(aVar, c3, 2);
                    }
                    if (d3 == -2) {
                        if (this.u >= this.v) {
                            U1();
                        }
                        char[] cArr4 = this.S;
                        int i6 = this.u;
                        this.u = i6 + 1;
                        char c4 = cArr4[i6];
                        if (aVar.l(c4) || u1(aVar, c4, 3) == -2) {
                            x1.e(i4 >> 4);
                        } else {
                            StringBuilder y = b.e.a.a.a.y("expected padding character '");
                            y.append(aVar.f1370m);
                            y.append("'");
                            throw J1(aVar, c4, 3, y.toString());
                        }
                    }
                }
                int i7 = (i4 << 6) | d3;
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr5 = this.S;
                int i8 = this.u;
                this.u = i8 + 1;
                char c5 = cArr5[i8];
                int d4 = aVar.d(c5);
                if (d4 < 0) {
                    if (d4 != -2) {
                        if (c5 == '\"') {
                            x1.z(i7 >> 2);
                            if (!aVar.f1369l) {
                                return x1.N();
                            }
                            this.u--;
                            z1(aVar);
                            throw null;
                        }
                        d4 = u1(aVar, c5, 3);
                    }
                    if (d4 == -2) {
                        x1.z(i7 >> 2);
                    }
                }
                x1.q((i7 << 6) | d4);
            }
        }
    }

    public final void P1() {
        int i2 = this.u;
        int i3 = this.v;
        if (i2 < i3) {
            int[] iArr = j0;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.S;
                char c = cArr[i2];
                if (c >= length || iArr[c] == 0) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                } else if (c == '\"') {
                    k kVar = this.E;
                    int i4 = this.u;
                    kVar.r(cArr, i4, i2 - i4);
                    this.u = i2 + 1;
                    return;
                }
            }
        }
        k kVar2 = this.E;
        char[] cArr2 = this.S;
        int i5 = this.u;
        int i6 = i2 - i5;
        kVar2.f1577b = null;
        kVar2.c = -1;
        kVar2.d = 0;
        kVar2.f1582j = null;
        kVar2.f1583k = null;
        if (kVar2.f) {
            kVar2.d();
        } else if (kVar2.f1580h == null) {
            kVar2.f1580h = kVar2.c(i6);
        }
        kVar2.f1579g = 0;
        kVar2.f1581i = 0;
        kVar2.b(cArr2, i5, i6);
        this.u = i2;
        char[] m2 = this.E.m();
        int i7 = this.E.f1581i;
        int[] iArr2 = j0;
        int length2 = iArr2.length;
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr3 = this.S;
                int i8 = this.u;
                this.u = i8 + 1;
                char c2 = cArr3[i8];
                if (c2 < length2 && iArr2[c2] != 0) {
                    if (c2 == '\"') {
                        this.E.f1581i = i7;
                        return;
                    } else if (c2 == '\\') {
                        c2 = w1();
                    } else if (c2 < ' ') {
                        F1(c2, "string value");
                    }
                }
                if (i7 >= m2.length) {
                    m2 = this.E.l();
                    i7 = 0;
                }
                m2[i7] = c2;
                i7++;
            } else {
                j1(": was expecting closing quote for a string value", l.VALUE_STRING);
                throw null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public b.j.a.b.l Q1(
/*
Method generation error in method: b.j.a.b.t.f.Q1(int, boolean):b.j.a.b.l, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public String R0() {
        l lVar;
        l lVar2;
        this.J = 0;
        l lVar3 = this.f1459i;
        l lVar4 = l.FIELD_NAME;
        if (lVar3 == lVar4) {
            Z1();
            return null;
        }
        if (this.X) {
            q2();
        }
        int r2 = r2();
        if (r2 < 0) {
            close();
            this.f1459i = null;
            return null;
        }
        this.I = null;
        if (r2 == 93 || r2 == 125) {
            N1(r2);
            return null;
        }
        if (this.C.l()) {
            r2 = n2(r2);
            if ((this.f1416h & b0) != 0 && (r2 == 93 || r2 == 125)) {
                N1(r2);
                return null;
            }
        }
        if (!this.C.e()) {
            u2();
            if (r2 == 34) {
                this.X = true;
                lVar2 = l.VALUE_STRING;
            } else {
                if (r2 != 44) {
                    if (r2 == 45) {
                        lVar2 = d2();
                    } else if (r2 == 91) {
                        this.C = this.C.j(this.A, this.B);
                        lVar2 = l.START_ARRAY;
                    } else if (r2 != 93) {
                        if (r2 == 102) {
                            X1("false", 1);
                            lVar2 = l.VALUE_FALSE;
                        } else if (r2 == 110) {
                            X1("null", 1);
                            lVar2 = l.VALUE_NULL;
                        } else if (r2 == 116) {
                            X1("true", 1);
                            lVar2 = l.VALUE_TRUE;
                        } else if (r2 != 123) {
                            switch (r2) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    lVar2 = f2(r2);
                                    break;
                            }
                            lVar2 = S1(r2);
                        } else {
                            this.C = this.C.k(this.A, this.B);
                            lVar2 = l.START_OBJECT;
                        }
                    }
                }
                if ((this.f1416h & e0) != 0) {
                    this.u--;
                    lVar2 = l.VALUE_NULL;
                }
                lVar2 = S1(r2);
            }
            this.f1459i = lVar2;
            return null;
        }
        int i2 = this.u;
        this.Y = (long) i2;
        this.Z = this.x;
        this.a0 = i2 - this.y;
        String b2 = r2 == 34 ? b2() : R1(r2);
        this.C.n(b2);
        this.f1459i = lVar4;
        int l2 = l2();
        u2();
        if (l2 == 34) {
            this.X = true;
            this.D = l.VALUE_STRING;
            return b2;
        }
        if (l2 == 45) {
            lVar = d2();
        } else if (l2 == 91) {
            lVar = l.START_ARRAY;
        } else if (l2 == 102) {
            V1();
            lVar = l.VALUE_FALSE;
        } else if (l2 == 110) {
            W1();
            lVar = l.VALUE_NULL;
        } else if (l2 == 116) {
            Y1();
            lVar = l.VALUE_TRUE;
        } else if (l2 != 123) {
            switch (l2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    lVar = f2(l2);
                    break;
                default:
                    lVar = S1(l2);
                    break;
            }
        } else {
            lVar = l.START_OBJECT;
        }
        this.D = lVar;
        return b2;
    }

    public String R1(int i2) {
        if (i2 == 39 && (this.f1416h & f0) != 0) {
            int i3 = this.u;
            int i4 = this.W;
            int i5 = this.v;
            if (i3 < i5) {
                int[] iArr = j0;
                int length = iArr.length;
                do {
                    char[] cArr = this.S;
                    char c = cArr[i3];
                    if (c != '\'') {
                        if (c < length && iArr[c] != 0) {
                            break;
                        }
                        i4 = (i4 * 33) + c;
                        i3++;
                    } else {
                        int i6 = this.u;
                        this.u = i3 + 1;
                        return this.V.c(cArr, i6, i3 - i6, i4);
                    }
                } while (i3 < i5);
            }
            int i7 = this.u;
            this.u = i3;
            return c2(i7, i4, 39);
        } else if ((this.f1416h & g0) != 0) {
            int[] iArr2 = a.f1462e;
            int length2 = iArr2.length;
            if (i2 < length2 ? iArr2[i2] == 0 : Character.isJavaIdentifierPart((char) i2)) {
                int i8 = this.u;
                int i9 = this.W;
                int i10 = this.v;
                if (i8 < i10) {
                    do {
                        char[] cArr2 = this.S;
                        char c2 = cArr2[i8];
                        if (c2 < length2) {
                            if (iArr2[c2] != 0) {
                                int i11 = this.u - 1;
                                this.u = i8;
                                return this.V.c(cArr2, i11, i8 - i11, i9);
                            }
                        } else if (!Character.isJavaIdentifierPart((char) c2)) {
                            int i12 = this.u - 1;
                            this.u = i8;
                            return this.V.c(this.S, i12, i8 - i12, i9);
                        }
                        i9 = (i9 * 33) + c2;
                        i8++;
                    } while (i8 < i10);
                }
                int i13 = this.u - 1;
                this.u = i8;
                this.E.r(this.S, i13, i8 - i13);
                char[] m2 = this.E.m();
                int i14 = this.E.f1581i;
                int length3 = iArr2.length;
                while (true) {
                    if (this.u >= this.v && !T1()) {
                        break;
                    }
                    char c3 = this.S[this.u];
                    if (c3 >= length3) {
                        if (!Character.isJavaIdentifierPart(c3)) {
                            break;
                        }
                    } else if (iArr2[c3] != 0) {
                        break;
                    }
                    this.u++;
                    i9 = (i9 * 33) + c3;
                    int i15 = i14 + 1;
                    m2[i14] = c3;
                    if (i15 >= m2.length) {
                        m2 = this.E.l();
                        i14 = 0;
                    } else {
                        i14 = i15;
                    }
                }
                k kVar = this.E;
                kVar.f1581i = i14;
                return this.V.c(kVar.n(), kVar.o(), kVar.s(), i9);
            }
            l1(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        } else {
            l1(i2, "was expecting double-quote to start field name");
            throw null;
        }
    }

    public m S() {
        return this.U;
    }

    public final String S0() {
        d k2;
        if (this.f1459i == l.FIELD_NAME) {
            this.G = false;
            l lVar = this.D;
            this.D = null;
            this.f1459i = lVar;
            if (lVar == l.VALUE_STRING) {
                if (this.X) {
                    this.X = false;
                    P1();
                }
                return this.E.h();
            }
            if (lVar == l.START_ARRAY) {
                k2 = this.C.j(this.A, this.B);
            } else {
                if (lVar == l.START_OBJECT) {
                    k2 = this.C.k(this.A, this.B);
                }
                return null;
            }
            this.C = k2;
            return null;
        } else if (T0() == l.VALUE_STRING) {
            return x0();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r8 != 44) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r7.C.d() == false) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.b.l S1(int r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 39
            r2 = 0
            if (r8 == r1) goto L_0x008e
            r1 = 73
            r3 = 1
            if (r8 == r1) goto L_0x0073
            r1 = 78
            if (r8 == r1) goto L_0x0058
            r1 = 93
            if (r8 == r1) goto L_0x003f
            r1 = 43
            if (r8 == r1) goto L_0x001d
            r0 = 44
            if (r8 == r0) goto L_0x0049
            goto L_0x00ed
        L_0x001d:
            int r8 = r7.u
            int r1 = r7.v
            if (r8 < r1) goto L_0x0030
            boolean r8 = r7.T1()
            if (r8 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            b.j.a.b.l r8 = b.j.a.b.l.VALUE_NUMBER_INT
            r7.k1(r8)
            throw r2
        L_0x0030:
            char[] r8 = r7.S
            int r1 = r7.u
            int r2 = r1 + 1
            r7.u = r2
            char r8 = r8[r1]
            b.j.a.b.l r8 = r7.Q1(r8, r0)
            return r8
        L_0x003f:
            b.j.a.b.t.d r0 = r7.C
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0049
            goto L_0x00ed
        L_0x0049:
            int r0 = r7.f1416h
            int r1 = e0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ed
            int r8 = r7.u
            int r8 = r8 - r3
            r7.u = r8
            b.j.a.b.l r8 = b.j.a.b.l.VALUE_NULL
            return r8
        L_0x0058:
            java.lang.String r8 = "NaN"
            r7.X1(r8, r3)
            int r0 = r7.f1416h
            int r1 = d0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006b
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            b.j.a.b.l r8 = r7.K1(r8, r0)
            return r8
        L_0x006b:
            b.j.a.b.h r8 = new b.j.a.b.h
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r8.<init>(r7, r0)
            throw r8
        L_0x0073:
            java.lang.String r8 = "Infinity"
            r7.X1(r8, r3)
            int r0 = r7.f1416h
            int r1 = d0
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0086
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            b.j.a.b.l r8 = r7.K1(r8, r0)
            return r8
        L_0x0086:
            b.j.a.b.h r8 = new b.j.a.b.h
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r8.<init>(r7, r0)
            throw r8
        L_0x008e:
            int r3 = r7.f1416h
            int r4 = f0
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00ed
            b.j.a.b.w.k r8 = r7.E
            char[] r8 = r8.i()
            b.j.a.b.w.k r3 = r7.E
            int r3 = r3.f1581i
        L_0x009f:
            int r4 = r7.u
            int r5 = r7.v
            if (r4 < r5) goto L_0x00b4
            boolean r4 = r7.T1()
            if (r4 == 0) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            b.j.a.b.l r8 = b.j.a.b.l.VALUE_STRING
            java.lang.String r0 = ": was expecting closing quote for a string value"
            r7.j1(r0, r8)
            throw r2
        L_0x00b4:
            char[] r4 = r7.S
            int r5 = r7.u
            int r6 = r5 + 1
            r7.u = r6
            char r4 = r4[r5]
            r5 = 92
            if (r4 > r5) goto L_0x00dd
            if (r4 != r5) goto L_0x00c9
            char r4 = r7.w1()
            goto L_0x00dd
        L_0x00c9:
            if (r4 > r1) goto L_0x00dd
            if (r4 != r1) goto L_0x00d4
            b.j.a.b.w.k r8 = r7.E
            r8.f1581i = r3
            b.j.a.b.l r8 = b.j.a.b.l.VALUE_STRING
            return r8
        L_0x00d4:
            r5 = 32
            if (r4 >= r5) goto L_0x00dd
            java.lang.String r5 = "string value"
            r7.F1(r4, r5)
        L_0x00dd:
            int r5 = r8.length
            if (r3 < r5) goto L_0x00e7
            b.j.a.b.w.k r8 = r7.E
            char[] r8 = r8.l()
            r3 = r0
        L_0x00e7:
            int r5 = r3 + 1
            r8[r3] = r4
            r3 = r5
            goto L_0x009f
        L_0x00ed:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r8)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            char r8 = (char) r8
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = r7.G1()
            r7.i2(r8, r0)
            throw r2
        L_0x0109:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = r7.G1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.l1(r8, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.S1(int):b.j.a.b.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r0 == 125) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.b.l T0() {
        /*
            r9 = this;
            b.j.a.b.l r0 = r9.f1459i
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            if (r0 != r1) goto L_0x000b
            b.j.a.b.l r0 = r9.Z1()
            return r0
        L_0x000b:
            r0 = 0
            r9.J = r0
            boolean r0 = r9.X
            if (r0 == 0) goto L_0x0015
            r9.q2()
        L_0x0015:
            int r0 = r9.r2()
            r2 = 0
            if (r0 >= 0) goto L_0x0022
            r9.close()
            r9.f1459i = r2
            return r2
        L_0x0022:
            r9.I = r2
            r3 = 93
            if (r0 == r3) goto L_0x00ed
            r4 = 125(0x7d, float:1.75E-43)
            if (r0 != r4) goto L_0x002e
            goto L_0x00ed
        L_0x002e:
            b.j.a.b.t.d r5 = r9.C
            boolean r5 = r5.l()
            if (r5 == 0) goto L_0x0047
            int r0 = r9.n2(r0)
            int r5 = r9.f1416h
            int r6 = b0
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0047
            if (r0 == r3) goto L_0x00ed
            if (r0 != r4) goto L_0x0047
            goto L_0x00ed
        L_0x0047:
            b.j.a.b.t.d r3 = r9.C
            boolean r3 = r3.e()
            r5 = 34
            if (r3 == 0) goto L_0x0075
            int r6 = r9.u
            long r7 = (long) r6
            r9.Y = r7
            int r7 = r9.x
            r9.Z = r7
            int r7 = r9.y
            int r6 = r6 - r7
            r9.a0 = r6
            if (r0 != r5) goto L_0x0066
            java.lang.String r0 = r9.b2()
            goto L_0x006a
        L_0x0066:
            java.lang.String r0 = r9.R1(r0)
        L_0x006a:
            b.j.a.b.t.d r6 = r9.C
            r6.n(r0)
            r9.f1459i = r1
            int r0 = r9.l2()
        L_0x0075:
            r9.u2()
            if (r0 == r5) goto L_0x00e0
            r1 = 45
            if (r0 == r1) goto L_0x00db
            r1 = 91
            if (r0 == r1) goto L_0x00ca
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00c4
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x00be
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00b8
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00a7
            if (r0 == r4) goto L_0x00a1
            switch(r0) {
                case 48: goto L_0x009c;
                case 49: goto L_0x009c;
                case 50: goto L_0x009c;
                case 51: goto L_0x009c;
                case 52: goto L_0x009c;
                case 53: goto L_0x009c;
                case 54: goto L_0x009c;
                case 55: goto L_0x009c;
                case 56: goto L_0x009c;
                case 57: goto L_0x009c;
                default: goto L_0x0097;
            }
        L_0x0097:
            b.j.a.b.l r0 = r9.S1(r0)
            goto L_0x00e5
        L_0x009c:
            b.j.a.b.l r0 = r9.f2(r0)
            goto L_0x00e5
        L_0x00a1:
            java.lang.String r1 = "expected a value"
            r9.l1(r0, r1)
            throw r2
        L_0x00a7:
            if (r3 != 0) goto L_0x00b5
            b.j.a.b.t.d r0 = r9.C
            int r1 = r9.A
            int r2 = r9.B
            b.j.a.b.t.d r0 = r0.k(r1, r2)
            r9.C = r0
        L_0x00b5:
            b.j.a.b.l r0 = b.j.a.b.l.START_OBJECT
            goto L_0x00e5
        L_0x00b8:
            r9.Y1()
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_TRUE
            goto L_0x00e5
        L_0x00be:
            r9.W1()
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_NULL
            goto L_0x00e5
        L_0x00c4:
            r9.V1()
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_FALSE
            goto L_0x00e5
        L_0x00ca:
            if (r3 != 0) goto L_0x00d8
            b.j.a.b.t.d r0 = r9.C
            int r1 = r9.A
            int r2 = r9.B
            b.j.a.b.t.d r0 = r0.j(r1, r2)
            r9.C = r0
        L_0x00d8:
            b.j.a.b.l r0 = b.j.a.b.l.START_ARRAY
            goto L_0x00e5
        L_0x00db:
            b.j.a.b.l r0 = r9.d2()
            goto L_0x00e5
        L_0x00e0:
            r0 = 1
            r9.X = r0
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_STRING
        L_0x00e5:
            if (r3 == 0) goto L_0x00ea
            r9.D = r0
            goto L_0x00f0
        L_0x00ea:
            r9.f1459i = r0
            return r0
        L_0x00ed:
            r9.N1(r0)
        L_0x00f0:
            b.j.a.b.l r0 = r9.f1459i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.T0():b.j.a.b.l");
    }

    public boolean T1() {
        int i2 = this.v;
        Reader reader = this.R;
        if (reader != null) {
            char[] cArr = this.S;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.u = 0;
                this.v = read;
                long j2 = (long) i2;
                this.w += j2;
                this.y -= i2;
                this.Y -= j2;
                return true;
            }
            t1();
            if (read == 0) {
                StringBuilder y = b.e.a.a.a.y("Reader returned 0 characters when trying to read ");
                y.append(this.v);
                throw new IOException(y.toString());
            }
        }
        return false;
    }

    public void U1() {
        if (!T1()) {
            i1();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V1() {
        /*
            r5 = this;
            int r0 = r5.u
            int r1 = r0 + 4
            int r2 = r5.v
            r3 = 1
            if (r1 >= r2) goto L_0x0038
            char[] r1 = r5.S
            char r2 = r1[r0]
            r4 = 97
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 115(0x73, float:1.61E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0035
            r2 = 93
            if (r1 == r2) goto L_0x0035
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0038
        L_0x0035:
            r5.u = r0
            return
        L_0x0038:
            java.lang.String r0 = "false"
            r5.X1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.V1():void");
    }

    public int W0(b.j.a.b.a aVar, OutputStream outputStream) {
        if (!this.X || this.f1459i != l.VALUE_STRING) {
            byte[] N = N(aVar);
            outputStream.write(N);
            return N.length;
        }
        byte[] d = this.s.d();
        try {
            return g2(aVar, outputStream, d);
        } finally {
            this.s.e(d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W1() {
        /*
            r5 = this;
            int r0 = r5.u
            int r1 = r0 + 3
            int r2 = r5.v
            r3 = 1
            if (r1 >= r2) goto L_0x002f
            char[] r1 = r5.S
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002c
            r2 = 93
            if (r1 == r2) goto L_0x002c
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x002f
        L_0x002c:
            r5.u = r0
            return
        L_0x002f:
            java.lang.String r0 = "null"
            r5.X1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.W1():void");
    }

    public final void X1(String str, int i2) {
        int i3;
        char c;
        int length = str.length();
        if (this.u + length >= this.v) {
            int length2 = str.length();
            do {
                if ((this.u < this.v || T1()) && this.S[this.u] == str.charAt(i2)) {
                    i3 = this.u + 1;
                    this.u = i3;
                    i2++;
                } else {
                    h2(str.substring(0, i2));
                    throw null;
                }
            } while (i2 < length2);
            if ((i3 < this.v || T1()) && (c = this.S[this.u]) >= '0' && c != ']' && c != '}') {
                M1(str, i2, c);
                return;
            }
            return;
        }
        while (this.S[this.u] == str.charAt(i2)) {
            int i4 = this.u + 1;
            this.u = i4;
            i2++;
            if (i2 >= length) {
                char c2 = this.S[i4];
                if (c2 >= '0' && c2 != ']' && c2 != '}') {
                    M1(str, i2, c2);
                    return;
                }
                return;
            }
        }
        h2(str.substring(0, i2));
        throw null;
    }

    public g Y() {
        return new g(y1(), -1, ((long) this.u) + this.w, this.x, (this.u - this.y) + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y1() {
        /*
            r5 = this;
            int r0 = r5.u
            int r1 = r0 + 3
            int r2 = r5.v
            r3 = 1
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r5.S
            char r2 = r1[r0]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r5.u = r0
            return
        L_0x0031:
            java.lang.String r0 = "true"
            r5.X1(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.Y1():void");
    }

    public final l Z1() {
        d k2;
        this.G = false;
        l lVar = this.D;
        this.D = null;
        if (lVar == l.START_ARRAY) {
            k2 = this.C.j(this.A, this.B);
        } else {
            if (lVar == l.START_OBJECT) {
                k2 = this.C.k(this.A, this.B);
            }
            this.f1459i = lVar;
            return lVar;
        }
        this.C = k2;
        this.f1459i = lVar;
        return lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 == 'E') goto L_0x0036;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.b.l a2(int r8, int r9, int r10, boolean r11, int r12) {
        /*
            r7 = this;
            int r0 = r7.v
            r1 = 0
            r2 = 57
            r3 = 48
            r4 = 0
            r5 = 46
            if (r8 != r5) goto L_0x002e
            r8 = r4
        L_0x000d:
            if (r10 < r0) goto L_0x0014
            b.j.a.b.l r8 = r7.e2(r11, r9)
            return r8
        L_0x0014:
            char[] r5 = r7.S
            int r6 = r10 + 1
            char r10 = r5[r10]
            if (r10 < r3) goto L_0x0023
            if (r10 <= r2) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r8 = r8 + 1
            r10 = r6
            goto L_0x000d
        L_0x0023:
            if (r8 == 0) goto L_0x0028
            r8 = r10
            r10 = r6
            goto L_0x002e
        L_0x0028:
            java.lang.String r8 = "Decimal point not followed by a digit"
            r7.r1(r10, r8)
            throw r1
        L_0x002e:
            r5 = 101(0x65, float:1.42E-43)
            if (r8 == r5) goto L_0x0036
            r5 = 69
            if (r8 != r5) goto L_0x006d
        L_0x0036:
            if (r10 < r0) goto L_0x003f
        L_0x0038:
            r7.u = r9
            b.j.a.b.l r8 = r7.e2(r11, r9)
            return r8
        L_0x003f:
            char[] r8 = r7.S
            int r5 = r10 + 1
            char r10 = r8[r10]
            r6 = 45
            if (r10 == r6) goto L_0x0052
            r6 = 43
            if (r10 != r6) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            r8 = r10
            r10 = r5
        L_0x0050:
            r5 = r4
            goto L_0x005a
        L_0x0052:
            if (r5 < r0) goto L_0x0055
            goto L_0x0038
        L_0x0055:
            int r10 = r5 + 1
            char r8 = r8[r5]
            goto L_0x0050
        L_0x005a:
            if (r8 > r2) goto L_0x006b
            if (r8 < r3) goto L_0x006b
            int r5 = r5 + 1
            if (r10 < r0) goto L_0x0063
            goto L_0x0038
        L_0x0063:
            char[] r8 = r7.S
            int r6 = r10 + 1
            char r8 = r8[r10]
            r10 = r6
            goto L_0x005a
        L_0x006b:
            if (r5 == 0) goto L_0x008d
        L_0x006d:
            int r10 = r10 + -1
            r7.u = r10
            b.j.a.b.t.d r0 = r7.C
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x007c
            r7.v2(r8)
        L_0x007c:
            int r10 = r10 - r9
            b.j.a.b.w.k r8 = r7.E
            char[] r0 = r7.S
            r8.r(r0, r9, r10)
            r7.P = r11
            r7.Q = r12
            r7.J = r4
            b.j.a.b.l r8 = b.j.a.b.l.VALUE_NUMBER_FLOAT
            return r8
        L_0x008d:
            java.lang.String r9 = "Exponent indicator not followed by a digit"
            r7.r1(r8, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.a2(int, int, int, boolean, int):b.j.a.b.l");
    }

    public final String b2() {
        int i2 = this.u;
        int i3 = this.W;
        int[] iArr = j0;
        while (true) {
            if (i2 >= this.v) {
                break;
            }
            char[] cArr = this.S;
            char c = cArr[i2];
            if (c >= iArr.length || iArr[c] == 0) {
                i3 = (i3 * 33) + c;
                i2++;
            } else if (c == '\"') {
                int i4 = this.u;
                this.u = i2 + 1;
                return this.V.c(cArr, i4, i2 - i4, i3);
            }
        }
        int i5 = this.u;
        this.u = i2;
        return c2(i5, i3, 34);
    }

    public final String c2(int i2, int i3, int i4) {
        this.E.r(this.S, i2, this.u - i2);
        char[] m2 = this.E.m();
        int i5 = this.E.f1581i;
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr = this.S;
                int i6 = this.u;
                this.u = i6 + 1;
                char c = cArr[i6];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = w1();
                    } else if (c <= i4) {
                        if (c == i4) {
                            k kVar = this.E;
                            kVar.f1581i = i5;
                            return this.V.c(kVar.n(), kVar.o(), kVar.s(), i3);
                        } else if (c < ' ') {
                            F1(c, "name");
                        }
                    }
                }
                i3 = (i3 * 33) + c;
                int i7 = i5 + 1;
                m2[i5] = c;
                if (i7 >= m2.length) {
                    m2 = this.E.l();
                    i5 = 0;
                } else {
                    i5 = i7;
                }
            } else {
                j1(" in field name", l.FIELD_NAME);
                throw null;
            }
        }
    }

    public final l d2() {
        int i2 = this.u;
        int i3 = i2 - 1;
        int i4 = this.v;
        if (i2 >= i4) {
            return e2(true, i3);
        }
        int i5 = i2 + 1;
        char c = this.S[i2];
        if (c > '9' || c < '0') {
            this.u = i5;
            return Q1(c, true);
        } else if (c == '0') {
            return e2(true, i3);
        } else {
            int i6 = 1;
            while (i5 < i4) {
                int i7 = i5 + 1;
                char c2 = this.S[i5];
                if (c2 >= '0' && c2 <= '9') {
                    i6++;
                    i5 = i7;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.u = i7;
                    return a2(c2, i3, i7, true, i6);
                } else {
                    int i8 = i7 - 1;
                    this.u = i8;
                    if (this.C.f()) {
                        v2(c2);
                    }
                    this.E.r(this.S, i3, i8 - i3);
                    return L1(true, i6);
                }
            }
            return e2(true, i3);
        }
    }

    public final l e2(boolean z, int i2) {
        int i3;
        char c;
        boolean z2;
        int i4;
        char c2;
        char w2;
        int i5;
        char c3;
        if (z) {
            i2++;
        }
        this.u = i2;
        char[] i6 = this.E.i();
        int i7 = 0;
        if (z) {
            i6[0] = '-';
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = this.u;
        if (i8 < this.v) {
            char[] cArr = this.S;
            this.u = i8 + 1;
            c = cArr[i8];
        } else {
            c = w2("No digit following minus sign", l.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            int i9 = this.u;
            int i10 = this.v;
            if ((i9 >= i10 || ((c3 = this.S[i9]) >= '0' && c3 <= '9')) && ((i9 < i10 || T1()) && (c = this.S[i5]) >= '0' && c <= '9')) {
                if ((this.f1416h & c0) != 0) {
                    this.u = (i5 = this.u) + 1;
                    if (c == '0') {
                        while (true) {
                            if (this.u >= this.v && !T1()) {
                                break;
                            }
                            char[] cArr2 = this.S;
                            int i11 = this.u;
                            c = cArr2[i11];
                            if (c < '0' || c > '9') {
                                break;
                            }
                            this.u = i11 + 1;
                            if (c != '0') {
                                break;
                            }
                        }
                    }
                } else {
                    throw new h(this, b.e.a.a.a.m("Invalid numeric value: ", "Leading zeroes not allowed"));
                }
            }
            c = '0';
        }
        int i12 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i12++;
                if (i3 >= i6.length) {
                    i6 = this.E.l();
                    i3 = 0;
                }
                int i13 = i3 + 1;
                i6[i3] = c;
                if (this.u >= this.v && !T1()) {
                    c = 0;
                    i3 = i13;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.S;
                int i14 = this.u;
                this.u = i14 + 1;
                c = cArr3[i14];
                i3 = i13;
            } else {
                z2 = false;
            }
        }
        if (i12 == 0) {
            return Q1(c, z);
        }
        if (c == '.') {
            if (i3 >= i6.length) {
                i6 = this.E.l();
                i3 = 0;
            }
            i6[i3] = c;
            int i15 = i3 + 1;
            i4 = 0;
            while (true) {
                if (this.u >= this.v && !T1()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.S;
                int i16 = this.u;
                this.u = i16 + 1;
                c = cArr4[i16];
                if (c < '0' || c > '9') {
                    break;
                }
                i4++;
                if (i3 >= i6.length) {
                    i6 = this.E.l();
                    i3 = 0;
                }
                i6[i3] = c;
                i15 = i3 + 1;
            }
            if (i4 == 0) {
                r1(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i4 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i3 >= i6.length) {
                i6 = this.E.l();
            } else {
                i7 = i3;
            }
            int i17 = i7 + 1;
            i6[i7] = c;
            int i18 = this.u;
            if (i18 < this.v) {
                char[] cArr5 = this.S;
                this.u = i18 + 1;
                c2 = cArr5[i18];
            } else {
                c2 = w2("expected a digit for number exponent", (l) null);
            }
            if (c2 == '-' || c2 == '+') {
                if (i17 >= i6.length) {
                    i6 = this.E.l();
                    i17 = 0;
                }
                int i19 = i17 + 1;
                i6[i17] = c2;
                int i20 = this.u;
                if (i20 < this.v) {
                    char[] cArr6 = this.S;
                    this.u = i20 + 1;
                    w2 = cArr6[i20];
                } else {
                    w2 = w2("expected a digit for number exponent", (l) null);
                }
                i17 = i19;
            }
            int i21 = 0;
            char c4 = c2;
            while (true) {
                if (c > '9' || c < '0') {
                    break;
                }
                i21++;
                if (i17 >= i6.length) {
                    i6 = this.E.l();
                    i17 = 0;
                }
                int i22 = i17 + 1;
                i6[i17] = c;
                if (this.u >= this.v && !T1()) {
                    i17 = i22;
                    z2 = true;
                    break;
                }
                char[] cArr7 = this.S;
                int i23 = this.u;
                this.u = i23 + 1;
                c4 = cArr7[i23];
                i17 = i22;
            }
            i7 = i21;
            if (i7 == 0) {
                r1(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.u--;
            if (this.C.f()) {
                v2(c);
            }
        }
        this.E.f1581i = i3;
        if (i4 >= 1 || i7 >= 1) {
            this.P = z;
            this.Q = i12;
            this.J = 0;
            return l.VALUE_NUMBER_FLOAT;
        }
        this.P = z;
        this.Q = i12;
        this.J = 0;
        return l.VALUE_NUMBER_INT;
    }

    public final l f2(int i2) {
        int i3 = this.u;
        int i4 = i3 - 1;
        int i5 = this.v;
        if (i2 == 48) {
            return e2(false, i4);
        }
        int i6 = 1;
        while (i3 < i5) {
            int i7 = i3 + 1;
            char c = this.S[i3];
            if (c >= '0' && c <= '9') {
                i6++;
                i3 = i7;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this.u = i7;
                return a2(c, i4, i7, false, i6);
            } else {
                int i8 = i7 - 1;
                this.u = i8;
                if (this.C.f()) {
                    v2(c);
                }
                this.E.r(this.S, i4, i8 - i4);
                return L1(false, i6);
            }
        }
        this.u = i4;
        return e2(false, i4);
    }

    public int g2(b.j.a.b.a aVar, OutputStream outputStream, byte[] bArr) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        b.j.a.b.a aVar2 = aVar;
        OutputStream outputStream2 = outputStream;
        byte[] bArr2 = bArr;
        int i4 = 3;
        int length = bArr2.length - 3;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (this.u >= this.v) {
                U1();
            }
            char[] cArr = this.S;
            int i7 = this.u;
            this.u = i7 + 1;
            char c = cArr[i7];
            if (c <= ' ') {
                z = z4;
            } else {
                int d = aVar2.d(c);
                if (d < 0) {
                    if (c == '\"') {
                        z2 = z4;
                        break;
                    }
                    d = u1(aVar2, c, z4);
                    if (d < 0) {
                        z = z4;
                        continue;
                    }
                }
                if (i5 > length) {
                    i6 += i5;
                    outputStream2.write(bArr2, z4 ? 1 : 0, i5);
                    i2 = z4;
                } else {
                    i2 = i5;
                }
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr2 = this.S;
                int i8 = this.u;
                this.u = i8 + 1;
                char c2 = cArr2[i8];
                int d2 = aVar2.d(c2);
                if (d2 < 0) {
                    d2 = u1(aVar2, c2, 1);
                }
                int i9 = (d << 6) | d2;
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr3 = this.S;
                int i10 = this.u;
                this.u = i10 + 1;
                char c3 = cArr3[i10];
                int d3 = aVar2.d(c3);
                if (d3 < 0) {
                    if (d3 != -2) {
                        if (c3 == '\"') {
                            int i11 = i2 + 1;
                            bArr2[i2] = (byte) (i9 >> 4);
                            if (!aVar2.f1369l) {
                                i5 = i11;
                            } else {
                                this.u--;
                                z1(aVar);
                                throw null;
                            }
                        } else {
                            d3 = u1(aVar2, c3, 2);
                        }
                    }
                    if (d3 == -2) {
                        if (this.u >= this.v) {
                            U1();
                        }
                        char[] cArr4 = this.S;
                        int i12 = this.u;
                        this.u = i12 + 1;
                        char c4 = cArr4[i12];
                        if (aVar2.l(c4) || u1(aVar2, c4, i4) == -2) {
                            int i13 = i2 + 1;
                            bArr2[i2] = (byte) (i9 >> 4);
                            z = false;
                            i5 = i13;
                        } else {
                            StringBuilder y = b.e.a.a.a.y("expected padding character '");
                            y.append(aVar2.f1370m);
                            y.append("'");
                            throw J1(aVar2, c4, i4, y.toString());
                        }
                    }
                }
                int i14 = (i9 << 6) | d3;
                if (this.u >= this.v) {
                    U1();
                }
                char[] cArr5 = this.S;
                int i15 = this.u;
                this.u = i15 + 1;
                char c5 = cArr5[i15];
                int d4 = aVar2.d(c5);
                if (d4 < 0) {
                    if (d4 == -2) {
                        z3 = false;
                        i3 = 3;
                    } else if (c5 == '\"') {
                        int i16 = i14 >> 2;
                        int i17 = i2 + 1;
                        bArr2[i2] = (byte) (i16 >> 8);
                        int i18 = i17 + 1;
                        bArr2[i17] = (byte) i16;
                        if (!aVar2.f1369l) {
                            i5 = i18;
                        } else {
                            this.u--;
                            z1(aVar);
                            throw null;
                        }
                    } else {
                        i3 = 3;
                        d4 = u1(aVar2, c5, 3);
                        z3 = false;
                    }
                    if (d4 == -2) {
                        int i19 = i14 >> 2;
                        int i20 = i2 + 1;
                        bArr2[i2] = (byte) (i19 >> 8);
                        bArr2[i20] = (byte) i19;
                        i4 = i3;
                        boolean z5 = z3;
                        i5 = i20 + 1;
                        z = z5;
                    }
                } else {
                    z3 = false;
                    i3 = 3;
                }
                int i21 = (i14 << 6) | d4;
                int i22 = i2 + 1;
                bArr2[i2] = (byte) (i21 >> 16);
                int i23 = i22 + 1;
                bArr2[i22] = (byte) (i21 >> 8);
                int i24 = i23 + 1;
                bArr2[i23] = (byte) i21;
                z = z3;
                i5 = i24;
                i4 = i3;
            }
            z4 = z;
        }
        z2 = false;
        this.X = z2;
        if (i5 <= 0) {
            return i6;
        }
        int i25 = i6 + i5;
        outputStream2.write(bArr2, z2 ? 1 : 0, i5);
        return i25;
    }

    public void h2(String str) {
        i2(str, G1());
        throw null;
    }

    public void i2(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.u >= this.v && !T1()) {
                break;
            }
            char c = this.S[this.u];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.u++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        h1("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    public final int j2() {
        char c;
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr = this.S;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                c = cArr[i2];
                if (c > ' ') {
                    if (c == '/') {
                        o2();
                    } else if (c != '#' || !t2()) {
                        return c;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.x++;
                    this.y = i3;
                } else if (c == 13) {
                    k2();
                } else if (c != 9) {
                    m1(c);
                    throw null;
                }
            } else {
                StringBuilder y = b.e.a.a.a.y("Unexpected end-of-input within/between ");
                y.append(this.C.h());
                y.append(" entries");
                throw new h(this, y.toString());
            }
        }
        return c;
    }

    public final void k2() {
        if (this.u < this.v || T1()) {
            char[] cArr = this.S;
            int i2 = this.u;
            if (cArr[i2] == 10) {
                this.u = i2 + 1;
            }
        }
        this.x++;
        this.y = this.u;
    }

    public final int l2() {
        int i2;
        char c;
        int i3;
        char c2;
        int i4 = this.u;
        if (i4 + 4 >= this.v) {
            return m2(false);
        }
        char[] cArr = this.S;
        char c3 = cArr[i4];
        if (c3 == ':') {
            i2 = i4 + 1;
            this.u = i2;
            c = cArr[i2];
            if (c <= ' ') {
                if (c == ' ' || c == 9) {
                    i3 = i2 + 1;
                    this.u = i3;
                    c2 = cArr[i3];
                    if (c2 > ' ') {
                        if (c2 == '/' || c2 == '#') {
                            return m2(true);
                        }
                        this.u = i3 + 1;
                        return c2;
                    }
                }
                return m2(true);
            } else if (c == '/' || c == '#') {
                return m2(true);
            }
        } else {
            if (c3 == ' ' || c3 == 9) {
                int i5 = i4 + 1;
                this.u = i5;
                c3 = cArr[i5];
            }
            if (c3 != ':') {
                return m2(false);
            }
            i2 = this.u + 1;
            this.u = i2;
            c = cArr[i2];
            if (c <= ' ') {
                if (c == ' ' || c == 9) {
                    i3 = i2 + 1;
                    this.u = i3;
                    c2 = cArr[i3];
                    if (c2 > ' ') {
                        if (c2 == '/' || c2 == '#') {
                            return m2(true);
                        }
                        this.u = i3 + 1;
                        return c2;
                    }
                }
                return m2(true);
            } else if (c == '/' || c == '#') {
                return m2(true);
            }
        }
        this.u = i2 + 1;
        return c;
    }

    public final int m2(boolean z) {
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr = this.S;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c == '/') {
                        o2();
                    } else if (c != '#' || !t2()) {
                        if (z) {
                            return c;
                        }
                        if (c == ':') {
                            z = true;
                        } else {
                            l1(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this.x++;
                    this.y = i3;
                } else if (c == 13) {
                    k2();
                } else if (c != 9) {
                    m1(c);
                    throw null;
                }
            } else {
                StringBuilder y = b.e.a.a.a.y(" within/between ");
                y.append(this.C.h());
                y.append(" entries");
                j1(y.toString(), (l) null);
                throw null;
            }
        }
    }

    public final int n2(int i2) {
        if (i2 == 44) {
            while (true) {
                int i3 = this.u;
                if (i3 >= this.v) {
                    return j2();
                }
                char[] cArr = this.S;
                int i4 = i3 + 1;
                this.u = i4;
                char c = cArr[i3];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this.u = i4 - 1;
                    return j2();
                } else if (c < ' ') {
                    if (c == 10) {
                        this.x++;
                        this.y = i4;
                    } else if (c == 13) {
                        k2();
                    } else if (c != 9) {
                        m1(c);
                        throw null;
                    }
                }
            }
        } else {
            StringBuilder y = b.e.a.a.a.y("was expecting comma to separate ");
            y.append(this.C.h());
            y.append(" entries");
            l1(i2, y.toString());
            throw null;
        }
    }

    public final void o2() {
        if ((this.f1416h & h0) == 0) {
            l1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.u < this.v || T1()) {
            char[] cArr = this.S;
            int i2 = this.u;
            this.u = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                p2();
            } else if (c == '*') {
                while (true) {
                    if (this.u >= this.v && !T1()) {
                        break;
                    }
                    char[] cArr2 = this.S;
                    int i3 = this.u;
                    int i4 = i3 + 1;
                    this.u = i4;
                    char c2 = cArr2[i3];
                    if (c2 <= '*') {
                        if (c2 == '*') {
                            if (i4 >= this.v && !T1()) {
                                break;
                            }
                            char[] cArr3 = this.S;
                            int i5 = this.u;
                            if (cArr3[i5] == '/') {
                                this.u = i5 + 1;
                                return;
                            }
                        } else if (c2 >= ' ') {
                            continue;
                        } else if (c2 == 10) {
                            this.x++;
                            this.y = i4;
                        } else if (c2 == 13) {
                            k2();
                        } else if (c2 != 9) {
                            m1(c2);
                            throw null;
                        }
                    }
                }
                j1(" in a comment", (l) null);
                throw null;
            } else {
                l1(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            j1(" in a comment", (l) null);
            throw null;
        }
    }

    public final void p2() {
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr = this.S;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                char c = cArr[i2];
                if (c < ' ') {
                    if (c == 10) {
                        this.x++;
                        this.y = i3;
                        return;
                    } else if (c == 13) {
                        k2();
                        return;
                    } else if (c != 9) {
                        m1(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void q2() {
        this.X = false;
        int i2 = this.u;
        int i3 = this.v;
        char[] cArr = this.S;
        while (true) {
            if (i2 >= i3) {
                this.u = i2;
                if (T1()) {
                    i2 = this.u;
                    i3 = this.v;
                } else {
                    j1(": was expecting closing quote for a string value", l.VALUE_STRING);
                    throw null;
                }
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c <= '\\') {
                if (c == '\\') {
                    this.u = i4;
                    w1();
                    i2 = this.u;
                    i3 = this.v;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.u = i4;
                        return;
                    } else if (c < ' ') {
                        this.u = i4;
                        F1(c, "string value");
                    }
                }
            }
            i2 = i4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085 A[SYNTHETIC] */
    public final int r2() {
        /*
            r10 = this;
            int r0 = r10.u
            int r1 = r10.v
            if (r0 < r1) goto L_0x0011
            boolean r0 = r10.T1()
            if (r0 != 0) goto L_0x0011
            r10.d1()
            r0 = -1
            return r0
        L_0x0011:
            char[] r0 = r10.S
            int r1 = r10.u
            int r2 = r1 + 1
            r10.u = r2
            char r0 = r0[r1]
            r1 = 35
            r3 = 47
            r4 = 32
            if (r0 <= r4) goto L_0x0032
            if (r0 == r3) goto L_0x0029
            if (r0 != r1) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return r0
        L_0x0029:
            int r2 = r2 + -1
            r10.u = r2
        L_0x002d:
            int r0 = r10.s2()
            return r0
        L_0x0032:
            r5 = 0
            r6 = 9
            r7 = 13
            r8 = 10
            if (r0 == r4) goto L_0x0053
            if (r0 != r8) goto L_0x0046
            int r0 = r10.x
            int r0 = r0 + 1
            r10.x = r0
            r10.y = r2
            goto L_0x0053
        L_0x0046:
            if (r0 != r7) goto L_0x004c
        L_0x0048:
            r10.k2()
            goto L_0x0053
        L_0x004c:
            if (r0 != r6) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            r10.m1(r0)
            throw r5
        L_0x0053:
            int r0 = r10.u
            int r2 = r10.v
            if (r0 >= r2) goto L_0x0085
            char[] r2 = r10.S
            int r9 = r0 + 1
            r10.u = r9
            char r0 = r2[r0]
            if (r0 <= r4) goto L_0x006e
            if (r0 == r3) goto L_0x0069
            if (r0 != r1) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            return r0
        L_0x0069:
            int r9 = r9 + -1
            r10.u = r9
            goto L_0x002d
        L_0x006e:
            if (r0 == r4) goto L_0x0053
            if (r0 != r8) goto L_0x007b
            int r0 = r10.x
            int r0 = r0 + 1
            r10.x = r0
            r10.y = r9
            goto L_0x0053
        L_0x007b:
            if (r0 != r7) goto L_0x007e
            goto L_0x0048
        L_0x007e:
            if (r0 != r6) goto L_0x0081
            goto L_0x0053
        L_0x0081:
            r10.m1(r0)
            throw r5
        L_0x0085:
            int r0 = r10.s2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.t.f.r2():int");
    }

    public final int s2() {
        char c;
        while (true) {
            if (this.u < this.v || T1()) {
                char[] cArr = this.S;
                int i2 = this.u;
                int i3 = i2 + 1;
                this.u = i3;
                c = cArr[i2];
                if (c > ' ') {
                    if (c == '/') {
                        o2();
                    } else if (c != '#' || !t2()) {
                        return c;
                    }
                } else if (c == ' ') {
                    continue;
                } else if (c == 10) {
                    this.x++;
                    this.y = i3;
                } else if (c == 13) {
                    k2();
                } else if (c != 9) {
                    m1(c);
                    throw null;
                }
            } else {
                d1();
                return -1;
            }
        }
        return c;
    }

    public void t1() {
        if (this.R != null) {
            if (this.s.c || N0(i.a.AUTO_CLOSE_SOURCE)) {
                this.R.close();
            }
            this.R = null;
        }
    }

    public final boolean t2() {
        if ((this.f1416h & i0) == 0) {
            return false;
        }
        p2();
        return true;
    }

    public final void u2() {
        int i2 = this.u;
        this.z = this.w + ((long) i2);
        this.A = this.x;
        this.B = i2 - this.y;
    }

    public final void v2(int i2) {
        int i3 = this.u + 1;
        this.u = i3;
        if (i2 == 9) {
            return;
        }
        if (i2 == 10) {
            this.x++;
            this.y = i3;
        } else if (i2 == 13) {
            k2();
        } else if (i2 != 32) {
            l1(i2, "Expected space separating root-level values");
            throw null;
        }
    }

    public char w1() {
        if (this.u < this.v || T1()) {
            char[] cArr = this.S;
            int i2 = this.u;
            this.u = i2 + 1;
            char c = cArr[i2];
            if (c == '\"' || c == '/' || c == '\\') {
                return c;
            }
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                A1(c);
                return c;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4) {
                if (this.u < this.v || T1()) {
                    char[] cArr2 = this.S;
                    int i5 = this.u;
                    this.u = i5 + 1;
                    char c2 = cArr2[i5];
                    int i6 = a.f1465i[c2 & 255];
                    if (i6 >= 0) {
                        i4 = (i4 << 4) | i6;
                        i3++;
                    } else {
                        l1(c2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    j1(" in character escape sequence", l.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i4;
        }
        j1(" in character escape sequence", l.VALUE_STRING);
        throw null;
    }

    public char w2(String str, l lVar) {
        if (this.u < this.v || T1()) {
            char[] cArr = this.S;
            int i2 = this.u;
            this.u = i2 + 1;
            return cArr[i2];
        }
        j1(str, lVar);
        throw null;
    }

    public final String x0() {
        l lVar = this.f1459i;
        if (lVar == l.VALUE_STRING) {
            if (this.X) {
                this.X = false;
                P1();
            }
            return this.E.h();
        } else if (lVar == null) {
            return null;
        } else {
            int i2 = lVar.f1441k;
            if (i2 == 5) {
                return this.C.f;
            }
            if (i2 == 6 || i2 == 7 || i2 == 8) {
                return this.E.h();
            }
            return lVar.f1438h;
        }
    }

    public final char[] y0() {
        l lVar = this.f1459i;
        if (lVar == null) {
            return null;
        }
        int i2 = lVar.f1441k;
        if (i2 != 5) {
            if (i2 != 6) {
                if (!(i2 == 7 || i2 == 8)) {
                    return lVar.f1439i;
                }
            } else if (this.X) {
                this.X = false;
                P1();
            }
            return this.E.n();
        }
        if (!this.G) {
            String str = this.C.f;
            int length = str.length();
            char[] cArr = this.F;
            if (cArr == null) {
                b.j.a.b.s.b bVar = this.s;
                bVar.a(bVar.f1472j);
                char[] b2 = bVar.d.b(3, length);
                bVar.f1472j = b2;
                this.F = b2;
            } else if (cArr.length < length) {
                this.F = new char[length];
            }
            str.getChars(0, length, this.F, 0);
            this.G = true;
        }
        return this.F;
    }

    public final int z0() {
        l lVar = this.f1459i;
        if (lVar == null) {
            return 0;
        }
        int i2 = lVar.f1441k;
        if (i2 == 5) {
            return this.C.f.length();
        }
        if (i2 != 6) {
            if (!(i2 == 7 || i2 == 8)) {
                return lVar.f1439i.length;
            }
        } else if (this.X) {
            this.X = false;
            P1();
        }
        return this.E.s();
    }

    public f(b.j.a.b.s.b bVar, int i2, Reader reader, m mVar, b.j.a.b.u.b bVar2, char[] cArr, int i3, int i4, boolean z) {
        super(bVar, i2);
        this.R = null;
        this.S = cArr;
        this.u = i3;
        this.v = i4;
        this.U = mVar;
        this.V = bVar2;
        this.W = bVar2.c;
        this.T = z;
    }
}
