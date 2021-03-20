package b.p.a;

import java.lang.reflect.Constructor;

public class b extends f<T> {
    public final /* synthetic */ Constructor a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6377b;

    public b(Constructor constructor, Class cls) {
        this.a = constructor;
        this.f6377b = cls;
    }

    public T a() {
        return this.a.newInstance((Object[]) null);
    }

    public String toString() {
        return this.f6377b.getName();
    }
}
