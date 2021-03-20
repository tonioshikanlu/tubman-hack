package b.a.a.g;

import android.widget.ImageView;
import b.e.a.a.a;
import com.appfoundry.previewer.model.Style;
import e.x.c.i;

public final class p {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f245b;
    public ImageView c;
    public final Style d;

    /* renamed from: e  reason: collision with root package name */
    public final int f246e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f247g;

    public p(String str, String str2, ImageView imageView, Style style, int i2, int i3, int i4) {
        i.e(imageView, "imageView");
        this.a = str;
        this.f245b = str2;
        this.c = imageView;
        this.d = style;
        this.f246e = i2;
        this.f = i3;
        this.f247g = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i.a(this.a, pVar.a) && i.a(this.f245b, pVar.f245b) && i.a(this.c, pVar.c) && i.a(this.d, pVar.d) && this.f246e == pVar.f246e && this.f == pVar.f && this.f247g == pVar.f247g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f245b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageView imageView = this.c;
        int hashCode3 = (hashCode2 + (imageView != null ? imageView.hashCode() : 0)) * 31;
        Style style = this.d;
        if (style != null) {
            i2 = style.hashCode();
        }
        return Integer.hashCode(this.f247g) + ((Integer.hashCode(this.f) + ((Integer.hashCode(this.f246e) + ((hashCode3 + i2) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder y = a.y("InputImageEvent(pageId=");
        y.append(this.a);
        y.append(", componentId=");
        y.append(this.f245b);
        y.append(", imageView=");
        y.append(this.c);
        y.append(", style=");
        y.append(this.d);
        y.append(", width=");
        y.append(this.f246e);
        y.append(", height=");
        y.append(this.f);
        y.append(", extraHeight=");
        return a.o(y, this.f247g, ")");
    }
}
