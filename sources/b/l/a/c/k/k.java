package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;

public final class k implements l {
    public final CountDownLatch a = new CountDownLatch(1);

    public k(f0 f0Var) {
    }

    public final void a(Object obj) {
        this.a.countDown();
    }

    public final void b(@NonNull Exception exc) {
        this.a.countDown();
    }

    public final void d() {
        this.a.countDown();
    }
}
