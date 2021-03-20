package b.l.a.c.g;

import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

public final class c implements Parcelable.Creator<LocationAvailability> {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = b.l.a.c.b.a.C0(r14)
            r1 = 1
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r5 = 0
            r8 = r1
            r9 = r8
            r7 = r2
            r10 = r3
            r12 = r5
        L_0x000f:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x004d
            int r2 = r14.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            if (r3 == r1) goto L_0x0048
            r4 = 2
            if (r3 == r4) goto L_0x0043
            r4 = 3
            if (r3 == r4) goto L_0x003e
            r4 = 4
            if (r3 == r4) goto L_0x0039
            r4 = 5
            if (r3 == r4) goto L_0x002f
            b.l.a.c.b.a.z0(r14, r2)
            goto L_0x000f
        L_0x002f:
            android.os.Parcelable$Creator<b.l.a.c.g.g> r3 = b.l.a.c.g.g.CREATOR
            java.lang.Object[] r2 = b.l.a.c.b.a.N(r14, r2, r3)
            r12 = r2
            b.l.a.c.g.g[] r12 = (b.l.a.c.g.g[]) r12
            goto L_0x000f
        L_0x0039:
            int r7 = b.l.a.c.b.a.t0(r14, r2)
            goto L_0x000f
        L_0x003e:
            long r10 = b.l.a.c.b.a.u0(r14, r2)
            goto L_0x000f
        L_0x0043:
            int r9 = b.l.a.c.b.a.t0(r14, r2)
            goto L_0x000f
        L_0x0048:
            int r8 = b.l.a.c.b.a.t0(r14, r2)
            goto L_0x000f
        L_0x004d:
            b.l.a.c.b.a.S(r14, r0)
            com.google.android.gms.location.LocationAvailability r14 = new com.google.android.gms.location.LocationAvailability
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.g.c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationAvailability[i2];
    }
}
