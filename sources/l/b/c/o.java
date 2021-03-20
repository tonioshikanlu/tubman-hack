package l.b.c;

import com.segment.analytics.integrations.BasePayload;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import l.b.c.d;
import l.b.c.e;
import l.b.c.m;
import l.b.c.n;

public abstract class o {
    public static final Map<String, a> c = Collections.emptyMap();
    public static final Set<a> d = Collections.unmodifiableSet(EnumSet.noneOf(a.class));
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<a> f8124b;

    public enum a {
        RECORD_EVENTS
    }

    public o(p pVar, EnumSet<a> enumSet) {
        b.q.a.a.x(pVar, BasePayload.CONTEXT_KEY);
        this.a = pVar;
        Set<a> set = d;
        this.f8124b = set;
        if (!(!pVar.c.a() || set.contains(a.RECORD_EVENTS))) {
            throw new IllegalArgumentException("Span is sampled, but does not have RECORD_EVENTS set.");
        }
    }

    public void a(m mVar) {
        n nVar;
        b.q.a.a.x(mVar, "messageEvent");
        b.q.a.a.x(mVar, "event");
        if (mVar instanceof n) {
            nVar = (n) mVar;
        } else {
            n.a aVar = mVar.d() == m.b.RECEIVED ? n.a.RECV : n.a.SENT;
            long c2 = mVar.c();
            b.q.a.a.x(aVar, "type");
            Long valueOf = Long.valueOf(c2);
            Long valueOf2 = Long.valueOf(mVar.e());
            Long valueOf3 = Long.valueOf(mVar.b());
            String str = valueOf == null ? " messageId" : "";
            if (valueOf2 == null) {
                str = b.e.a.a.a.m(str, " uncompressedMessageSize");
            }
            if (valueOf3 == null) {
                str = b.e.a.a.a.m(str, " compressedMessageSize");
            }
            if (str.isEmpty()) {
                nVar = new e((l.b.a.a) null, aVar, valueOf.longValue(), valueOf2.longValue(), valueOf3.longValue(), (e.a) null);
            } else {
                throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
            }
        }
        b(nVar);
    }

    @Deprecated
    public void b(n nVar) {
        m mVar;
        b.q.a.a.x(nVar, "event");
        if (nVar instanceof m) {
            mVar = (m) nVar;
        } else {
            m.a a2 = m.a(nVar.d() == n.a.RECV ? m.b.RECEIVED : m.b.SENT, nVar.c());
            a2.b(nVar.e());
            d.b bVar = (d.b) a2;
            bVar.d = Long.valueOf(nVar.a());
            mVar = bVar.a();
        }
        a(mVar);
    }

    public abstract void c(l lVar);

    public void d(String str, a aVar) {
        b.q.a.a.x(str, "key");
        b.q.a.a.x(aVar, "value");
        e(Collections.singletonMap(str, aVar));
    }

    public void e(Map<String, a> map) {
        b.q.a.a.x(map, "attributes");
        e(map);
    }
}
