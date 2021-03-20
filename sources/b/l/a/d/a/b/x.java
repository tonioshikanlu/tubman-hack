package b.l.a.d.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

public final class x extends AssetPackState {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4644b;
    public final int c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4645e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4646g;

    public x(String str, int i2, int i3, long j2, long j3, int i4, int i5) {
        Objects.requireNonNull(str, "Null name");
        this.a = str;
        this.f4644b = i2;
        this.c = i3;
        this.d = j2;
        this.f4645e = j3;
        this.f = i4;
        this.f4646g = i5;
    }

    public final int a() {
        return this.f4646g;
    }

    public final long c() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.a.equals(assetPackState.f()) && this.f4644b == assetPackState.g() && this.c == assetPackState.e() && this.d == assetPackState.c() && this.f4645e == assetPackState.h() && this.f == assetPackState.i() && this.f4646g == assetPackState.a();
        }
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.f4644b;
    }

    public final long h() {
        return this.f4645e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i2 = this.f4644b;
        int i3 = this.c;
        long j2 = this.d;
        long j3 = this.f4645e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f) * 1000003) ^ this.f4646g;
    }

    public final int i() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.f4644b;
        int i3 = this.c;
        long j2 = this.d;
        long j3 = this.f4645e;
        int i4 = this.f;
        int i5 = this.f4646g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        sb.append(i4);
        sb.append(", updateAvailability=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
