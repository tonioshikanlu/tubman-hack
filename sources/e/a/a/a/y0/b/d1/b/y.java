package e.a.a.a.y0.b.d1.b;

import b.q.a.a;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.p;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.f.f;
import e.x.c.i;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Objects;

public abstract class y extends u implements f, a0, p {
    public g N() {
        Class<?> declaringClass = t().getDeclaringClass();
        i.d(declaringClass, "member.declaringClass");
        return new q(declaringClass);
    }

    public boolean c() {
        return Modifier.isAbstract(x());
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && i.a(t(), ((y) obj).t());
    }

    public d getName() {
        String name = t().getName();
        if (name != null) {
            return d.l(name);
        }
        d dVar = f.a;
        i.d(dVar, "SpecialNames.NO_NAME_PROVIDED");
        return dVar;
    }

    public z0 getVisibility() {
        return a.m1(this);
    }

    public int hashCode() {
        return t().hashCode();
    }

    public e.a.a.a.y0.d.a.d0.a i(b bVar) {
        i.e(bVar, "fqName");
        return a.j0(this, bVar);
    }

    public boolean isStatic() {
        return Modifier.isStatic(x());
    }

    public Collection k() {
        return a.v0(this);
    }

    public AnnotatedElement m() {
        Member t = t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) t;
    }

    public abstract Member t();

    public String toString() {
        return getClass().getName() + ": " + t();
    }

    public boolean u() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<e.a.a.a.y0.d.a.d0.y> v(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "parameterTypes"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "parameterAnnotations"
            e.x.c.i.e(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            java.lang.reflect.Member r1 = r12.t()
            java.lang.String r2 = "member"
            e.x.c.i.e(r1, r2)
            e.a.a.a.y0.b.d1.b.a$a r3 = e.a.a.a.y0.b.d1.b.a.a
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x004f
            e.x.c.i.e(r1, r2)
            java.lang.Class r2 = r1.getClass()
            java.lang.String r3 = "getParameters"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r6)     // Catch:{ NoSuchMethodException -> 0x0047 }
            java.lang.ClassLoader r2 = e.a.a.a.y0.b.d1.b.b.e(r2)
            java.lang.String r6 = "java.lang.reflect.Parameter"
            java.lang.Class r2 = r2.loadClass(r6)
            e.a.a.a.y0.b.d1.b.a$a r6 = new e.a.a.a.y0.b.d1.b.a$a
            java.lang.Class[] r7 = new java.lang.Class[r5]
            java.lang.String r8 = "getName"
            java.lang.reflect.Method r2 = r2.getMethod(r8, r7)
            r6.<init>(r3, r2)
            r3 = r6
            goto L_0x004d
        L_0x0047:
            e.a.a.a.y0.b.d1.b.a$a r2 = new e.a.a.a.y0.b.d1.b.a$a
            r2.<init>(r4, r4)
            r3 = r2
        L_0x004d:
            e.a.a.a.y0.b.d1.b.a.a = r3
        L_0x004f:
            java.lang.reflect.Method r2 = r3.a
            if (r2 == 0) goto L_0x0083
            java.lang.reflect.Method r3 = r3.f8288b
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = r2.invoke(r1, r6)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<*>"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.length
            r2.<init>(r6)
            int r6 = r1.length
            r7 = r5
        L_0x006c:
            if (r7 >= r6) goto L_0x0084
            r8 = r1[r7]
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r3.invoke(r8, r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            java.util.Objects.requireNonNull(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            r2.add(r8)
            int r7 = r7 + 1
            goto L_0x006c
        L_0x0083:
            r2 = r4
        L_0x0084:
            if (r2 == 0) goto L_0x008d
            int r1 = r2.size()
            int r3 = r13.length
            int r1 = r1 - r3
            goto L_0x008e
        L_0x008d:
            r1 = r5
        L_0x008e:
            int r3 = r13.length
            r6 = r5
        L_0x0090:
            if (r6 >= r3) goto L_0x013f
            r7 = r13[r6]
            java.lang.String r8 = "type"
            e.x.c.i.e(r7, r8)
            boolean r8 = r7 instanceof java.lang.Class
            if (r8 == 0) goto L_0x00ac
            r9 = r7
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r10 = r9.isPrimitive()
            if (r10 == 0) goto L_0x00ac
            e.a.a.a.y0.b.d1.b.c0 r7 = new e.a.a.a.y0.b.d1.b.c0
            r7.<init>(r9)
            goto L_0x00d4
        L_0x00ac:
            boolean r9 = r7 instanceof java.lang.reflect.GenericArrayType
            if (r9 != 0) goto L_0x00ce
            if (r8 == 0) goto L_0x00bc
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            boolean r8 = r8.isArray()
            if (r8 == 0) goto L_0x00bc
            goto L_0x00ce
        L_0x00bc:
            boolean r8 = r7 instanceof java.lang.reflect.WildcardType
            if (r8 == 0) goto L_0x00c8
            e.a.a.a.y0.b.d1.b.g0 r8 = new e.a.a.a.y0.b.d1.b.g0
            java.lang.reflect.WildcardType r7 = (java.lang.reflect.WildcardType) r7
            r8.<init>(r7)
            goto L_0x00d3
        L_0x00c8:
            e.a.a.a.y0.b.d1.b.s r8 = new e.a.a.a.y0.b.d1.b.s
            r8.<init>(r7)
            goto L_0x00d3
        L_0x00ce:
            e.a.a.a.y0.b.d1.b.h r8 = new e.a.a.a.y0.b.d1.b.h
            r8.<init>(r7)
        L_0x00d3:
            r7 = r8
        L_0x00d4:
            if (r2 == 0) goto L_0x0125
            int r8 = r6 + r1
            java.lang.Object r8 = e.t.g.t(r2, r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00e1
            goto L_0x0126
        L_0x00e1:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "No parameter with index "
            r13.append(r14)
            r13.append(r6)
            r14 = 43
            r13.append(r14)
            r13.append(r1)
            java.lang.String r14 = " (name="
            r13.append(r14)
            e.a.a.a.y0.f.d r14 = r12.getName()
            r13.append(r14)
            java.lang.String r14 = " type="
            r13.append(r14)
            r13.append(r7)
            java.lang.String r14 = ") in "
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = "@ReflectJavaMember"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0125:
            r8 = r4
        L_0x0126:
            if (r15 == 0) goto L_0x0130
            int r9 = b.q.a.a.V0(r13)
            if (r6 != r9) goto L_0x0130
            r9 = 1
            goto L_0x0131
        L_0x0130:
            r9 = r5
        L_0x0131:
            e.a.a.a.y0.b.d1.b.f0 r10 = new e.a.a.a.y0.b.d1.b.f0
            r11 = r14[r6]
            r10.<init>(r7, r11, r8, r9)
            r0.add(r10)
            int r6 = r6 + 1
            goto L_0x0090
        L_0x013f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.d1.b.y.v(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    public int x() {
        return t().getModifiers();
    }

    public boolean z() {
        return Modifier.isFinal(x());
    }
}
