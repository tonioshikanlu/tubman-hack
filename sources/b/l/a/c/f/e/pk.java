package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.d.o.a;

public final class pk implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3231h;

    /* renamed from: i  reason: collision with root package name */
    public String f3232i;

    /* renamed from: j  reason: collision with root package name */
    public String f3233j;

    /* renamed from: k  reason: collision with root package name */
    public String f3234k;

    /* renamed from: l  reason: collision with root package name */
    public a f3235l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f3236m;

    public pk(int i2) {
        this.f3231h = i2 != 1 ? i2 != 4 ? i2 != 6 ? i2 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public pk(a aVar, @Nullable String str, @Nullable String str2) {
        this.f3231h = "VERIFY_AND_CHANGE_EMAIL";
        this.f3235l = aVar;
        this.f3232i = null;
        this.f3233j = str;
        this.f3234k = str2;
        this.f3236m = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.f3231h
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0031;
                case -1341836234: goto L_0x0027;
                case -1099157829: goto L_0x001d;
                case 870738373: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x003b
        L_0x0013:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r5
            goto L_0x003c
        L_0x001d:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r4
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r6
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            if (r1 == 0) goto L_0x004b
            if (r1 == r6) goto L_0x0049
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r3 = 7
            goto L_0x004c
        L_0x0047:
            r3 = 6
            goto L_0x004c
        L_0x0049:
            r3 = 4
            goto L_0x004c
        L_0x004b:
            r3 = r6
        L_0x004c:
            java.lang.String r1 = "requestType"
            r0.put(r1, r3)
            java.lang.String r1 = r7.f3232i
            if (r1 == 0) goto L_0x005a
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x005a:
            java.lang.String r1 = r7.f3233j
            if (r1 == 0) goto L_0x0063
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L_0x0063:
            java.lang.String r1 = r7.f3234k
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x006c:
            b.l.d.o.a r1 = r7.f3235l
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r1.f4931l
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            b.l.d.o.a r1 = r7.f3235l
            boolean r1 = r1.f4933n
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4927h
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L_0x008b:
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4928i
            if (r1 == 0) goto L_0x0096
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        L_0x0096:
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4929j
            if (r1 == 0) goto L_0x00a1
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        L_0x00a1:
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4930k
            if (r1 == 0) goto L_0x00ac
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        L_0x00ac:
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4932m
            if (r1 == 0) goto L_0x00b7
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        L_0x00b7:
            b.l.d.o.a r1 = r7.f3235l
            java.lang.String r1 = r1.f4936q
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        L_0x00c2:
            java.lang.String r1 = r7.f3236m
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00cb:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.pk.a():java.lang.String");
    }
}
