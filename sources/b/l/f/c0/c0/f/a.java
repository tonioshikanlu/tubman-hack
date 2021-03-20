package b.l.f.c0.c0.f;

import b.l.f.c0.c0.b;
import b.l.f.c0.c0.c;
import java.util.Objects;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5606b;
    public final c c;

    public a(b bVar, b bVar2, c cVar) {
        this.a = bVar;
        this.f5606b = bVar2;
        this.c = cVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.a, aVar.a) && Objects.equals(this.f5606b, aVar.f5606b) && Objects.equals(this.c, aVar.c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.a) ^ Objects.hashCode(this.f5606b)) ^ Objects.hashCode(this.c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.a);
        sb.append(" , ");
        sb.append(this.f5606b);
        sb.append(" : ");
        c cVar = this.c;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.a);
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
