package e.a.a.a;

import e.a.a.a.x0.h;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.m.d0;
import e.a.k;
import e.a.n;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class g<R> implements e.a.d<R>, k0 {

    /* renamed from: h  reason: collision with root package name */
    public final n0<List<Annotation>> f7531h;

    /* renamed from: i  reason: collision with root package name */
    public final n0<ArrayList<k>> f7532i;

    /* renamed from: j  reason: collision with root package name */
    public final n0<i0> f7533j;

    public static final class a extends e.x.c.k implements e.x.b.a<List<? extends Annotation>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f7534h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(0);
            this.f7534h = gVar;
        }

        public Object e() {
            return v0.d(this.f7534h.D());
        }
    }

    public static final class b extends e.x.c.k implements e.x.b.a<ArrayList<k>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f7535h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.f7535h = gVar;
        }

        public Object e() {
            int i2;
            e.a.a.a.y0.b.b D = this.f7535h.D();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            if (!this.f7535h.F()) {
                i0 g2 = v0.g(D);
                if (g2 != null) {
                    arrayList.add(new w(this.f7535h, 0, k.a.INSTANCE, new f(0, g2)));
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i0 U = D.U();
                if (U != null) {
                    arrayList.add(new w(this.f7535h, i2, k.a.EXTENSION_RECEIVER, new f(1, U)));
                    i2++;
                }
            } else {
                i2 = 0;
            }
            List<w0> n2 = D.n();
            i.d(n2, "descriptor.valueParameters");
            int size = n2.size();
            while (i3 < size) {
                arrayList.add(new w(this.f7535h, i2, k.a.VALUE, new i(D, i3)));
                i3++;
                i2++;
            }
            if (this.f7535h.E() && (D instanceof e.a.a.a.y0.d.a.a0.b) && arrayList.size() > 1) {
                b.q.a.a.W2(arrayList, new h());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    public static final class c extends e.x.c.k implements e.x.b.a<i0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f7536h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f7536h = gVar;
        }

        public Object e() {
            d0 f = this.f7536h.D().f();
            i.c(f);
            i.d(f, "descriptor.returnType!!");
            return new i0(f, new j(this));
        }
    }

    public static final class d extends e.x.c.k implements e.x.b.a<List<? extends j0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f7537h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f7537h = gVar;
        }

        public Object e() {
            List<r0> B = this.f7537h.D().B();
            i.d(B, "descriptor.typeParameters");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(B, 10));
            for (r0 r0Var : B) {
                g gVar = this.f7537h;
                i.d(r0Var, "descriptor");
                arrayList.add(new j0(gVar, r0Var));
            }
            return arrayList;
        }
    }

    public g() {
        n0<List<Annotation>> k2 = b.q.a.a.k2(new a(this));
        i.d(k2, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.f7531h = k2;
        n0<ArrayList<k>> k22 = b.q.a.a.k2(new b(this));
        i.d(k22, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.f7532i = k22;
        n0<i0> k23 = b.q.a.a.k2(new c(this));
        i.d(k23, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.f7533j = k23;
        i.d(b.q.a.a.k2(new d(this)), "ReflectProperties.lazySo…this, descriptor) }\n    }");
    }

    public abstract n B();

    public abstract h<?> C();

    public abstract e.a.a.a.y0.b.b D();

    public final boolean E() {
        return i.a(getName(), "<init>") && B().e().isAnnotation();
    }

    public abstract boolean F();

    public n f() {
        i0 e2 = this.f7533j.e();
        i.d(e2, "_returnType()");
        return e2;
    }

    public List<k> g() {
        ArrayList<k> e2 = this.f7532i.e();
        i.d(e2, "_parameters()");
        return e2;
    }

    public List<Annotation> k() {
        List<Annotation> e2 = this.f7531h.e();
        i.d(e2, "_annotations()");
        return e2;
    }

    public R n(Object... objArr) {
        i.e(objArr, "args");
        try {
            return u().n(objArr);
        } catch (IllegalAccessException e2) {
            throw new e.a.w.a(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        r9 = r9.f7548k;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00dd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R o(java.util.Map<e.a.k, ? extends java.lang.Object> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "args"
            e.x.c.i.e(r15, r0)
            boolean r1 = r14.E()
            java.lang.String r2 = "No argument provided for a required parameter: "
            java.lang.String r3 = "This callable does not support a default call: "
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x00c0
            java.util.List r0 = r14.g()
            java.util.ArrayList r1 = new java.util.ArrayList
            r7 = 10
            int r7 = b.q.a.a.C(r0, r7)
            r1.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r0.next()
            e.a.k r7 = (e.a.k) r7
            boolean r8 = r15.containsKey(r7)
            if (r8 == 0) goto L_0x005b
            java.lang.Object r8 = r15.get(r7)
            if (r8 == 0) goto L_0x003f
            goto L_0x0071
        L_0x003f:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Annotation argument value cannot be null ("
            r0.append(r1)
            r0.append(r7)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x005b:
            boolean r8 = r7.z()
            if (r8 == 0) goto L_0x0063
            r8 = r5
            goto L_0x0071
        L_0x0063:
            boolean r8 = r7.l()
            if (r8 == 0) goto L_0x0075
            e.a.n r7 = r7.d()
            java.lang.Object r8 = r14.s(r7)
        L_0x0071:
            r1.add(r8)
            goto L_0x0026
        L_0x0075:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x008a:
            e.a.a.a.x0.h r15 = r14.C()
            if (r15 == 0) goto L_0x00ab
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00a4 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ IllegalAccessException -> 0x00a4 }
            if (r0 == 0) goto L_0x009e
            java.lang.Object r15 = r15.n(r0)     // Catch:{ IllegalAccessException -> 0x00a4 }
            goto L_0x01aa
        L_0x009e:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x00a4 }
            r15.<init>(r4)     // Catch:{ IllegalAccessException -> 0x00a4 }
            throw r15     // Catch:{ IllegalAccessException -> 0x00a4 }
        L_0x00a4:
            r15 = move-exception
            e.a.w.a r0 = new e.a.w.a
            r0.<init>(r15)
            throw r0
        L_0x00ab:
            e.a.a.a.l0 r15 = new e.a.a.a.l0
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r3)
            e.a.a.a.y0.b.b r1 = r14.D()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00c0:
            e.x.c.i.e(r15, r0)
            java.util.List r0 = r14.g()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = r0.size()
            r1.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 1
            r7.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x00dd:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0176
            java.lang.Object r12 = r0.next()
            e.a.k r12 = (e.a.k) r12
            if (r10 == 0) goto L_0x00f7
            int r13 = r10 % 32
            if (r13 != 0) goto L_0x00f7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7.add(r11)
            r11 = r6
        L_0x00f7:
            boolean r13 = r15.containsKey(r12)
            if (r13 == 0) goto L_0x0102
            java.lang.Object r13 = r15.get(r12)
            goto L_0x0152
        L_0x0102:
            boolean r13 = r12.z()
            if (r13 == 0) goto L_0x0144
            e.a.n r9 = r12.d()
            e.a.a.a.y0.f.b r13 = e.a.a.a.v0.a
            java.lang.String r13 = "$this$isInlineClassType"
            e.x.c.i.e(r9, r13)
            boolean r13 = r9 instanceof e.a.a.a.i0
            if (r13 != 0) goto L_0x0118
            r9 = r5
        L_0x0118:
            e.a.a.a.i0 r9 = (e.a.a.a.i0) r9
            if (r9 == 0) goto L_0x0128
            e.a.a.a.y0.m.d0 r9 = r9.f7548k
            if (r9 == 0) goto L_0x0128
            boolean r9 = b.q.a.a.O1(r9)
            if (r9 != r8) goto L_0x0128
            r9 = r8
            goto L_0x0129
        L_0x0128:
            r9 = r6
        L_0x0129:
            if (r9 == 0) goto L_0x012d
            r9 = r5
            goto L_0x0139
        L_0x012d:
            e.a.n r9 = r12.d()
            java.lang.reflect.Type r9 = b.q.a.a.Q0(r9)
            java.lang.Object r9 = e.a.a.a.v0.e(r9)
        L_0x0139:
            r1.add(r9)
            int r9 = r10 % 32
            int r9 = r8 << r9
            r9 = r9 | r11
            r11 = r9
            r9 = r8
            goto L_0x0155
        L_0x0144:
            boolean r13 = r12.l()
            if (r13 == 0) goto L_0x0161
            e.a.n r13 = r12.d()
            java.lang.Object r13 = r14.s(r13)
        L_0x0152:
            r1.add(r13)
        L_0x0155:
            e.a.k$a r12 = r12.i()
            e.a.k$a r13 = e.a.k.a.VALUE
            if (r12 != r13) goto L_0x00dd
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x0161:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0176:
            if (r9 != 0) goto L_0x018b
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Object[] r15 = r1.toArray(r15)
            java.util.Objects.requireNonNull(r15, r4)
            int r0 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r0)
            java.lang.Object r15 = r14.n(r15)
            goto L_0x01aa
        L_0x018b:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r7.add(r15)
            e.a.a.a.x0.h r15 = r14.C()
            if (r15 == 0) goto L_0x01b8
            r1.addAll(r7)
            r1.add(r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x01b1 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ IllegalAccessException -> 0x01b1 }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r15 = r15.n(r0)     // Catch:{ IllegalAccessException -> 0x01b1 }
        L_0x01aa:
            return r15
        L_0x01ab:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ IllegalAccessException -> 0x01b1 }
            r15.<init>(r4)     // Catch:{ IllegalAccessException -> 0x01b1 }
            throw r15     // Catch:{ IllegalAccessException -> 0x01b1 }
        L_0x01b1:
            r15 = move-exception
            e.a.w.a r0 = new e.a.w.a
            r0.<init>(r15)
            throw r0
        L_0x01b8:
            e.a.a.a.l0 r15 = new e.a.a.a.l0
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r3)
            e.a.a.a.y0.b.b r1 = r14.D()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.g.o(java.util.Map):java.lang.Object");
    }

    public final Object s(n nVar) {
        Class<?> L0 = b.q.a.a.L0(b.q.a.a.S0(nVar));
        if (L0.isArray()) {
            Object newInstance = Array.newInstance(L0.getComponentType(), 0);
            i.d(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        StringBuilder y = b.e.a.a.a.y("Cannot instantiate the default empty array of type ");
        y.append(L0.getSimpleName());
        y.append(", because it is not an array type");
        throw new l0(y.toString());
    }

    public abstract h<?> u();
}
