package b.l.d.q.f.g;

import b.l.d.q.f.b;
import java.util.concurrent.Callable;

public class w implements Callable<Boolean> {
    public final /* synthetic */ v a;

    public w(v vVar) {
        this.a = vVar;
    }

    public Object call() {
        q qVar = this.a.f;
        boolean z = true;
        if (!qVar.c.b().exists()) {
            String f = qVar.f();
            if (f == null || !qVar.f5109j.h(f)) {
                z = false;
            }
        } else {
            b.a.b("Found previous crash marker.");
            qVar.c.b().delete();
        }
        return Boolean.valueOf(z);
    }
}
