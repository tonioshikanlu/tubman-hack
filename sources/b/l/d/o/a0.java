package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import b.l.a.c.b.a;

public class a0 extends c {
    public static final Parcelable.Creator<a0> CREATOR = new j0();

    /* renamed from: h  reason: collision with root package name */
    public String f4937h;

    /* renamed from: i  reason: collision with root package name */
    public String f4938i;

    public a0(@NonNull String str, @NonNull String str2) {
        a.x(str);
        this.f4937h = str;
        a.x(str2);
        this.f4938i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f4937h, false);
        a.K0(parcel, 2, this.f4938i, false);
        a.H1(parcel, P0);
    }
}
