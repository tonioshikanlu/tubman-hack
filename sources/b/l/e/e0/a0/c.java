package b.l.e.e0.a0;

import b.l.e.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {
    public static Class d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5426b;
    public final Field c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f5426b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.c = field;
    }

    public void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f5426b == null || this.c == null)) {
            try {
                d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f5426b, new Object[]{accessibleObject, Long.valueOf(((Long) d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f5426b, new Object[]{this.c})).longValue()), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new r("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }
}
