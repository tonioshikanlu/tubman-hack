package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import b.l.a.c.b.a;

public class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new p0();

    /* renamed from: h  reason: collision with root package name */
    public String f4946h;

    /* renamed from: i  reason: collision with root package name */
    public String f4947i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4948j;

    /* renamed from: k  reason: collision with root package name */
    public String f4949k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4950l;

    public d(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull boolean z) {
        a.x(str);
        this.f4946h = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f4947i = str2;
            this.f4948j = str3;
            this.f4949k = str4;
            this.f4950l = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f4946h, false);
        a.K0(parcel, 2, this.f4947i, false);
        a.K0(parcel, 3, this.f4948j, false);
        a.K0(parcel, 4, this.f4949k, false);
        boolean z = this.f4950l;
        a.I1(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        a.H1(parcel, P0);
    }
}
