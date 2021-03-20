package b.l.d.q.f;

import android.util.Log;

public class b {
    public static final b a = new b("FirebaseCrashlytics");

    public b(String str) {
    }

    public final boolean a(int i2) {
        return 4 <= i2 || Log.isLoggable("FirebaseCrashlytics", i2);
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, th);
        }
    }

    public void d(String str) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    public void f(String str) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, (Throwable) null);
        }
    }
}
