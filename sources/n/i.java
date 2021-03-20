package n;

import e.x.b.a;
import e.x.c.k;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n.m0.m.c;

public final class i extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f10119h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f10120i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f10121j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar, List list, String str) {
        super(0);
        this.f10119h = hVar;
        this.f10120i = list;
        this.f10121j = str;
    }

    public Object e() {
        List<Certificate> list;
        c cVar = this.f10119h.f10099b;
        if (cVar == null || (list = cVar.a(this.f10120i, this.f10121j)) == null) {
            list = this.f10120i;
        }
        ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
