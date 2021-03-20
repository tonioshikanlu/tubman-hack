package b.o;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import b.e.a.a.a;
import org.json.JSONObject;

public class d1 {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public float f6061b;
    public boolean c;

    public d1(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.f6061b = jSONObject.has(ActivityChooserModel.ATTRIBUTE_WEIGHT) ? (float) jSONObject.getDouble(ActivityChooserModel.ATTRIBUTE_WEIGHT) : 0.0f;
        this.c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public String toString() {
        StringBuilder y = a.y("OSInAppMessageOutcome{name='");
        y.append(this.a);
        y.append('\'');
        y.append(", weight=");
        y.append(this.f6061b);
        y.append(", unique=");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }
}
