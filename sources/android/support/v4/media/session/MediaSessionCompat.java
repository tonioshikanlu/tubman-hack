package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import h.a.b.b.g.b;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final MediaDescriptionCompat f28h;

        /* renamed from: i  reason: collision with root package name */
        public final long f29i;

        /* renamed from: j  reason: collision with root package name */
        public Object f30j;

        public static class a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f28h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f29i = parcel.readLong();
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j2 != -1) {
                this.f28h = mediaDescriptionCompat;
                this.f29i = j2;
                this.f30j = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("MediaSession.QueueItem {Description=");
            y.append(this.f28h);
            y.append(", Id=");
            y.append(this.f29i);
            y.append(" }");
            return y.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.f28h.writeToParcel(parcel, i2);
            parcel.writeLong(this.f29i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public ResultReceiver f31h;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f31h = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.f31h.writeToParcel(parcel, i2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final Object f32h;

        /* renamed from: i  reason: collision with root package name */
        public b f33i;

        public static class a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i2) {
                return new Token[i2];
            }
        }

        public Token(Object obj) {
            this.f32h = obj;
            this.f33i = null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token a(Object obj, b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f32h;
            Object obj3 = ((Token) obj).f32h;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f32h;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.f32h, i2);
        }

        public Token(Object obj, b bVar) {
            this.f32h = obj;
            this.f33i = bVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
