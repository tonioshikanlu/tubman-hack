package g.a.t1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import b.q.a.a;
import e.k;
import java.util.Objects;

public final class c {
    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new a(a(Looper.getMainLooper(), true), (String) null, false);
        } catch (Throwable th) {
            obj = a.Z(th);
        }
        if (!(obj instanceof k.a)) {
            obj2 = obj;
        }
        b bVar = (b) obj2;
    }

    @VisibleForTesting
    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
