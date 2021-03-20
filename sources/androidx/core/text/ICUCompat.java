package androidx.core.text;

import android.icu.util.ULocale;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    private ICUCompat() {
    }

    private static String addLikelySubtags(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w(TAG, e2);
        }
        return locale2;
    }

    private static String getScript(String str) {
        try {
            Method method = sGetScriptMethod;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w(TAG, e2);
        }
        return null;
    }

    @Nullable
    public static String maximizeAndGetScript(Locale locale) {
        return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
    }
}
