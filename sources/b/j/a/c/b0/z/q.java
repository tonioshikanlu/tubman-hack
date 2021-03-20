package b.j.a.c.b0.z;

import b.j.a.c.b0.r;
import b.j.a.c.c0.d;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.t;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public class q implements r, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final t f1840h;

    /* renamed from: i  reason: collision with root package name */
    public final i f1841i;

    public q(t tVar, i iVar) {
        this.f1840h = tVar;
        this.f1841i = iVar;
    }

    public Object c(g gVar) {
        String str;
        t tVar = this.f1840h;
        int i2 = d.f1859k;
        Object[] objArr = new Object[1];
        Annotation[] annotationArr = b.j.a.c.j0.g.a;
        if (tVar == null) {
            str = "<UNKNOWN>";
        } else {
            str = String.format("\"%s\"", new Object[]{tVar});
        }
        objArr[0] = str;
        throw new d(gVar, String.format("Invalid `null` value encountered for property %s", objArr), tVar);
    }
}
