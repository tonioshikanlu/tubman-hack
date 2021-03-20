package b.j.a.c.g0;

import androidx.recyclerview.widget.RecyclerView;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.y;
import java.math.BigDecimal;

public class g extends n {

    /* renamed from: i  reason: collision with root package name */
    public static final g f2009i = new g(BigDecimal.ZERO);

    /* renamed from: h  reason: collision with root package name */
    public final BigDecimal f2010h;

    static {
        BigDecimal.valueOf(-2147483648L);
        BigDecimal.valueOf(2147483647L);
        BigDecimal.valueOf(Long.MIN_VALUE);
        BigDecimal.valueOf(RecyclerView.FOREVER_NS);
    }

    public g(BigDecimal bigDecimal) {
        this.f2010h = bigDecimal;
    }

    public final void e(f fVar, y yVar) {
        fVar.A0(this.f2010h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            return ((g) obj).f2010h.compareTo(this.f2010h) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Double.valueOf(this.f2010h.doubleValue()).hashCode();
    }

    public String n() {
        return this.f2010h.toString();
    }

    public l v() {
        return l.VALUE_NUMBER_FLOAT;
    }
}
