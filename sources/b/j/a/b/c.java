package b.j.a.b;

public enum c {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);
    

    /* renamed from: h  reason: collision with root package name */
    public final String f1379h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1380i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1381j;

    /* access modifiers changed from: public */
    c(String str, boolean z, int i2) {
        this.f1379h = str;
        this.f1380i = z;
        this.f1381j = i2;
    }
}
