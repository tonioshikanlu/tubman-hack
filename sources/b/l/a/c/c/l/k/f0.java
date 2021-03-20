package b.l.a.c.c.l.k;

import android.util.Log;
import b.l.a.c.c.b;
import b.l.a.c.c.m.t;
import b.l.a.c.j.b.l;

public final class f0 extends o0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f2636b;
    public final /* synthetic */ l c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(m0 m0Var, x xVar, l lVar) {
        super(m0Var);
        this.f2636b = xVar;
        this.c = lVar;
    }

    public final void a() {
        x xVar = this.f2636b;
        l lVar = this.c;
        boolean z = false;
        if (xVar.n(0)) {
            b bVar = lVar.f4414i;
            if (bVar.W()) {
                t tVar = lVar.f4415j;
                b bVar2 = tVar.f2813j;
                if (!bVar2.W()) {
                    String valueOf = String.valueOf(bVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    xVar.p(bVar2);
                    return;
                }
                xVar.f2727n = true;
                xVar.f2728o = tVar.V();
                xVar.f2729p = tVar.f2814k;
                xVar.f2730q = tVar.f2815l;
            } else {
                if (xVar.f2725l && !bVar.V()) {
                    z = true;
                }
                if (z) {
                    xVar.i();
                } else {
                    xVar.p(bVar);
                    return;
                }
            }
            xVar.f();
        }
    }
}
