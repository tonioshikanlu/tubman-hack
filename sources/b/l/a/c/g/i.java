package b.l.a.c.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import b.l.a.c.c.m.v.a;
import java.util.Arrays;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: h  reason: collision with root package name */
    public boolean f3858h;

    /* renamed from: i  reason: collision with root package name */
    public long f3859i;

    /* renamed from: j  reason: collision with root package name */
    public float f3860j;

    /* renamed from: k  reason: collision with root package name */
    public long f3861k;

    /* renamed from: l  reason: collision with root package name */
    public int f3862l;

    public i() {
        this.f3858h = true;
        this.f3859i = 50;
        this.f3860j = 0.0f;
        this.f3861k = RecyclerView.FOREVER_NS;
        this.f3862l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public i(boolean z, long j2, float f, long j3, int i2) {
        this.f3858h = z;
        this.f3859i = j2;
        this.f3860j = f;
        this.f3861k = j3;
        this.f3862l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3858h == iVar.f3858h && this.f3859i == iVar.f3859i && Float.compare(this.f3860j, iVar.f3860j) == 0 && this.f3861k == iVar.f3861k && this.f3862l == iVar.f3862l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3858h), Long.valueOf(this.f3859i), Float.valueOf(this.f3860j), Long.valueOf(this.f3861k), Integer.valueOf(this.f3862l)});
    }

    public final String toString() {
        StringBuilder y = b.e.a.a.a.y("DeviceOrientationRequest[mShouldUseMag=");
        y.append(this.f3858h);
        y.append(" mMinimumSamplingPeriodMs=");
        y.append(this.f3859i);
        y.append(" mSmallestAngleChangeRadians=");
        y.append(this.f3860j);
        long j2 = this.f3861k;
        if (j2 != RecyclerView.FOREVER_NS) {
            y.append(" expireIn=");
            y.append(j2 - SystemClock.elapsedRealtime());
            y.append("ms");
        }
        if (this.f3862l != Integer.MAX_VALUE) {
            y.append(" num=");
            y.append(this.f3862l);
        }
        y.append(']');
        return y.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        boolean z = this.f3858h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        long j2 = this.f3859i;
        b.l.a.c.b.a.I1(parcel, 2, 8);
        parcel.writeLong(j2);
        float f = this.f3860j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeFloat(f);
        long j3 = this.f3861k;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j3);
        int i3 = this.f3862l;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
