package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final int f39h;

    /* renamed from: i  reason: collision with root package name */
    public final long f40i;

    /* renamed from: j  reason: collision with root package name */
    public final long f41j;

    /* renamed from: k  reason: collision with root package name */
    public final float f42k;

    /* renamed from: l  reason: collision with root package name */
    public final long f43l;

    /* renamed from: m  reason: collision with root package name */
    public final int f44m;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f45n;

    /* renamed from: o  reason: collision with root package name */
    public final long f46o;

    /* renamed from: p  reason: collision with root package name */
    public List<CustomAction> f47p;

    /* renamed from: q  reason: collision with root package name */
    public final long f48q;
    public final Bundle r;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final String f49h;

        /* renamed from: i  reason: collision with root package name */
        public final CharSequence f50i;

        /* renamed from: j  reason: collision with root package name */
        public final int f51j;

        /* renamed from: k  reason: collision with root package name */
        public final Bundle f52k;

        /* renamed from: l  reason: collision with root package name */
        public Object f53l;

        public static class a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f49h = parcel.readString();
            this.f50i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f51j = parcel.readInt();
            this.f52k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f49h = str;
            this.f50i = charSequence;
            this.f51j = i2;
            this.f52k = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Action:mName='");
            y.append(this.f50i);
            y.append(", mIcon=");
            y.append(this.f51j);
            y.append(", mExtras=");
            y.append(this.f52k);
            return y.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f49h);
            TextUtils.writeToParcel(this.f50i, parcel, i2);
            parcel.writeInt(this.f51j);
            parcel.writeBundle(this.f52k);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    public PlaybackStateCompat(int i2, long j2, long j3, float f, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f39h = i2;
        this.f40i = j2;
        this.f41j = j3;
        this.f42k = f;
        this.f43l = j4;
        this.f44m = i3;
        this.f45n = charSequence;
        this.f46o = j5;
        this.f47p = new ArrayList(list);
        this.f48q = j6;
        this.r = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f39h = parcel.readInt();
        this.f40i = parcel.readLong();
        this.f42k = parcel.readFloat();
        this.f46o = parcel.readLong();
        this.f41j = parcel.readLong();
        this.f43l = parcel.readLong();
        this.f45n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f47p = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f48q = parcel.readLong();
        this.r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f44m = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f39h + ", position=" + this.f40i + ", buffered position=" + this.f41j + ", speed=" + this.f42k + ", updated=" + this.f46o + ", actions=" + this.f43l + ", error code=" + this.f44m + ", error message=" + this.f45n + ", custom actions=" + this.f47p + ", active item id=" + this.f48q + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f39h);
        parcel.writeLong(this.f40i);
        parcel.writeFloat(this.f42k);
        parcel.writeLong(this.f46o);
        parcel.writeLong(this.f41j);
        parcel.writeLong(this.f43l);
        TextUtils.writeToParcel(this.f45n, parcel, i2);
        parcel.writeTypedList(this.f47p);
        parcel.writeLong(this.f48q);
        parcel.writeBundle(this.r);
        parcel.writeInt(this.f44m);
    }
}
