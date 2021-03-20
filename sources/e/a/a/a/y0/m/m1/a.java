package e.a.a.a.y0.m.m1;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i0;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.w;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class a extends i0 {

    /* renamed from: e.a.a.a.y0.m.m1.a$a  reason: collision with other inner class name */
    public class C0226a implements s.a<l0> {
        public C0226a() {
        }

        public static /* synthetic */ void a(int i2) {
            String str;
            int i3;
            Throwable th;
            int i4 = i2;
            if (!(i4 == 1 || i4 == 3 || i4 == 5 || i4 == 10 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 18 || i4 == 30 || i4 == 7 || i4 == 8)) {
                switch (i4) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i4 == 1 || i4 == 3 || i4 == 5 || i4 == 10 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 18 || i4 == 30 || i4 == 7 || i4 == 8)) {
                switch (i4) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        i3 = 3;
                        break;
                }
            }
            i3 = 2;
            Object[] objArr = new Object[i3];
            switch (i4) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                    break;
                case 2:
                    objArr[0] = "modality";
                    break;
                case 4:
                    objArr[0] = "visibility";
                    break;
                case 6:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 11:
                case 17:
                    objArr[0] = "parameters";
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "userDataKey";
                    break;
                case 19:
                    objArr[0] = "type";
                    break;
                case 29:
                    objArr[0] = "additionalAnnotations";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i4 == 1) {
                objArr[1] = "setOwner";
            } else if (i4 == 3) {
                objArr[1] = "setModality";
            } else if (i4 == 5) {
                objArr[1] = "setVisibility";
            } else if (i4 == 10) {
                objArr[1] = "setName";
            } else if (i4 == 12) {
                objArr[1] = "setValueParameters";
            } else if (i4 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i4 == 16) {
                objArr[1] = "putUserData";
            } else if (i4 == 18) {
                objArr[1] = "setTypeParameters";
            } else if (i4 == 30) {
                objArr[1] = "setAdditionalAnnotations";
            } else if (i4 == 7) {
                objArr[1] = "setKind";
            } else if (i4 != 8) {
                switch (i4) {
                    case 20:
                        objArr[1] = "setReturnType";
                        break;
                    case 21:
                        objArr[1] = "setExtensionReceiverParameter";
                        break;
                    case 22:
                        objArr[1] = "setDispatchReceiverParameter";
                        break;
                    case 23:
                        objArr[1] = "setOriginal";
                        break;
                    case 24:
                        objArr[1] = "setSignatureChange";
                        break;
                    case 25:
                        objArr[1] = "setPreserveSourceElement";
                        break;
                    case 26:
                        objArr[1] = "setDropOriginalInContainingParts";
                        break;
                    case 27:
                        objArr[1] = "setHiddenToOvercomeSignatureClash";
                        break;
                    case 28:
                        objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                }
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i4) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    break;
                case 2:
                    objArr[2] = "setModality";
                    break;
                case 4:
                    objArr[2] = "setVisibility";
                    break;
                case 6:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setName";
                    break;
                case 11:
                    objArr[2] = "setValueParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "putUserData";
                    break;
                case 17:
                    objArr[2] = "setTypeParameters";
                    break;
                case 19:
                    objArr[2] = "setReturnType";
                    break;
                case 29:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i4 == 1 || i4 == 3 || i4 == 5 || i4 == 10 || i4 == 12 || i4 == 14 || i4 == 16 || i4 == 18 || i4 == 30 || i4 == 7 || i4 == 8)) {
                switch (i4) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public s e() {
            return a.this;
        }

        public s.a<l0> f(List<w0> list) {
            return this;
        }

        public s.a<l0> g(z0 z0Var) {
            if (z0Var != null) {
                return this;
            }
            a(4);
            throw null;
        }

        public s.a<l0> h(b1 b1Var) {
            if (b1Var != null) {
                return this;
            }
            a(13);
            throw null;
        }

        public s.a<l0> i(List<r0> list) {
            return this;
        }

        public s.a<l0> j(k kVar) {
            if (kVar != null) {
                return this;
            }
            a(0);
            throw null;
        }

        public s.a<l0> k() {
            return this;
        }

        public s.a<l0> l(v vVar) {
            if (vVar != null) {
                return this;
            }
            a(2);
            throw null;
        }

        public s.a<l0> m(b.a aVar) {
            if (aVar != null) {
                return this;
            }
            a(6);
            throw null;
        }

        public s.a<l0> n(e.a.a.a.y0.b.i0 i0Var) {
            return this;
        }

        public s.a<l0> o() {
            return this;
        }

        public s.a<l0> p(h hVar) {
            if (hVar != null) {
                return this;
            }
            a(29);
            throw null;
        }

        public s.a<l0> q(d0 d0Var) {
            if (d0Var != null) {
                return this;
            }
            a(19);
            throw null;
        }

        public s.a<l0> r(d dVar) {
            if (dVar != null) {
                return this;
            }
            a(9);
            throw null;
        }

        public s.a<l0> s(b bVar) {
            return this;
        }

        public s.a<l0> t() {
            return this;
        }

        public s.a<l0> u(boolean z) {
            return this;
        }

        public s.a<l0> v() {
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar, w.d dVar) {
        super(eVar, (l0) null, h.a.a, d.n("<ERROR FUNCTION>"), b.a.DECLARATION, m0.a);
        if (eVar == null) {
            c0(0);
            throw null;
        } else if (dVar != null) {
            Objects.requireNonNull(h.f7785e);
        } else {
            c0(1);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 6 || i2 == 7) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 6) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 6 || i2 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public r K0(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            c0(2);
            throw null;
        } else if (aVar == null) {
            c0(3);
            throw null;
        } else if (hVar == null) {
            c0(4);
            throw null;
        } else if (m0Var != null) {
            return this;
        } else {
            c0(5);
            throw null;
        }
    }

    public b O0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        return this;
    }

    public <V> V P(a.C0139a<V> aVar) {
        return null;
    }

    public l0 b1(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        return this;
    }

    public boolean r0() {
        return false;
    }

    public void s0(Collection<? extends b> collection) {
        if (collection == null) {
            c0(8);
            throw null;
        }
    }

    public s w0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        return this;
    }

    public s.a<? extends l0> x() {
        return new C0226a();
    }
}
