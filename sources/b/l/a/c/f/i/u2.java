package b.l.a.c.f.i;

import android.content.Context;
import b.e.a.a.a;

public final class u2 extends n3 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final t3<r3<d3>> f3770b;

    public u2(Context context, t3<r3<d3>> t3Var) {
        this.a = context;
        this.f3770b = t3Var;
    }

    public final Context a() {
        return this.a;
    }

    public final t3<r3<d3>> b() {
        return this.f3770b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n3) {
            n3 n3Var = (n3) obj;
            if (this.a.equals(n3Var.a())) {
                t3<r3<d3>> t3Var = this.f3770b;
                t3<r3<d3>> b2 = n3Var.b();
                if (t3Var != null ? t3Var.equals(b2) : b2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        t3<r3<d3>> t3Var = this.f3770b;
        return hashCode ^ (t3Var == null ? 0 : t3Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.f3770b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        a.L(sb, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
