package b.m.a;

import androidx.annotation.NonNull;

public class r implements Comparable<r> {

    /* renamed from: h  reason: collision with root package name */
    public final int f5930h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5931i;

    public r(int i2, int i3) {
        this.f5930h = i2;
        this.f5931i = i3;
    }

    public int compareTo(@NonNull Object obj) {
        r rVar = (r) obj;
        int i2 = this.f5931i * this.f5930h;
        int i3 = rVar.f5931i * rVar.f5930h;
        if (i3 < i2) {
            return 1;
        }
        return i3 > i2 ? -1 : 0;
    }

    public r d(r rVar) {
        int i2 = this.f5930h;
        int i3 = rVar.f5931i;
        int i4 = i2 * i3;
        int i5 = rVar.f5930h;
        int i6 = this.f5931i;
        return i4 <= i5 * i6 ? new r(i5, (i6 * i5) / i2) : new r((i2 * i3) / i6, i3);
    }

    public r e(r rVar) {
        int i2 = this.f5930h;
        int i3 = rVar.f5931i;
        int i4 = i2 * i3;
        int i5 = rVar.f5930h;
        int i6 = this.f5931i;
        return i4 >= i5 * i6 ? new r(i5, (i6 * i5) / i2) : new r((i2 * i3) / i6, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f5930h == rVar.f5930h && this.f5931i == rVar.f5931i;
    }

    public int hashCode() {
        return (this.f5930h * 31) + this.f5931i;
    }

    public String toString() {
        return this.f5930h + "x" + this.f5931i;
    }
}
