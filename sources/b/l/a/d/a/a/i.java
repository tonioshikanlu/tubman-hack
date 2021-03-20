package b.l.a.d.a.a;

import android.content.Context;
import b.l.a.d.a.e.f0;
import java.util.Objects;

public final class i implements f0<Context> {
    public final g a;

    public i(g gVar) {
        this.a = gVar;
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
