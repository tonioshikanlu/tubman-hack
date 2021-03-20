package b.l.a.c.f.e;

import b.l.a.c.b.a;

public final class xl extends w0 {
    public xl(sm smVar, w1 w1Var, CharSequence charSequence) {
        super(w1Var, charSequence);
    }

    public final int a(int i2) {
        String str;
        CharSequence charSequence = this.f3370j;
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            if (i2 < 0) {
                str = a.T1("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (length < 0) {
                throw new IllegalArgumentException(b.e.a.a.a.Q(26, "negative size: ", length));
            } else {
                str = a.T1("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(length));
            }
            throw new IndexOutOfBoundsException(str);
        }
        while (i2 < length) {
            if (charSequence.charAt(i2) == '.') {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int b(int i2) {
        return i2 + 1;
    }
}
