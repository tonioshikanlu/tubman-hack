package b.p.b;

import b.e.a.a.a;
import b.p.b.a0.i;

public final class g {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6701b;

    public g(String str, String str2) {
        this.a = str;
        this.f6701b = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return i.f(this.a, gVar.a) && i.f(this.f6701b, gVar.f6701b);
        }
    }

    public int hashCode() {
        String str = this.f6701b;
        int i2 = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.a;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" realm=\"");
        return a.q(sb, this.f6701b, "\"");
    }
}
