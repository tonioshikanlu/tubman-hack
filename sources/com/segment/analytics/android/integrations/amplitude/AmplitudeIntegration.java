package com.segment.analytics.android.integrations.amplitude;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplitude.api.Amplitude;
import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.Identify;
import com.amplitude.api.Revenue;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.Analytics;
import com.segment.analytics.Properties;
import com.segment.analytics.Traits;
import com.segment.analytics.ValueMap;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.Utils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class AmplitudeIntegration extends Integration<AmplitudeClient> {
    private static final String AMPLITUDE_KEY = "Amplitude";
    public static final Integration.Factory FACTORY = new Integration.Factory() {
        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            return new AmplitudeIntegration(Provider.REAL, analytics, valueMap);
        }

        public String key() {
            return AmplitudeIntegration.AMPLITUDE_KEY;
        }
    };
    private static final String VIEWED_EVENT_FORMAT = "Viewed %s Screen";
    private final AmplitudeClient amplitude;
    public String groupTypeTrait;
    public String groupValueTrait;
    private final Logger logger;
    public boolean trackAllPages;
    public boolean trackAllPagesV2;
    public boolean trackCategorizedPages;
    public boolean trackNamedPages;
    public Set<String> traitsToIncrement;
    public Set<String> traitsToSetOnce;
    public boolean useLogRevenueV2;

    public interface Provider {
        public static final Provider REAL = new Provider() {
            public AmplitudeClient get() {
                return Amplitude.getInstance();
            }
        };

        AmplitudeClient get();
    }

    public AmplitudeIntegration(Provider provider, Analytics analytics, ValueMap valueMap) {
        AmplitudeClient amplitudeClient = provider.get();
        this.amplitude = amplitudeClient;
        this.trackAllPages = valueMap.getBoolean("trackAllPages", false);
        this.trackAllPagesV2 = valueMap.getBoolean("trackAllPagesV2", true);
        this.trackCategorizedPages = valueMap.getBoolean("trackCategorizedPages", false);
        this.trackNamedPages = valueMap.getBoolean("trackNamedPages", false);
        this.useLogRevenueV2 = valueMap.getBoolean("useLogRevenueV2", false);
        this.groupTypeTrait = valueMap.getString("groupTypeTrait");
        this.groupValueTrait = valueMap.getString("groupTypeValue");
        this.traitsToIncrement = getStringSet(valueMap, "traitsToIncrement");
        this.traitsToSetOnce = getStringSet(valueMap, "traitsToSetOnce");
        Logger logger2 = analytics.logger(AMPLITUDE_KEY);
        this.logger = logger2;
        String string = valueMap.getString("apiKey");
        amplitudeClient.initialize(analytics.getApplication(), string);
        logger2.verbose("AmplitudeClient.getInstance().initialize(context, %s);", string);
        amplitudeClient.enableForegroundTracking(analytics.getApplication());
        logger2.verbose("AmplitudeClient.getInstance().enableForegroundTracking(context);", new Object[0]);
        boolean z = valueMap.getBoolean("trackSessionEvents", false);
        amplitudeClient.trackSessionEvents(z);
        logger2.verbose("AmplitudeClient.getInstance().trackSessionEvents(%s);", Boolean.valueOf(z));
        if (!valueMap.getBoolean("enableLocationListening", true)) {
            amplitudeClient.disableLocationListening();
        }
        if (valueMap.getBoolean("useAdvertisingIdForDeviceId", false)) {
            amplitudeClient.useAdvertisingIdForDeviceId();
        }
    }

    private void event(@NonNull String str, @NonNull Properties properties, @Nullable Map map, @Nullable JSONObject jSONObject) {
        JSONObject jsonObject = properties.toJsonObject();
        this.amplitude.logEvent(str, jsonObject, jSONObject, getOptOutOfSessionFromOptions(map));
        this.logger.verbose("AmplitudeClient.getInstance().logEvent(%s, %s, %s, %s);", str, jsonObject, jSONObject, Boolean.valueOf(getOptOutOfSessionFromOptions(map)));
        if (!properties.containsKey("revenue") && !properties.containsKey("total")) {
            return;
        }
        if (this.useLogRevenueV2) {
            trackWithLogRevenueV2(properties, jsonObject);
        } else {
            logRevenueV1(properties);
        }
    }

    private boolean getOptOutOfSessionFromOptions(@Nullable Map map) {
        Object obj;
        if (!Utils.isNullOrEmpty(map) && (obj = map.get("outOfSession")) != null && (obj instanceof Boolean)) {
            return ((Boolean) map.get("outOfSession")).booleanValue();
        }
        return false;
    }

    public static Set<String> getStringSet(ValueMap valueMap, String str) {
        try {
            List list = (List) valueMap.get(str);
            if (list != null) {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet(list.size());
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        hashSet.add((String) list.get(i2));
                    }
                    return hashSet;
                }
            }
            return Collections.emptySet();
        } catch (ClassCastException unused) {
            return Collections.emptySet();
        }
    }

    @Nullable
    public static JSONObject groups(BasePayload basePayload) {
        ValueMap integrations = basePayload.integrations();
        if (Utils.isNullOrEmpty((Map) integrations)) {
            return null;
        }
        ValueMap valueMap = integrations.getValueMap(AMPLITUDE_KEY);
        if (Utils.isNullOrEmpty((Map) valueMap)) {
            return null;
        }
        ValueMap valueMap2 = valueMap.getValueMap("groups");
        if (Utils.isNullOrEmpty((Map) valueMap2)) {
            return null;
        }
        return valueMap2.toJsonObject();
    }

    private void handleTraits(Traits traits) {
        Identify identify = new Identify();
        for (Map.Entry next : traits.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (this.traitsToIncrement.contains(str)) {
                incrementTrait(str, value, identify);
            } else if (this.traitsToSetOnce.contains(str)) {
                setOnce(str, value, identify);
            } else {
                setTrait(str, value, identify);
            }
        }
        this.amplitude.identify(identify);
        this.logger.verbose("Amplitude.getInstance().identify(identify)", new Object[0]);
    }

    private void incrementTrait(String str, Object obj, Identify identify) {
        if (obj instanceof Double) {
            identify.add(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            identify.add(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            identify.add(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            identify.add(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            identify.add(str, String.valueOf(obj));
        }
    }

    private void logRevenueV1(Properties properties) {
        double d = properties.getDouble("revenue", ShadowDrawableWrapper.COS_45);
        if (d == ShadowDrawableWrapper.COS_45) {
            d = properties.getDouble("total", ShadowDrawableWrapper.COS_45);
        }
        String string = properties.getString("productId");
        int i2 = properties.getInt("quantity", 0);
        String string2 = properties.getString("receipt");
        String string3 = properties.getString("receiptSignature");
        this.amplitude.logRevenue(string, i2, d, string2, string3);
        this.logger.verbose("AmplitudeClient.getInstance().logRevenue(%s, %s, %s, %s, %s);", string, Integer.valueOf(i2), Double.valueOf(d), string2, string3);
    }

    private void setOnce(String str, Object obj, Identify identify) {
        if (obj instanceof Double) {
            identify.setOnce(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            identify.setOnce(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            identify.setOnce(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            identify.setOnce(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            identify.setOnce(str, String.valueOf(obj));
        }
    }

    private void setTrait(String str, Object obj, Identify identify) {
        if (obj instanceof Double) {
            identify.set(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            identify.set(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            identify.set(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            identify.set(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            identify.set(str, String.valueOf(obj));
        }
        if (obj instanceof String[]) {
            identify.set(str, (String[]) obj);
        }
    }

    private void trackWithLogRevenueV2(Properties properties, JSONObject jSONObject) {
        double d = properties.getDouble("price", ShadowDrawableWrapper.COS_45);
        int i2 = properties.getInt("quantity", 1);
        if (!properties.containsKey("price")) {
            d = properties.getDouble("revenue", ShadowDrawableWrapper.COS_45);
            if (d == ShadowDrawableWrapper.COS_45) {
                d = properties.getDouble("total", ShadowDrawableWrapper.COS_45);
            }
            i2 = 1;
        }
        Revenue quantity = new Revenue().setPrice(d).setQuantity(i2);
        if (properties.containsKey("productId")) {
            quantity.setProductId(properties.getString("productId"));
        }
        if (properties.containsKey("revenueType")) {
            quantity.setRevenueType(properties.getString("revenueType"));
        }
        if (properties.containsKey("receipt") && properties.containsKey("receiptSignature")) {
            quantity.setReceipt(properties.getString("receipt"), properties.getString("receiptSignature"));
        }
        quantity.setEventProperties(jSONObject);
        this.amplitude.logRevenueV2(quantity);
        this.logger.verbose("AmplitudeClient.getInstance().logRevenueV2(%s, %s);", Double.valueOf(d), Integer.valueOf(i2));
    }

    public void flush() {
        super.flush();
        this.amplitude.uploadEvents();
        this.logger.verbose("AmplitudeClient.getInstance().uploadEvents();", new Object[0]);
    }

    public AmplitudeClient getUnderlyingInstance() {
        return this.amplitude;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void group(com.segment.analytics.integrations.GroupPayload r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.groupId()
            com.segment.analytics.Traits r7 = r7.traits()
            boolean r1 = com.segment.analytics.internal.Utils.isNullOrEmpty((java.util.Map) r7)
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = r6.groupTypeTrait
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r6.groupValueTrait
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = r6.groupTypeTrait
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = r6.groupValueTrait
            java.lang.String r1 = r7.getString(r1)
            goto L_0x0034
        L_0x002b:
            java.lang.String r1 = r7.name()
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0034:
            boolean r2 = com.segment.analytics.internal.Utils.isNullOrEmpty((java.lang.CharSequence) r0)
            if (r2 == 0) goto L_0x003c
            java.lang.String r0 = "[Segment] Group"
        L_0x003c:
            com.amplitude.api.AmplitudeClient r2 = r6.amplitude
            r2.setGroup(r0, r1)
            com.amplitude.api.Identify r2 = new com.amplitude.api.Identify
            r2.<init>()
            java.lang.String r3 = "library"
            java.lang.String r4 = "segment"
            r2.set((java.lang.String) r3, (java.lang.String) r4)
            boolean r3 = com.segment.analytics.internal.Utils.isNullOrEmpty((java.util.Map) r7)
            if (r3 != 0) goto L_0x005c
            org.json.JSONObject r7 = r7.toJsonObject()
            java.lang.String r3 = "group_properties"
            r2.set((java.lang.String) r3, (org.json.JSONObject) r7)
        L_0x005c:
            com.amplitude.api.AmplitudeClient r7 = r6.amplitude
            r7.groupIdentify(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.android.integrations.amplitude.AmplitudeIntegration.group(com.segment.analytics.integrations.GroupPayload):void");
    }

    public void identify(IdentifyPayload identifyPayload) {
        super.identify(identifyPayload);
        String userId = identifyPayload.userId();
        this.amplitude.setUserId(userId);
        this.logger.verbose("AmplitudeClient.getInstance().setUserId(%s);", userId);
        Traits traits = identifyPayload.traits();
        if (!Utils.isNullOrEmpty((Collection) this.traitsToIncrement) || !Utils.isNullOrEmpty((Collection) this.traitsToSetOnce)) {
            handleTraits(traits);
        } else {
            JSONObject jsonObject = traits.toJsonObject();
            this.amplitude.setUserProperties(jsonObject);
            this.logger.verbose("AmplitudeClient.getInstance().setUserProperties(%s);", jsonObject);
        }
        JSONObject groups = groups(identifyPayload);
        if (groups != null) {
            Iterator<String> keys = groups.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.amplitude.setGroup(next, groups.get(next));
                } catch (JSONException e2) {
                    this.logger.error(e2, "error reading %s from %s", next, groups);
                }
            }
        }
    }

    public void reset() {
        super.reset();
        this.amplitude.setUserId((String) null);
        this.amplitude.regenerateDeviceId();
        this.logger.verbose("AmplitudeClient.getInstance().setUserId(null)", new Object[0]);
        this.logger.verbose("AmplitudeClient.getInstance().regenerateDeviceId();", new Object[0]);
    }

    public void screen(ScreenPayload screenPayload) {
        String format;
        super.screen(screenPayload);
        if (this.trackAllPagesV2) {
            Properties properties = new Properties();
            properties.putAll(screenPayload.properties());
            properties.put("name", (Object) screenPayload.name());
            event("Loaded a Screen", properties, (Map) null, (JSONObject) null);
            return;
        }
        if (this.trackAllPages) {
            format = String.format(VIEWED_EVENT_FORMAT, new Object[]{screenPayload.event()});
        } else if (this.trackCategorizedPages && !Utils.isNullOrEmpty((CharSequence) screenPayload.category())) {
            format = String.format(VIEWED_EVENT_FORMAT, new Object[]{screenPayload.category()});
        } else if (this.trackNamedPages && !Utils.isNullOrEmpty((CharSequence) screenPayload.name())) {
            format = String.format(VIEWED_EVENT_FORMAT, new Object[]{screenPayload.name()});
        } else {
            return;
        }
        event(format, screenPayload.properties(), (Map) null, (JSONObject) null);
    }

    public void track(TrackPayload trackPayload) {
        super.track(trackPayload);
        JSONObject groups = groups(trackPayload);
        event(trackPayload.event(), trackPayload.properties(), trackPayload.integrations().getValueMap(AMPLITUDE_KEY), groups);
    }
}
