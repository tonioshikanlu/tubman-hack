package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.e0.z;
import java.util.Objects;

public final class sl extends a implements aj {
    public static final Parcelable.Creator<sl> CREATOR = new tl();

    /* renamed from: h  reason: collision with root package name */
    public String f3279h;

    /* renamed from: i  reason: collision with root package name */
    public String f3280i;

    /* renamed from: j  reason: collision with root package name */
    public String f3281j;

    /* renamed from: k  reason: collision with root package name */
    public String f3282k;

    /* renamed from: l  reason: collision with root package name */
    public String f3283l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f3284m;

    /* renamed from: n  reason: collision with root package name */
    public String f3285n;

    /* renamed from: o  reason: collision with root package name */
    public String f3286o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3287p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3288q;
    public String r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    @Nullable
    public String w;

    public sl() {
        this.f3287p = true;
        this.f3288q = true;
    }

    public sl(z zVar, String str) {
        Objects.requireNonNull(zVar, "null reference");
        String str2 = zVar.a;
        b.l.a.c.b.a.x(str2);
        this.s = str2;
        b.l.a.c.b.a.x(str);
        this.t = str;
        String str3 = zVar.c;
        b.l.a.c.b.a.x(str3);
        this.f3283l = str3;
        this.f3287p = true;
        StringBuilder B = b.e.a.a.a.B("providerId", "=");
        B.append(this.f3283l);
        this.f3285n = B.toString();
    }

    public sl(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.f3279h = "http://localhost";
        this.f3281j = str;
        this.f3282k = str2;
        this.f3286o = str4;
        this.r = str5;
        this.u = str6;
        this.w = str7;
        this.f3287p = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f3282k) || !TextUtils.isEmpty(this.r)) {
            b.l.a.c.b.a.x(str3);
            this.f3283l = str3;
            this.f3284m = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f3281j)) {
                sb.append("id_token");
                sb.append("=");
                sb.append(this.f3281j);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3282k)) {
                sb.append("access_token");
                sb.append("=");
                sb.append(this.f3282k);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3284m)) {
                sb.append("identifier");
                sb.append("=");
                sb.append(this.f3284m);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3286o)) {
                sb.append("oauth_token_secret");
                sb.append("=");
                sb.append(this.f3286o);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.r)) {
                sb.append("code");
                sb.append("=");
                sb.append(this.r);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str8)) {
                b.e.a.a.a.L(sb, "nonce", "=", str8, "&");
            }
            sb.append("providerId");
            sb.append("=");
            sb.append(this.f3283l);
            this.f3285n = sb.toString();
            this.f3288q = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public sl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f3279h = str;
        this.f3280i = str2;
        this.f3281j = str3;
        this.f3282k = str4;
        this.f3283l = str5;
        this.f3284m = str6;
        this.f3285n = str7;
        this.f3286o = str8;
        this.f3287p = z;
        this.f3288q = z2;
        this.r = str9;
        this.s = str10;
        this.t = str11;
        this.u = str12;
        this.v = z3;
        this.w = str13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f3288q
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f3287p
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f3280i
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x001c:
            java.lang.String r1 = r3.f3285n
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L_0x0025:
            java.lang.String r1 = r3.u
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x002e:
            java.lang.String r1 = r3.w
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L_0x0037:
            java.lang.String r1 = r3.s
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = r3.s
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L_0x0046:
            java.lang.String r1 = r3.t
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = r3.t
        L_0x0052:
            r0.put(r2, r1)
            goto L_0x005b
        L_0x0056:
            java.lang.String r1 = r3.f3279h
            if (r1 == 0) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            boolean r1 = r3.v
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.sl.a():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3279h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3280i, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f3281j, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f3282k, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f3283l, false);
        b.l.a.c.b.a.K0(parcel, 7, this.f3284m, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f3285n, false);
        b.l.a.c.b.a.K0(parcel, 9, this.f3286o, false);
        boolean z = this.f3287p;
        b.l.a.c.b.a.I1(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3288q;
        b.l.a.c.b.a.I1(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 12, this.r, false);
        b.l.a.c.b.a.K0(parcel, 13, this.s, false);
        b.l.a.c.b.a.K0(parcel, 14, this.t, false);
        b.l.a.c.b.a.K0(parcel, 15, this.u, false);
        boolean z3 = this.v;
        b.l.a.c.b.a.I1(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 17, this.w, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
