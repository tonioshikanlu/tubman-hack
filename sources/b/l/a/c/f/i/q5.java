package b.l.a.c.f.i;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class q5 extends h4<Integer> implements RandomAccess, t5, w6 {

    /* renamed from: k  reason: collision with root package name */
    public static final q5 f3702k;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3703i;

    /* renamed from: j  reason: collision with root package name */
    public int f3704j;

    static {
        q5 q5Var = new q5(new int[0], 0);
        f3702k = q5Var;
        q5Var.f3587h = false;
    }

    public q5() {
        this.f3703i = new int[10];
        this.f3704j = 0;
    }

    public q5(int[] iArr, int i2) {
        this.f3703i = iArr;
        this.f3704j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3704j)) {
            throw new IndexOutOfBoundsException(s(i2));
        }
        int[] iArr = this.f3703i;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[a.H(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f3703i, i2, iArr2, i2 + 1, this.f3704j - i2);
            this.f3703i = iArr2;
        }
        this.f3703i[i2] = intValue;
        this.f3704j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        n(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = w5.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof q5)) {
            return super.addAll(collection);
        }
        q5 q5Var = (q5) collection;
        int i2 = q5Var.f3704j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3704j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f3703i;
            if (i4 > iArr.length) {
                this.f3703i = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(q5Var.f3703i, 0, this.f3703i, this.f3704j, q5Var.f3704j);
            this.f3704j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final t5 h(int i2) {
        if (i2 >= this.f3704j) {
            return new q5(Arrays.copyOf(this.f3703i, i2), this.f3704j);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return super.equals(obj);
        }
        q5 q5Var = (q5) obj;
        if (this.f3704j != q5Var.f3704j) {
            return false;
        }
        int[] iArr = q5Var.f3703i;
        for (int i2 = 0; i2 < this.f3704j; i2++) {
            if (this.f3703i[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        p(i2);
        return Integer.valueOf(this.f3703i[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3704j; i3++) {
            i2 = (i2 * 31) + this.f3703i[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f3704j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3703i[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    public final int l(int i2) {
        p(i2);
        return this.f3703i[i2];
    }

    public final void n(int i2) {
        d();
        int i3 = this.f3704j;
        int[] iArr = this.f3703i;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[a.H(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f3703i = iArr2;
        }
        int[] iArr3 = this.f3703i;
        int i4 = this.f3704j;
        this.f3704j = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void p(int i2) {
        if (i2 < 0 || i2 >= this.f3704j) {
            throw new IndexOutOfBoundsException(s(i2));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        p(i2);
        int[] iArr = this.f3703i;
        int i3 = iArr[i2];
        int i4 = this.f3704j;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f3704j--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            int[] iArr = this.f3703i;
            System.arraycopy(iArr, i3, iArr, i2, this.f3704j - i3);
            this.f3704j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final String s(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3704j);
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        p(i2);
        int[] iArr = this.f3703i;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f3704j;
    }
}
