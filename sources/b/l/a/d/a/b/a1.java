package b.l.a.d.a.b;

import b.l.a.d.a.c.a;
import java.util.Objects;

public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final d1 f4482h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4483i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4484j;

    public a1(d1 d1Var, int i2, String str) {
        this.f4482h = d1Var;
        this.f4483i = i2;
        this.f4484j = str;
    }

    public final void run() {
        d1 d1Var = this.f4482h;
        int i2 = this.f4483i;
        String str = this.f4484j;
        Objects.requireNonNull(d1Var);
        try {
            d1Var.j(i2, str, 4);
        } catch (a e2) {
            d1.f4513g.b(5, "notifyModuleCompleted failed", new Object[]{e2});
        }
    }
}
