package b.l.a.c.c.p;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

public class f {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @Nullable
    public static String a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
