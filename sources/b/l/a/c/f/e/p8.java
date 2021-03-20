package b.l.a.c.f.e;

public enum p8 implements g {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3225h;

    /* access modifiers changed from: public */
    p8(int i2) {
        this.f3225h = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(p8.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        p8 p8Var = UNRECOGNIZED;
        if (this != p8Var) {
            sb.append(" number=");
            if (this != p8Var) {
                sb.append(this.f3225h);
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
