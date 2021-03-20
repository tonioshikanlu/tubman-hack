package e.t;

import b.q.a.a;
import e.x.c.i;
import java.util.RandomAccess;

public final class f extends b<Integer> implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int[] f7929h;

    public f(int[] iArr) {
        this.f7929h = iArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f7929h;
        i.e(iArr, "$this$contains");
        if (a.x1(iArr, intValue) >= 0) {
            return true;
        }
        return false;
    }

    public int d() {
        return this.f7929h.length;
    }

    public Object get(int i2) {
        return Integer.valueOf(this.f7929h[i2]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return a.x1(this.f7929h, ((Number) obj).intValue());
    }

    public boolean isEmpty() {
        return this.f7929h.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f7929h;
        i.e(iArr, "$this$lastIndexOf");
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (intValue == iArr[length]) {
                return length;
            }
        }
        return -1;
    }
}
