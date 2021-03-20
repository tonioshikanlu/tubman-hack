package b.l.a.a.f.n;

import androidx.annotation.Nullable;
import b.l.a.a.f.e;
import java.util.Arrays;

public final class a extends f {
    public final Iterable<e> a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2491b;

    public a(Iterable iterable, byte[] bArr, C0055a aVar) {
        this.a = iterable;
        this.f2491b = bArr;
    }

    public Iterable<e> a() {
        return this.a;
    }

    @Nullable
    public byte[] b() {
        return this.f2491b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a())) {
            if (Arrays.equals(this.f2491b, fVar instanceof a ? ((a) fVar).f2491b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2491b);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("BackendRequest{events=");
        y.append(this.a);
        y.append(", extras=");
        y.append(Arrays.toString(this.f2491b));
        y.append("}");
        return y.toString();
    }
}
