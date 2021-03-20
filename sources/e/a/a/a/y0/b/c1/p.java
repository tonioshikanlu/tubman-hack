package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.j.y.j;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.g;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.n;
import e.a.a.a.y0.m.v0;
import e.r;
import e.x.b.l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class p extends j {

    /* renamed from: o  reason: collision with root package name */
    public final v0 f8230o;

    /* renamed from: p  reason: collision with root package name */
    public final i f8231p;

    /* renamed from: q  reason: collision with root package name */
    public final e.a.a.a.y0.l.i<Set<d>> f8232q;
    public final h r;

    public class a extends j {

        /* renamed from: b  reason: collision with root package name */
        public final g<e.a.a.a.y0.f.d, Collection<? extends l0>> f8233b;
        public final g<e.a.a.a.y0.f.d, Collection<? extends f0>> c;
        public final e.a.a.a.y0.l.i<Collection<k>> d;

        /* renamed from: e.a.a.a.y0.b.c1.p$a$a  reason: collision with other inner class name */
        public class C0167a implements l<e.a.a.a.y0.f.d, Collection<? extends l0>> {
            public C0167a(p pVar) {
            }

            public Object invoke(Object obj) {
                e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.j(dVar, aVar.i().a(dVar, e.a.a.a.y0.c.a.d.FOR_NON_TRACKED_SCOPE));
                }
                a.h(8);
                throw null;
            }
        }

        public class b implements l<e.a.a.a.y0.f.d, Collection<? extends f0>> {
            public b(p pVar) {
            }

            public Object invoke(Object obj) {
                e.a.a.a.y0.f.d dVar = (e.a.a.a.y0.f.d) obj;
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                if (dVar != null) {
                    return aVar.j(dVar, aVar.i().d(dVar, e.a.a.a.y0.c.a.d.FOR_NON_TRACKED_SCOPE));
                }
                a.h(4);
                throw null;
            }
        }

        public class c implements e.x.b.a<Collection<k>> {
            public c(p pVar) {
            }

            public Object e() {
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                HashSet hashSet = new HashSet();
                for (e.a.a.a.y0.f.d dVar : (Set) p.this.f8232q.e()) {
                    if (dVar != null) {
                        Collection collection = (Collection) ((e.m) aVar.f8233b).invoke(dVar);
                        if (collection != null) {
                            hashSet.addAll(collection);
                            Collection collection2 = (Collection) ((e.m) aVar.c).invoke(dVar);
                            if (collection2 != null) {
                                hashSet.addAll(collection2);
                            } else {
                                a.h(3);
                                throw null;
                            }
                        } else {
                            a.h(7);
                            throw null;
                        }
                    } else {
                        a.h(5);
                        throw null;
                    }
                }
                return hashSet;
            }
        }

        public class d extends e.a.a.a.y0.j.j {
            public final /* synthetic */ Set a;

            public d(a aVar, Set set) {
                this.a = set;
            }

            public static /* synthetic */ void f(int i2) {
                Object[] objArr = new Object[3];
                if (i2 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i2 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i2 == 1 || i2 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public void a(e.a.a.a.y0.b.b bVar) {
                if (bVar != null) {
                    e.a.a.a.y0.j.l.r(bVar, (l<e.a.a.a.y0.b.b, r>) null);
                    this.a.add(bVar);
                    return;
                }
                f(0);
                throw null;
            }

            public void e(e.a.a.a.y0.b.b bVar, e.a.a.a.y0.b.b bVar2) {
            }
        }

        public a(m mVar) {
            this.f8233b = mVar.h(new C0167a(p.this));
            this.c = mVar.h(new b(p.this));
            this.d = mVar.a(new c(p.this));
        }

        public static /* synthetic */ void h(int i2) {
            String str;
            int i3;
            Throwable th;
            if (!(i2 == 3 || i2 == 7 || i2 == 9 || i2 == 12)) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i2 == 3 || i2 == 7 || i2 == 9 || i2 == 12)) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i3 = 3;
                        break;
                }
            }
            i3 = 2;
            Object[] objArr = new Object[i3];
            switch (i2) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i2 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i2 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i2 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i2 != 12) {
                switch (i2) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i2 == 3 || i2 == 7 || i2 == 9 || i2 == 12)) {
                switch (i2) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public Collection<? extends l0> a(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends l0> collection = (Collection) ((e.m) this.f8233b).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                h(7);
                throw null;
            } else {
                h(6);
                throw null;
            }
        }

        public Collection<k> c(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
            if (dVar == null) {
                h(13);
                throw null;
            } else if (lVar != null) {
                Collection<k> collection = (Collection) this.d.e();
                if (collection != null) {
                    return collection;
                }
                h(15);
                throw null;
            } else {
                h(14);
                throw null;
            }
        }

        public Collection<? extends f0> d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends f0> collection = (Collection) ((e.m) this.c).invoke(dVar);
                if (collection != null) {
                    return collection;
                }
                h(3);
                throw null;
            } else {
                h(2);
                throw null;
            }
        }

        public Set<e.a.a.a.y0.f.d> e() {
            Set<e.a.a.a.y0.f.d> set = (Set) p.this.f8232q.e();
            if (set != null) {
                return set;
            }
            h(17);
            throw null;
        }

        public Set<e.a.a.a.y0.f.d> f() {
            Set<e.a.a.a.y0.f.d> set = (Set) p.this.f8232q.e();
            if (set != null) {
                return set;
            }
            h(19);
            throw null;
        }

        public Set<e.a.a.a.y0.f.d> g() {
            Set<e.a.a.a.y0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(18);
            throw null;
        }

        public final i i() {
            i z = p.this.p().h().iterator().next().z();
            if (z != null) {
                return z;
            }
            h(9);
            throw null;
        }

        public final <D extends e.a.a.a.y0.b.b> Collection<? extends D> j(e.a.a.a.y0.f.d dVar, Collection<? extends D> collection) {
            if (dVar == null) {
                h(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e.a.a.a.y0.j.l.d.h(dVar, collection, Collections.emptySet(), p.this, new d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                h(11);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(m mVar, e.a.a.a.y0.b.e eVar, d0 d0Var, d dVar, e.a.a.a.y0.l.i<Set<d>> iVar, h hVar, m0 m0Var) {
        super(mVar, eVar, dVar, m0Var, false);
        if (mVar == null) {
            j0(6);
            throw null;
        } else if (d0Var == null) {
            j0(8);
            throw null;
        } else if (dVar == null) {
            j0(9);
            throw null;
        } else if (iVar == null) {
            j0(10);
            throw null;
        } else if (hVar == null) {
            j0(11);
            throw null;
        } else if (m0Var != null) {
            this.r = hVar;
            this.f8230o = new n(this, Collections.emptyList(), Collections.singleton(d0Var), mVar);
            this.f8231p = new a(mVar);
            this.f8232q = iVar;
        } else {
            j0(12);
            throw null;
        }
    }

    public static p K0(m mVar, e.a.a.a.y0.b.e eVar, d dVar, e.a.a.a.y0.l.i<Set<d>> iVar, h hVar, m0 m0Var) {
        if (mVar == null) {
            j0(0);
            throw null;
        } else if (eVar == null) {
            j0(1);
            throw null;
        } else if (iVar == null) {
            j0(3);
            throw null;
        } else if (m0Var != null) {
            return new p(mVar, eVar, eVar.s(), dVar, iVar, hVar, m0Var);
        } else {
            j0(5);
            throw null;
        }
    }

    public static /* synthetic */ void j0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public List<r0> A() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(22);
        throw null;
    }

    public e.a.a.a.y0.b.e B0() {
        return null;
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

    public i e0(f fVar) {
        if (fVar != null) {
            i iVar = this.f8231p;
            if (iVar != null) {
                return iVar;
            }
            j0(14);
            throw null;
        }
        j0(13);
        throw null;
    }

    public Collection<e.a.a.a.y0.b.e> g0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(23);
        throw null;
    }

    public z0 getVisibility() {
        z0 z0Var = y0.f7850e;
        if (z0Var != null) {
            return z0Var;
        }
        j0(20);
        throw null;
    }

    public e.a.a.a.y0.b.f i() {
        return e.a.a.a.y0.b.f.ENUM_ENTRY;
    }

    public h k() {
        h hVar = this.r;
        if (hVar != null) {
            return hVar;
        }
        j0(21);
        throw null;
    }

    public boolean l() {
        return false;
    }

    public boolean m0() {
        return false;
    }

    public v0 p() {
        v0 v0Var = this.f8230o;
        if (v0Var != null) {
            return v0Var;
        }
        j0(17);
        throw null;
    }

    public v q() {
        return v.FINAL;
    }

    public Collection<e.a.a.a.y0.b.d> r() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(16);
        throw null;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("enum entry ");
        y.append(getName());
        return y.toString();
    }

    public e.a.a.a.y0.b.d x0() {
        return null;
    }

    public i y0() {
        return i.b.f9460b;
    }
}
