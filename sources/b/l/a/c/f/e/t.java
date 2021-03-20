package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class t extends hm<Long> implements RandomAccess, i, k0 {

    /* renamed from: k  reason: collision with root package name */
    public static final t f3289k;

    /* renamed from: i  reason: collision with root package name */
    public long[] f3290i;

    /* renamed from: j  reason: collision with root package name */
    public int f3291j;

    static {
        t tVar = new t(new long[0], 0);
        f3289k = tVar;
        tVar.f3050h = false;
    }

    public t() {
        this.f3290i = new long[10];
        this.f3291j = 0;
    }

    public t(long[] jArr, int i2) {
        this.f3290i = jArr;
        this.f3291j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3291j)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        long[] jArr = this.f3290i;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[a.H(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f3290i, i2, jArr2, i2 + 1, this.f3291j - i2);
            this.f3290i = jArr2;
        }
        this.f3290i[i2] = longValue;
        this.f3291j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        l(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = j.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i2 = tVar.f3291j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3291j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f3290i;
            if (i4 > jArr.length) {
                this.f3290i = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(tVar.f3290i, 0, this.f3290i, this.f3291j, tVar.f3291j);
            this.f3291j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i2) {
        n(i2);
        return this.f3290i[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f3291j != tVar.f3291j) {
            return false;
        }
        long[] jArr = tVar.f3290i;
        for (int i2 = 0; i2 < this.f3291j; i2++) {
            if (this.f3290i[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        n(i2);
        return Long.valueOf(this.f3290i[i2]);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f3291j) {
            return new t(Arrays.copyOf(this.f3290i, i2), this.f3291j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3291j; i3++) {
            i2 = (i2 * 31) + j.a(this.f3290i[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f3291j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3290i[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(long j2) {
        d();
        int i2 = this.f3291j;
        long[] jArr = this.f3290i;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[a.H(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f3290i = jArr2;
        }
        long[] jArr3 = this.f3290i;
        int i3 = this.f3291j;
        this.f3291j = i3 + 1;
        jArr3[i3] = j2;
    }

    public final void n(int i2) {
        if (i2 < 0 || i2 >= this.f3291j) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    public final String p(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3291j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        n(i2);
        long[] jArr = this.f3290i;
        long j2 = jArr[i2];
        int i3 = this.f3291j;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f3291j--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            long[] jArr = this.f3290i;
            System.arraycopy(jArr, i3, jArr, i2, this.f3291j - i3);
            this.f3291j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        n(i2);
        long[] jArr = this.f3290i;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f3291j;
    }
}
