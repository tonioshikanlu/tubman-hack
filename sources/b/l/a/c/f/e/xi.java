package b.l.a.c.f.e;

import b.l.a.c.c.l.a;
import java.util.Arrays;

public final class xi extends rg implements a.d {

    /* renamed from: i  reason: collision with root package name */
    public final String f3403i;

    public /* synthetic */ xi(String str) {
        b.l.a.c.b.a.y(str, "A valid API key must be provided");
        this.f3403i = str;
    }

    public final Object clone() {
        String str = this.f3403i;
        b.l.a.c.b.a.x(str);
        return new xi(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return b.l.a.c.b.a.T(this.f3403i, xiVar.f3403i) && this.f3257h == xiVar.f3257h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3403i}) + (true ^ this.f3257h ? 1 : 0);
    }
}
