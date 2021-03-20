package b.a.a.i;

import android.view.View;
import b.e.a.a.a;
import com.appfoundry.previewer.model.Component;
import e.x.c.i;

public final class h {
    public final Component a;

    /* renamed from: b  reason: collision with root package name */
    public View f318b;

    public h(Component component, View view) {
        i.e(component, "component");
        i.e(view, "view");
        this.a = component;
        this.f318b = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && i.a(this.f318b, hVar.f318b);
    }

    public int hashCode() {
        Component component = this.a;
        int i2 = 0;
        int hashCode = (component != null ? component.hashCode() : 0) * 31;
        View view = this.f318b;
        if (view != null) {
            i2 = view.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("MenuComponent(component=");
        y.append(this.a);
        y.append(", view=");
        y.append(this.f318b);
        y.append(")");
        return y.toString();
    }
}
