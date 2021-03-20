package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.t;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

public class o implements m {

    /* renamed from: b  reason: collision with root package name */
    public final Object f745b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f746e;
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final m f747g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, t<?>> f748h;

    /* renamed from: i  reason: collision with root package name */
    public final p f749i;

    /* renamed from: j  reason: collision with root package name */
    public int f750j;

    public o(Object obj, m mVar, int i2, int i3, Map<Class<?>, t<?>> map, Class<?> cls, Class<?> cls2, p pVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f745b = obj;
        Objects.requireNonNull(mVar, "Signature must not be null");
        this.f747g = mVar;
        this.c = i2;
        this.d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f748h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f746e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f = cls2;
        Objects.requireNonNull(pVar, "Argument must not be null");
        this.f749i = pVar;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f745b.equals(oVar.f745b) && this.f747g.equals(oVar.f747g) && this.d == oVar.d && this.c == oVar.c && this.f748h.equals(oVar.f748h) && this.f746e.equals(oVar.f746e) && this.f.equals(oVar.f) && this.f749i.equals(oVar.f749i);
    }

    public int hashCode() {
        if (this.f750j == 0) {
            int hashCode = this.f745b.hashCode();
            this.f750j = hashCode;
            int hashCode2 = this.f747g.hashCode() + (hashCode * 31);
            this.f750j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.f750j = i2;
            int i3 = (i2 * 31) + this.d;
            this.f750j = i3;
            int hashCode3 = this.f748h.hashCode() + (i3 * 31);
            this.f750j = hashCode3;
            int hashCode4 = this.f746e.hashCode() + (hashCode3 * 31);
            this.f750j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.f750j = hashCode5;
            this.f750j = this.f749i.hashCode() + (hashCode5 * 31);
        }
        return this.f750j;
    }

    public String toString() {
        StringBuilder y = a.y("EngineKey{model=");
        y.append(this.f745b);
        y.append(", width=");
        y.append(this.c);
        y.append(", height=");
        y.append(this.d);
        y.append(", resourceClass=");
        y.append(this.f746e);
        y.append(", transcodeClass=");
        y.append(this.f);
        y.append(", signature=");
        y.append(this.f747g);
        y.append(", hashCode=");
        y.append(this.f750j);
        y.append(", transformations=");
        y.append(this.f748h);
        y.append(", options=");
        y.append(this.f749i);
        y.append('}');
        return y.toString();
    }
}
