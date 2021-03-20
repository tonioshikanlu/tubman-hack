package g.a;

import e.x.c.i;
import java.util.concurrent.CancellationException;

public final class z0 extends CancellationException {

    /* renamed from: h  reason: collision with root package name */
    public final y0 f10040h;

    public z0(String str, Throwable th, y0 y0Var) {
        super(str);
        this.f10040h = y0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z0) {
                z0 z0Var = (z0) obj;
                if (!i.a(z0Var.getMessage(), getMessage()) || !i.a(z0Var.f10040h, this.f10040h) || !i.a(z0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        i.c(message);
        int hashCode = (this.f10040h.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f10040h;
    }
}
