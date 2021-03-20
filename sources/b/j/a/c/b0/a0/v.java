package b.j.a.c.b0.a0;

import b.j.a.a.h0;
import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.z.p;
import b.j.a.c.b0.z.q;
import b.j.a.c.j;
import b.j.a.c.j0.c;
import b.j.a.c.k;
import b.j.a.c.t;
import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class v<T> extends z<T> implements i {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f1746n = 0;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f1747k;

    /* renamed from: l  reason: collision with root package name */
    public transient Object f1748l;

    /* renamed from: m  reason: collision with root package name */
    public final r f1749m;

    @b.j.a.c.z.a
    public static final class a extends v<boolean[]> {
        public a() {
            super(boolean[].class);
        }

        public a(a aVar, r rVar, Boolean bool) {
            super(aVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            boolean z;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.a == null) {
                    y.a = new c.b();
                }
                c.b bVar = y.a;
                boolean[] zArr = (boolean[]) bVar.d();
                int i2 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        }
                        if (T0 == l.VALUE_TRUE) {
                            z = true;
                        } else {
                            if (T0 != l.VALUE_FALSE) {
                                if (T0 == l.VALUE_NULL) {
                                    r rVar = this.f1749m;
                                    if (rVar != null) {
                                        rVar.c(gVar);
                                    } else {
                                        R(gVar);
                                    }
                                } else {
                                    z = H(iVar, gVar);
                                }
                            }
                            z = false;
                        }
                        if (i2 >= zArr.length) {
                            boolean[] zArr2 = (boolean[]) bVar.b(zArr, i2);
                            i2 = 0;
                            zArr = zArr2;
                        }
                        int i3 = i2 + 1;
                        try {
                            zArr[i2] = z;
                            i2 = i3;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i3;
                            throw k.g(e, zArr, bVar.d + i2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, zArr, bVar.d + i2);
                    }
                }
                obj = bVar.c(zArr, i2);
            }
            return (boolean[]) obj;
        }

        public Object d0() {
            return new boolean[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new boolean[]{H(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new a(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class b extends v<byte[]> {
        public b() {
            super(byte[].class);
        }

        public b(b bVar, r rVar, Boolean bool) {
            super(bVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[Catch:{ Exception -> 0x00cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[Catch:{ Exception -> 0x00cb }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x009d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(b.j.a.b.i r8, b.j.a.c.g r9) {
            /*
                r7 = this;
                b.j.a.b.l r0 = r8.g0()
                b.j.a.b.l r1 = b.j.a.b.l.VALUE_STRING
                r2 = 0
                r3 = 0
                if (r0 != r1) goto L_0x002e
                b.j.a.b.a r1 = r9.z()     // Catch:{ h -> 0x0014 }
                byte[] r3 = r8.N(r1)     // Catch:{ h -> 0x0014 }
                goto L_0x00ca
            L_0x0014:
                r1 = move-exception
                java.lang.String r1 = r1.b()
                java.lang.String r4 = "base64"
                boolean r4 = r1.contains(r4)
                if (r4 != 0) goto L_0x0022
                goto L_0x002e
            L_0x0022:
                java.lang.Class<byte[]> r0 = byte[].class
                java.lang.String r8 = r8.x0()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r9.L(r0, r8, r1, r2)
                throw r3
            L_0x002e:
                b.j.a.b.l r1 = b.j.a.b.l.VALUE_EMBEDDED_OBJECT
                if (r0 != r1) goto L_0x0043
                java.lang.Object r0 = r8.o0()
                if (r0 != 0) goto L_0x003a
                goto L_0x00ca
            L_0x003a:
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L_0x0043
                r3 = r0
                byte[] r3 = (byte[]) r3
                goto L_0x00ca
            L_0x0043:
                boolean r0 = r8.O0()
                if (r0 != 0) goto L_0x004f
                java.lang.Object r8 = r7.e0(r8, r9)
                goto L_0x00c7
            L_0x004f:
                b.j.a.c.j0.c r0 = r9.y()
                b.j.a.c.j0.c$c r1 = r0.f2201b
                if (r1 != 0) goto L_0x005e
                b.j.a.c.j0.c$c r1 = new b.j.a.c.j0.c$c
                r1.<init>()
                r0.f2201b = r1
            L_0x005e:
                b.j.a.c.j0.c$c r0 = r0.f2201b
                java.lang.Object r1 = r0.d()
                byte[] r1 = (byte[]) r1
                r4 = r2
            L_0x0067:
                b.j.a.b.l r5 = r8.T0()     // Catch:{ Exception -> 0x00cb }
                b.j.a.b.l r6 = b.j.a.b.l.END_ARRAY     // Catch:{ Exception -> 0x00cb }
                if (r5 == r6) goto L_0x00c3
                b.j.a.b.l r6 = b.j.a.b.l.VALUE_NUMBER_INT     // Catch:{ Exception -> 0x00cb }
                if (r5 == r6) goto L_0x00ab
                b.j.a.b.l r6 = b.j.a.b.l.VALUE_NUMBER_FLOAT     // Catch:{ Exception -> 0x00cb }
                if (r5 != r6) goto L_0x0078
                goto L_0x00ab
            L_0x0078:
                b.j.a.b.l r6 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x00cb }
                if (r5 != r6) goto L_0x0089
                b.j.a.c.b0.r r5 = r7.f1749m     // Catch:{ Exception -> 0x00cb }
                if (r5 == 0) goto L_0x0084
                r5.c(r9)     // Catch:{ Exception -> 0x00cb }
                goto L_0x0067
            L_0x0084:
                r7.R(r9)     // Catch:{ Exception -> 0x00cb }
                r5 = r2
                goto L_0x00af
            L_0x0089:
                int r5 = r7.L(r8, r9)     // Catch:{ Exception -> 0x00cb }
                r6 = -128(0xffffffffffffff80, float:NaN)
                if (r5 < r6) goto L_0x0098
                r6 = 255(0xff, float:3.57E-43)
                if (r5 <= r6) goto L_0x0096
                goto L_0x0098
            L_0x0096:
                r6 = r2
                goto L_0x0099
            L_0x0098:
                r6 = 1
            L_0x0099:
                if (r6 != 0) goto L_0x009d
                byte r5 = (byte) r5     // Catch:{ Exception -> 0x00cb }
                goto L_0x00af
            L_0x009d:
                java.lang.Class<?> r8 = r7.f1761h     // Catch:{ Exception -> 0x00cb }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00cb }
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00cb }
                java.lang.String r6 = "overflow, value cannot be represented as 8-bit value"
                r9.L(r8, r5, r6, r2)     // Catch:{ Exception -> 0x00cb }
                throw r3
            L_0x00ab:
                byte r5 = r8.O()     // Catch:{ Exception -> 0x00cb }
            L_0x00af:
                int r6 = r1.length     // Catch:{ Exception -> 0x00cb }
                if (r4 < r6) goto L_0x00ba
                java.lang.Object r6 = r0.b(r1, r4)     // Catch:{ Exception -> 0x00cb }
                byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x00cb }
                r4 = r2
                r1 = r6
            L_0x00ba:
                int r6 = r4 + 1
                r1[r4] = r5     // Catch:{ Exception -> 0x00c0 }
                r4 = r6
                goto L_0x0067
            L_0x00c0:
                r8 = move-exception
                r4 = r6
                goto L_0x00cc
            L_0x00c3:
                java.lang.Object r8 = r0.c(r1, r4)
            L_0x00c7:
                r3 = r8
                byte[] r3 = (byte[]) r3
            L_0x00ca:
                return r3
            L_0x00cb:
                r8 = move-exception
            L_0x00cc:
                int r9 = r0.d
                int r9 = r9 + r4
                b.j.a.c.k r8 = b.j.a.c.k.g(r8, r1, r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.v.b.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
        }

        public Object d0() {
            return new byte[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            l g0 = iVar.g0();
            if (g0 == l.VALUE_NUMBER_INT || g0 == l.VALUE_NUMBER_FLOAT) {
                return new byte[]{iVar.O()};
            } else if (g0 == l.VALUE_NULL) {
                r rVar = this.f1749m;
                if (rVar != null) {
                    rVar.c(gVar);
                    Object obj = this.f1748l;
                    if (obj == null) {
                        obj = new byte[0];
                        this.f1748l = obj;
                    }
                    return (byte[]) obj;
                }
                R(gVar);
                return null;
            } else {
                gVar.G(this.f1761h.getComponentType(), iVar);
                throw null;
            }
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new b(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class c extends v<char[]> {
        public c() {
            super(char[].class);
        }

        public Object c0(Object obj, Object obj2) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) obj2;
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            String f;
            String str;
            l g0 = iVar.g0();
            if (g0 == l.VALUE_STRING) {
                char[] y0 = iVar.y0();
                int A0 = iVar.A0();
                int z0 = iVar.z0();
                char[] cArr = new char[z0];
                System.arraycopy(y0, A0, cArr, 0, z0);
                return cArr;
            }
            if (iVar.O0()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    l T0 = iVar.T0();
                    if (T0 == l.END_ARRAY) {
                        f = sb.toString();
                        break;
                    }
                    if (T0 == l.VALUE_STRING) {
                        str = iVar.x0();
                    } else if (T0 == l.VALUE_NULL) {
                        r rVar = this.f1749m;
                        if (rVar != null) {
                            rVar.c(gVar);
                        } else {
                            R(gVar);
                            str = "\u0000";
                        }
                    } else {
                        gVar.G(Character.TYPE, iVar);
                        throw null;
                    }
                    if (str.length() == 1) {
                        sb.append(str.charAt(0));
                    } else {
                        gVar.Y(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(str.length()));
                        throw null;
                    }
                }
            } else {
                if (g0 == l.VALUE_EMBEDDED_OBJECT) {
                    Object o0 = iVar.o0();
                    if (o0 == null) {
                        return null;
                    }
                    if (o0 instanceof char[]) {
                        return (char[]) o0;
                    }
                    if (o0 instanceof String) {
                        return ((String) o0).toCharArray();
                    }
                    if (o0 instanceof byte[]) {
                        f = b.j.a.b.b.f1372b.f((byte[]) o0, false);
                    }
                }
                gVar.G(this.f1761h, iVar);
                throw null;
            }
            return f.toCharArray();
        }

        public Object d0() {
            return new char[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            gVar.G(this.f1761h, iVar);
            throw null;
        }

        public v<?> g0(r rVar, Boolean bool) {
            return this;
        }
    }

    @b.j.a.c.z.a
    public static final class d extends v<double[]> {
        public d() {
            super(double[].class);
        }

        public d(d dVar, r rVar, Boolean bool) {
            super(dVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            r rVar;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.f2203g == null) {
                    y.f2203g = new c.d();
                }
                c.d dVar = y.f2203g;
                double[] dArr = (double[]) dVar.d();
                int i2 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        } else if (T0 != l.VALUE_NULL || (rVar = this.f1749m) == null) {
                            double J = J(iVar, gVar);
                            if (i2 >= dArr.length) {
                                double[] dArr2 = (double[]) dVar.b(dArr, i2);
                                i2 = 0;
                                dArr = dArr2;
                            }
                            int i3 = i2 + 1;
                            try {
                                dArr[i2] = J;
                                i2 = i3;
                            } catch (Exception e2) {
                                e = e2;
                                i2 = i3;
                                throw k.g(e, dArr, dVar.d + i2);
                            }
                        } else {
                            rVar.c(gVar);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, dArr, dVar.d + i2);
                    }
                }
                obj = dVar.c(dArr, i2);
            }
            return (double[]) obj;
        }

        public Object d0() {
            return new double[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new double[]{J(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new d(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class e extends v<float[]> {
        public e() {
            super(float[].class);
        }

        public e(e eVar, r rVar, Boolean bool) {
            super(eVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            r rVar;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.f == null) {
                    y.f = new c.e();
                }
                c.e eVar = y.f;
                float[] fArr = (float[]) eVar.d();
                int i2 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        } else if (T0 != l.VALUE_NULL || (rVar = this.f1749m) == null) {
                            float K = K(iVar, gVar);
                            if (i2 >= fArr.length) {
                                float[] fArr2 = (float[]) eVar.b(fArr, i2);
                                i2 = 0;
                                fArr = fArr2;
                            }
                            int i3 = i2 + 1;
                            try {
                                fArr[i2] = K;
                                i2 = i3;
                            } catch (Exception e2) {
                                e = e2;
                                i2 = i3;
                                throw k.g(e, fArr, eVar.d + i2);
                            }
                        } else {
                            rVar.c(gVar);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, fArr, eVar.d + i2);
                    }
                }
                obj = eVar.c(fArr, i2);
            }
            return (float[]) obj;
        }

        public Object d0() {
            return new float[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new float[]{K(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new e(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class f extends v<int[]> {

        /* renamed from: o  reason: collision with root package name */
        public static final f f1750o = new f();

        public f() {
            super(int[].class);
        }

        public f(f fVar, r rVar, Boolean bool) {
            super(fVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            int i2;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.d == null) {
                    y.d = new c.f();
                }
                c.f fVar = y.d;
                int[] iArr = (int[]) fVar.d();
                int i3 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        }
                        if (T0 == l.VALUE_NUMBER_INT) {
                            i2 = iVar.q0();
                        } else if (T0 == l.VALUE_NULL) {
                            r rVar = this.f1749m;
                            if (rVar != null) {
                                rVar.c(gVar);
                            } else {
                                R(gVar);
                                i2 = 0;
                            }
                        } else {
                            i2 = L(iVar, gVar);
                        }
                        if (i3 >= iArr.length) {
                            int[] iArr2 = (int[]) fVar.b(iArr, i3);
                            i3 = 0;
                            iArr = iArr2;
                        }
                        int i4 = i3 + 1;
                        try {
                            iArr[i3] = i2;
                            i3 = i4;
                        } catch (Exception e2) {
                            e = e2;
                            i3 = i4;
                            throw k.g(e, iArr, fVar.d + i3);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, iArr, fVar.d + i3);
                    }
                }
                obj = fVar.c(iArr, i3);
            }
            return (int[]) obj;
        }

        public Object d0() {
            return new int[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new int[]{L(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new f(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class g extends v<long[]> {

        /* renamed from: o  reason: collision with root package name */
        public static final g f1751o = new g();

        public g() {
            super(long[].class);
        }

        public g(g gVar, r rVar, Boolean bool) {
            super(gVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            long j2;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.f2202e == null) {
                    y.f2202e = new c.g();
                }
                c.g gVar2 = y.f2202e;
                long[] jArr = (long[]) gVar2.d();
                int i2 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        }
                        if (T0 == l.VALUE_NUMBER_INT) {
                            j2 = iVar.r0();
                        } else if (T0 == l.VALUE_NULL) {
                            r rVar = this.f1749m;
                            if (rVar != null) {
                                rVar.c(gVar);
                            } else {
                                R(gVar);
                                j2 = 0;
                            }
                        } else {
                            j2 = M(iVar, gVar);
                        }
                        if (i2 >= jArr.length) {
                            long[] jArr2 = (long[]) gVar2.b(jArr, i2);
                            i2 = 0;
                            jArr = jArr2;
                        }
                        int i3 = i2 + 1;
                        try {
                            jArr[i2] = j2;
                            i2 = i3;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i3;
                            throw k.g(e, jArr, gVar2.d + i2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, jArr, gVar2.d + i2);
                    }
                }
                obj = gVar2.c(jArr, i2);
            }
            return (long[]) obj;
        }

        public Object d0() {
            return new long[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new long[]{M(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new g(this, rVar, bool);
        }
    }

    @b.j.a.c.z.a
    public static final class h extends v<short[]> {
        public h() {
            super(short[].class);
        }

        public h(h hVar, r rVar, Boolean bool) {
            super(hVar, rVar, bool);
        }

        public Object c0(Object obj, Object obj2) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            Object obj;
            short s;
            if (!iVar.O0()) {
                obj = e0(iVar, gVar);
            } else {
                b.j.a.c.j0.c y = gVar.y();
                if (y.c == null) {
                    y.c = new c.h();
                }
                c.h hVar = y.c;
                short[] sArr = (short[]) hVar.d();
                int i2 = 0;
                while (true) {
                    try {
                        l T0 = iVar.T0();
                        if (T0 == l.END_ARRAY) {
                            break;
                        }
                        if (T0 == l.VALUE_NULL) {
                            r rVar = this.f1749m;
                            if (rVar != null) {
                                rVar.c(gVar);
                            } else {
                                R(gVar);
                                s = 0;
                            }
                        } else {
                            s = N(iVar, gVar);
                        }
                        if (i2 >= sArr.length) {
                            short[] sArr2 = (short[]) hVar.b(sArr, i2);
                            i2 = 0;
                            sArr = sArr2;
                        }
                        int i3 = i2 + 1;
                        try {
                            sArr[i2] = s;
                            i2 = i3;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i3;
                            throw k.g(e, sArr, hVar.d + i2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        throw k.g(e, sArr, hVar.d + i2);
                    }
                }
                obj = hVar.c(sArr, i2);
            }
            return (short[]) obj;
        }

        public Object d0() {
            return new short[0];
        }

        public Object f0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
            return new short[]{N(iVar, gVar)};
        }

        public v<?> g0(r rVar, Boolean bool) {
            return new h(this, rVar, bool);
        }
    }

    public v(v<?> vVar, r rVar, Boolean bool) {
        super(vVar.f1761h);
        this.f1747k = bool;
        this.f1749m = rVar;
    }

    public v(Class<T> cls) {
        super((Class<?>) cls);
        this.f1747k = null;
        this.f1749m = null;
    }

    public j<?> a(b.j.a.c.g gVar, b.j.a.c.d dVar) {
        Class<?> cls = this.f1761h;
        k.a aVar = k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        k.d Y = Y(gVar, dVar, cls);
        r rVar = null;
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        h0 h0Var = dVar != null ? dVar.l().f2301n : null;
        if (h0Var == h0.SKIP) {
            p pVar = p.f1837i;
            rVar = p.f1837i;
        } else if (h0Var == h0.FAIL) {
            if (dVar == null) {
                rVar = new q((t) null, gVar.n(this.f1761h));
            } else {
                rVar = new q(dVar.h(), dVar.d());
            }
        }
        return (b2 == this.f1747k && rVar == this.f1749m) ? this : g0(rVar, b2);
    }

    public abstract T c0(T t, T t2);

    public abstract T d0();

    public T e(b.j.a.b.i iVar, b.j.a.c.g gVar, T t) {
        T d2 = d(iVar, gVar);
        return (t == null || Array.getLength(t) == 0) ? d2 : c0(t, d2);
    }

    public T e0(b.j.a.b.i iVar, b.j.a.c.g gVar) {
        if (iVar.L0(l.VALUE_STRING) && gVar.O(b.j.a.c.h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.x0().length() == 0) {
            return null;
        }
        Boolean bool = this.f1747k;
        if (bool == Boolean.TRUE || (bool == null && gVar.O(b.j.a.c.h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return f0(iVar, gVar);
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public Object f(b.j.a.b.i iVar, b.j.a.c.g gVar, b.j.a.c.f0.c cVar) {
        return cVar.c(iVar, gVar);
    }

    public abstract T f0(b.j.a.b.i iVar, b.j.a.c.g gVar);

    public abstract v<?> g0(r rVar, Boolean bool);

    public b.j.a.c.j0.a h() {
        return b.j.a.c.j0.a.CONSTANT;
    }

    public Object i(b.j.a.c.g gVar) {
        Object obj = this.f1748l;
        if (obj != null) {
            return obj;
        }
        Object d0 = d0();
        this.f1748l = d0;
        return d0;
    }

    public Boolean n(b.j.a.c.f fVar) {
        return Boolean.TRUE;
    }
}
