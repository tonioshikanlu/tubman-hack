package b.l.e.e0;

import b.e.a.a.a;
import java.lang.reflect.Modifier;

public abstract class y {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(a.d(cls, a.y("Interface can't be instantiated! Interface name: ")));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(a.d(cls, a.y("Abstract class can't be instantiated! Class name: ")));
        }
    }

    public abstract <T> T b(Class<T> cls);
}
