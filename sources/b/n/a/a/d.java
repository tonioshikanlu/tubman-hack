package b.n.a.a;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.e.a.a.a;
import b.h.a.m.v.w;
import b.i.a.f;
import b.l.f.x.a.g;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d implements w<f> {

    /* renamed from: h  reason: collision with root package name */
    public final f f5979h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5980i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5981j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5982k;

    public d(@NonNull f fVar, @IntRange(from = 1) int i2, @IntRange(from = 1) int i3, @IntRange(from = 0) int i4) {
        g.p(fVar);
        this.f5979h = fVar;
        this.f5980i = i2;
        this.f5981j = i3;
        this.f5982k = i4;
    }

    public int a() {
        return this.f5982k;
    }

    @NonNull
    public Class<f> b() {
        return f.class;
    }

    @NonNull
    public Object get() {
        return this.f5979h;
    }

    public void recycle() {
    }

    public String toString() {
        StringBuilder y = a.y("SvgResource{width=");
        y.append(this.f5980i);
        y.append(", height=");
        y.append(this.f5981j);
        y.append(", size=");
        y.append(this.f5982k);
        y.append('}');
        return y.toString();
    }
}
