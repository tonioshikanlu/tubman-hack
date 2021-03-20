package b.l.c.b;

import b.l.a.c.b.a;

public class x<E> extends n<E> {

    /* renamed from: l  reason: collision with root package name */
    public static final n<Object> f4895l = new x(new Object[0], 0);

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f4896j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int f4897k;

    public x(Object[] objArr, int i2) {
        this.f4896j = objArr;
        this.f4897k = i2;
    }

    public int d(Object[] objArr, int i2) {
        System.arraycopy(this.f4896j, 0, objArr, i2, this.f4897k);
        return i2 + this.f4897k;
    }

    public Object[] e() {
        return this.f4896j;
    }

    public E get(int i2) {
        a.s(i2, this.f4897k);
        return this.f4896j[i2];
    }

    public int l() {
        return this.f4897k;
    }

    public int n() {
        return 0;
    }

    public int size() {
        return this.f4897k;
    }
}
