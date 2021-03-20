package b.l.a.c.i.b;

import b.l.a.c.f.i.k0;

public final class u9 extends v9 {

    /* renamed from: g  reason: collision with root package name */
    public final k0 f4306g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x9 f4307h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u9(x9 x9Var, String str, int i2, k0 k0Var) {
        super(str, i2);
        this.f4307h = x9Var;
        this.f4306g = k0Var;
    }

    public final int a() {
        return this.f4306g.t();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return this.f4306g.y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0199, code lost:
        if (r4.booleanValue() == false) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ba, code lost:
        r2.b(r5, r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0454 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0455  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Long r18, java.lang.Long r19, b.l.a.c.f.i.o1 r20, long r21, b.l.a.c.i.b.o r23, boolean r24) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            b.l.a.c.f.i.f9.b()
            b.l.a.c.i.b.x9 r3 = r0.f4307h
            b.l.a.c.i.b.l4 r3 = r3.a
            b.l.a.c.i.b.f r3 = r3.f4114g
            java.lang.String r4 = r0.a
            b.l.a.c.i.b.w2<java.lang.Boolean> r5 = b.l.a.c.i.b.x2.b0
            boolean r3 = r3.r(r4, r5)
            b.l.a.c.f.i.k0 r4 = r0.f4306g
            boolean r4 = r4.D()
            if (r4 == 0) goto L_0x0024
            r4 = r23
            long r4 = r4.f4181e
            goto L_0x0026
        L_0x0024:
            r4 = r21
        L_0x0026:
            b.l.a.c.i.b.x9 r6 = r0.f4307h
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.k3 r6 = r6.a()
            java.lang.String r6 = r6.v()
            r7 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r7)
            java.lang.String r7 = "null"
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x011f
            b.l.a.c.i.b.x9 r6 = r0.f4307h
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.k3 r6 = r6.a()
            b.l.a.c.i.b.i3 r6 = r6.f4096n
            int r10 = r0.f4323b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            b.l.a.c.f.i.k0 r11 = r0.f4306g
            boolean r11 = r11.s()
            if (r11 == 0) goto L_0x0060
            b.l.a.c.f.i.k0 r11 = r0.f4306g
            int r11 = r11.t()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            b.l.a.c.i.b.x9 r12 = r0.f4307h
            b.l.a.c.i.b.l4 r12 = r12.a
            b.l.a.c.i.b.f3 r12 = r12.u()
            b.l.a.c.f.i.k0 r13 = r0.f4306g
            java.lang.String r13 = r13.u()
            java.lang.String r12 = r12.p(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r6.d(r13, r10, r11, r12)
            b.l.a.c.i.b.x9 r6 = r0.f4307h
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.k3 r6 = r6.a()
            b.l.a.c.i.b.i3 r6 = r6.f4096n
            b.l.a.c.i.b.x9 r10 = r0.f4307h
            b.l.a.c.i.b.d9 r10 = r10.f4305b
            b.l.a.c.i.b.f9 r10 = r10.P()
            b.l.a.c.f.i.k0 r11 = r0.f4306g
            java.util.Objects.requireNonNull(r10)
            if (r11 != 0) goto L_0x0094
            r10 = r7
            goto L_0x011a
        L_0x0094:
            java.lang.String r12 = "\nevent_filter {\n"
            java.lang.StringBuilder r12 = b.e.a.a.a.y(r12)
            boolean r13 = r11.s()
            if (r13 == 0) goto L_0x00ad
            int r13 = r11.t()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "filter_id"
            b.l.a.c.i.b.f9.r(r12, r8, r14, r13)
        L_0x00ad:
            b.l.a.c.i.b.l4 r13 = r10.a
            b.l.a.c.i.b.f3 r13 = r13.u()
            java.lang.String r14 = r11.u()
            java.lang.String r13 = r13.p(r14)
            java.lang.String r14 = "event_name"
            b.l.a.c.i.b.f9.r(r12, r8, r14, r13)
            boolean r13 = r11.A()
            boolean r14 = r11.B()
            boolean r15 = r11.D()
            java.lang.String r13 = b.l.a.c.i.b.f9.p(r13, r14, r15)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x00db
            java.lang.String r14 = "filter_type"
            b.l.a.c.i.b.f9.r(r12, r8, r14, r13)
        L_0x00db:
            boolean r13 = r11.y()
            if (r13 == 0) goto L_0x00ea
            b.l.a.c.f.i.r0 r13 = r11.z()
            java.lang.String r14 = "event_count_filter"
            b.l.a.c.i.b.f9.s(r12, r9, r14, r13)
        L_0x00ea:
            int r13 = r11.w()
            if (r13 <= 0) goto L_0x010e
            java.lang.String r13 = "  filters {\n"
            r12.append(r13)
            java.util.List r11 = r11.v()
            java.util.Iterator r11 = r11.iterator()
        L_0x00fd:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x010e
            java.lang.Object r13 = r11.next()
            b.l.a.c.f.i.m0 r13 = (b.l.a.c.f.i.m0) r13
            r14 = 2
            r10.n(r12, r14, r13)
            goto L_0x00fd
        L_0x010e:
            b.l.a.c.i.b.f9.o(r12, r9)
            java.lang.String r10 = "}\n}\n"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
        L_0x011a:
            java.lang.String r11 = "Filter definition"
            r6.b(r11, r10)
        L_0x011f:
            b.l.a.c.f.i.k0 r6 = r0.f4306g
            boolean r6 = r6.s()
            if (r6 == 0) goto L_0x0497
            b.l.a.c.f.i.k0 r6 = r0.f4306g
            int r6 = r6.t()
            r10 = 256(0x100, float:3.59E-43)
            if (r6 <= r10) goto L_0x0133
            goto L_0x0497
        L_0x0133:
            b.l.a.c.f.i.k0 r6 = r0.f4306g
            boolean r6 = r6.A()
            b.l.a.c.f.i.k0 r10 = r0.f4306g
            boolean r10 = r10.B()
            b.l.a.c.f.i.k0 r11 = r0.f4306g
            boolean r11 = r11.D()
            if (r6 != 0) goto L_0x014e
            if (r10 != 0) goto L_0x014e
            if (r11 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r6 = r8
            goto L_0x014f
        L_0x014e:
            r6 = r9
        L_0x014f:
            if (r24 == 0) goto L_0x017d
            if (r6 != 0) goto L_0x017d
            b.l.a.c.i.b.x9 r1 = r0.f4307h
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f4096n
            int r2 = r0.f4323b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            b.l.a.c.f.i.k0 r3 = r0.f4306g
            boolean r3 = r3.s()
            if (r3 == 0) goto L_0x0176
            b.l.a.c.f.i.k0 r3 = r0.f4306g
            int r3 = r3.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0177
        L_0x0176:
            r3 = 0
        L_0x0177:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r3)
            return r9
        L_0x017d:
            b.l.a.c.f.i.k0 r10 = r0.f4306g
            java.lang.String r11 = r20.v()
            boolean r12 = r10.y()
            if (r12 == 0) goto L_0x019d
            b.l.a.c.f.i.r0 r12 = r10.z()
            java.lang.Boolean r4 = b.l.a.c.i.b.v9.f(r4, r12)
            if (r4 != 0) goto L_0x0195
            goto L_0x043c
        L_0x0195:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x019d
            goto L_0x043f
        L_0x019d:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r10.v()
            java.util.Iterator r5 = r5.iterator()
        L_0x01aa:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x01e2
            java.lang.Object r12 = r5.next()
            b.l.a.c.f.i.m0 r12 = (b.l.a.c.f.i.m0) r12
            java.lang.String r13 = r12.z()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x01da
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            java.lang.String r5 = "null or empty param name in filter. event"
            goto L_0x02ba
        L_0x01da:
            java.lang.String r12 = r12.z()
            r4.add(r12)
            goto L_0x01aa
        L_0x01e2:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.util.List r12 = r20.s()
            java.util.Iterator r12 = r12.iterator()
        L_0x01ef:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0275
            java.lang.Object r13 = r12.next()
            b.l.a.c.f.i.s1 r13 = (b.l.a.c.f.i.s1) r13
            java.lang.String r14 = r13.t()
            boolean r14 = r4.contains(r14)
            if (r14 == 0) goto L_0x01ef
            boolean r14 = r13.w()
            if (r14 == 0) goto L_0x021e
            java.lang.String r14 = r13.t()
            boolean r15 = r13.w()
            if (r15 == 0) goto L_0x0237
            long r15 = r13.x()
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            goto L_0x0247
        L_0x021e:
            boolean r14 = r13.A()
            if (r14 == 0) goto L_0x0239
            java.lang.String r14 = r13.t()
            boolean r15 = r13.A()
            if (r15 == 0) goto L_0x0237
            double r15 = r13.B()
            java.lang.Double r13 = java.lang.Double.valueOf(r15)
            goto L_0x0247
        L_0x0237:
            r13 = 0
            goto L_0x0247
        L_0x0239:
            boolean r14 = r13.u()
            if (r14 == 0) goto L_0x024b
            java.lang.String r14 = r13.t()
            java.lang.String r13 = r13.v()
        L_0x0247:
            r5.put(r14, r13)
            goto L_0x01ef
        L_0x024b:
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r10 = r13.t()
            java.lang.String r5 = r5.q(r10)
            java.lang.String r10 = "Unknown value for param. event, param"
            goto L_0x0439
        L_0x0275:
            java.util.List r4 = r10.v()
            java.util.Iterator r4 = r4.iterator()
        L_0x027d:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x043e
            java.lang.Object r10 = r4.next()
            b.l.a.c.f.i.m0 r10 = (b.l.a.c.f.i.m0) r10
            boolean r12 = r10.w()
            if (r12 == 0) goto L_0x0297
            boolean r12 = r10.x()
            if (r12 == 0) goto L_0x0297
            r12 = r9
            goto L_0x0298
        L_0x0297:
            r12 = r8
        L_0x0298:
            java.lang.String r13 = r10.z()
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x02bf
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            java.lang.String r5 = "Event has empty param name. event"
        L_0x02ba:
            r2.b(r5, r4)
            goto L_0x043c
        L_0x02bf:
            java.lang.Object r14 = r5.get(r13)
            boolean r15 = r14 instanceof java.lang.Long
            if (r15 == 0) goto L_0x030d
            boolean r15 = r10.u()
            if (r15 != 0) goto L_0x02f3
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.q(r13)
            java.lang.String r10 = "No number filter for long param. event, param"
            goto L_0x0439
        L_0x02f3:
            java.lang.Long r14 = (java.lang.Long) r14
            long r13 = r14.longValue()
            b.l.a.c.f.i.r0 r10 = r10.v()
            java.lang.Boolean r10 = b.l.a.c.i.b.v9.f(r13, r10)
            if (r10 != 0) goto L_0x0305
            goto L_0x043c
        L_0x0305:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x027d
            goto L_0x043f
        L_0x030d:
            boolean r15 = r14 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0362
            boolean r15 = r10.u()
            if (r15 != 0) goto L_0x033d
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.q(r13)
            java.lang.String r10 = "No number filter for double param. event, param"
            goto L_0x0439
        L_0x033d:
            java.lang.Double r14 = (java.lang.Double) r14
            double r13 = r14.doubleValue()
            b.l.a.c.f.i.r0 r10 = r10.v()
            java.math.BigDecimal r15 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0355 }
            r15.<init>(r13)     // Catch:{ NumberFormatException -> 0x0355 }
            double r13 = java.lang.Math.ulp(r13)     // Catch:{ NumberFormatException -> 0x0355 }
            java.lang.Boolean r10 = b.l.a.c.i.b.v9.h(r15, r10, r13)     // Catch:{ NumberFormatException -> 0x0355 }
            goto L_0x0356
        L_0x0355:
            r10 = 0
        L_0x0356:
            if (r10 != 0) goto L_0x035a
            goto L_0x043c
        L_0x035a:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x027d
            goto L_0x043f
        L_0x0362:
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L_0x03eb
            boolean r15 = r10.s()
            if (r15 == 0) goto L_0x037f
            java.lang.String r14 = (java.lang.String) r14
            b.l.a.c.f.i.x0 r10 = r10.t()
            b.l.a.c.i.b.x9 r13 = r0.f4307h
            b.l.a.c.i.b.l4 r13 = r13.a
            b.l.a.c.i.b.k3 r13 = r13.a()
            java.lang.Boolean r10 = b.l.a.c.i.b.v9.e(r14, r10, r13)
            goto L_0x0395
        L_0x037f:
            boolean r15 = r10.u()
            if (r15 == 0) goto L_0x03c6
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = b.l.a.c.i.b.f9.z(r14)
            if (r15 == 0) goto L_0x03a1
            b.l.a.c.f.i.r0 r10 = r10.v()
            java.lang.Boolean r10 = b.l.a.c.i.b.v9.g(r14, r10)
        L_0x0395:
            if (r10 != 0) goto L_0x0399
            goto L_0x043c
        L_0x0399:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x027d
            goto L_0x043f
        L_0x03a1:
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.q(r13)
            java.lang.String r10 = "Invalid param value for number filter. event, param"
            goto L_0x0439
        L_0x03c6:
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.q(r13)
            java.lang.String r10 = "No filter for String param. event, param"
            goto L_0x0439
        L_0x03eb:
            if (r14 != 0) goto L_0x0415
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f4096n
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.p(r11)
            b.l.a.c.i.b.x9 r10 = r0.f4307h
            b.l.a.c.i.b.l4 r10 = r10.a
            b.l.a.c.i.b.f3 r10 = r10.u()
            java.lang.String r10 = r10.q(r13)
            java.lang.String r11 = "Missing param for filter. event, param"
            r4.c(r11, r5, r10)
            goto L_0x043f
        L_0x0415:
            b.l.a.c.i.b.x9 r2 = r0.f4307h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.p(r11)
            b.l.a.c.i.b.x9 r5 = r0.f4307h
            b.l.a.c.i.b.l4 r5 = r5.a
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r5 = r5.q(r13)
            java.lang.String r10 = "Unknown param type. event, param"
        L_0x0439:
            r2.c(r10, r4, r5)
        L_0x043c:
            r2 = 0
            goto L_0x043f
        L_0x043e:
            r2 = r1
        L_0x043f:
            b.l.a.c.i.b.x9 r4 = r0.f4307h
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f4096n
            if (r2 != 0) goto L_0x044c
            goto L_0x044d
        L_0x044c:
            r7 = r2
        L_0x044d:
            java.lang.String r5 = "Event filter result"
            r4.b(r5, r7)
            if (r2 != 0) goto L_0x0455
            return r8
        L_0x0455:
            r0.c = r1
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x045e
            return r9
        L_0x045e:
            r0.d = r1
            if (r6 == 0) goto L_0x0496
            boolean r1 = r20.w()
            if (r1 == 0) goto L_0x0496
            long r1 = r20.x()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            b.l.a.c.f.i.k0 r2 = r0.f4306g
            boolean r2 = r2.B()
            if (r2 == 0) goto L_0x0488
            if (r3 == 0) goto L_0x0485
            b.l.a.c.f.i.k0 r2 = r0.f4306g
            boolean r2 = r2.y()
            if (r2 != 0) goto L_0x0483
            goto L_0x0485
        L_0x0483:
            r1 = r18
        L_0x0485:
            r0.f = r1
            goto L_0x0496
        L_0x0488:
            if (r3 == 0) goto L_0x0494
            b.l.a.c.f.i.k0 r2 = r0.f4306g
            boolean r2 = r2.y()
            if (r2 == 0) goto L_0x0494
            r1 = r19
        L_0x0494:
            r0.f4324e = r1
        L_0x0496:
            return r9
        L_0x0497:
            b.l.a.c.i.b.x9 r1 = r0.f4307h
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f4091i
            java.lang.String r2 = r0.a
            java.lang.Object r2 = b.l.a.c.i.b.k3.t(r2)
            b.l.a.c.f.i.k0 r3 = r0.f4306g
            boolean r3 = r3.s()
            if (r3 == 0) goto L_0x04ba
            b.l.a.c.f.i.k0 r3 = r0.f4306g
            int r3 = r3.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x04bb
        L_0x04ba:
            r3 = 0
        L_0x04bb:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.c(r4, r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.u9.i(java.lang.Long, java.lang.Long, b.l.a.c.f.i.o1, long, b.l.a.c.i.b.o, boolean):boolean");
    }
}
