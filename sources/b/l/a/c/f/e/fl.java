package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import org.json.JSONObject;

public final class fl extends a implements aj {
    public static final Parcelable.Creator<fl> CREATOR = new gl();

    /* renamed from: h  reason: collision with root package name */
    public final String f2975h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2976i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2977j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2978k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f2979l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f2980m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2981n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2982o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    public vj f2983p;

    public fl(String str, long j2, boolean z, String str2, @Nullable String str3, @Nullable String str4, boolean z2, @Nullable String str5) {
        b.l.a.c.b.a.x(str);
        this.f2975h = str;
        this.f2976i = j2;
        this.f2977j = z;
        this.f2978k = str2;
        this.f2979l = str3;
        this.f2980m = str4;
        this.f2981n = z2;
        this.f2982o = str5;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f2975h);
        String str = this.f2979l;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f2980m;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        vj vjVar = this.f2983p;
        if (vjVar != null) {
            jSONObject.put("autoRetrievalInfo", vjVar.a());
        }
        String str3 = this.f2982o;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2975h, false);
        long j2 = this.f2976i;
        b.l.a.c.b.a.I1(parcel, 2, 8);
        parcel.writeLong(j2);
        boolean z = this.f2977j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 4, this.f2978k, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f2979l, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f2980m, false);
        boolean z2 = this.f2981n;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 8, this.f2982o, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
