package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public class h0 extends h implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public final Class<?> f1910j;

    /* renamed from: k  reason: collision with root package name */
    public final i f1911k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1912l;

    public h0(g0 g0Var, Class<?> cls, String str, i iVar) {
        super(g0Var, (o) null);
        this.f1910j = cls;
        this.f1911k = iVar;
        this.f1912l = str;
    }

    public /* bridge */ /* synthetic */ AnnotatedElement b() {
        return null;
    }

    public String d() {
        return this.f1912l;
    }

    public Class<?> e() {
        return this.f1911k.f2152h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!g.s(obj, h0.class)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f1910j == this.f1910j && h0Var.f1912l.equals(this.f1912l);
    }

    public i f() {
        return this.f1911k;
    }

    public Class<?> h() {
        return this.f1910j;
    }

    public int hashCode() {
        return this.f1912l.hashCode();
    }

    public Member j() {
        return null;
    }

    public Object k(Object obj) {
        throw new IllegalArgumentException(a.q(a.y("Cannot get virtual property '"), this.f1912l, "'"));
    }

    public a m(o oVar) {
        return this;
    }

    public String toString() {
        StringBuilder y = a.y("[virtual ");
        y.append(i());
        y.append("]");
        return y.toString();
    }
}
