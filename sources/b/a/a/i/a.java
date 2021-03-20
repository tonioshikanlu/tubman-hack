package b.a.a.i;

import android.view.View;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;

public final class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f307b;
    public final String c;
    public View d;

    public a(String str, String str2, String str3, View view) {
        i.e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.e(str2, "containerId");
        i.e(str3, "type");
        i.e(view, "view");
        this.a = str;
        this.f307b = str2;
        this.c = str3;
        this.d = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.f307b, aVar.f307b) && i.a(this.c, aVar.c) && i.a(this.d, aVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f307b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        View view = this.d;
        if (view != null) {
            i2 = view.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("AudioComponent(id=");
        y.append(this.a);
        y.append(", containerId=");
        y.append(this.f307b);
        y.append(", type=");
        y.append(this.c);
        y.append(", view=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
