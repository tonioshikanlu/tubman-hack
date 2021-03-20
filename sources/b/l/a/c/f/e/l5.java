package b.l.a.c.f.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import b.l.a.c.b.a;
import java.io.IOException;

public final class l5 implements l2 {
    public final SharedPreferences.Editor a;

    public l5(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.a = (str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0)).edit();
    }

    public final void a(s8 s8Var) {
        if (!this.a.putString("GenericIdpKeyset", a.d1(s8Var.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void b(s9 s9Var) {
        if (!this.a.putString("GenericIdpKeyset", a.d1(s9Var.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
