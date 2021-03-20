package b.l.a.c.f.i;

public enum q0 implements r5 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3693h;

    /* access modifiers changed from: public */
    q0(int i2) {
        this.f3693h = i2;
    }

    public static q0 d(int i2) {
        if (i2 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i2 == 1) {
            return LESS_THAN;
        }
        if (i2 == 2) {
            return GREATER_THAN;
        }
        if (i2 == 3) {
            return EQUAL;
        }
        if (i2 != 4) {
            return null;
        }
        return BETWEEN;
    }

    public final String toString() {
        return "<" + q0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3693h + " name=" + name() + '>';
    }
}
