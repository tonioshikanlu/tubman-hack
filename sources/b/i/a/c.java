package b.i.a;

public class c {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public long f1061b;

    public c(long j2, int i2) {
        this.f1061b = j2;
        this.a = i2;
    }

    public static c a(String str, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char charAt = str.charAt(i2);
            if (charAt != '+') {
                if (charAt == '-') {
                    z2 = true;
                }
            }
            i2++;
        }
        long j2 = 0;
        int i4 = i2;
        while (i4 < i3) {
            char charAt2 = str.charAt(i4);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            long j3 = j2 * 10;
            long j4 = (long) (charAt2 - '0');
            if (z2) {
                j2 = j3 - j4;
                if (j2 < -2147483648L) {
                    return null;
                }
            } else {
                j2 = j3 + j4;
                if (j2 > 2147483647L) {
                    return null;
                }
            }
            i4++;
        }
        if (i4 == i2) {
            return null;
        }
        return new c(j2, i4);
    }
}
