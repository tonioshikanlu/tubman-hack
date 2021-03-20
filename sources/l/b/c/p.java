package l.b.c;

import b.e.a.a.a;
import java.util.Arrays;
import l.b.c.w;

public final class p {
    public static final w d;

    /* renamed from: e  reason: collision with root package name */
    public static final p f8127e;
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final q f8128b;
    public final u c;

    static {
        w wVar = new w.b(w.b.f8152b, (w.a) null).a;
        d = wVar;
        f8127e = new p(t.f8148j, q.f8129i, u.f8151b, wVar);
    }

    public p(t tVar, q qVar, u uVar, w wVar) {
        this.a = tVar;
        this.f8128b = qVar;
        this.c = uVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.f8128b.equals(pVar.f8128b) && this.c.equals(pVar.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f8128b, this.c});
    }

    public String toString() {
        StringBuilder y = a.y("SpanContext{traceId=");
        y.append(this.a);
        y.append(", spanId=");
        y.append(this.f8128b);
        y.append(", traceOptions=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
