package b.l.a.c.f.f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class h extends WeakReference<Throwable> {
    public final int a;

    public h(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == h.class) {
            if (this == obj) {
                return true;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && get() == hVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
