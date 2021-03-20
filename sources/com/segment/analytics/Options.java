package com.segment.analytics;

import com.segment.analytics.Analytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Options {
    public static final String ALL_INTEGRATIONS_KEY = "All";
    private final Map<String, Object> context;
    private final Map<String, Object> integrations;

    public Options() {
        this.integrations = new ConcurrentHashMap();
        this.context = new ConcurrentHashMap();
    }

    public Options(Map<String, Object> map, Map<String, Object> map2) {
        this.integrations = map;
        this.context = map2;
    }

    public Map<String, Object> context() {
        return new LinkedHashMap(this.context);
    }

    public Map<String, Object> integrations() {
        return new LinkedHashMap(this.integrations);
    }

    public Options putContext(String str, Object obj) {
        this.context.put(str, obj);
        return this;
    }

    public Options setIntegration(Analytics.BundledIntegration bundledIntegration, boolean z) {
        setIntegration(bundledIntegration.key, z);
        return this;
    }

    public Options setIntegration(String str, boolean z) {
        if (!SegmentIntegration.SEGMENT_KEY.equals(str)) {
            this.integrations.put(str, Boolean.valueOf(z));
            return this;
        }
        throw new IllegalArgumentException("Segment integration cannot be enabled or disabled.");
    }

    public Options setIntegrationOptions(Analytics.BundledIntegration bundledIntegration, Map<String, Object> map) {
        this.integrations.put(bundledIntegration.key, map);
        return this;
    }

    public Options setIntegrationOptions(String str, Map<String, Object> map) {
        this.integrations.put(str, map);
        return this;
    }
}
