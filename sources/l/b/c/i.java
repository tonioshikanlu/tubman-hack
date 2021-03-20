package l.b.c;

import b.q.a.a;
import java.util.EnumSet;
import java.util.Map;
import l.b.c.o;

public final class i extends o {

    /* renamed from: e  reason: collision with root package name */
    public static final i f8114e = new i();

    public i() {
        super(p.f8127e, (EnumSet<o.a>) null);
    }

    public void a(m mVar) {
        a.x(mVar, "messageEvent");
    }

    @Deprecated
    public void b(n nVar) {
    }

    public void c(l lVar) {
        a.x(lVar, "options");
    }

    public void d(String str, a aVar) {
        a.x(str, "key");
        a.x(aVar, "value");
    }

    public void e(Map<String, a> map) {
        a.x(map, "attributes");
    }

    public void f(String str, Map<String, a> map) {
        a.x(str, "description");
        a.x(map, "attributes");
    }

    public String toString() {
        return "BlankSpan";
    }
}
