package e.a.a.a.x0;

import e.t.g;
import e.t.o;
import e.x.c.i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k implements h<Method> {
    public final Type a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f7636b;
    public final List<Type> c;

    public static final class a extends k implements g {
        public final Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, o.f7934h, (DefaultConstructorMarker) null);
            i.e(method, "unboxMethod");
            this.d = obj;
        }

        public Object n(Object[] objArr) {
            i.e(objArr, "args");
            i.e(objArr, "args");
            b.q.a.a.w(this, objArr);
            Object obj = this.d;
            i.e(objArr, "args");
            return this.f7636b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static final class b extends k {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                e.x.c.i.e(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.lang.String r1 = "unboxMethod.declaringClass"
                e.x.c.i.d(r0, r1)
                java.util.List r0 = b.q.a.a.l2(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.k.b.<init>(java.lang.reflect.Method):void");
        }

        public Object n(Object[] objArr) {
            i.e(objArr, "args");
            i.e(objArr, "args");
            b.q.a.a.w(this, objArr);
            Object obj = objArr[0];
            Object[] i2 = objArr.length <= 1 ? new Object[0] : g.i(objArr, 1, objArr.length);
            i.e(i2, "args");
            return this.f7636b.invoke(obj, Arrays.copyOf(i2, i2.length));
        }
    }

    public k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.f7636b = method;
        this.c = list;
        Class<?> returnType = method.getReturnType();
        i.d(returnType, "unboxMethod.returnType");
        this.a = returnType;
    }

    public final List<Type> a() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ Member e() {
        return null;
    }

    public final Type f() {
        return this.a;
    }
}
