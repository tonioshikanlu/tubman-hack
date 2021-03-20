package b.l.d.q.f.g;

import android.util.Log;
import b.l.a.c.k.a;
import b.l.a.c.k.h;
import b.l.d.q.f.b;
import b.l.d.q.f.k.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final /* synthetic */ class i0 implements a {
    public final k0 a;

    public i0(k0 k0Var) {
        this.a = k0Var;
    }

    public Object a(h hVar) {
        k0 k0Var = this.a;
        Objects.requireNonNull(k0Var);
        b bVar = b.a;
        boolean z = false;
        if (hVar.n()) {
            z zVar = (z) hVar.j();
            StringBuilder y = b.e.a.a.a.y("Crashlytics report successfully enqueued to DataTransport: ");
            y.append(zVar.b());
            bVar.b(y.toString());
            g gVar = k0Var.f5095b;
            b.l.d.q.f.k.a aVar = new b.l.d.q.f.k.a(zVar.b());
            z = true;
            Iterator it = ((ArrayList) g.a(g.e(gVar.c, aVar), g.e(gVar.f5266e, aVar), g.e(gVar.d, aVar))).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        } else {
            Exception i2 = hVar.i();
            if (bVar.a(3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", i2);
            }
        }
        return Boolean.valueOf(z);
    }
}
