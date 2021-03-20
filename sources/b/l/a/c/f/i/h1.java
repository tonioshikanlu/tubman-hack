package b.l.a.c.f.i;

public enum h1 implements r5 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f3586h;

    /* access modifiers changed from: public */
    h1(int i2) {
        this.f3586h = i2;
    }

    public final String toString() {
        return "<" + h1.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3586h + " name=" + name() + '>';
    }
}
