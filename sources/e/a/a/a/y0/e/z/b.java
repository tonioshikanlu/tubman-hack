package e.a.a.a.y0.e.z;

import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.j;
import e.a.a.a.y0.e.k;
import e.a.a.a.y0.e.x;
import e.a.a.a.y0.h.i;

public class b {
    public static final C0203b A;
    public static final C0203b B;
    public static final C0203b C;
    public static final C0203b D;
    public static final C0203b E;
    public static final C0203b F;
    public static final C0203b G;
    public static final C0203b H;
    public static final C0203b I;
    public static final C0203b J;
    public static final C0203b K = d.c();
    public static final C0203b a = d.c();

    /* renamed from: b  reason: collision with root package name */
    public static final C0203b f9185b;
    public static final d<x> c;
    public static final d<k> d;

    /* renamed from: e  reason: collision with root package name */
    public static final d<c.C0199c> f9186e;
    public static final C0203b f;

    /* renamed from: g  reason: collision with root package name */
    public static final C0203b f9187g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0203b f9188h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0203b f9189i;

    /* renamed from: j  reason: collision with root package name */
    public static final C0203b f9190j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0203b f9191k;

    /* renamed from: l  reason: collision with root package name */
    public static final C0203b f9192l;

    /* renamed from: m  reason: collision with root package name */
    public static final d<j> f9193m;

    /* renamed from: n  reason: collision with root package name */
    public static final C0203b f9194n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0203b f9195o;

    /* renamed from: p  reason: collision with root package name */
    public static final C0203b f9196p;

    /* renamed from: q  reason: collision with root package name */
    public static final C0203b f9197q;
    public static final C0203b r;
    public static final C0203b s;
    public static final C0203b t;
    public static final C0203b u;
    public static final C0203b v;
    public static final C0203b w;
    public static final C0203b x;
    public static final C0203b y;
    public static final C0203b z;

    /* renamed from: e.a.a.a.y0.e.z.b$b  reason: collision with other inner class name */
    public static class C0203b extends d<Boolean> {
        public C0203b(int i2) {
            super(i2, 1, (a) null);
        }

        /* renamed from: f */
        public Boolean d(int i2) {
            Boolean valueOf = Boolean.valueOf((i2 & (1 << this.a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: g */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    public static class c<E extends i.a> extends d<E> {
        public final E[] c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0033
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001c
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                int r0 = r0 + r2
            L_0x0012:
                r1 = 0
                r4.<init>(r5, r0, r1)
                r4.c = r6
                return
            L_0x0019:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0033:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.z.b.c.<init>(int, e.a.a.a.y0.h.i$a[]):void");
        }

        public Object d(int i2) {
            int i3 = this.a;
            int i4 = (i2 & (((1 << this.f9198b) - 1) << i3)) >> i3;
            for (E e2 : this.c) {
                if (e2.f() == i4) {
                    return e2;
                }
            }
            return null;
        }

        public int e(Object obj) {
            return ((i.a) obj).f() << this.a;
        }
    }

    public static abstract class d<E> {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9198b;

        public d(int i2, int i3, a aVar) {
            this.a = i2;
            this.f9198b = i3;
        }

        public static <E extends i.a> d<E> a(d<?> dVar, E[] eArr) {
            return new c(dVar.a + dVar.f9198b, eArr);
        }

        public static C0203b b(d<?> dVar) {
            return new C0203b(dVar.a + dVar.f9198b);
        }

        public static C0203b c() {
            return new C0203b(0);
        }

        public abstract E d(int i2);

        public abstract int e(E e2);
    }

    static {
        C0203b c2 = d.c();
        f9185b = c2;
        d<x> a2 = d.a(c2, x.values());
        c = a2;
        d<k> a3 = d.a(a2, k.values());
        d = a3;
        d<c.C0199c> a4 = d.a(a3, c.C0199c.values());
        f9186e = a4;
        C0203b b2 = d.b(a4);
        f = b2;
        C0203b b3 = d.b(b2);
        f9187g = b3;
        C0203b b4 = d.b(b3);
        f9188h = b4;
        C0203b b5 = d.b(b4);
        f9189i = b5;
        C0203b b6 = d.b(b5);
        f9190j = b6;
        f9191k = d.b(b6);
        f9192l = d.b(a2);
        d<j> a5 = d.a(a3, j.values());
        f9193m = a5;
        C0203b b7 = d.b(a5);
        f9194n = b7;
        C0203b b8 = d.b(b7);
        f9195o = b8;
        C0203b b9 = d.b(b8);
        f9196p = b9;
        C0203b b10 = d.b(b9);
        f9197q = b10;
        C0203b b11 = d.b(b10);
        r = b11;
        C0203b b12 = d.b(b11);
        s = b12;
        t = d.b(b12);
        C0203b b13 = d.b(a5);
        u = b13;
        C0203b b14 = d.b(b13);
        v = b14;
        C0203b b15 = d.b(b14);
        w = b15;
        C0203b b16 = d.b(b15);
        x = b16;
        C0203b b17 = d.b(b16);
        y = b17;
        C0203b b18 = d.b(b17);
        z = b18;
        C0203b b19 = d.b(b18);
        A = b19;
        C0203b b20 = d.b(b19);
        B = b20;
        C = d.b(b20);
        C0203b b21 = d.b(c2);
        D = b21;
        C0203b b22 = d.b(b21);
        E = b22;
        F = d.b(b22);
        C0203b b23 = d.b(a3);
        G = b23;
        C0203b b24 = d.b(b23);
        H = b24;
        I = d.b(b24);
        C0203b c3 = d.c();
        J = c3;
        d.b(c3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.z.b.a(int):void");
    }
}
