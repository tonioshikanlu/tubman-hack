package b.l.e.e0;

import b.e.a.a.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class f implements t<T> {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f5427b;
    public final /* synthetic */ Type c;

    public f(g gVar, Class cls, Type type) {
        y yVar;
        this.f5427b = cls;
        this.c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new u(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                yVar = new v(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    yVar = new w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new x();
                }
            }
        }
        this.a = yVar;
    }

    public T a() {
        try {
            return this.a.b(this.f5427b);
        } catch (Exception e2) {
            StringBuilder y = a.y("Unable to invoke no-args constructor for ");
            y.append(this.c);
            y.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(y.toString(), e2);
        }
    }
}
