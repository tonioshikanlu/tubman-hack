package e.v.j.a;

import e.r;
import e.v.d;
import e.x.c.i;
import java.io.Serializable;

public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final d<Object> f7961h;

    public a(d<Object> dVar) {
        this.f7961h = dVar;
    }

    public d<r> a(Object obj, d<?> dVar) {
        i.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement b() {
        /*
            r10 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            e.x.c.i.e(r10, r0)
            java.lang.Class r0 = r10.getClass()
            java.lang.Class<e.v.j.a.e> r1 = e.v.j.a.e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            e.v.j.a.e r0 = (e.v.j.a.e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0125
            int r2 = r0.v()
            r3 = 1
            if (r2 > r3) goto L_0x00fd
            r2 = 0
            r4 = -1
            java.lang.Class r5 = r10.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "field"
            e.x.c.i.d(r5, r6)     // Catch:{ Exception -> 0x0044 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r6 != 0) goto L_0x0038
            r5 = r1
        L_0x0038:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            int r5 = r5 - r3
            goto L_0x0045
        L_0x0044:
            r5 = r4
        L_0x0045:
            if (r5 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r3 = r0.l()
            r4 = r3[r5]
        L_0x004e:
            e.v.j.a.f$a r3 = e.v.j.a.f.a
            java.lang.String r5 = "continuation"
            e.x.c.i.e(r10, r5)
            e.v.j.a.f$a r5 = e.v.j.a.f.f7965b
            if (r5 == 0) goto L_0x005a
            goto L_0x009c
        L_0x005a:
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0099 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.Class r6 = r10.getClass()     // Catch:{ Exception -> 0x0099 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "java.lang.Module"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "getDescriptor"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0099 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0099 }
            java.lang.Class r7 = r10.getClass()     // Catch:{ Exception -> 0x0099 }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r8 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r8 = "name"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0099 }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r9)     // Catch:{ Exception -> 0x0099 }
            e.v.j.a.f$a r8 = new e.v.j.a.f$a     // Catch:{ Exception -> 0x0099 }
            r8.<init>(r5, r6, r7)     // Catch:{ Exception -> 0x0099 }
            e.v.j.a.f.f7965b = r8     // Catch:{ Exception -> 0x0099 }
            r5 = r8
            goto L_0x009c
        L_0x0099:
            e.v.j.a.f.f7965b = r3
            r5 = r3
        L_0x009c:
            if (r5 != r3) goto L_0x009f
            goto L_0x00cf
        L_0x009f:
            java.lang.reflect.Method r3 = r5.a
            if (r3 == 0) goto L_0x00cf
            java.lang.Class r6 = r10.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r3 = r3.invoke(r6, r7)
            if (r3 == 0) goto L_0x00cf
            java.lang.reflect.Method r6 = r5.f7966b
            if (r6 == 0) goto L_0x00cf
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r3 = r6.invoke(r3, r7)
            if (r3 == 0) goto L_0x00cf
            java.lang.reflect.Method r5 = r5.c
            if (r5 == 0) goto L_0x00c6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r2 = r5.invoke(r3, r2)
            goto L_0x00c7
        L_0x00c6:
            r2 = r1
        L_0x00c7:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r1 = r2
        L_0x00cd:
            java.lang.String r1 = (java.lang.String) r1
        L_0x00cf:
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = r0.c()
            goto L_0x00ee
        L_0x00d6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 47
            r2.append(r1)
            java.lang.String r1 = r0.c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00ee:
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m()
            java.lang.String r0 = r0.f()
            r2.<init>(r1, r3, r0, r4)
            r1 = r2
            goto L_0x0125
        L_0x00fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.j.a.a.b():java.lang.StackTraceElement");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [e.v.d, e.v.d<java.lang.Object>, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            java.lang.String r1 = "frame"
            e.x.c.i.e(r0, r1)
            e.v.d<java.lang.Object> r1 = r0.f7961h
            e.x.c.i.c(r1)
            java.lang.Object r4 = r0.d(r4)     // Catch:{ all -> 0x0014 }
            e.v.i.a r2 = e.v.i.a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0014 }
            if (r4 != r2) goto L_0x0019
            return
        L_0x0014:
            r4 = move-exception
            java.lang.Object r4 = b.q.a.a.Z(r4)
        L_0x0019:
            r0.e()
            boolean r0 = r1 instanceof e.v.j.a.a
            if (r0 == 0) goto L_0x0024
            r0 = r1
            e.v.j.a.a r0 = (e.v.j.a.a) r0
            goto L_0x0001
        L_0x0024:
            r1.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.j.a.a.c(java.lang.Object):void");
    }

    public abstract Object d(Object obj);

    public void e() {
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Continuation at ");
        Object b2 = b();
        if (b2 == null) {
            b2 = getClass().getName();
        }
        y.append(b2);
        return y.toString();
    }
}
