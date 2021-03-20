package com.amplitude.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class DeviceInfo {
    public static final String OS_NAME = "android";
    private static final String SETTING_ADVERTISING_ID = "advertising_id";
    private static final String SETTING_LIMIT_AD_TRACKING = "limit_ad_tracking";
    public static final String TAG = "com.amplitude.api.DeviceInfo";
    private CachedInfo cachedInfo;
    /* access modifiers changed from: private */
    public Context context;
    private boolean locationListening = true;

    public class CachedInfo {
        /* access modifiers changed from: private */
        public String advertisingId;
        /* access modifiers changed from: private */
        public String brand;
        /* access modifiers changed from: private */
        public String carrier;
        /* access modifiers changed from: private */
        public String country;
        /* access modifiers changed from: private */
        public boolean gpsEnabled;
        /* access modifiers changed from: private */
        public String language;
        /* access modifiers changed from: private */
        public boolean limitAdTrackingEnabled;
        /* access modifiers changed from: private */
        public String manufacturer;
        /* access modifiers changed from: private */
        public String model;
        /* access modifiers changed from: private */
        public String osName;
        /* access modifiers changed from: private */
        public String osVersion;
        /* access modifiers changed from: private */
        public String versionName;

        private CachedInfo() {
            this.advertisingId = getAdvertisingId();
            this.versionName = getVersionName();
            this.osName = getOsName();
            this.osVersion = getOsVersion();
            this.brand = getBrand();
            this.manufacturer = getManufacturer();
            this.model = getModel();
            this.carrier = getCarrier();
            this.country = getCountry();
            this.language = getLanguage();
            this.gpsEnabled = checkGPSEnabled();
        }

        private boolean checkGPSEnabled() {
            try {
                Integer num = (Integer) Class.forName("b.l.a.c.c.h").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke((Object) null, new Object[]{DeviceInfo.this.context});
                return num != null && num.intValue() == 0;
            } catch (ClassNotFoundException | NoClassDefFoundError e2) {
                AmplitudeLog.getLogger().w(DeviceInfo.TAG, "Google Play Services Util not found!");
                Diagnostics.getLogger().logError("Failed to check GPS enabled", e2);
                return false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                e = e3;
                AmplitudeLog.getLogger().w(DeviceInfo.TAG, "Google Play Services not available");
                Diagnostics.getLogger().logError("Failed to check GPS enabled", e);
                return false;
            } catch (Exception e4) {
                e = e4;
                AmplitudeLog logger = AmplitudeLog.getLogger();
                logger.w(DeviceInfo.TAG, "Error when checking for Google Play Services: " + e);
                Diagnostics.getLogger().logError("Failed to check GPS enabled", e);
                return false;
            }
        }

        private String getAdvertisingId() {
            return "Amazon".equals(getManufacturer()) ? getAndCacheAmazonAdvertisingId() : getAndCacheGoogleAdvertisingId();
        }

        private String getAndCacheAmazonAdvertisingId() {
            ContentResolver contentResolver = DeviceInfo.this.context.getContentResolver();
            boolean z = false;
            if (Settings.Secure.getInt(contentResolver, DeviceInfo.SETTING_LIMIT_AD_TRACKING, 0) == 1) {
                z = true;
            }
            this.limitAdTrackingEnabled = z;
            String string = Settings.Secure.getString(contentResolver, DeviceInfo.SETTING_ADVERTISING_ID);
            this.advertisingId = string;
            return string;
        }

        private String getAndCacheGoogleAdvertisingId() {
            String str;
            AmplitudeLog amplitudeLog;
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{DeviceInfo.this.context});
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.limitAdTrackingEnabled = z;
                this.advertisingId = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException e2) {
                e = e2;
                amplitudeLog = AmplitudeLog.getLogger();
                str = "Google Play Services SDK not found!";
                amplitudeLog.w(DeviceInfo.TAG, str);
                Diagnostics.getLogger().logError("Failed to get ADID", e);
                return this.advertisingId;
            } catch (InvocationTargetException e3) {
                e = e3;
                amplitudeLog = AmplitudeLog.getLogger();
                str = "Google Play Services not available";
                amplitudeLog.w(DeviceInfo.TAG, str);
                Diagnostics.getLogger().logError("Failed to get ADID", e);
                return this.advertisingId;
            } catch (Exception e4) {
                e = e4;
                AmplitudeLog.getLogger().e(DeviceInfo.TAG, "Encountered an error connecting to Google Play Services", e);
                Diagnostics.getLogger().logError("Failed to get ADID", e);
                return this.advertisingId;
            }
            return this.advertisingId;
        }

        private String getBrand() {
            return Build.BRAND;
        }

        private String getCarrier() {
            try {
                return ((TelephonyManager) DeviceInfo.this.context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception e2) {
                Diagnostics.getLogger().logError("Failed to get carrier", e2);
                return null;
            }
        }

        private String getCountry() {
            String countryFromLocation = getCountryFromLocation();
            if (!Utils.isEmptyString(countryFromLocation)) {
                return countryFromLocation;
            }
            String countryFromNetwork = getCountryFromNetwork();
            return !Utils.isEmptyString(countryFromNetwork) ? countryFromNetwork : getCountryFromLocale();
        }

        private String getCountryFromLocale() {
            return Locale.getDefault().getCountry();
        }

        private String getCountryFromLocation() {
            Location mostRecentLocation;
            List<Address> fromLocation;
            if (DeviceInfo.this.isLocationListening() && (mostRecentLocation = DeviceInfo.this.getMostRecentLocation()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = DeviceInfo.this.getGeocoder().getFromLocation(mostRecentLocation.getLatitude(), mostRecentLocation.getLongitude(), 1)) != null) {
                        for (Address next : fromLocation) {
                            if (next != null) {
                                return next.getCountryCode();
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException e2) {
                    Diagnostics.getLogger().logError("Failed to get country from location", e2);
                }
            }
            return null;
        }

        private String getCountryFromNetwork() {
            String networkCountryIso;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) DeviceInfo.this.context.getSystemService("phone");
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                return networkCountryIso.toUpperCase(Locale.US);
            } catch (Exception e2) {
                Diagnostics.getLogger().logError("Failed to get country from network", e2);
                return null;
            }
        }

        private String getLanguage() {
            return Locale.getDefault().getLanguage();
        }

        private String getManufacturer() {
            return Build.MANUFACTURER;
        }

        private String getModel() {
            return Build.MODEL;
        }

        private String getOsName() {
            return DeviceInfo.OS_NAME;
        }

        private String getOsVersion() {
            return Build.VERSION.RELEASE;
        }

        private String getVersionName() {
            try {
                return DeviceInfo.this.context.getPackageManager().getPackageInfo(DeviceInfo.this.context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                Diagnostics.getLogger().logError("Failed to get version name", e2);
                return null;
            }
        }
    }

    public DeviceInfo(Context context2) {
        this.context = context2;
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    private CachedInfo getCachedInfo() {
        if (this.cachedInfo == null) {
            this.cachedInfo = new CachedInfo();
        }
        return this.cachedInfo;
    }

    public String getAdvertisingId() {
        return getCachedInfo().advertisingId;
    }

    public String getBrand() {
        return getCachedInfo().brand;
    }

    public String getCarrier() {
        return getCachedInfo().carrier;
    }

    public String getCountry() {
        return getCachedInfo().country;
    }

    public Geocoder getGeocoder() {
        return new Geocoder(this.context, Locale.ENGLISH);
    }

    public String getLanguage() {
        return getCachedInfo().language;
    }

    public String getManufacturer() {
        return getCachedInfo().manufacturer;
    }

    public String getModel() {
        return getCachedInfo().model;
    }

    public Location getMostRecentLocation() {
        LocationManager locationManager;
        List<String> list;
        Location location;
        Location location2 = null;
        if (!isLocationListening() || (locationManager = (LocationManager) this.context.getSystemService("location")) == null) {
            return null;
        }
        try {
            list = locationManager.getProviders(true);
        } catch (SecurityException e2) {
            Diagnostics.getLogger().logError("Failed to get most recent location", e2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String lastKnownLocation : list) {
            try {
                location = locationManager.getLastKnownLocation(lastKnownLocation);
            } catch (IllegalArgumentException | SecurityException e3) {
                Diagnostics.getLogger().logError("Failed to get most recent location", e3);
                location = null;
            }
            if (location != null) {
                arrayList.add(location);
            }
        }
        long j2 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Location location3 = (Location) it.next();
            if (location3.getTime() > j2) {
                j2 = location3.getTime();
                location2 = location3;
            }
        }
        return location2;
    }

    public String getOsName() {
        return getCachedInfo().osName;
    }

    public String getOsVersion() {
        return getCachedInfo().osVersion;
    }

    public String getVersionName() {
        return getCachedInfo().versionName;
    }

    public boolean isGooglePlayServicesEnabled() {
        return getCachedInfo().gpsEnabled;
    }

    public boolean isLimitAdTrackingEnabled() {
        return getCachedInfo().limitAdTrackingEnabled;
    }

    public boolean isLocationListening() {
        return this.locationListening;
    }

    public void prefetch() {
        getCachedInfo();
    }

    public void setLocationListening(boolean z) {
        this.locationListening = z;
    }
}
