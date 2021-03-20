package b.p.a;

import java.lang.reflect.Method;

public class e extends f<T> {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6380b;

    public e(Method method, Class cls) {
        this.a = method;
        this.f6380b = cls;
    }

    public T a() {
        return this.a.invoke((Object) null, new Object[]{this.f6380b, Object.class});
    }

    public String toString() {
        return this.f6380b.getName();
    }
}
