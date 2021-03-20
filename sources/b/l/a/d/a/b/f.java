package b.l.a.d.a.b;

import android.os.RemoteException;
import b.l.a.d.a.e.g;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.i.n;

public final class f extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4531i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4532j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f4533k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4534l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ n f4535m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ m f4536n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(m mVar, n nVar, int i2, String str, String str2, int i3, n nVar2) {
        super(nVar);
        this.f4536n = mVar;
        this.f4531i = i2;
        this.f4532j = str;
        this.f4533k = str2;
        this.f4534l = i3;
        this.f4535m = nVar2;
    }

    public final void a() {
        try {
            m mVar = this.f4536n;
            ((q0) mVar.c.f4675k).L0(mVar.a, m.j(this.f4531i, this.f4532j, this.f4533k, this.f4534l), m.h(), new i(this.f4536n, this.f4535m));
        } catch (RemoteException e2) {
            m.f.b(6, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{this.f4532j, this.f4533k, Integer.valueOf(this.f4534l), Integer.valueOf(this.f4531i)});
            this.f4535m.a(new RuntimeException(e2));
        }
    }
}
