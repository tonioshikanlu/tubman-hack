package b.o;

import android.content.Context;
import b.o.i2;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class a4 {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6015b = false;
    public b c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Field f6016e;

    public class b implements PurchasingListener {
        public b(a4 a4Var, a aVar) {
        }
    }

    public a4(Context context) {
        this.a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            this.d = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("f");
            this.f6016e = declaredField;
            declaredField.setAccessible(true);
            b bVar = new b(this, (a) null);
            this.c = bVar;
            PurchasingListener purchasingListener = (PurchasingListener) this.f6016e.get(this.d);
            Objects.requireNonNull(bVar);
            this.f6015b = true;
            c();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            b(e2);
        }
    }

    public static void b(Exception exc) {
        i2.a(i2.k.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public void a() {
        if (this.f6015b) {
            try {
                b bVar = (PurchasingListener) this.f6016e.get(this.d);
                b bVar2 = this.c;
                if (bVar != bVar2) {
                    Objects.requireNonNull(bVar2);
                    c();
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void c() {
        PurchasingService.registerListener(this.a, this.c);
    }
}
