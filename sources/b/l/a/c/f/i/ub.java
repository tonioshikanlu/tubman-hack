package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class ub extends a implements wb {
    public ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void b0(String str, String str2, Bundle bundle, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.b(g2, bundle);
        g2.writeLong(j2);
        k(1, g2);
    }

    public final int e() {
        Parcel n2 = n(2, g());
        int readInt = n2.readInt();
        n2.recycle();
        return readInt;
    }
}
