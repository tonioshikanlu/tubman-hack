package b.j.a.c.j0;

import b.e.a.a.a;

public final class o extends r {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f2228i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f2229j;

    public o(String str, String str2) {
        this.f2228i = str;
        this.f2229j = str2;
    }

    public String a(String str) {
        return this.f2228i + str + this.f2229j;
    }

    public String toString() {
        StringBuilder y = a.y("[PreAndSuffixTransformer('");
        y.append(this.f2228i);
        y.append("','");
        return a.q(y, this.f2229j, "')]");
    }
}
