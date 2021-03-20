package b.l.a.c.f.i;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class a5 extends h4<Double> implements RandomAccess, v5, w6 {

    /* renamed from: k  reason: collision with root package name */
    public static final a5 f3485k;

    /* renamed from: i  reason: collision with root package name */
    public double[] f3486i;

    /* renamed from: j  reason: collision with root package name */
    public int f3487j;

    static {
        a5 a5Var = new a5(new double[0], 0);
        f3485k = a5Var;
        a5Var.f3587h = false;
    }

    public a5() {
        this.f3486i = new double[10];
        this.f3487j = 0;
    }

    public a5(double[] dArr, int i2) {
        this.f3486i = dArr;
        this.f3487j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3487j)) {
            throw new IndexOutOfBoundsException(n(i2));
        }
        double[] dArr = this.f3486i;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[a.H(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f3486i, i2, dArr2, i2 + 1, this.f3487j - i2);
            this.f3486i = dArr2;
        }
        this.f3486i[i2] = doubleValue;
        this.f3487j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = w5.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof a5)) {
            return super.addAll(collection);
        }
        a5 a5Var = (a5) collection;
        int i2 = a5Var.f3487j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3487j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f3486i;
            if (i4 > dArr.length) {
                this.f3486i = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(a5Var.f3486i, 0, this.f3486i, this.f3487j, a5Var.f3487j);
            this.f3487j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d) {
        d();
        int i2 = this.f3487j;
        double[] dArr = this.f3486i;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[a.H(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f3486i = dArr2;
        }
        double[] dArr3 = this.f3486i;
        int i3 = this.f3487j;
        this.f3487j = i3 + 1;
        dArr3[i3] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return super.equals(obj);
        }
        a5 a5Var = (a5) obj;
        if (this.f3487j != a5Var.f3487j) {
            return false;
        }
        double[] dArr = a5Var.f3486i;
        for (int i2 = 0; i2 < this.f3487j; i2++) {
            if (Double.doubleToLongBits(this.f3486i[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        l(i2);
        return Double.valueOf(this.f3486i[i2]);
    }

    public final /* bridge */ /* synthetic */ v5 h(int i2) {
        if (i2 >= this.f3487j) {
            return new a5(Arrays.copyOf(this.f3486i, i2), this.f3487j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3487j; i3++) {
            i2 = (i2 * 31) + w5.a(Double.doubleToLongBits(this.f3486i[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f3487j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3486i[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f3487j) {
            throw new IndexOutOfBoundsException(n(i2));
        }
    }

    public final String n(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3487j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        l(i2);
        double[] dArr = this.f3486i;
        double d = dArr[i2];
        int i3 = this.f3487j;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f3487j--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            double[] dArr = this.f3486i;
            System.arraycopy(dArr, i3, dArr, i2, this.f3487j - i3);
            this.f3487j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        l(i2);
        double[] dArr = this.f3486i;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f3487j;
    }
}
