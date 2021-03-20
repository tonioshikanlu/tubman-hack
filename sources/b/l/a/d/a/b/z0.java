package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.e.e0;
import b.l.a.d.a.e.f0;
import java.util.Objects;

public final class z0 implements f0<y0> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4653b;
    public final f0 c;
    public final /* synthetic */ int d = 0;

    public z0(f0<v0> f0Var, f0<t> f0Var2, f0<z> f0Var3) {
        this.a = f0Var;
        this.f4653b = f0Var2;
        this.c = f0Var3;
    }

    public z0(f0<Context> f0Var, f0<m> f0Var2, f0<d1> f0Var3, byte[] bArr) {
        this.c = f0Var;
        this.f4653b = f0Var2;
        this.a = f0Var3;
    }

    public final Object a() {
        if (this.d != 0) {
            n2 n2Var = (n2) (f2.a(((j2) this.c).a()) == null ? e0.b(this.f4653b).a() : e0.b(this.a).a());
            Objects.requireNonNull(n2Var, "Cannot return null from a non-@Nullable @Provides method");
            return n2Var;
        }
        return new y0((v0) this.a.a(), (t) this.f4653b.a(), (z) this.c.a());
    }
}
