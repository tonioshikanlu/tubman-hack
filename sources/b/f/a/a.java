package b.f.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a implements Parcelable {
    public static final C0017a CREATOR = new C0017a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final Uri f396h;

    /* renamed from: i  reason: collision with root package name */
    public final String f397i;

    /* renamed from: j  reason: collision with root package name */
    public final String f398j;

    /* renamed from: k  reason: collision with root package name */
    public final String f399k;

    /* renamed from: l  reason: collision with root package name */
    public final String f400l;

    /* renamed from: m  reason: collision with root package name */
    public final String f401m;

    /* renamed from: b.f.a.a$a  reason: collision with other inner class name */
    public static final class C0017a implements Parcelable.Creator<a> {
        public C0017a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Object createFromParcel(Parcel parcel) {
            i.f(parcel, "parcel");
            return new a(parcel);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(Uri uri, String str, String str2, String str3, String str4, String str5) {
        i.f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f396h = uri;
        this.f397i = str;
        this.f398j = str2;
        this.f399k = str3;
        this.f400l = str4;
        this.f401m = str5;
    }

    public a(Parcel parcel) {
        i.f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
        i.b(readParcelable, "parcel.readParcelable(Uri::class.java.classLoader)");
        Uri uri = (Uri) readParcelable;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        i.f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.f396h = uri;
        this.f397i = readString;
        this.f398j = readString2;
        this.f399k = readString3;
        this.f400l = readString4;
        this.f401m = readString5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f396h, aVar.f396h) && i.a(this.f397i, aVar.f397i) && i.a(this.f398j, aVar.f398j) && i.a(this.f399k, aVar.f399k) && i.a(this.f400l, aVar.f400l) && i.a(this.f401m, aVar.f401m);
    }

    public int hashCode() {
        Uri uri = this.f396h;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        String str = this.f397i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f398j;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f399k;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f400l;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f401m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("KotResult(uri=");
        y.append(this.f396h);
        y.append(", name=");
        y.append(this.f397i);
        y.append(", size=");
        y.append(this.f398j);
        y.append(", location=");
        y.append(this.f399k);
        y.append(", type=");
        y.append(this.f400l);
        y.append(", modified=");
        return b.e.a.a.a.q(y, this.f401m, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        i.f(parcel, "parcel");
        parcel.writeParcelable(this.f396h, i2);
        parcel.writeString(this.f397i);
        parcel.writeString(this.f398j);
        parcel.writeString(this.f399k);
        parcel.writeString(this.f400l);
        parcel.writeString(this.f401m);
    }
}
