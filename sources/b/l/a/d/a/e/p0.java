package b.l.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;

public abstract class p0 extends h0 implements q0 {
    public static q0 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(iBinder);
    }
}
