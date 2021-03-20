package b.l.a.c.f.e;

import java.util.Iterator;
import java.util.Map;

public final class x0 implements Iterator<Map.Entry> {

    /* renamed from: h  reason: collision with root package name */
    public int f3391h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3392i;

    /* renamed from: j  reason: collision with root package name */
    public Iterator<Map.Entry> f3393j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ z0 f3394k;

    public /* synthetic */ x0(z0 z0Var) {
        this.f3394k = z0Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f3393j == null) {
            this.f3393j = this.f3394k.f3432j.entrySet().iterator();
        }
        return this.f3393j;
    }

    public final boolean hasNext() {
        if (this.f3391h + 1 < this.f3394k.f3431i.size()) {
            return true;
        }
        if (this.f3394k.f3432j.isEmpty()) {
            return false;
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f3392i = true;
        int i2 = this.f3391h + 1;
        this.f3391h = i2;
        return (Map.Entry) (i2 < this.f3394k.f3431i.size() ? this.f3394k.f3431i.get(this.f3391h) : a().next());
    }

    public final void remove() {
        if (this.f3392i) {
            this.f3392i = false;
            z0 z0Var = this.f3394k;
            int i2 = z0.f3429n;
            z0Var.g();
            if (this.f3391h < this.f3394k.f3431i.size()) {
                z0 z0Var2 = this.f3394k;
                int i3 = this.f3391h;
                this.f3391h = i3 - 1;
                z0Var2.e(i3);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
