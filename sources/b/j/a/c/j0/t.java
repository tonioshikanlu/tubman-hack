package b.j.a.c.j0;

import b.e.a.a.a;
import java.lang.reflect.Array;
import java.util.List;

public final class t {
    public n<Object[]> a;

    /* renamed from: b  reason: collision with root package name */
    public n<Object[]> f2235b;
    public int c;
    public Object[] d;

    public final void a(Object obj, int i2, Object[] objArr, int i3) {
        int i4 = 0;
        for (n nVar = this.a; nVar != null; nVar = nVar.f2227b) {
            Object[] objArr2 = (Object[]) nVar.a;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i4, length);
            i4 += length;
        }
        System.arraycopy(objArr, 0, obj, i4, i3);
        int i5 = i4 + i3;
        if (i5 != i2) {
            throw new IllegalStateException(a.i("Should have gotten ", i2, " entries, got ", i5));
        }
    }

    public void b() {
        n<Object[]> nVar = this.f2235b;
        if (nVar != null) {
            this.d = (Object[]) nVar.a;
        }
        this.f2235b = null;
        this.a = null;
        this.c = 0;
    }

    public Object[] c(Object[] objArr) {
        n<T> nVar = new n<>(objArr, (n) null);
        if (this.a == null) {
            this.f2235b = nVar;
            this.a = nVar;
        } else {
            n<Object[]> nVar2 = this.f2235b;
            if (nVar2.f2227b == null) {
                nVar2.f2227b = nVar;
                this.f2235b = nVar;
            } else {
                throw new IllegalStateException();
            }
        }
        int length = objArr.length;
        this.c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public void d(Object[] objArr, int i2, List<Object> list) {
        int i3;
        n nVar = this.a;
        while (true) {
            i3 = 0;
            if (nVar == null) {
                break;
            }
            Object[] objArr2 = (Object[]) nVar.a;
            int length = objArr2.length;
            while (i3 < length) {
                list.add(objArr2[i3]);
                i3++;
            }
            nVar = nVar.f2227b;
        }
        while (i3 < i2) {
            list.add(objArr[i3]);
            i3++;
        }
        b();
    }

    public Object[] e(Object[] objArr, int i2) {
        int i3 = this.c + i2;
        Object[] objArr2 = new Object[i3];
        a(objArr2, i3, objArr, i2);
        b();
        return objArr2;
    }

    public <T> T[] f(Object[] objArr, int i2, Class<T> cls) {
        int i3 = this.c + i2;
        T[] tArr = (Object[]) Array.newInstance(cls, i3);
        a(tArr, i3, objArr, i2);
        b();
        return tArr;
    }

    public Object[] g() {
        b();
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.d = objArr2;
        return objArr2;
    }

    public Object[] h(Object[] objArr, int i2) {
        b();
        Object[] objArr2 = this.d;
        if (objArr2 == null || objArr2.length < i2) {
            this.d = new Object[Math.max(12, i2)];
        }
        System.arraycopy(objArr, 0, this.d, 0, i2);
        return this.d;
    }
}
