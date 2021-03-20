package b.o;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import java.util.concurrent.ThreadFactory;

public final class n2 implements ThreadFactory {
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder y = a.y("OS_PENDING_EXECUTOR_");
        y.append(thread.getId());
        thread.setName(y.toString());
        return thread;
    }
}
