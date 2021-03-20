package e.a.w;

import e.x.c.i;

public final class b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        i.e(illegalAccessException, "cause");
    }
}
