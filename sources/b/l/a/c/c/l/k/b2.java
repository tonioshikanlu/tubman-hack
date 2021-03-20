package b.l.a.c.c.l.k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.b;

public final class b2 implements d1 {
    public final /* synthetic */ x1 a;

    public b2(x1 x1Var, a2 a2Var) {
        this.a = x1Var;
    }

    public final void a(@Nullable Bundle bundle) {
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            x1Var.f2736j = b.f2586l;
            x1.g(x1Var);
        } finally {
            this.a.f2738l.unlock();
        }
    }

    public final void b(@NonNull b bVar) {
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            x1Var.f2736j = bVar;
            x1.g(x1Var);
        } finally {
            this.a.f2738l.unlock();
        }
    }

    public final void c(int i2, boolean z) {
        this.a.f2738l.lock();
        try {
            x1 x1Var = this.a;
            if (x1Var.f2737k) {
                x1Var.f2737k = false;
                x1Var.f2731b.c(i2, z);
                x1Var.f2736j = null;
                x1Var.f2735i = null;
            } else {
                x1Var.f2737k = true;
                x1Var.c.g(i2);
            }
        } finally {
            this.a.f2738l.unlock();
        }
    }
}
