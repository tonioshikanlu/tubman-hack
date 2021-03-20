package com.amplitude.api;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class TrackingOptions {
    private static String[] SERVER_SIDE_PROPERTIES = {Constants.AMP_TRACKING_OPTION_CITY, Constants.AMP_TRACKING_OPTION_COUNTRY, Constants.AMP_TRACKING_OPTION_DMA, Constants.AMP_TRACKING_OPTION_IP_ADDRESS, Constants.AMP_TRACKING_OPTION_LAT_LNG, Constants.AMP_TRACKING_OPTION_REGION};
    public static final String TAG = "com.amplitude.api.TrackingOptions";
    public Set<String> disabledFields = new HashSet();

    private void disableTrackingField(String str) {
        this.disabledFields.add(str);
    }

    private boolean shouldTrackField(String str) {
        return !this.disabledFields.contains(str);
    }

    public TrackingOptions disableAdid() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_ADID);
        return this;
    }

    public TrackingOptions disableCarrier() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_CARRIER);
        return this;
    }

    public TrackingOptions disableCity() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_CITY);
        return this;
    }

    public TrackingOptions disableCountry() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_COUNTRY);
        return this;
    }

    public TrackingOptions disableDeviceBrand() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DEVICE_BRAND);
        return this;
    }

    public TrackingOptions disableDeviceManufacturer() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DEVICE_MANUFACTURER);
        return this;
    }

    public TrackingOptions disableDeviceModel() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DEVICE_MODEL);
        return this;
    }

    public TrackingOptions disableDma() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DMA);
        return this;
    }

    public TrackingOptions disableIpAddress() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_IP_ADDRESS);
        return this;
    }

    public TrackingOptions disableLanguage() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_LANGUAGE);
        return this;
    }

    public TrackingOptions disableLatLng() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_LAT_LNG);
        return this;
    }

    public TrackingOptions disableOsName() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_OS_NAME);
        return this;
    }

    public TrackingOptions disableOsVersion() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_OS_VERSION);
        return this;
    }

    public TrackingOptions disablePlatform() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_PLATFORM);
        return this;
    }

    public TrackingOptions disableRegion() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_REGION);
        return this;
    }

    public TrackingOptions disableVersionName() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_VERSION_NAME);
        return this;
    }

    public JSONObject getApiPropertiesTrackingOptions() {
        JSONObject jSONObject = new JSONObject();
        if (this.disabledFields.isEmpty()) {
            return jSONObject;
        }
        for (String str : SERVER_SIDE_PROPERTIES) {
            if (this.disabledFields.contains(str)) {
                try {
                    jSONObject.put(str, false);
                } catch (JSONException e2) {
                    AmplitudeLog.getLogger().e(TAG, e2.toString());
                }
            }
        }
        return jSONObject;
    }

    public boolean shouldTrackAdid() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_ADID);
    }

    public boolean shouldTrackCarrier() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_CARRIER);
    }

    public boolean shouldTrackCity() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_CITY);
    }

    public boolean shouldTrackCountry() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_COUNTRY);
    }

    public boolean shouldTrackDeviceBrand() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DEVICE_BRAND);
    }

    public boolean shouldTrackDeviceManufacturer() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DEVICE_MANUFACTURER);
    }

    public boolean shouldTrackDeviceModel() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DEVICE_MODEL);
    }

    public boolean shouldTrackDma() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DMA);
    }

    public boolean shouldTrackIpAddress() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_IP_ADDRESS);
    }

    public boolean shouldTrackLanguage() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_LANGUAGE);
    }

    public boolean shouldTrackLatLng() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_LAT_LNG);
    }

    public boolean shouldTrackOsName() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_OS_NAME);
    }

    public boolean shouldTrackOsVersion() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_OS_VERSION);
    }

    public boolean shouldTrackPlatform() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_PLATFORM);
    }

    public boolean shouldTrackRegion() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_REGION);
    }

    public boolean shouldTrackVersionName() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_VERSION_NAME);
    }
}
