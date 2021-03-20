package b.a.a.i;

import android.widget.ProgressBar;
import b.e.a.a.a;
import e.x.c.i;

public final class e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f314b;
    public boolean c;

    public e(String str, ProgressBar progressBar, boolean z) {
        i.e(progressBar, "progressBar");
        this.a = str;
        this.f314b = progressBar;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.a, eVar.a) && i.a(this.f314b, eVar.f314b) && this.c == eVar.c;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ProgressBar progressBar = this.f314b;
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
        StringBuilder y = a.y("InputFileUploadFlag(componentId=");
        y.append(this.a);
        y.append(", progressBar=");
        y.append(this.f314b);
        y.append(", finished=");
        return a.s(y, this.c, ")");
    }
}
