package b.l.e.e0;

import java.lang.reflect.Method;

public class u extends y {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5459b;

    public u(Method method, Object obj) {
        this.a = method;
        this.f5459b = obj;
    }

    public <T> T b(Class<T> cls) {
        y.a(cls);
        return this.a.invoke(this.f5459b, new Object[]{cls});
    }
}
