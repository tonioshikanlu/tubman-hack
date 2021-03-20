package b.o.v4.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import b.e.a.a.a;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import org.json.JSONObject;

public class b {
    @NonNull
    public String a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public c f6335b;
    public Float c;
    public long d;

    public b(@NonNull String str, @Nullable c cVar, float f) {
        this.a = str;
        this.f6335b = cVar;
        this.c = Float.valueOf(f);
        this.d = 0;
    }

    public b(@NonNull String str, @Nullable c cVar, float f, long j2) {
        this.a = str;
        this.f6335b = cVar;
        this.c = Float.valueOf(f);
        this.d = j2;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsContext.Device.DEVICE_ID_KEY, this.a);
        c cVar = this.f6335b;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            JSONObject jSONObject2 = new JSONObject();
            d dVar = cVar.a;
            if (dVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("notification_ids", dVar.a);
                jSONObject3.put("in_app_message_ids", dVar.f6337b);
                jSONObject2.put("direct", jSONObject3);
            }
            d dVar2 = cVar.f6336b;
            if (dVar2 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("notification_ids", dVar2.a);
                jSONObject4.put("in_app_message_ids", dVar2.f6337b);
                jSONObject2.put("indirect", jSONObject4);
            }
            jSONObject.put("sources", jSONObject2);
        }
        if (this.c.floatValue() > 0.0f) {
            jSONObject.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, this.c);
        }
        long j2 = this.d;
        if (j2 > 0) {
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j2);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder y = a.y("OSOutcomeEventParams{outcomeId='");
        y.append(this.a);
        y.append('\'');
        y.append(", outcomeSource=");
        y.append(this.f6335b);
        y.append(", weight=");
        y.append(this.c);
        y.append(", timestamp=");
        y.append(this.d);
        y.append('}');
        return y.toString();
    }
}
