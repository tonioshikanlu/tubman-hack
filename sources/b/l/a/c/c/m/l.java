package b.l.a.c.c.m;

import android.util.Log;
import b.l.a.c.b.a;

public final class l {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2801b;

    public l(String str, String str2) {
        a.B(str, "log tag cannot be null");
        a.n(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f2801b = null;
        } else {
            this.f2801b = str2;
        }
    }

    public final boolean a(int i2) {
        return Log.isLoggable(this.a, i2);
    }
}
