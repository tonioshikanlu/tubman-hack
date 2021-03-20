package e.a.a.a;

import e.a.a.a.y0.e.a0.b.e;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class e {

    public static final class a extends e {
        public final List<Method> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f7517b;

        /* renamed from: e.a.a.a.e$a$a  reason: collision with other inner class name */
        public static final class C0129a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Method method = (Method) t;
                i.d(method, "it");
                String name = method.getName();
                Method method2 = (Method) t2;
                i.d(method2, "it");
                return b.q.a.a.D(name, method2.getName());
            }
        }

        public static final class b extends k implements l<Method, CharSequence> {

            /* renamed from: h  reason: collision with root package name */
            public static final b f7518h = new b();

            public b() {
                super(1);
            }

            public Object invoke(Object obj) {
                Method method = (Method) obj;
                i.d(method, "it");
                return e.a.a.a.y0.b.d1.b.b.c(method.getReturnType());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) {
            super((DefaultConstructorMarker) null);
            i.e(cls, "jClass");
            this.f7517b = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            i.d(declaredMethods, "jClass.declaredMethods");
            this.a = b.q.a.a.X2(declaredMethods, new C0129a());
        }

        public String a() {
            return g.x(this.a, "", "<init>(", ")V", 0, (CharSequence) null, b.f7518h, 24);
        }
    }

    public static final class b extends e {
        public final Constructor<?> a;

        public static final class a extends k implements l<Class<?>, CharSequence> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f7519h = new a();

            public a() {
                super(1);
            }

            public Object invoke(Object obj) {
                return e.a.a.a.y0.b.d1.b.b.c((Class) obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super((DefaultConstructorMarker) null);
            i.e(constructor, "constructor");
            this.a = constructor;
        }

        public String a() {
            Class[] parameterTypes = this.a.getParameterTypes();
            i.d(parameterTypes, "constructor.parameterTypes");
            return b.q.a.a.e2(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, a.f7519h, 24);
        }
    }

    public static final class c extends e {
        public final Method a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super((DefaultConstructorMarker) null);
            i.e(method, "method");
            this.a = method;
        }

        public String a() {
            return b.q.a.a.i(this.a);
        }
    }

    public static final class d extends e {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final e.b f7520b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e.b bVar) {
            super((DefaultConstructorMarker) null);
            i.e(bVar, "signature");
            this.f7520b = bVar;
            this.a = bVar.a();
        }

        public String a() {
            return this.a;
        }
    }

    /* renamed from: e.a.a.a.e$e  reason: collision with other inner class name */
    public static final class C0130e extends e {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final e.b f7521b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0130e(e.b bVar) {
            super((DefaultConstructorMarker) null);
            i.e(bVar, "signature");
            this.f7521b = bVar;
            this.a = bVar.a();
        }

        public String a() {
            return this.a;
        }
    }

    public e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String a();
}
