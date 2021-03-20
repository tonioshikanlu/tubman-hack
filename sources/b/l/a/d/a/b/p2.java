package b.l.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;
import java.util.ArrayList;
import java.util.List;

public final class p2 extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f4598i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n f4599j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f4600k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p2(m mVar, n nVar, List list, n nVar2) {
        super(nVar);
        this.f4600k = mVar;
        this.f4598i = list;
        this.f4599j = nVar2;
    }

    public final void a() {
        List<String> list = this.f4598i;
        ArrayList arrayList = new ArrayList(list.size());
        for (String putString : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", putString);
            arrayList.add(bundle);
        }
        try {
            m mVar = this.f4600k;
            ((q0) mVar.c.f4675k).E(mVar.a, arrayList, m.h(), new h(this.f4600k, this.f4599j, (byte[]) null));
        } catch (RemoteException e2) {
            m.f.a(e2, "cancelDownloads(%s)", this.f4598i);
        }
    }
}
