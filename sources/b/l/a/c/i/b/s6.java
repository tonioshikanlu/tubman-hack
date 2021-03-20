package b.l.a.c.i.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.a.c.b.a;
import java.util.Objects;

public final class s6 {
    @Deprecated
    public static String a(Context context, String str) {
        try {
            Objects.requireNonNull(context, "null reference");
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("google_app_id", "string", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
            if (identifier == 0) {
                return null;
            }
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context, String str, String str2) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = a.a1(context);
        }
        return a.E1("google_app_id", resources, str2);
    }

    public static String c(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i2];
            }
        }
        return null;
    }
}
