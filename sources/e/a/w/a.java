package e.a.w;

import e.x.c.i;

public final class a extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
        i.e(illegalAccessException, "cause");
    }
}
