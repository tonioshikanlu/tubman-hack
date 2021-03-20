package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class mn extends hm<Float> implements RandomAccess, i, k0 {

    /* renamed from: k  reason: collision with root package name */
    public static final mn f3176k;

    /* renamed from: i  reason: collision with root package name */
    public float[] f3177i;

    /* renamed from: j  reason: collision with root package name */
    public int f3178j;

    static {
        mn mnVar = new mn(new float[0], 0);
        f3176k = mnVar;
        mnVar.f3050h = false;
    }

    public mn() {
        this.f3177i = new float[10];
        this.f3178j = 0;
    }

    public mn(float[] fArr, int i2) {
        this.f3177i = fArr;
        this.f3178j = i2;
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i2 < 0 || i2 > (i3 = this.f3178j)) {
            throw new IndexOutOfBoundsException(n(i2));
        }
        float[] fArr = this.f3177i;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[a.H(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f3177i, i2, fArr2, i2 + 1, this.f3178j - i2);
            this.f3177i = fArr2;
        }
        this.f3177i[i2] = floatValue;
        this.f3178j++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = j.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof mn)) {
            return super.addAll(collection);
        }
        mn mnVar = (mn) collection;
        int i2 = mnVar.f3178j;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3178j;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f3177i;
            if (i4 > fArr.length) {
                this.f3177i = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(mnVar.f3177i, 0, this.f3177i, this.f3178j, mnVar.f3178j);
            this.f3178j = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f) {
        d();
        int i2 = this.f3178j;
        float[] fArr = this.f3177i;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[a.H(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f3177i = fArr2;
        }
        float[] fArr3 = this.f3177i;
        int i3 = this.f3178j;
        this.f3178j = i3 + 1;
        fArr3[i3] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return super.equals(obj);
        }
        mn mnVar = (mn) obj;
        if (this.f3178j != mnVar.f3178j) {
            return false;
        }
        float[] fArr = mnVar.f3177i;
        for (int i2 = 0; i2 < this.f3178j; i2++) {
            if (Float.floatToIntBits(this.f3177i[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i2) {
        l(i2);
        return Float.valueOf(this.f3177i[i2]);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= this.f3178j) {
            return new mn(Arrays.copyOf(this.f3177i, i2), this.f3178j);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3178j; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f3177i[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f3178j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3177i[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    public final void l(int i2) {
        if (i2 < 0 || i2 >= this.f3178j) {
            throw new IndexOutOfBoundsException(n(i2));
        }
    }

    public final String n(int i2) {
        return a.R(35, "Index:", i2, ", Size:", this.f3178j);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        l(i2);
        float[] fArr = this.f3177i;
        float f = fArr[i2];
        int i3 = this.f3178j;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f3178j--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i2, int i3) {
        d();
        if (i3 >= i2) {
            float[] fArr = this.f3177i;
            System.arraycopy(fArr, i3, fArr, i2, this.f3178j - i3);
            this.f3178j -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        l(i2);
        float[] fArr = this.f3177i;
        float f = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f3178j;
    }
}
