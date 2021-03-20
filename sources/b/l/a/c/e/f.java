package b.l.a.c.e;

import dalvik.system.PathClassLoader;

public final class f extends PathClassLoader {
    public f(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
