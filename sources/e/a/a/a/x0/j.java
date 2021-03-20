package e.a.a.a.x0;

import e.a0.d;
import e.x.c.i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public final class j<M extends Member> implements h<M> {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final h<M> f7634b;
    public final boolean c;

    public static final class a {
        public final d a;

        /* renamed from: b  reason: collision with root package name */
        public final Method[] f7635b;
        public final Method c;

        public a(d dVar, Method[] methodArr, Method method) {
            i.e(dVar, "argumentRange");
            i.e(methodArr, "unbox");
            this.a = dVar;
            this.f7635b = methodArr;
            this.c = method;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if ((r11 instanceof e.a.a.a.x0.g) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        if (r1.l() != false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d A[LOOP:0: B:46:0x0107->B:48:0x010d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(e.a.a.a.y0.b.b r10, e.a.a.a.x0.h<? extends M> r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "descriptor"
            e.x.c.i.e(r10, r0)
            java.lang.String r1 = "caller"
            e.x.c.i.e(r11, r1)
            r9.<init>()
            r9.f7634b = r11
            r9.c = r12
            e.a.a.a.y0.m.d0 r1 = r10.f()
            e.x.c.i.c(r1)
            java.lang.String r2 = "descriptor.returnType!!"
            e.x.c.i.d(r1, r2)
            java.lang.Class r1 = b.q.a.a.f3(r1)
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0065
            java.lang.String r5 = "$this$getBoxMethod"
            e.x.c.i.e(r1, r5)
            e.x.c.i.e(r10, r0)
            java.lang.String r0 = "box-impl"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.reflect.Method r6 = b.q.a.a.i1(r1, r10)     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.Class r6 = r6.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0041 }
            r5[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0041 }
            goto L_0x0066
        L_0x0041:
            e.a.a.a.l0 r11 = new e.a.a.a.l0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "No box method found in inline class: "
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = " (calling "
            r12.append(r0)
            r12.append(r10)
            r10 = 41
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0065:
            r0 = r3
        L_0x0066:
            boolean r1 = b.q.a.a.L1(r10)
            if (r1 == 0) goto L_0x0079
            e.a.a.a.x0.j$a r10 = new e.a.a.a.x0.j$a
            e.a0.d r11 = e.a0.d.f7891l
            e.a0.d r11 = e.a0.d.f7890k
            java.lang.reflect.Method[] r12 = new java.lang.reflect.Method[r4]
            r10.<init>(r11, r12, r0)
            goto L_0x0164
        L_0x0079:
            boolean r1 = r11 instanceof e.a.a.a.x0.i.g.c
            java.lang.String r5 = "descriptor.containingDeclaration"
            r6 = -1
            if (r1 == 0) goto L_0x0081
            goto L_0x00a5
        L_0x0081:
            boolean r1 = r10 instanceof e.a.a.a.y0.b.j
            if (r1 == 0) goto L_0x008a
            boolean r11 = r11 instanceof e.a.a.a.x0.g
            if (r11 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x008a:
            e.a.a.a.y0.b.i0 r1 = r10.K()
            if (r1 == 0) goto L_0x00a4
            boolean r11 = r11 instanceof e.a.a.a.x0.g
            if (r11 != 0) goto L_0x00a4
            e.a.a.a.y0.b.k r11 = r10.b()
            e.x.c.i.d(r11, r5)
            boolean r11 = b.q.a.a.M1(r11)
            if (r11 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r6 = r2
            goto L_0x00a5
        L_0x00a4:
            r6 = r4
        L_0x00a5:
            if (r12 == 0) goto L_0x00a9
            r11 = 2
            goto L_0x00aa
        L_0x00a9:
            r11 = r4
        L_0x00aa:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            e.a.a.a.y0.b.i0 r1 = r10.U()
            if (r1 == 0) goto L_0x00ba
            e.a.a.a.y0.m.d0 r1 = r1.d()
            goto L_0x00bb
        L_0x00ba:
            r1 = r3
        L_0x00bb:
            if (r1 == 0) goto L_0x00be
            goto L_0x00f7
        L_0x00be:
            boolean r1 = r10 instanceof e.a.a.a.y0.b.j
            if (r1 == 0) goto L_0x00e0
            r1 = r10
            e.a.a.a.y0.b.j r1 = (e.a.a.a.y0.b.j) r1
            e.a.a.a.y0.b.e r1 = r1.T()
            java.lang.String r5 = "descriptor.constructedClass"
            e.x.c.i.d(r1, r5)
            boolean r5 = r1.t()
            if (r5 == 0) goto L_0x00fa
            e.a.a.a.y0.b.k r1 = r1.b()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r1, r5)
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            goto L_0x00f3
        L_0x00e0:
            e.a.a.a.y0.b.k r1 = r10.b()
            e.x.c.i.d(r1, r5)
            boolean r5 = r1 instanceof e.a.a.a.y0.b.e
            if (r5 == 0) goto L_0x00fa
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            boolean r5 = r1.l()
            if (r5 == 0) goto L_0x00fa
        L_0x00f3:
            e.a.a.a.y0.m.k0 r1 = r1.s()
        L_0x00f7:
            r12.add(r1)
        L_0x00fa:
            java.util.List r1 = r10.n()
            java.lang.String r5 = "descriptor.valueParameters"
            e.x.c.i.d(r1, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0107:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x011b
            java.lang.Object r5 = r1.next()
            e.a.a.a.y0.b.w0 r5 = (e.a.a.a.y0.b.w0) r5
            e.a.a.a.y0.m.d0 r5 = r5.d()
            r12.add(r5)
            goto L_0x0107
        L_0x011b:
            int r1 = r12.size()
            int r1 = r1 + r6
            int r1 = r1 + r11
            int r11 = b.q.a.a.z0(r9)
            if (r11 != r1) goto L_0x0167
            int r11 = java.lang.Math.max(r6, r4)
            int r5 = r12.size()
            int r5 = r5 + r6
            e.a0.d r11 = e.a0.e.d(r11, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r1]
            r7 = r4
        L_0x0137:
            if (r7 >= r1) goto L_0x015f
            int r8 = r11.f7883h
            if (r8 > r7) goto L_0x0143
            int r8 = r11.f7884i
            if (r7 > r8) goto L_0x0143
            r8 = r2
            goto L_0x0144
        L_0x0143:
            r8 = r4
        L_0x0144:
            if (r8 == 0) goto L_0x0159
            int r8 = r7 - r6
            java.lang.Object r8 = r12.get(r8)
            e.a.a.a.y0.m.d0 r8 = (e.a.a.a.y0.m.d0) r8
            java.lang.Class r8 = b.q.a.a.f3(r8)
            if (r8 == 0) goto L_0x0159
            java.lang.reflect.Method r8 = b.q.a.a.i1(r8, r10)
            goto L_0x015a
        L_0x0159:
            r8 = r3
        L_0x015a:
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0137
        L_0x015f:
            e.a.a.a.x0.j$a r10 = new e.a.a.a.x0.j$a
            r10.<init>(r11, r5, r0)
        L_0x0164:
            r9.a = r10
            return
        L_0x0167:
            e.a.a.a.l0 r11 = new e.a.a.a.l0
            java.lang.String r12 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            java.lang.StringBuilder r12 = b.e.a.a.a.y(r12)
            int r0 = b.q.a.a.z0(r9)
            r12.append(r0)
            java.lang.String r0 = " != "
            r12.append(r0)
            r12.append(r1)
            r0 = 10
            r12.append(r0)
            java.lang.String r1 = "Calling: "
            r12.append(r1)
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = "Parameter types: "
            r12.append(r10)
            java.util.List r10 = r9.a()
            r12.append(r10)
            java.lang.String r10 = ")\n"
            r12.append(r10)
            java.lang.String r10 = "Default: "
            r12.append(r10)
            boolean r10 = r9.c
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.j.<init>(e.a.a.a.y0.b.b, e.a.a.a.x0.h, boolean):void");
    }

    public List<Type> a() {
        return this.f7634b.a();
    }

    public M e() {
        return this.f7634b.e();
    }

    public Type f() {
        return this.f7634b.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            e.x.c.i.e(r10, r0)
            e.a.a.a.x0.j$a r0 = r9.a
            e.a0.d r1 = r0.a
            java.lang.reflect.Method[] r2 = r0.f7635b
            java.lang.reflect.Method r0 = r0.c
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            e.x.c.i.d(r3, r4)
            int r4 = r1.f7883h
            int r1 = r1.f7884i
            r5 = 0
            if (r4 > r1) goto L_0x0041
        L_0x001e:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x002d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
            goto L_0x003a
        L_0x002d:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r7 = "method.returnType"
            e.x.c.i.d(r6, r7)
            java.lang.Object r7 = e.a.a.a.v0.e(r6)
        L_0x003a:
            r3[r4] = r7
            if (r4 == r1) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0041:
            e.a.a.a.x0.h<M> r10 = r9.f7634b
            java.lang.Object r10 = r10.n(r3)
            if (r0 == 0) goto L_0x0056
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 == 0) goto L_0x0056
            r10 = r0
        L_0x0056:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.j.n(java.lang.Object[]):java.lang.Object");
    }
}
