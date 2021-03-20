package b.l.a.c.f.e;

import java.util.NoSuchElementException;

public final class mm extends nm {

    /* renamed from: h  reason: collision with root package name */
    public int f3173h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f3174i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ um f3175j;

    public mm(um umVar) {
        this.f3175j = umVar;
        this.f3174i = umVar.l();
    }

    public final byte a() {
        int i2 = this.f3173h;
        if (i2 < this.f3174i) {
            this.f3173h = i2 + 1;
            return this.f3175j.e(i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f3173h < this.f3174i;
    }
}
