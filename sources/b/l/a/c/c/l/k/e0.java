package b.l.a.c.c.l.k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import b.l.a.c.c.b;
import b.l.a.c.j.e;
import com.google.android.gms.common.api.GoogleApiClient;

public final class e0 implements GoogleApiClient.b, GoogleApiClient.c {
    public final /* synthetic */ x a;

    public e0(x xVar, w wVar) {
        this.a = xVar;
    }

    public final void g(int i2) {
    }

    public final void k(Bundle bundle) {
        x xVar = this.a;
        if (xVar.r.f2773h) {
            xVar.f2718b.lock();
            try {
                x xVar2 = this.a;
                e eVar = xVar2.f2724k;
                if (eVar == null) {
                    xVar2.f2718b.unlock();
                } else {
                    eVar.l(new c0(this.a));
                }
            } finally {
                this.a.f2718b.unlock();
            }
        } else {
            xVar.f2724k.l(new c0(this.a));
        }
    }

    public final void n(@NonNull b bVar) {
        this.a.f2718b.lock();
        try {
            if (this.a.f2725l && !bVar.V()) {
                this.a.i();
                this.a.f();
            } else {
                this.a.p(bVar);
            }
        } finally {
            this.a.f2718b.unlock();
        }
    }
}
