package b.l.d.o.e0;

import b.l.a.c.b.a;
import b.l.a.c.k.e0;
import b.l.a.c.k.h;
import b.l.d.d;
import b.l.d.o.p;
import b.l.d.o.q;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

public final class j implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final String f4976h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k f4977i;

    public j(k kVar, String str) {
        this.f4977i = kVar;
        a.x(str);
        this.f4976h = str;
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(d.d(this.f4976h));
        p pVar = instance.f;
        if (pVar != null) {
            h<q> f = instance.f(pVar, true);
            k.f4988h.d("Token refreshing started", new Object[0]);
            i iVar = new i(this);
            e0 e0Var = (e0) f;
            Objects.requireNonNull(e0Var);
            e0Var.d(b.l.a.c.k.j.a, iVar);
        }
    }
}
