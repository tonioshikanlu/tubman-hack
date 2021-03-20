package e.a.a.a.y0.a.o;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.a.k;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.m0;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.v0;
import e.r;
import e.t.o;
import e.t.u;
import e.x.b.p;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends e.a.a.a.y0.b.c1.b {
    public static final e.a.a.a.y0.f.a s = new e.a.a.a.y0.f.a(g.f, d.l("Function"));
    public static final e.a.a.a.y0.f.a t = new e.a.a.a.y0.f.a(k.a, d.l("KFunction"));

    /* renamed from: l  reason: collision with root package name */
    public final C0138b f7693l = new C0138b();

    /* renamed from: m  reason: collision with root package name */
    public final c f7694m;

    /* renamed from: n  reason: collision with root package name */
    public final List<r0> f7695n;

    /* renamed from: o  reason: collision with root package name */
    public final m f7696o;

    /* renamed from: p  reason: collision with root package name */
    public final y f7697p;

    /* renamed from: q  reason: collision with root package name */
    public final c f7698q;
    public final int r;

    public static final class a extends e.x.c.k implements p<j1, String, r> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b f7699h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f7700i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, ArrayList arrayList) {
            super(2);
            this.f7699h = bVar;
            this.f7700i = arrayList;
        }

        public final void a(j1 j1Var, String str) {
            i.e(j1Var, "variance");
            i.e(str, "name");
            ArrayList arrayList = this.f7700i;
            b bVar = this.f7699h;
            Objects.requireNonNull(h.f7785e);
            arrayList.add(m0.W0(bVar, h.a.a, false, j1Var, d.l(str), this.f7700i.size(), this.f7699h.f7696o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((j1) obj, (String) obj2);
            return r.a;
        }
    }

    /* renamed from: e.a.a.a.y0.a.o.b$b  reason: collision with other inner class name */
    public final class C0138b extends e.a.a.a.y0.m.b {
        public C0138b() {
            super(b.this.f7696o);
        }

        public boolean b() {
            return true;
        }

        public e.a.a.a.y0.b.h d() {
            return b.this;
        }

        public Collection<d0> f() {
            List<e.a.a.a.y0.f.a> list;
            List<T> list2;
            int ordinal = b.this.f7698q.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                list = b.q.a.a.l2(b.s);
            } else if (ordinal == 2) {
                list = e.t.g.B(b.t, new e.a.a.a.y0.f.a(g.f, c.Function.d(b.this.r)));
            } else if (ordinal == 3) {
                list = e.t.g.B(b.t, new e.a.a.a.y0.f.a(e.a.a.a.y0.j.g.c, c.SuspendFunction.d(b.this.r)));
            } else {
                throw new e.h();
            }
            w b2 = b.this.f7697p.b();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
            for (e.a.a.a.y0.f.a aVar : list) {
                e l0 = b.q.a.a.l0(b2, aVar);
                if (l0 != null) {
                    List<r0> list3 = b.this.f7695n;
                    v0 p2 = l0.p();
                    i.d(p2, "descriptor.typeConstructor");
                    int size = p2.g().size();
                    i.e(list3, "$this$takeLast");
                    if (size >= 0) {
                        if (size == 0) {
                            list2 = o.f7934h;
                        } else {
                            int size2 = list3.size();
                            if (size >= size2) {
                                list2 = e.t.g.W(list3);
                            } else if (size == 1) {
                                list2 = b.q.a.a.l2(e.t.g.z(list3));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list3 instanceof RandomAccess) {
                                    for (int i2 = size2 - size; i2 < size2; i2++) {
                                        arrayList2.add(list3.get(i2));
                                    }
                                } else {
                                    ListIterator<r0> listIterator = list3.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                list2 = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(b.q.a.a.C(list2, 10));
                        for (T s : list2) {
                            arrayList3.add(new a1(s.s()));
                        }
                        Objects.requireNonNull(h.f7785e);
                        arrayList.add(e0.e(h.a.a, l0, arrayList3));
                    } else {
                        throw new IllegalArgumentException(b.e.a.a.a.h("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + aVar + " not found").toString());
                }
            }
            return e.t.g.W(arrayList);
        }

        public List<r0> g() {
            return b.this.f7695n;
        }

        public p0 k() {
            return p0.a.a;
        }

        public e o() {
            return b.this;
        }

        public String toString() {
            return b.this.toString();
        }
    }

    public enum c {
        Function(r2, "Function"),
        SuspendFunction(r2, "SuspendFunction"),
        KFunction(r2, "KFunction"),
        KSuspendFunction(r2, "KSuspendFunction");
        

        /* renamed from: o  reason: collision with root package name */
        public static final a f7706o = null;

        /* renamed from: h  reason: collision with root package name */
        public final e.a.a.a.y0.f.b f7707h;

        /* renamed from: i  reason: collision with root package name */
        public final String f7708i;

        public static final class a {
            public a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            f7706o = new a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        c(e.a.a.a.y0.f.b bVar, String str) {
            this.f7707h = bVar;
            this.f7708i = str;
        }

        public final d d(int i2) {
            d l2 = d.l(this.f7708i + i2);
            i.d(l2, "Name.identifier(\"$classNamePrefix$arity\")");
            return l2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(m mVar, y yVar, c cVar, int i2) {
        super(mVar, cVar.d(i2));
        i.e(mVar, "storageManager");
        i.e(yVar, "containingDeclaration");
        i.e(cVar, "functionKind");
        this.f7696o = mVar;
        this.f7697p = yVar;
        this.f7698q = cVar;
        this.r = i2;
        this.f7694m = new c(mVar, this);
        ArrayList arrayList = new ArrayList();
        a aVar = new a(this, arrayList);
        e.a0.d dVar = new e.a0.d(1, i2);
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(dVar, 10));
        Iterator it = dVar.iterator();
        while (((e.a0.c) it).f7887i) {
            int nextInt = ((u) it).nextInt();
            j1 j1Var = j1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(nextInt);
            aVar.a(j1Var, sb.toString());
            arrayList2.add(r.a);
        }
        aVar.a(j1.OUT_VARIANCE, "R");
        this.f7695n = e.t.g.W(arrayList);
    }

    public List<r0> A() {
        return this.f7695n;
    }

    public /* bridge */ /* synthetic */ e B0() {
        return null;
    }

    public boolean J() {
        return false;
    }

    public boolean J0() {
        return false;
    }

    public boolean N() {
        return false;
    }

    public boolean S0() {
        return false;
    }

    public boolean V() {
        return false;
    }

    public e.a.a.a.y0.b.k b() {
        return this.f7697p;
    }

    public e.a.a.a.y0.j.y.i e0(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        return this.f7694m;
    }

    public /* bridge */ /* synthetic */ Collection g0() {
        return o.f7934h;
    }

    public z0 getVisibility() {
        z0 z0Var = y0.f7850e;
        i.d(z0Var, "Visibilities.PUBLIC");
        return z0Var;
    }

    public e.a.a.a.y0.b.f i() {
        return e.a.a.a.y0.b.f.INTERFACE;
    }

    public h k() {
        Objects.requireNonNull(h.f7785e);
        return h.a.a;
    }

    public boolean l() {
        return false;
    }

    public boolean m0() {
        return false;
    }

    public v0 p() {
        return this.f7693l;
    }

    public v q() {
        return v.ABSTRACT;
    }

    public /* bridge */ /* synthetic */ Collection r() {
        return o.f7934h;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        String e2 = getName().e();
        i.d(e2, "name.asString()");
        return e2;
    }

    public e.a.a.a.y0.b.m0 w() {
        e.a.a.a.y0.b.m0 m0Var = e.a.a.a.y0.b.m0.a;
        i.d(m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }

    public /* bridge */ /* synthetic */ e.a.a.a.y0.b.d x0() {
        return null;
    }

    public e.a.a.a.y0.j.y.i y0() {
        return i.b.f9460b;
    }
}
