package b.l.f.d0.g;

public final class b {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5682b = 0;

    public b(int i2) {
        this.a = new byte[i2];
    }

    public void a(boolean z, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f5682b;
            this.f5682b = i4 + 1;
            this.a[i4] = z ? (byte) 1 : 0;
        }
    }
}
