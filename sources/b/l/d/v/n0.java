package b.l.d.v;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class n0 implements Parcelable.Creator<o0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new o0(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new o0[i2];
    }
}
