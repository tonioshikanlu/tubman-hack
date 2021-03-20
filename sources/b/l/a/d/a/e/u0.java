package b.l.a.d.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class u0 extends g0 implements v0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void F(Bundle bundle, Bundle bundle2) {
        Parcel g2 = g();
        int i2 = i0.a;
        g2.writeInt(1);
        bundle.writeToParcel(g2, 0);
        g2.writeInt(1);
        bundle2.writeToParcel(g2, 0);
        k(2, g2);
    }

    public final void J(Bundle bundle) {
        Parcel g2 = g();
        int i2 = i0.a;
        g2.writeInt(1);
        bundle.writeToParcel(g2, 0);
        k(4, g2);
    }

    public final void l0(Bundle bundle) {
        Parcel g2 = g();
        int i2 = i0.a;
        g2.writeInt(1);
        bundle.writeToParcel(g2, 0);
        k(3, g2);
    }
}
