package b.a.a.i;

import android.widget.ProgressBar;
import b.e.a.a.a;
import e.x.c.i;

public final class f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f315b;
    public boolean c;

    public f(String str, ProgressBar progressBar, boolean z) {
        i.e(progressBar, "progressBar");
        this.a = str;
        this.f315b = progressBar;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && i.a(this.f315b, fVar.f315b) && this.c == fVar.c;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ProgressBar progressBar = this.f315b;
        if (progressBar != null) {
            i2 = progressBar.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = a.y("InputImageUploadFlag(componentId=");
        y.append(this.a);
        y.append(", progressBar=");
        y.append(this.f315b);
        y.append(", finished=");
        return a.s(y, this.c, ")");
    }
}
