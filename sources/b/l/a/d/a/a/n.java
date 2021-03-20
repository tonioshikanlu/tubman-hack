package b.l.a.d.a.a;

import android.os.Bundle;
import b.l.a.d.a.d.a;
import b.l.a.d.a.e.f;

public final class n extends m<Void> {
    public n(p pVar, b.l.a.d.a.i.n<Void> nVar) {
        super(pVar, new f("OnCompleteUpdateCallback"), nVar);
    }

    public final void z0(Bundle bundle) {
        this.c.a.b();
        this.a.b(4, "onCompleteUpdate", new Object[0]);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f4459b.a(new a(bundle.getInt("error.code", -2)));
        } else {
            this.f4459b.b(null);
        }
    }
}
