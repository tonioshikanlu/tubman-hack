package com.karumi.dexter;

import android.os.Looper;

public final class ThreadFactory {
    public static Thread makeMainThread() {
        return new MainThread();
    }

    public static Thread makeSameThread() {
        return runningMainThread() ? new MainThread() : new WorkerThread();
    }

    private static boolean runningMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
