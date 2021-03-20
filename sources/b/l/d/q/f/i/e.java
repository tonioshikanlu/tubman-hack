package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;
import java.util.Arrays;

public final class e extends v.c.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5208b;

    public e(String str, byte[] bArr, a aVar) {
        this.a = str;
        this.f5208b = bArr;
    }

    @NonNull
    public byte[] a() {
        return this.f5208b;
    }

    @NonNull
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c.a)) {
            return false;
        }
        v.c.a aVar = (v.c.a) obj;
        if (this.a.equals(aVar.b())) {
            if (Arrays.equals(this.f5208b, aVar instanceof e ? ((e) aVar).f5208b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5208b);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("File{filename=");
        y.append(this.a);
        y.append(", contents=");
        y.append(Arrays.toString(this.f5208b));
        y.append("}");
        return y.toString();
    }
}
