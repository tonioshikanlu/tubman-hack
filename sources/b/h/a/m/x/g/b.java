package b.h.a.m.x.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.l.a;
import b.h.a.m.v.c0.d;

public final class b implements a.C0019a {
    public final d a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final b.h.a.m.v.c0.b f898b;

    public b(d dVar, @Nullable b.h.a.m.v.c0.b bVar) {
        this.a = dVar;
        this.f898b = bVar;
    }

    @NonNull
    public byte[] a(int i2) {
        b.h.a.m.v.c0.b bVar = this.f898b;
        return bVar == null ? new byte[i2] : (byte[]) bVar.e(i2, byte[].class);
    }
}
