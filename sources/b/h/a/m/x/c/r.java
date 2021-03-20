package b.h.a.m.x.c;

import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;

public final class r {
    public static final File f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    public static volatile r f875g;
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final int f876b;
    public final int c;
    @GuardedBy("this")
    public int d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public boolean f877e = true;

    @VisibleForTesting
    public r() {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.hashCode();
            char c2 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (i2 == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.a = z;
        if (i2 >= 28) {
            this.f876b = 20000;
            this.c = 0;
            return;
        }
        this.f876b = 700;
        this.c = 128;
    }

    public static r a() {
        if (f875g == null) {
            synchronized (r.class) {
                if (f875g == null) {
                    f875g = new r();
                }
            }
        }
        return f875g;
    }

    public boolean b(int i2, int i3, boolean z, boolean z2) {
        int i4;
        boolean z3;
        if (!z || !this.a || Build.VERSION.SDK_INT < 26 || z2 || i2 < (i4 = this.c) || i3 < i4) {
            return false;
        }
        synchronized (this) {
            int i5 = this.d + 1;
            this.d = i5;
            if (i5 >= 50) {
                this.d = 0;
                int length = f.list().length;
                boolean z4 = length < this.f876b;
                this.f877e = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f876b);
                }
            }
            z3 = this.f877e;
        }
        return z3;
    }
}
