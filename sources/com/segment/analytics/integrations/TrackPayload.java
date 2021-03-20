package com.segment.analytics.integrations;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.segment.analytics.Properties;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class TrackPayload extends BasePayload {
    public static final String EVENT_KEY = "event";
    public static final String PROPERTIES_KEY = "properties";

    public static class Builder extends BasePayload.Builder<TrackPayload, Builder> {
        private String event;
        private Map<String, Object> properties;

        public Builder() {
        }

        public Builder(TrackPayload trackPayload) {
            super(trackPayload);
            this.event = trackPayload.event();
            this.properties = trackPayload.properties();
        }

        @NonNull
        public Builder event(@NonNull String str) {
            this.event = Utils.assertNotNullOrEmpty(str, "event");
            return this;
        }

        @NonNull
        public Builder properties(@NonNull Map<String, ?> map) {
            Utils.assertNotNull(map, "properties");
            this.properties = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        public TrackPayload realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, String str2, @NonNull String str3, boolean z) {
            Utils.assertNotNullOrEmpty(this.event, "event");
            Map<String, Object> map3 = this.properties;
            if (Utils.isNullOrEmpty((Map) map3)) {
                map3 = Collections.emptyMap();
            }
            return new TrackPayload(str, date, map, map2, str2, str3, this.event, map3, z);
        }

        public Builder self() {
            return this;
        }
    }

    public TrackPayload(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, @NonNull String str4, @NonNull Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.track, str, date, map, map2, str2, str3, z);
        put("event", (Object) str4);
        put("properties", (Object) map3);
    }

    @NonNull
    public String event() {
        return getString("event");
    }

    @NonNull
    public Properties properties() {
        return (Properties) getValueMap("properties", Properties.class);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder y = a.y("TrackPayload{event=\"");
        y.append(event());
        y.append("\"}");
        return y.toString();
    }
}
