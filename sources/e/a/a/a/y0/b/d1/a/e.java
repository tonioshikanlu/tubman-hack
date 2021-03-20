package e.a.a.a.y0.b.d1.a;

import e.a.a.a.y0.b.d1.b.b;
import e.a.a.a.y0.d.b.a;
import e.a.a.a.y0.d.b.b;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.d.b.w.a;
import e.a.a.a.y0.f.d;
import e.c0.h;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e implements l {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8283b;

    public e(Class cls, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = cls;
        this.f8283b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r1.f == null) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.b.d1.a.e e(java.lang.Class<?> r15) {
        /*
            java.lang.String r0 = "klass"
            e.x.c.i.e(r15, r0)
            e.a.a.a.y0.d.b.w.b r1 = new e.a.a.a.y0.d.b.w.b
            r1.<init>()
            e.x.c.i.e(r15, r0)
            java.lang.String r0 = "visitor"
            e.x.c.i.e(r1, r0)
            java.lang.annotation.Annotation[] r0 = r15.getDeclaredAnnotations()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x0019:
            if (r4 >= r2) goto L_0x003f
            r5 = r0[r4]
            java.lang.String r6 = "annotation"
            e.x.c.i.d(r5, r6)
            e.a.e r6 = b.q.a.a.t0(r5)
            java.lang.Class r6 = b.q.a.a.L0(r6)
            e.a.a.a.y0.f.a r7 = e.a.a.a.y0.b.d1.b.b.b(r6)
            e.a.a.a.y0.b.d1.a.b r8 = new e.a.a.a.y0.b.d1.a.b
            r8.<init>(r5)
            e.a.a.a.y0.d.b.l$a r7 = r1.a(r7, r8)
            if (r7 == 0) goto L_0x003c
            e.a.a.a.y0.b.d1.a.c.c(r7, r5, r6)
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0019
        L_0x003f:
            e.a.a.a.y0.b.d1.a.e r0 = new e.a.a.a.y0.b.d1.a.e
            e.a.a.a.y0.d.b.w.a$a r2 = r1.f8677i
            r4 = 0
            if (r2 == 0) goto L_0x009c
            int[] r2 = r1.a
            if (r2 != 0) goto L_0x004b
            goto L_0x009c
        L_0x004b:
            e.a.a.a.y0.e.a0.b.f r7 = new e.a.a.a.y0.e.a0.b.f
            int[] r2 = r1.a
            int r5 = r1.d
            r5 = r5 & 8
            r6 = 1
            if (r5 == 0) goto L_0x0058
            r5 = r6
            goto L_0x0059
        L_0x0058:
            r5 = r3
        L_0x0059:
            r7.<init>(r2, r5)
            boolean r2 = r7.b()
            if (r2 != 0) goto L_0x0069
            java.lang.String[] r2 = r1.f
            r1.f8676h = r2
            r1.f = r4
            goto L_0x007f
        L_0x0069:
            e.a.a.a.y0.d.b.w.a$a r2 = r1.f8677i
            e.a.a.a.y0.d.b.w.a$a r5 = e.a.a.a.y0.d.b.w.a.C0184a.CLASS
            if (r2 == r5) goto L_0x0077
            e.a.a.a.y0.d.b.w.a$a r5 = e.a.a.a.y0.d.b.w.a.C0184a.FILE_FACADE
            if (r2 == r5) goto L_0x0077
            e.a.a.a.y0.d.b.w.a$a r5 = e.a.a.a.y0.d.b.w.a.C0184a.MULTIFILE_CLASS_PART
            if (r2 != r5) goto L_0x0078
        L_0x0077:
            r3 = r6
        L_0x0078:
            if (r3 == 0) goto L_0x007f
            java.lang.String[] r2 = r1.f
            if (r2 != 0) goto L_0x007f
            goto L_0x009c
        L_0x007f:
            e.a.a.a.y0.d.b.w.a r2 = new e.a.a.a.y0.d.b.w.a
            e.a.a.a.y0.d.b.w.a$a r6 = r1.f8677i
            e.a.a.a.y0.e.a0.b.c r3 = r1.f8673b
            if (r3 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            e.a.a.a.y0.e.a0.b.c r3 = e.a.a.a.y0.e.a0.b.c.f
        L_0x008a:
            r8 = r3
            java.lang.String[] r9 = r1.f
            java.lang.String[] r10 = r1.f8676h
            java.lang.String[] r11 = r1.f8675g
            java.lang.String r12 = r1.c
            int r13 = r1.d
            java.lang.String r14 = r1.f8674e
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x009d
        L_0x009c:
            r2 = r4
        L_0x009d:
            if (r2 == 0) goto L_0x00a8
            java.lang.String r1 = "headerReader.createHeader() ?: return null"
            e.x.c.i.d(r2, r1)
            r0.<init>(r15, r2, r4)
            return r0
        L_0x00a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.d1.a.e.e(java.lang.Class):e.a.a.a.y0.b.d1.a.e");
    }

    public a a() {
        return this.f8283b;
    }

    public void b(l.c cVar, byte[] bArr) {
        i.e(cVar, "visitor");
        Class<?> cls = this.a;
        i.e(cls, "klass");
        i.e(cVar, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            i.d(annotation, "annotation");
            Class L0 = b.q.a.a.L0(b.q.a.a.t0(annotation));
            l.a a2 = ((a.c) cVar).a(b.b(L0), new b(annotation));
            if (a2 != null) {
                c.c(a2, annotation, L0);
            }
        }
    }

    public void c(l.d dVar, byte[] bArr) {
        String str;
        String str2;
        l.d dVar2 = dVar;
        i.e(dVar2, "visitor");
        Class<?> cls = this.a;
        i.e(cls, "klass");
        i.e(dVar2, "memberVisitor");
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            str = "sb.toString()";
            str2 = "(";
            if (i2 >= length) {
                break;
            }
            Method method = declaredMethods[i2];
            i.d(method, "method");
            d l2 = d.l(method.getName());
            i.d(l2, "Name.identifier(method.name)");
            i.e(method, "method");
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            for (Class c : method.getParameterTypes()) {
                sb.append(b.c(c));
            }
            sb.append(")");
            sb.append(b.c(method.getReturnType()));
            String sb2 = sb.toString();
            i.d(sb2, str);
            l.e b2 = ((e.a.a.a.y0.d.b.b) dVar2).b(l2, sb2);
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                i.d(annotation, "annotation");
                c.b(b2, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            i.d(parameterAnnotations, "method.parameterAnnotations");
            int length2 = parameterAnnotations.length;
            int i3 = 0;
            while (i3 < length2) {
                Annotation[] annotationArr = parameterAnnotations[i3];
                int length3 = annotationArr.length;
                int i4 = 0;
                while (i4 < length3) {
                    Annotation annotation2 = annotationArr[i4];
                    Class L0 = b.q.a.a.L0(b.q.a.a.t0(annotation2));
                    e.a.a.a.y0.f.a b3 = b.b(L0);
                    Method[] methodArr = declaredMethods;
                    i.d(annotation2, "annotation");
                    int i5 = length;
                    l.a c2 = ((b.a) b2).c(i3, b3, new b(annotation2));
                    if (c2 != null) {
                        c.c(c2, annotation2, L0);
                    }
                    i4++;
                    declaredMethods = methodArr;
                    length = i5;
                }
                Method[] methodArr2 = declaredMethods;
                int i6 = length;
                i3++;
            }
            Method[] methodArr3 = declaredMethods;
            int i7 = length;
            ((b.C0181b) b2).b();
            i2++;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length4 = declaredConstructors.length;
        int i8 = 0;
        while (i8 < length4) {
            Constructor constructor = declaredConstructors[i8];
            d n2 = d.n("<init>");
            i.d(n2, "Name.special(\"<init>\")");
            i.d(constructor, "constructor");
            i.e(constructor, "constructor");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            for (Class c3 : constructor.getParameterTypes()) {
                sb3.append(e.a.a.a.y0.b.d1.b.b.c(c3));
            }
            sb3.append(")V");
            String sb4 = sb3.toString();
            i.d(sb4, str);
            l.e b4 = ((e.a.a.a.y0.d.b.b) dVar2).b(n2, sb4);
            for (Annotation annotation3 : constructor.getDeclaredAnnotations()) {
                i.d(annotation3, "annotation");
                c.b(b4, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            i.d(parameterAnnotations2, "parameterAnnotations");
            if (!(parameterAnnotations2.length == 0)) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                for (int i9 = 0; i9 < length6; i9++) {
                    Annotation[] annotationArr2 = parameterAnnotations2[i9];
                    int length7 = annotationArr2.length;
                    int i10 = 0;
                    while (true) {
                        Constructor[] constructorArr = declaredConstructors;
                        if (i10 >= length7) {
                            break;
                        }
                        Annotation annotation4 = annotationArr2[i10];
                        int i11 = length4;
                        Class L02 = b.q.a.a.L0(b.q.a.a.t0(annotation4));
                        String str3 = str;
                        int i12 = i9 + length5;
                        int i13 = length5;
                        e.a.a.a.y0.f.a b5 = e.a.a.a.y0.b.d1.b.b.b(L02);
                        String str4 = str2;
                        i.d(annotation4, "annotation");
                        Annotation[][] annotationArr3 = parameterAnnotations2;
                        l.a c4 = ((b.a) b4).c(i12, b5, new b(annotation4));
                        if (c4 != null) {
                            c.c(c4, annotation4, L02);
                        }
                        i10++;
                        declaredConstructors = constructorArr;
                        str = str3;
                        length4 = i11;
                        length5 = i13;
                        str2 = str4;
                        parameterAnnotations2 = annotationArr3;
                    }
                    int i14 = length4;
                    int i15 = length5;
                    String str5 = str;
                    String str6 = str2;
                    Annotation[][] annotationArr4 = parameterAnnotations2;
                }
            }
            ((b.C0181b) b4).b();
            i8++;
            declaredConstructors = declaredConstructors;
            str = str;
            length4 = length4;
            str2 = str2;
        }
        for (Field field : cls.getDeclaredFields()) {
            i.d(field, "field");
            d l3 = d.l(field.getName());
            i.d(l3, "Name.identifier(field.name)");
            i.e(field, "field");
            l.c a2 = ((e.a.a.a.y0.d.b.b) dVar2).a(l3, e.a.a.a.y0.b.d1.b.b.c(field.getType()), (Object) null);
            for (Annotation annotation5 : field.getDeclaredAnnotations()) {
                i.d(annotation5, "annotation");
                c.b(a2, annotation5);
            }
            ((b.C0181b) a2).b();
        }
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        String name = this.a.getName();
        i.d(name, "klass.name");
        sb.append(h.v(name, '.', '/', false, 4));
        sb.append(".class");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public e.a.a.a.y0.f.a g() {
        return e.a.a.a.y0.b.d1.b.b.b(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(e.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
