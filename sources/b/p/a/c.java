package b.p.a;

import java.lang.reflect.Method;

public class c extends f<T> {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6378b;
    public final /* synthetic */ Class c;

    public c(Method method, Object obj, Class cls) {
        this.a = method;
        this.f6378b = obj;
        this.c = cls;
    }

    public T a() {
        return this.a.invoke(this.f6378b, new Object[]{this.c});
    }

    public String toString() {
        return this.c.getName();
    }
}
