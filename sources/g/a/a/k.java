package g.a.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k<E> {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur");
    private volatile Object _cur;

    public k(boolean z) {
        this._cur = new l(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            l lVar = (l) this._cur;
            int a2 = lVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, lVar, lVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            l lVar = (l) this._cur;
            if (!lVar.b()) {
                a.compareAndSet(this, lVar, lVar.e());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((l) this._cur).c();
    }

    public final E d() {
        while (true) {
            l lVar = (l) this._cur;
            E f = lVar.f();
            if (f != l.f9913g) {
                return f;
            }
            a.compareAndSet(this, lVar, lVar.e());
        }
    }
}
