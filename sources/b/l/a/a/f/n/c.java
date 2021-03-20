package b.l.a.a.f.n;

import android.content.Context;
import androidx.annotation.NonNull;
import b.l.a.a.f.s.a;
import java.util.Objects;

public final class c extends h {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2493b;
    public final a c;
    public final String d;

    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f2493b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.d = str;
    }

    public Context a() {
        return this.a;
    }

    @NonNull
    public String b() {
        return this.d;
    }

    public a c() {
        return this.c;
    }

    public a d() {
        return this.f2493b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a()) && this.f2493b.equals(hVar.d()) && this.c.equals(hVar.c()) && this.d.equals(hVar.b());
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2493b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("CreationContext{applicationContext=");
        y.append(this.a);
        y.append(", wallClock=");
        y.append(this.f2493b);
        y.append(", monotonicClock=");
        y.append(this.c);
        y.append(", backendName=");
        return b.e.a.a.a.q(y, this.d, "}");
    }
}
