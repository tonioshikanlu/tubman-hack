package b.l.d.q.f.g;

import androidx.annotation.NonNull;
import b.l.a.c.k.h;
import b.l.a.c.k.i;
import java.util.concurrent.Callable;

public class p0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Callable f5102h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f5103i;

    public class a implements b.l.a.c.k.a<T, Void> {
        public a() {
        }

        public Object a(@NonNull h hVar) {
            if (hVar.n()) {
                i iVar = p0.this.f5103i;
                iVar.a.q(hVar.j());
                return null;
            }
            i iVar2 = p0.this.f5103i;
            iVar2.a.p(hVar.i());
            return null;
        }
    }

    public p0(Callable callable, i iVar) {
        this.f5102h = callable;
        this.f5103i = iVar;
    }

    public void run() {
        try {
            ((h) this.f5102h.call()).f(new a());
        } catch (Exception e2) {
            this.f5103i.a.p(e2);
        }
    }
}
