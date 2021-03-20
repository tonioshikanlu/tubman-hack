package b.l.e.e0;

import java.lang.reflect.Method;

public class v extends y {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5460b;

    public v(Method method, int i2) {
        this.a = method;
        this.f5460b = i2;
    }

    public <T> T b(Class<T> cls) {
        y.a(cls);
        return this.a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f5460b)});
    }
}
