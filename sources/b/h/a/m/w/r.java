package b.h.a.m.w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import b.h.a.g;
import b.h.a.m.p;
import b.h.a.m.w.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f820e = new c();
    public static final n<Object, Object> f = new a();
    public final List<b<?, ?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f821b;
    public final Set<b<?, ?>> c = new HashSet();
    public final Pools.Pool<List<Throwable>> d;

    public static class a implements n<Object, Object> {
        @Nullable
        public n.a<Object> a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
            return null;
        }

        public boolean b(@NonNull Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f822b;
        public final o<? extends Model, ? extends Data> c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.f822b = cls2;
            this.c = oVar;
        }
    }

    public static class c {
    }

    public r(@NonNull Pools.Pool<List<Throwable>> pool) {
        c cVar = f820e;
        this.d = pool;
        this.f821b = cVar;
    }

    @NonNull
    public final <Model, Data> n<Model, Data> a(@NonNull b<?, ?> bVar) {
        n<? extends Model, ? extends Data> b2 = bVar.c.b(this);
        Objects.requireNonNull(b2, "Argument must not be null");
        return b2;
    }

    @NonNull
    public synchronized <Model, Data> n<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b next : this.a) {
                if (this.c.contains(next)) {
                    z = true;
                } else {
                    if (next.a.isAssignableFrom(cls) && next.f822b.isAssignableFrom(cls2)) {
                        this.c.add(next);
                        arrayList.add(a(next));
                        this.c.remove(next);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f821b;
                Pools.Pool<List<Throwable>> pool = this.d;
                Objects.requireNonNull(cVar);
                return new q(arrayList, pool);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return f;
            } else {
                throw new g.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    @NonNull
    public synchronized <Model> List<n<Model, ?>> c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.a) {
                if (!this.c.contains(next)) {
                    if (next.a.isAssignableFrom(cls)) {
                        this.c.add(next);
                        n<? extends Model, ? extends Data> b2 = next.c.b(this);
                        Objects.requireNonNull(b2, "Argument must not be null");
                        arrayList.add(b2);
                        this.c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    public synchronized List<Class<?>> d(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.a) {
            if (!arrayList.contains(next.f822b) && next.a.isAssignableFrom(cls)) {
                arrayList.add(next.f822b);
            }
        }
        return arrayList;
    }
}
