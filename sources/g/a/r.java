package g.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class r {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9980b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public r(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public r(Throwable th, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
