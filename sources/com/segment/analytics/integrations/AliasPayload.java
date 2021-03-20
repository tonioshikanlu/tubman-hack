package com.segment.analytics.integrations;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.internal.Utils;
import java.util.Date;
import java.util.Map;

public class AliasPayload extends BasePayload {
    public static final String PREVIOUS_ID_KEY = "previousId";

    public static final class Builder extends BasePayload.Builder<AliasPayload, Builder> {
        private String previousId;

        public Builder() {
        }

        public Builder(AliasPayload aliasPayload) {
            super(aliasPayload);
            this.previousId = aliasPayload.previousId();
        }

        @NonNull
        public Builder previousId(@NonNull String str) {
            this.previousId = Utils.assertNotNullOrEmpty(str, AliasPayload.PREVIOUS_ID_KEY);
            return this;
        }

        public AliasPayload realBuild(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, boolean z) {
            String str4 = str2;
            Utils.assertNotNullOrEmpty(str4, BasePayload.USER_ID_KEY);
            Utils.assertNotNullOrEmpty(this.previousId, AliasPayload.PREVIOUS_ID_KEY);
            return new AliasPayload(str, date, map, map2, str4, str3, this.previousId, z);
        }

        public Builder self() {
            return this;
        }
    }

    public AliasPayload(@NonNull String str, @NonNull Date date, @NonNull Map<String, Object> map, @NonNull Map<String, Object> map2, @Nullable String str2, @NonNull String str3, @NonNull String str4, boolean z) {
        super(BasePayload.Type.alias, str, date, map, map2, str2, str3, z);
        put(PREVIOUS_ID_KEY, (Object) str4);
    }

    public String previousId() {
        return getString(PREVIOUS_ID_KEY);
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder y = a.y("AliasPayload{userId=\"");
        y.append(userId());
        y.append(",previousId=\"");
        y.append(previousId());
        y.append("\"}");
        return y.toString();
    }
}
