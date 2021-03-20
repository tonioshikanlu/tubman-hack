package e.a.a.a.y0.e.a0.b;

import e.a.a.a.y0.e.z.a;
import e.t.f;
import e.t.g;
import e.x.c.i;
import java.util.Arrays;

public final class c extends a {
    public static final c f = new c(1, 0, 3);

    static {
        int[] iArr = new int[0];
        i.e(iArr, "numbers");
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
            g.W(new f(copyOf).subList(3, copyOf.length));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        i.e(iArr, "numbers");
    }
}
