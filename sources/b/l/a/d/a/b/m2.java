package b.l.a.d.a.b;

import b.l.a.d.a.e.f0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class m2 implements f0<Executor> {
    public final /* synthetic */ int a = 0;

    public m2() {
    }

    public m2(byte[] bArr) {
    }

    public m2(char[] cArr) {
    }

    public m2(short[] sArr) {
    }

    public final Object a() {
        int i2 = this.a;
        if (i2 == 0) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(e2.f4530b);
            Objects.requireNonNull(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
            return newSingleThreadExecutor;
        } else if (i2 == 1) {
            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(e2.c);
            Objects.requireNonNull(newSingleThreadExecutor2, "Cannot return null from a non-@Nullable @Provides method");
            return newSingleThreadExecutor2;
        } else if (i2 != 2) {
            return new k0();
        } else {
            return new b0();
        }
    }
}
