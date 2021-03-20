package b.l.a.c.f.e;

import androidx.annotation.GuardedBy;
import b.l.a.c.c.l.a;
import b.l.a.c.f.e.rg;
import b.l.a.c.k.h;
import java.util.concurrent.Future;

public abstract class ug<T extends rg> {
    @GuardedBy("this")
    public pg<T> a;

    public abstract Future<pg<T>> a();

    public final <ResultT, A extends a.b> h<ResultT> b(tg<A, ResultT> tgVar) {
        return c().a.e(1, tgVar.b());
    }

    public final pg<T> c() {
        pg<T> pgVar;
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = (pg) a().get();
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(valueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            pgVar = this.a;
        }
        return pgVar;
    }
}
