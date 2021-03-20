package com.segment.analytics.integrations;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.ValueMap;
import com.segment.analytics.internal.NanoDate;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public abstract class BasePayload extends ValueMap {
    public static final String ANONYMOUS_ID_KEY = "anonymousId";
    public static final String CHANNEL_KEY = "channel";
    public static final String CONTEXT_KEY = "context";
    public static final String INTEGRATIONS_KEY = "integrations";
    public static final String MESSAGE_ID = "messageId";
    public static final String TIMESTAMP_KEY = "timestamp";
    public static final String TYPE_KEY = "type";
    public static final String USER_ID_KEY = "userId";

    public static abstract class Builder<P extends BasePayload, B extends Builder> {
        private String anonymousId;
        private Map<String, Object> context;
        private Map<String, Object> integrationsBuilder;
        private String messageId;
        private boolean nanosecondTimestamps = false;
        private Date timestamp;
        private String userId;

        public Builder() {
        }

        public Builder(BasePayload basePayload) {
            String string = basePayload.getString(BasePayload.TIMESTAMP_KEY);
            if (string != null && string.length() > 24) {
                this.nanosecondTimestamps = true;
            }
            this.messageId = basePayload.messageId();
            this.timestamp = basePayload.timestamp();
            this.context = basePayload.context();
            this.integrationsBuilder = new LinkedHashMap(basePayload.integrations());
            this.userId = basePayload.userId();
            this.anonymousId = basePayload.anonymousId();
        }

        @NonNull
        public B anonymousId(@NonNull String str) {
            this.anonymousId = Utils.assertNotNullOrEmpty(str, BasePayload.ANONYMOUS_ID_KEY);
            return self();
        }

        @CheckResult
        @NonNull
        public P build() {
            if (!Utils.isNullOrEmpty((CharSequence) this.userId) || !Utils.isNullOrEmpty((CharSequence) this.anonymousId)) {
                Map<String, Object> emptyMap = Utils.isNullOrEmpty((Map) this.integrationsBuilder) ? Collections.emptyMap() : Utils.immutableCopyOf(this.integrationsBuilder);
                if (Utils.isNullOrEmpty((CharSequence) this.messageId)) {
                    this.messageId = UUID.randomUUID().toString();
                }
                if (this.timestamp == null) {
                    this.timestamp = new NanoDate();
                }
                if (Utils.isNullOrEmpty((Map) this.context)) {
                    this.context = Collections.emptyMap();
                }
                return realBuild(this.messageId, this.timestamp, this.context, emptyMap, this.userId, this.anonymousId, this.nanosecondTimestamps);
            }
            throw new NullPointerException("either userId or anonymousId is required");
        }

        @NonNull
        public B context(@NonNull Map<String, ?> map) {
            Utils.assertNotNull(map, BasePayload.CONTEXT_KEY);
            this.context = Collections.unmodifiableMap(new LinkedHashMap(map));
            return self();
        }

        @NonNull
        public B integration(@NonNull String str, @NonNull Map<String, Object> map) {
            Utils.assertNotNullOrEmpty(str, "key");
            Utils.assertNotNullOrEmpty(map, "options");
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.put(str, Utils.immutableCopyOf(map));
            return self();
        }

        @NonNull
        public B integration(@NonNull String str, boolean z) {
            Utils.assertNotNullOrEmpty(str, "key");
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.put(str, Boolean.valueOf(z));
            return self();
        }

        @NonNull
        public B integrations(@Nullable Map<String, ?> map) {
            if (Utils.isNullOrEmpty((Map) map)) {
                return self();
            }
            if (this.integrationsBuilder == null) {
                this.integrationsBuilder = new LinkedHashMap();
            }
            this.integrationsBuilder.putAll(map);
            return self();
        }

        public boolean isUserIdSet() {
            return !Utils.isNullOrEmpty((CharSequence) this.userId);
        }

        @NonNull
        public B messageId(@NonNull String str) {
            Utils.assertNotNullOrEmpty(str, BasePayload.MESSAGE_ID);
            this.messageId = str;
            return self();
        }

        public B nanosecondTimestamps(boolean z) {
            this.nanosecondTimestamps = z;
            return self();
        }

        public abstract P realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, boolean z);

        public abstract B self();

        @NonNull
        public B timestamp(@NonNull Date date) {
            Utils.assertNotNull(date, BasePayload.TIMESTAMP_KEY);
            this.timestamp = date;
            return self();
        }

        @NonNull
        public B userId(@NonNull String str) {
            this.userId = Utils.assertNotNullOrEmpty(str, BasePayload.USER_ID_KEY);
            return self();
        }
    }

    public enum Channel {
        browser,
        mobile,
        server
    }

    public enum Type {
        alias,
        group,
        identify,
        screen,
        track
    }

    public BasePayload(@NonNull Type type, @NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, boolean z) {
        put(CHANNEL_KEY, (Object) Channel.mobile);
        put("type", (Object) type);
        put(MESSAGE_ID, (Object) str);
        put(TIMESTAMP_KEY, (Object) z ? Utils.toISO8601NanoFormattedString(date) : Utils.toISO8601String(date));
        put(CONTEXT_KEY, (Object) map);
        put(INTEGRATIONS_KEY, (Object) map2);
        if (!Utils.isNullOrEmpty((CharSequence) str2)) {
            put(USER_ID_KEY, (Object) str2);
        }
        put(ANONYMOUS_ID_KEY, (Object) str3);
    }

    @NonNull
    public String anonymousId() {
        return getString(ANONYMOUS_ID_KEY);
    }

    public AnalyticsContext context() {
        return (AnalyticsContext) getValueMap(CONTEXT_KEY, AnalyticsContext.class);
    }

    public ValueMap integrations() {
        return getValueMap(INTEGRATIONS_KEY);
    }

    @NonNull
    public String messageId() {
        return getString(MESSAGE_ID);
    }

    public BasePayload putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }

    @Nullable
    public Date timestamp() {
        String string = getString(TIMESTAMP_KEY);
        if (Utils.isNullOrEmpty((CharSequence) string)) {
            return null;
        }
        return Utils.parseISO8601DateWithNanos(string);
    }

    @NonNull
    public abstract Builder toBuilder();

    @NonNull
    public Type type() {
        return (Type) getEnum(Type.class, "type");
    }

    @Nullable
    public String userId() {
        return getString(USER_ID_KEY);
    }
}
