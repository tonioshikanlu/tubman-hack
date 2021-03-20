package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.e.f0;
import java.util.Objects;

public final class j2 implements f0<Context> {
    public final f2 a;

    public j2(f2 f2Var) {
        this.a = f2Var;
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
