package e.a.a.a.y0.e.a0.b;

import e.a.a.a.y0.e.z.a;
import e.t.g;
import e.x.c.i;
import java.util.Arrays;

public final class f extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final f f8767g = new f(1, 4, 0);
    public final boolean f;

    static {
        int[] iArr = new int[0];
        i.e(iArr, "numbers");
        i.e(iArr, "versionArray");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        i.e(copyOf, "numbers");
        Integer Y0 = b.q.a.a.Y0(copyOf, 0);
        if (Y0 != null) {
            Y0.intValue();
        }
        Integer Y02 = b.q.a.a.Y0(copyOf, 1);
        if (Y02 != null) {
            Y02.intValue();
        }
        Integer Y03 = b.q.a.a.Y0(copyOf, 2);
        if (Y03 != null) {
            Y03.intValue();
        }
        if (copyOf.length > 3) {
            i.e(copyOf, "$this$asList");
            g.W(new e.t.f(copyOf).subList(3, copyOf.length));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(int... iArr) {
        this(iArr, false);
        i.e(iArr, "numbers");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        i.e(iArr, "versionArray");
        this.f = z;
    }

    public boolean b() {
        boolean z;
        int i2 = this.a;
        if (i2 == 1 && this.f9183b == 0) {
            return false;
        }
        if (this.f) {
            z = a(f8767g);
        } else {
            f fVar = f8767g;
            z = i2 == fVar.a && this.f9183b <= fVar.f9183b + 1;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
