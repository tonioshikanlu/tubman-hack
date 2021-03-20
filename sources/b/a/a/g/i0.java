package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class i0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f241b;
    public final String c;

    public i0(String str, String str2, String str3) {
        this.a = str;
        this.f241b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i.a(this.a, i0Var.a) && i.a(this.f241b, i0Var.f241b) && i.a(this.c, i0Var.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f241b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("RemoteActionEvent(pageId=");
        y.append(this.a);
        y.append(", triggerUrl=");
        y.append(this.f241b);
        y.append(", confirmPrompt=");
        return a.q(y, this.c, ")");
    }
}
