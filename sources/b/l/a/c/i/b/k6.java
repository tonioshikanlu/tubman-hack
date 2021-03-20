package b.l.a.c.i.b;

import android.net.Uri;

public final class k6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f4100h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Uri f4101i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4102j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f4103k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ l6 f4104l;

    public k6(l6 l6Var, boolean z, Uri uri, String str, String str2) {
        this.f4104l = l6Var;
        this.f4100h = z;
        this.f4101i = uri;
        this.f4102j = str;
        this.f4103k = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2.f4125h.a.f4114g.r((java.lang.String) null, b.l.a.c.i.b.x2.e0) == false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[SYNTHETIC, Splitter:B:31:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2 A[Catch:{ Exception -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132 A[Catch:{ Exception -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0134 A[Catch:{ Exception -> 0x01bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            b.l.a.c.i.b.l6 r2 = r1.f4104l
            boolean r0 = r1.f4100h
            android.net.Uri r3 = r1.f4101i
            java.lang.String r4 = r1.f4102j
            java.lang.String r5 = r1.f4103k
            b.l.a.c.i.b.m6 r6 = r2.f4125h
            r6.h()
            b.l.a.c.i.b.m6 r6 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r6 = r6.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r6 = r6.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.d0     // Catch:{ Exception -> 0x01bb }
            r8 = 0
            boolean r6 = r6.r(r8, r7)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r14 = "gclid"
            if (r6 != 0) goto L_0x0048
            b.l.a.c.i.b.m6 r6 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r6 = r6.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r6 = r6.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r15 = b.l.a.c.i.b.x2.f0     // Catch:{ Exception -> 0x01bb }
            boolean r6 = r6.r(r8, r15)     // Catch:{ Exception -> 0x01bb }
            if (r6 != 0) goto L_0x0048
            b.l.a.c.i.b.m6 r6 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r6 = r6.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r6 = r6.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r15 = b.l.a.c.i.b.x2.e0     // Catch:{ Exception -> 0x01bb }
            boolean r6 = r6.r(r8, r15)     // Catch:{ Exception -> 0x01bb }
            if (r6 == 0) goto L_0x0056
        L_0x0048:
            b.l.a.c.i.b.m6 r6 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r6 = r6.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k9 r6 = r6.t()     // Catch:{ Exception -> 0x01bb }
            boolean r15 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r15 == 0) goto L_0x0058
        L_0x0056:
            r6 = r8
            goto L_0x009e
        L_0x0058:
            boolean r15 = r5.contains(r14)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r13)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r12)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            boolean r15 = r5.contains(r11)     // Catch:{ Exception -> 0x01bb }
            if (r15 != 0) goto L_0x007c
            b.l.a.c.i.b.l4 r6 = r6.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k3 r6 = r6.a()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.i3 r6 = r6.f4095m     // Catch:{ Exception -> 0x01bb }
            r6.a(r9)     // Catch:{ Exception -> 0x01bb }
            goto L_0x0056
        L_0x007c:
            java.lang.String r15 = "https://google.com/search?"
            int r16 = r5.length()     // Catch:{ Exception -> 0x01bb }
            if (r16 == 0) goto L_0x0089
            java.lang.String r15 = r15.concat(r5)     // Catch:{ Exception -> 0x01bb }
            goto L_0x008f
        L_0x0089:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x01bb }
            r8.<init>(r15)     // Catch:{ Exception -> 0x01bb }
            r15 = r8
        L_0x008f:
            android.net.Uri r8 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x01bb }
            android.os.Bundle r6 = r6.f0(r8)     // Catch:{ Exception -> 0x01bb }
            if (r6 == 0) goto L_0x009e
            java.lang.String r8 = "referrer"
            r6.putString(r10, r8)     // Catch:{ Exception -> 0x01bb }
        L_0x009e:
            java.lang.String r8 = "_cmp"
            if (r0 == 0) goto L_0x00f2
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k9 r0 = r0.t()     // Catch:{ Exception -> 0x01bb }
            android.os.Bundle r0 = r0.f0(r3)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x00f3
            java.lang.String r3 = "intent"
            r0.putString(r10, r3)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.m6 r3 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x00e5
            boolean r3 = r0.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 != 0) goto L_0x00e5
            if (r6 == 0) goto L_0x00e5
            boolean r3 = r6.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x00e5
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01bb }
            r7 = 0
            java.lang.String r10 = r6.getString(r14)     // Catch:{ Exception -> 0x01bb }
            r3[r7] = r10     // Catch:{ Exception -> 0x01bb }
            java.lang.String r7 = "_cer"
            java.lang.String r10 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r10, r3)     // Catch:{ Exception -> 0x01bb }
            r0.putString(r7, r3)     // Catch:{ Exception -> 0x01bb }
        L_0x00e5:
            b.l.a.c.i.b.m6 r3 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            r3.A(r4, r8, r0)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.m6 r3 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.r9 r3 = r3.f4156n     // Catch:{ Exception -> 0x01bb }
            r3.a(r4, r0)     // Catch:{ Exception -> 0x01bb }
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            b.l.a.c.i.b.m6 r3 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.f0     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x012c
            b.l.a.c.i.b.m6 r3 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.e0     // Catch:{ Exception -> 0x01bb }
            r10 = 0
            boolean r3 = r3.r(r10, r7)     // Catch:{ Exception -> 0x01bb }
            if (r3 != 0) goto L_0x012c
            if (r6 == 0) goto L_0x012c
            boolean r3 = r6.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r3 == 0) goto L_0x012c
            if (r0 == 0) goto L_0x0121
            boolean r0 = r0.containsKey(r14)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x012c
        L_0x0121:
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "_lgclid"
            java.lang.String r7 = r6.getString(r14)     // Catch:{ Exception -> 0x01bb }
            r0.F(r3, r7)     // Catch:{ Exception -> 0x01bb }
        L_0x012c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x0134
            goto L_0x01ac
        L_0x0134:
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.i3 r0 = r0.f4095m     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "Activity created with referrer"
            r0.b(r3, r5)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.f r0 = r0.f4114g     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.e0     // Catch:{ Exception -> 0x01bb }
            r7 = 0
            boolean r0 = r0.r(r7, r3)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r3 = "_ldl"
            if (r0 == 0) goto L_0x0179
            if (r6 == 0) goto L_0x0163
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            r0.A(r4, r8, r6)     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.r9 r0 = r0.f4156n     // Catch:{ Exception -> 0x01bb }
            r0.a(r4, r6)     // Catch:{ Exception -> 0x01bb }
            goto L_0x0172
        L_0x0163:
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.i3 r0 = r0.f4095m     // Catch:{ Exception -> 0x01bb }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.b(r4, r5)     // Catch:{ Exception -> 0x01bb }
        L_0x0172:
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            r4 = 0
            r0.F(r3, r4)     // Catch:{ Exception -> 0x01bb }
            return
        L_0x0179:
            boolean r0 = r5.contains(r14)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r5.contains(r13)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            boolean r0 = r5.contains(r12)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            boolean r0 = r5.contains(r11)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ Exception -> 0x01bb }
            if (r0 == 0) goto L_0x01ad
        L_0x01a1:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01bb }
            if (r0 != 0) goto L_0x01ac
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            r0.F(r3, r5)     // Catch:{ Exception -> 0x01bb }
        L_0x01ac:
            return
        L_0x01ad:
            b.l.a.c.i.b.m6 r0 = r2.f4125h     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ Exception -> 0x01bb }
            b.l.a.c.i.b.i3 r0 = r0.f4095m     // Catch:{ Exception -> 0x01bb }
            r0.a(r9)     // Catch:{ Exception -> 0x01bb }
            return
        L_0x01bb:
            r0 = move-exception
            b.l.a.c.i.b.m6 r2 = r2.f4125h
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.k6.run():void");
    }
}
