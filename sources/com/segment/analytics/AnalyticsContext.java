package com.segment.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.os.EnvironmentCompat;
import com.amplitude.api.Constants;
import com.amplitude.api.DeviceInfo;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.core.BuildConfig;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;

public class AnalyticsContext extends ValueMap {
    private static final String APP_BUILD_KEY = "build";
    private static final String APP_KEY = "app";
    private static final String APP_NAMESPACE_KEY = "namespace";
    private static final String APP_NAME_KEY = "name";
    private static final String APP_VERSION_KEY = "version";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String DEVICE_KEY = "device";
    private static final String LIBRARY_KEY = "library";
    private static final String LIBRARY_NAME_KEY = "name";
    private static final String LIBRARY_VERSION_KEY = "version";
    private static final String LOCALE_KEY = "locale";
    private static final String LOCATION_KEY = "location";
    private static final String NETWORK_BLUETOOTH_KEY = "bluetooth";
    private static final String NETWORK_CARRIER_KEY = "carrier";
    private static final String NETWORK_CELLULAR_KEY = "cellular";
    private static final String NETWORK_KEY = "network";
    private static final String NETWORK_WIFI_KEY = "wifi";
    private static final String OS_KEY = "os";
    private static final String OS_NAME_KEY = "name";
    private static final String OS_VERSION_KEY = "version";
    private static final String REFERRER_KEY = "referrer";
    private static final String SCREEN_DENSITY_KEY = "density";
    private static final String SCREEN_HEIGHT_KEY = "height";
    private static final String SCREEN_KEY = "screen";
    private static final String SCREEN_WIDTH_KEY = "width";
    private static final String TIMEZONE_KEY = "timezone";
    private static final String TRAITS_KEY = "traits";
    private static final String USER_AGENT_KEY = "userAgent";

    public static class Campaign extends ValueMap {
        private static final String CAMPAIGN_CONTENT_KEY = "content";
        private static final String CAMPAIGN_MEDIUM_KEY = "medium";
        private static final String CAMPAIGN_NAME_KEY = "name";
        private static final String CAMPAIGN_SOURCE_KEY = "source";
        private static final String CAMPAIGN_TERM_KEY = "term";

        public Campaign() {
        }

        private Campaign(Map<String, Object> map) {
            super(map);
        }

        public String content() {
            return getString(CAMPAIGN_CONTENT_KEY);
        }

        public String medium() {
            return getString("medium");
        }

        public String name() {
            return getString("name");
        }

        public Campaign putContent(String str) {
            return putValue(CAMPAIGN_CONTENT_KEY, (Object) str);
        }

        public Campaign putMedium(String str) {
            return putValue("medium", (Object) str);
        }

        public Campaign putName(String str) {
            return putValue("name", (Object) str);
        }

        public Campaign putSource(String str) {
            return putValue(CAMPAIGN_SOURCE_KEY, (Object) str);
        }

        public Campaign putTerm(String str) {
            return putValue(CAMPAIGN_TERM_KEY, (Object) str);
        }

        public Campaign putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        public String source() {
            return getString(CAMPAIGN_SOURCE_KEY);
        }

        public String term() {
            return getString(CAMPAIGN_TERM_KEY);
        }

        public String tern() {
            return term();
        }
    }

    public static class Device extends ValueMap {
        public static final String DEVICE_ADVERTISING_ID_KEY = "advertisingId";
        public static final String DEVICE_AD_TRACKING_ENABLED_KEY = "adTrackingEnabled";
        public static final String DEVICE_ID_KEY = "id";
        public static final String DEVICE_MANUFACTURER_KEY = "manufacturer";
        public static final String DEVICE_MODEL_KEY = "model";
        public static final String DEVICE_NAME_KEY = "name";
        public static final String DEVICE_TOKEN_KEY = "token";
        public static final String DEVICE_TYPE_KEY = "type";

        public Device() {
        }

        private Device(Map<String, Object> map) {
            super(map);
        }

        public void putAdvertisingInfo(String str, boolean z) {
            if (z && !Utils.isNullOrEmpty((CharSequence) str)) {
                put(DEVICE_ADVERTISING_ID_KEY, (Object) str);
            }
            put(DEVICE_AD_TRACKING_ENABLED_KEY, (Object) Boolean.valueOf(z));
        }

        public Device putDeviceToken(String str) {
            return putValue(DEVICE_TOKEN_KEY, (Object) str);
        }

        public Device putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }
    }

    public static class Location extends ValueMap {
        private static final String LOCATION_LATITUDE_KEY = "latitude";
        private static final String LOCATION_LONGITUDE_KEY = "longitude";
        private static final String LOCATION_SPEED_KEY = "speed";

        public Location() {
        }

        private Location(Map<String, Object> map) {
            super(map);
        }

        public double latitude() {
            return getDouble(LOCATION_LATITUDE_KEY, ShadowDrawableWrapper.COS_45);
        }

        public double longitude() {
            return getDouble(LOCATION_LONGITUDE_KEY, ShadowDrawableWrapper.COS_45);
        }

        public Location putLatitude(double d) {
            return putValue(LOCATION_LATITUDE_KEY, (Object) Double.valueOf(d));
        }

        public Location putLongitude(double d) {
            return putValue(LOCATION_LONGITUDE_KEY, (Object) Double.valueOf(d));
        }

        public Location putSpeed(double d) {
            return putValue(LOCATION_SPEED_KEY, (Object) Double.valueOf(d));
        }

        public Location putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        public double speed() {
            return getDouble(LOCATION_SPEED_KEY, ShadowDrawableWrapper.COS_45);
        }
    }

    public static class Referrer extends ValueMap {
        private static final String REFERRER_ID_KEY = "id";
        private static final String REFERRER_LINK_KEY = "link";
        private static final String REFERRER_NAME_KEY = "name";
        private static final String REFERRER_TYPE_KEY = "type";
        private static final String REFERRER_URL_KEY = "url";

        public Referrer() {
        }

        public Referrer(Map<String, Object> map) {
            super(map);
        }

        public String id() {
            return getString("id");
        }

        public String link() {
            return getString(REFERRER_LINK_KEY);
        }

        public String name() {
            return getString("name");
        }

        public Referrer putId(String str) {
            return putValue("id", (Object) str);
        }

        public Referrer putLink(String str) {
            return putValue(REFERRER_LINK_KEY, (Object) str);
        }

        public Referrer putName(String str) {
            return putValue("name", (Object) str);
        }

        public Referrer putTerm(String str) {
            return putValue(REFERRER_URL_KEY, (Object) str);
        }

        public Referrer putType(String str) {
            return putValue("type", (Object) str);
        }

        public Referrer putUrl(String str) {
            return putValue(REFERRER_URL_KEY, (Object) str);
        }

        public Referrer putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        public String type() {
            return getString("type");
        }

        public String url() {
            return getString(REFERRER_URL_KEY);
        }
    }

    public AnalyticsContext(Map<String, Object> map) {
        super(map);
    }

    public static synchronized AnalyticsContext create(Context context, Traits traits, boolean z) {
        AnalyticsContext analyticsContext;
        synchronized (AnalyticsContext.class) {
            analyticsContext = new AnalyticsContext(new Utils.NullableConcurrentHashMap());
            analyticsContext.putApp(context);
            analyticsContext.setTraits(traits);
            analyticsContext.putDevice(context, z);
            analyticsContext.putLibrary();
            analyticsContext.put(LOCALE_KEY, (Object) Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            analyticsContext.putNetwork(context);
            analyticsContext.putOs();
            analyticsContext.putScreen(context);
            putUndefinedIfNull(analyticsContext, USER_AGENT_KEY, System.getProperty("http.agent"));
            putUndefinedIfNull(analyticsContext, TIMEZONE_KEY, TimeZone.getDefault().getID());
        }
        return analyticsContext;
    }

    public static void putUndefinedIfNull(Map<String, Object> map, String str, CharSequence charSequence) {
        if (Utils.isNullOrEmpty(charSequence)) {
            charSequence = "undefined";
        }
        map.put(str, charSequence);
    }

    public void attachAdvertisingId(Context context, CountDownLatch countDownLatch, Logger logger) {
        if (Utils.isOnClassPath("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            new GetAdvertisingIdTask(this, countDownLatch, logger).execute(new Context[]{context});
            return;
        }
        logger.debug("Not collecting advertising ID because com.google.android.gms.ads.identifier.AdvertisingIdClient was not found on the classpath.", new Object[0]);
        countDownLatch.countDown();
    }

    public Campaign campaign() {
        return (Campaign) getValueMap(CAMPAIGN_KEY, Campaign.class);
    }

    public Device device() {
        return (Device) getValueMap(DEVICE_KEY, Device.class);
    }

    public Location location() {
        return (Location) getValueMap(LOCATION_KEY, Location.class);
    }

    public void putApp(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Map createMap = Utils.createMap();
            putUndefinedIfNull(createMap, "name", packageInfo.applicationInfo.loadLabel(packageManager));
            putUndefinedIfNull(createMap, "version", packageInfo.versionName);
            putUndefinedIfNull(createMap, APP_NAMESPACE_KEY, packageInfo.packageName);
            createMap.put(APP_BUILD_KEY, String.valueOf(packageInfo.versionCode));
            put(APP_KEY, (Object) createMap);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public AnalyticsContext putCampaign(Campaign campaign) {
        return putValue(CAMPAIGN_KEY, (Object) campaign);
    }

    public void putDevice(Context context, boolean z) {
        Device device = new Device();
        device.put(Device.DEVICE_ID_KEY, (Object) z ? Utils.getDeviceId(context) : traits().anonymousId());
        device.put(Device.DEVICE_MANUFACTURER_KEY, (Object) Build.MANUFACTURER);
        device.put(Device.DEVICE_MODEL_KEY, (Object) Build.MODEL);
        device.put("name", (Object) Build.DEVICE);
        device.put("type", (Object) DeviceInfo.OS_NAME);
        put(DEVICE_KEY, (Object) device);
    }

    public AnalyticsContext putDeviceToken(String str) {
        device().putDeviceToken(str);
        return this;
    }

    public void putLibrary() {
        Map createMap = Utils.createMap();
        createMap.put("name", "analytics-android");
        createMap.put("version", BuildConfig.VERSION_NAME);
        put(LIBRARY_KEY, (Object) createMap);
    }

    public AnalyticsContext putLocation(Location location) {
        return putValue(LOCATION_KEY, (Object) location);
    }

    @SuppressLint({"MissingPermission"})
    public void putNetwork(Context context) {
        ConnectivityManager connectivityManager;
        Map createMap = Utils.createMap();
        if (Utils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) Utils.getSystemService(context, "connectivity")) != null) {
            boolean z = true;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            createMap.put(NETWORK_WIFI_KEY, Boolean.valueOf(networkInfo != null && networkInfo.isConnected()));
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
            createMap.put(NETWORK_BLUETOOTH_KEY, Boolean.valueOf(networkInfo2 != null && networkInfo2.isConnected()));
            NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
            if (networkInfo3 == null || !networkInfo3.isConnected()) {
                z = false;
            }
            createMap.put(NETWORK_CELLULAR_KEY, Boolean.valueOf(z));
        }
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getSystemService(context, "phone");
        createMap.put("carrier", telephonyManager != null ? telephonyManager.getNetworkOperatorName() : EnvironmentCompat.MEDIA_UNKNOWN);
        put(NETWORK_KEY, (Object) createMap);
    }

    public void putOs() {
        Map createMap = Utils.createMap();
        createMap.put("name", Constants.PLATFORM);
        createMap.put("version", Build.VERSION.RELEASE);
        put(OS_KEY, (Object) createMap);
    }

    public AnalyticsContext putReferrer(Referrer referrer) {
        return putValue(REFERRER_KEY, (Object) referrer);
    }

    public void putScreen(Context context) {
        Map createMap = Utils.createMap();
        Display defaultDisplay = ((WindowManager) Utils.getSystemService(context, "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        createMap.put(SCREEN_DENSITY_KEY, Float.valueOf(displayMetrics.density));
        createMap.put(SCREEN_HEIGHT_KEY, Integer.valueOf(displayMetrics.heightPixels));
        createMap.put(SCREEN_WIDTH_KEY, Integer.valueOf(displayMetrics.widthPixels));
        put(SCREEN_KEY, (Object) createMap);
    }

    public AnalyticsContext putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }

    public void setTraits(Traits traits) {
        put("traits", (Object) traits.unmodifiableCopy());
    }

    public Traits traits() {
        return (Traits) getValueMap("traits", Traits.class);
    }

    public AnalyticsContext unmodifiableCopy() {
        return new AnalyticsContext(Collections.unmodifiableMap(new LinkedHashMap(this)));
    }
}
