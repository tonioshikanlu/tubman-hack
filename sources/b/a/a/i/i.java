package b.a.a.i;

import android.view.View;
import b.e.a.a.a;

public final class i {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final View f319b;

    public i(String str, View view) {
        e.x.c.i.e(view, "view");
        this.a = str;
        this.f319b = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e.x.c.i.a(this.a, iVar.a) && e.x.c.i.a(this.f319b, iVar.f319b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        View view = this.f319b;
        if (view != null) {
            i2 = view.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("PushButtonView(id=");
        y.append(this.a);
        y.append(", view=");
        y.append(this.f319b);
        y.append(")");
        return y.toString();
    }
}
