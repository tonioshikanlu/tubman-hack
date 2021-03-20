package com.amplitude.api;

import android.os.Handler;
import android.os.HandlerThread;

public class WorkerThread extends HandlerThread {
    private Handler handler;

    public WorkerThread(String str) {
        super(str);
    }

    private synchronized void waitForInitialization() {
        if (this.handler == null) {
            this.handler = new Handler(getLooper());
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public void post(Runnable runnable) {
        waitForInitialization();
        this.handler.post(runnable);
    }

    public void postDelayed(Runnable runnable, long j2) {
        waitForInitialization();
        this.handler.postDelayed(runnable, j2);
    }

    public void removeCallbacks(Runnable runnable) {
        waitForInitialization();
        this.handler.removeCallbacks(runnable);
    }
}
