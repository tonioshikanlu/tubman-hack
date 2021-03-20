package b.l.a.c.f.i;

import android.content.Context;
import android.os.Bundle;

public final class f extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f3540l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f3541m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Context f3542n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Bundle f3543o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ f0 f3544p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(f0 f0Var, String str, String str2, Context context, Bundle bundle) {
        super(f0Var, true);
        this.f3544p = f0Var;
        this.f3540l = str;
        this.f3541m = str2;
        this.f3542n = context;
        this.f3543o = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC, Splitter:B:15:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ a -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ Exception -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r15 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = r15.f3540l     // Catch:{ Exception -> 0x00aa }
            java.lang.String r3 = r15.f3541m     // Catch:{ Exception -> 0x00aa }
            boolean r2 = b.l.a.c.f.i.f0.c(r2, r3)     // Catch:{ Exception -> 0x00aa }
            r3 = 0
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = r15.f3541m     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = r15.f3540l     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.f0 r5 = r15.f3544p     // Catch:{ Exception -> 0x00aa }
            java.lang.String r5 = r5.a     // Catch:{ Exception -> 0x00aa }
            r11 = r2
            r10 = r4
            r9 = r5
            goto L_0x001c
        L_0x0019:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x001c:
            android.content.Context r2 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.f0.a(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.Boolean r2 = b.l.a.c.f.i.f0.f3546j     // Catch:{ Exception -> 0x00aa }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00aa }
            if (r2 != 0) goto L_0x002e
            if (r10 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = r0
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            b.l.a.c.f.i.f0 r4 = r15.f3544p     // Catch:{ Exception -> 0x00aa }
            android.content.Context r5 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = "com.google.android.gms.measurement.dynamite"
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.dynamite.DynamiteModule$b r7 = com.google.android.gms.dynamite.DynamiteModule.f7283l     // Catch:{ a -> 0x004e }
            goto L_0x003f
        L_0x003d:
            com.google.android.gms.dynamite.DynamiteModule$b r7 = com.google.android.gms.dynamite.DynamiteModule.f7281j     // Catch:{ a -> 0x004e }
        L_0x003f:
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r5, r7, r6)     // Catch:{ a -> 0x004e }
            java.lang.String r7 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r5 = r5.b(r7)     // Catch:{ a -> 0x004e }
            b.l.a.c.f.i.qb r3 = b.l.a.c.f.i.pb.asInterface(r5)     // Catch:{ a -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r5 = move-exception
            r4.b(r5, r1, r0)     // Catch:{ Exception -> 0x00aa }
        L_0x0052:
            r4.f3550h = r3     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.f0 r3 = r15.f3544p     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.qb r3 = r3.f3550h     // Catch:{ Exception -> 0x00aa }
            if (r3 != 0) goto L_0x0064
            b.l.a.c.f.i.f0 r2 = r15.f3544p     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = r2.a     // Catch:{ Exception -> 0x00aa }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00aa }
            return
        L_0x0064:
            android.content.Context r3 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            int r3 = com.google.android.gms.dynamite.DynamiteModule.a(r3, r6)     // Catch:{ Exception -> 0x00aa }
            android.content.Context r4 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            int r4 = com.google.android.gms.dynamite.DynamiteModule.d(r4, r6, r0)     // Catch:{ Exception -> 0x00aa }
            if (r2 == 0) goto L_0x007d
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00aa }
            if (r4 >= r3) goto L_0x007a
            r3 = r1
            goto L_0x007b
        L_0x007a:
            r3 = r0
        L_0x007b:
            r8 = r3
            goto L_0x0087
        L_0x007d:
            if (r3 <= 0) goto L_0x0080
            r4 = r3
        L_0x0080:
            if (r3 <= 0) goto L_0x0084
            r2 = r1
            goto L_0x0085
        L_0x0084:
            r2 = r0
        L_0x0085:
            r8 = r2
            r2 = r4
        L_0x0087:
            b.l.a.c.f.i.zb r14 = new b.l.a.c.f.i.zb     // Catch:{ Exception -> 0x00aa }
            long r6 = (long) r2     // Catch:{ Exception -> 0x00aa }
            r4 = 39000(0x9858, double:1.92686E-319)
            android.os.Bundle r12 = r15.f3543o     // Catch:{ Exception -> 0x00aa }
            android.content.Context r2 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            java.lang.String r13 = b.l.a.c.b.a.a1(r2)     // Catch:{ Exception -> 0x00aa }
            r3 = r14
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.f0 r2 = r15.f3544p     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.f.i.qb r2 = r2.f3550h     // Catch:{ Exception -> 0x00aa }
            android.content.Context r3 = r15.f3542n     // Catch:{ Exception -> 0x00aa }
            b.l.a.c.d.d r4 = new b.l.a.c.d.d     // Catch:{ Exception -> 0x00aa }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00aa }
            long r5 = r15.f3776h     // Catch:{ Exception -> 0x00aa }
            r2.initialize(r4, r14, r5)     // Catch:{ Exception -> 0x00aa }
            return
        L_0x00aa:
            r2 = move-exception
            b.l.a.c.f.i.f0 r3 = r15.f3544p
            r3.b(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.f.a():void");
    }
}
