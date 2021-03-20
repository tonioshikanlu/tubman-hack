package b.l.d.o.e0;

import android.content.Context;
import android.content.SharedPreferences;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class s {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4996b;
    public final SharedPreferences c;
    public final a d = new a("StorageHelpers", new String[0]);

    public s(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        b.l.a.c.b.a.x(str);
        this.f4996b = str;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{str}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        android.util.Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        throw new b.l.a.c.f.e.fc(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0136, code lost:
        android.util.Log.wtf(r25.d.a, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0140, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb A[SYNTHETIC, Splitter:B:33:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f A[ExcHandler: fc | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.o.e0.j0 a(org.json.JSONObject r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x008b
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "userId"
            java.lang.String r17 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "providerId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "email"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r20 = r4.optString(r15)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r21 = r4.optString(r14)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "photoUrl"
            java.lang.String r22 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "isEmailVerified"
            boolean r23 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r24 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            b.l.d.o.e0.g0 r4 = new b.l.d.o.e0.g0     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r11.add(r4)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007d:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            b.l.a.c.f.e.fc r1 = new b.l.a.c.f.e.fc     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            throw r1     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x008b:
            b.l.d.d r4 = b.l.d.d.d(r6)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            b.l.d.o.e0.j0 r6 = new b.l.d.o.e0.j0     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r4 != 0) goto L_0x00a1
            b.l.a.c.f.e.sk r4 = b.l.a.c.f.e.sk.X(r5)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r6.g0(r4)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x00a1:
            if (r7 != 0) goto L_0x00a7
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r6.f4985o = r4     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x00a7:
            r6.f4984n = r8     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r4 == 0) goto L_0x00cd
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r3 != 0) goto L_0x00b6
            goto L_0x00c8
        L_0x00b6:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00c8, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00c8, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            b.l.d.o.e0.l0 r3 = new b.l.d.o.e0.l0     // Catch:{ JSONException -> 0x00c8, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00c8, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            if (r3 == 0) goto L_0x00cd
            r6.f4986p = r3     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x00cd:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r3 == 0) goto L_0x012e
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r0 == 0) goto L_0x012e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r2.<init>()     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r12 = 0
        L_0x00df:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r12 >= r3) goto L_0x012b
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r3 == 0) goto L_0x0124
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            if (r3 == 0) goto L_0x011c
            java.lang.String r3 = "uid"
            java.lang.String r17 = r4.optString(r3)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r18 = r4.optString(r14)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            long r19 = r4.optLong(r1)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            b.l.d.o.y r3 = new b.l.d.o.y     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            r16 = r3
            r16.<init>(r17, r18, r19, r21)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            goto L_0x0125
        L_0x011c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            throw r0     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x0124:
            r3 = 0
        L_0x0125:
            r2.add(r3)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
            int r12 = r12 + 1
            goto L_0x00df
        L_0x012b:
            r6.j0(r2)     // Catch:{ JSONException -> 0x0135, ArrayIndexOutOfBoundsException -> 0x0133, IllegalArgumentException -> 0x0131, fc -> 0x012f }
        L_0x012e:
            return r6
        L_0x012f:
            r0 = move-exception
            goto L_0x0136
        L_0x0131:
            r0 = move-exception
            goto L_0x0136
        L_0x0133:
            r0 = move-exception
            goto L_0x0136
        L_0x0135:
            r0 = move-exception
        L_0x0136:
            r1 = r25
            b.l.a.c.c.n.a r2 = r1.d
            java.lang.String r2 = r2.a
            android.util.Log.wtf(r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.o.e0.s.a(org.json.JSONObject):b.l.d.o.e0.j0");
    }
}
