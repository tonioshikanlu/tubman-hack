package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class f extends hm<Integer> implements RandomAccess, i, k0 {

    /* renamed from: k  reason: collision with root package name */
    public static final f f2950k;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2951i;

    /* renamed from: j  reason: collision with root package name */
    public int f2952j;

    static {
        f fVar = new f(new int[0], 0);
        f2950k = fVar;
        fVar.f3050h = false;
    }

    public f() {
        this.f2951i = new int[10];
        this.f2952j = 0;
    }

    public f(int[] iArr, int i2) {
        this.f2951i = iArr;
        this.f2952j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f2952j)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        int[] iArr = this.f2951i;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[a.H(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f2951i, i2, iArr2, i2 + 1, this.f2952j - i2);
            this.f2951i = iArr2;
        }
        this.f2951i[i2] = intValue;
        this.f2952j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        l(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = j.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i2 = fVar.f2952j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2952j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f2951i;
            if (i4 > iArr.length) {
                this.f2951i = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(fVar.f2951i, 0, this.f2951i, this.f2952j, fVar.f2952j);
            this.f2952j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i2) {
        n(i2);
        return this.f2951i[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f2952j != fVar.f2952j) {
            return false;
        }
        int[] iArr = fVar.f2951i;
        for (int i2 = 0; i2 < this.f2952j; i2++) {
            if (this.f2951i[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        n(i2);
        return Integer.valueOf(this.f2951i[i2]);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f2952j) {
            return new f(Arrays.copyOf(this.f2951i, i2), this.f2952j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2952j; i3++) {
            i2 = (i2 * 31) + this.f2951i[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f2952j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f2951i[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        d();
        int i3 = this.f2952j;
        int[] iArr = this.f2951i;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[a.H(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f2951i = iArr2;
        }
        int[] iArr3 = this.f2951i;
        int i4 = this.f2952j;
        this.f2952j = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void n(int i2) {
        if (i2 < 0 || i2 >= this.f2952j) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    public final String p(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f2952j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        n(i2);
        int[] iArr = this.f2951i;
        int i3 = iArr[i2];
        int i4 = this.f2952j;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f2952j--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            int[] iArr = this.f2951i;
            System.arraycopy(iArr, i3, iArr, i2, this.f2952j - i3);
            this.f2952j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        n(i2);
        int[] iArr = this.f2951i;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f2952j;
    }
}
