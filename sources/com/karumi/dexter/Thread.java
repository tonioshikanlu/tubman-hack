package com.karumi.dexter;

public interface Thread {
    void execute(Runnable runnable);

    void loop();
}
