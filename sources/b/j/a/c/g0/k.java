package b.j.a.c.g0;

import java.io.Serializable;
import java.math.BigDecimal;

public class k implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final k f2015h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f2016i;

    static {
        k kVar = new k(false);
        f2015h = kVar;
        f2016i = kVar;
    }

    public k(boolean z) {
    }

    public e a(boolean z) {
        return z ? e.f2005i : e.f2006j;
    }

    public r b(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return m.f2018h;
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? g.f2009i : new g(bigDecimal.stripTrailingZeros());
    }

    public q c(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? q.f2021i : new q(str);
    }
}
