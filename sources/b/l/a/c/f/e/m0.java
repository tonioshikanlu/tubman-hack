package b.l.a.c.f.e;

import b.e.a.a.a;
import java.util.Arrays;
import java.util.RandomAccess;

public final class m0<E> extends hm<E> implements RandomAccess {

    /* renamed from: k  reason: collision with root package name */
    public static final m0<Object> f3159k;

    /* renamed from: i  reason: collision with root package name */
    public E[] f3160i;

    /* renamed from: j  reason: collision with root package name */
    public int f3161j;

    static {
        m0<Object> m0Var = new m0<>(new Object[0], 0);
        f3159k = m0Var;
        m0Var.f3050h = false;
    }

    public m0(E[] eArr, int i2) {
        this.f3160i = eArr;
        this.f3161j = i2;
    }

    public final void add(int i2, E e2) {
        int i3;
        d();
        if (i2 < 0 || i2 > (i3 = this.f3161j)) {
            throw new IndexOutOfBoundsException(l(i2));
        }
        E[] eArr = this.f3160i;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = new Object[a.H(i3, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f3160i, i2, eArr2, i2 + 1, this.f3161j - i2);
            this.f3160i = eArr2;
        }
        this.f3160i[i2] = e2;
        this.f3161j++;
        this.modCount++;
    }

    public final boolean add(E e2) {
        d();
        int i2 = this.f3161j;
        E[] eArr = this.f3160i;
        if (i2 == eArr.length) {
            this.f3160i = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3160i;
        int i3 = this.f3161j;
        this.f3161j = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.f3161j) {
            throw new IndexOutOfBoundsException(l(i2));
        }
    }

    public final E get(int i2) {
        e(i2);
        return this.f3160i[i2];
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f3161j) {
            return new m0(Arrays.copyOf(this.f3160i, i2), this.f3161j);
        }
        throw new IllegalArgumentException();
    }

    public final String l(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3161j);
    }

    public final E remove(int i2) {
        d();
        e(i2);
        E[] eArr = this.f3160i;
        E e2 = eArr[i2];
        int i3 = this.f3161j;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f3161j--;
        this.modCount++;
        return e2;
    }

    public final E set(int i2, E e2) {
        d();
        e(i2);
        E[] eArr = this.f3160i;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f3161j;
    }
}
