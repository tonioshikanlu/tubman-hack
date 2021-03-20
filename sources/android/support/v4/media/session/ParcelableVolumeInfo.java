package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f34h;

    /* renamed from: i  reason: collision with root package name */
    public int f35i;

    /* renamed from: j  reason: collision with root package name */
    public int f36j;

    /* renamed from: k  reason: collision with root package name */
    public int f37k;

    /* renamed from: l  reason: collision with root package name */
    public int f38l;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f34h = parcel.readInt();
        this.f36j = parcel.readInt();
        this.f37k = parcel.readInt();
        this.f38l = parcel.readInt();
        this.f35i = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f34h);
        parcel.writeInt(this.f36j);
        parcel.writeInt(this.f37k);
        parcel.writeInt(this.f38l);
        parcel.writeInt(this.f35i);
    }
}
