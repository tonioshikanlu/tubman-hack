package b.g.a.h;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;

public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f430h;
    @ColorRes

    /* renamed from: i  reason: collision with root package name */
    public final int f431i;

    public static class a implements Parcelable.Creator<i> {
        public Object createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        public Object[] newArray(int i2) {
            return new i[i2];
        }
    }

    public i(Parcel parcel) {
        this.f430h = parcel.readByte() != 0;
        this.f431i = parcel.readInt();
    }

    public i(boolean z, int i2, a aVar) {
        this.f430h = z;
        this.f431i = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f430h ? (byte) 1 : 0);
        parcel.writeInt(this.f431i);
    }
}
