package b.p.b.a0.k;

import java.io.IOException;
import java.lang.reflect.Method;

public final class m extends Exception {

    /* renamed from: i  reason: collision with root package name */
    public static final Method f6661i;

    /* renamed from: h  reason: collision with root package name */
    public IOException f6662h;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f6661i = method;
    }

    public m(IOException iOException) {
        super(iOException);
        this.f6662h = iOException;
    }
}
