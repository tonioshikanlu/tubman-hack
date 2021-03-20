package b.l.a.a.f;

import androidx.annotation.NonNull;
import b.l.a.a.a;
import java.util.Arrays;
import java.util.Objects;

public final class d {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2482b;

    public d(@NonNull a aVar, @NonNull byte[] bArr) {
        Objects.requireNonNull(aVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = aVar;
        this.f2482b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.a)) {
            return false;
        }
        return Arrays.equals(this.f2482b, dVar.f2482b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2482b);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("EncodedPayload{encoding=");
        y.append(this.a);
        y.append(", bytes=[...]}");
        return y.toString();
    }
}
