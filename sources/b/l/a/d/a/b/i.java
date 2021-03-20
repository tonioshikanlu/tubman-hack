package b.l.a.d.a.b;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import b.l.a.d.a.i.n;

public final class i extends h<ParcelFileDescriptor> {
    public i(m mVar, n<ParcelFileDescriptor> nVar) {
        super(mVar, nVar);
    }

    public final void u0(Bundle bundle, Bundle bundle2) {
        this.f4549b.c.b();
        m.f.b(4, "onGetChunkFileDescriptor", new Object[0]);
        this.a.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
