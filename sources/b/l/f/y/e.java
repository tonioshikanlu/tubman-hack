package b.l.f.y;

import java.util.List;

public final class e {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5826b;
    public final String c;
    public final List<byte[]> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5827e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5828g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5829h;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i2, int i3) {
        this.a = bArr;
        this.f5826b = bArr == null ? 0 : bArr.length * 8;
        this.c = str;
        this.d = list;
        this.f5827e = str2;
        this.f5828g = i3;
        this.f5829h = i2;
    }
}
