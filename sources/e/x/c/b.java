package e.x.c;

import e.a.d;
import e.a.g;
import e.a.k;
import e.a.n;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

public abstract class b implements d, Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f7970n = 0;

    /* renamed from: h  reason: collision with root package name */
    public transient d f7971h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f7972i;

    /* renamed from: j  reason: collision with root package name */
    public final Class f7973j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7974k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7975l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f7976m;

    public static class a implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7977h = new a();
    }

    public b() {
        this.f7972i = a.f7977h;
        this.f7973j = null;
        this.f7974k = null;
        this.f7975l = null;
        this.f7976m = false;
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f7972i = obj;
        this.f7973j = cls;
        this.f7974k = str;
        this.f7975l = str2;
        this.f7976m = z;
    }

    public abstract d B();

    public String D() {
        return this.f7975l;
    }

    public d e() {
        d dVar = this.f7971h;
        if (dVar != null) {
            return dVar;
        }
        d r = r();
        this.f7971h = r;
        return r;
    }

    public n f() {
        return B().f();
    }

    public List<k> g() {
        return B().g();
    }

    public String getName() {
        return this.f7974k;
    }

    public List<Annotation> k() {
        return B().k();
    }

    public Object o(Map map) {
        return B().o(map);
    }

    public abstract d r();

    public g u() {
        Class cls = this.f7973j;
        if (cls == null) {
            return null;
        }
        if (this.f7976m) {
            return v.a.c(cls, "");
        }
        return v.a(cls);
    }
}
