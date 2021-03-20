package b.l.a.a.f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class f implements Object<Executor> {

    public static final class a {
        public static final f a = new f();
    }

    public Object get() {
        return new g(Executors.newSingleThreadExecutor());
    }
}
