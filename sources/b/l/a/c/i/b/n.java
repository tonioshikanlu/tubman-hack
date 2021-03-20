package b.l.a.c.i.b;

import android.os.Bundle;
import android.text.TextUtils;
import b.l.a.c.b.a;
import java.util.Iterator;
import java.util.Objects;

public final class n {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4163b;
    public final String c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4164e;
    public final q f;

    public n(l4 l4Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        q qVar;
        a.x(str2);
        a.x(str3);
        this.a = str2;
        this.f4163b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.f4164e = j3;
        if (j3 != 0 && j3 > j2) {
            l4Var.a().f4091i.b("Event created with reverse previous/current timestamps. appId", k3.t(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    l4Var.a().f.a("Param name can't be null");
                } else {
                    Object s = l4Var.t().s(str4, bundle2.get(str4));
                    if (s == null) {
                        l4Var.a().f4091i.b("Param value can't be null", l4Var.u().q(str4));
                    } else {
                        l4Var.t().z(bundle2, str4, s);
                    }
                }
                it.remove();
            }
            qVar = new q(bundle2);
        } else {
            qVar = new q(new Bundle());
        }
        this.f = qVar;
    }

    public final n a(l4 l4Var, long j2) {
        return new n(l4Var, this.c, this.a, this.f4163b, this.d, j2, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f4163b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(b.e.a.a.a.b(String.valueOf(str).length(), 33, String.valueOf(str2).length(), valueOf.length()));
        b.e.a.a.a.L(sb, "Event{appId='", str, "', name='", str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public n(l4 l4Var, String str, String str2, String str3, long j2, long j3, q qVar) {
        a.x(str2);
        a.x(str3);
        Objects.requireNonNull(qVar, "null reference");
        this.a = str2;
        this.f4163b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.f4164e = j3;
        if (j3 != 0 && j3 > j2) {
            l4Var.a().f4091i.c("Event created with reverse previous/current timestamps. appId, name", k3.t(str2), k3.t(str3));
        }
        this.f = qVar;
    }
}
