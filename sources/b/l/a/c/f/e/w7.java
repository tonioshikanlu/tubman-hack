package b.l.a.c.f.e;

public enum w7 implements g {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3379h;

    /* access modifiers changed from: public */
    w7(int i2) {
        this.f3379h = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(w7.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        w7 w7Var = UNRECOGNIZED;
        if (this != w7Var) {
            sb.append(" number=");
            if (this != w7Var) {
                sb.append(this.f3379h);
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
