package com.segment.analytics.internal;

import java.util.Date;

public class NanoDate extends Date {
    private long nanos;

    public static final class NanoClock {
        private static final long EPOCH_NANOS;
        private static final long NANO_START;
        private static final long OFFSET_NANOS;

        static {
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            EPOCH_NANOS = currentTimeMillis;
            long nanoTime = System.nanoTime();
            NANO_START = nanoTime;
            OFFSET_NANOS = currentTimeMillis - nanoTime;
        }

        public static long currentTimeNanos() {
            return new NanoClock().nanos();
        }

        private long nanos() {
            return System.nanoTime() + OFFSET_NANOS;
        }
    }

    public NanoDate() {
        this(NanoClock.currentTimeNanos());
    }

    public NanoDate(long j2) {
        super(j2 / 1000000);
        this.nanos = j2;
    }

    public NanoDate(Date date) {
        this(date.getTime() * 1000000);
    }

    public boolean equals(Object obj) {
        if (obj instanceof NanoDate) {
            return ((NanoDate) obj).nanos() == nanos();
        }
        if (obj instanceof Date) {
            return super.equals(obj) && this.nanos % 1000000 == 0;
        }
        return false;
    }

    public long nanos() {
        return this.nanos;
    }
}
