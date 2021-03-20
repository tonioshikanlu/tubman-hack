package b.l.a.d.a.i;

import java.util.concurrent.Executor;

public final class p implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
