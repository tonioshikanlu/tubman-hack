package b.j.a.c.g0;

import b.j.a.b.f;
import b.j.a.b.s.a;
import b.j.a.b.v.b;
import b.j.a.c.l;
import b.j.a.c.x;
import b.j.a.c.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class o extends f<o> {

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, l> f2019i = new LinkedHashMap();

    public o(k kVar) {
        super(kVar);
    }

    public void d(f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        boolean z = yVar != null && !yVar.K(x.z);
        b e2 = fVar2.e(fVar, fVar2.d(this, b.j.a.b.l.START_OBJECT));
        for (Map.Entry next : this.f2019i.entrySet()) {
            b bVar = (b) next.getValue();
            if (!z || !bVar.s() || !bVar.l(yVar)) {
                fVar.t0((String) next.getKey());
                bVar.e(fVar, yVar);
            }
        }
        fVar2.f(fVar, e2);
    }

    public void e(f fVar, y yVar) {
        boolean z = yVar != null && !yVar.K(x.z);
        fVar.O0(this);
        for (Map.Entry next : this.f2019i.entrySet()) {
            b bVar = (b) next.getValue();
            if (!z || !bVar.s() || !bVar.l(yVar)) {
                fVar.t0((String) next.getKey());
                bVar.e(fVar, yVar);
            }
        }
        fVar.r0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof o)) {
            return this.f2019i.equals(((o) obj).f2019i);
        }
        return false;
    }

    public int hashCode() {
        return this.f2019i.hashCode();
    }

    public boolean l(y yVar) {
        return this.f2019i.isEmpty();
    }

    public Iterator<l> p() {
        return this.f2019i.values().iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f2019i.size() << 4) + 32);
        sb.append("{");
        int i2 = 0;
        for (Map.Entry next : this.f2019i.entrySet()) {
            if (i2 > 0) {
                sb.append(",");
            }
            i2++;
            sb.append('\"');
            a.a(sb, (String) next.getKey());
            sb.append('\"');
            sb.append(':');
            sb.append(((l) next.getValue()).toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
