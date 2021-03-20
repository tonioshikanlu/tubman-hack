package com.amplitude.api;

import android.util.Log;

public class AmplitudeLog {
    public static AmplitudeLog instance = new AmplitudeLog();
    private volatile boolean enableLogging = true;
    private volatile int logLevel = 4;

    private AmplitudeLog() {
    }

    public static AmplitudeLog getLogger() {
        return instance;
    }

    public int d(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    public int d(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 3) {
            return 0;
        }
        return Log.d(str, str2, th);
    }

    public int e(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    public int e(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    public String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public int i(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    public int i(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 4) {
            return 0;
        }
        return Log.i(str, str2, th);
    }

    public boolean isLoggable(String str, int i2) {
        return Log.isLoggable(str, i2);
    }

    public int println(int i2, String str, String str2) {
        return Log.println(i2, str, str2);
    }

    public AmplitudeLog setEnableLogging(boolean z) {
        this.enableLogging = z;
        return instance;
    }

    public AmplitudeLog setLogLevel(int i2) {
        this.logLevel = i2;
        return instance;
    }

    public int v(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 2) {
            return 0;
        }
        return Log.v(str, str2);
    }

    public int v(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 2) {
            return 0;
        }
        return Log.v(str, str2, th);
    }

    public int w(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    public int w(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, str2, th);
    }

    public int w(String str, Throwable th) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, th);
    }

    public int wtf(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, str2);
    }

    public int wtf(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, str2, th);
    }

    public int wtf(String str, Throwable th) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, th);
    }
}
