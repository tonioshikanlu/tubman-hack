package e.a.a.a.y0.j.y;

import e.a.a.a.y0.j.y.d;
import java.util.Objects;

public abstract class c {

    public static final class a extends c {
        public static final int a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f9437b = new a();

        static {
            d.a aVar = d.u;
            Objects.requireNonNull(aVar);
            int i2 = d.f9442j;
            Objects.requireNonNull(aVar);
            int i3 = d.f9440h;
            Objects.requireNonNull(aVar);
            a = (~(d.f9441i | i3)) & i2;
        }

        public int a() {
            return a;
        }
    }

    public static final class b extends c {
        public static final b a = new b();

        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
