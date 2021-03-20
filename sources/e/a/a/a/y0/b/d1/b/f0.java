package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.a;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.d.a.d0.y;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.util.Collection;

public final class f0 extends u implements y {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Annotation[] f8293b;
    public final String c;
    public final boolean d;

    public f0(d0 d0Var, Annotation[] annotationArr, String str, boolean z) {
        i.e(d0Var, "type");
        i.e(annotationArr, "reflectAnnotations");
        this.a = d0Var;
        this.f8293b = annotationArr;
        this.c = str;
        this.d = z;
    }

    public v d() {
        return this.a;
    }

    public d getName() {
        String str = this.c;
        if (str != null) {
            return d.j(str);
        }
        return null;
    }

    public a i(b bVar) {
        i.e(bVar, "fqName");
        return b.q.a.a.k0(this.f8293b, bVar);
    }

    public Collection k() {
        return b.q.a.a.w0(this.f8293b);
    }

    public boolean l() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(f0.class, sb, ": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? d.j(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }

    public boolean u() {
        return false;
    }
}
