package com.segment.analytics;

import b.e.a.a.a;
import java.util.Map;

public class StatsSnapshot {
    public final long flushCount;
    public final long flushEventCount;
    public final float integrationOperationAverageDuration;
    public final long integrationOperationCount;
    public final long integrationOperationDuration;
    public final Map<String, Long> integrationOperationDurationByIntegration;
    public final long timestamp;

    public StatsSnapshot(long j2, long j3, long j4, long j5, long j6, Map<String, Long> map) {
        this.timestamp = j2;
        this.flushCount = j3;
        this.flushEventCount = j4;
        this.integrationOperationCount = j5;
        this.integrationOperationDuration = j6;
        this.integrationOperationAverageDuration = j5 == 0 ? 0.0f : ((float) j6) / ((float) j5);
        this.integrationOperationDurationByIntegration = map;
    }

    public String toString() {
        StringBuilder y = a.y("StatsSnapshot{timestamp=");
        y.append(this.timestamp);
        y.append(", flushCount=");
        y.append(this.flushCount);
        y.append(", flushEventCount=");
        y.append(this.flushEventCount);
        y.append(", integrationOperationCount=");
        y.append(this.integrationOperationCount);
        y.append(", integrationOperationDuration=");
        y.append(this.integrationOperationDuration);
        y.append(", integrationOperationAverageDuration=");
        y.append(this.integrationOperationAverageDuration);
        y.append(", integrationOperationDurationByIntegration=");
        y.append(this.integrationOperationDurationByIntegration);
        y.append('}');
        return y.toString();
    }
}
