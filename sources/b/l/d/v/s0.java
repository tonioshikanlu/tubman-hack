package b.l.d.v;

import android.os.Bundle;
import b.l.a.c.k.i;
import java.io.IOException;
import java.util.Objects;

public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final t0 f5337h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f5338i;

    /* renamed from: j  reason: collision with root package name */
    public final i f5339j;

    public s0(t0 t0Var, Bundle bundle, i iVar) {
        this.f5337h = t0Var;
        this.f5338i = bundle;
        this.f5339j = iVar;
    }

    public final void run() {
        t0 t0Var = this.f5337h;
        Bundle bundle = this.f5338i;
        i iVar = this.f5339j;
        Objects.requireNonNull(t0Var);
        try {
            iVar.a.q(t0Var.c.b(bundle));
        } catch (IOException e2) {
            iVar.a.p(e2);
        }
    }
}
