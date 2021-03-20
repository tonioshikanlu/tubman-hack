package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class f0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f240b;
    public final boolean c;

    public f0(String str, String str2, boolean z) {
        this.a = str;
        this.f240b = str2;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return i.a(this.a, f0Var.a) && i.a(this.f240b, f0Var.f240b) && this.c == f0Var.c;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f240b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = a.y("PlayEvent(containerId=");
        y.append(this.a);
        y.append(", url=");
        y.append(this.f240b);
        y.append(", runInBackground=");
        return a.s(y, this.c, ")");
    }
}
