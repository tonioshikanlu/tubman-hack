package b.l.a.c.i.b;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;

public final class l3 {
    @NonNull
    public final String a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final String f4111b;
    public final long c;
    @NonNull
    public final Bundle d;

    public l3(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j2) {
        this.a = str;
        this.f4111b = str2;
        this.d = bundle;
        this.c = j2;
    }

    public static l3 a(s sVar) {
        return new l3(sVar.f4248h, sVar.f4250j, sVar.f4249i.Z(), sVar.f4251k);
    }

    public final s b() {
        return new s(this.a, new q(new Bundle(this.d)), this.f4111b, this.c);
    }

    public final String toString() {
        String str = this.f4111b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        a.L(sb, "origin=", str, ",name=", str2);
        return a.q(sb, ",params=", valueOf);
    }
}
