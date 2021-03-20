package b.l.a.d.a.b;

import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h0 {

    /* renamed from: j  reason: collision with root package name */
    public static final f f4550j = new f("ExtractorLooper");
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4551b;
    public final x1 c;
    public final i1 d;

    /* renamed from: e  reason: collision with root package name */
    public final n1 f4552e;
    public final r1 f;

    /* renamed from: g  reason: collision with root package name */
    public final c0<n2> f4553g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f4554h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f4555i = new AtomicBoolean(false);

    public h0(v0 v0Var, c0<n2> c0Var, f0 f0Var, x1 x1Var, i1 i1Var, n1 n1Var, r1 r1Var, y0 y0Var) {
        this.a = v0Var;
        this.f4553g = c0Var;
        this.f4551b = f0Var;
        this.c = x1Var;
        this.d = i1Var;
        this.f4552e = n1Var;
        this.f = r1Var;
        this.f4554h = y0Var;
    }

    public final void a(int i2, Exception exc) {
        try {
            v0 v0Var = this.a;
            v0Var.b(new o0(v0Var, i2, (byte[]) null));
            v0 v0Var2 = this.a;
            v0Var2.b(new o0(v0Var2, i2));
        } catch (g0 unused) {
            f4550j.b(6, "Error during error handling: %s", new Object[]{exc.getMessage()});
        }
    }
}
