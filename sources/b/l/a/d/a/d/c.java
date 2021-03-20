package b.l.a.d.a.d;

import com.google.android.play.core.install.InstallState;
import java.util.Objects;

public final class c extends InstallState {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4656b;
    public final long c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4657e;

    public c(int i2, long j2, long j3, int i3, String str) {
        this.a = i2;
        this.f4656b = j2;
        this.c = j3;
        this.d = i3;
        Objects.requireNonNull(str, "Null packageName");
        this.f4657e = str;
    }

    public final long a() {
        return this.f4656b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.f4657e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.a == installState.c() && this.f4656b == installState.a() && this.c == installState.e() && this.d == installState.b() && this.f4657e.equals(installState.d());
        }
    }

    public final int hashCode() {
        int i2 = this.a;
        long j2 = this.f4656b;
        long j3 = this.c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.d) * 1000003) ^ this.f4657e.hashCode();
    }

    public final String toString() {
        int i2 = this.a;
        long j2 = this.f4656b;
        long j3 = this.c;
        int i3 = this.d;
        String str = this.f4657e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
