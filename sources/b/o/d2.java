package b.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.EnvironmentCompat;
import com.segment.analytics.AnalyticsContext;
import org.json.JSONObject;

public class d2 {
    @NonNull
    public String a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public a f6062b;
    @Nullable
    public String c;
    @NonNull
    public b d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Object f6063e;

    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        f6066k("custom"),
        UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);
        

        /* renamed from: h  reason: collision with root package name */
        public String f6069h;

        /* access modifiers changed from: public */
        a(String str) {
            this.f6069h = str;
        }

        public String toString() {
            return this.f6069h;
        }
    }

    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        

        /* renamed from: h  reason: collision with root package name */
        public String f6079h;

        /* access modifiers changed from: public */
        b(String str) {
            this.f6079h = str;
        }

        public String toString() {
            return this.f6079h;
        }
    }

    public d2(JSONObject jSONObject) {
        a aVar;
        b bVar;
        this.a = jSONObject.getString(AnalyticsContext.Device.DEVICE_ID_KEY);
        String string = jSONObject.getString("kind");
        a[] values = a.values();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                aVar = a.UNKNOWN;
                break;
            }
            aVar = values[i3];
            if (aVar.f6069h.equalsIgnoreCase(string)) {
                break;
            }
            i3++;
        }
        this.f6062b = aVar;
        this.c = jSONObject.optString("property", (String) null);
        String string2 = jSONObject.getString("operator");
        b[] values2 = b.values();
        while (true) {
            if (i2 >= 9) {
                bVar = b.EQUAL_TO;
                break;
            }
            bVar = values2[i2];
            if (bVar.f6079h.equalsIgnoreCase(string2)) {
                break;
            }
            i2++;
        }
        this.d = bVar;
        this.f6063e = jSONObject.opt("value");
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("OSTrigger{triggerId='");
        y.append(this.a);
        y.append('\'');
        y.append(", kind=");
        y.append(this.f6062b);
        y.append(", property='");
        y.append(this.c);
        y.append('\'');
        y.append(", operatorType=");
        y.append(this.d);
        y.append(", value=");
        y.append(this.f6063e);
        y.append('}');
        return y.toString();
    }
}
