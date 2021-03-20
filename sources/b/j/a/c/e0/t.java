package b.j.a.c.e0;

import b.j.a.c.b;
import b.j.a.c.e0.n;
import b.j.a.c.j0.g;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class t {

    /* renamed from: b  reason: collision with root package name */
    public static final o[] f1947b = new o[0];
    public static final Annotation[] c = new Annotation[0];
    public final b a;

    public t(b bVar) {
        this.a = bVar;
    }

    public static o[] a(int i2) {
        if (i2 == 0) {
            return f1947b;
        }
        o[] oVarArr = new o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            oVarArr[i3] = new o();
        }
        return oVarArr;
    }

    public final n b(n nVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            nVar = nVar.a(annotation);
            if (this.a.k0(annotation)) {
                nVar = e(nVar, annotation);
            }
        }
        return nVar;
    }

    public final n c(Annotation[] annotationArr) {
        n nVar = n.a.c;
        for (Annotation annotation : annotationArr) {
            nVar = nVar.a(annotation);
            if (this.a.k0(annotation)) {
                nVar = e(nVar, annotation);
            }
        }
        return nVar;
    }

    public final n d(n nVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!nVar.d(annotation)) {
                nVar = nVar.a(annotation);
                if (this.a.k0(annotation)) {
                    for (Annotation annotation2 : g.j(annotation.annotationType())) {
                        if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention)) && !nVar.d(annotation2)) {
                            nVar = nVar.a(annotation2);
                            if (this.a.k0(annotation2)) {
                                nVar = e(nVar, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return nVar;
    }

    public final n e(n nVar, Annotation annotation) {
        for (Annotation annotation2 : g.j(annotation.annotationType())) {
            if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention))) {
                if (!this.a.k0(annotation2)) {
                    nVar = nVar.a(annotation2);
                } else if (!nVar.d(annotation2)) {
                    nVar = e(nVar.a(annotation2), annotation2);
                }
            }
        }
        return nVar;
    }
}
