package b.l.a.c.j.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.api.Status;

public final class c extends a implements h {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public final int f4407h;

    /* renamed from: i  reason: collision with root package name */
    public int f4408i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public Intent f4409j;

    public c() {
        this.f4407h = 2;
        this.f4408i = 0;
        this.f4409j = null;
    }

    public c(int i2, int i3, @Nullable Intent intent) {
        this.f4407h = i2;
        this.f4408i = i3;
        this.f4409j = intent;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f4407h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = this.f4408i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i4);
        b.l.a.c.b.a.J0(parcel, 3, this.f4409j, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }

    public final Status y() {
        return this.f4408i == 0 ? Status.f7258l : Status.f7261o;
    }
}
