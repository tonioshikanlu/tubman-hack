package kotlinx.coroutines;

import e.v.f;

public interface CoroutineExceptionHandler extends f.a {
    public static final /* synthetic */ int f = 0;

    public static final class a implements f.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(f fVar, Throwable th);
}
