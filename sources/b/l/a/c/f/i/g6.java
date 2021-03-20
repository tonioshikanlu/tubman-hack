package b.l.a.c.f.i;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class g6 extends h4<Long> implements RandomAccess, u5, w6 {

    /* renamed from: k  reason: collision with root package name */
    public static final g6 f3568k;

    /* renamed from: i  reason: collision with root package name */
    public long[] f3569i;

    /* renamed from: j  reason: collision with root package name */
    public int f3570j;

    static {
        g6 g6Var = new g6(new long[0], 0);
        f3568k = g6Var;
        g6Var.f3587h = false;
    }

    public g6() {
        this.f3569i = new long[10];
        this.f3570j = 0;
    }

    public g6(long[] jArr, int i2) {
        this.f3569i = jArr;
        this.f3570j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3570j)) {
            throw new IndexOutOfBoundsException(s(i2));
        }
        long[] jArr = this.f3569i;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[a.H(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f3569i, i2, jArr2, i2 + 1, this.f3570j - i2);
            this.f3569i = jArr2;
        }
        this.f3569i[i2] = longValue;
        this.f3570j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = w5.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof g6)) {
            return super.addAll(collection);
        }
        g6 g6Var = (g6) collection;
        int i2 = g6Var.f3570j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3570j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f3569i;
            if (i4 > jArr.length) {
                this.f3569i = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(g6Var.f3569i, 0, this.f3569i, this.f3570j, g6Var.f3570j);
            this.f3570j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i2) {
        p(i2);
        return this.f3569i[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return super.equals(obj);
        }
        g6 g6Var = (g6) obj;
        if (this.f3570j != g6Var.f3570j) {
            return false;
        }
        long[] jArr = g6Var.f3569i;
        for (int i2 = 0; i2 < this.f3570j; i2++) {
            if (this.f3569i[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        p(i2);
        return Long.valueOf(this.f3569i[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3570j; i3++) {
            i2 = (i2 * 31) + w5.a(this.f3569i[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f3570j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3569i[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final u5 h(int i2) {
        if (i2 >= this.f3570j) {
            return new g6(Arrays.copyOf(this.f3569i, i2), this.f3570j);
        }
        throw new IllegalArgumentException();
    }

    public final void n(long j2) {
        d();
        int i2 = this.f3570j;
        long[] jArr = this.f3569i;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[a.H(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f3569i = jArr2;
        }
        long[] jArr3 = this.f3569i;
        int i3 = this.f3570j;
        this.f3570j = i3 + 1;
        jArr3[i3] = j2;
    }

    public final void p(int i2) {
        if (i2 < 0 || i2 >= this.f3570j) {
            throw new IndexOutOfBoundsException(s(i2));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        p(i2);
        long[] jArr = this.f3569i;
        long j2 = jArr[i2];
        int i3 = this.f3570j;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f3570j--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            long[] jArr = this.f3569i;
            System.arraycopy(jArr, i3, jArr, i2, this.f3570j - i3);
            this.f3570j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final String s(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3570j);
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        p(i2);
        long[] jArr = this.f3569i;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f3570j;
    }
}
