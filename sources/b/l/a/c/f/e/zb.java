package b.l.a.c.f.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class zb extends WeakReference<Throwable> {
    public final int a;

    public zb(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zb.class) {
            if (this == obj) {
                return true;
            }
            zb zbVar = (zb) obj;
            return this.a == zbVar.a && get() == zbVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
