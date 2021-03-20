package e.a.a.a.y0.b;

import e.a.a.a.y0.j.y.o.d;
import e.x.c.i;
import java.util.Map;

public abstract class z0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7860b;

    public z0(String str, boolean z) {
        i.e(str, "name");
        this.a = str;
        this.f7860b = z;
    }

    public Integer a(z0 z0Var) {
        int i2;
        i.e(z0Var, "visibility");
        z0 z0Var2 = y0.a;
        if (this == z0Var) {
            i2 = 0;
        } else {
            Map<z0, Integer> map = y0.f7854j;
            Integer num = map.get(this);
            Integer num2 = map.get(z0Var);
            if (num == null || num2 == null || num.equals(num2)) {
                return null;
            }
            i2 = num.intValue() - num2.intValue();
        }
        return Integer.valueOf(i2);
    }

    public String b() {
        return this.a;
    }

    public abstract boolean c(d dVar, o oVar, k kVar);

    public z0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
