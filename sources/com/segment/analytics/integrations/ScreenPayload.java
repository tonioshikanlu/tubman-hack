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

public class ScreenPayload extends BasePayload {
    public static final String CATEGORY_KEY = "category";
    public static final String NAME_KEY = "name";
    public static final String PROPERTIES_KEY = "properties";

    public static class Builder extends BasePayload.Builder<ScreenPayload, Builder> {
        private String category;
        private String name;
        private Map<String, Object> properties;

        public Builder() {
        }

        public Builder(ScreenPayload screenPayload) {
            super(screenPayload);
            this.name = screenPayload.name();
            this.properties = screenPayload.properties();
        }

        @NonNull
        @Deprecated
        public Builder category(@Nullable String str) {
            this.category = str;
            return this;
        }

        @NonNull
        public Builder name(@Nullable String str) {
            this.name = str;
            return this;
        }

        @NonNull
        public Builder properties(@NonNull Map<String, ?> map) {
            Utils.assertNotNull(map, "properties");
            this.properties = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        public ScreenPayload realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, boolean z) {
            if (!Utils.isNullOrEmpty((CharSequence) this.name) || !Utils.isNullOrEmpty((CharSequence) this.category)) {
                Map<String, Object> map3 = this.properties;
                if (Utils.isNullOrEmpty((Map) map3)) {
                    map3 = Collections.emptyMap();
                }
                return new ScreenPayload(str, date, map, map2, str2, str3, this.name, this.category, map3, z);
            }
            throw new NullPointerException("either name or category is required");
        }

        public Builder self() {
            return this;
        }
    }

    public ScreenPayload(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, @Nullable String str4, @Nullable String str5, @NonNull Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.screen, str, date, map, map2, str2, str3, z);
        if (!Utils.isNullOrEmpty((CharSequence) str4)) {
            put("name", (Object) str4);
        }
        if (!Utils.isNullOrEmpty((CharSequence) str5)) {
            put(CATEGORY_KEY, (Object) str5);
        }
        put("properties", (Object) map3);
    }

    @Deprecated
    @Nullable
    public String category() {
        return getString(CATEGORY_KEY);
    }

    @NonNull
    public String event() {
        String name = name();
        return !Utils.isNullOrEmpty((CharSequence) name) ? name : category();
    }

    @Nullable
    public String name() {
        return getString("name");
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
        StringBuilder y = a.y("ScreenPayload{name=\"");
        y.append(name());
        y.append(",category=\"");
        y.append(category());
        y.append("\"}");
        return y.toString();
    }
}
