package b.l.a.c.c;

import androidx.annotation.NonNull;

public class c0 {
    public static final c0 d = new c0(true, (String) null, (Throwable) null);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2593b;
    public final Throwable c;

    public c0(boolean z, String str, Throwable th) {
        this.a = z;
        this.f2593b = str;
        this.c = th;
    }

    public static c0 b(@NonNull String str) {
        return new c0(false, str, (Throwable) null);
    }

    public String a() {
        return this.f2593b;
    }
}
