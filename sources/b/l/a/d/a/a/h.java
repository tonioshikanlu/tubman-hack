package b.l.a.d.a.a;

import android.content.Context;
import b.l.a.d.a.e.f0;
import b.l.a.d.a.h.a;
import java.util.Objects;

public final class h implements f0<b> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4452b = 0;

    public h(f0<e> f0Var) {
        this.a = f0Var;
    }

    public h(f0<Context> f0Var, byte[] bArr) {
        this.a = f0Var;
    }

    public h(f0<Context> f0Var, char[] cArr) {
        this.a = f0Var;
    }

    public h(f0<Context> f0Var, short[] sArr) {
        this.a = f0Var;
    }

    public final Object a() {
        int i2 = this.f4452b;
        if (i2 == 0) {
            e eVar = (e) this.a.a();
            Objects.requireNonNull(eVar, "Cannot return null from a non-@Nullable @Provides method");
            return eVar;
        } else if (i2 != 1) {
            return i2 != 2 ? new a((Context) this.a.a()) : new r(((i) this.a).a());
        } else {
            return new d(((i) this.a).a());
        }
    }
}
