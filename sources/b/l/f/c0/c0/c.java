package b.l.f.c0.c0;

import b.l.f.s;

public final class c {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5596b;
    public final s[] c;

    public c(int i2, int[] iArr, int i3, int i4, int i5) {
        this.a = i2;
        this.f5596b = iArr;
        float f = (float) i5;
        this.c = new s[]{new s((float) i3, f), new s((float) i4, f)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
