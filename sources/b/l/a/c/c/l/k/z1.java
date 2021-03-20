package b.l.a.c.c.l.k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.b;

public final class z1 implements d1 {
    public final /* synthetic */ x1 a;

    public z1(x1 x1Var, a2 a2Var) {
        this.a = x1Var;
    }

    public final void a(@Nullable Bundle bundle) {
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            Bundle bundle2 = x1Var.f2734h;
            if (bundle2 == null) {
                x1Var.f2734h = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            x1 x1Var2 = this.a;
            x1Var2.f2735i = b.f2586l;
            x1.g(x1Var2);
        } finally {
            this.a.f2738l.unlock();
        }
    }

    public final void b(@NonNull b bVar) {
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            x1Var.f2735i = bVar;
            x1.g(x1Var);
        } finally {
            this.a.f2738l.unlock();
        }
    }

    public final void c(int i2, boolean z) {
        b bVar;
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            if (!x1Var.f2737k && (bVar = x1Var.f2736j) != null) {
                if (bVar.W()) {
                    x1 x1Var2 = this.a;
                    x1Var2.f2737k = true;
                    x1Var2.d.g(i2);
                }
            }
            x1 x1Var3 = this.a;
            x1Var3.f2737k = false;
            x1Var3.f2731b.c(i2, z);
            x1Var3.f2736j = null;
            x1Var3.f2735i = null;
        } finally {
            this.a.f2738l.unlock();
        }
    }
}
