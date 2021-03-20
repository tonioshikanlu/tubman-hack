package b.a.a.e;

import android.os.Build;
import b.f.a.e;
import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.Constants;
import com.karumi.dexter.BuildConfig;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.Properties;
import e.x.c.i;
import java.util.UUID;

public final class a {
    public static final String a = e.B();

    /* renamed from: b  reason: collision with root package name */
    public static final a f235b = null;

    public static final void a(String str, int i2) {
        Analytics O = b.e.a.a.a.O(str, "appReviewEventType");
        String c = c();
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "java.util.UUID.randomUUID().toString()");
        b.e.a.a.a.K("Slack", true, O, str, b(c, uuid).putValue("app_sessions", (Object) Integer.valueOf(i2)));
    }

    public static final Properties b(String str, String str2) {
        Properties putValue = new Properties().putValue("time_stamp", (Object) Long.valueOf(System.currentTimeMillis())).putValue(AmplitudeClient.DEVICE_ID_KEY, (Object) a).putValue("app_id", (Object) str).putValue("minor_version", (Object) "1").putValue("major_version", (Object) BuildConfig.VERSION_NAME).putValue(Constants.AMP_TRACKING_OPTION_PLATFORM, (Object) Constants.PLATFORM).putValue("uuid", (Object) str2);
        i.d(putValue, "Properties().putValue(TI…    .putValue(UUID, uuid)");
        return putValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String c() {
        /*
            com.appfoundry.previewer.model.JsonApp r0 = b.a.a.n.c.f()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            java.lang.String r0 = b.f.a.e.d()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.e.a.c():java.lang.String");
    }

    public static final void d(String str) {
        b.e.a.a.a.K("Slack", false, b.e.a.a.a.O(str, "mapUri"), "Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", c(), "action_type", "map", "action_data", str));
    }

    public static final void e(String str, String str2, String str3) {
        Analytics with = Analytics.with(e.c());
        String c = c();
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "java.util.UUID.randomUUID().toString()");
        Properties putValue = b(c, uuid).putValue("os", (Object) Build.VERSION.RELEASE).putValue("version", (Object) String.valueOf(Build.VERSION.SDK_INT)).putValue("brand", (Object) Build.BRAND);
        String str4 = Build.MODEL;
        i.d(str4, "Build.MODEL");
        Properties putValue2 = putValue.putValue(AnalyticsContext.Device.DEVICE_MODEL_KEY, (Object) str4).putValue("model_identifier", (Object) Build.PRODUCT);
        if (str2 == null) {
            str2 = "UnknownTag";
        }
        with.track(str, putValue2.putValue("tag", (Object) str2).putValue("message", (Object) str3));
    }
}
