package b.l.d.o.e0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.c.m.v.a;
import b.l.a.c.f.e.fc;
import b.l.a.c.f.e.lk;
import b.l.a.c.f.e.yk;
import b.l.d.o.b0;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class g0 extends a implements b0 {
    public static final Parcelable.Creator<g0> CREATOR = new h0();
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final String f4968h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final String f4969i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f4970j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public String f4971k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f4972l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f4973m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4974n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final String f4975o;

    public g0(lk lkVar, String str) {
        b.l.a.c.b.a.x("firebase");
        String str2 = lkVar.f3125h;
        b.l.a.c.b.a.x(str2);
        this.f4968h = str2;
        this.f4969i = "firebase";
        this.f4972l = lkVar.f3126i;
        this.f4970j = lkVar.f3128k;
        Uri parse = !TextUtils.isEmpty(lkVar.f3129l) ? Uri.parse(lkVar.f3129l) : null;
        if (parse != null) {
            this.f4971k = parse.toString();
        }
        this.f4974n = lkVar.f3127j;
        this.f4975o = null;
        this.f4973m = lkVar.f3132o;
    }

    public g0(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7) {
        this.f4968h = str;
        this.f4969i = str2;
        this.f4972l = str3;
        this.f4973m = str4;
        this.f4970j = str5;
        this.f4971k = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f4971k);
        }
        this.f4974n = z;
        this.f4975o = str7;
    }

    @NonNull
    public final String R() {
        return this.f4969i;
    }

    @Nullable
    public final String V() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(BasePayload.USER_ID_KEY, this.f4968h);
            jSONObject.putOpt("providerId", this.f4969i);
            jSONObject.putOpt("displayName", this.f4970j);
            jSONObject.putOpt("photoUrl", this.f4971k);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EMAIL, this.f4972l);
            jSONObject.putOpt("phoneNumber", this.f4973m);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f4974n));
            jSONObject.putOpt("rawUserInfo", this.f4975o);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new fc(e2);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f4968h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f4969i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f4970j, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f4971k, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f4972l, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f4973m, false);
        boolean z = this.f4974n;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 8, this.f4975o, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }

    public g0(yk ykVar) {
        Objects.requireNonNull(ykVar, "null reference");
        this.f4968h = ykVar.f3419h;
        String str = ykVar.f3422k;
        b.l.a.c.b.a.x(str);
        this.f4969i = str;
        this.f4970j = ykVar.f3420i;
        Uri parse = !TextUtils.isEmpty(ykVar.f3421j) ? Uri.parse(ykVar.f3421j) : null;
        if (parse != null) {
            this.f4971k = parse.toString();
        }
        this.f4972l = ykVar.f3425n;
        this.f4973m = ykVar.f3424m;
        this.f4974n = false;
        this.f4975o = ykVar.f3423l;
    }
}
