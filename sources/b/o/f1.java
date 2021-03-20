package b.o;

import b.e.a.a.a;
import org.json.JSONObject;

public class f1 {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public int f6088b;
    public int c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6089e;

    public f1() {
        this.a = -1;
        this.f6088b = 0;
        this.c = 1;
        this.d = 0;
        this.f6089e = false;
    }

    public f1(int i2, long j2) {
        this.a = -1;
        this.f6088b = 0;
        this.c = 1;
        this.d = 0;
        this.f6089e = false;
        this.f6088b = i2;
        this.a = j2;
    }

    public f1(JSONObject jSONObject) {
        long intValue;
        this.a = -1;
        this.f6088b = 0;
        this.c = 1;
        this.d = 0;
        this.f6089e = false;
        this.f6089e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            intValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            intValue = (long) ((Integer) obj2).intValue();
        } else {
            return;
        }
        this.d = intValue;
    }

    public String toString() {
        StringBuilder y = a.y("OSInAppMessageDisplayStats{lastDisplayTime=");
        y.append(this.a);
        y.append(", displayQuantity=");
        y.append(this.f6088b);
        y.append(", displayLimit=");
        y.append(this.c);
        y.append(", displayDelay=");
        y.append(this.d);
        y.append('}');
        return y.toString();
    }
}
