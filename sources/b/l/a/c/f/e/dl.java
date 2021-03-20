package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class dl extends a implements bj<dl> {
    public static final Parcelable.Creator<dl> CREATOR = new el();

    /* renamed from: l  reason: collision with root package name */
    public static final String f2927l = dl.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public String f2928h;

    /* renamed from: i  reason: collision with root package name */
    public String f2929i;

    /* renamed from: j  reason: collision with root package name */
    public String f2930j;

    /* renamed from: k  reason: collision with root package name */
    public vk f2931k;

    public dl() {
    }

    public dl(String str, String str2, String str3, vk vkVar) {
        this.f2928h = str;
        this.f2929i = str2;
        this.f2930j = str3;
        this.f2931k = vkVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ b.l.a.c.f.e.bj d(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = b.l.a.c.c.p.f.a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f2928h = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = b.l.a.c.c.p.f.a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f2929i = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r6 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r7 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "RECOVER_EMAIL"
            java.lang.String r10 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L_0x0047
            switch(r4) {
                case 4: goto L_0x0045;
                case 5: goto L_0x0043;
                case 6: goto L_0x0041;
                case 7: goto L_0x003f;
                case 8: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r4 = 0
            goto L_0x0048
        L_0x003d:
            r4 = r6
            goto L_0x0048
        L_0x003f:
            r4 = r7
            goto L_0x0048
        L_0x0041:
            r4 = r8
            goto L_0x0048
        L_0x0043:
            r4 = r9
            goto L_0x0048
        L_0x0045:
            r4 = r10
            goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            r1.f2930j = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            int r13 = r4.hashCode()     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r15 = 4
            r5 = 3
            r14 = 2
            switch(r13) {
                case -1874510116: goto L_0x0089;
                case -1452371317: goto L_0x0081;
                case -1341836234: goto L_0x0079;
                case -1099157829: goto L_0x0071;
                case 870738373: goto L_0x0069;
                case 970484929: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0091
        L_0x0061:
            boolean r6 = r4.equals(r9)
            if (r6 == 0) goto L_0x0091
            r6 = r15
            goto L_0x0092
        L_0x0069:
            boolean r6 = r4.equals(r8)
            if (r6 == 0) goto L_0x0091
            r6 = r14
            goto L_0x0092
        L_0x0071:
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L_0x0091
            r6 = r5
            goto L_0x0092
        L_0x0079:
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L_0x0091
            r6 = 0
            goto L_0x0092
        L_0x0081:
            boolean r6 = r4.equals(r11)
            if (r6 == 0) goto L_0x0091
            r6 = r12
            goto L_0x0092
        L_0x0089:
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0091
            r6 = 5
            goto L_0x0092
        L_0x0091:
            r6 = -1
        L_0x0092:
            if (r6 == 0) goto L_0x00a1
            if (r6 == r12) goto L_0x00a1
            if (r6 == r14) goto L_0x00a1
            if (r6 == r5) goto L_0x00a1
            if (r6 == r15) goto L_0x00a1
            r5 = 5
            if (r6 == r5) goto L_0x00a1
            r5 = 0
            goto L_0x00a2
        L_0x00a1:
            r5 = r4
        L_0x00a2:
            r1.f2930j = r5     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00a4:
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            b.l.a.c.f.e.vk r0 = b.l.a.c.f.e.vk.V(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f2931k = r0     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            java.lang.String r3 = f2927l
            b.l.a.c.f.e.vg r0 = b.l.a.c.b.a.A1(r0, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.dl.d(java.lang.String):b.l.a.c.f.e.bj");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f2928h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f2929i, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f2930j, false);
        b.l.a.c.b.a.J0(parcel, 5, this.f2931k, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
