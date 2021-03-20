package b.l.a.d.a.e;

import android.os.Parcel;
import android.os.Parcelable;

public final class i0 {
    public static final /* synthetic */ int a = 0;

    static {
        i0.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
