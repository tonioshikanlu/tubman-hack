package e.a.a.a.y0.b.a1;

import b.q.a.a;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.m.d0;
import java.util.Map;

public class d implements c {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<e.a.a.a.y0.f.d, g<?>> f7771b;
    public final m0 c;

    public d(d0 d0Var, Map<e.a.a.a.y0.f.d, g<?>> map, m0 m0Var) {
        if (d0Var == null) {
            b(0);
            throw null;
        } else if (map == null) {
            b(1);
            throw null;
        } else if (m0Var != null) {
            this.a = d0Var;
            this.f7771b = map;
            this.c = m0Var;
        } else {
            b(2);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i2) {
        String str = (i2 == 3 || i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 3 || i2 == 4 || i2 == 5) ? 2 : 3)];
        if (i2 == 1) {
            objArr[0] = "valueArguments";
        } else if (i2 == 2) {
            objArr[0] = "source";
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i2 == 3) {
            objArr[1] = "getType";
        } else if (i2 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i2 == 3 || i2 == 4 || i2 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 3 || i2 == 4 || i2 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public Map<e.a.a.a.y0.f.d, g<?>> a() {
        Map<e.a.a.a.y0.f.d, g<?>> map = this.f7771b;
        if (map != null) {
            return map;
        }
        b(4);
        throw null;
    }

    public d0 d() {
        d0 d0Var = this.a;
        if (d0Var != null) {
            return d0Var;
        }
        b(3);
        throw null;
    }

    public b e() {
        return a.K0(this);
    }

    public String toString() {
        return c.a.r(this, (e) null);
    }

    public m0 w() {
        m0 m0Var = this.c;
        if (m0Var != null) {
            return m0Var;
        }
        b(5);
        throw null;
    }
}
