package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class dn extends hm<Double> implements RandomAccess, i, k0 {

    /* renamed from: k  reason: collision with root package name */
    public static final dn f2934k;

    /* renamed from: i  reason: collision with root package name */
    public double[] f2935i;

    /* renamed from: j  reason: collision with root package name */
    public int f2936j;

    static {
        dn dnVar = new dn(new double[0], 0);
        f2934k = dnVar;
        dnVar.f3050h = false;
    }

    public dn() {
        this.f2935i = new double[10];
        this.f2936j = 0;
    }

    public dn(double[] dArr, int i2) {
        this.f2935i = dArr;
        this.f2936j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f2936j)) {
            throw new IndexOutOfBoundsException(n(i2));
        }
        double[] dArr = this.f2935i;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[a.H(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f2935i, i2, dArr2, i2 + 1, this.f2936j - i2);
            this.f2935i = dArr2;
        }
        this.f2935i[i2] = doubleValue;
        this.f2936j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = j.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof dn)) {
            return super.addAll(collection);
        }
        dn dnVar = (dn) collection;
        int i2 = dnVar.f2936j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2936j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f2935i;
            if (i4 > dArr.length) {
                this.f2935i = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(dnVar.f2935i, 0, this.f2935i, this.f2936j, dnVar.f2936j);
            this.f2936j = i4;
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
        int i2 = this.f2936j;
        double[] dArr = this.f2935i;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[a.H(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f2935i = dArr2;
        }
        double[] dArr3 = this.f2935i;
        int i3 = this.f2936j;
        this.f2936j = i3 + 1;
        dArr3[i3] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return super.equals(obj);
        }
        dn dnVar = (dn) obj;
        if (this.f2936j != dnVar.f2936j) {
            return false;
        }
        double[] dArr = dnVar.f2935i;
        for (int i2 = 0; i2 < this.f2936j; i2++) {
            if (Double.doubleToLongBits(this.f2935i[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        l(i2);
        return Double.valueOf(this.f2935i[i2]);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f2936j) {
            return new dn(Arrays.copyOf(this.f2935i, i2), this.f2936j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2936j; i3++) {
            i2 = (i2 * 31) + j.a(Double.doubleToLongBits(this.f2935i[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f2936j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f2935i[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f2936j) {
            throw new IndexOutOfBoundsException(n(i2));
        }
    }

    public final String n(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f2936j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        l(i2);
        double[] dArr = this.f2935i;
        double d = dArr[i2];
        int i3 = this.f2936j;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f2936j--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            double[] dArr = this.f2935i;
            System.arraycopy(dArr, i3, dArr, i2, this.f2936j - i3);
            this.f2936j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        l(i2);
        double[] dArr = this.f2935i;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f2936j;
    }
}
