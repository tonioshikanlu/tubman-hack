package b.l.a.c.f.h;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class c {
    public static final /* synthetic */ int a = 0;

    static {
        c.class.getClassLoader();
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
