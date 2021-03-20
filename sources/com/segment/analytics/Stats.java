package com.segment.analytics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Stats {
    private static final String STATS_THREAD_NAME = "Segment-Stats";
    public long flushCount;
    public long flushEventCount;
    public final StatsHandler handler;
    public long integrationOperationCount;
    public long integrationOperationDuration;
    public Map<String, Long> integrationOperationDurationByIntegration = new HashMap();
    public final HandlerThread statsThread;

    public static class StatsHandler extends Handler {
        public static final int TRACK_FLUSH = 1;
        public static final int TRACK_INTEGRATION_OPERATION = 2;
        private final Stats stats;

        public StatsHandler(Looper looper, Stats stats2) {
            super(looper);
            this.stats = stats2;
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                this.stats.performFlush(message.arg1);
            } else if (i2 == 2) {
                this.stats.performIntegrationOperation((Pair) message.obj);
            } else {
                throw new AssertionError("Unknown Stats handler message: " + message);
            }
        }
    }

    public Stats() {
        HandlerThread handlerThread = new HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        this.handler = new StatsHandler(handlerThread.getLooper(), this);
    }

    public StatsSnapshot createSnapshot() {
        return new StatsSnapshot(System.currentTimeMillis(), this.flushCount, this.flushEventCount, this.integrationOperationCount, this.integrationOperationDuration, Collections.unmodifiableMap(this.integrationOperationDurationByIntegration));
    }

    public void dispatchFlush(int i2) {
        StatsHandler statsHandler = this.handler;
        statsHandler.sendMessage(statsHandler.obtainMessage(1, i2, 0));
    }

    public void dispatchIntegrationOperation(String str, long j2) {
        StatsHandler statsHandler = this.handler;
        statsHandler.sendMessage(statsHandler.obtainMessage(2, new Pair(str, Long.valueOf(j2))));
    }

    public void performFlush(int i2) {
        this.flushCount++;
        this.flushEventCount += (long) i2;
    }

    public void performIntegrationOperation(Pair<String, Long> pair) {
        this.integrationOperationCount++;
        this.integrationOperationDuration = ((Long) pair.second).longValue() + this.integrationOperationDuration;
        Long l2 = this.integrationOperationDurationByIntegration.get(pair.first);
        if (l2 == null) {
            this.integrationOperationDurationByIntegration.put(pair.first, pair.second);
            return;
        }
        this.integrationOperationDurationByIntegration.put(pair.first, Long.valueOf(((Long) pair.second).longValue() + l2.longValue()));
    }

    public void shutdown() {
        this.statsThread.quit();
    }
}
