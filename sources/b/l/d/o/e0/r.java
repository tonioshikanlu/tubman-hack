package b.l.d.o.e0;

import android.content.SharedPreferences;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class r {
    public static final List<String> a = new ArrayList(Arrays.asList(new String[]{"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", BasePayload.TIMESTAMP_KEY}));

    /* renamed from: b  reason: collision with root package name */
    public static final r f4995b = new r();

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : a) {
            edit.remove(remove);
        }
        edit.commit();
    }
}
