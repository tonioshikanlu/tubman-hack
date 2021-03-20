package b.l.a.c.f.e;

public enum g9 implements g {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3008h;

    /* access modifiers changed from: public */
    g9(int i2) {
        this.f3008h = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(g9.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        g9 g9Var = UNRECOGNIZED;
        if (this != g9Var) {
            sb.append(" number=");
            if (this != g9Var) {
                sb.append(this.f3008h);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
