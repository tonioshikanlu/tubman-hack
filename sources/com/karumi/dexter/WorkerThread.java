package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

public final class WorkerThread implements Thread {
    private final Handler handler;
    private boolean wasLooperNull = false;

    public WorkerThread() {
        if (Looper.myLooper() == null) {
            this.wasLooperNull = true;
            Looper.prepare();
        }
        this.handler = new Handler();
    }

    public void execute(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void loop() {
        if (this.wasLooperNull) {
            Looper.loop();
        }
    }
}
