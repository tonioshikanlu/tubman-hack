package b.l.a.c.f.i;

import java.util.Iterator;
import java.util.Map;

public final class i7 implements Iterator<Map.Entry> {

    /* renamed from: h  reason: collision with root package name */
    public int f3608h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3609i;

    /* renamed from: j  reason: collision with root package name */
    public Iterator<Map.Entry> f3610j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ k7 f3611k;

    public /* synthetic */ i7(k7 k7Var) {
        this.f3611k = k7Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f3610j == null) {
            this.f3610j = this.f3611k.f3636j.entrySet().iterator();
        }
        return this.f3610j;
    }

    public final boolean hasNext() {
        if (this.f3608h + 1 < this.f3611k.f3635i.size()) {
            return true;
        }
        if (this.f3611k.f3636j.isEmpty()) {
            return false;
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f3609i = true;
        int i2 = this.f3608h + 1;
        this.f3608h = i2;
        return (Map.Entry) (i2 < this.f3611k.f3635i.size() ? this.f3611k.f3635i.get(this.f3608h) : a().next());
    }

    public final void remove() {
        if (this.f3609i) {
            this.f3609i = false;
            k7 k7Var = this.f3611k;
            int i2 = k7.f3633n;
            k7Var.g();
            if (this.f3608h < this.f3611k.f3635i.size()) {
                k7 k7Var2 = this.f3611k;
                int i3 = this.f3608h;
                this.f3608h = i3 - 1;
                k7Var2.e(i3);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
