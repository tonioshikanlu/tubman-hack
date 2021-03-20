package b.l.a.c.f.i;

import b.l.a.c.b.a;
import b.l.a.c.f.i.m5;
import b.l.a.c.f.i.p5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class p5<MessageType extends p5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> extends g4<MessageType, BuilderType> {
    private static final Map<Object, p5<?, ?>> zza = new ConcurrentHashMap();
    public o7 zzc = o7.f;
    public int zzd = -1;

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static u5 k(u5 u5Var) {
        g6 g6Var = (g6) u5Var;
        int i2 = g6Var.f3570j;
        return g6Var.h(i2 == 0 ? 10 : i2 + i2);
    }

    public static <E> v5<E> l(v5<E> v5Var) {
        int size = v5Var.size();
        return v5Var.h(size == 0 ? 10 : size + size);
    }

    public static <T extends p5> T p(Class<T> cls) {
        Map<Object, p5<?, ?>> map = zza;
        T t = (p5) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (p5) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (p5) ((p5) y7.i(cls)).r(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends p5> void q(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    public final int b() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int c = x6.c.a(getClass()).c(this);
        this.zzd = c;
        return c;
    }

    public final /* bridge */ /* synthetic */ f4 c() {
        return (m5) r(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ q6 d() {
        return (p5) r(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return x6.c.a(getClass()).f(this, (p5) obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ f4 f() {
        m5 m5Var = (m5) r(5, (Object) null, (Object) null);
        m5Var.h(this);
        return m5Var;
    }

    public final int g() {
        return this.zzd;
    }

    public final void h(int i2) {
        this.zzd = i2;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        if (i2 != 0) {
            return i2;
        }
        int e2 = x6.c.a(getClass()).e(this);
        this.zzb = e2;
        return e2;
    }

    public final <MessageType extends p5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> BuilderType m() {
        return (m5) r(5, (Object) null, (Object) null);
    }

    public final BuilderType n() {
        BuilderType buildertype = (m5) r(5, (Object) null, (Object) null);
        buildertype.h(this);
        return buildertype;
    }

    public final void o(y4 y4Var) {
        a7<?> a = x6.c.a(getClass());
        z4 z4Var = y4Var.a;
        if (z4Var == null) {
            z4Var = new z4(y4Var);
        }
        a.g(this, z4Var);
    }

    public abstract Object r(int i2, Object obj, Object obj2);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        a.W1(this, sb, 0);
        return sb.toString();
    }
}
