package b.a.a.g;

import android.widget.TextView;
import b.e.a.a.a;
import e.x.c.i;

public final class o {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f244b;
    public TextView c;

    public o(String str, String str2, TextView textView) {
        i.e(textView, "textView");
        this.a = str;
        this.f244b = str2;
        this.c = textView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return i.a(this.a, oVar.a) && i.a(this.f244b, oVar.f244b) && i.a(this.c, oVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f244b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        TextView textView = this.c;
        if (textView != null) {
            i2 = textView.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("InputFileEvent(pageId=");
        y.append(this.a);
        y.append(", componentId=");
        y.append(this.f244b);
        y.append(", textView=");
        y.append(this.c);
        y.append(")");
        return y.toString();
    }
}
