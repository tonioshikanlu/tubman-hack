package b.l.a.c.f.i;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class y3 extends WeakReference<Throwable> {
    public final int a;

    public y3(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == y3.class) {
            if (this == obj) {
                return true;
            }
            y3 y3Var = (y3) obj;
            return this.a == y3Var.a && get() == y3Var.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
