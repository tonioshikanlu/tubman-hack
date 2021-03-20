package b.l.a.c.f.i;

import java.util.NoSuchElementException;

public final class m4 extends n4 {

    /* renamed from: h  reason: collision with root package name */
    public int f3650h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f3651i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ t4 f3652j;

    public m4(t4 t4Var) {
        this.f3652j = t4Var;
        this.f3651i = t4Var.l();
    }

    public final byte a() {
        int i2 = this.f3650h;
        if (i2 < this.f3651i) {
            this.f3650h = i2 + 1;
            return this.f3652j.e(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f3650h < this.f3651i;
    }
}
