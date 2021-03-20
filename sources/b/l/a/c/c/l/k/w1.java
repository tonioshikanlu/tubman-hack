package b.l.a.c.c.l.k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import com.google.android.gms.common.api.GoogleApiClient;

public final class w1 implements GoogleApiClient.b, GoogleApiClient.c {
    public final a<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2717b;
    public y1 c;

    public w1(a<?> aVar, boolean z) {
        this.a = aVar;
        this.f2717b = z;
    }

    public final void a() {
        b.l.a.c.b.a.B(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void g(int i2) {
        a();
        this.c.g(i2);
    }

    public final void k(@Nullable Bundle bundle) {
        a();
        this.c.k(bundle);
    }

    public final void n(@NonNull b bVar) {
        a();
        this.c.o(bVar, this.a, this.f2717b);
    }
}
