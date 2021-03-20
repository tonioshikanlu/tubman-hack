package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.f0.a;
import b.l.e.k;
import com.google.android.material.badge.BadgeDrawable;

public class s implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Class f5513h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Class f5514i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f5515j;

    public s(Class cls, Class cls2, b0 b0Var) {
        this.f5513h = cls;
        this.f5514i = cls2;
        this.f5515j = b0Var;
    }

    public <T> b0<T> a(k kVar, a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.f5513h || cls == this.f5514i) {
            return this.f5515j;
        }
        return null;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Factory[type=");
        b.e.a.a.a.I(this.f5513h, y, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        b.e.a.a.a.I(this.f5514i, y, ",adapter=");
        y.append(this.f5515j);
        y.append("]");
        return y.toString();
    }
}
