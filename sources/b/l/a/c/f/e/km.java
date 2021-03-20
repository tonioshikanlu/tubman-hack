package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class km extends hm<Boolean> implements RandomAccess, i, k0 {

    /* renamed from: k  reason: collision with root package name */
    public static final km f3113k;

    /* renamed from: i  reason: collision with root package name */
    public boolean[] f3114i;

    /* renamed from: j  reason: collision with root package name */
    public int f3115j;

    static {
        km kmVar = new km(new boolean[0], 0);
        f3113k = kmVar;
        kmVar.f3050h = false;
    }

    public km() {
        this.f3114i = new boolean[10];
        this.f3115j = 0;
    }

    public km(boolean[] zArr, int i2) {
        this.f3114i = zArr;
        this.f3115j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3115j)) {
            throw new IndexOutOfBoundsException(n(i2));
        }
        boolean[] zArr = this.f3114i;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[a.H(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f3114i, i2, zArr2, i2 + 1, this.f3115j - i2);
            this.f3114i = zArr2;
        }
        this.f3114i[i2] = booleanValue;
        this.f3115j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = j.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof km)) {
            return super.addAll(collection);
        }
        km kmVar = (km) collection;
        int i2 = kmVar.f3115j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3115j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f3114i;
            if (i4 > zArr.length) {
                this.f3114i = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(kmVar.f3114i, 0, this.f3114i, this.f3115j, kmVar.f3115j);
            this.f3115j = i4;
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
        int i2 = this.f3115j;
        boolean[] zArr = this.f3114i;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[a.H(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f3114i = zArr2;
        }
        boolean[] zArr3 = this.f3114i;
        int i3 = this.f3115j;
        this.f3115j = i3 + 1;
        zArr3[i3] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return super.equals(obj);
        }
        km kmVar = (km) obj;
        if (this.f3115j != kmVar.f3115j) {
            return false;
        }
        boolean[] zArr = kmVar.f3114i;
        for (int i2 = 0; i2 < this.f3115j; i2++) {
            if (this.f3114i[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        l(i2);
        return Boolean.valueOf(this.f3114i[i2]);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f3115j) {
            return new km(Arrays.copyOf(this.f3114i, i2), this.f3115j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3115j; i3++) {
            i2 = (i2 * 31) + j.b(this.f3114i[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f3115j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3114i[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f3115j) {
            throw new IndexOutOfBoundsException(n(i2));
        }
    }

    public final String n(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3115j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        l(i2);
        boolean[] zArr = this.f3114i;
        boolean z = zArr[i2];
        int i3 = this.f3115j;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f3115j--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            boolean[] zArr = this.f3114i;
            System.arraycopy(zArr, i3, zArr, i2, this.f3115j - i3);
            this.f3115j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        d();
        l(i2);
        boolean[] zArr = this.f3114i;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3115j;
    }
}
