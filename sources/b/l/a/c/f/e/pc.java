package b.l.a.c.f.e;

import b.e.a.a.a;

public final class pc extends pb {
    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i2 = 46;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return a.r(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
