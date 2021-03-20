package b.l.a.c.f.i;

public enum q2 implements r5 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3700h;

    /* access modifiers changed from: public */
    q2(int i2) {
        this.f3700h = i2;
    }

    public final String toString() {
        return "<" + q2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3700h + " name=" + name() + '>';
    }
}
