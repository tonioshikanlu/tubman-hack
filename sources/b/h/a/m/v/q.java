package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.h.a.m.m;
import java.util.Objects;

public class q<Z> implements w<Z> {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f751h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f752i;

    /* renamed from: j  reason: collision with root package name */
    public final w<Z> f753j;

    /* renamed from: k  reason: collision with root package name */
    public final a f754k;

    /* renamed from: l  reason: collision with root package name */
    public final m f755l;

    /* renamed from: m  reason: collision with root package name */
    public int f756m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f757n;

    public interface a {
        void a(m mVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z2, m mVar, a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f753j = wVar;
        this.f751h = z;
        this.f752i = z2;
        this.f755l = mVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f754k = aVar;
    }

    public int a() {
        return this.f753j.a();
    }

    @NonNull
    public Class<Z> b() {
        return this.f753j.b();
    }

    public synchronized void c() {
        if (!this.f757n) {
            this.f756m++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public void d() {
        boolean z;
        synchronized (this) {
            int i2 = this.f756m;
            if (i2 > 0) {
                z = true;
                int i3 = i2 - 1;
                this.f756m = i3;
                if (i3 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f754k.a(this.f755l, this);
        }
    }

    @NonNull
    public Z get() {
        return this.f753j.get();
    }

    public synchronized void recycle() {
        if (this.f756m > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f757n) {
            this.f757n = true;
            if (this.f752i) {
                this.f753j.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f751h + ", listener=" + this.f754k + ", key=" + this.f755l + ", acquired=" + this.f756m + ", isRecycled=" + this.f757n + ", resource=" + this.f753j + '}';
    }
}
