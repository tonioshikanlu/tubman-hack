package n.m0.g;

import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n.x;

public final class h extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f10203h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f10203h = iVar;
    }

    public Object e() {
        x xVar = this.f10203h.d;
        i.c(xVar);
        List<Certificate> c = xVar.c();
        ArrayList arrayList = new ArrayList(b.q.a.a.C(c, 10));
        for (Certificate certificate : c) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
