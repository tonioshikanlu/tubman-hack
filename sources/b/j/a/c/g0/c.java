package b.j.a.c.g0;

import androidx.recyclerview.widget.RecyclerView;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.y;
import java.math.BigInteger;

public class c extends n {

    /* renamed from: h  reason: collision with root package name */
    public final BigInteger f2002h;

    static {
        BigInteger.valueOf(-2147483648L);
        BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(RecyclerView.FOREVER_NS);
    }

    public c(BigInteger bigInteger) {
        this.f2002h = bigInteger;
    }

    public final void e(f fVar, y yVar) {
        fVar.B0(this.f2002h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return ((c) obj).f2002h.equals(this.f2002h);
        }
        return false;
    }

    public int hashCode() {
        return this.f2002h.hashCode();
    }

    public String n() {
        return this.f2002h.toString();
    }

    public l v() {
        return l.VALUE_NUMBER_INT;
    }
}
