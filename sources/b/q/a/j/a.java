package b.q.a.j;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0117a();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f6787h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6788i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6789j;

    /* renamed from: b.q.a.j.a$a  reason: collision with other inner class name */
    public static class C0117a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(Parcel parcel) {
        this.f6787h = parcel.readString();
        this.f6788i = parcel.readFloat();
        this.f6789j = parcel.readFloat();
    }

    public a(@Nullable String str, float f, float f2) {
        this.f6787h = str;
        this.f6788i = f;
        this.f6789j = f2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6787h);
        parcel.writeFloat(this.f6788i);
        parcel.writeFloat(this.f6789j);
    }
}
