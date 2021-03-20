package b.p.a;

import java.lang.reflect.Method;

public class d extends f<T> {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6379b;
    public final /* synthetic */ int c;

    public d(Method method, Class cls, int i2) {
        this.a = method;
        this.f6379b = cls;
        this.c = i2;
    }

    public T a() {
        return this.a.invoke((Object) null, new Object[]{this.f6379b, Integer.valueOf(this.c)});
    }

    public String toString() {
        return this.f6379b.getName();
    }
}
