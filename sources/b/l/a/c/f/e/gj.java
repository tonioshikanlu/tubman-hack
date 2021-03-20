package b.l.a.c.f.e;

import b.l.a.c.k.i;

public final class gj<ResultT, CallbackT> {
    public final hj<ResultT, CallbackT> a;

    /* renamed from: b  reason: collision with root package name */
    public final i<ResultT> f3016b;

    public gj(hj<ResultT, CallbackT> hjVar, i<ResultT> iVar) {
        this.a = hjVar;
        this.f3016b = iVar;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [b.l.d.o.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(ResultT r13, com.google.android.gms.common.api.Status r14) {
        /*
            r12 = this;
            b.l.a.c.k.i<ResultT> r0 = r12.f3016b
            java.lang.String r1 = "completion source cannot be null"
            b.l.a.c.b.a.B(r0, r1)
            if (r14 == 0) goto L_0x011e
            b.l.a.c.f.e.hj<ResultT, CallbackT> r13 = r12.a
            b.l.a.c.f.e.ve r0 = r13.f3044m
            if (r0 == 0) goto L_0x00d1
            b.l.a.c.k.i<ResultT> r14 = r12.f3016b
            b.l.d.d r13 = r13.c
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            b.l.a.c.f.e.hj<ResultT, CallbackT> r0 = r12.a
            b.l.a.c.f.e.ve r1 = r0.f3044m
            java.lang.String r0 = r0.a()
            java.lang.String r2 = "reauthenticateWithCredential"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            b.l.a.c.f.e.hj<ResultT, CallbackT> r0 = r12.a
            java.lang.String r0 = r0.a()
            java.lang.String r2 = "reauthenticateWithCredentialWithData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x003c
        L_0x0038:
            b.l.a.c.f.e.hj<ResultT, CallbackT> r0 = r12.a
            b.l.d.o.p r0 = r0.d
        L_0x003c:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = b.l.a.c.f.e.hi.a
            java.util.Objects.requireNonNull(r13)
            java.util.Objects.requireNonNull(r1)
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r2 = b.l.a.c.f.e.hi.a
            r3 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r2 = r2.get(r3)
            android.util.Pair r2 = (android.util.Pair) r2
            b.l.d.o.k r3 = new b.l.d.o.k
            java.lang.Object r4 = r2.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<b.l.a.c.f.e.vk> r5 = r1.f3355i
            java.util.List r5 = b.l.a.c.b.a.G1(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            b.l.d.o.t r6 = (b.l.d.o.t) r6
            boolean r8 = r6 instanceof b.l.d.o.y
            if (r8 == 0) goto L_0x0069
            b.l.d.o.y r6 = (b.l.d.o.y) r6
            r7.add(r6)
            goto L_0x0069
        L_0x007f:
            java.util.List<b.l.a.c.f.e.vk> r5 = r1.f3355i
            java.util.List r5 = b.l.a.c.b.a.G1(r5)
            java.lang.String r6 = r1.f3354h
            b.l.a.c.b.a.x(r6)
            b.l.d.o.e0.g r8 = new b.l.d.o.e0.g
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f4967j = r9
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x009c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00b4
            java.lang.Object r9 = r5.next()
            b.l.d.o.t r9 = (b.l.d.o.t) r9
            boolean r10 = r9 instanceof b.l.d.o.y
            if (r10 == 0) goto L_0x009c
            java.util.List<b.l.d.o.y> r10 = r8.f4967j
            b.l.d.o.y r9 = (b.l.d.o.y) r9
            r10.add(r9)
            goto L_0x009c
        L_0x00b4:
            r8.f4966i = r6
            b.l.d.o.e0.e r5 = new b.l.d.o.e0.e
            b.l.d.d r13 = r13.a
            r13.a()
            java.lang.String r9 = r13.f4912b
            b.l.d.o.n0 r10 = r1.f3356j
            r11 = r0
            b.l.d.o.e0.j0 r11 = (b.l.d.o.e0.j0) r11
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r3.<init>(r4, r2, r5)
            b.l.a.c.k.e0<TResult> r13 = r14.a
            r13.p(r3)
            return
        L_0x00d1:
            b.l.d.o.c r13 = r13.f3041j
            if (r13 == 0) goto L_0x0112
            b.l.a.c.k.i<ResultT> r13 = r12.f3016b
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r0 = b.l.a.c.f.e.hi.a
            int r0 = r14.f7263i
            r1 = 17012(0x4274, float:2.3839E-41)
            if (r0 == r1) goto L_0x00ed
            r1 = 17007(0x426f, float:2.3832E-41)
            if (r0 == r1) goto L_0x00ed
            r1 = 17025(0x4281, float:2.3857E-41)
            if (r0 != r1) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            b.l.d.i r14 = b.l.a.c.f.e.hi.a(r14)
            goto L_0x010c
        L_0x00ed:
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = b.l.a.c.f.e.hi.a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r1 = "An internal error has occurred."
        L_0x00fe:
            java.lang.String r14 = b.l.a.c.f.e.hi.b(r1, r14)
            b.l.d.o.m r1 = new b.l.d.o.m
            java.lang.String r0 = b.l.a.c.f.e.hi.c(r0)
            r1.<init>(r0, r14)
            r14 = r1
        L_0x010c:
            b.l.a.c.k.e0<TResult> r13 = r13.a
            r13.p(r14)
            return
        L_0x0112:
            b.l.a.c.k.i<ResultT> r13 = r12.f3016b
            b.l.d.i r14 = b.l.a.c.f.e.hi.a(r14)
            b.l.a.c.k.e0<TResult> r13 = r13.a
            r13.p(r14)
            return
        L_0x011e:
            b.l.a.c.k.i<ResultT> r14 = r12.f3016b
            b.l.a.c.k.e0<TResult> r14 = r14.a
            r14.q(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.gj.a(java.lang.Object, com.google.android.gms.common.api.Status):void");
    }
}
