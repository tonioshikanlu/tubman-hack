package b.l.a.d.a.b;

import androidx.annotation.Nullable;
import b.e.a.a.a;
import java.util.Arrays;

public final class y1 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4651b;
    public final int c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4652e;
    public final byte[] f;

    public y1() {
    }

    public y1(@Nullable String str, long j2, int i2, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.a = str;
        this.f4651b = j2;
        this.c = i2;
        this.d = z;
        this.f4652e = z2;
        this.f = bArr;
    }

    public final boolean a() {
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    public final boolean b() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            String str = this.a;
            if (str != null ? str.equals(y1Var.a) : y1Var.a == null) {
                return this.f4651b == y1Var.f4651b && this.c == y1Var.c && this.d == y1Var.d && this.f4652e == y1Var.f4652e && Arrays.equals(this.f, y1Var.f);
            }
        }
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f4651b;
        int i2 = 1237;
        int i3 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.f4652e) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public String toString() {
        String str = this.a;
        long j2 = this.f4651b;
        int i2 = this.c;
        boolean z = this.d;
        boolean z2 = this.f4652e;
        String arrays = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return a.r(sb, ", headerBytes=", arrays, "}");
    }
}
