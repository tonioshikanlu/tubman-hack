package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.c.m.v.a;
import b.l.a.c.c.p.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class al extends a {
    public static final Parcelable.Creator<al> CREATOR = new bl();

    /* renamed from: h  reason: collision with root package name */
    public final List<yk> f2846h;

    public al() {
        this.f2846h = new ArrayList();
    }

    public al(List<yk> list) {
        this.f2846h = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static al V(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new al(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            arrayList.add(jSONObject == null ? new yk() : new yk(f.a(jSONObject.optString("federatedId", (String) null)), f.a(jSONObject.optString("displayName", (String) null)), f.a(jSONObject.optString("photoUrl", (String) null)), f.a(jSONObject.optString("providerId", (String) null)), (String) null, f.a(jSONObject.optString("phoneNumber", (String) null)), f.a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null))));
        }
        return new al(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.N0(parcel, 2, this.f2846h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
