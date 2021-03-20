package b.l.d.p;

import androidx.annotation.GuardedBy;
import b.l.d.w.a;
import b.l.d.w.b;

public class c0<T> implements b<T> {
    public static final /* synthetic */ int c = 0;
    @GuardedBy("this")
    public a<T> a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f5029b;

    public c0(a<T> aVar, b<T> bVar) {
        this.a = aVar;
        this.f5029b = bVar;
    }

    public T get() {
        return this.f5029b.get();
    }
}
