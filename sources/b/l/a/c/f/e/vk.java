package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class vk extends a {
    public static final Parcelable.Creator<vk> CREATOR = new xk();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f3357h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final String f3358i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3359j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3360k;

    public vk(String str, String str2, String str3, long j2) {
        this.f3357h = str;
        b.l.a.c.b.a.x(str2);
        this.f3358i = str2;
        this.f3359j = str3;
        this.f3360k = j2;
    }

    public static vk V(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", (String) null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
        String optString3 = jSONObject.optString("displayName", (String) null);
        long j2 = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j2 = optJSONObject.optLong("seconds", 0);
        }
        vk vkVar = new vk(optString, optString2, optString3, j2);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return vkVar;
    }

    public static List<vk> W(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(V(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3357h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3358i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3359j, false);
        long j2 = this.f3360k;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j2);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
