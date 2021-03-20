package b.l.a.c.f.i;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class k4 extends h4<Boolean> implements RandomAccess, v5, w6 {

    /* renamed from: k  reason: collision with root package name */
    public static final k4 f3629k;

    /* renamed from: i  reason: collision with root package name */
    public boolean[] f3630i;

    /* renamed from: j  reason: collision with root package name */
    public int f3631j;

    static {
        k4 k4Var = new k4(new boolean[0], 0);
        f3629k = k4Var;
        k4Var.f3587h = false;
    }

    public k4() {
        this.f3630i = new boolean[10];
        this.f3631j = 0;
    }

    public k4(boolean[] zArr, int i2) {
        this.f3630i = zArr;
        this.f3631j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3631j)) {
            throw new IndexOutOfBoundsException(n(i2));
        }
        boolean[] zArr = this.f3630i;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[a.H(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f3630i, i2, zArr2, i2 + 1, this.f3631j - i2);
            this.f3630i = zArr2;
        }
        this.f3630i[i2] = booleanValue;
        this.f3631j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = w5.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof k4)) {
            return super.addAll(collection);
        }
        k4 k4Var = (k4) collection;
        int i2 = k4Var.f3631j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3631j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f3630i;
            if (i4 > zArr.length) {
                this.f3630i = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(k4Var.f3630i, 0, this.f3630i, this.f3631j, k4Var.f3631j);
            this.f3631j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z) {
        d();
        int i2 = this.f3631j;
        boolean[] zArr = this.f3630i;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[a.H(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f3630i = zArr2;
        }
        boolean[] zArr3 = this.f3630i;
        int i3 = this.f3631j;
        this.f3631j = i3 + 1;
        zArr3[i3] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return super.equals(obj);
        }
        k4 k4Var = (k4) obj;
        if (this.f3631j != k4Var.f3631j) {
            return false;
        }
        boolean[] zArr = k4Var.f3630i;
        for (int i2 = 0; i2 < this.f3631j; i2++) {
            if (this.f3630i[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        l(i2);
        return Boolean.valueOf(this.f3630i[i2]);
    }

    public final /* bridge */ /* synthetic */ v5 h(int i2) {
        if (i2 >= this.f3631j) {
            return new k4(Arrays.copyOf(this.f3630i, i2), this.f3631j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3631j; i3++) {
            i2 = (i2 * 31) + w5.b(this.f3630i[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f3631j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3630i[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f3631j) {
            throw new IndexOutOfBoundsException(n(i2));
        }
    }

    public final String n(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3631j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        l(i2);
        boolean[] zArr = this.f3630i;
        boolean z = zArr[i2];
        int i3 = this.f3631j;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f3631j--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            boolean[] zArr = this.f3630i;
            System.arraycopy(zArr, i3, zArr, i2, this.f3631j - i3);
            this.f3631j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        l(i2);
        boolean[] zArr = this.f3630i;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3631j;
    }
}
