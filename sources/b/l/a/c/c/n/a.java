package b.l.a.c.c.n;

import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.l;
import java.util.Locale;

public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2819b;
    public final int c;

    public a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder v = b.e.a.a.a.v('[');
            for (String str3 : strArr) {
                if (v.length() > 1) {
                    v.append(",");
                }
                v.append(str3);
            }
            v.append(']');
            v.append(' ');
            str2 = v.toString();
        }
        this.f2819b = str2;
        this.a = str;
        new l(str, (String) null);
        int i2 = 2;
        while (7 >= i2 && !Log.isLoggable(this.a, i2)) {
            i2++;
        }
        this.c = i2;
    }

    public void a(String str, @Nullable Object... objArr) {
        if (this.c <= 3) {
            Log.d(this.a, c(str, objArr));
        }
    }

    public void b(String str, @Nullable Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    public String c(String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f2819b.concat(str);
    }

    public void d(String str, @Nullable Object... objArr) {
        if (this.c <= 2) {
            Log.v(this.a, c(str, objArr));
        }
    }

    public void e(String str, @Nullable Object... objArr) {
        Log.w(this.a, c(str, objArr));
    }
}
