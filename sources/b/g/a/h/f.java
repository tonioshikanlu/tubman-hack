package b.g.a.h;

import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.amplitude.api.DeviceInfo;

public abstract class f {
    public static final String a = "f";

    public static String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            String str4 = a;
            Log.e(str4, "The Domain is invalid and the Callback URI will not be set. You used: " + str3);
            return null;
        }
        Uri build = Uri.parse(str3).buildUpon().scheme(str).appendPath(DeviceInfo.OS_NAME).appendPath(str2).appendPath("callback").build();
        String str5 = a;
        Log.v(str5, "The Callback URI is: " + build);
        return build.toString();
    }
}
