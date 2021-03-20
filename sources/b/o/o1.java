package b.o;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class o1<ObserverType, StateType> {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public List<Object> f6215b = new ArrayList();
    public boolean c;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Method f6216h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Object f6217i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f6218j;

        public a(o1 o1Var, Method method, Object obj, Object obj2) {
            this.f6216h = method;
            this.f6217i = obj;
            this.f6218j = obj2;
        }

        public void run() {
            try {
                this.f6216h.invoke(this.f6217i, new Object[]{this.f6218j});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public o1(String str, boolean z) {
        this.a = str;
        this.c = z;
    }

    public boolean a(StateType statetype) {
        Iterator<Object> it = this.f6215b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.c) {
                        f2.u(new a(this, declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, new Object[]{statetype});
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                    z = true;
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return z;
    }
}
