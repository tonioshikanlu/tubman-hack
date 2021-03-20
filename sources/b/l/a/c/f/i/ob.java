package b.l.a.c.f.i;

public final class ob implements nb {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.upload.file_lock_state_check", false);
        m3Var.a("measurement.id.upload.file_lock_state_check", 0);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }
}
