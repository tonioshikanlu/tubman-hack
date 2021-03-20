package b.l.d.v;

import b.l.d.t.a;
import b.l.d.t.b;
import com.google.firebase.iid.FirebaseInstanceId;

public final /* synthetic */ class r0 implements b {
    public final FirebaseInstanceId.a a;

    public r0(FirebaseInstanceId.a aVar) {
        this.a = aVar;
    }

    public final void a(a aVar) {
        FirebaseInstanceId.a aVar2 = this.a;
        synchronized (aVar2) {
            if (aVar2.a()) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                x xVar = FirebaseInstanceId.f7351j;
                firebaseInstanceId.k();
            }
        }
    }
}
