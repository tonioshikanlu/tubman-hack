package b.l.d.p;

import android.util.Log;
import b.l.d.w.b;
import java.lang.reflect.InvocationTargetException;

public final /* synthetic */ class f implements b {
    public final String a;

    public f(String str) {
        this.a = str;
    }

    public Object get() {
        String str = this.a;
        try {
            Class<?> cls = Class.forName(str);
            if (h.class.isAssignableFrom(cls)) {
                return (h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e2) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (InstantiationException e3) {
            throw new w(String.format("Could not instantiate %s.", new Object[]{str}), e3);
        } catch (NoSuchMethodException e4) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e4);
        } catch (InvocationTargetException e5) {
            throw new w(String.format("Could not instantiate %s", new Object[]{str}), e5);
        }
    }
}
