package b.l.a.d.a.a;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import java.util.Objects;

public final class s extends a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4464b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f4465e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4466g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4467h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4468i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4469j;

    /* renamed from: k  reason: collision with root package name */
    public final PendingIntent f4470k;

    /* renamed from: l  reason: collision with root package name */
    public final PendingIntent f4471l;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f4472m;

    /* renamed from: n  reason: collision with root package name */
    public final PendingIntent f4473n;

    public s(String str, int i2, int i3, int i4, @Nullable Integer num, int i5, long j2, long j3, long j4, long j5, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.a = str;
        this.f4464b = i2;
        this.c = i3;
        this.d = i4;
        this.f4465e = num;
        this.f = i5;
        this.f4466g = j2;
        this.f4467h = j3;
        this.f4468i = j4;
        this.f4469j = j5;
        this.f4470k = pendingIntent;
        this.f4471l = pendingIntent2;
        this.f4472m = pendingIntent3;
        this.f4473n = pendingIntent4;
    }

    public final int a() {
        return this.f4464b;
    }

    public final long b() {
        return this.f4468i;
    }

    public final long c() {
        return this.f4466g;
    }

    public final long d() {
        return this.f4469j;
    }

    @Nullable
    public final Integer e() {
        return this.f4465e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.m()) && this.f4464b == aVar.a() && this.c == aVar.o() && this.d == aVar.l() && ((num = this.f4465e) != null ? num.equals(aVar.e()) : aVar.e() == null) && this.f == aVar.p() && this.f4466g == aVar.c() && this.f4467h == aVar.n() && this.f4468i == aVar.b() && this.f4469j == aVar.d() && ((pendingIntent = this.f4470k) != null ? pendingIntent.equals(aVar.f()) : aVar.f() == null) && ((pendingIntent2 = this.f4471l) != null ? pendingIntent2.equals(aVar.g()) : aVar.g() == null) && ((pendingIntent3 = this.f4472m) != null ? pendingIntent3.equals(aVar.h()) : aVar.h() == null)) {
                PendingIntent pendingIntent4 = this.f4473n;
                PendingIntent i2 = aVar.i();
                if (pendingIntent4 != null ? pendingIntent4.equals(i2) : i2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final PendingIntent f() {
        return this.f4470k;
    }

    @Nullable
    public final PendingIntent g() {
        return this.f4471l;
    }

    @Nullable
    public final PendingIntent h() {
        return this.f4472m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4464b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        Integer num = this.f4465e;
        int i2 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i3 = this.f;
        long j2 = this.f4466g;
        long j3 = this.f4467h;
        long j4 = this.f4468i;
        long j5 = this.f4469j;
        int i4 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        PendingIntent pendingIntent = this.f4470k;
        int hashCode3 = (i4 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f4471l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f4472m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f4473n;
        if (pendingIntent4 != null) {
            i2 = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    @Nullable
    public final PendingIntent i() {
        return this.f4473n;
    }

    public final int l() {
        return this.d;
    }

    @NonNull
    public final String m() {
        return this.a;
    }

    public final long n() {
        return this.f4467h;
    }

    public final int o() {
        return this.c;
    }

    public final int p() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.f4464b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.f4465e);
        int i5 = this.f;
        long j2 = this.f4466g;
        long j3 = this.f4467h;
        long j4 = this.f4468i;
        long j5 = this.f4469j;
        String valueOf2 = String.valueOf(this.f4470k);
        long j6 = j5;
        String valueOf3 = String.valueOf(this.f4471l);
        String valueOf4 = String.valueOf(this.f4472m);
        long j7 = j4;
        String valueOf5 = String.valueOf(this.f4473n);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i2);
        sb.append(", updateAvailability=");
        sb.append(i3);
        sb.append(", installStatus=");
        sb.append(i4);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i5);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", additionalSpaceRequired=");
        sb.append(j7);
        sb.append(", assetPackStorageSize=");
        sb.append(j6);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        a.L(sb, ", flexibleUpdateIntent=", valueOf3, ", immediateDestructiveUpdateIntent=", valueOf4);
        return a.r(sb, ", flexibleDestructiveUpdateIntent=", valueOf5, "}");
    }
}
