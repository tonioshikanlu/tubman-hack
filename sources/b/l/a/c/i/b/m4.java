package b.l.a.c.i.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import b.l.a.c.b.a;
import b.l.a.c.f.i.n1;
import b.l.a.c.f.i.o1;
import b.l.a.c.f.i.r1;
import b.l.a.c.f.i.s1;
import java.util.Iterator;
import java.util.Objects;

public final /* synthetic */ class m4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final e5 f4139h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4140i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f4141j;

    public m4(e5 e5Var, String str, Bundle bundle) {
        this.f4139h = e5Var;
        this.f4140i = str;
        this.f4141j = bundle;
    }

    public final void run() {
        q qVar;
        e5 e5Var = this.f4139h;
        String str = this.f4140i;
        Bundle bundle = this.f4141j;
        j L = e5Var.a.L();
        L.h();
        L.i();
        l4 l4Var = L.a;
        a.x(str);
        a.x("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            qVar = new q(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    l4Var.a().f.a("Param name can't be null");
                } else {
                    Object s = l4Var.t().s(str2, bundle2.get(str2));
                    if (s == null) {
                        l4Var.a().f4091i.b("Param value can't be null", l4Var.u().q(str2));
                    } else {
                        l4Var.t().z(bundle2, str2, s);
                    }
                }
                it.remove();
            }
            qVar = new q(bundle2);
        }
        f9 P = L.f4305b.P();
        n1 C = o1.C();
        if (C.f3655j) {
            C.j();
            C.f3655j = false;
        }
        o1.L((o1) C.f3654i, 0);
        for (String str3 : qVar.f4228h.keySet()) {
            r1 E = s1.E();
            E.m(str3);
            Object V = qVar.V(str3);
            Objects.requireNonNull(V, "null reference");
            P.u(E, V);
            C.q(E);
        }
        byte[] e2 = ((o1) C.g()).e();
        L.a.a().f4096n.c("Saving default event parameters, appId, data size", L.a.u().p(str), Integer.valueOf(e2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", e2);
        try {
            if (L.y().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                L.a.a().f.b("Failed to insert default event parameters (got -1). appId", k3.t(str));
            }
        } catch (SQLiteException e3) {
            L.a.a().f.c("Error storing default event parameters. appId", k3.t(str), e3);
        }
    }
}
