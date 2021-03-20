package e.a.a.a;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c0;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.k;
import e.a.l;
import e.a.n;
import e.x.c.i;
import e.x.c.q;
import e.x.c.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

public final class w implements k {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ l[] f7600m;

    /* renamed from: h  reason: collision with root package name */
    public final n0 f7601h;

    /* renamed from: i  reason: collision with root package name */
    public final n0 f7602i = b.q.a.a.k2(new a(this));

    /* renamed from: j  reason: collision with root package name */
    public final g<?> f7603j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7604k;

    /* renamed from: l  reason: collision with root package name */
    public final k.a f7605l;

    public static final class a extends e.x.c.k implements e.x.b.a<List<? extends Annotation>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ w f7606h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(0);
            this.f7606h = wVar;
        }

        public Object e() {
            return v0.d(this.f7606h.e());
        }
    }

    public static final class b extends e.x.c.k implements e.x.b.a<Type> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ w f7607h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(w wVar) {
            super(0);
            this.f7607h = wVar;
        }

        public Object e() {
            c0 e2 = this.f7607h.e();
            if (!(e2 instanceof i0) || !i.a(v0.g(this.f7607h.f7603j.D()), e2) || this.f7607h.f7603j.D().i() != b.a.FAKE_OVERRIDE) {
                return this.f7607h.f7603j.u().a().get(this.f7607h.f7604k);
            }
            e.a.a.a.y0.b.k b2 = this.f7607h.f7603j.D().b();
            Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> j2 = v0.j((e) b2);
            if (j2 != null) {
                return j2;
            }
            throw new l0("Cannot determine receiver Java type of inherited declaration: " + e2);
        }
    }

    static {
        Class<w> cls = w.class;
        f7600m = new l[]{v.c(new q(v.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), v.c(new q(v.a(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public w(g<?> gVar, int i2, k.a aVar, e.x.b.a<? extends c0> aVar2) {
        i.e(gVar, "callable");
        i.e(aVar, "kind");
        i.e(aVar2, "computeDescriptor");
        this.f7603j = gVar;
        this.f7604k = i2;
        this.f7605l = aVar;
        this.f7601h = b.q.a.a.k2(aVar2);
    }

    public n d() {
        d0 d = e().d();
        i.d(d, "descriptor.type");
        return new i0(d, new b(this));
    }

    public final c0 e() {
        n0 n0Var = this.f7601h;
        l lVar = f7600m[0];
        return (c0) n0Var.e();
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            return i.a(this.f7603j, wVar.f7603j) && this.f7604k == wVar.f7604k;
        }
    }

    public String getName() {
        c0 e2 = e();
        if (!(e2 instanceof w0)) {
            e2 = null;
        }
        w0 w0Var = (w0) e2;
        if (w0Var == null || w0Var.b().b0()) {
            return null;
        }
        d name = w0Var.getName();
        i.d(name, "valueParameter.name");
        if (name.f9211i) {
            return null;
        }
        return name.e();
    }

    public int h() {
        return this.f7604k;
    }

    public int hashCode() {
        return Integer.valueOf(this.f7604k).hashCode() + (this.f7603j.hashCode() * 31);
    }

    public k.a i() {
        return this.f7605l;
    }

    public List<Annotation> k() {
        n0 n0Var = this.f7602i;
        l lVar = f7600m[1];
        return (List) n0Var.e();
    }

    public boolean l() {
        c0 e2 = e();
        return (e2 instanceof w0) && ((w0) e2).R() != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            e.a.a.a.r0 r0 = e.a.a.a.r0.f7577b
            java.lang.String r0 = "parameter"
            e.x.c.i.e(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            e.a.k$a r1 = r3.f7605l
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x003a
            r2 = 1
            if (r1 == r2) goto L_0x0037
            r2 = 2
            if (r1 == r2) goto L_0x001b
            goto L_0x003f
        L_0x001b:
            java.lang.String r1 = "parameter #"
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            int r2 = r3.f7604k
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x003c
        L_0x0037:
            java.lang.String r1 = "extension receiver parameter"
            goto L_0x003c
        L_0x003a:
            java.lang.String r1 = "instance parameter"
        L_0x003c:
            r0.append(r1)
        L_0x003f:
            java.lang.String r1 = " of "
            r0.append(r1)
            e.a.a.a.g<?> r1 = r3.f7603j
            e.a.a.a.y0.b.b r1 = r1.D()
            boolean r2 = r1 instanceof e.a.a.a.y0.b.f0
            if (r2 == 0) goto L_0x0055
            e.a.a.a.y0.b.f0 r1 = (e.a.a.a.y0.b.f0) r1
            java.lang.String r1 = e.a.a.a.r0.d(r1)
            goto L_0x005f
        L_0x0055:
            boolean r2 = r1 instanceof e.a.a.a.y0.b.s
            if (r2 == 0) goto L_0x006c
            e.a.a.a.y0.b.s r1 = (e.a.a.a.y0.b.s) r1
            java.lang.String r1 = e.a.a.a.r0.c(r1)
        L_0x005f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            e.x.c.i.d(r0, r1)
            return r0
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Illegal callable: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.w.toString():java.lang.String");
    }

    public boolean z() {
        c0 e2 = e();
        if (!(e2 instanceof w0)) {
            e2 = null;
        }
        w0 w0Var = (w0) e2;
        if (w0Var != null) {
            return e.a.a.a.y0.j.v.b.a(w0Var);
        }
        return false;
    }
}
