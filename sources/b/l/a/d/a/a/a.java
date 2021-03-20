package b.l.a.d.a.a;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class a {
    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    @Nullable
    public abstract Integer e();

    @Nullable
    public abstract PendingIntent f();

    @Nullable
    public abstract PendingIntent g();

    @Nullable
    public abstract PendingIntent h();

    @Nullable
    public abstract PendingIntent i();

    @Nullable
    public final PendingIntent j(c cVar) {
        if (cVar.b() != 0) {
            if (cVar.b() == 1) {
                if (f() != null) {
                    return f();
                }
                if (k(cVar)) {
                    return h();
                }
            }
            return null;
        } else if (g() != null) {
            return g();
        } else {
            if (k(cVar)) {
                return i();
            }
            return null;
        }
    }

    public final boolean k(c cVar) {
        return cVar.a() && b() <= d();
    }

    public abstract int l();

    @NonNull
    public abstract String m();

    public abstract long n();

    public abstract int o();

    public abstract int p();
}
