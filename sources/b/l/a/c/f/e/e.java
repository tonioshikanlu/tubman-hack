package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.f.e.e;
import b.l.a.c.f.e.on;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends on<MessageType, BuilderType>> extends gm<MessageType, BuilderType> {
    private static final Map<Object, e<?, ?>> zzb = new ConcurrentHashMap();
    public d1 zzc = d1.f;
    public int zzd = -1;

    public static Object d(Method method, Object obj, Object... objArr) {
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

    public static <T extends e<T, ?>> T e(T t, um umVar, fn fnVar) {
        try {
            vm I = umVar.I();
            T t2 = (e) t.h(4, (Object) null, (Object) null);
            o0<?> a = l0.c.a(t2.getClass());
            wm wmVar = I.f3363b;
            if (wmVar == null) {
                wmVar = new wm(I);
            }
            a.g(t2, wmVar, fnVar);
            a.b(t2);
            I.b(0);
            g(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof l) {
                throw ((l) e2.getCause());
            }
            throw new l(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof l) {
                throw ((l) e3.getCause());
            }
            throw e3;
        } catch (l e4) {
            throw e4;
        } catch (l e5) {
            throw e5;
        }
    }

    public static <T extends e<T, ?>> T f(T t, byte[] bArr, fn fnVar) {
        int length = bArr.length;
        T t2 = (e) t.h(4, (Object) null, (Object) null);
        try {
            o0<?> a = l0.c.a(t2.getClass());
            a.j(t2, bArr, 0, length, new jm(fnVar));
            a.b(t2);
            if (t2.zza == 0) {
                g(t2);
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof l) {
                throw ((l) e2.getCause());
            }
            throw new l(e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw l.a();
        }
    }

    public static <T extends e<T, ?>> T g(T t) {
        if (t.j()) {
            return t;
        }
        throw new l(new b1().getMessage());
    }

    public static <T extends e> T l(Class<T> cls) {
        Map<Object, e<?, ?>> map = zzb;
        T t = (e) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (e) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (e) ((e) n1.i(cls)).h(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends e> void r(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public final int b() {
        return this.zzd;
    }

    public final void c(int i2) {
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return l0.c.a(getClass()).f(this, (e) obj);
        }
        return false;
    }

    public abstract Object h(int i2, Object obj, Object obj2);

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int e2 = l0.c.a(getClass()).e(this);
        this.zza = e2;
        return e2;
    }

    public final <MessageType extends e<MessageType, BuilderType>, BuilderType extends on<MessageType, BuilderType>> BuilderType i() {
        return (on) h(5, (Object) null, (Object) null);
    }

    public final boolean j() {
        byte byteValue = ((Byte) h(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i2 = l0.c.a(getClass()).i(this);
        h(2, true != i2 ? null : this, (Object) null);
        return i2;
    }

    public final void k(bn bnVar) {
        o0<?> a = l0.c.a(getClass());
        cn cnVar = bnVar.a;
        if (cnVar == null) {
            cnVar = new cn(bnVar);
        }
        a.h(this, cnVar);
    }

    public final /* bridge */ /* synthetic */ fm m() {
        on onVar = (on) h(5, (Object) null, (Object) null);
        onVar.d(this);
        return onVar;
    }

    public final int o() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int c = l0.c.a(getClass()).c(this);
        this.zzd = c;
        return c;
    }

    public final /* bridge */ /* synthetic */ fm p() {
        return (on) h(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ e0 q() {
        return (e) h(6, (Object) null, (Object) null);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        a.V1(this, sb, 0);
        return sb.toString();
    }
}
