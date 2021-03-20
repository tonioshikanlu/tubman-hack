package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.e.f;
import java.util.Objects;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final q f4594h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f4595i;

    public p(q qVar, Bundle bundle) {
        this.f4594h = qVar;
        this.f4595i = bundle;
    }

    public final void run() {
        x0 x0Var;
        q qVar = this.f4594h;
        Bundle bundle = this.f4595i;
        v0 v0Var = qVar.f4601g;
        if (((Boolean) v0Var.b(new m0(v0Var, bundle, (byte[]) null))).booleanValue()) {
            h0 h0Var = qVar.f4602h;
            Objects.requireNonNull(h0Var);
            f fVar = h0.f4550j;
            fVar.b(3, "Run extractor loop", new Object[0]);
            if (h0Var.f4555i.compareAndSet(false, true)) {
                while (true) {
                    try {
                        x0Var = h0Var.f4554h.a();
                    } catch (g0 e2) {
                        h0.f4550j.b(6, "Error while getting next extraction task: %s", new Object[]{e2.getMessage()});
                        if (e2.f4543h >= 0) {
                            h0Var.f4553g.a().d(e2.f4543h);
                            h0Var.a(e2.f4543h, e2);
                        }
                        x0Var = null;
                    }
                    if (x0Var != null) {
                        try {
                            if (x0Var instanceof e0) {
                                h0Var.f4551b.a((e0) x0Var);
                            } else if (x0Var instanceof w1) {
                                h0Var.c.a((w1) x0Var);
                            } else if (x0Var instanceof h1) {
                                h0Var.d.a((h1) x0Var);
                            } else if (x0Var instanceof k1) {
                                h0Var.f4552e.a((k1) x0Var);
                            } else if (x0Var instanceof q1) {
                                h0Var.f.a((q1) x0Var);
                            } else {
                                h0.f4550j.b(6, "Unknown task type: %s", new Object[]{x0Var.getClass().getName()});
                            }
                        } catch (Exception e3) {
                            h0.f4550j.b(6, "Error during extraction task: %s", new Object[]{e3.getMessage()});
                            h0Var.f4553g.a().d(x0Var.a);
                            h0Var.a(x0Var.a, e3);
                        }
                    } else {
                        h0Var.f4555i.set(false);
                        return;
                    }
                }
            } else {
                fVar.b(5, "runLoop already looping; return", new Object[0]);
            }
        }
    }
}
