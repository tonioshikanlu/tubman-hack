package b.l.a.c.i.b;

import java.util.List;
import java.util.Objects;

public final class c3 extends a4 {
    public String c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public int f3937e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public long f3938g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3939h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f3940i;

    /* renamed from: j  reason: collision with root package name */
    public int f3941j;

    /* renamed from: k  reason: collision with root package name */
    public String f3942k;

    /* renamed from: l  reason: collision with root package name */
    public String f3943l;

    /* renamed from: m  reason: collision with root package name */
    public String f3944m;

    public c3(l4 l4Var, long j2) {
        super(l4Var);
        this.f3939h = j2;
    }

    public final boolean k() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x021f A[Catch:{ IllegalStateException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0284 A[SYNTHETIC, Splitter:B:124:0x0284] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114 A[SYNTHETIC, Splitter:B:52:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011f A[Catch:{ IllegalStateException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d A[Catch:{ IllegalStateException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f A[Catch:{ IllegalStateException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014a A[SYNTHETIC, Splitter:B:62:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01cf A[Catch:{ IllegalStateException -> 0x023c }] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r14 = this;
            b.l.a.c.i.b.l4 r0 = r14.a
            android.content.Context r0 = r0.a
            java.lang.String r0 = r0.getPackageName()
            b.l.a.c.i.b.l4 r1 = r14.a
            android.content.Context r1 = r1.a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x002d
            b.l.a.c.i.b.l4 r7 = r14.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            b.l.a.c.i.b.i3 r7 = r7.f
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            b.l.a.c.i.b.l4 r7 = r14.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            b.l.a.c.i.b.i3 r7 = r7.f
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0051
            r2 = r6
        L_0x0051:
            b.l.a.c.i.b.l4 r7 = r14.a     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r7 = r7.a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r3
        L_0x0071:
            java.lang.String r3 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r4 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r3
            r3 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            b.l.a.c.i.b.l4 r8 = r14.a
            b.l.a.c.i.b.k3 r8 = r8.a()
            b.l.a.c.i.b.i3 r8 = r8.f
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r3)
            r3 = r7
        L_0x008c:
            r14.c = r0
            r14.f = r2
            r14.d = r3
            r14.f3937e = r4
            r2 = 0
            r14.f3938g = r2
            b.l.a.c.i.b.l4 r2 = r14.a
            java.lang.String r2 = r2.f4112b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00b1
            b.l.a.c.i.b.l4 r2 = r14.a
            java.lang.String r2 = r2.c
            java.lang.String r4 = "am"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00b1
            r2 = r3
            goto L_0x00b2
        L_0x00b1:
            r2 = r5
        L_0x00b2:
            b.l.a.c.i.b.l4 r4 = r14.a
            int r4 = r4.k()
            b.l.a.c.i.b.l4 r7 = r14.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            switch(r4) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00ed
        L_0x00c2:
            b.l.a.c.i.b.i3 r7 = r7.f4094l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x00e9
        L_0x00c7:
            b.l.a.c.i.b.i3 r7 = r7.f4093k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x00e9
        L_0x00cc:
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x00e9
        L_0x00d1:
            b.l.a.c.i.b.i3 r7 = r7.f4094l
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x00e9
        L_0x00d6:
            b.l.a.c.i.b.i3 r7 = r7.f4094l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x00e9
        L_0x00db:
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x00e9
        L_0x00e0:
            b.l.a.c.i.b.i3 r7 = r7.f4094l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x00e9
        L_0x00e5:
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            java.lang.String r8 = "App measurement collection enabled"
        L_0x00e9:
            r7.a(r8)
            goto L_0x00f2
        L_0x00ed:
            b.l.a.c.i.b.i3 r7 = r7.f4094l
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x00e9
        L_0x00f2:
            r14.f3942k = r6
            r14.f3943l = r6
            r14.f3944m = r6
            b.l.a.c.i.b.l4 r7 = r14.a
            b.l.a.c.i.b.y9 r8 = r7.f
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = r7.f4112b
            r14.f3943l = r2
        L_0x0102:
            r2 = 0
            b.l.a.c.f.i.ua.b()     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.l4 r7 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.f r7 = r7.f4114g     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.w2<java.lang.Boolean> r8 = b.l.a.c.i.b.x2.B0     // Catch:{ IllegalStateException -> 0x023c }
            boolean r7 = r7.r(r2, r8)     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r9 = "google_app_id"
            if (r7 == 0) goto L_0x011f
            b.l.a.c.i.b.l4 r7 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r10 = r7.a     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r7 = r7.s     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r7 = b.l.a.c.i.b.s6.b(r10, r9, r7)     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x0127
        L_0x011f:
            b.l.a.c.i.b.l4 r7 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r7 = r7.a     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r7 = b.l.a.c.i.b.s6.a(r7, r9)     // Catch:{ IllegalStateException -> 0x023c }
        L_0x0127:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == r9) goto L_0x012f
            r9 = r7
            goto L_0x0130
        L_0x012f:
            r9 = r6
        L_0x0130:
            r14.f3942k = r9     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.f.i.y9.b()     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.l4 r9 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.f r9 = r9.f4114g     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.w2<java.lang.Boolean> r10 = b.l.a.c.i.b.x2.i0     // Catch:{ IllegalStateException -> 0x023c }
            boolean r9 = r9.r(r2, r10)     // Catch:{ IllegalStateException -> 0x023c }
            r10 = 2131755062(0x7f100036, float:1.9140993E38)
            java.lang.String r11 = "string"
            java.lang.String r12 = "admob_app_id"
            java.lang.String r13 = "null reference"
            if (r9 == 0) goto L_0x01cf
            b.l.a.c.f.i.ua.b()     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.l4 r9 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.f r9 = r9.f4114g     // Catch:{ IllegalStateException -> 0x023c }
            boolean r8 = r9.r(r2, r8)     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r9 = "ga_app_id"
            if (r8 == 0) goto L_0x0192
            b.l.a.c.i.b.l4 r8 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r10 = r8.a     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r8 = r8.s     // Catch:{ IllegalStateException -> 0x023c }
            java.util.Objects.requireNonNull(r10, r13)     // Catch:{ IllegalStateException -> 0x023c }
            android.content.res.Resources r11 = r10.getResources()     // Catch:{ IllegalStateException -> 0x023c }
            boolean r13 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x023c }
            if (r13 != 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            java.lang.String r8 = b.l.a.c.b.a.a1(r10)     // Catch:{ IllegalStateException -> 0x023c }
        L_0x0171:
            java.lang.String r9 = b.l.a.c.b.a.E1(r9, r11, r8)     // Catch:{ IllegalStateException -> 0x023c }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == r10) goto L_0x017c
            r6 = r9
        L_0x017c:
            r14.f3944m = r6     // Catch:{ IllegalStateException -> 0x023c }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == 0) goto L_0x018a
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 != 0) goto L_0x021d
        L_0x018a:
            java.lang.String r3 = b.l.a.c.b.a.E1(r12, r11, r8)     // Catch:{ IllegalStateException -> 0x023c }
        L_0x018e:
            r14.f3943l = r3     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x021d
        L_0x0192:
            b.l.a.c.i.b.l4 r8 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r8 = r8.a     // Catch:{ IllegalStateException -> 0x023c }
            java.util.Objects.requireNonNull(r8, r13)     // Catch:{ IllegalStateException -> 0x023c }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r10 = r8.getResourcePackageName(r10)     // Catch:{ IllegalStateException -> 0x023c }
            int r9 = r8.getIdentifier(r9, r11, r10)     // Catch:{ IllegalStateException -> 0x023c }
            if (r9 != 0) goto L_0x01a9
            r9 = r2
            goto L_0x01ad
        L_0x01a9:
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalStateException -> 0x023c }
        L_0x01ad:
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == r13) goto L_0x01b4
            r6 = r9
        L_0x01b4:
            r14.f3944m = r6     // Catch:{ IllegalStateException -> 0x023c }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == 0) goto L_0x01c2
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 != 0) goto L_0x021d
        L_0x01c2:
            int r3 = r8.getIdentifier(r12, r11, r10)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 != 0) goto L_0x01ca
            r3 = r2
            goto L_0x018e
        L_0x01ca:
            java.lang.String r3 = r8.getString(r3)     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x018e
        L_0x01cf:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 != 0) goto L_0x021d
            b.l.a.c.f.i.ua.b()     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.l4 r3 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ IllegalStateException -> 0x023c }
            boolean r3 = r3.r(r2, r8)     // Catch:{ IllegalStateException -> 0x023c }
            if (r3 == 0) goto L_0x01ff
            b.l.a.c.i.b.l4 r3 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r6 = r3.a     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r3 = r3.s     // Catch:{ IllegalStateException -> 0x023c }
            java.util.Objects.requireNonNull(r6, r13)     // Catch:{ IllegalStateException -> 0x023c }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ IllegalStateException -> 0x023c }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x023c }
            if (r8 != 0) goto L_0x01f6
            goto L_0x01fa
        L_0x01f6:
            java.lang.String r3 = b.l.a.c.b.a.a1(r6)     // Catch:{ IllegalStateException -> 0x023c }
        L_0x01fa:
            java.lang.String r3 = b.l.a.c.b.a.E1(r12, r7, r3)     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x018e
        L_0x01ff:
            b.l.a.c.i.b.l4 r3 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            android.content.Context r3 = r3.a     // Catch:{ IllegalStateException -> 0x023c }
            java.util.Objects.requireNonNull(r3, r13)     // Catch:{ IllegalStateException -> 0x023c }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r6 = r3.getResourcePackageName(r10)     // Catch:{ IllegalStateException -> 0x023c }
            int r6 = r3.getIdentifier(r12, r11, r6)     // Catch:{ IllegalStateException -> 0x023c }
            if (r6 != 0) goto L_0x0217
            r3 = r2
            goto L_0x018e
        L_0x0217:
            java.lang.String r3 = r3.getString(r6)     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x018e
        L_0x021d:
            if (r4 != 0) goto L_0x024e
            b.l.a.c.i.b.l4 r3 = r14.a     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ IllegalStateException -> 0x023c }
            b.l.a.c.i.b.i3 r3 = r3.f4096n     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r14.c     // Catch:{ IllegalStateException -> 0x023c }
            java.lang.String r7 = r14.f3942k     // Catch:{ IllegalStateException -> 0x023c }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x023c }
            if (r7 == 0) goto L_0x0236
            java.lang.String r7 = r14.f3943l     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x0238
        L_0x0236:
            java.lang.String r7 = r14.f3942k     // Catch:{ IllegalStateException -> 0x023c }
        L_0x0238:
            r3.c(r4, r6, r7)     // Catch:{ IllegalStateException -> 0x023c }
            goto L_0x024e
        L_0x023c:
            r3 = move-exception
            b.l.a.c.i.b.l4 r4 = r14.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f
            java.lang.Object r0 = b.l.a.c.i.b.k3.t(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r4.c(r6, r0, r3)
        L_0x024e:
            r14.f3940i = r2
            b.l.a.c.i.b.l4 r0 = r14.a
            b.l.a.c.i.b.y9 r3 = r0.f
            b.l.a.c.i.b.f r0 = r0.f4114g
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "analytics.safelisted_events"
            b.l.a.c.b.a.x(r3)
            android.os.Bundle r4 = r0.s()
            if (r4 != 0) goto L_0x0272
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.a(r4)
            goto L_0x0278
        L_0x0272:
            boolean r6 = r4.containsKey(r3)
            if (r6 != 0) goto L_0x027a
        L_0x0278:
            r3 = r2
            goto L_0x0282
        L_0x027a:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0282:
            if (r3 == 0) goto L_0x02aa
            b.l.a.c.i.b.l4 r4 = r0.a     // Catch:{ NotFoundException -> 0x029c }
            android.content.Context r4 = r4.a     // Catch:{ NotFoundException -> 0x029c }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x029c }
            int r3 = r3.intValue()     // Catch:{ NotFoundException -> 0x029c }
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch:{ NotFoundException -> 0x029c }
            if (r3 != 0) goto L_0x0297
            goto L_0x02aa
        L_0x0297:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch:{ NotFoundException -> 0x029c }
            goto L_0x02aa
        L_0x029c:
            r3 = move-exception
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.b(r4, r3)
        L_0x02aa:
            if (r2 != 0) goto L_0x02ad
            goto L_0x02e0
        L_0x02ad:
            int r0 = r2.size()
            if (r0 != 0) goto L_0x02c1
            b.l.a.c.i.b.l4 r0 = r14.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4093k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.a(r2)
            goto L_0x02e2
        L_0x02c1:
            java.util.Iterator r0 = r2.iterator()
        L_0x02c5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e0
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            b.l.a.c.i.b.l4 r4 = r14.a
            b.l.a.c.i.b.k9 r4 = r4.t()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.h0(r6, r3)
            if (r3 != 0) goto L_0x02c5
            goto L_0x02e2
        L_0x02e0:
            r14.f3940i = r2
        L_0x02e2:
            if (r1 == 0) goto L_0x02ef
            b.l.a.c.i.b.l4 r0 = r14.a
            android.content.Context r0 = r0.a
            boolean r0 = b.l.a.c.b.a.f0(r0)
            r14.f3941j = r0
            return
        L_0x02ef:
            r14.f3941j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.c3.l():void");
    }

    public final String m() {
        i();
        Objects.requireNonNull(this.c, "null reference");
        return this.c;
    }

    public final String n() {
        i();
        Objects.requireNonNull(this.f3942k, "null reference");
        return this.f3942k;
    }
}
