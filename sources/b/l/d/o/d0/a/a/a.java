package b.l.d.o.d0.a.a;

import android.os.Bundle;
import android.text.TextUtils;
import b.l.a.c.c.m.g;
import b.l.a.c.c.m.h;
import b.l.a.c.c.m.o;
import b.l.a.c.f.e.ii;
import com.google.firebase.auth.api.fallback.service.FirebaseAuthFallbackService;

public final class a extends g {
    public final /* synthetic */ FirebaseAuthFallbackService a;

    public a(FirebaseAuthFallbackService firebaseAuthFallbackService) {
        this.a = firebaseAuthFallbackService;
    }

    public final void g0(o oVar, h hVar) {
        Bundle bundle = hVar.f2785n;
        if (bundle != null) {
            String string = bundle.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                oVar.k1(0, new ii(this.a, string), (Bundle) null);
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
