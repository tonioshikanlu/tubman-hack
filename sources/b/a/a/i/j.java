package b.a.a.i;

import b.e.a.a.a;
import com.appfoundry.previewer.model.Page;
import e.x.c.i;

public final class j {
    public final Page a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f320b;

    public j(Page page, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        this.a = page;
        this.f320b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && this.f320b == jVar.f320b;
    }

    public int hashCode() {
        Page page = this.a;
        int hashCode = (page != null ? page.hashCode() : 0) * 31;
        boolean z = this.f320b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = a.y("RemoteResponse(page=");
        y.append(this.a);
        y.append(", tokenExpired=");
        return a.s(y, this.f320b, ")");
    }
}
