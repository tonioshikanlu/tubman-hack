package b.l.b.a.d;

import b.l.a.c.b.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class j {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Field, j> f4811e = new WeakHashMap();
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f4812b;
    public final Method[] c;
    public final String d;

    public j(Field field, String str) {
        this.f4812b = field;
        this.d = str == null ? null : str.intern();
        this.a = g.d(field.getType());
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            String A0 = a.A0(method.getName());
            StringBuilder y = b.e.a.a.a.y("set");
            y.append(a.A0(field.getName()));
            if (A0.equals(y.toString()) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        this.c = (Method[]) arrayList.toArray(new Method[0]);
    }

    public static j c(Enum<?> enumR) {
        try {
            j d2 = d(enumR.getClass().getField(enumR.name()));
            a.p(d2 != null, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return d2;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.b.a.d.j d(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, b.l.b.a.d.j> r1 = f4811e
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.j r2 = (b.l.b.a.d.j) r2     // Catch:{ all -> 0x0067 }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0065
            if (r3 != 0) goto L_0x001f
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x0067 }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0065
        L_0x001f:
            if (r3 == 0) goto L_0x003d
            java.lang.Class<b.l.b.a.d.y> r2 = b.l.b.a.d.y.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.y r2 = (b.l.b.a.d.y) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            goto L_0x0051
        L_0x0030:
            java.lang.Class<b.l.b.a.d.s> r2 = b.l.b.a.d.s.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.s r2 = (b.l.b.a.d.s) r2     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x003b
            goto L_0x0051
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x003d:
            java.lang.Class<b.l.b.a.d.n> r2 = b.l.b.a.d.n.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x0067 }
            b.l.b.a.d.n r2 = (b.l.b.a.d.n) r2     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0049:
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x0067 }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x0067 }
        L_0x0051:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x005d
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0067 }
        L_0x005d:
            b.l.b.a.d.j r2 = new b.l.b.a.d.j     // Catch:{ all -> 0x0067 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0067 }
            r1.put(r5, r2)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            return r2
        L_0x0067:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.d.j.d(java.lang.reflect.Field):b.l.b.a.d.j");
    }

    public static void e(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            try {
                Object obj3 = field.get(obj);
                if (obj2 == null) {
                    if (obj3 == null) {
                        return;
                    }
                } else if (obj2.equals(obj3)) {
                    return;
                }
                throw new IllegalArgumentException("expected final value <" + obj3 + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            try {
                field.set(obj, obj2);
            } catch (SecurityException e3) {
                throw new IllegalArgumentException(e3);
            } catch (IllegalAccessException e4) {
                throw new IllegalArgumentException(e4);
            }
        }
    }

    public Type a() {
        return this.f4812b.getGenericType();
    }

    public Object b(Object obj) {
        try {
            return this.f4812b.get(obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public void f(Object obj, Object obj2) {
        Method[] methodArr = this.c;
        if (methodArr.length > 0) {
            int length = methodArr.length;
            int i2 = 0;
            while (i2 < length) {
                Method method = methodArr[i2];
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        method.invoke(obj, new Object[]{obj2});
                        return;
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        continue;
                    }
                } else {
                    i2++;
                }
            }
        }
        e(this.f4812b, obj, obj2);
    }
}
