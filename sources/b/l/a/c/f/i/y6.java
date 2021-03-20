package b.l.a.c.f.i;

import b.e.a.a.a;
import java.util.Arrays;
import java.util.RandomAccess;

public final class y6<E> extends h4<E> implements RandomAccess {

    /* renamed from: k  reason: collision with root package name */
    public static final y6<Object> f3815k;

    /* renamed from: i  reason: collision with root package name */
    public E[] f3816i;

    /* renamed from: j  reason: collision with root package name */
    public int f3817j;

    static {
        y6<Object> y6Var = new y6<>(new Object[0], 0);
        f3815k = y6Var;
        y6Var.f3587h = false;
    }

    public y6(E[] eArr, int i2) {
        this.f3816i = eArr;
        this.f3817j = i2;
    }

    public final void add(int i2, E e2) {
        int i3;
        d();
        if (i2 < 0 || i2 > (i3 = this.f3817j)) {
            throw new IndexOutOfBoundsException(l(i2));
        }
        E[] eArr = this.f3816i;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = new Object[a.H(i3, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f3816i, i2, eArr2, i2 + 1, this.f3817j - i2);
            this.f3816i = eArr2;
        }
        this.f3816i[i2] = e2;
        this.f3817j++;
        this.modCount++;
    }

    public final boolean add(E e2) {
        d();
        int i2 = this.f3817j;
        E[] eArr = this.f3816i;
        if (i2 == eArr.length) {
            this.f3816i = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3816i;
        int i3 = this.f3817j;
        this.f3817j = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.f3817j) {
            throw new IndexOutOfBoundsException(l(i2));
        }
    }

    public final E get(int i2) {
        e(i2);
        return this.f3816i[i2];
    }

    public final /* bridge */ /* synthetic */ v5 h(int i2) {
        if (i2 >= this.f3817j) {
            return new y6(Arrays.copyOf(this.f3816i, i2), this.f3817j);
        }
        throw new IllegalArgumentException();
    }

    public final String l(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3817j);
    }

    public final E remove(int i2) {
        d();
        e(i2);
        E[] eArr = this.f3816i;
        E e2 = eArr[i2];
        int i3 = this.f3817j;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f3817j--;
        this.modCount++;
        return e2;
    }

    public final E set(int i2, E e2) {
        d();
        e(i2);
        E[] eArr = this.f3816i;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f3817j;
    }
}
