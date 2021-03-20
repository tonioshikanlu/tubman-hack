package b.l.a.c.f.i;

public enum w0 implements r5 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3795h;

    /* access modifiers changed from: public */
    w0(int i2) {
        this.f3795h = i2;
    }

    public static w0 d(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public final String toString() {
        return "<" + w0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3795h + " name=" + name() + '>';
    }
}
