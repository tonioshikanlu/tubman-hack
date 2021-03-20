package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;

public class v {
    public static final /* synthetic */ int a = 0;

    static {
        v.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
