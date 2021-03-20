package b.l.a.d.a.i;

import java.util.concurrent.CountDownLatch;

public final class s implements c, b {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ s(byte[] bArr) {
    }

    public final void a(Object obj) {
        this.a.countDown();
    }

    public final void b(Exception exc) {
        this.a.countDown();
    }
}
