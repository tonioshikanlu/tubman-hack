package b.l.d.o;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b.l.a.c.b.a;
import b.l.a.c.f.e.fc;
import org.json.JSONException;
import org.json.JSONObject;

public class y extends t {
    public static final Parcelable.Creator<y> CREATOR = new h0();

    /* renamed from: h  reason: collision with root package name */
    public final String f5024h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5025i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5026j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5027k;

    public y(String str, String str2, long j2, String str3) {
        a.x(str);
        this.f5024h = str;
        this.f5025i = str2;
        this.f5026j = j2;
        a.x(str3);
        this.f5027k = str3;
    }

    public JSONObject V() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f5024h);
            jSONObject.putOpt("displayName", this.f5025i);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5026j));
            jSONObject.putOpt("phoneNumber", this.f5027k);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new fc(e2);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f5024h, false);
        a.K0(parcel, 2, this.f5025i, false);
        long j2 = this.f5026j;
        a.I1(parcel, 3, 8);
        parcel.writeLong(j2);
        a.K0(parcel, 4, this.f5027k, false);
        a.H1(parcel, P0);
    }
}
