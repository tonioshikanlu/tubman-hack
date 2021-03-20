package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f23h;

    /* renamed from: i  reason: collision with root package name */
    public final float f24i;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    public RatingCompat(int i2, float f) {
        this.f23h = i2;
        this.f24i = f;
    }

    public int describeContents() {
        return this.f23h;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Rating:style=");
        y.append(this.f23h);
        y.append(" rating=");
        float f = this.f24i;
        y.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return y.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23h);
        parcel.writeFloat(this.f24i);
    }
}
