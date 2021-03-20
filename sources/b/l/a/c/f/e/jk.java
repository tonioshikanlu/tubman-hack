package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.c.m.v.a;
import b.l.a.c.c.p.f;
import b.l.d.o.n0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jk extends a implements bj<jk> {
    public static final Parcelable.Creator<jk> CREATOR = new kk();

    /* renamed from: i  reason: collision with root package name */
    public static final String f3092i = jk.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public nk f3093h;

    public jk() {
    }

    public jk(nk nkVar) {
        nk nkVar2;
        if (nkVar == null) {
            nkVar2 = new nk();
        } else {
            List<lk> list = nkVar.f3196h;
            nk nkVar3 = new nk();
            if (list != null && !list.isEmpty()) {
                nkVar3.f3196h.addAll(list);
            }
            nkVar2 = nkVar3;
        }
        this.f3093h = nkVar2;
    }

    public final /* bridge */ /* synthetic */ bj d(String str) {
        nk nkVar;
        int i2;
        lk lkVar;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                nkVar = new nk();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i3 = 0;
                        while (i3 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                            if (jSONObject2 == null) {
                                lkVar = new lk();
                                i2 = i3;
                            } else {
                                i2 = i3;
                                lkVar = new lk(f.a(jSONObject2.optString("localId", (String) null)), f.a(jSONObject2.optString(NotificationCompat.CATEGORY_EMAIL, (String) null)), jSONObject2.optBoolean("emailVerified", z), f.a(jSONObject2.optString("displayName", (String) null)), f.a(jSONObject2.optString("photoUrl", (String) null)), al.V(jSONObject2.optJSONArray("providerUserInfo")), f.a(jSONObject2.optString("rawPassword", (String) null)), f.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (n0) null, vk.W(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(lkVar);
                            i3 = i2 + 1;
                            z = false;
                        }
                        nkVar = new nk(arrayList);
                    }
                }
                nkVar = new nk(new ArrayList());
            }
            this.f3093h = nkVar;
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw b.l.a.c.b.a.A1(e2, f3092i, str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 2, this.f3093h, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
