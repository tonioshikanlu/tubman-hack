package g.a;

import e.c0.h;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class n extends r0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f9965i;

    /* renamed from: j  reason: collision with root package name */
    public static final n f9966j = new n();
    public static volatile Executor pool;

    public static final class a implements ThreadFactory {
        public final /* synthetic */ AtomicInteger a;

        public a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder y = b.e.a.a.a.y("CommonPool-worker-");
            y.append(this.a.incrementAndGet());
            Thread thread = new Thread(runnable, y.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        String str;
        int i2;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer K = h.K(str);
            if (K == null || K.intValue() < 1) {
                throw new IllegalStateException(b.e.a.a.a.m("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i2 = K.intValue();
        } else {
            i2 = -1;
        }
        f9965i = i2;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        g.a.c0.f9929o.v0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m0(e.v.f r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            java.util.concurrent.Executor r1 = pool     // Catch:{ RejectedExecutionException -> 0x0019 }
            if (r1 == 0) goto L_0x0005
            goto L_0x0012
        L_0x0005:
            monitor-enter(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            java.util.concurrent.Executor r1 = pool     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.util.concurrent.ExecutorService r1 = r0.p0()     // Catch:{ all -> 0x0016 }
            pool = r1     // Catch:{ all -> 0x0016 }
        L_0x0011:
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0012:
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0019 }
            goto L_0x001e
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            throw r1     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0019:
            g.a.c0 r1 = g.a.c0.f9929o
            r1.v0(r2)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.n.m0(e.v.f, java.lang.Runnable):void");
    }

    public final ExecutorService o0() {
        return Executors.newFixedThreadPool(q0(), new a(new AtomicInteger()));
    }

    public final ExecutorService p0() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return o0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return o0();
        }
        if (f9965i < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                Objects.requireNonNull(f9966j);
                executorService.submit(o.f9973h);
                try {
                    Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    if (!(invoke2 instanceof Integer)) {
                        invoke2 = null;
                    }
                    num = (Integer) invoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (!(num != null && num.intValue() >= 1)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f9966j.q0())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : o0();
    }

    public final int q0() {
        Integer valueOf = Integer.valueOf(f9965i);
        int i2 = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i2 = availableProcessors;
        }
        return i2;
    }

    public String toString() {
        return "CommonPool";
    }
}
