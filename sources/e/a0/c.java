package e.a0;

import e.t.u;
import java.util.NoSuchElementException;

public final class c extends u {

    /* renamed from: h  reason: collision with root package name */
    public final int f7886h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7887i;

    /* renamed from: j  reason: collision with root package name */
    public int f7888j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7889k;

    public c(int i2, int i3, int i4) {
        this.f7889k = i4;
        this.f7886h = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f7887i = z;
        this.f7888j = !z ? i3 : i2;
    }

    public boolean hasNext() {
        return this.f7887i;
    }

    public int nextInt() {
        int i2 = this.f7888j;
        if (i2 != this.f7886h) {
            this.f7888j = this.f7889k + i2;
        } else if (this.f7887i) {
            this.f7887i = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }
}
