package b.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import b.e.a.a.a;
import b.o.u4.f.c;
import b.o.v4.j.b;
import b.o.v4.j.d;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import org.json.JSONArray;
import org.json.JSONObject;

public class q3 {
    public c a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f6241b;
    public String c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public Float f6242e;

    public q3(@NonNull c cVar, @Nullable JSONArray jSONArray, @NonNull String str, long j2, float f) {
        this.a = cVar;
        this.f6241b = jSONArray;
        this.c = str;
        this.d = j2;
        this.f6242e = Float.valueOf(f);
    }

    public static q3 a(b bVar) {
        JSONArray jSONArray;
        d dVar;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        c cVar = c.UNATTRIBUTED;
        b.o.v4.j.c cVar2 = bVar.f6335b;
        if (cVar2 != null) {
            d dVar2 = cVar2.a;
            if (dVar2 == null || (jSONArray3 = dVar2.a) == null || jSONArray3.length() <= 0) {
                d dVar3 = cVar2.f6336b;
                if (!(dVar3 == null || (jSONArray2 = dVar3.a) == null || jSONArray2.length() <= 0)) {
                    cVar = c.INDIRECT;
                    dVar = cVar2.f6336b;
                }
            } else {
                cVar = c.DIRECT;
                dVar = cVar2.a;
            }
            jSONArray = dVar.a;
            return new q3(cVar, jSONArray, bVar.a, bVar.d, bVar.c.floatValue());
        }
        jSONArray = null;
        return new q3(cVar, jSONArray, bVar.a, bVar.d, bVar.c.floatValue());
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f6241b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f6241b);
        }
        jSONObject.put(AnalyticsContext.Device.DEVICE_ID_KEY, this.c);
        if (this.f6242e.floatValue() > 0.0f) {
            jSONObject.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, this.f6242e);
        }
        long j2 = this.d;
        if (j2 > 0) {
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j2);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return this.a.equals(q3Var.a) && this.f6241b.equals(q3Var.f6241b) && this.c.equals(q3Var.c) && this.d == q3Var.d && this.f6242e.equals(q3Var.f6242e);
    }

    public int hashCode() {
        int i2 = 1;
        Object[] objArr = {this.a, this.f6241b, this.c, Long.valueOf(this.d), this.f6242e};
        for (int i3 = 0; i3 < 5; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i2;
    }

    public String toString() {
        StringBuilder y = a.y("OutcomeEvent{session=");
        y.append(this.a);
        y.append(", notificationIds=");
        y.append(this.f6241b);
        y.append(", name='");
        y.append(this.c);
        y.append('\'');
        y.append(", timestamp=");
        y.append(this.d);
        y.append(", weight=");
        y.append(this.f6242e);
        y.append('}');
        return y.toString();
    }
}
