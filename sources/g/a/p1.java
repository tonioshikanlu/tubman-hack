package g.a;

public final class p1 {
    public static final ThreadLocal<m0> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final p1 f9975b = null;

    public static final m0 a() {
        ThreadLocal<m0> threadLocal = a;
        m0 m0Var = threadLocal.get();
        if (m0Var != null) {
            return m0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
