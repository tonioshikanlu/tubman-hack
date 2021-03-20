package b.l.a.c.f.i;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import b.l.a.c.b.a;

public final class c3 {
    @GuardedBy("GservicesLoader.class")
    public static c3 c;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f3507b;

    public c3() {
        this.a = null;
        this.f3507b = null;
    }

    public c3(Context context) {
        this.a = context;
        b3 b3Var = new b3();
        this.f3507b = b3Var;
        context.getContentResolver().registerContentObserver(t2.a, true, b3Var);
    }

    public static c3 a(Context context) {
        c3 c3Var;
        synchronized (c3.class) {
            if (c == null) {
                c = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new c3(context) : new c3();
            }
            c3Var = c;
        }
        return c3Var;
    }

    public final String b(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) a.Y0(new a3(this, str));
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }
}
