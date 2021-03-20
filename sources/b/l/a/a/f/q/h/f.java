package b.l.a.a.f.q.h;

import b.l.a.a.f.q.h.c;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
public abstract class f {

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: b.l.a.a.f.q.h.f$a$a  reason: collision with other inner class name */
        public static abstract class C0056a {
            public abstract a a();

            public abstract C0056a b(long j2);

            public abstract C0056a c(long j2);
        }

        public static C0056a a() {
            c.b bVar = new c.b();
            Set<b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract b.l.a.a.f.s.a a();

    public long b(b.l.a.a.b bVar, long j2, int i2) {
        long a2 = j2 - a().a();
        a aVar = c().get(bVar);
        long b2 = aVar.b();
        int i3 = i2 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i3) * ((double) b2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b2 > 1 ? b2 : 2) * ((long) i3))))), a2), aVar.d());
    }

    public abstract Map<b.l.a.a.b, a> c();
}
