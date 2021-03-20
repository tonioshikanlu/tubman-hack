package e.a.a.a.y0.i;

public enum a {
    NO_ARGUMENTS(false, false, 3),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9315h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9316i;

    /* access modifiers changed from: public */
    a(boolean z, boolean z2) {
        this.f9315h = z;
        this.f9316i = z2;
    }

    /* access modifiers changed from: public */
    a(boolean z, boolean z2, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        this.f9315h = z;
        this.f9316i = z2;
    }
}
