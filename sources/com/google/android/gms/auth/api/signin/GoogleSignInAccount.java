package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.a.a.b.b;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public final int f7235h;

    /* renamed from: i  reason: collision with root package name */
    public String f7236i;

    /* renamed from: j  reason: collision with root package name */
    public String f7237j;

    /* renamed from: k  reason: collision with root package name */
    public String f7238k;

    /* renamed from: l  reason: collision with root package name */
    public String f7239l;

    /* renamed from: m  reason: collision with root package name */
    public Uri f7240m;

    /* renamed from: n  reason: collision with root package name */
    public String f7241n;

    /* renamed from: o  reason: collision with root package name */
    public long f7242o;

    /* renamed from: p  reason: collision with root package name */
    public String f7243p;

    /* renamed from: q  reason: collision with root package name */
    public List<Scope> f7244q;
    public String r;
    public String s;
    public Set<Scope> t = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f7235h = i2;
        this.f7236i = str;
        this.f7237j = str2;
        this.f7238k = str3;
        this.f7239l = str4;
        this.f7240m = uri;
        this.f7241n = str5;
        this.f7242o = j2;
        this.f7243p = str6;
        this.f7244q = list;
        this.r = str7;
        this.s = str8;
    }

    @Nullable
    public static GoogleSignInAccount W(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY);
        String optString3 = jSONObject.optString("tokenId", (String) null);
        String optString4 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null);
        String optString5 = jSONObject.optString("displayName", (String) null);
        String optString6 = jSONObject.optString("givenName", (String) null);
        String optString7 = jSONObject.optString("familyName", (String) null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = valueOf.longValue();
        b.l.a.c.b.a.x(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.f7241n = jSONObject.optString("serverAuthCode", (String) null);
        return googleSignInAccount3;
    }

    @NonNull
    public Set<Scope> V() {
        HashSet hashSet = new HashSet(this.f7244q);
        hashSet.addAll(this.t);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7243p.equals(this.f7243p) && googleSignInAccount.V().equals(V());
    }

    public int hashCode() {
        return V().hashCode() + ((this.f7243p.hashCode() + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f7235h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.K0(parcel, 2, this.f7236i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f7237j, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f7238k, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f7239l, false);
        b.l.a.c.b.a.J0(parcel, 6, this.f7240m, i2, false);
        b.l.a.c.b.a.K0(parcel, 7, this.f7241n, false);
        long j2 = this.f7242o;
        b.l.a.c.b.a.I1(parcel, 8, 8);
        parcel.writeLong(j2);
        b.l.a.c.b.a.K0(parcel, 9, this.f7243p, false);
        b.l.a.c.b.a.N0(parcel, 10, this.f7244q, false);
        b.l.a.c.b.a.K0(parcel, 11, this.r, false);
        b.l.a.c.b.a.K0(parcel, 12, this.s, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
