package b.l.d.n.a.c;

import android.content.Context;
import android.os.Bundle;
import b.l.a.c.f.i.f0;
import b.l.d.d;
import b.l.d.n.a.b;
import b.l.d.p.e;
import b.l.d.p.g;
import java.util.Objects;

public final /* synthetic */ class a implements g {
    public static final g a = new a();

    public final Object a(e eVar) {
        d dVar = (d) eVar.a(d.class);
        Context context = (Context) eVar.a(Context.class);
        b.l.d.t.d dVar2 = (b.l.d.t.d) eVar.a(b.l.d.t.d.class);
        Objects.requireNonNull(dVar, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(dVar2, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (b.c == null) {
            synchronized (b.class) {
                if (b.c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.i()) {
                        dVar2.b(b.l.d.a.class, b.l.d.n.a.d.f4926h, b.l.d.n.a.e.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.h());
                    }
                    b.c = new b(f0.d(context, (String) null, (String) null, (String) null, bundle).d);
                }
            }
        }
        return b.c;
    }
}
