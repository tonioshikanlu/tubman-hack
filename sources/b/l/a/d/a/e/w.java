package b.l.a.d.a.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class w extends WeakReference<Throwable> {
    public final int a;

    public w(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == w.class) {
            if (this == obj) {
                return true;
            }
            w wVar = (w) obj;
            return this.a == wVar.a && get() == wVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
