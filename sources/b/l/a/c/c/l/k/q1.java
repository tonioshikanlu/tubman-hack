package b.l.a.c.c.l.k;

import androidx.annotation.NonNull;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.l.k.d;
import b.l.a.c.c.l.k.g;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class q1<A extends d<? extends h, a.b>> extends g1 {
    public final A a;

    public q1(int i2, A a2) {
        super(i2);
        this.a = a2;
    }

    public final void a(@NonNull Status status) {
        this.a.l(status);
    }

    public final void b(@NonNull c2 c2Var, boolean z) {
        A a2 = this.a;
        c2Var.a.put(a2, Boolean.valueOf(z));
        r rVar = new r(c2Var, a2);
        Objects.requireNonNull(a2);
        b.l.a.c.b.a.k(true, "Callback cannot be null.");
        synchronized (a2.a) {
            if (a2.d()) {
                rVar.a(a2.f7271i);
            } else {
                a2.f7268e.add(rVar);
            }
        }
    }

    public final void c(@NonNull RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(localizedMessage).length() + simpleName.length() + 2);
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.a.l(new Status(10, sb.toString()));
    }

    public final void e(g.a<?> aVar) {
        try {
            this.a.k(aVar.f2650b);
        } catch (RuntimeException e2) {
            c(e2);
        }
    }
}
