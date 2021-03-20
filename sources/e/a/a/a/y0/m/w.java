package e.a.a.a.y0.m;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.c1.e0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.j.y.i;
import e.t.o;
import e.x.b.l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class w {
    public static final e.a.a.a.y0.b.w a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f9762b;
    public static final k0 c = d("<LOOP IN SUPERTYPES>");
    public static final d0 d;

    /* renamed from: e  reason: collision with root package name */
    public static final f0 f9763e;
    public static final Set<f0> f;

    public static class a implements e.a.a.a.y0.b.w {
        public static /* synthetic */ void c0(int i2) {
            String str = (i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 9 || i2 == 12 || i2 == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 9 || i2 == 12 || i2 == 13) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "getAnnotations";
            } else if (i2 == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i2 == 5) {
                objArr[1] = "getName";
            } else if (i2 == 6) {
                objArr[1] = "getStableName";
            } else if (i2 == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i2 == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i2 == 12) {
                objArr[1] = "getOriginal";
            } else if (i2 != 13) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i2) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 8 || i2 == 9 || i2 == 12 || i2 == 13) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public <T> T E0(w.a<T> aVar) {
            if (aVar != null) {
                return null;
            }
            c0(0);
            throw null;
        }

        public boolean I(e.a.a.a.y0.b.w wVar) {
            if (wVar != null) {
                return false;
            }
            c0(11);
            throw null;
        }

        public k a() {
            return this;
        }

        public k b() {
            return null;
        }

        public e.a.a.a.y0.f.d getName() {
            return e.a.a.a.y0.f.d.n("<ERROR MODULE>");
        }

        public List<e.a.a.a.y0.b.w> i0() {
            return o.f7934h;
        }

        public h k() {
            Objects.requireNonNull(h.f7785e);
            h hVar = h.a.a;
            if (hVar != null) {
                return hVar;
            }
            c0(1);
            throw null;
        }

        public <R, D> R l0(m<R, D> mVar, D d) {
            if (mVar != null) {
                return null;
            }
            c0(10);
            throw null;
        }

        public b0 o0(e.a.a.a.y0.f.b bVar) {
            if (bVar == null) {
                c0(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }

        public g v() {
            e.a.a.a.y0.a.d dVar = e.a.a.a.y0.a.d.f7641m;
            if (dVar != null) {
                return dVar;
            }
            c0(13);
            throw null;
        }

        public Collection<e.a.a.a.y0.f.b> y(e.a.a.a.y0.f.b bVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
            if (bVar != null) {
                return o.f7934h;
            }
            c0(2);
            throw null;
        }
    }

    public static class b implements v0 {
        public final /* synthetic */ c a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f9764b;

        public b(c cVar, String str) {
            this.a = cVar;
            this.f9764b = str;
        }

        public static /* synthetic */ void e(int i2) {
            String str = i2 != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 != 3 ? 2 : 3)];
            if (i2 != 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else {
                objArr[0] = "kotlinTypeRefiner";
            }
            if (i2 == 1) {
                objArr[1] = "getSupertypes";
            } else if (i2 == 2) {
                objArr[1] = "getBuiltIns";
            } else if (i2 == 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else if (i2 != 4) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "refine";
            }
            if (i2 == 3) {
                objArr[2] = "refine";
            }
            String format = String.format(str, objArr);
            throw (i2 != 3 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public v0 a(e.a.a.a.y0.m.l1.f fVar) {
            return this;
        }

        public boolean b() {
            return false;
        }

        public e.a.a.a.y0.b.h d() {
            return this.a;
        }

        public List<r0> g() {
            return o.f7934h;
        }

        public Collection<d0> h() {
            return o.f7934h;
        }

        public String toString() {
            return this.f9764b;
        }

        public g v() {
            e.a.a.a.y0.a.d dVar = e.a.a.a.y0.a.d.f7641m;
            if (dVar != null) {
                return dVar;
            }
            e(2);
            throw null;
        }
    }

    public static class c extends e.a.a.a.y0.b.c1.k {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(e.a.a.a.y0.f.d r14) {
            /*
                r13 = this;
                e.a.a.a.y0.b.w r1 = e.a.a.a.y0.m.w.i()
                e.a.a.a.y0.b.v r3 = e.a.a.a.y0.b.v.OPEN
                e.a.a.a.y0.b.f r4 = e.a.a.a.y0.b.f.CLASS
                java.util.List r5 = java.util.Collections.emptyList()
                e.a.a.a.y0.b.m0 r12 = e.a.a.a.y0.b.m0.a
                r7 = 0
                e.a.a.a.y0.l.m r8 = e.a.a.a.y0.l.e.f9624e
                r0 = r13
                r2 = r14
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                e.a.a.a.y0.b.a1.h$a r14 = e.a.a.a.y0.b.a1.h.f7785e
                java.util.Objects.requireNonNull(r14)
                e.a.a.a.y0.b.a1.h r9 = e.a.a.a.y0.b.a1.h.a.a
                r10 = 1
                if (r9 == 0) goto L_0x005d
                e.a.a.a.y0.b.c1.i r14 = new e.a.a.a.y0.b.c1.i
                r8 = 0
                e.a.a.a.y0.b.b$a r11 = e.a.a.a.y0.b.b.a.DECLARATION
                r6 = r14
                r7 = r13
                r6.<init>(r7, r8, r9, r10, r11, r12)
                java.util.List r0 = java.util.Collections.emptyList()
                e.a.a.a.y0.b.z0 r1 = e.a.a.a.y0.b.y0.d
                r14.d1(r0, r1)
                e.a.a.a.y0.f.d r0 = r13.getName()
                java.lang.String r0 = r0.e()
                e.a.a.a.y0.j.y.i r0 = e.a.a.a.y0.m.w.b(r0)
                e.a.a.a.y0.m.v r8 = new e.a.a.a.y0.m.v
                java.lang.String r1 = "<ERROR>"
                e.a.a.a.y0.m.v0 r2 = e.a.a.a.y0.m.w.f(r1, r13)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 28
                r1 = r8
                r3 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r14.a1(r8)
                java.util.Set r1 = java.util.Collections.singleton(r14)
                r13.K0(r0, r1, r14)
                return
            L_0x005d:
                r14 = 5
                e.a.a.a.y0.b.c1.i.c0(r14)
                r14 = 0
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.w.c.<init>(e.a.a.a.y0.f.d):void");
        }

        public static /* synthetic */ void j0(int i2) {
            String str = (i2 == 2 || i2 == 5 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 2 || i2 == 5 || i2 == 8) ? 2 : 3)];
            switch (i2) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i2 == 2) {
                objArr[1] = "substitute";
            } else if (i2 == 5 || i2 == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i2) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 2 || i2 == 5 || i2 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public e.a.a.a.y0.b.l c(d1 d1Var) {
            if (d1Var != null) {
                return this;
            }
            j0(1);
            throw null;
        }

        public i c0(b1 b1Var, e.a.a.a.y0.m.l1.f fVar) {
            if (b1Var == null) {
                j0(6);
                throw null;
            } else if (fVar != null) {
                StringBuilder y = b.e.a.a.a.y("Error scope for class ");
                y.append(getName());
                y.append(" with arguments: ");
                y.append(b1Var);
                return w.b(y.toString());
            } else {
                j0(7);
                throw null;
            }
        }

        public String toString() {
            return getName().e();
        }

        public e.a.a.a.y0.b.e w0(d1 d1Var) {
            if (d1Var != null) {
                return this;
            }
            j0(1);
            throw null;
        }
    }

    public static class d implements i {

        /* renamed from: b  reason: collision with root package name */
        public final String f9765b;

        public d(String str, a aVar) {
            if (str != null) {
                this.f9765b = str;
            } else {
                h(0);
                throw null;
            }
        }

        public static /* synthetic */ void h(int i2) {
            String str;
            int i3;
            Throwable th;
            if (!(i2 == 7 || i2 == 18)) {
                switch (i2) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i2 == 7 || i2 == 18)) {
                switch (i2) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
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
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i2 == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i2 != 18) {
                switch (i2) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i2) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i2 == 7 || i2 == 18)) {
                switch (i2) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public Collection a(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(8);
                throw null;
            } else if (bVar != null) {
                e.a.a.a.y0.m.m1.a aVar = new e.a.a.a.y0.m.m1.a(w.f9762b, this);
                aVar.V0((i0) null, (i0) null, Collections.emptyList(), Collections.emptyList(), w.d("<ERROR FUNCTION RETURN TYPE>"), v.OPEN, y0.f7850e);
                Set singleton = Collections.singleton(aVar);
                if (singleton != null) {
                    return singleton;
                }
                h(10);
                throw null;
            } else {
                h(9);
                throw null;
            }
        }

        public e.a.a.a.y0.b.h b(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar != null) {
                String e2 = dVar.e();
                if (e2 != null) {
                    return new c(e.a.a.a.y0.f.d.n("<ERROR CLASS: " + e2 + ">"));
                }
                w.a(1);
                throw null;
            } else {
                h(2);
                throw null;
            }
        }

        public Collection<k> c(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
            if (dVar == null) {
                h(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                h(18);
                throw null;
            } else {
                h(17);
                throw null;
            }
        }

        public Collection d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar != null) {
                Set<f0> set = w.f;
                if (set != null) {
                    return set;
                }
                h(7);
                throw null;
            } else {
                h(6);
                throw null;
            }
        }

        public Set<e.a.a.a.y0.f.d> e() {
            Set<e.a.a.a.y0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(11);
            throw null;
        }

        public Set<e.a.a.a.y0.f.d> f() {
            Set<e.a.a.a.y0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(12);
            throw null;
        }

        public Set<e.a.a.a.y0.f.d> g() {
            Set<e.a.a.a.y0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(13);
            throw null;
        }

        public String toString() {
            return b.e.a.a.a.p(b.e.a.a.a.y("ErrorScope{"), this.f9765b, '}');
        }
    }

    public static class e implements i {

        /* renamed from: b  reason: collision with root package name */
        public final String f9766b;

        public e(String str, a aVar) {
            if (str != null) {
                this.f9766b = str;
            } else {
                h(0);
                throw null;
            }
        }

        public static /* synthetic */ void h(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i2) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Collection<? extends l0> a(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(7);
                throw null;
            } else if (bVar == null) {
                h(8);
                throw null;
            } else {
                throw new IllegalStateException(this.f9766b + ", required name: " + dVar);
            }
        }

        public e.a.a.a.y0.b.h b(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(1);
                throw null;
            } else if (bVar == null) {
                h(2);
                throw null;
            } else {
                throw new IllegalStateException(this.f9766b + ", required name: " + dVar);
            }
        }

        public Collection<k> c(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
            if (dVar == null) {
                h(9);
                throw null;
            } else if (lVar == null) {
                h(10);
                throw null;
            } else {
                throw new IllegalStateException(this.f9766b);
            }
        }

        public Collection<? extends f0> d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
            if (dVar == null) {
                h(5);
                throw null;
            } else if (bVar == null) {
                h(6);
                throw null;
            } else {
                throw new IllegalStateException(this.f9766b + ", required name: " + dVar);
            }
        }

        public Set<e.a.a.a.y0.f.d> e() {
            throw new IllegalStateException();
        }

        public Set<e.a.a.a.y0.f.d> f() {
            throw new IllegalStateException();
        }

        public Set<e.a.a.a.y0.f.d> g() {
            throw new IllegalStateException();
        }

        public String toString() {
            return b.e.a.a.a.p(b.e.a.a.a.y("ThrowingScope{"), this.f9766b, '}');
        }
    }

    public static class f implements v0 {
        public static /* synthetic */ void e(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i2 == 2) {
                objArr[1] = "getParameters";
            } else if (i2 == 3) {
                objArr[1] = "getSupertypes";
            } else if (i2 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i2 != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public v0 a(e.a.a.a.y0.m.l1.f fVar) {
            return this;
        }

        public boolean b() {
            throw null;
        }

        public e.a.a.a.y0.b.h d() {
            throw null;
        }

        public List<r0> g() {
            throw null;
        }

        public Collection<d0> h() {
            throw null;
        }

        public g v() {
            g f = e.a.a.a.y0.j.v.b.f((k) null);
            if (f != null) {
                return f;
            }
            e(4);
            throw null;
        }
    }

    static {
        c cVar = new c(e.a.a.a.y0.f.d.n("<ERROR CLASS>"));
        f9762b = cVar;
        k0 d2 = d("<ERROR PROPERTY TYPE>");
        d = d2;
        Objects.requireNonNull(h.f7785e);
        h hVar = h.a.a;
        v vVar = v.OPEN;
        z0 z0Var = y0.f7850e;
        e.a.a.a.y0.f.d n2 = e.a.a.a.y0.f.d.n("<ERROR PROPERTY>");
        b.a aVar = b.a.DECLARATION;
        m0 m0Var = m0.a;
        if (cVar == null) {
            e0.c0(7);
            throw null;
        } else if (hVar == null) {
            e0.c0(8);
            throw null;
        } else if (z0Var != null) {
            e0 e0Var = r1;
            e0 e0Var2 = new e0(cVar, (f0) null, hVar, vVar, z0Var, true, n2, aVar, m0Var, false, false, false, false, false, false);
            e0 e0Var3 = e0Var;
            e0Var3.W0(d2, Collections.emptyList(), (i0) null, (i0) null);
            f9763e = e0Var3;
            f = Collections.singleton(e0Var3);
        } else {
            e0.c0(10);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 4 || i2 == 6 || i2 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 4 || i2 == 6 || i2 == 19) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i2 == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i2 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i2) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 4 || i2 == 6 || i2 == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static i b(String str) {
        if (str != null) {
            return c(str, false);
        }
        a(2);
        throw null;
    }

    public static i c(String str, boolean z) {
        if (str != null) {
            return z ? new e(str, (a) null) : new d(str, (a) null);
        }
        a(3);
        throw null;
    }

    public static k0 d(String str) {
        if (str != null) {
            return g(str, Collections.emptyList());
        }
        a(7);
        throw null;
    }

    public static v0 e(String str) {
        if (str != null) {
            return f(b.e.a.a.a.n("[ERROR : ", str, "]"), f9762b);
        }
        a(15);
        throw null;
    }

    public static v0 f(String str, c cVar) {
        if (str == null) {
            a(17);
            throw null;
        } else if (cVar != null) {
            return new b(cVar, str);
        } else {
            a(18);
            throw null;
        }
    }

    public static k0 g(String str, List<y0> list) {
        if (str == null) {
            a(11);
            throw null;
        } else if (list != null) {
            return new v(e(str), b(str), list, false, (String) null, 16);
        } else {
            a(12);
            throw null;
        }
    }

    public static k0 h(String str, v0 v0Var) {
        if (str == null) {
            a(9);
            throw null;
        } else if (v0Var != null) {
            return new v(v0Var, b(str), (List) null, false, (String) null, 28);
        } else {
            a(10);
            throw null;
        }
    }

    public static e.a.a.a.y0.b.w i() {
        e.a.a.a.y0.b.w wVar = a;
        if (wVar != null) {
            return wVar;
        }
        a(19);
        throw null;
    }

    public static boolean j(k kVar) {
        if (kVar == null) {
            return false;
        }
        if ((kVar instanceof c) || (kVar.b() instanceof c) || kVar == a) {
            return true;
        }
        return false;
    }
}
