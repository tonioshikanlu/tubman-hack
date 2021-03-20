package b.l.a.c.d;

import android.os.IBinder;
import b.e.a.a.a;
import b.l.a.c.d.b;
import java.lang.reflect.Field;

public final class d<T> extends b.a {
    public final T a;

    public d(T t) {
        this.a = t;
    }

    public static <T> T n(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException(a.Q(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
