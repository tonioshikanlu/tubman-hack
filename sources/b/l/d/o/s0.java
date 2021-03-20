package b.l.d.o;

import com.google.firebase.auth.FirebaseAuth;

public final class s0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5016h;

    public s0(FirebaseAuth firebaseAuth) {
        this.f5016h = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.a a : this.f5016h.d) {
            a.a(this.f5016h);
        }
    }
}
