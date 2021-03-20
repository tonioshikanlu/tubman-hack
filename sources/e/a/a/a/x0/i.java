package e.a.a.a.x0;

import e.r;
import e.x.c.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class i<M extends Member> implements h<M> {
    public final List<Type> a;

    /* renamed from: b  reason: collision with root package name */
    public final M f7628b;
    public final Type c;
    public final Class<?> d;

    public static final class a extends i<Constructor<?>> implements g {

        /* renamed from: e  reason: collision with root package name */
        public final Object f7629e;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                e.x.c.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                e.x.c.i.d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                e.x.c.i.d(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = e.t.g.i(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f7629e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            x xVar = new x(3);
            xVar.a.add(this.f7629e);
            xVar.a(objArr);
            xVar.a.add((Object) null);
            return ((Constructor) this.f7628b).newInstance(xVar.a.toArray(new Object[xVar.b()]));
        }
    }

    public static final class b extends i<Constructor<?>> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                e.x.c.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                e.x.c.i.d(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                e.x.c.i.d(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = e.t.g.i(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            x xVar = new x(2);
            xVar.a(objArr);
            xVar.a.add((Object) null);
            return ((Constructor) this.f7628b).newInstance(xVar.a.toArray(new Object[xVar.b()]));
        }
    }

    public static final class c extends i<Constructor<?>> implements g {

        /* renamed from: e  reason: collision with root package name */
        public final Object f7630e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                e.x.c.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                e.x.c.i.d(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                e.x.c.i.d(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f7630e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            x xVar = new x(2);
            xVar.a.add(this.f7630e);
            xVar.a(objArr);
            return ((Constructor) this.f7628b).newInstance(xVar.a.toArray(new Object[xVar.b()]));
        }
    }

    public static final class d extends i<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                e.x.c.i.e(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                e.x.c.i.d(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                e.x.c.i.d(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.d.<init>(java.lang.reflect.Constructor):void");
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            return ((Constructor) this.f7628b).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static abstract class e extends i<Field> {

        public static final class a extends e implements g {

            /* renamed from: e  reason: collision with root package name */
            public final Object f7631e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
                this.f7631e = obj;
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                return ((Field) this.f7628b).get(this.f7631e);
            }
        }

        public static final class b extends e implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }
        }

        public static final class c extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }
        }

        public static final class d extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }

            public void b(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                i.super.b(objArr);
                c(b.q.a.a.q0(objArr));
            }
        }

        /* renamed from: e.a.a.a.x0.i$e$e  reason: collision with other inner class name */
        public static final class C0134e extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0134e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(java.lang.reflect.Field r7, boolean r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                e.x.c.i.d(r2, r9)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.e.<init>(java.lang.reflect.Field, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            return ((Field) this.f7628b).get(this.d != null ? b.q.a.a.p0(objArr) : null);
        }
    }

    public static abstract class f extends i<Field> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7632e;

        public static final class a extends f implements g {
            public final Object f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
                this.f = obj;
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                ((Field) this.f7628b).set(this.f, b.q.a.a.p0(objArr));
                return r.a;
            }
        }

        public static final class b extends f implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                ((Field) this.f7628b).set((Object) null, b.q.a.a.f2(objArr));
                return r.a;
            }
        }

        public static final class c extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z) {
                super(field, z, true, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }

            public void b(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                super.b(objArr);
                c(b.q.a.a.q0(objArr));
            }
        }

        public static final class e extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false, (DefaultConstructorMarker) null);
                e.x.c.i.e(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(java.lang.reflect.Field r7, boolean r8, boolean r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "Void.TYPE"
                e.x.c.i.d(r2, r10)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                e.x.c.i.d(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f7632e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.f.<init>(java.lang.reflect.Field, boolean, boolean, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public void b(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            i.super.b(objArr);
            if (this.f7632e && b.q.a.a.f2(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object n(Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            b(objArr);
            ((Field) this.f7628b).set(this.d != null ? b.q.a.a.p0(objArr) : null, b.q.a.a.f2(objArr));
            return r.a;
        }
    }

    public static abstract class g extends i<Method> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7633e;

        public static final class a extends g implements g {
            public final Object f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4);
                e.x.c.i.e(method, "method");
                this.f = obj;
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                return d(this.f, objArr);
            }
        }

        public static final class b extends g implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, (Type[]) null, 4);
                e.x.c.i.e(method, "method");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                return d((Object) null, objArr);
            }
        }

        public static final class c extends g implements g {
            public final Object f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    e.x.c.i.e(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    e.x.c.i.d(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = e.t.g.i(r0, r2, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r3, r0)
                    r4.f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.g.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                x xVar = new x(2);
                xVar.a.add(this.f);
                xVar.a(objArr);
                return d((Object) null, xVar.a.toArray(new Object[xVar.b()]));
            }
        }

        public static final class d extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, (Type[]) null, 6);
                e.x.c.i.e(method, "method");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                return d(objArr[0], objArr.length <= 1 ? new Object[0] : e.t.g.i(objArr, 1, objArr.length));
            }
        }

        public static final class e extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, (Type[]) null, 4);
                e.x.c.i.e(method, "method");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                c(b.q.a.a.q0(objArr));
                return d((Object) null, objArr.length <= 1 ? new Object[0] : e.t.g.i(objArr, 1, objArr.length));
            }
        }

        public static final class f extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, (Type[]) null, 6);
                e.x.c.i.e(method, "method");
            }

            public Object n(Object[] objArr) {
                e.x.c.i.e(objArr, "args");
                b(objArr);
                return d((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(java.lang.reflect.Method r8, boolean r9, java.lang.reflect.Type[] r10) {
            /*
                r7 = this;
                java.lang.reflect.Type r6 = r8.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                e.x.c.i.d(r6, r0)
                if (r9 == 0) goto L_0x0010
                java.lang.Class r9 = r8.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r9 = 0
            L_0x0011:
                r3 = r9
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r6
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r8 = e.x.c.i.a(r6, r8)
                r7.f7633e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ g(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4) {
            /*
                r0 = this;
                r3 = r4 & 2
                if (r3 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r3 = r4 & 4
                if (r3 == 0) goto L_0x001c
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                e.x.c.i.d(r3, r4)
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.i.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int):void");
        }

        public final Object d(Object obj, Object[] objArr) {
            e.x.c.i.e(objArr, "args");
            return this.f7633e ? r.a : ((Method) this.f7628b).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        List<Type> list;
        this.f7628b = member;
        this.c = type;
        this.d = cls;
        if (cls != null) {
            x xVar = new x(2);
            xVar.a.add(cls);
            xVar.a(typeArr);
            list = e.t.g.B((Type[]) xVar.a.toArray(new Type[xVar.b()]));
        } else {
            list = b.q.a.a.g3(typeArr);
        }
        this.a = list;
    }

    public List<Type> a() {
        return this.a;
    }

    public void b(Object[] objArr) {
        e.x.c.i.e(objArr, "args");
        b.q.a.a.w(this, objArr);
    }

    public final void c(Object obj) {
        if (obj == null || !this.f7628b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final M e() {
        return this.f7628b;
    }

    public final Type f() {
        return this.c;
    }
}
