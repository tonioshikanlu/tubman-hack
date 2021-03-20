package b.l.a.c.i.b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

public final /* synthetic */ class n5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final m6 f4174h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f4175i;

    public n5(m6 m6Var, Bundle bundle) {
        this.f4174h = m6Var;
        this.f4175i = bundle;
    }

    public final void run() {
        m6 m6Var = this.f4174h;
        Bundle bundle = this.f4175i;
        if (bundle == null) {
            m6Var.a.q().B.b(new Bundle());
            return;
        }
        Bundle a = m6Var.a.q().B.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (m6Var.a.t().o0(obj)) {
                    m6Var.a.t().A(m6Var.f4158p, (String) null, 27, (String) null, (String) null, 0);
                }
                m6Var.a.a().f4093k.c("Invalid default event parameter type. Name, value", str, obj);
            } else if (k9.F(str)) {
                m6Var.a.a().f4093k.b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                k9 t = m6Var.a.t();
                f fVar = m6Var.a.f4114g;
                if (t.p0("param", str, 100, obj)) {
                    m6Var.a.t().z(a, str, obj);
                }
            }
        }
        m6Var.a.t();
        int k2 = m6Var.a.f4114g.k();
        if (a.size() > k2) {
            Iterator it = new TreeSet(a.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i2++;
                if (i2 > k2) {
                    a.remove(str2);
                }
            }
            m6Var.a.t().A(m6Var.f4158p, (String) null, 26, (String) null, (String) null, 0);
            m6Var.a.a().f4093k.a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        m6Var.a.q().B.b(a);
        b8 z = m6Var.a.z();
        z.h();
        z.i();
        z.t(new j7(z, z.v(false), a));
    }
}
