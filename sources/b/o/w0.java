package b.o;

public class w0 extends l3 {
    public final /* synthetic */ s0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u0 f6340b;

    public w0(u0 u0Var, s0 s0Var) {
        this.f6340b = u0Var;
        this.a = s0Var;
    }

    public void a(int i2, String str, Throwable th) {
        u0.d("impression", i2, str);
        this.f6340b.f.remove(this.a.a);
    }

    public void b(String str) {
        u0.c("impression", str);
        b3.h(b3.a, "PREFS_OS_IMPRESSIONED_IAMS", this.f6340b.f);
    }
}
