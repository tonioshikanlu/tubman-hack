package b.j.a.c.e0;

import b.j.a.c.b;
import b.j.a.c.e0.n;
import b.j.a.c.j0.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class e extends t {
    public final g0 d;

    /* renamed from: e  reason: collision with root package name */
    public d f1902e;

    public e(b bVar, g0 g0Var) {
        super(bVar);
        this.d = g0Var;
    }

    public final o f(g.a aVar, g.a aVar2) {
        n c = c(aVar.a.getDeclaredAnnotations());
        if (aVar2 != null) {
            c = b(c, aVar2.a.getDeclaredAnnotations());
        }
        return c.b();
    }

    public final o g(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        n c = c(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            c = b(c, annotatedElement2.getDeclaredAnnotations());
        }
        return c.b();
    }

    public final o[] h(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        o[] oVarArr = new o[length];
        for (int i2 = 0; i2 < length; i2++) {
            n b2 = b(n.a.c, annotationArr[i2]);
            if (annotationArr2 != null) {
                b2 = b(b2, annotationArr2[i2]);
            }
            oVarArr[i2] = b2.b();
        }
        return oVarArr;
    }

    public d i(g.a aVar, g.a aVar2) {
        Annotation[][] annotationArr;
        if (this.a == null) {
            return new d(this.d, aVar.a, new o(), t.f1947b);
        }
        g0 g0Var = this.d;
        Constructor<?> constructor = aVar.a;
        o f = f(aVar, aVar2);
        Annotation[][] parameterAnnotations = aVar.a.getParameterAnnotations();
        if (aVar2 == null) {
            annotationArr = null;
        } else {
            annotationArr = aVar2.a.getParameterAnnotations();
        }
        return new d(g0Var, constructor, f, h(parameterAnnotations, annotationArr));
    }

    public i j(Method method, Method method2) {
        int length = method.getParameterTypes().length;
        if (this.a == null) {
            return new i(this.d, method, new o(), t.a(length));
        }
        if (length == 0) {
            return new i(this.d, method, g(method, method2), t.f1947b);
        }
        return new i(this.d, method, g(method, method2), h(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: b.j.a.c.e0.o[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: b.j.a.c.e0.o[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: b.j.a.c.e0.o[]} */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.e0.d k(b.j.a.c.j0.g.a r9, b.j.a.c.j0.g.a r10) {
        /*
            r8 = this;
            int r0 = r9.a()
            b.j.a.c.b r1 = r8.a
            if (r1 != 0) goto L_0x001b
            b.j.a.c.e0.d r10 = new b.j.a.c.e0.d
            b.j.a.c.e0.g0 r1 = r8.d
            java.lang.reflect.Constructor<?> r9 = r9.a
            b.j.a.c.e0.o r2 = new b.j.a.c.e0.o
            r2.<init>()
            b.j.a.c.e0.o[] r0 = b.j.a.c.e0.t.a(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001b:
            if (r0 != 0) goto L_0x002d
            b.j.a.c.e0.d r0 = new b.j.a.c.e0.d
            b.j.a.c.e0.g0 r1 = r8.d
            java.lang.reflect.Constructor<?> r2 = r9.a
            b.j.a.c.e0.o r9 = r8.f(r9, r10)
            b.j.a.c.e0.o[] r10 = b.j.a.c.e0.t.f1947b
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x002d:
            java.lang.annotation.Annotation[][] r1 = r9.f2213b
            if (r1 != 0) goto L_0x0039
            java.lang.reflect.Constructor<?> r1 = r9.a
            java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
            r9.f2213b = r1
        L_0x0039:
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x00a5
            java.lang.reflect.Constructor<?> r2 = r9.a
            java.lang.Class r2 = r2.getDeclaringClass()
            boolean r4 = r2.isEnum()
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x005f
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x005f
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            b.j.a.c.e0.o[] r1 = r8.h(r2, r3)
        L_0x005c:
            r3 = r1
            r1 = r2
            goto L_0x007a
        L_0x005f:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x007a
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x007a
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = b.j.a.c.e0.t.c
            r2[r5] = r1
            b.j.a.c.e0.o[] r1 = r8.h(r2, r3)
            goto L_0x005c
        L_0x007a:
            if (r3 == 0) goto L_0x007d
            goto L_0x00b9
        L_0x007d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.reflect.Constructor<?> r9 = r9.a
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x00a5:
            if (r10 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            java.lang.annotation.Annotation[][] r0 = r10.f2213b
            if (r0 != 0) goto L_0x00b4
            java.lang.reflect.Constructor<?> r0 = r10.a
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            r10.f2213b = r0
        L_0x00b4:
            r3 = r0
        L_0x00b5:
            b.j.a.c.e0.o[] r3 = r8.h(r1, r3)
        L_0x00b9:
            b.j.a.c.e0.d r0 = new b.j.a.c.e0.d
            b.j.a.c.e0.g0 r1 = r8.d
            java.lang.reflect.Constructor<?> r2 = r9.a
            b.j.a.c.e0.o r9 = r8.f(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.e.k(b.j.a.c.j0.g$a, b.j.a.c.j0.g$a):b.j.a.c.e0.d");
    }
}
