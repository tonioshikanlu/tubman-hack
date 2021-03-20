package com.segment.analytics;

import android.content.Context;
import b.e.a.a.a;
import com.segment.analytics.ValueMap;
import java.util.Collections;
import java.util.Map;

public class ProjectSettings extends ValueMap {
    private static final String EDGE_FUNCTIONS_KEY = "edgeFunction";
    private static final String INTEGRATIONS_KEY = "integrations";
    private static final String PLAN_KEY = "plan";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TRACKING_PLAN_KEY = "track";

    public static class Cache extends ValueMap.Cache<ProjectSettings> {
        private static final String PROJECT_SETTINGS_CACHE_KEY_PREFIX = "project-settings-plan-";

        public Cache(Context context, Cartographer cartographer, String str) {
            super(context, cartographer, a.m(PROJECT_SETTINGS_CACHE_KEY_PREFIX, str), str, ProjectSettings.class);
        }

        public ProjectSettings create(Map<String, Object> map) {
            return new ProjectSettings(map);
        }
    }

    public ProjectSettings(Map<String, Object> map) {
        super(Collections.unmodifiableMap(map));
    }

    public static ProjectSettings create(Map<String, Object> map) {
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        return new ProjectSettings(map);
    }

    public ValueMap edgeFunctions() {
        return getValueMap(EDGE_FUNCTIONS_KEY);
    }

    public ValueMap integrations() {
        return getValueMap("integrations");
    }

    public ValueMap plan() {
        return getValueMap(PLAN_KEY);
    }

    public long timestamp() {
        return getLong("timestamp", 0);
    }

    public ValueMap trackingPlan() {
        ValueMap plan = plan();
        if (plan == null) {
            return null;
        }
        return plan.getValueMap(TRACKING_PLAN_KEY);
    }
}
