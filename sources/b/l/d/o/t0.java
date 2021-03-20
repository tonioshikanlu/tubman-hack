package b.l.d.o;

import androidx.annotation.NonNull;
import b.l.a.c.f.e.sk;
import b.l.d.o.e0.l;
import b.l.d.o.e0.y;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

public final class t0 implements y, l {
    public final /* synthetic */ FirebaseAuth a;

    public t0(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    public final void a(Status status) {
        int i2 = status.f7263i;
        if (i2 == 17011 || i2 == 17021 || i2 == 17005) {
            this.a.a();
        }
    }

    public final void b(@NonNull sk skVar, @NonNull p pVar) {
        this.a.c(pVar, skVar, true, true);
    }
}
