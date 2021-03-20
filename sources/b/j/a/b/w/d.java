package b.j.a.b.w;

import b.j.a.b.f;
import b.j.a.b.w.e;

public class d extends e.c {

    /* renamed from: k  reason: collision with root package name */
    public static final String f1555k;

    /* renamed from: l  reason: collision with root package name */
    public static final d f1556l;

    /* renamed from: h  reason: collision with root package name */
    public final char[] f1557h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1558i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1559j;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        f1555k = str;
        f1556l = new d("  ", str);
    }

    public d(String str, String str2) {
        this.f1558i = str.length();
        this.f1557h = new char[(str.length() * 16)];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            str.getChars(0, str.length(), this.f1557h, i2);
            i2 += str.length();
        }
        this.f1559j = str2;
    }

    public boolean l() {
        return false;
    }

    public void m(f fVar, int i2) {
        fVar.H0(this.f1559j);
        if (i2 > 0) {
            int i3 = i2 * this.f1558i;
            while (true) {
                char[] cArr = this.f1557h;
                if (i3 > cArr.length) {
                    fVar.I0(cArr, 0, cArr.length);
                    i3 -= this.f1557h.length;
                } else {
                    fVar.I0(cArr, 0, i3);
                    return;
                }
            }
        }
    }
}
