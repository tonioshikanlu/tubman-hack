package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.m.l1.f;
import e.t.g;
import e.t.o;
import e.x.b.l;
import java.util.List;
import java.util.Objects;

public class v extends k0 {

    /* renamed from: i  reason: collision with root package name */
    public final v0 f9757i;

    /* renamed from: j  reason: collision with root package name */
    public final i f9758j;

    /* renamed from: k  reason: collision with root package name */
    public final List<y0> f9759k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9760l;

    /* renamed from: m  reason: collision with root package name */
    public final String f9761m;

    public v(v0 v0Var, i iVar, List<y0> list, boolean z, String str, int i2) {
        list = (i2 & 4) != 0 ? o.f7934h : list;
        z = (i2 & 8) != 0 ? false : z;
        String str2 = (i2 & 16) != 0 ? "???" : null;
        e.x.c.i.e(v0Var, "constructor");
        e.x.c.i.e(iVar, "memberScope");
        e.x.c.i.e(list, "arguments");
        e.x.c.i.e(str2, "presentableName");
        this.f9757i = v0Var;
        this.f9758j = iVar;
        this.f9759k = list;
        this.f9760l = z;
        this.f9761m = str2;
    }

    public List<y0> V0() {
        return this.f9759k;
    }

    public v0 W0() {
        return this.f9757i;
    }

    public boolean X0() {
        return this.f9760l;
    }

    public i1 c1(h hVar) {
        e.x.c.i.e(hVar, "newAnnotations");
        return this;
    }

    public k0 d1(boolean z) {
        return new v(this.f9757i, this.f9758j, this.f9759k, z, (String) null, 16);
    }

    public k0 e1(h hVar) {
        e.x.c.i.e(hVar, "newAnnotations");
        return this;
    }

    public String f1() {
        return this.f9761m;
    }

    /* renamed from: g1 */
    public v b1(f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        return this;
    }

    public h k() {
        Objects.requireNonNull(h.f7785e);
        return h.a.a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9757i.toString());
        if (this.f9759k.isEmpty()) {
            str = "";
        } else {
            str = g.w(this.f9759k, ", ", "<", ">", -1, "...", (l) null);
        }
        sb.append(str);
        return sb.toString();
    }

    public i z() {
        return this.f9758j;
    }
}
