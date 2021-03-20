package e.a.a.a.x0;

import e.t.g;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.util.Map;

public final class f extends k implements a<String> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Class f7626h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f7627i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Class cls, Map map) {
        super(0);
        this.f7626h = cls;
        this.f7627i = map;
    }

    public Object e() {
        StringBuilder v = b.e.a.a.a.v('@');
        v.append(this.f7626h.getCanonicalName());
        g.v(this.f7627i.entrySet(), v, ", ", "(", ")", 0, (CharSequence) null, e.f7625h, 48);
        String sb = v.toString();
        i.d(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
