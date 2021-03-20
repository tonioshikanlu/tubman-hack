package g.a;

import e.r;
import e.v.f;
import e.x.b.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

public interface y0 extends f.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f10039g = a.a;

    public static final class a implements f.b<y0> {
        public static final /* synthetic */ a a = new a();

        static {
            int i2 = CoroutineExceptionHandler.f;
        }
    }

    j0 O(boolean z, boolean z2, l<? super Throwable, r> lVar);

    CancellationException S();

    boolean b();

    k k0(m mVar);

    boolean start();
}
