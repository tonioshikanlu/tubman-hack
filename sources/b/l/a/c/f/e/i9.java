package b.l.a.c.f.e;

public enum i9 implements g {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3058h;

    /* access modifiers changed from: public */
    i9(int i2) {
        this.f3058h = i2;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f3058h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(i9.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
