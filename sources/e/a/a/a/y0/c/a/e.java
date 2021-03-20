package e.a.a.a.y0.c.a;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final e f8318j = new e(-1, -1);

    /* renamed from: k  reason: collision with root package name */
    public static final a f8319k = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final int f8320h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8321i;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public e(int i2, int i3) {
        this.f8320h = i2;
        this.f8321i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8320h == eVar.f8320h && this.f8321i == eVar.f8321i;
    }

    public int hashCode() {
        return (this.f8320h * 31) + this.f8321i;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Position(line=");
        y.append(this.f8320h);
        y.append(", column=");
        return b.e.a.a.a.o(y, this.f8321i, ")");
    }
}
