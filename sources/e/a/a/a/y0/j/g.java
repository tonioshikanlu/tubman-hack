package e.a.a.a.y0.j;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.n;
import e.a.a.a.y0.b.n0;
import e.a.a.a.y0.b.o;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.c;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.v0;
import java.util.Collection;
import java.util.Set;

public class g {
    public static final d a = d.l("values");

    /* renamed from: b  reason: collision with root package name */
    public static final d f9379b = d.l("valueOf");
    public static final b c;
    public static final b d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f9380e;
    public static final b f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f9381g = new b("kotlin.Result");

    static {
        b bVar = new b("kotlin.coroutines");
        c = bVar;
        b c2 = bVar.c(d.l("experimental"));
        d = c2;
        c2.c(d.l("intrinsics"));
        f9380e = c2.c(d.l("Continuation"));
        f = bVar.c(d.l("Continuation"));
        new b("kotlin.jvm.JvmName");
    }

    public static <D extends o> D A(D d2) {
        if (d2 == null) {
            a(57);
            throw null;
        } else if (d2 instanceof e.a.a.a.y0.b.b) {
            return z((e.a.a.a.y0.b.b) d2);
        } else {
            if (d2 != null) {
                return d2;
            }
            a(58);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 76:
            case 77:
            case 79:
            case 82:
            case 87:
            case 89:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 76:
            case 77:
            case 79:
            case 82:
            case 87:
            case 89:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 53:
            case 54:
            case 55:
            case 57:
            case 75:
            case 88:
            case 90:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 76:
            case 77:
            case 79:
            case 82:
            case 87:
            case 89:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 60:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = "other";
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 50:
            case 61:
            case 62:
            case 63:
            case 70:
            case 71:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 51:
                objArr[0] = "innerClassName";
                break;
            case 52:
                objArr[0] = "location";
                break;
            case 59:
                objArr[0] = "variable";
                break;
            case 64:
                objArr[0] = "f";
                break;
            case 66:
                objArr[0] = "current";
                break;
            case 67:
                objArr[0] = "result";
                break;
            case 68:
                objArr[0] = "memberDescriptor";
                break;
            case 72:
            case 73:
            case 74:
                objArr[0] = "annotated";
                break;
            case 78:
            case 80:
            case 83:
            case 85:
                objArr[0] = "scope";
                break;
            case 81:
            case 84:
            case 86:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 20:
                objArr[1] = "getContainingModule";
                break;
            case 38:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 40:
            case 41:
                objArr[1] = "getSuperClassType";
                break;
            case 45:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 47:
            case 48:
            case 49:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 56:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 58:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 76:
            case 77:
                objArr[1] = "getContainingSourceFile";
                break;
            case 79:
                objArr[1] = "getAllDescriptors";
                break;
            case 82:
                objArr[1] = "getFunctionByName";
                break;
            case 87:
                objArr[1] = "getPropertyByName";
                break;
            case 89:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 76:
            case 77:
            case 79:
            case 82:
            case 87:
            case 89:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = "getContainingModule";
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 39:
                objArr[2] = "getSuperClassType";
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 46:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 50:
            case 51:
            case 52:
                objArr[2] = "getInnerClassByName";
                break;
            case 53:
                objArr[2] = "isStaticNestedClass";
                break;
            case 54:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 55:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 57:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 59:
            case 60:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 61:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 62:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 63:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 64:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 66:
            case 67:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 70:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 71:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 72:
                objArr[2] = "getJvmName";
                break;
            case 73:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 74:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 75:
                objArr[2] = "getContainingSourceFile";
                break;
            case 78:
                objArr[2] = "getAllDescriptors";
                break;
            case 80:
            case 81:
                objArr[2] = "getFunctionByName";
                break;
            case 83:
            case 84:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 85:
            case 86:
                objArr[2] = "getPropertyByName";
                break;
            case 88:
                objArr[2] = "getDirectMember";
                break;
            case 90:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 76:
            case 77:
            case 79:
            case 82:
            case 87:
            case 89:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static <D extends a> void b(D d2, Set<D> set) {
        if (d2 == null) {
            a(66);
            throw null;
        } else if (!set.contains(d2)) {
            for (a a2 : d2.a().g()) {
                a a3 = a2.a();
                b(a3, set);
                set.add(a3);
            }
        }
    }

    public static e c(d0 d0Var) {
        if (d0Var != null) {
            v0 W0 = d0Var.W0();
            if (W0 != null) {
                e eVar = (e) W0.d();
                if (eVar != null) {
                    return eVar;
                }
                a(45);
                throw null;
            }
            a(44);
            throw null;
        }
        a(43);
        throw null;
    }

    public static w d(k kVar) {
        if (kVar != null) {
            w e2 = e(kVar);
            if (e2 != null) {
                return e2;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public static w e(k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof w) {
                    return (w) kVar;
                }
                if (kVar instanceof b0) {
                    return ((b0) kVar).n0();
                }
                kVar = kVar.b();
            }
            return null;
        }
        a(21);
        throw null;
    }

    public static n0 f(k kVar) {
        if (kVar != null) {
            if (kVar instanceof h0) {
                kVar = ((h0) kVar).z0();
            }
            if (!(kVar instanceof n)) {
                return n0.a;
            }
            n0 a2 = ((n) kVar).w().a();
            if (a2 != null) {
                return a2;
            }
            a(76);
            throw null;
        }
        a(75);
        throw null;
    }

    public static c g(k kVar) {
        if (kVar != null) {
            b h2 = h(kVar);
            return h2 != null ? h2.j() : i(kVar);
        }
        a(2);
        throw null;
    }

    public static b h(k kVar) {
        if (kVar == null) {
            a(5);
            throw null;
        } else if ((kVar instanceof w) || e.a.a.a.y0.m.w.j(kVar)) {
            return b.c;
        } else {
            if (kVar instanceof b0) {
                return ((b0) kVar).e();
            }
            if (kVar instanceof y) {
                return ((y) kVar).e();
            }
            return null;
        }
    }

    public static c i(k kVar) {
        return g(kVar.b()).c(kVar.getName());
    }

    public static <D extends k> D j(k kVar, Class<D> cls) {
        return k(kVar, cls, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        if (r3 != false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r1 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2.isInstance(r1) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <D extends e.a.a.a.y0.b.k> D k(D r1, java.lang.Class<D> r2, boolean r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0016
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            if (r3 == 0) goto L_0x000c
        L_0x0008:
            e.a.a.a.y0.b.k r1 = r1.b()
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L_0x0008
            return r1
        L_0x0015:
            return r0
        L_0x0016:
            r1 = 17
            a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.g.k(e.a.a.a.y0.b.k, java.lang.Class, boolean):e.a.a.a.y0.b.k");
    }

    public static e l(e eVar) {
        if (eVar != null) {
            for (d0 c2 : eVar.p().h()) {
                e c3 = c(c2);
                if (c3.i() != f.INTERFACE) {
                    return c3;
                }
            }
            return null;
        }
        a(42);
        throw null;
    }

    public static boolean m(k kVar) {
        return s(kVar, f.ANNOTATION_CLASS);
    }

    public static boolean n(k kVar) {
        if (kVar != null) {
            return s(kVar, f.CLASS) && kVar.getName().equals(e.a.a.a.y0.f.f.a);
        }
        a(32);
        throw null;
    }

    public static boolean o(k kVar) {
        return s(kVar, f.CLASS) || q(kVar);
    }

    public static boolean p(k kVar) {
        return s(kVar, f.OBJECT) && ((e) kVar).N();
    }

    public static boolean q(k kVar) {
        return s(kVar, f.ENUM_CLASS);
    }

    public static boolean r(k kVar) {
        if (kVar != null) {
            return s(kVar, f.ENUM_ENTRY);
        }
        a(34);
        throw null;
    }

    public static boolean s(k kVar, f fVar) {
        return (kVar instanceof e) && ((e) kVar).i() == fVar;
    }

    public static boolean t(k kVar) {
        if (kVar != null) {
            while (true) {
                boolean z = false;
                if (kVar == null) {
                    return false;
                }
                if (n(kVar)) {
                    break;
                }
                if ((kVar instanceof o) && ((o) kVar).getVisibility() == y0.f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                kVar = kVar.b();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean u(d0 d0Var, k kVar) {
        if (d0Var == null) {
            a(28);
            throw null;
        } else if (kVar != null) {
            h d2 = d0Var.W0().d();
            if (d2 == null) {
                return false;
            }
            k a2 = d2.a();
            return (a2 instanceof h) && (kVar instanceof h) && ((h) kVar).p().equals(((h) a2).p());
        } else {
            a(29);
            throw null;
        }
    }

    public static boolean v(k kVar) {
        return s(kVar, f.CLASS) && ((e) kVar).q() == v.SEALED;
    }

    public static boolean w(e eVar, e eVar2) {
        return x(eVar.s(), eVar2.a());
    }

    public static boolean x(d0 d0Var, k kVar) {
        if (d0Var == null) {
            a(30);
            throw null;
        } else if (kVar == null) {
            a(31);
            throw null;
        } else if (u(d0Var, kVar)) {
            return true;
        } else {
            for (d0 x : d0Var.W0().h()) {
                if (x(x, kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean y(k kVar) {
        return kVar != null && (kVar.b() instanceof y);
    }

    public static <D extends e.a.a.a.y0.b.b> D z(D d2) {
        if (d2 != null) {
            while (d2.i() == b.a.FAKE_OVERRIDE) {
                Collection g2 = d2.g();
                if (!g2.isEmpty()) {
                    d2 = (e.a.a.a.y0.b.b) g2.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d2);
                }
            }
            return d2;
        }
        a(55);
        throw null;
    }
}
