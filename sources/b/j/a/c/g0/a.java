package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.v.b;
import b.j.a.c.l;
import b.j.a.c.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a extends f<a> {

    /* renamed from: i  reason: collision with root package name */
    public final List<l> f2001i = new ArrayList();

    public a(k kVar) {
        super(kVar);
    }

    public void d(f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        b e2 = fVar2.e(fVar, fVar2.d(this, b.j.a.b.l.START_ARRAY));
        Iterator<l> it = this.f2001i.iterator();
        while (it.hasNext()) {
            ((b) it.next()).e(fVar, yVar);
        }
        fVar2.f(fVar, e2);
    }

    public void e(f fVar, y yVar) {
        List<l> list = this.f2001i;
        int size = list.size();
        fVar.M0(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) list.get(i2)).e(fVar, yVar);
        }
        fVar.q0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            return this.f2001i.equals(((a) obj).f2001i);
        }
        return false;
    }

    public int hashCode() {
        return this.f2001i.hashCode();
    }

    public boolean l(y yVar) {
        return this.f2001i.isEmpty();
    }

    public Iterator<l> p() {
        return this.f2001i.iterator();
    }

    public boolean s() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f2001i.size() << 4) + 16);
        sb.append('[');
        int size = this.f2001i.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(this.f2001i.get(i2).toString());
        }
        sb.append(']');
        return sb.toString();
    }

    public a y(l lVar) {
        if (lVar == null) {
            v();
            lVar = m.f2018h;
        }
        this.f2001i.add(lVar);
        return this;
    }
}
