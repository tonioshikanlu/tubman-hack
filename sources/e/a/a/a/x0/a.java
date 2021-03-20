package e.a.a.a.x0;

import e.a.e;
import e.x.c.i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements h {
    public final List<Type> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Class<?>> f7610b;
    public final List<Object> c;
    public final Class<?> d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f7611e;
    public final C0133a f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Method> f7612g;

    /* renamed from: e.a.a.a.x0.a$a  reason: collision with other inner class name */
    public enum C0133a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class<?> cls, List<String> list, C0133a aVar, b bVar, List<Method> list2) {
        i.e(cls, "jClass");
        i.e(list, "parameterNames");
        i.e(aVar, "callMode");
        i.e(bVar, "origin");
        i.e(list2, "methods");
        this.d = cls;
        this.f7611e = list;
        this.f = aVar;
        this.f7612g = list2;
        ArrayList arrayList = new ArrayList(b.q.a.a.C(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.a = arrayList;
        List<Method> list3 = this.f7612g;
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            List<e<? extends Object>> list4 = e.a.a.a.y0.b.d1.b.b.a;
            i.e(returnType2, "$this$wrapperByPrimitive");
            Class<?> cls2 = e.a.a.a.y0.b.d1.b.b.c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList2.add(returnType2);
        }
        this.f7610b = arrayList2;
        List<Method> list5 = this.f7612g;
        ArrayList arrayList3 = new ArrayList(b.q.a.a.C(list5, 10));
        for (Method defaultValue : list5) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.c = arrayList3;
        if (this.f == C0133a.POSITIONAL_CALL && bVar == b.JAVA) {
            List<String> list6 = this.f7611e;
            i.e(list6, "$this$minus");
            ArrayList arrayList4 = new ArrayList(b.q.a.a.C(list6, 10));
            Iterator<T> it = list6.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!z && i.a(next, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, e.a.a.a.x0.a.C0133a r9, e.a.a.a.x0.a.b r10, java.util.List r11, int r12) {
        /*
            r6 = this;
            r11 = r12 & 16
            if (r11 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = b.q.a.a.C(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r0, r1)
            r11.add(r0)
            goto L_0x0013
        L_0x002a:
            r11 = 0
        L_0x002b:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.a.<init>(java.lang.Class, java.util.List, e.a.a.a.x0.a$a, e.a.a.a.x0.a$b, java.util.List, int):void");
    }

    public List<Type> a() {
        return this.a;
    }

    public /* bridge */ /* synthetic */ Member e() {
        return null;
    }

    public Type f() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r7.isInstance(r5) != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "args"
            e.x.c.i.e(r14, r0)
            e.x.c.i.e(r14, r0)
            b.q.a.a.w(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            int r1 = r14.length
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0015:
            if (r3 >= r1) goto L_0x0133
            r5 = r14[r3]
            int r6 = r4 + 1
            if (r5 != 0) goto L_0x002a
            e.a.a.a.x0.a$a r7 = r13.f
            e.a.a.a.x0.a$a r8 = e.a.a.a.x0.a.C0133a.CALL_BY_NAME
            if (r7 != r8) goto L_0x002a
            java.util.List<java.lang.Object> r5 = r13.c
            java.lang.Object r5 = r5.get(r4)
            goto L_0x0085
        L_0x002a:
            java.util.List<java.lang.Class<?>> r7 = r13.f7610b
            java.lang.Object r7 = r7.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r8 = r5 instanceof java.lang.Class
            r9 = 0
            if (r8 == 0) goto L_0x0038
            goto L_0x0084
        L_0x0038:
            boolean r8 = r5 instanceof e.a.e
            if (r8 == 0) goto L_0x0043
            e.a.e r5 = (e.a.e) r5
            java.lang.Class r5 = b.q.a.a.L0(r5)
            goto L_0x007d
        L_0x0043:
            boolean r8 = r5 instanceof java.lang.Object[]
            if (r8 == 0) goto L_0x007d
            r8 = r5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            boolean r10 = r8 instanceof java.lang.Class[]
            if (r10 == 0) goto L_0x004f
            goto L_0x0084
        L_0x004f:
            boolean r10 = r8 instanceof e.a.e[]
            if (r10 == 0) goto L_0x007c
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            java.util.Objects.requireNonNull(r5, r8)
            e.a.e[] r5 = (e.a.e[]) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r5.length
            r8.<init>(r10)
            int r10 = r5.length
            r11 = r2
        L_0x0062:
            if (r11 >= r10) goto L_0x0070
            r12 = r5[r11]
            java.lang.Class r12 = b.q.a.a.L0(r12)
            r8.add(r12)
            int r11 = r11 + 1
            goto L_0x0062
        L_0x0070:
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r5, r8)
            goto L_0x007d
        L_0x007c:
            r5 = r8
        L_0x007d:
            boolean r7 = r7.isInstance(r5)
            if (r7 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r5 = r9
        L_0x0085:
            if (r5 == 0) goto L_0x008e
            r0.add(r5)
            int r3 = r3 + 1
            r4 = r6
            goto L_0x0015
        L_0x008e:
            java.util.List<java.lang.String> r14 = r13.f7611e
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.util.List<java.lang.Class<?>> r0 = r13.f7610b
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r1 = e.x.c.i.a(r0, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.Class<e.a.e> r0 = e.a.e.class
            goto L_0x00bd
        L_0x00a9:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00c2
            java.lang.Class r1 = r0.getComponentType()
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x00c2
            java.lang.Class<e.a.e[]> r0 = e.a.e[].class
        L_0x00bd:
            e.a.e r0 = e.x.c.v.a(r0)
            goto L_0x00c6
        L_0x00c2:
            e.a.e r0 = b.q.a.a.U0(r0)
        L_0x00c6:
            java.lang.String r1 = r0.v()
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            e.a.e r2 = e.x.c.v.a(r2)
            java.lang.String r2 = r2.v()
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x0108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.v()
            r1.append(r2)
            r2 = 60
            r1.append(r2)
            java.lang.Class r0 = b.q.a.a.L0(r0)
            java.lang.Class r0 = r0.getComponentType()
            e.a.e r0 = b.q.a.a.U0(r0)
            java.lang.String r0 = r0.v()
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x010c
        L_0x0108:
            java.lang.String r0 = r0.v()
        L_0x010c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = " is not of the required type "
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x0133:
            java.lang.Class<?> r14 = r13.d
            java.util.List<java.lang.String> r1 = r13.f7611e
            java.util.List r0 = e.t.g.f0(r1, r0)
            java.util.Map r0 = e.t.g.X(r0)
            java.util.List<java.lang.reflect.Method> r1 = r13.f7612g
            java.lang.Object r14 = b.q.a.a.R(r14, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.a.n(java.lang.Object[]):java.lang.Object");
    }
}
