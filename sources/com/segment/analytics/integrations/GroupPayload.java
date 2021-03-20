package com.segment.analytics.integrations;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.segment.analytics.Traits;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class GroupPayload extends BasePayload {
    public static final String GROUP_ID_KEY = "groupId";
    public static final String TRAITS_KEY = "traits";

    public static class Builder extends BasePayload.Builder<GroupPayload, Builder> {
        private String groupId;
        private Map<String, Object> traits;

        public Builder() {
        }

        public Builder(GroupPayload groupPayload) {
            super(groupPayload);
            this.groupId = groupPayload.groupId();
            this.traits = groupPayload.traits();
        }

        @NonNull
        public Builder groupId(@NonNull String str) {
            this.groupId = Utils.assertNotNullOrEmpty(str, GroupPayload.GROUP_ID_KEY);
            return this;
        }

        public GroupPayload realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, boolean z) {
            Utils.assertNotNullOrEmpty(this.groupId, GroupPayload.GROUP_ID_KEY);
            Map<String, Object> map3 = this.traits;
            if (Utils.isNullOrEmpty((Map) map3)) {
                map3 = Collections.emptyMap();
            }
            return new GroupPayload(str, date, map, map2, str2, str3, this.groupId, map3, z);
        }

        public Builder self() {
            return this;
        }

        @NonNull
        public Builder traits(@NonNull Map<String, ?> map) {
            Utils.assertNotNull(map, "traits");
            this.traits = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }
    }

    public GroupPayload(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, @NonNull String str4, @NonNull Map<String, Object> map3, boolean z) {
        super(BasePayload.Type.group, str, date, map, map2, str2, str3, z);
        put(GROUP_ID_KEY, (Object) str4);
        put("traits", (Object) map3);
    }

    @NonNull
    public String groupId() {
        return getString(GROUP_ID_KEY);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder y = a.y("GroupPayload{groupId=\"");
        y.append(groupId());
        y.append("\"}");
        return y.toString();
    }

    @NonNull
    public Traits traits() {
        return (Traits) getValueMap("traits", Traits.class);
    }
}
