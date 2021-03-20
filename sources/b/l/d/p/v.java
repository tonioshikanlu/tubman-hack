package b.l.d.p;

import androidx.annotation.GuardedBy;
import b.l.d.t.a;
import b.l.d.t.b;
import b.l.d.t.c;
import b.l.d.t.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class v implements d, c {
    @GuardedBy("this")
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public Queue<a<?>> f5050b = new ArrayDeque();
    public final Executor c;

    public v(Executor executor) {
        this.c = executor;
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        b(cls, this.c, bVar);
    }

    public synchronized <T> void b(Class<T> cls, Executor executor, b<? super T> bVar) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        this.a.get(cls).put(bVar, executor);
    }
}
