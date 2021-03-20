package b.h.a.s.k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.h.a.s.k.d;

public final class a {
    public static final e<Object> a = new C0040a();

    /* renamed from: b.h.a.s.k.a$a  reason: collision with other inner class name */
    public class C0040a implements e<Object> {
        public void a(@NonNull Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements Pools.Pool<T> {
        public final b<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f1019b;
        public final Pools.Pool<T> c;

        public c(@NonNull Pools.Pool<T> pool, @NonNull b<T> bVar, @NonNull e<T> eVar) {
            this.c = pool;
            this.a = bVar;
            this.f1019b = eVar;
        }

        public T acquire() {
            T acquire = this.c.acquire();
            if (acquire == null) {
                acquire = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder y = b.e.a.a.a.y("Created new ");
                    y.append(acquire.getClass());
                    Log.v("FactoryPools", y.toString());
                }
            }
            if (acquire instanceof d) {
                ((d.b) ((d) acquire).j()).a = false;
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            if (t instanceof d) {
                ((d.b) ((d) t).j()).a = true;
            }
            this.f1019b.a(t);
            return this.c.release(t);
        }
    }

    public interface d {
        @NonNull
        d j();
    }

    public interface e<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static <T extends d> Pools.Pool<T> a(int i2, @NonNull b<T> bVar) {
        return new c(new Pools.SynchronizedPool(i2), bVar, a);
    }
}
