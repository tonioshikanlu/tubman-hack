package e;

import e.x.c.i;
import java.io.Serializable;

public final class k<T> implements Serializable {

    public static final class a implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Throwable f7908h;

        public a(Throwable th) {
            i.e(th, "exception");
            this.f7908h = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.f7908h, ((a) obj).f7908h);
        }

        public int hashCode() {
            return this.f7908h.hashCode();
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Failure(");
            y.append(this.f7908h);
            y.append(')');
            return y.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f7908h;
        }
        return null;
    }
}
