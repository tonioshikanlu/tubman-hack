package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.e.r0;
import b.l.a.d.a.i.n;
import java.util.List;

public class h<T> extends r0 {
    public final n<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f4549b;

    public h(m mVar, n<T> nVar) {
        this.f4549b = mVar;
        this.a = nVar;
    }

    public h(m mVar, n nVar, byte[] bArr) {
        this.f4549b = mVar;
        this.a = nVar;
    }

    public void J0(List<Bundle> list) {
        this.f4549b.c.b();
        m.f.b(4, "onGetSessionStates", new Object[0]);
    }

    public void e0(Bundle bundle, Bundle bundle2) {
        this.f4549b.d.b();
        m.f.b(4, "onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    public void s0(Bundle bundle) {
        this.f4549b.c.b();
        int i2 = bundle.getInt("error_code");
        m.f.b(6, "onError(%d)", new Object[]{Integer.valueOf(i2)});
        this.a.a(new a(i2));
    }

    public void u0(Bundle bundle, Bundle bundle2) {
        this.f4549b.c.b();
        m.f.b(4, "onGetChunkFileDescriptor", new Object[0]);
    }

    public h(m mVar, n nVar, char[] cArr) {
        this.f4549b = mVar;
        this.a = nVar;
    }

    public h(m mVar, n nVar, int[] iArr) {
        this.f4549b = mVar;
        this.a = nVar;
    }
}
