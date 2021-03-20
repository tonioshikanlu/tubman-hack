package p.a.a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class p {
    public static final Map<Class<?>, List<o>> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a[] f10529b = new a[4];

    public static class a {
        public final List<o> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class, Object> f10530b = new HashMap();
        public final Map<String, Class> c = new HashMap();
        public final StringBuilder d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        public Class<?> f10531e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public p.a.a.r.a f10532g;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.f10530b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f10530b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.d.setLength(0);
            this.d.append(method.getName());
            StringBuilder sb = this.d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.c.put(sb2, put);
            return false;
        }

        public void c() {
            if (!this.f) {
                Class<? super Object> superclass = this.f10531e.getSuperclass();
                this.f10531e = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f10531e = null;
        }
    }

    public p(List<Object> list, boolean z, boolean z2) {
    }

    public final void a(a aVar) {
        Method[] methodArr;
        m mVar;
        try {
            methodArr = aVar.f10531e.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f10531e.getMethods();
            aVar.f = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (mVar = (m) method.getAnnotation(m.class)) != null) {
                    Class cls = parameterTypes[0];
                    if (aVar.a(method, cls)) {
                        aVar.a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                    }
                }
            }
        }
    }

    public final List<o> b(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.a);
        aVar.a.clear();
        aVar.f10530b.clear();
        aVar.c.clear();
        int i2 = 0;
        aVar.d.setLength(0);
        aVar.f10531e = null;
        aVar.f = false;
        aVar.f10532g = null;
        synchronized (f10529b) {
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                a[] aVarArr = f10529b;
                if (aVarArr[i2] == null) {
                    aVarArr[i2] = aVar;
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public final a c() {
        synchronized (f10529b) {
            for (int i2 = 0; i2 < 4; i2++) {
                a[] aVarArr = f10529b;
                a aVar = aVarArr[i2];
                if (aVar != null) {
                    aVarArr[i2] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
