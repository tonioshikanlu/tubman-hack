package b.l.d.q.f.n;

public class e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5287b;
    public final StackTraceElement[] c;
    public final e d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.f5287b = th.getClass().getName();
        this.c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new e(cause, dVar) : null;
    }
}
