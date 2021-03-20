package e.a.a.a;

import e.a.a.a.x0.i;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.m.d0;
import e.a.h;
import e.x.b.c;
import e.x.b.d;
import e.x.b.e;
import e.x.b.g;
import e.x.b.i;
import e.x.b.j;
import e.x.b.k;
import e.x.b.l;
import e.x.b.m;
import e.x.b.n;
import e.x.b.o;
import e.x.b.p;
import e.x.b.q;
import e.x.b.r;
import e.x.b.s;
import e.x.b.t;
import e.x.b.u;
import e.x.b.v;
import e.x.b.w;
import e.x.c.b;
import e.x.c.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends g<Object> implements f<Object>, h<Object>, Object, l, e.x.b.b, c, d, e, e.x.b.f, g, e.x.b.h, i, j, k, p, m, n, o, q, r, s, t, u, v, w, e.a.d {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ e.a.l[] f7482q;

    /* renamed from: k  reason: collision with root package name */
    public final n0 f7483k;

    /* renamed from: l  reason: collision with root package name */
    public final o0 f7484l;

    /* renamed from: m  reason: collision with root package name */
    public final o0 f7485m;

    /* renamed from: n  reason: collision with root package name */
    public final n f7486n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7487o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f7488p;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends e.x.c.k implements e.x.b.a<e.a.a.a.x0.h<? extends Member>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f7489h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Object f7490i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2, Object obj) {
            super(0);
            this.f7489h = i2;
            this.f7490i = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01bd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e() {
            /*
                r14 = this;
                e.a.a.a.x0.a$b r4 = e.a.a.a.x0.a.b.JAVA
                e.a.a.a.x0.a$b r9 = e.a.a.a.x0.a.b.KOTLIN
                int r0 = r14.f7489h
                java.lang.String r1 = "it"
                r2 = 0
                java.lang.String r3 = "desc"
                r5 = 10
                if (r0 == 0) goto L_0x01cc
                r6 = 0
                r7 = 1
                if (r0 != r7) goto L_0x01cb
                e.a.a.a.x0.a$a r8 = e.a.a.a.x0.a.C0133a.CALL_BY_NAME
                e.a.a.a.t0 r0 = e.a.a.a.t0.f7583b
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.y0.b.s r0 = r0.D()
                e.a.a.a.e r0 = e.a.a.a.t0.d(r0)
                boolean r10 = r0 instanceof e.a.a.a.e.C0130e
                if (r10 == 0) goto L_0x009d
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.n r8 = r1.f7486n
                e.a.a.a.e$e r0 = (e.a.a.a.e.C0130e) r0
                e.a.a.a.y0.e.a0.b.e$b r0 = r0.f7521b
                java.lang.String r4 = r0.a
                java.lang.String r0 = r0.f8766b
                e.a.a.a.x0.h r1 = r1.u()
                java.lang.reflect.Member r1 = r1.e()
                e.x.c.i.c(r1)
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                r13 = r1 ^ 1
                java.util.Objects.requireNonNull(r8)
                java.lang.String r1 = "name"
                e.x.c.i.e(r4, r1)
                e.x.c.i.e(r0, r3)
                java.lang.String r1 = "<init>"
                boolean r1 = e.x.c.i.a(r4, r1)
                if (r1 == 0) goto L_0x005f
                goto L_0x0151
            L_0x005f:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                if (r13 == 0) goto L_0x006d
                java.lang.Class r3 = r8.e()
                r1.add(r3)
            L_0x006d:
                r8.p(r1, r0, r2)
                java.lang.Class r9 = r8.E()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = "$default"
                r3.append(r4)
                java.lang.String r10 = r3.toString()
                java.lang.Class[] r2 = new java.lang.Class[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r1, r2)
                r11 = r1
                java.lang.Class[] r11 = (java.lang.Class[]) r11
                java.lang.Class r12 = r8.H(r0)
                java.lang.reflect.Method r0 = r8.I(r9, r10, r11, r12, r13)
                goto L_0x0152
            L_0x009d:
                boolean r2 = r0 instanceof e.a.a.a.e.d
                if (r2 == 0) goto L_0x010f
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                boolean r1 = r1.E()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.n r0 = r0.f7486n
                java.lang.Class r6 = r0.e()
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                java.util.List r0 = r0.g()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r1 = b.q.a.a.C(r0, r5)
                r7.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x00ca:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00e1
                java.lang.Object r1 = r0.next()
                e.a.k r1 = (e.a.k) r1
                java.lang.String r1 = r1.getName()
                e.x.c.i.c(r1)
                r7.add(r1)
                goto L_0x00ca
            L_0x00e1:
                r10 = 0
                r11 = 16
                e.a.a.a.x0.a r0 = new e.a.a.a.x0.a
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                goto L_0x01ca
            L_0x00ec:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.n r1 = r1.f7486n
                e.a.a.a.e$d r0 = (e.a.a.a.e.d) r0
                e.a.a.a.y0.e.a0.b.e$b r0 = r0.f7520b
                java.lang.String r0 = r0.f8766b
                java.util.Objects.requireNonNull(r1)
                e.x.c.i.e(r0, r3)
                java.lang.Class r2 = r1.e()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.p(r3, r0, r7)
                java.lang.reflect.Constructor r0 = r1.K(r2, r3)
                goto L_0x0152
            L_0x010f:
                boolean r2 = r0 instanceof e.a.a.a.e.a
                if (r2 == 0) goto L_0x0151
                e.a.a.a.e$a r0 = (e.a.a.a.e.a) r0
                java.util.List<java.lang.reflect.Method> r6 = r0.a
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.n r0 = r0.f7486n
                java.lang.Class r2 = r0.e()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = b.q.a.a.C(r6, r5)
                r3.<init>(r0)
                java.util.Iterator r0 = r6.iterator()
            L_0x012e:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x0145
                java.lang.Object r5 = r0.next()
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                e.x.c.i.d(r5, r1)
                java.lang.String r5 = r5.getName()
                r3.add(r5)
                goto L_0x012e
            L_0x0145:
                e.a.a.a.x0.a r7 = new e.a.a.a.x0.a
                r0 = r7
                r1 = r2
                r2 = r3
                r3 = r8
                r5 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                goto L_0x01ca
            L_0x0151:
                r0 = r6
            L_0x0152:
                boolean r1 = r0 instanceof java.lang.reflect.Constructor
                if (r1 == 0) goto L_0x0165
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                e.a.a.a.y0.b.s r2 = r1.D()
                e.a.a.a.x0.i r0 = e.a.a.a.b.G(r1, r0, r2)
                goto L_0x01bb
            L_0x0165:
                boolean r1 = r0 instanceof java.lang.reflect.Method
                if (r1 == 0) goto L_0x01ba
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.y0.b.s r1 = r1.D()
                e.a.a.a.y0.b.a1.h r1 = r1.k()
                e.a.a.a.y0.f.b r2 = e.a.a.a.v0.a
                e.a.a.a.y0.b.a1.c r1 = r1.i(r2)
                if (r1 == 0) goto L_0x01af
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.y0.b.s r1 = r1.D()
                e.a.a.a.y0.b.k r1 = r1.b()
                java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                java.util.Objects.requireNonNull(r1, r2)
                e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
                boolean r1 = r1.N()
                if (r1 != 0) goto L_0x01af
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r1 = r1.F()
                if (r1 == 0) goto L_0x01a8
                e.a.a.a.x0.i$g$b r1 = new e.a.a.a.x0.i$g$b
                r1.<init>(r0)
                goto L_0x01ad
            L_0x01a8:
                e.a.a.a.x0.i$g$e r1 = new e.a.a.a.x0.i$g$e
                r1.<init>(r0)
            L_0x01ad:
                r0 = r1
                goto L_0x01bb
            L_0x01af:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                e.a.a.a.x0.i$g r0 = e.a.a.a.b.H(r1, r0)
                goto L_0x01bb
            L_0x01ba:
                r0 = r6
            L_0x01bb:
                if (r0 == 0) goto L_0x01c9
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.y0.b.s r1 = r1.D()
                e.a.a.a.x0.h r6 = b.q.a.a.b0(r0, r1, r7)
            L_0x01c9:
                r0 = r6
            L_0x01ca:
                return r0
            L_0x01cb:
                throw r6
            L_0x01cc:
                e.a.a.a.x0.a$a r8 = e.a.a.a.x0.a.C0133a.POSITIONAL_CALL
                e.a.a.a.t0 r0 = e.a.a.a.t0.f7583b
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.y0.b.s r0 = r0.D()
                e.a.a.a.e r0 = e.a.a.a.t0.d(r0)
                boolean r6 = r0 instanceof e.a.a.a.e.d
                if (r6 == 0) goto L_0x024a
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                boolean r1 = r1.E()
                if (r1 == 0) goto L_0x022b
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.n r0 = r0.f7486n
                java.lang.Class r6 = r0.e()
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                java.util.List r0 = r0.g()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r1 = b.q.a.a.C(r0, r5)
                r7.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x0209:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0220
                java.lang.Object r1 = r0.next()
                e.a.k r1 = (e.a.k) r1
                java.lang.String r1 = r1.getName()
                e.x.c.i.c(r1)
                r7.add(r1)
                goto L_0x0209
            L_0x0220:
                r10 = 0
                r11 = 16
                e.a.a.a.x0.a r0 = new e.a.a.a.x0.a
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                goto L_0x035c
            L_0x022b:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.n r1 = r1.f7486n
                e.a.a.a.e$d r0 = (e.a.a.a.e.d) r0
                e.a.a.a.y0.e.a0.b.e$b r0 = r0.f7520b
                java.lang.String r0 = r0.f8766b
                java.util.Objects.requireNonNull(r1)
                e.x.c.i.e(r0, r3)
                java.lang.Class r3 = r1.e()
                java.util.List r0 = r1.G(r0)
                java.lang.reflect.Constructor r0 = r1.K(r3, r0)
                goto L_0x0272
            L_0x024a:
                boolean r3 = r0 instanceof e.a.a.a.e.C0130e
                if (r3 == 0) goto L_0x0261
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.n r1 = r1.f7486n
                e.a.a.a.e$e r0 = (e.a.a.a.e.C0130e) r0
                e.a.a.a.y0.e.a0.b.e$b r0 = r0.f7521b
                java.lang.String r3 = r0.a
                java.lang.String r0 = r0.f8766b
                java.lang.reflect.Method r0 = r1.r(r3, r0)
                goto L_0x0272
            L_0x0261:
                boolean r3 = r0 instanceof e.a.a.a.e.c
                if (r3 == 0) goto L_0x026a
                e.a.a.a.e$c r0 = (e.a.a.a.e.c) r0
                java.lang.reflect.Method r0 = r0.a
                goto L_0x0272
            L_0x026a:
                boolean r3 = r0 instanceof e.a.a.a.e.b
                if (r3 == 0) goto L_0x031c
                e.a.a.a.e$b r0 = (e.a.a.a.e.b) r0
                java.lang.reflect.Constructor<?> r0 = r0.a
            L_0x0272:
                boolean r1 = r0 instanceof java.lang.reflect.Constructor
                if (r1 == 0) goto L_0x0285
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                e.a.a.a.y0.b.s r3 = r1.D()
                e.a.a.a.x0.i r0 = e.a.a.a.b.G(r1, r0, r3)
                goto L_0x02e3
            L_0x0285:
                boolean r1 = r0 instanceof java.lang.reflect.Method
                if (r1 == 0) goto L_0x02f0
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                int r1 = r0.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x02b1
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                boolean r3 = r1.F()
                if (r3 == 0) goto L_0x02aa
                e.a.a.a.x0.i$g$a r3 = new e.a.a.a.x0.i$g$a
                java.lang.Object r1 = r1.I()
                r3.<init>(r0, r1)
                r0 = r3
                goto L_0x02e3
            L_0x02aa:
                e.a.a.a.x0.i$g$d r1 = new e.a.a.a.x0.i$g$d
                r1.<init>(r0)
            L_0x02af:
                r0 = r1
                goto L_0x02e3
            L_0x02b1:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.y0.b.s r1 = r1.D()
                e.a.a.a.y0.b.a1.h r1 = r1.k()
                e.a.a.a.y0.f.b r3 = e.a.a.a.v0.a
                e.a.a.a.y0.b.a1.c r1 = r1.i(r3)
                if (r1 == 0) goto L_0x02db
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                boolean r1 = r1.F()
                if (r1 == 0) goto L_0x02d5
                e.a.a.a.x0.i$g$b r1 = new e.a.a.a.x0.i$g$b
                r1.<init>(r0)
                goto L_0x02af
            L_0x02d5:
                e.a.a.a.x0.i$g$e r1 = new e.a.a.a.x0.i$g$e
                r1.<init>(r0)
                goto L_0x02af
            L_0x02db:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.x0.i$g r0 = e.a.a.a.b.H(r1, r0)
            L_0x02e3:
                java.lang.Object r1 = r14.f7490i
                e.a.a.a.b r1 = (e.a.a.a.b) r1
                e.a.a.a.y0.b.s r1 = r1.D()
                e.a.a.a.x0.h r0 = b.q.a.a.b0(r0, r1, r2)
                goto L_0x035c
            L_0x02f0:
                e.a.a.a.l0 r1 = new e.a.a.a.l0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Could not compute caller for function: "
                r2.append(r3)
                java.lang.Object r3 = r14.f7490i
                e.a.a.a.b r3 = (e.a.a.a.b) r3
                e.a.a.a.y0.b.s r3 = r3.D()
                r2.append(r3)
                java.lang.String r3 = " (member = "
                r2.append(r3)
                r2.append(r0)
                r0 = 41
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x031c:
                boolean r2 = r0 instanceof e.a.a.a.e.a
                if (r2 == 0) goto L_0x035d
                e.a.a.a.e$a r0 = (e.a.a.a.e.a) r0
                java.util.List<java.lang.reflect.Method> r6 = r0.a
                java.lang.Object r0 = r14.f7490i
                e.a.a.a.b r0 = (e.a.a.a.b) r0
                e.a.a.a.n r0 = r0.f7486n
                java.lang.Class r2 = r0.e()
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = b.q.a.a.C(r6, r5)
                r3.<init>(r0)
                java.util.Iterator r0 = r6.iterator()
            L_0x033b:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x0352
                java.lang.Object r5 = r0.next()
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                e.x.c.i.d(r5, r1)
                java.lang.String r5 = r5.getName()
                r3.add(r5)
                goto L_0x033b
            L_0x0352:
                e.a.a.a.x0.a r7 = new e.a.a.a.x0.a
                r0 = r7
                r1 = r2
                r2 = r3
                r3 = r8
                r5 = r6
                r0.<init>(r1, r2, r3, r4, r5)
            L_0x035c:
                return r0
            L_0x035d:
                e.h r0 = new e.h
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.b.a.e():java.lang.Object");
        }
    }

    /* renamed from: e.a.a.a.b$b  reason: collision with other inner class name */
    public static final class C0127b extends e.x.c.k implements e.x.b.a<e.a.a.a.y0.b.s> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b f7491h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f7492i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0127b(b bVar, String str) {
            super(0);
            this.f7491h = bVar;
            this.f7492i = str;
        }

        public Object e() {
            Iterable iterable;
            String str;
            b bVar = this.f7491h;
            n nVar = bVar.f7486n;
            String str2 = this.f7492i;
            String str3 = bVar.f7487o;
            Objects.requireNonNull(nVar);
            e.x.c.i.e(str2, "name");
            e.x.c.i.e(str3, "signature");
            if (e.x.c.i.a(str2, "<init>")) {
                iterable = e.t.g.W(nVar.s());
            } else {
                e.a.a.a.y0.f.d l2 = e.a.a.a.y0.f.d.l(str2);
                e.x.c.i.d(l2, "Name.identifier(name)");
                iterable = nVar.B(l2);
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable2) {
                t0 t0Var = t0.f7583b;
                if (e.x.c.i.a(t0.d((e.a.a.a.y0.b.s) next).a(), str3)) {
                    arrayList.add(next);
                }
            }
            boolean z = true;
            if (arrayList.size() == 1) {
                return (e.a.a.a.y0.b.s) e.t.g.O(arrayList);
            }
            String x = e.t.g.x(iterable2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, o.f7570h, 30);
            StringBuilder sb = new StringBuilder();
            sb.append("Function '");
            sb.append(str2);
            sb.append("' (JVM signature: ");
            sb.append(str3);
            sb.append(") not resolved in ");
            sb.append(nVar);
            sb.append(':');
            if (x.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = 10 + x;
            }
            sb.append(str);
            throw new l0(sb.toString());
        }
    }

    static {
        Class<b> cls = b.class;
        f7482q = new e.a.l[]{e.x.c.v.c(new e.x.c.q(e.x.c.v.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), e.x.c.v.c(new e.x.c.q(e.x.c.v.a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), e.x.c.v.c(new e.x.c.q(e.x.c.v.a(cls), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    }

    public b(n nVar, String str, String str2, e.a.a.a.y0.b.s sVar, Object obj) {
        this.f7486n = nVar;
        this.f7487o = str2;
        this.f7488p = obj;
        this.f7483k = b.q.a.a.j2(sVar, new C0127b(this, str));
        this.f7484l = new o0(new a(0, this));
        this.f7485m = new o0(new a(1, this));
    }

    public static final e.a.a.a.x0.i G(b bVar, Constructor constructor, e.a.a.a.y0.b.s sVar) {
        Objects.requireNonNull(bVar);
        e.x.c.i.e(sVar, "descriptor");
        if (!(sVar instanceof e.a.a.a.y0.b.d)) {
            sVar = null;
        }
        e.a.a.a.y0.b.d dVar = (e.a.a.a.y0.b.d) sVar;
        boolean z = false;
        if (dVar != null && !y0.e(dVar.getVisibility())) {
            e.a.a.a.y0.b.e T = dVar.T();
            e.x.c.i.d(T, "constructorDescriptor.constructedClass");
            if (!T.l() && !e.a.a.a.y0.j.g.v(dVar.T())) {
                List<w0> n2 = dVar.n();
                e.x.c.i.d(n2, "constructorDescriptor.valueParameters");
                if (!n2.isEmpty()) {
                    Iterator<T> it = n2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        w0 w0Var = (w0) it.next();
                        e.x.c.i.d(w0Var, "it");
                        d0 d = w0Var.d();
                        e.x.c.i.d(d, "it.type");
                        if (b.q.a.a.G2(d)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        boolean F = bVar.F();
        return z ? F ? new i.a(constructor, bVar.I()) : new i.b(constructor) : F ? new i.c(constructor, bVar.I()) : new i.d(constructor);
    }

    public static final i.g H(b bVar, Method method) {
        return bVar.F() ? new i.g.c(method, bVar.I()) : new i.g.f(method);
    }

    public n B() {
        return this.f7486n;
    }

    public e.a.a.a.x0.h<?> C() {
        o0 o0Var = this.f7485m;
        e.a.l lVar = f7482q[2];
        return (e.a.a.a.x0.h) o0Var.e();
    }

    public boolean F() {
        Object obj = this.f7488p;
        int i2 = e.x.c.b.f7970n;
        return !e.x.c.i.a(obj, b.a.f7977h);
    }

    public final Object I() {
        return b.q.a.a.B(this.f7488p, D());
    }

    /* renamed from: J */
    public e.a.a.a.y0.b.s D() {
        n0 n0Var = this.f7483k;
        e.a.l lVar = f7482q[0];
        return (e.a.a.a.y0.b.s) n0Var.e();
    }

    public Object e() {
        return n(new Object[0]);
    }

    public boolean equals(Object obj) {
        b b2 = v0.b(obj);
        if (b2 == null || !e.x.c.i.a(this.f7486n, b2.f7486n) || !e.x.c.i.a(getName(), b2.getName()) || !e.x.c.i.a(this.f7487o, b2.f7487o) || !e.x.c.i.a(this.f7488p, b2.f7488p)) {
            return false;
        }
        return true;
    }

    public int getArity() {
        return b.q.a.a.z0(u());
    }

    public String getName() {
        String e2 = D().getName().e();
        e.x.c.i.d(e2, "descriptor.name.asString()");
        return e2;
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return this.f7487o.hashCode() + ((hashCode + (this.f7486n.hashCode() * 31)) * 31);
    }

    public Object invoke(Object obj) {
        return n(obj);
    }

    public Object r(Object obj, Object obj2, Object obj3) {
        return n(obj, obj2, obj3);
    }

    public String toString() {
        r0 r0Var = r0.f7577b;
        return r0.c(D());
    }

    public e.a.a.a.x0.h<?> u() {
        o0 o0Var = this.f7484l;
        e.a.l lVar = f7482q[1];
        return (e.a.a.a.x0.h) o0Var.e();
    }

    public Object invoke(Object obj, Object obj2) {
        return n(obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return n(obj, obj2, obj3, obj4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(e.a.a.a.n r8, e.a.a.a.y0.b.s r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            e.x.c.i.e(r8, r0)
            java.lang.String r0 = "descriptor"
            e.x.c.i.e(r9, r0)
            e.a.a.a.y0.f.d r0 = r9.getName()
            java.lang.String r3 = r0.e()
            java.lang.String r0 = "descriptor.name.asString()"
            e.x.c.i.d(r3, r0)
            e.a.a.a.t0 r0 = e.a.a.a.t0.f7583b
            e.a.a.a.e r0 = e.a.a.a.t0.d(r9)
            java.lang.String r4 = r0.a()
            e.x.c.b$a r6 = e.x.c.b.a.f7977h
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.b.<init>(e.a.a.a.n, e.a.a.a.y0.b.s):void");
    }
}
