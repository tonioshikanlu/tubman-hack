package b.l.d.o;

import b.l.d.o.e0.a;
import b.l.d.y.b;
import com.google.firebase.auth.FirebaseAuth;

public final class r0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f5012h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5013i;

    public r0(FirebaseAuth firebaseAuth, b bVar) {
        this.f5013i = firebaseAuth;
        this.f5012h = bVar;
    }

    public final void run() {
        for (a a : this.f5013i.c) {
            a.a(this.f5012h);
        }
        for (FirebaseAuth.b a2 : this.f5013i.f7332b) {
            a2.a(this.f5013i);
        }
    }
}
