package b.l.d.o;

import androidx.annotation.NonNull;
import b.l.a.c.f.e.sk;
import b.l.d.o.e0.y;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

public class u0 implements y {
    public final /* synthetic */ FirebaseAuth a;

    public u0(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    public final void b(@NonNull sk skVar, @NonNull p pVar) {
        Objects.requireNonNull(skVar, "null reference");
        Objects.requireNonNull(pVar, "null reference");
        pVar.g0(skVar);
        this.a.c(pVar, skVar, true, false);
    }
}
