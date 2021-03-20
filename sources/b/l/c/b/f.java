package b.l.c.b;

public enum f {
    OPEN(false),
    CLOSED(true);

    /* access modifiers changed from: public */
    f(boolean z) {
    }

    public static f d(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
