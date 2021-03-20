package com.segment.analytics.integrations;

import android.util.Log;
import b.e.a.a.a;
import com.segment.analytics.Analytics;

public final class Logger {
    private static final String DEFAULT_TAG = "Analytics";
    public final Analytics.LogLevel logLevel;
    private final String tag;

    public Logger(String str, Analytics.LogLevel logLevel2) {
        this.tag = str;
        this.logLevel = logLevel2;
    }

    private boolean shouldLog(Analytics.LogLevel logLevel2) {
        return this.logLevel.ordinal() >= logLevel2.ordinal();
    }

    public static Logger with(Analytics.LogLevel logLevel2) {
        return new Logger(DEFAULT_TAG, logLevel2);
    }

    public void debug(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.DEBUG)) {
            Log.d(this.tag, String.format(str, objArr));
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.INFO)) {
            Log.e(this.tag, String.format(str, objArr), th);
        }
    }

    public void info(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.INFO)) {
            Log.i(this.tag, String.format(str, objArr));
        }
    }

    public Logger subLog(String str) {
        return new Logger(a.m("Analytics-", str), this.logLevel);
    }

    public void verbose(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.VERBOSE)) {
            Log.v(this.tag, String.format(str, objArr));
        }
    }
}
