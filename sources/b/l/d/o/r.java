package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import b.l.a.c.b.a;

public class r extends c {
    public static final Parcelable.Creator<r> CREATOR = new x0();

    /* renamed from: h  reason: collision with root package name */
    public String f5011h;

    public r(@NonNull String str) {
        a.x(str);
        this.f5011h = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f5011h, false);
        a.H1(parcel, P0);
    }
}
