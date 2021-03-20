package b.o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import b.o.i2;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.segment.analytics.AnalyticsContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f2 {
    public static final int[] a = {401, 402, 403, 404, 410};

    public enum a {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");
        

        /* renamed from: h  reason: collision with root package name */
        public final String f6094h;

        /* access modifiers changed from: public */
        a(String str) {
            this.f6094h = str;
        }
    }

    public static boolean a() {
        try {
            return NotificationManagerCompat.from(i2.c).areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String b() {
        String language = Locale.getDefault().getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals("in")) {
            return AnalyticsContext.Device.DEVICE_ID_KEY;
        }
        if (language.equals("ji")) {
            return "yi";
        }
        if (!language.equals("zh")) {
            return language;
        }
        StringBuilder B = b.e.a.a.a.B(language, "-");
        B.append(Locale.getDefault().getCountry());
        return B.toString();
    }

    public static String d(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            i2.a(i2.k.ERROR, "", th);
            return null;
        }
    }

    public static String f(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static Uri g(Context context, String str) {
        int i2;
        StringBuilder sb;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!(str != null && !str.matches("^[0-9]")) || (i2 = resources.getIdentifier(str, "raw", packageName)) == 0) {
            i2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (i2 == 0) {
                return null;
            }
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
        }
        sb.append("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    public static boolean h() {
        Class<GoogleCloudMessaging> cls = GoogleCloudMessaging.class;
        return true;
    }

    public static boolean i() {
        Class<AGConnectServicesConfig> cls = AGConnectServicesConfig.class;
        return true;
    }

    public static boolean j() {
        Class<HuaweiApiAvailability> cls = HuaweiApiAvailability.class;
        return true;
    }

    public static boolean k() {
        Class<LocationCallback> cls = LocationCallback.class;
        return true;
    }

    public static boolean l() {
        Class<HmsInstanceId> cls = HmsInstanceId.class;
        return true;
    }

    public static boolean m() {
        boolean z;
        char c;
        boolean z2;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            c = 2;
        } else {
            if (!n()) {
                if (j()) {
                    if (i() && l()) {
                        z2 = o();
                        if (z2 || (!n() && s("com.huawei.hwid"))) {
                            c = 13;
                        }
                    }
                }
                z2 = false;
                c = 13;
            }
            c = 1;
        }
        if (c == 1) {
            return true;
        }
        return false;
    }

    public static boolean n() {
        return s("com.google.android.gms");
    }

    public static boolean o() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(i2.c) == 0;
    }

    public static <T> Set<T> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set<String> q(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            hashSet.add(jSONArray.getString(i2));
        }
        return hashSet;
    }

    public static void r(@NonNull String str) {
        Intent intent;
        Uri parse = Uri.parse(str.trim());
        a aVar = null;
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            a[] values = a.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                a aVar2 = values[i2];
                if (aVar2.f6094h.equalsIgnoreCase(scheme)) {
                    aVar = aVar2;
                    break;
                }
                i2++;
            }
        }
        if (aVar == null) {
            aVar = a.HTTP;
            if (!parse.toString().contains("://")) {
                StringBuilder y = b.e.a.a.a.y("http://");
                y.append(parse.toString());
                parse = Uri.parse(y.toString());
            }
        }
        if (aVar.ordinal() != 0) {
            intent = new Intent("android.intent.action.VIEW", parse);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(parse);
        }
        intent.addFlags(1476919296);
        i2.c.startActivity(intent);
    }

    public static boolean s(@NonNull String str) {
        try {
            return i2.c.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static long[] t(JSONObject jSONObject) {
        try {
            Object opt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = opt instanceof String ? new JSONArray((String) opt) : (JSONArray) opt;
            long[] jArr = new long[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jArr[i2] = jSONArray.optLong(i2);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void u(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static void v(int i2) {
        try {
            Thread.sleep((long) i2);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public int c() {
        boolean z;
        boolean z2 = false;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            return 2;
        }
        if (n()) {
            return 1;
        }
        if (j()) {
            if (i() && l()) {
                z2 = o();
            }
        }
        if (z2) {
            return 13;
        }
        if (!n() && s("com.huawei.hwid")) {
            return 13;
        }
        return 1;
    }

    public Integer e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) i2.c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }
}
