package e.a.a.a;

import e.a.a.a.n;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.d.b.w.a;
import e.a.a.a.y0.e.a0.b.f;
import e.a.a.a.y0.e.a0.b.g;
import e.a.a.a.y0.e.a0.b.h;
import e.a.a.a.y0.e.t;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.j.y.i;
import e.a.l;
import e.j;
import e.t.o;
import e.x.b.p;
import e.x.c.k;
import e.x.c.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class v extends n {

    /* renamed from: j  reason: collision with root package name */
    public final o0<a> f7587j;

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f7588k;

    public final class a extends n.a {

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ l[] f7589i;
        public final n0 d = b.q.a.a.k2(new C0132a(this));

        /* renamed from: e  reason: collision with root package name */
        public final n0 f7590e = b.q.a.a.k2(new e(this));
        public final o0 f = b.q.a.a.i2(new d(this));

        /* renamed from: g  reason: collision with root package name */
        public final o0 f7591g = b.q.a.a.i2(new c(this));

        /* renamed from: e.a.a.a.v$a$a  reason: collision with other inner class name */
        public static final class C0132a extends k implements e.x.b.a<e.a.a.a.y0.b.d1.a.e> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7593h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0132a(a aVar) {
                super(0);
                this.f7593h = aVar;
            }

            public Object e() {
                return e.a.a.a.y0.b.d1.a.e.e(v.this.f7588k);
            }
        }

        public static final class b extends k implements e.x.b.a<Collection<? extends g<?>>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7594h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(a aVar) {
                super(0);
                this.f7594h = aVar;
            }

            public Object e() {
                a aVar = this.f7594h;
                v vVar = v.this;
                n0 n0Var = aVar.f7590e;
                l lVar = a.f7589i[1];
                return vVar.D((i) n0Var.e(), n.b.DECLARED);
            }
        }

        public static final class c extends k implements e.x.b.a<e.n<? extends g, ? extends e.a.a.a.y0.e.l, ? extends f>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7595h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(a aVar) {
                super(0);
                this.f7595h = aVar;
            }

            public Object e() {
                e.a.a.a.y0.d.b.w.a aVar;
                e.a.a.a.y0.b.d1.a.e a = a.a(this.f7595h);
                if (a == null || (aVar = a.f8283b) == null) {
                    return null;
                }
                String[] strArr = aVar.c;
                String[] strArr2 = aVar.f8659e;
                if (strArr == null || strArr2 == null) {
                    return null;
                }
                j<g, e.a.a.a.y0.e.l> g2 = h.g(strArr, strArr2);
                return new e.n((g) g2.f7906h, (e.a.a.a.y0.e.l) g2.f7907i, aVar.f8658b);
            }
        }

        public static final class d extends k implements e.x.b.a<Class<?>> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7596h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(a aVar) {
                super(0);
                this.f7596h = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
                r0 = r0.f8283b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object e() {
                /*
                    r6 = this;
                    e.a.a.a.v$a r0 = r6.f7596h
                    e.a.a.a.y0.b.d1.a.e r0 = e.a.a.a.v.a.a(r0)
                    r1 = 0
                    if (r0 == 0) goto L_0x0012
                    e.a.a.a.y0.d.b.w.a r0 = r0.f8283b
                    if (r0 == 0) goto L_0x0012
                    java.lang.String r0 = r0.a()
                    goto L_0x0013
                L_0x0012:
                    r0 = r1
                L_0x0013:
                    if (r0 == 0) goto L_0x0038
                    int r2 = r0.length()
                    r3 = 0
                    if (r2 <= 0) goto L_0x001e
                    r2 = 1
                    goto L_0x001f
                L_0x001e:
                    r2 = r3
                L_0x001f:
                    if (r2 == 0) goto L_0x0038
                    e.a.a.a.v$a r1 = r6.f7596h
                    e.a.a.a.v r1 = e.a.a.a.v.this
                    java.lang.Class<?> r1 = r1.f7588k
                    java.lang.ClassLoader r1 = r1.getClassLoader()
                    r2 = 47
                    r4 = 46
                    r5 = 4
                    java.lang.String r0 = e.c0.h.v(r0, r2, r4, r3, r5)
                    java.lang.Class r1 = r1.loadClass(r0)
                L_0x0038:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.v.a.d.e():java.lang.Object");
            }
        }

        public static final class e extends k implements e.x.b.a<i> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f7597h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(a aVar) {
                super(0);
                this.f7597h = aVar;
            }

            public Object e() {
                List<e.a.a.a.y0.d.b.l> list;
                e.a.a.a.y0.b.d1.a.e a = a.a(this.f7597h);
                if (a == null) {
                    return i.b.f9460b;
                }
                n0 n0Var = this.f7597h.a;
                boolean z = false;
                l lVar = n.a.c[0];
                e.a.a.a.y0.b.d1.a.a aVar = ((e.a.a.a.y0.b.d1.a.i) n0Var.e()).f8286b;
                Objects.requireNonNull(aVar);
                e.x.c.i.e(a, "fileClass");
                ConcurrentHashMap<e.a.a.a.y0.f.a, i> concurrentHashMap = aVar.a;
                e.a.a.a.y0.f.a g2 = a.g();
                Object obj = concurrentHashMap.get(g2);
                if (obj == null) {
                    e.a.a.a.y0.f.b h2 = a.g().h();
                    e.x.c.i.d(h2, "fileClass.classId.packageFqName");
                    e.a.a.a.y0.d.b.w.a aVar2 = a.f8283b;
                    a.C0184a aVar3 = aVar2.a;
                    a.C0184a aVar4 = a.C0184a.f8665m;
                    if (aVar3 == aVar4) {
                        String[] strArr = aVar2.c;
                        if (aVar3 == aVar4) {
                            z = true;
                        }
                        List<String> list2 = null;
                        if (!z) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            list2 = e.t.g.c(strArr);
                        }
                        if (list2 == null) {
                            list2 = o.f7934h;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String d : list2) {
                            e.a.a.a.y0.j.w.b d2 = e.a.a.a.y0.j.w.b.d(d);
                            e.x.c.i.d(d2, "JvmClassName.byInternalName(partName)");
                            e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(d2.a.replace('/', '.')));
                            e.x.c.i.d(l2, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                            e.a.a.a.y0.d.b.l n0 = b.q.a.a.n0(aVar.c, l2);
                            if (n0 != null) {
                                arrayList.add(n0);
                            }
                        }
                        list = arrayList;
                    } else {
                        list = b.q.a.a.l2(a);
                    }
                    e.a.a.a.y0.b.c1.o oVar = new e.a.a.a.y0.b.c1.o(aVar.f8281b.b().c, h2);
                    ArrayList arrayList2 = new ArrayList();
                    for (e.a.a.a.y0.d.b.l a2 : list) {
                        i a3 = aVar.f8281b.a(oVar, a2);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    }
                    obj = e.a.a.a.y0.j.y.b.h("package " + h2 + " (" + a + ')', e.t.g.W(arrayList2));
                    i putIfAbsent = concurrentHashMap.putIfAbsent(g2, obj);
                    if (putIfAbsent != null) {
                        obj = putIfAbsent;
                    }
                }
                e.x.c.i.d(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                return (i) obj;
            }
        }

        static {
            Class<a> cls = a.class;
            f7589i = new l[]{e.x.c.v.c(new q(e.x.c.v.a(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), e.x.c.v.c(new q(e.x.c.v.a(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), e.x.c.v.c(new q(e.x.c.v.a(cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), e.x.c.v.c(new q(e.x.c.v.a(cls), "metadata", "getMetadata()Lkotlin/Triple;")), e.x.c.v.c(new q(e.x.c.v.a(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public a() {
            super();
            b.q.a.a.k2(new b(this));
        }

        public static final e.a.a.a.y0.b.d1.a.e a(a aVar) {
            n0 n0Var = aVar.d;
            l lVar = f7589i[0];
            return (e.a.a.a.y0.b.d1.a.e) n0Var.e();
        }
    }

    public static final class b extends k implements e.x.b.a<a> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ v f7598h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v vVar) {
            super(0);
            this.f7598h = vVar;
        }

        public Object e() {
            return new a();
        }
    }

    public static final /* synthetic */ class c extends e.x.c.g implements p<e.a.a.a.y0.k.b.v, e.a.a.a.y0.e.n, f0> {

        /* renamed from: q  reason: collision with root package name */
        public static final c f7599q = new c();

        public c() {
            super(2);
        }

        public final String D() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        public final String getName() {
            return "loadProperty";
        }

        public Object invoke(Object obj, Object obj2) {
            e.a.a.a.y0.k.b.v vVar = (e.a.a.a.y0.k.b.v) obj;
            e.a.a.a.y0.e.n nVar = (e.a.a.a.y0.e.n) obj2;
            e.x.c.i.e(vVar, "p1");
            e.x.c.i.e(nVar, "p2");
            return vVar.j(nVar);
        }

        public final e.a.g u() {
            return e.x.c.v.a(e.a.a.a.y0.k.b.v.class);
        }
    }

    public v(Class<?> cls, String str) {
        e.x.c.i.e(cls, "jClass");
        this.f7588k = cls;
        o0<a> i2 = b.q.a.a.i2(new b(this));
        e.x.c.i.d(i2, "ReflectProperties.lazy { Data() }");
        this.f7587j = i2;
    }

    public Collection<s> B(d dVar) {
        e.x.c.i.e(dVar, "name");
        return M().a(dVar, e.a.a.a.y0.c.a.d.FROM_REFLECTION);
    }

    public f0 C(int i2) {
        o0 o0Var = this.f7587j.e().f7591g;
        l lVar = a.f7589i[3];
        e.n nVar = (e.n) o0Var.e();
        if (nVar != null) {
            g gVar = (g) nVar.f7915h;
            e.a.a.a.y0.e.l lVar2 = (e.a.a.a.y0.e.l) nVar.f7916i;
            f fVar = (f) nVar.f7917j;
            h.f<e.a.a.a.y0.e.l, List<e.a.a.a.y0.e.n>> fVar2 = e.a.a.a.y0.e.a0.a.f8691n;
            e.x.c.i.d(fVar2, "JvmProtoBuf.packageLocalVariable");
            e.a.a.a.y0.e.n nVar2 = (e.a.a.a.y0.e.n) b.q.a.a.J0(lVar2, fVar2, i2);
            if (nVar2 != null) {
                Class<?> cls = this.f7588k;
                t tVar = lVar2.f8958n;
                e.x.c.i.d(tVar, "packageProto.typeTable");
                return (f0) v0.f(cls, nVar2, gVar, new e(tVar), fVar, c.f7599q);
            }
        }
        return null;
    }

    public Class<?> E() {
        o0 o0Var = this.f7587j.e().f;
        l lVar = a.f7589i[2];
        Class<?> cls = (Class) o0Var.e();
        return cls != null ? cls : this.f7588k;
    }

    public Collection<f0> F(d dVar) {
        e.x.c.i.e(dVar, "name");
        return M().d(dVar, e.a.a.a.y0.c.a.d.FROM_REFLECTION);
    }

    public final i M() {
        n0 n0Var = this.f7587j.e().f7590e;
        l lVar = a.f7589i[1];
        return (i) n0Var.e();
    }

    public Class<?> e() {
        return this.f7588k;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && e.x.c.i.a(this.f7588k, ((v) obj).f7588k);
    }

    public int hashCode() {
        return this.f7588k.hashCode();
    }

    public Collection<e.a.a.a.y0.b.j> s() {
        return o.f7934h;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("file class ");
        y.append(e.a.a.a.y0.b.d1.b.b.b(this.f7588k).b());
        return y.toString();
    }
}
