package b.l.a.d.a.b;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class n0 implements u0 {
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4583b;
    public final int c;
    public final long d;

    public n0(v0 v0Var, String str, int i2, long j2) {
        this.a = v0Var;
        this.f4583b = str;
        this.c = i2;
        this.d = j2;
    }

    public final Object a() {
        v0 v0Var = this.a;
        String str = this.f4583b;
        int i2 = this.c;
        long j2 = this.d;
        Objects.requireNonNull(v0Var);
        s0 s0Var = (s0) ((Map) v0Var.b(new p0(v0Var, Arrays.asList(new String[]{str})))).get(str);
        if (s0Var == null || e1.e(s0Var.c.c)) {
            v0.f4637g.b(6, String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        t tVar = v0Var.a;
        if (tVar.e(str, i2, j2).exists()) {
            t.h(tVar.e(str, i2, j2));
        }
        s0Var.c.c = 4;
        return null;
    }
}
