package b.l.d.o.e0;

import android.content.Context;
import android.content.SharedPreferences;

public final class a0 {
    public static final a0 a = new a0();

    public static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    public static final SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }
}
