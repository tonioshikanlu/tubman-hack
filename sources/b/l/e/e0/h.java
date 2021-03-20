package b.l.e.e0;

import b.e.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class h implements t<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    public T a() {
        try {
            return this.a.newInstance((Object[]) null);
        } catch (InstantiationException e2) {
            StringBuilder y = a.y("Failed to invoke ");
            y.append(this.a);
            y.append(" with no args");
            throw new RuntimeException(y.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder y2 = a.y("Failed to invoke ");
            y2.append(this.a);
            y2.append(" with no args");
            throw new RuntimeException(y2.toString(), e3.getTargetException());
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        }
    }
}
