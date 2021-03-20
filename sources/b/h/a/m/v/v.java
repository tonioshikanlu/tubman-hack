package b.h.a.m.v;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.h.a.s.k.a;
import b.h.a.s.k.d;
import java.util.Objects;

public final class v<Z> implements w<Z>, a.d {

    /* renamed from: l  reason: collision with root package name */
    public static final Pools.Pool<v<?>> f768l = b.h.a.s.k.a.a(20, new a());

    /* renamed from: h  reason: collision with root package name */
    public final d f769h = new d.b();

    /* renamed from: i  reason: collision with root package name */
    public w<Z> f770i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f771j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f772k;

    public class a implements a.b<v<?>> {
        public Object a() {
            return new v();
        }
    }

    @NonNull
    public static <Z> v<Z> c(w<Z> wVar) {
        v<Z> acquire = f768l.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        acquire.f772k = false;
        acquire.f771j = true;
        acquire.f770i = wVar;
        return acquire;
    }

    public int a() {
        return this.f770i.a();
    }

    @NonNull
    public Class<Z> b() {
        return this.f770i.b();
    }

    public synchronized void d() {
        this.f769h.a();
        if (this.f771j) {
            this.f771j = false;
            if (this.f772k) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public Z get() {
        return this.f770i.get();
    }

    @NonNull
    public d j() {
        return this.f769h;
    }

    public synchronized void recycle() {
        this.f769h.a();
        this.f772k = true;
        if (!this.f771j) {
            this.f770i.recycle();
            this.f770i = null;
            f768l.release(this);
        }
    }
}
