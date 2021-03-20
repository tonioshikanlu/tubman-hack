package e.a.a.a.y0.j;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.o;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.j.h;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.l1.d;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.o.m;
import e.r;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

public class l {
    public static final List<h> c;
    public static final l d;

    /* renamed from: e  reason: collision with root package name */
    public static final d.a f9392e;
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f9393b;

    public static class a implements d.a {
        public static /* synthetic */ void b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
                throw null;
            } else if (v0Var2 != null) {
                return v0Var.equals(v0Var2);
            } else {
                b(1);
                throw null;
            }
        }
    }

    public class b implements d.a {
        public final /* synthetic */ Map a;

        public b(Map map) {
            this.a = map;
        }

        public static /* synthetic */ void b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
                throw null;
            } else if (v0Var2 == null) {
                b(1);
                throw null;
            } else if (l.this.f9393b.a(v0Var, v0Var2)) {
                return true;
            } else {
                v0 v0Var3 = (v0) this.a.get(v0Var);
                v0 v0Var4 = (v0) this.a.get(v0Var2);
                if ((v0Var3 == null || !v0Var3.equals(v0Var2)) && (v0Var4 == null || !v0Var4.equals(v0Var))) {
                    return false;
                }
                return true;
            }
        }
    }

    public static class c implements e.x.b.l<e.a.a.a.y0.b.b, e.a.a.a.y0.b.a> {
        public Object invoke(Object obj) {
            return (e.a.a.a.y0.b.b) obj;
        }
    }

    public static class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f9395b = new d(a.OVERRIDABLE, "SUCCESS");
        public final a a;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public d(a aVar, String str) {
            if (str != null) {
                this.a = aVar;
            } else {
                a(4);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.l.d.a(int):void");
        }

        public static d b(String str) {
            return new d(a.CONFLICT, str);
        }

        public static d d(String str) {
            return new d(a.INCOMPATIBLE, str);
        }

        public a c() {
            a aVar = this.a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }
    }

    static {
        Class<h> cls = h.class;
        c = g.W(ServiceLoader.load(cls, cls.getClassLoader()));
        a aVar = new a();
        f9392e = aVar;
        d = new l(aVar, f.a.a);
    }

    public l(d.a aVar, f fVar) {
        if (aVar == null) {
            a(4);
            throw null;
        } else if (fVar != null) {
            this.f9393b = aVar;
            this.a = fVar;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        int i4 = i2;
        if (!(i4 == 9 || i4 == 10 || i4 == 14 || i4 == 19 || i4 == 92 || i4 == 95 || i4 == 100 || i4 == 42 || i4 == 43)) {
            switch (i4) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i4) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i4) {
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                    break;
                                default:
                                    switch (i4) {
                                        case 87:
                                        case 88:
                                        case 89:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i4 == 9 || i4 == 10 || i4 == 14 || i4 == 19 || i4 == 92 || i4 == 95 || i4 == 100 || i4 == 42 || i4 == 43)) {
            switch (i4) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i4) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i4) {
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                    break;
                                default:
                                    switch (i4) {
                                        case 87:
                                        case 88:
                                        case 89:
                                            break;
                                        default:
                                            i3 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        switch (i4) {
            case 1:
            case 2:
            case 5:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "axioms";
                break;
            case 6:
            case 7:
                objArr[0] = "candidateSet";
                break;
            case 8:
                objArr[0] = "transformFirst";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 87:
            case 88:
            case 89:
            case 92:
            case 95:
            case 100:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 11:
                objArr[0] = "f";
                break;
            case 12:
                objArr[0] = "g";
                break;
            case 13:
            case 15:
                objArr[0] = "descriptor";
                break;
            case 16:
                objArr[0] = "result";
                break;
            case 17:
            case 20:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 18:
            case 21:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
                objArr[0] = "typeChecker";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 83:
            case 86:
            case 93:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 84:
            case 103:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 85:
            case 90:
            case 106:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 75:
            case 82:
                objArr[0] = "overridables";
                break;
            case 76:
            case 98:
                objArr[0] = "descriptorByHandle";
                break;
            case 91:
                objArr[0] = "classModality";
                break;
            case 94:
                objArr[0] = "toFilter";
                break;
            case 96:
            case 101:
                objArr[0] = "overrider";
                break;
            case 97:
            case 102:
                objArr[0] = "extractFrom";
                break;
            case 99:
                objArr[0] = "onConflict";
                break;
            case 104:
            case 105:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i4 == 9 || i4 == 10) {
            objArr[1] = "filterOverrides";
        } else if (i4 != 14) {
            if (i4 != 19) {
                if (i4 == 92) {
                    objArr[1] = "getMinimalModality";
                } else if (i4 == 95) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i4 != 100) {
                    if (i4 != 42 && i4 != 43) {
                        switch (i4) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                switch (i4) {
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i4) {
                                            case 77:
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i4) {
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeChecker";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i4) {
            case 1:
                objArr[2] = "createWithTypeRefiner";
                break;
            case 2:
            case 3:
                objArr[2] = "create";
                break;
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
                objArr[2] = "filterOutOverridden";
                break;
            case 7:
            case 8:
                objArr[2] = "filterOverrides";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 87:
            case 88:
            case 89:
            case 92:
            case 95:
            case 100:
                break;
            case 11:
            case 12:
                objArr[2] = "overrides";
                break;
            case 13:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 15:
            case 16:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 17:
            case 18:
            case 20:
            case 21:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeChecker";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 75:
            case 76:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 82:
            case 83:
            case 84:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 85:
            case 86:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 90:
            case 91:
                objArr[2] = "getMinimalModality";
                break;
            case 93:
            case 94:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 96:
            case 97:
            case 98:
            case 99:
            case 101:
            case 102:
            case 103:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 104:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 105:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 106:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i4 == 9 || i4 == 10 || i4 == 14 || i4 == 19 || i4 == 92 || i4 == 95 || i4 == 100 || i4 == 42 || i4 == 43)) {
            switch (i4) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i4) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i4) {
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                    break;
                                default:
                                    switch (i4) {
                                        case 87:
                                        case 88:
                                        case 89:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static void c(e.a.a.a.y0.b.b bVar, Set<e.a.a.a.y0.b.b> set) {
        if (bVar == null) {
            a(15);
            throw null;
        } else if (set == null) {
            a(16);
            throw null;
        } else if (bVar.i().d()) {
            set.add(bVar);
        } else if (!bVar.g().isEmpty()) {
            for (e.a.a.a.y0.b.b c2 : bVar.g()) {
                c(c2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    public static List<d0> d(e.a.a.a.y0.b.a aVar) {
        i0 U = aVar.U();
        ArrayList arrayList = new ArrayList();
        if (U != null) {
            arrayList.add(U.d());
        }
        for (w0 d2 : aVar.n()) {
            arrayList.add(d2.d());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.util.Collection<e.a.a.a.y0.b.b> r16, e.a.a.a.y0.b.e r17, e.a.a.a.y0.j.k r18) {
        /*
            r0 = r16
            r1 = r17
            r6 = r18
            r2 = 0
            if (r0 == 0) goto L_0x01b4
            if (r1 == 0) goto L_0x01ae
            if (r6 == 0) goto L_0x01a8
            if (r1 == 0) goto L_0x01a2
            if (r0 == 0) goto L_0x019c
            e.a.a.a.y0.j.m r3 = new e.a.a.a.y0.j.m
            r3.<init>(r1)
            java.util.List r3 = e.t.g.m(r0, r3)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0025
            r7 = r0
            goto L_0x0026
        L_0x0025:
            r7 = r3
        L_0x0026:
            e.a.a.a.y0.b.v r0 = e.a.a.a.y0.b.v.ABSTRACT
            java.util.Iterator r3 = r7.iterator()
            r5 = 0
            r8 = r5
            r9 = r8
        L_0x002f:
            boolean r10 = r3.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x006f
            java.lang.Object r10 = r3.next()
            e.a.a.a.y0.b.b r10 = (e.a.a.a.y0.b.b) r10
            e.a.a.a.y0.b.v r12 = r10.q()
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x006a
            if (r12 == r11) goto L_0x0053
            r10 = 2
            if (r12 == r10) goto L_0x0051
            r10 = 3
            if (r12 == r10) goto L_0x004f
            goto L_0x002f
        L_0x004f:
            r9 = r11
            goto L_0x002f
        L_0x0051:
            r8 = r11
            goto L_0x002f
        L_0x0053:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Member cannot have SEALED modality: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006a:
            e.a.a.a.y0.b.v r0 = e.a.a.a.y0.b.v.FINAL
        L_0x006c:
            r2 = r0
            goto L_0x016d
        L_0x006f:
            boolean r3 = r17.m0()
            if (r3 == 0) goto L_0x0085
            e.a.a.a.y0.b.v r3 = r17.q()
            if (r3 == r0) goto L_0x0085
            e.a.a.a.y0.b.v r3 = r17.q()
            e.a.a.a.y0.b.v r10 = e.a.a.a.y0.b.v.SEALED
            if (r3 == r10) goto L_0x0085
            r3 = r11
            goto L_0x0086
        L_0x0085:
            r3 = r5
        L_0x0086:
            if (r8 == 0) goto L_0x008d
            if (r9 != 0) goto L_0x008d
            e.a.a.a.y0.b.v r0 = e.a.a.a.y0.b.v.OPEN
            goto L_0x006c
        L_0x008d:
            if (r8 != 0) goto L_0x00a0
            if (r9 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x0097
            e.a.a.a.y0.b.v r0 = r17.q()
        L_0x0097:
            if (r0 == 0) goto L_0x009a
            goto L_0x006c
        L_0x009a:
            r0 = 89
            a(r0)
            throw r2
        L_0x00a0:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Iterator r9 = r7.iterator()
        L_0x00a9:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00c9
            java.lang.Object r10 = r9.next()
            e.a.a.a.y0.b.b r10 = (e.a.a.a.y0.b.b) r10
            if (r10 == 0) goto L_0x00c3
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            c(r10, r12)
            r8.addAll(r12)
            goto L_0x00a9
        L_0x00c3:
            r0 = 13
            a(r0)
            throw r2
        L_0x00c9:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00fa
            java.util.Iterator r9 = r8.iterator()
            java.lang.Object r9 = r9.next()
            e.a.a.a.y0.b.k r9 = (e.a.a.a.y0.b.k) r9
            e.a.a.a.y0.b.w r9 = e.a.a.a.y0.j.v.b.k(r9)
            java.lang.String r10 = "$this$isTypeRefinementEnabled"
            e.x.c.i.e(r9, r10)
            e.a.a.a.y0.b.w$a<e.a.a.a.y0.m.l1.n<e.a.a.a.y0.m.l1.f>> r10 = e.a.a.a.y0.m.l1.g.a
            java.lang.Object r9 = r9.E0(r10)
            e.a.a.a.y0.m.l1.n r9 = (e.a.a.a.y0.m.l1.n) r9
            if (r9 == 0) goto L_0x00f1
            T r9 = r9.a
            e.a.a.a.y0.m.l1.f r9 = (e.a.a.a.y0.m.l1.f) r9
            goto L_0x00f2
        L_0x00f1:
            r9 = r2
        L_0x00f2:
            if (r9 == 0) goto L_0x00f6
            r9 = r11
            goto L_0x00f7
        L_0x00f6:
            r9 = r5
        L_0x00f7:
            if (r9 == 0) goto L_0x00fa
            r5 = r11
        L_0x00fa:
            int r9 = r8.size()
            if (r9 > r11) goto L_0x0101
            goto L_0x013d
        L_0x0101:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x010a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x013c
            java.lang.Object r10 = r8.next()
            java.util.Iterator r12 = r9.iterator()
        L_0x0118:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0138
            java.lang.Object r13 = r12.next()
            r14 = r10
            e.a.a.a.y0.b.a r14 = (e.a.a.a.y0.b.a) r14
            e.a.a.a.y0.b.a r13 = (e.a.a.a.y0.b.a) r13
            boolean r15 = q(r14, r13, r5, r11)
            if (r15 == 0) goto L_0x0131
            r12.remove()
            goto L_0x0118
        L_0x0131:
            boolean r13 = q(r13, r14, r5, r11)
            if (r13 == 0) goto L_0x0118
            goto L_0x010a
        L_0x0138:
            r9.add(r10)
            goto L_0x010a
        L_0x013c:
            r8 = r9
        L_0x013d:
            e.a.a.a.y0.b.v r5 = r17.q()
            if (r5 == 0) goto L_0x0196
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L_0x0148:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r10 = r8.next()
            e.a.a.a.y0.b.b r10 = (e.a.a.a.y0.b.b) r10
            if (r3 == 0) goto L_0x015e
            e.a.a.a.y0.b.v r11 = r10.q()
            if (r11 != r0) goto L_0x015e
            r10 = r5
            goto L_0x0162
        L_0x015e:
            e.a.a.a.y0.b.v r10 = r10.q()
        L_0x0162:
            int r11 = r10.compareTo(r9)
            if (r11 >= 0) goto L_0x0148
            r9 = r10
            goto L_0x0148
        L_0x016a:
            if (r9 == 0) goto L_0x0190
            r2 = r9
        L_0x016d:
            if (r4 == 0) goto L_0x0172
            e.a.a.a.y0.b.z0 r0 = e.a.a.a.y0.b.y0.f7852h
            goto L_0x0174
        L_0x0172:
            e.a.a.a.y0.b.z0 r0 = e.a.a.a.y0.b.y0.f7851g
        L_0x0174:
            r3 = r0
            e.a.a.a.y0.j.l$c r0 = new e.a.a.a.y0.j.l$c
            r0.<init>()
            java.lang.Object r0 = s(r7, r0)
            e.a.a.a.y0.b.b r0 = (e.a.a.a.y0.b.b) r0
            e.a.a.a.y0.b.b$a r4 = e.a.a.a.y0.b.b.a.FAKE_OVERRIDE
            r5 = 0
            r1 = r17
            e.a.a.a.y0.b.b r0 = r0.O0(r1, r2, r3, r4, r5)
            r6.d(r0, r7)
            r6.a(r0)
            return
        L_0x0190:
            r0 = 92
            a(r0)
            throw r2
        L_0x0196:
            r0 = 91
            a(r0)
            throw r2
        L_0x019c:
            r0 = 94
            a(r0)
            throw r2
        L_0x01a2:
            r0 = 93
            a(r0)
            throw r2
        L_0x01a8:
            r0 = 84
            a(r0)
            throw r2
        L_0x01ae:
            r0 = 83
            a(r0)
            throw r2
        L_0x01b4:
            r0 = 82
            a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.l.e(java.util.Collection, e.a.a.a.y0.b.e, e.a.a.a.y0.j.k):void");
    }

    public static <H> Collection<H> g(H h2, Collection<H> collection, e.x.b.l<H, e.a.a.a.y0.b.a> lVar, e.x.b.l<H, r> lVar2) {
        if (h2 == null) {
            a(96);
            throw null;
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h2);
            e.a.a.a.y0.b.a invoke = lVar.invoke(h2);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                e.a.a.a.y0.b.a invoke2 = lVar.invoke(next);
                if (h2 != next) {
                    d.a j2 = j(invoke, invoke2);
                    if (j2 == d.a.OVERRIDABLE) {
                        arrayList.add(next);
                    } else if (j2 == d.a.CONFLICT) {
                        lVar2.invoke(next);
                    }
                }
                it.remove();
            }
            return arrayList;
        } else {
            a(97);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.a.a.a.y0.j.l.d i(e.a.a.a.y0.b.a r5, e.a.a.a.y0.b.a r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0085
            if (r6 == 0) goto L_0x007f
            boolean r1 = r5 instanceof e.a.a.a.y0.b.s
            if (r1 == 0) goto L_0x000d
            boolean r2 = r6 instanceof e.a.a.a.y0.b.s
            if (r2 == 0) goto L_0x0015
        L_0x000d:
            boolean r2 = r5 instanceof e.a.a.a.y0.b.f0
            if (r2 == 0) goto L_0x001c
            boolean r3 = r6 instanceof e.a.a.a.y0.b.f0
            if (r3 != 0) goto L_0x001c
        L_0x0015:
            java.lang.String r5 = "Member kind mismatch"
        L_0x0017:
            e.a.a.a.y0.j.l$d r5 = e.a.a.a.y0.j.l.d.d(r5)
            return r5
        L_0x001c:
            if (r1 != 0) goto L_0x0038
            if (r2 == 0) goto L_0x0021
            goto L_0x0038
        L_0x0021:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This type of CallableDescriptor cannot be checked for overridability: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0038:
            e.a.a.a.y0.f.d r1 = r5.getName()
            e.a.a.a.y0.f.d r2 = r6.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "Name mismatch"
            goto L_0x0017
        L_0x0049:
            e.a.a.a.y0.b.i0 r1 = r5.U()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0053
            r1 = r2
            goto L_0x0054
        L_0x0053:
            r1 = r3
        L_0x0054:
            e.a.a.a.y0.b.i0 r4 = r6.U()
            if (r4 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r1 == r2) goto L_0x0061
            java.lang.String r5 = "Receiver presence mismatch"
            goto L_0x0075
        L_0x0061:
            java.util.List r5 = r5.n()
            int r5 = r5.size()
            java.util.List r6 = r6.n()
            int r6 = r6.size()
            if (r5 == r6) goto L_0x007a
            java.lang.String r5 = "Value parameter number mismatch"
        L_0x0075:
            e.a.a.a.y0.j.l$d r5 = e.a.a.a.y0.j.l.d.d(r5)
            goto L_0x007b
        L_0x007a:
            r5 = r0
        L_0x007b:
            if (r5 == 0) goto L_0x007e
            return r5
        L_0x007e:
            return r0
        L_0x007f:
            r5 = 39
            a(r5)
            throw r0
        L_0x0085:
            r5 = 38
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.l.i(e.a.a.a.y0.b.a, e.a.a.a.y0.b.a):e.a.a.a.y0.j.l$d");
    }

    public static d.a j(e.a.a.a.y0.b.a aVar, e.a.a.a.y0.b.a aVar2) {
        l lVar = d;
        d.a c2 = lVar.l(aVar2, aVar, (e) null).c();
        d.a c3 = lVar.l(aVar, aVar2, (e) null).c();
        d.a aVar3 = d.a.OVERRIDABLE;
        if (c2 == aVar3 && c3 == aVar3) {
            return aVar3;
        }
        d.a aVar4 = d.a.CONFLICT;
        return (c2 == aVar4 || c3 == aVar4) ? aVar4 : d.a.INCOMPATIBLE;
    }

    public static boolean k(e.a.a.a.y0.b.a aVar, e.a.a.a.y0.b.a aVar2) {
        if (aVar == null) {
            a(65);
            throw null;
        } else if (aVar2 != null) {
            d0 f = aVar.f();
            d0 f2 = aVar2.f();
            if (!p(aVar, aVar2)) {
                return false;
            }
            if (aVar instanceof s) {
                return o(aVar, f, aVar2, f2);
            }
            if (aVar instanceof f0) {
                f0 f0Var = (f0) aVar;
                f0 f0Var2 = (f0) aVar2;
                h0 m2 = f0Var.m();
                h0 m3 = f0Var2.m();
                if (!((m2 == null || m3 == null) ? true : p(m2, m3))) {
                    return false;
                }
                if (f0Var.Q() && f0Var2.Q()) {
                    return ((e.a.a.a.y0.m.l1.e) d.f(aVar.B(), aVar2.B())).b(f, f2);
                }
                if ((f0Var.Q() || !f0Var2.Q()) && o(aVar, f, aVar2, f2)) {
                    return true;
                }
                return false;
            }
            StringBuilder y = b.e.a.a.a.y("Unexpected callable: ");
            y.append(aVar.getClass());
            throw new IllegalArgumentException(y.toString());
        } else {
            a(66);
            throw null;
        }
    }

    public static boolean o(e.a.a.a.y0.b.a aVar, d0 d0Var, e.a.a.a.y0.b.a aVar2, d0 d0Var2) {
        if (d0Var == null) {
            a(72);
            throw null;
        } else if (d0Var2 != null) {
            return ((e.a.a.a.y0.m.l1.e) d.f(aVar.B(), aVar2.B())).d(d0Var, d0Var2);
        } else {
            a(74);
            throw null;
        }
    }

    public static boolean p(o oVar, o oVar2) {
        Integer b2 = y0.b(oVar.getVisibility(), oVar2.getVisibility());
        return b2 == null || b2.intValue() >= 0;
    }

    public static <D extends e.a.a.a.y0.b.a> boolean q(D d2, D d3, boolean z, boolean z2) {
        e eVar = e.a;
        if (d2 == null) {
            a(11);
            throw null;
        } else if (d3 == null) {
            a(12);
            throw null;
        } else if (!d2.equals(d3) && eVar.a(d2.a(), d3.a(), z, z2)) {
            return true;
        } else {
            e.a.a.a.y0.b.a a2 = d3.a();
            e.a.a.a.y0.f.d dVar = g.a;
            LinkedHashSet<e.a.a.a.y0.b.a> linkedHashSet = new LinkedHashSet<>();
            g.b(d2.a(), linkedHashSet);
            for (e.a.a.a.y0.b.a a3 : linkedHashSet) {
                if (eVar.a(a2, a3, z, z2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void r(e.a.a.a.y0.b.b r6, e.x.b.l<e.a.a.a.y0.b.b, e.r> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x011f
            java.util.Collection r1 = r6.g()
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            e.a.a.a.y0.b.b r2 = (e.a.a.a.y0.b.b) r2
            e.a.a.a.y0.b.z0 r3 = r2.getVisibility()
            e.a.a.a.y0.b.z0 r4 = e.a.a.a.y0.b.y0.f7851g
            if (r3 != r4) goto L_0x000b
            r(r2, r7)
            goto L_0x000b
        L_0x0023:
            e.a.a.a.y0.b.z0 r1 = r6.getVisibility()
            e.a.a.a.y0.b.z0 r2 = e.a.a.a.y0.b.y0.f7851g
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            java.util.Collection r1 = r6.g()
            if (r1 == 0) goto L_0x0119
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            e.a.a.a.y0.b.z0 r2 = e.a.a.a.y0.b.y0.f7855k
            goto L_0x0088
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            r3 = r0
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r2.next()
            e.a.a.a.y0.b.b r4 = (e.a.a.a.y0.b.b) r4
            e.a.a.a.y0.b.z0 r4 = r4.getVisibility()
            if (r3 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.Integer r5 = e.a.a.a.y0.b.y0.b(r4, r3)
            if (r5 != 0) goto L_0x005a
            goto L_0x003f
        L_0x005a:
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0040
        L_0x0060:
            r3 = r4
            goto L_0x0040
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()
            e.a.a.a.y0.b.b r4 = (e.a.a.a.y0.b.b) r4
            e.a.a.a.y0.b.z0 r4 = r4.getVisibility()
            java.lang.Integer r4 = e.a.a.a.y0.b.y0.b(r3, r4)
            if (r4 == 0) goto L_0x0085
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x0069
        L_0x0085:
            r2 = r0
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 != 0) goto L_0x008c
        L_0x008a:
            r2 = r0
            goto L_0x00bb
        L_0x008c:
            e.a.a.a.y0.b.b$a r3 = r6.i()
            e.a.a.a.y0.b.b$a r4 = e.a.a.a.y0.b.b.a.FAKE_OVERRIDE
            if (r3 != r4) goto L_0x00b7
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            e.a.a.a.y0.b.b r3 = (e.a.a.a.y0.b.b) r3
            e.a.a.a.y0.b.v r4 = r3.q()
            e.a.a.a.y0.b.v r5 = e.a.a.a.y0.b.v.ABSTRACT
            if (r4 == r5) goto L_0x0098
            e.a.a.a.y0.b.z0 r3 = r3.getVisibility()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0098
            goto L_0x008a
        L_0x00b7:
            e.a.a.a.y0.b.z0 r2 = r2.d()
        L_0x00bb:
            if (r2 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c2
            r7.invoke(r6)
        L_0x00c2:
            e.a.a.a.y0.b.z0 r1 = e.a.a.a.y0.b.y0.f7850e
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            boolean r3 = r6 instanceof e.a.a.a.y0.b.c1.e0
            if (r3 == 0) goto L_0x00f6
            r3 = r6
            e.a.a.a.y0.b.c1.e0 r3 = (e.a.a.a.y0.b.c1.e0) r3
            if (r1 == 0) goto L_0x00f0
            r3.f8183p = r1
            e.a.a.a.y0.b.f0 r6 = (e.a.a.a.y0.b.f0) r6
            java.util.List r6 = r6.D()
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0118
            java.lang.Object r1 = r6.next()
            e.a.a.a.y0.b.e0 r1 = (e.a.a.a.y0.b.e0) r1
            if (r2 != 0) goto L_0x00eb
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r7
        L_0x00ec:
            r(r1, r3)
            goto L_0x00db
        L_0x00f0:
            r6 = 16
            e.a.a.a.y0.b.c1.e0.c0(r6)
            throw r0
        L_0x00f6:
            boolean r7 = r6 instanceof e.a.a.a.y0.b.c1.r
            if (r7 == 0) goto L_0x0107
            e.a.a.a.y0.b.c1.r r6 = (e.a.a.a.y0.b.c1.r) r6
            if (r1 == 0) goto L_0x0101
            r6.r = r1
            goto L_0x0118
        L_0x0101:
            r6 = 9
            e.a.a.a.y0.b.c1.r.c0(r6)
            throw r0
        L_0x0107:
            e.a.a.a.y0.b.c1.d0 r6 = (e.a.a.a.y0.b.c1.d0) r6
            r6.r = r1
            e.a.a.a.y0.b.f0 r7 = r6.z0()
            e.a.a.a.y0.b.z0 r7 = r7.getVisibility()
            if (r1 == r7) goto L_0x0118
            r7 = 0
            r6.f8175l = r7
        L_0x0118:
            return
        L_0x0119:
            r6 = 106(0x6a, float:1.49E-43)
            a(r6)
            throw r0
        L_0x011f:
            r6 = 104(0x68, float:1.46E-43)
            a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.l.r(e.a.a.a.y0.b.b, e.x.b.l):void");
    }

    public static <H> H s(Collection<H> collection, e.x.b.l<H, e.a.a.a.y0.b.a> lVar) {
        H h2;
        boolean z;
        if (collection.size() == 1) {
            H n2 = g.n(collection);
            if (n2 != null) {
                return n2;
            }
            a(77);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        i.e(collection, "$this$map");
        i.e(lVar, "transform");
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(collection, 10));
        for (H invoke : collection) {
            arrayList2.add(lVar.invoke(invoke));
        }
        H n3 = g.n(collection);
        e.a.a.a.y0.b.a invoke2 = lVar.invoke(n3);
        for (H next : collection) {
            e.a.a.a.y0.b.a invoke3 = lVar.invoke(next);
            if (invoke3 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!k(invoke3, (e.a.a.a.y0.b.a) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
                if (k(invoke3, invoke2) && !k(invoke2, invoke3)) {
                    n3 = next;
                }
            } else {
                a(69);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (n3 != null) {
                return n3;
            }
            a(78);
            throw null;
        } else if (arrayList.size() == 1) {
            H n4 = g.n(arrayList);
            if (n4 != null) {
                return n4;
            }
            a(79);
            throw null;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    h2 = null;
                    break;
                }
                h2 = it2.next();
                if (!b.q.a.a.K1(lVar.invoke(h2).f())) {
                    break;
                }
            }
            if (h2 != null) {
                return h2;
            }
            H n5 = g.n(arrayList);
            if (n5 != null) {
                return n5;
            }
            a(81);
            throw null;
        }
    }

    public final boolean b(d0 d0Var, d0 d0Var2, e.a.a.a.y0.m.l1.d dVar) {
        if (d0Var == null) {
            a(44);
            throw null;
        } else if (d0Var2 == null) {
            a(45);
            throw null;
        } else if (dVar != null) {
            if (b.q.a.a.I1(d0Var) && b.q.a.a.I1(d0Var2)) {
                return true;
            }
            return dVar.b(this.a.g(d0Var), this.a.g(d0Var2));
        } else {
            a(46);
            throw null;
        }
    }

    public final e.a.a.a.y0.m.l1.d f(List<r0> list, List<r0> list2) {
        if (list == null) {
            a(40);
            throw null;
        } else if (list2 == null) {
            a(41);
            throw null;
        } else if (list.isEmpty()) {
            return e.a.a.a.y0.m.l1.e.f(this.f9393b);
        } else {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < list.size(); i2++) {
                hashMap.put(list.get(i2).p(), list2.get(i2).p());
            }
            return e.a.a.a.y0.m.l1.e.f(new b(hashMap));
        }
    }

    public void h(e.a.a.a.y0.f.d dVar, Collection<? extends e.a.a.a.y0.b.b> collection, Collection<? extends e.a.a.a.y0.b.b> collection2, e eVar, k kVar) {
        Integer b2;
        Collection<? extends e.a.a.a.y0.b.b> collection3 = collection;
        e eVar2 = eVar;
        k kVar2 = kVar;
        if (dVar == null) {
            a(50);
            throw null;
        } else if (collection3 == null) {
            a(51);
            throw null;
        } else if (collection2 == null) {
            a(52);
            throw null;
        } else if (eVar2 != null) {
            LinkedHashSet<e.a.a.a.y0.b.b> linkedHashSet = new LinkedHashSet<>(collection3);
            Iterator<? extends e.a.a.a.y0.b.b> it = collection2.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    e.a.a.a.y0.b.b bVar = (e.a.a.a.y0.b.b) it.next();
                    if (bVar != null) {
                        ArrayList arrayList = new ArrayList(collection.size());
                        m d2 = m.d();
                        for (e.a.a.a.y0.b.b bVar2 : collection) {
                            d.a c2 = l(bVar2, bVar, eVar2).c();
                            boolean z2 = !y0.e(bVar2.getVisibility()) && y0.f(bVar2, bVar);
                            int ordinal = c2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 2) {
                                    if (z2) {
                                        kVar2.c(bVar2, bVar);
                                    }
                                }
                            } else if (z2) {
                                d2.add(bVar2);
                            }
                            arrayList.add(bVar2);
                        }
                        kVar2.d(bVar, d2);
                        linkedHashSet.removeAll(arrayList);
                    } else {
                        a(57);
                        throw null;
                    }
                } else {
                    if (linkedHashSet.size() >= 2) {
                        k b3 = ((e.a.a.a.y0.b.b) linkedHashSet.iterator().next()).b();
                        i.e(linkedHashSet, "$this$all");
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!Boolean.valueOf(((e.a.a.a.y0.b.b) it2.next()).b() == b3).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        for (e.a.a.a.y0.b.b singleton : linkedHashSet) {
                            e(Collections.singleton(singleton), eVar2, kVar2);
                        }
                        return;
                    }
                    LinkedList<e.a.a.a.y0.b.b> linkedList = new LinkedList<>(linkedHashSet);
                    while (!linkedList.isEmpty()) {
                        i.e(linkedList, "descriptors");
                        linkedList.isEmpty();
                        e.a.a.a.y0.b.b bVar3 = null;
                        for (e.a.a.a.y0.b.b bVar4 : linkedList) {
                            if (bVar3 == null || ((b2 = y0.b(bVar3.getVisibility(), bVar4.getVisibility())) != null && b2.intValue() < 0)) {
                                bVar3 = bVar4;
                            }
                        }
                        i.c(bVar3);
                        e(g(bVar3, linkedList, new n(), new o(kVar2, bVar3)), eVar2, kVar2);
                    }
                    return;
                }
            }
        } else {
            a(53);
            throw null;
        }
    }

    public d l(e.a.a.a.y0.b.a aVar, e.a.a.a.y0.b.a aVar2, e eVar) {
        if (aVar == null) {
            a(17);
            throw null;
        } else if (aVar2 != null) {
            d m2 = m(aVar, aVar2, eVar, false);
            if (m2 != null) {
                return m2;
            }
            a(19);
            throw null;
        } else {
            a(18);
            throw null;
        }
    }

    public d m(e.a.a.a.y0.b.a aVar, e.a.a.a.y0.b.a aVar2, e eVar, boolean z) {
        h.a aVar3 = h.a.CONFLICTS_ONLY;
        if (aVar == null) {
            a(20);
            throw null;
        } else if (aVar2 != null) {
            d n2 = n(aVar, aVar2, z);
            boolean z2 = n2.c() == d.a.OVERRIDABLE;
            for (h next : c) {
                if (next.b() != aVar3 && (!z2 || next.b() != h.a.SUCCESS_ONLY)) {
                    int ordinal = next.a(aVar, aVar2, eVar).ordinal();
                    if (ordinal == 0) {
                        z2 = true;
                    } else if (ordinal == 1) {
                        return d.b("External condition failed");
                    } else {
                        if (ordinal == 2) {
                            return d.d("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return n2;
            }
            for (h next2 : c) {
                if (next2.b() == aVar3) {
                    int ordinal2 = next2.a(aVar, aVar2, eVar).ordinal();
                    if (ordinal2 == 0) {
                        StringBuilder y = b.e.a.a.a.y("Contract violation in ");
                        y.append(next2.getClass().getName());
                        y.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(y.toString());
                    } else if (ordinal2 == 1) {
                        return d.b("External condition failed");
                    } else {
                        if (ordinal2 == 2) {
                            return d.d("External condition");
                        }
                    }
                }
            }
            d dVar = d.f9395b;
            if (dVar != null) {
                return dVar;
            }
            d.a(0);
            throw null;
        } else {
            a(21);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7 A[LOOP:1: B:18:0x0061->B:39:0x00c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.j.l.d n(e.a.a.a.y0.b.a r18, e.a.a.a.y0.b.a r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            if (r1 == 0) goto L_0x0167
            if (r2 == 0) goto L_0x0161
            e.a.a.a.y0.j.l$d r4 = i(r18, r19)
            if (r4 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.util.List r4 = d(r18)
            java.util.List r5 = d(r19)
            java.util.List r6 = r18.B()
            java.util.List r7 = r19.B()
            int r8 = r6.size()
            int r9 = r7.size()
            r10 = 0
            if (r8 == r9) goto L_0x005c
        L_0x002d:
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            java.lang.String r3 = "Type parameter number mismatch"
            if (r10 >= r2) goto L_0x0057
            e.a.a.a.y0.m.l1.d r2 = e.a.a.a.y0.m.l1.d.a
            java.lang.Object r1 = r1.get(r10)
            e.a.a.a.y0.m.d0 r1 = (e.a.a.a.y0.m.d0) r1
            r6 = r5
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r10)
            e.a.a.a.y0.m.d0 r6 = (e.a.a.a.y0.m.d0) r6
            boolean r1 = r2.b(r1, r6)
            if (r1 != 0) goto L_0x0054
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.d(r3)
            return r1
        L_0x0054:
            int r10 = r10 + 1
            goto L_0x002d
        L_0x0057:
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.b(r3)
            return r1
        L_0x005c:
            e.a.a.a.y0.m.l1.d r8 = r0.f(r6, r7)
            r9 = r10
        L_0x0061:
            int r11 = r6.size()
            if (r9 >= r11) goto L_0x00d6
            java.lang.Object r11 = r6.get(r9)
            e.a.a.a.y0.b.r0 r11 = (e.a.a.a.y0.b.r0) r11
            java.lang.Object r13 = r7.get(r9)
            e.a.a.a.y0.b.r0 r13 = (e.a.a.a.y0.b.r0) r13
            if (r11 == 0) goto L_0x00d0
            if (r13 == 0) goto L_0x00ca
            java.util.List r11 = r11.getUpperBounds()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = r13.getUpperBounds()
            r14.<init>(r13)
            int r13 = r11.size()
            int r15 = r14.size()
            if (r13 == r15) goto L_0x008f
            goto L_0x00bb
        L_0x008f:
            java.util.Iterator r11 = r11.iterator()
        L_0x0093:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r13 = r11.next()
            e.a.a.a.y0.m.d0 r13 = (e.a.a.a.y0.m.d0) r13
            java.util.ListIterator r15 = r14.listIterator()
        L_0x00a3:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00bb
            java.lang.Object r16 = r15.next()
            r12 = r16
            e.a.a.a.y0.m.d0 r12 = (e.a.a.a.y0.m.d0) r12
            boolean r12 = r0.b(r13, r12, r8)
            if (r12 == 0) goto L_0x00a3
            r15.remove()
            goto L_0x0093
        L_0x00bb:
            r12 = r10
            goto L_0x00be
        L_0x00bd:
            r12 = 1
        L_0x00be:
            if (r12 != 0) goto L_0x00c7
            java.lang.String r1 = "Type parameter bounds mismatch"
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.d(r1)
            return r1
        L_0x00c7:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x00ca:
            r1 = 48
            a(r1)
            throw r3
        L_0x00d0:
            r1 = 47
            a(r1)
            throw r3
        L_0x00d6:
            r6 = r10
        L_0x00d7:
            r7 = r4
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r9 = r7.size()
            if (r6 >= r9) goto L_0x00ff
            java.lang.Object r7 = r7.get(r6)
            e.a.a.a.y0.m.d0 r7 = (e.a.a.a.y0.m.d0) r7
            r9 = r5
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r6)
            e.a.a.a.y0.m.d0 r9 = (e.a.a.a.y0.m.d0) r9
            boolean r7 = r0.b(r7, r9, r8)
            if (r7 != 0) goto L_0x00fc
            java.lang.String r1 = "Value parameter type mismatch"
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.d(r1)
            return r1
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00ff:
            boolean r4 = r1 instanceof e.a.a.a.y0.b.s
            if (r4 == 0) goto L_0x011e
            boolean r4 = r2 instanceof e.a.a.a.y0.b.s
            if (r4 == 0) goto L_0x011e
            r4 = r1
            e.a.a.a.y0.b.s r4 = (e.a.a.a.y0.b.s) r4
            boolean r4 = r4.r0()
            r5 = r2
            e.a.a.a.y0.b.s r5 = (e.a.a.a.y0.b.s) r5
            boolean r5 = r5.r0()
            if (r4 == r5) goto L_0x011e
            java.lang.String r1 = "Incompatible suspendability"
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.b(r1)
            return r1
        L_0x011e:
            if (r20 == 0) goto L_0x0158
            e.a.a.a.y0.m.d0 r1 = r18.f()
            e.a.a.a.y0.m.d0 r2 = r19.f()
            if (r1 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0158
            boolean r4 = b.q.a.a.I1(r2)
            if (r4 == 0) goto L_0x013a
            boolean r4 = b.q.a.a.I1(r1)
            if (r4 == 0) goto L_0x013a
            r12 = 1
            goto L_0x013b
        L_0x013a:
            r12 = r10
        L_0x013b:
            if (r12 != 0) goto L_0x0158
            e.a.a.a.y0.m.l1.f r4 = r0.a
            e.a.a.a.y0.m.d0 r2 = r4.g(r2)
            e.a.a.a.y0.m.l1.f r4 = r0.a
            e.a.a.a.y0.m.d0 r1 = r4.g(r1)
            e.a.a.a.y0.m.l1.e r8 = (e.a.a.a.y0.m.l1.e) r8
            boolean r1 = r8.d(r2, r1)
            if (r1 != 0) goto L_0x0158
            java.lang.String r1 = "Return type mismatch"
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.b(r1)
            return r1
        L_0x0158:
            e.a.a.a.y0.j.l$d r1 = e.a.a.a.y0.j.l.d.f9395b
            if (r1 == 0) goto L_0x015d
            return r1
        L_0x015d:
            e.a.a.a.y0.j.l.d.a(r10)
            throw r3
        L_0x0161:
            r1 = 29
            a(r1)
            throw r3
        L_0x0167:
            r1 = 28
            a(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.l.n(e.a.a.a.y0.b.a, e.a.a.a.y0.b.a, boolean):e.a.a.a.y0.j.l$d");
    }
}
