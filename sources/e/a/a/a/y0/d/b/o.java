package e.a.a.a.y0.d.b;

import b.e.a.a.a;
import e.a.a.a.y0.e.a0.b.e;
import e.h;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o {
    public final String a;

    public o(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
    }

    public static final o a(String str, String str2) {
        i.e(str, "name");
        i.e(str2, "desc");
        return new o(str + '#' + str2, (DefaultConstructorMarker) null);
    }

    public static final o b(e eVar) {
        i.e(eVar, "signature");
        if (eVar instanceof e.b) {
            return c(eVar.c(), eVar.b());
        }
        if (eVar instanceof e.a) {
            return a(eVar.c(), eVar.b());
        }
        throw new h();
    }

    public static final o c(String str, String str2) {
        i.e(str, "name");
        i.e(str2, "desc");
        return new o(a.m(str, str2), (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof o) && i.a(this.a, ((o) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.q(a.y("MemberSignature(signature="), this.a, ")");
    }
}
