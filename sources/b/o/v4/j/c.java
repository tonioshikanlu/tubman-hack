package b.o.v4.j;

import androidx.annotation.Nullable;
import b.e.a.a.a;

public class c {
    @Nullable
    public d a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public d f6336b;

    public c(@Nullable d dVar, @Nullable d dVar2) {
        this.a = dVar;
        this.f6336b = dVar2;
    }

    public String toString() {
        StringBuilder y = a.y("OSOutcomeSource{directBody=");
        y.append(this.a);
        y.append(", indirectBody=");
        y.append(this.f6336b);
        y.append('}');
        return y.toString();
    }
}
