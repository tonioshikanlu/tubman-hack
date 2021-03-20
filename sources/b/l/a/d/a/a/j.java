package b.l.a.d.a.a;

import android.os.IBinder;
import android.os.IInterface;
import b.l.a.d.a.e.j0;
import b.l.a.d.a.e.k0;
import b.l.a.d.a.e.l;
import b.l.a.d.a.e.l0;

public final /* synthetic */ class j implements l {
    public static final l a = new j();

    public final Object a(IBinder iBinder) {
        int i2 = k0.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(iBinder);
    }
}
