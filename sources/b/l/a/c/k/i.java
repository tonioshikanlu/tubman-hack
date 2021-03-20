package b.l.a.c.k;

import androidx.annotation.NonNull;
import b.l.a.c.b.a;
import java.util.Objects;

public class i<TResult> {
    public final e0<TResult> a = new e0<>();

    public boolean a(@NonNull Exception exc) {
        e0<TResult> e0Var = this.a;
        Objects.requireNonNull(e0Var);
        a.B(exc, "Exception must not be null");
        synchronized (e0Var.a) {
            if (e0Var.c) {
                return false;
            }
            e0Var.c = true;
            e0Var.f = exc;
            e0Var.f4421b.a(e0Var);
            return true;
        }
    }

    public boolean b(TResult tresult) {
        e0<TResult> e0Var = this.a;
        synchronized (e0Var.a) {
            if (e0Var.c) {
                return false;
            }
            e0Var.c = true;
            e0Var.f4422e = tresult;
            e0Var.f4421b.a(e0Var);
            return true;
        }
    }
}
