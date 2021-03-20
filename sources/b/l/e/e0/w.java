package b.l.e.e0;

import java.lang.reflect.Method;

public class w extends y {
    public final /* synthetic */ Method a;

    public w(Method method) {
        this.a = method;
    }

    public <T> T b(Class<T> cls) {
        y.a(cls);
        return this.a.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
