package b.m.a;

import android.graphics.Rect;
import b.e.a.a.a;

public class s {
    public n a;

    /* renamed from: b  reason: collision with root package name */
    public int f5932b;
    public int c;
    public Rect d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5933e;

    public s(byte[] bArr, int i2, int i3, int i4, int i5) {
        this.a = new n(bArr, i2, i3);
        this.c = i5;
        this.f5932b = i4;
        if (i2 * i3 > bArr.length) {
            StringBuilder A = a.A("Image data does not match the resolution. ", i2, "x", i3, " > ");
            A.append(bArr.length);
            throw new IllegalArgumentException(A.toString());
        }
    }
}
