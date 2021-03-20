package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.p;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.l.j;
import e.a.a.a.y0.m.b1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.o.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class e0 extends p0 implements f0 {
    public i0 A;
    public List<r0> B;
    public f0 C;
    public h0 D;
    public boolean E;
    public p F;
    public p G;

    /* renamed from: o  reason: collision with root package name */
    public final v f8182o;

    /* renamed from: p  reason: collision with root package name */
    public z0 f8183p;

    /* renamed from: q  reason: collision with root package name */
    public Collection<? extends f0> f8184q;
    public final f0 r;
    public final b.a s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public i0 z;

    public class a {
        public k a;

        /* renamed from: b  reason: collision with root package name */
        public v f8185b;
        public z0 c;
        public f0 d = null;

        /* renamed from: e  reason: collision with root package name */
        public b.a f8186e;
        public b1 f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8187g;

        /* renamed from: h  reason: collision with root package name */
        public i0 f8188h;

        /* renamed from: i  reason: collision with root package name */
        public d f8189i;

        /* renamed from: j  reason: collision with root package name */
        public d0 f8190j;

        public a() {
            this.a = e0.this.b();
            this.f8185b = e0.this.q();
            this.c = e0.this.getVisibility();
            this.f8186e = e0.this.i();
            this.f = b1.a;
            this.f8187g = true;
            this.f8188h = e0.this.z;
            this.f8189i = e0.this.getName();
            this.f8190j = e0.this.d();
        }

        public static /* synthetic */ void a(int i2) {
            int i3 = i2;
            String str = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? 2 : 3)];
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 2) {
                objArr[1] = "setOriginal";
            } else if (i3 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i3 == 5) {
                objArr[1] = "setReturnType";
            } else if (i3 == 7) {
                objArr[1] = "setModality";
            } else if (i3 == 9) {
                objArr[1] = "setVisibility";
            } else if (i3 == 11) {
                objArr[1] = "setKind";
            } else if (i3 == 19) {
                objArr[1] = "setName";
            } else if (i3 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i3 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i3 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public f0 b() {
            i0 i0Var;
            h0 h0Var;
            f0 f0Var;
            g0 g0Var;
            j<g<?>> jVar;
            e0 e0Var = e0.this;
            Objects.requireNonNull(e0Var);
            b.a aVar = b.a.FAKE_OVERRIDE;
            q qVar = null;
            k kVar = this.a;
            v vVar = this.f8185b;
            z0 z0Var = this.c;
            f0 f0Var2 = this.d;
            b.a aVar2 = this.f8186e;
            d dVar = this.f8189i;
            m0 m0Var = m0.a;
            e0 P0 = e0Var.P0(kVar, vVar, z0Var, f0Var2, aVar2, dVar, m0Var);
            List<r0> B = e0Var.B();
            ArrayList arrayList = new ArrayList(B.size());
            d1 Z2 = b.q.a.a.Z2(B, this.f, P0, arrayList);
            d0 d0Var = this.f8190j;
            j1 j1Var = j1.OUT_VARIANCE;
            d0 k2 = Z2.k(d0Var, j1Var);
            if (k2 == null) {
                return null;
            }
            i0 i0Var2 = this.f8188h;
            if (i0Var2 != null) {
                i0Var = i0Var2.c(Z2);
                if (i0Var == null) {
                    return null;
                }
            } else {
                i0Var = null;
            }
            i0 i0Var3 = e0Var.A;
            if (i0Var3 != null) {
                d0 k3 = Z2.k(i0Var3.d(), j1.IN_VARIANCE);
                if (k3 == null) {
                    return null;
                }
                h0Var = new h0(P0, new e.a.a.a.y0.j.y.o.b(P0, k3, e0Var.A.getValue()), e0Var.A.k());
            } else {
                h0Var = null;
            }
            P0.W0(k2, arrayList, i0Var, h0Var);
            f0 f0Var3 = e0Var.C;
            if (f0Var3 == null) {
                f0Var = null;
            } else {
                h k4 = f0Var3.k();
                v vVar2 = this.f8185b;
                z0 visibility = e0Var.C.getVisibility();
                if (this.f8186e == aVar && y0.e(visibility.d())) {
                    visibility = y0.f7852h;
                }
                z0 z0Var2 = visibility;
                f0 f0Var4 = e0Var.C;
                boolean z = f0Var4.f8175l;
                boolean z2 = f0Var4.f8176m;
                boolean z3 = f0Var4.f8179p;
                b.a aVar3 = this.f8186e;
                f0 f0Var5 = this.d;
                f0Var = new f0(P0, k4, vVar2, z0Var2, z, z2, z3, aVar3, f0Var5 == null ? null : f0Var5.j(), m0Var);
            }
            if (f0Var != null) {
                f0 f0Var6 = e0Var.C;
                d0 d0Var2 = f0Var6.t;
                f0Var.s = e0.R0(Z2, f0Var6);
                f0Var.R0(d0Var2 != null ? Z2.k(d0Var2, j1Var) : null);
            }
            h0 h0Var2 = e0Var.D;
            if (h0Var2 == null) {
                g0Var = null;
            } else {
                h k5 = h0Var2.k();
                v vVar3 = this.f8185b;
                z0 visibility2 = e0Var.D.getVisibility();
                if (this.f8186e == aVar && y0.e(visibility2.d())) {
                    visibility2 = y0.f7852h;
                }
                z0 z0Var3 = visibility2;
                boolean C0 = e0Var.D.C0();
                boolean J = e0Var.D.J();
                boolean l2 = e0Var.D.l();
                b.a aVar4 = this.f8186e;
                f0 f0Var7 = this.d;
                g0Var = new g0(P0, k5, vVar3, z0Var3, C0, J, l2, aVar4, f0Var7 == null ? null : f0Var7.m(), m0Var);
            }
            if (g0Var != null) {
                List<w0> R0 = r.R0(g0Var, e0Var.D.n(), Z2, false, false, (boolean[]) null);
                if (R0 == null) {
                    P0.E = true;
                    R0 = Collections.singletonList(g0.P0(g0Var, e.a.a.a.y0.j.v.b.f(this.a).o(), e0Var.D.n().get(0).k()));
                }
                if (R0.size() == 1) {
                    g0Var.s = e0.R0(Z2, e0Var.D);
                    g0Var.V0(R0.get(0));
                } else {
                    throw new IllegalStateException();
                }
            }
            p pVar = e0Var.F;
            q qVar2 = pVar == null ? null : new q(pVar.k(), P0);
            p pVar2 = e0Var.G;
            if (pVar2 != null) {
                qVar = new q(pVar2.k(), P0);
            }
            P0.V0(f0Var, g0Var, qVar2, qVar);
            if (this.f8187g) {
                m d2 = m.d();
                for (f0 c2 : e0Var.g()) {
                    d2.add(c2.c(Z2));
                }
                P0.s0(d2);
            }
            if (e0Var.O() && (jVar = e0Var.f8239n) != null) {
                P0.K0(jVar);
            }
            return P0;
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [e.a.a.a.y0.b.f0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0(e.a.a.a.y0.b.k r13, e.a.a.a.y0.b.f0 r14, e.a.a.a.y0.b.a1.h r15, e.a.a.a.y0.b.v r16, e.a.a.a.y0.b.z0 r17, boolean r18, e.a.a.a.y0.f.d r19, e.a.a.a.y0.b.b.a r20, e.a.a.a.y0.b.m0 r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r12 = this;
            r7 = r12
            r8 = r16
            r9 = r17
            r10 = r20
            r11 = 0
            if (r13 == 0) goto L_0x0069
            if (r15 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x005a
            if (r19 == 0) goto L_0x0055
            if (r10 == 0) goto L_0x0050
            if (r21 == 0) goto L_0x004b
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r19
            r5 = r18
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f8184q = r11
            r7.f8182o = r8
            r7.f8183p = r9
            if (r14 != 0) goto L_0x002d
            r0 = r7
            goto L_0x002e
        L_0x002d:
            r0 = r14
        L_0x002e:
            r7.r = r0
            r7.s = r10
            r0 = r22
            r7.t = r0
            r0 = r23
            r7.u = r0
            r0 = r24
            r7.v = r0
            r0 = r25
            r7.w = r0
            r0 = r26
            r7.x = r0
            r0 = r27
            r7.y = r0
            return
        L_0x004b:
            r0 = 6
            c0(r0)
            throw r11
        L_0x0050:
            r0 = 5
            c0(r0)
            throw r11
        L_0x0055:
            r0 = 4
            c0(r0)
            throw r11
        L_0x005a:
            r0 = 3
            c0(r0)
            throw r11
        L_0x005f:
            r0 = 2
            c0(r0)
            throw r11
        L_0x0064:
            r0 = 1
            c0(r0)
            throw r11
        L_0x0069:
            r0 = 0
            c0(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.c1.e0.<init>(e.a.a.a.y0.b.k, e.a.a.a.y0.b.f0, e.a.a.a.y0.b.a1.h, e.a.a.a.y0.b.v, e.a.a.a.y0.b.z0, boolean, e.a.a.a.y0.f.d, e.a.a.a.y0.b.b$a, e.a.a.a.y0.b.m0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static s R0(d1 d1Var, e.a.a.a.y0.b.e0 e0Var) {
        if (e0Var == null) {
            c0(26);
            throw null;
        } else if (e0Var.G() != null) {
            return e0Var.G().c(d1Var);
        } else {
            return null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        if (!(i2 == 23 || i2 == 33 || i2 == 34 || i2 == 36 || i2 == 37)) {
            switch (i2) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i2 == 23 || i2 == 33 || i2 == 34 || i2 == 36 || i2 == 37)) {
            switch (i2) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 16:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 30:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 32:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "outType";
                break;
            case 15:
                objArr[0] = "typeParameters";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 33:
            case 34:
            case 36:
            case 37:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
                objArr[0] = "copyConfiguration";
                break;
            case 25:
                objArr[0] = "substitutor";
                break;
            case 26:
                objArr[0] = "accessorDescriptor";
                break;
            case 27:
                objArr[0] = "newOwner";
                break;
            case 28:
                objArr[0] = "newModality";
                break;
            case 29:
                objArr[0] = "newVisibility";
                break;
            case 31:
                objArr[0] = "newName";
                break;
            case 35:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 23) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i2 == 33) {
            objArr[1] = "getOriginal";
        } else if (i2 == 34) {
            objArr[1] = "getKind";
        } else if (i2 == 36) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 != 37) {
            switch (i2) {
                case 17:
                    objArr[1] = "getTypeParameters";
                    break;
                case 18:
                    objArr[1] = "getReturnType";
                    break;
                case 19:
                    objArr[1] = "getModality";
                    break;
                case 20:
                    objArr[1] = "getVisibility";
                    break;
                case 21:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
            case 15:
                objArr[2] = "setType";
                break;
            case 16:
                objArr[2] = "setVisibility";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 33:
            case 34:
            case 36:
            case 37:
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "doSubstitute";
                break;
            case 25:
            case 26:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 35:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i2 == 23 || i2 == 33 || i2 == 34 || i2 == 36 || i2 == 37)) {
            switch (i2) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public List<r0> B() {
        List<r0> list = this.B;
        if (list != null) {
            return list;
        }
        StringBuilder y2 = b.e.a.a.a.y("typeParameters == null for ");
        y2.append(m.e0(this));
        throw new IllegalStateException(y2.toString());
    }

    public List<e.a.a.a.y0.b.e0> D() {
        ArrayList arrayList = new ArrayList(2);
        f0 f0Var = this.C;
        if (f0Var != null) {
            arrayList.add(f0Var);
        }
        h0 h0Var = this.D;
        if (h0Var != null) {
            arrayList.add(h0Var);
        }
        return arrayList;
    }

    public boolean J() {
        return this.x;
    }

    public boolean J0() {
        return this.w;
    }

    public i0 K() {
        return this.z;
    }

    public boolean O() {
        return this.u;
    }

    public b O0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z2) {
        a aVar2 = new a();
        aVar2.a = kVar;
        aVar2.d = null;
        if (vVar != null) {
            aVar2.f8185b = vVar;
            if (z0Var != null) {
                aVar2.c = z0Var;
                aVar2.f8186e = aVar;
                aVar2.f8187g = z2;
                f0 b2 = aVar2.b();
                if (b2 != null) {
                    return b2;
                }
                c0(37);
                throw null;
            }
            a.a(8);
            throw null;
        }
        a.a(6);
        throw null;
    }

    public e0 P0(k kVar, v vVar, z0 z0Var, f0 f0Var, b.a aVar, d dVar, m0 m0Var) {
        if (kVar == null) {
            c0(27);
            throw null;
        } else if (vVar == null) {
            c0(28);
            throw null;
        } else if (z0Var == null) {
            c0(29);
            throw null;
        } else if (aVar == null) {
            c0(30);
            throw null;
        } else if (dVar != null) {
            return new e0(kVar, f0Var, k(), vVar, z0Var, this.f8238m, dVar, aVar, m0Var, this.t, O(), this.v, this.w, J(), this.y);
        } else {
            c0(31);
            throw null;
        }
    }

    public i0 U() {
        return this.A;
    }

    public void V0(f0 f0Var, h0 h0Var, p pVar, p pVar2) {
        this.C = f0Var;
        this.D = h0Var;
        this.F = pVar;
        this.G = pVar2;
    }

    public p W() {
        return this.G;
    }

    public void W0(d0 d0Var, List<? extends r0> list, i0 i0Var, i0 i0Var2) {
        if (d0Var == null) {
            c0(14);
            throw null;
        } else if (list != null) {
            this.f8229l = d0Var;
            this.B = new ArrayList(list);
            this.A = i0Var2;
            this.z = i0Var;
        } else {
            c0(15);
            throw null;
        }
    }

    public f0 a() {
        f0 f0Var = this.r;
        f0 a2 = f0Var == this ? this : f0Var.a();
        if (a2 != null) {
            return a2;
        }
        c0(33);
        throw null;
    }

    public f0 c(d1 d1Var) {
        if (d1Var == null) {
            c0(22);
            throw null;
        } else if (d1Var.h()) {
            return this;
        } else {
            a aVar = new a();
            b1 g2 = d1Var.g();
            if (g2 != null) {
                aVar.f = g2;
                aVar.d = w0();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
    }

    public p d0() {
        return this.F;
    }

    public d0 f() {
        d0 d = d();
        if (d != null) {
            return d;
        }
        c0(18);
        throw null;
    }

    public Collection<? extends f0> g() {
        Collection<? extends f0> collection = this.f8184q;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        c0(36);
        throw null;
    }

    public z0 getVisibility() {
        z0 z0Var = this.f8183p;
        if (z0Var != null) {
            return z0Var;
        }
        c0(20);
        throw null;
    }

    public boolean h0() {
        return this.t;
    }

    public b.a i() {
        b.a aVar = this.s;
        if (aVar != null) {
            return aVar;
        }
        c0(34);
        throw null;
    }

    public g0 j() {
        return this.C;
    }

    public <R, D> R l0(e.a.a.a.y0.b.m<R, D> mVar, D d) {
        return mVar.i(this, d);
    }

    public h0 m() {
        return this.D;
    }

    public boolean m0() {
        return this.v;
    }

    public boolean p0() {
        return this.y;
    }

    public v q() {
        v vVar = this.f8182o;
        if (vVar != null) {
            return vVar;
        }
        c0(19);
        throw null;
    }

    public void s0(Collection<? extends b> collection) {
        if (collection != null) {
            this.f8184q = collection;
        } else {
            c0(35);
            throw null;
        }
    }
}
