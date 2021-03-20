package b.l.a.d.a.b;

import android.os.Handler;
import android.os.Looper;
import b.l.a.d.a.c.c;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import b.l.a.d.a.h.a;
import java.util.concurrent.Executor;

public final class c2 {

    /* renamed from: e  reason: collision with root package name */
    public static final f f4493e = new f("AssetPackManager");
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<n2> f4494b;
    public final q c;
    public final c0<Executor> d;

    public c2(t tVar, c0<n2> c0Var, q qVar, a aVar, v0 v0Var, k0 k0Var, b0 b0Var, c0<Executor> c0Var2, c cVar) {
        new Handler(Looper.getMainLooper());
        this.a = tVar;
        this.f4494b = c0Var;
        this.c = qVar;
        this.d = c0Var2;
    }

    public final void a(boolean z) {
        boolean z2;
        q qVar = this.c;
        synchronized (qVar) {
            z2 = qVar.f4681e != null;
        }
        q qVar2 = this.c;
        synchronized (qVar2) {
            qVar2.f = z;
            qVar2.b();
        }
        if (z && !z2) {
            this.d.a().execute(new z1(this));
        }
    }
}
