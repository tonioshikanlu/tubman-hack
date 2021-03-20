package e.a.a.a.y0.e.z;

import androidx.core.os.EnvironmentCompat;
import e.t.f;
import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;

public abstract class a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9183b;
    public final int c;
    public final List<Integer> d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f9184e;

    public a(int... iArr) {
        List<Integer> list;
        i.e(iArr, "numbers");
        this.f9184e = iArr;
        Integer Y0 = b.q.a.a.Y0(iArr, 0);
        int i2 = -1;
        this.a = Y0 != null ? Y0.intValue() : -1;
        Integer Y02 = b.q.a.a.Y0(iArr, 1);
        this.f9183b = Y02 != null ? Y02.intValue() : -1;
        Integer Y03 = b.q.a.a.Y0(iArr, 2);
        this.c = Y03 != null ? Y03.intValue() : i2;
        if (iArr.length > 3) {
            i.e(iArr, "$this$asList");
            list = g.W(new f(iArr).subList(3, iArr.length));
        } else {
            list = o.f7934h;
        }
        this.d = list;
    }

    public final boolean a(a aVar) {
        i.e(aVar, "ourVersion");
        int i2 = this.a;
        if (i2 == 0) {
            if (aVar.a == 0 && this.f9183b == aVar.f9183b) {
                return true;
            }
        } else if (i2 == aVar.a && this.f9183b <= aVar.f9183b) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && i.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            return this.a == aVar.a && this.f9183b == aVar.f9183b && this.c == aVar.c && i.a(this.d, aVar.d);
        }
    }

    public int hashCode() {
        int i2 = this.a;
        int i3 = (i2 * 31) + this.f9183b + i2;
        int i4 = (i3 * 31) + this.c + i3;
        return this.d.hashCode() + (i4 * 31) + i4;
    }

    public String toString() {
        int[] iArr = this.f9184e;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (!(i3 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList.isEmpty() ? EnvironmentCompat.MEDIA_UNKNOWN : g.x(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }
}
