package e.a.a.a.y0.i;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.c1.c0;
import e.a.a.a.y0.b.c1.t;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.e0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.n;
import e.a.a.a.y0.b.p;
import e.a.a.a.y0.b.q0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.u;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.x0;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.i.c;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.j.t.t;
import e.a.a.a.y0.k.b.g0.l;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.a.a.a.y0.m.h1;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.y0;
import e.f;
import e.h;
import e.r;
import e.x.c.i;
import e.x.c.q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class d extends c implements i {
    public final f c = b.q.a.a.h2(new c(this));
    public final j d;

    public final class a implements m<r, StringBuilder> {
        public a() {
        }

        public Object a(e eVar, Object obj) {
            e.a.a.a.y0.b.d x0;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            i.e(eVar, "descriptor");
            i.e(sb, "builder");
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            boolean z = eVar.i() == e.a.a.a.y0.b.f.ENUM_ENTRY;
            if (!dVar.J()) {
                dVar.R(sb, eVar, (e.a.a.a.y0.b.a1.e) null);
                if (!z) {
                    z0 visibility = eVar.getVisibility();
                    i.d(visibility, "klass.visibility");
                    dVar.v0(visibility, sb);
                }
                if (!(eVar.i() == e.a.a.a.y0.b.f.INTERFACE && eVar.q() == v.ABSTRACT)) {
                    e.a.a.a.y0.b.f i2 = eVar.i();
                    i.d(i2, "klass.kind");
                    if (!i2.d() || eVar.q() != v.FINAL) {
                        v q2 = eVar.q();
                        i.d(q2, "klass.modality");
                        dVar.b0(q2, sb, dVar.P(eVar));
                    }
                }
                dVar.Z(eVar, sb);
                dVar.d0(sb, dVar.G().contains(h.INNER) && eVar.t(), "inner");
                dVar.d0(sb, dVar.G().contains(h.DATA) && eVar.S0(), "data");
                dVar.d0(sb, dVar.G().contains(h.INLINE) && eVar.l(), "inline");
                dVar.d0(sb, dVar.G().contains(h.FUN) && eVar.V(), "fun");
                i.e(eVar, "classifier");
                if (eVar instanceof q0) {
                    str = "typealias";
                } else if (eVar.N()) {
                    str = "companion object";
                } else {
                    int ordinal = eVar.i().ordinal();
                    if (ordinal == 0) {
                        str = "class";
                    } else if (ordinal == 1) {
                        str = "interface";
                    } else if (ordinal == 2) {
                        str = "enum class";
                    } else if (ordinal == 3) {
                        str = "enum entry";
                    } else if (ordinal == 4) {
                        str = "annotation class";
                    } else if (ordinal == 5) {
                        str = "object";
                    } else {
                        throw new h();
                    }
                }
                sb.append(dVar.X(str));
            }
            if (!g.p(eVar)) {
                if (!dVar.J()) {
                    dVar.m0(sb);
                }
                dVar.e0(eVar, sb, true);
            } else {
                j jVar = dVar.d;
                if (((Boolean) jVar.F.b(jVar, j.W[30])).booleanValue()) {
                    if (dVar.J()) {
                        sb.append("companion object");
                    }
                    dVar.m0(sb);
                    k b2 = eVar.b();
                    if (b2 != null) {
                        sb.append("of ");
                        e.a.a.a.y0.f.d name = b2.getName();
                        i.d(name, "containingDeclaration.name");
                        sb.append(dVar.v(name, false));
                    }
                }
                if (dVar.M() || (!i.a(eVar.getName(), e.a.a.a.y0.f.f.f9212b))) {
                    if (!dVar.J()) {
                        dVar.m0(sb);
                    }
                    e.a.a.a.y0.f.d name2 = eVar.getName();
                    i.d(name2, "descriptor.name");
                    sb.append(dVar.v(name2, true));
                }
            }
            if (!z) {
                List<r0> A = eVar.A();
                i.d(A, "klass.declaredTypeParameters");
                dVar.r0(A, sb, false);
                dVar.T(eVar, sb);
                e.a.a.a.y0.b.f i3 = eVar.i();
                i.d(i3, "klass.kind");
                if (!i3.d()) {
                    j jVar2 = dVar.d;
                    if (((Boolean) jVar2.f9348i.b(jVar2, j.W[7])).booleanValue() && (x0 = eVar.x0()) != null) {
                        sb.append(" ");
                        dVar.R(sb, x0, (e.a.a.a.y0.b.a1.e) null);
                        z0 visibility2 = x0.getVisibility();
                        i.d(visibility2, "primaryConstructor.visibility");
                        dVar.v0(visibility2, sb);
                        sb.append(dVar.X("constructor"));
                        List<w0> n2 = x0.n();
                        i.d(n2, "primaryConstructor.valueParameters");
                        dVar.u0(n2, x0.b0(), sb);
                    }
                }
                j jVar3 = dVar.d;
                if (!((Boolean) jVar3.w.b(jVar3, j.W[21])).booleanValue() && !e.a.a.a.y0.a.g.G(eVar.s())) {
                    v0 p2 = eVar.p();
                    i.d(p2, "klass.typeConstructor");
                    Collection<d0> h2 = p2.h();
                    i.d(h2, "klass.typeConstructor.supertypes");
                    if (!h2.isEmpty() && (h2.size() != 1 || !e.a.a.a.y0.a.g.z(h2.iterator().next()))) {
                        dVar.m0(sb);
                        sb.append(": ");
                        e.t.g.v(h2, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new g(dVar), 60);
                    }
                }
                dVar.w0(A, sb);
            }
            return r.a;
        }

        public Object b(g0 g0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(g0Var, "descriptor");
            i.e(sb, "builder");
            o(g0Var, sb, "getter");
            return r.a;
        }

        public /* bridge */ /* synthetic */ Object c(s sVar, Object obj) {
            n(sVar, (StringBuilder) obj);
            return r.a;
        }

        public Object d(b0 b0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(b0Var, "descriptor");
            i.e(sb, "builder");
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            t tVar = (t) b0Var;
            dVar.i0(tVar.f8269m, "package", sb);
            if (dVar.m()) {
                sb.append(" in context of ");
                dVar.e0(tVar.f8268l, sb, false);
            }
            return r.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0042, code lost:
            if (r4.q() != e.a.a.a.y0.b.v.SEALED) goto L_0x0044;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e(e.a.a.a.y0.b.j r21, java.lang.Object r22) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.String r2 = "constructorDescriptor"
                e.x.c.i.e(r0, r2)
                java.lang.String r2 = "builder"
                e.x.c.i.e(r1, r2)
                r2 = r20
                e.a.a.a.y0.i.d r3 = e.a.a.a.y0.i.d.this
                r4 = 0
                r3.R(r1, r0, r4)
                e.a.a.a.y0.i.j r4 = r3.d
                e.y.b r5 = r4.f9354o
                e.a.l[] r6 = e.a.a.a.y0.i.j.W
                r7 = 13
                r7 = r6[r7]
                java.lang.Object r4 = r5.b(r4, r7)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r5 = 0
                r7 = 1
                if (r4 != 0) goto L_0x0044
                r4 = r0
                e.a.a.a.y0.b.c1.i r4 = (e.a.a.a.y0.b.c1.i) r4
                e.a.a.a.y0.b.e r4 = r4.T()
                java.lang.String r8 = "constructor.constructedClass"
                e.x.c.i.d(r4, r8)
                e.a.a.a.y0.b.v r4 = r4.q()
                e.a.a.a.y0.b.v r8 = e.a.a.a.y0.b.v.SEALED
                if (r4 == r8) goto L_0x0058
            L_0x0044:
                r4 = r0
                e.a.a.a.y0.b.c1.r r4 = (e.a.a.a.y0.b.c1.r) r4
                e.a.a.a.y0.b.z0 r4 = r4.getVisibility()
                java.lang.String r8 = "constructor.visibility"
                e.x.c.i.d(r4, r8)
                boolean r4 = r3.v0(r4, r1)
                if (r4 == 0) goto L_0x0058
                r4 = r7
                goto L_0x0059
            L_0x0058:
                r4 = r5
            L_0x0059:
                r3.Y(r0, r1)
                e.a.a.a.y0.i.j r8 = r3.d
                e.y.b r9 = r8.O
                r10 = 39
                r10 = r6[r10]
                java.lang.Object r8 = r9.b(r8, r10)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x007c
                r8 = r0
                e.a.a.a.y0.b.c1.i r8 = (e.a.a.a.y0.b.c1.i) r8
                boolean r8 = r8.K
                if (r8 == 0) goto L_0x007c
                if (r4 == 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                r4 = r5
                goto L_0x007d
            L_0x007c:
                r4 = r7
            L_0x007d:
                if (r4 == 0) goto L_0x0088
                java.lang.String r8 = "constructor"
                java.lang.String r8 = r3.X(r8)
                r1.append(r8)
            L_0x0088:
                r8 = r0
                e.a.a.a.y0.b.c1.i r8 = (e.a.a.a.y0.b.c1.i) r8
                e.a.a.a.y0.b.e r9 = r8.b()
                java.lang.String r10 = "constructor.containingDeclaration"
                e.x.c.i.d(r9, r10)
                boolean r10 = r3.H()
                java.lang.String r11 = "constructor.typeParameters"
                if (r10 == 0) goto L_0x00b3
                if (r4 == 0) goto L_0x00a3
                java.lang.String r4 = " "
                r1.append(r4)
            L_0x00a3:
                r3.e0(r9, r1, r7)
                r4 = r0
                e.a.a.a.y0.b.c1.r r4 = (e.a.a.a.y0.b.c1.r) r4
                java.util.List r4 = r4.B()
                e.x.c.i.d(r4, r11)
                r3.r0(r4, r1, r5)
            L_0x00b3:
                r4 = r0
                e.a.a.a.y0.b.c1.r r4 = (e.a.a.a.y0.b.c1.r) r4
                java.util.List r10 = r4.n()
                java.lang.String r12 = "constructor.valueParameters"
                e.x.c.i.d(r10, r12)
                boolean r0 = r21.b0()
                r3.u0(r10, r0, r1)
                e.a.a.a.y0.i.j r0 = r3.d
                e.y.b r10 = r0.f9356q
                r12 = 15
                r6 = r6[r12]
                java.lang.Object r0 = r10.b(r0, r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0142
                boolean r0 = r8.K
                if (r0 != 0) goto L_0x0142
                e.a.a.a.y0.b.d r0 = r9.x0()
                if (r0 == 0) goto L_0x0142
                java.util.List r0 = r0.n()
                java.lang.String r6 = "primaryConstructor.valueParameters"
                e.x.c.i.d(r0, r6)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x00f6:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0118
                java.lang.Object r6 = r0.next()
                r8 = r6
                e.a.a.a.y0.b.w0 r8 = (e.a.a.a.y0.b.w0) r8
                boolean r9 = r8.k0()
                if (r9 != 0) goto L_0x0111
                e.a.a.a.y0.m.d0 r8 = r8.R()
                if (r8 != 0) goto L_0x0111
                r8 = r7
                goto L_0x0112
            L_0x0111:
                r8 = r5
            L_0x0112:
                if (r8 == 0) goto L_0x00f6
                r12.add(r6)
                goto L_0x00f6
            L_0x0118:
                boolean r0 = r12.isEmpty()
                r0 = r0 ^ r7
                if (r0 == 0) goto L_0x0142
                java.lang.String r0 = " : "
                r1.append(r0)
                java.lang.String r0 = "this"
                java.lang.String r0 = r3.X(r0)
                r1.append(r0)
                r16 = 0
                r17 = 0
                e.a.a.a.y0.i.f r18 = e.a.a.a.y0.i.f.f9332h
                r19 = 24
                java.lang.String r13 = ", "
                java.lang.String r14 = "("
                java.lang.String r15 = ")"
                java.lang.String r0 = e.t.g.x(r12, r13, r14, r15, r16, r17, r18, r19)
                r1.append(r0)
            L_0x0142:
                boolean r0 = r3.H()
                if (r0 == 0) goto L_0x0152
                java.util.List r0 = r4.B()
                e.x.c.i.d(r0, r11)
                r3.w0(r0, r1)
            L_0x0152:
                e.r r0 = e.r.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.a.e(e.a.a.a.y0.b.j, java.lang.Object):java.lang.Object");
        }

        public Object f(h0 h0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(h0Var, "descriptor");
            i.e(sb, "builder");
            o(h0Var, sb, "setter");
            return r.a;
        }

        public Object g(w wVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(wVar, "descriptor");
            i.e(sb, "builder");
            d.this.e0(wVar, sb, true);
            return r.a;
        }

        public Object h(w0 w0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(w0Var, "descriptor");
            i.e(sb, "builder");
            d.this.t0(w0Var, true, sb, true);
            return r.a;
        }

        public Object i(f0 f0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(f0Var, "descriptor");
            i.e(sb, "builder");
            d.y(d.this, f0Var, sb);
            return r.a;
        }

        public Object j(q0 q0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(q0Var, "descriptor");
            i.e(sb, "builder");
            d dVar = d.this;
            dVar.R(sb, q0Var, (e.a.a.a.y0.b.a1.e) null);
            e.a.a.a.y0.b.c1.f fVar = (e.a.a.a.y0.b.c1.f) q0Var;
            z0 z0Var = fVar.f8194n;
            i.d(z0Var, "typeAlias.visibility");
            dVar.v0(z0Var, sb);
            dVar.Z(q0Var, sb);
            sb.append(dVar.X("typealias"));
            sb.append(" ");
            dVar.e0(q0Var, sb, true);
            List<r0> A = fVar.A();
            i.d(A, "typeAlias.declaredTypeParameters");
            dVar.r0(A, sb, false);
            dVar.T(q0Var, sb);
            sb.append(" = ");
            sb.append(dVar.w(((l) q0Var).L()));
            return r.a;
        }

        public Object k(i0 i0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(i0Var, "descriptor");
            i.e(sb, "builder");
            sb.append(((e.a.a.a.y0.b.c1.m) i0Var).getName());
            return r.a;
        }

        public Object l(r0 r0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(r0Var, "descriptor");
            i.e(sb, "builder");
            d.this.p0(r0Var, sb, true);
            return r.a;
        }

        public Object m(y yVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            i.e(yVar, "descriptor");
            i.e(sb, "builder");
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            c0 c0Var = (c0) yVar;
            dVar.i0(c0Var.f8173l, "package-fragment", sb);
            if (dVar.m()) {
                sb.append(" in ");
                dVar.e0(c0Var.b(), sb, false);
            }
            return r.a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void n(e.a.a.a.y0.b.s r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.String r0 = "descriptor"
                e.x.c.i.e(r10, r0)
                java.lang.String r0 = "builder"
                e.x.c.i.e(r11, r0)
                e.a.a.a.y0.i.d r0 = e.a.a.a.y0.i.d.this
                boolean r1 = r0.J()
                java.lang.String r2 = "function.typeParameters"
                r3 = 1
                if (r1 != 0) goto L_0x0120
                boolean r1 = r0.I()
                if (r1 != 0) goto L_0x0105
                r1 = 0
                r0.R(r11, r10, r1)
                e.a.a.a.y0.b.z0 r1 = r10.getVisibility()
                java.lang.String r4 = "function.visibility"
                e.x.c.i.d(r1, r4)
                r0.v0(r1, r11)
                r0.c0(r10, r11)
                boolean r1 = r0.F()
                if (r1 == 0) goto L_0x0037
                r0.Z(r10, r11)
            L_0x0037:
                r0.h0(r10, r11)
                boolean r1 = r0.F()
                java.lang.String r4 = "suspend"
                if (r1 == 0) goto L_0x00df
                boolean r1 = r10.u0()
                java.lang.String r5 = "it"
                java.lang.String r6 = "functionDescriptor.overriddenDescriptors"
                r7 = 0
                if (r1 == 0) goto L_0x0081
                java.util.Collection r1 = r10.g()
                e.x.c.i.d(r1, r6)
                boolean r8 = r1.isEmpty()
                if (r8 == 0) goto L_0x005b
                goto L_0x0076
            L_0x005b:
                java.util.Iterator r1 = r1.iterator()
            L_0x005f:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L_0x0076
                java.lang.Object r8 = r1.next()
                e.a.a.a.y0.b.s r8 = (e.a.a.a.y0.b.s) r8
                e.x.c.i.d(r8, r5)
                boolean r8 = r8.u0()
                if (r8 == 0) goto L_0x005f
                r1 = r7
                goto L_0x0077
            L_0x0076:
                r1 = r3
            L_0x0077:
                if (r1 != 0) goto L_0x007f
                boolean r1 = r0.C()
                if (r1 == 0) goto L_0x0081
            L_0x007f:
                r1 = r3
                goto L_0x0082
            L_0x0081:
                r1 = r7
            L_0x0082:
                boolean r8 = r10.N0()
                if (r8 == 0) goto L_0x00bb
                java.util.Collection r8 = r10.g()
                e.x.c.i.d(r8, r6)
                boolean r6 = r8.isEmpty()
                if (r6 == 0) goto L_0x0096
                goto L_0x00b1
            L_0x0096:
                java.util.Iterator r6 = r8.iterator()
            L_0x009a:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00b1
                java.lang.Object r8 = r6.next()
                e.a.a.a.y0.b.s r8 = (e.a.a.a.y0.b.s) r8
                e.x.c.i.d(r8, r5)
                boolean r8 = r8.N0()
                if (r8 == 0) goto L_0x009a
                r5 = r7
                goto L_0x00b2
            L_0x00b1:
                r5 = r3
            L_0x00b2:
                if (r5 != 0) goto L_0x00ba
                boolean r5 = r0.C()
                if (r5 == 0) goto L_0x00bb
            L_0x00ba:
                r7 = r3
            L_0x00bb:
                boolean r5 = r10.t0()
                java.lang.String r6 = "tailrec"
                r0.d0(r11, r5, r6)
                boolean r5 = r10.r0()
                r0.d0(r11, r5, r4)
                boolean r4 = r10.l()
                java.lang.String r5 = "inline"
                r0.d0(r11, r4, r5)
                java.lang.String r4 = "infix"
                r0.d0(r11, r7, r4)
                java.lang.String r4 = "operator"
                r0.d0(r11, r1, r4)
                goto L_0x00e6
            L_0x00df:
                boolean r1 = r10.r0()
                r0.d0(r11, r1, r4)
            L_0x00e6:
                r0.Y(r10, r11)
                boolean r1 = r0.M()
                if (r1 == 0) goto L_0x0105
                boolean r1 = r10.q0()
                if (r1 == 0) goto L_0x00fa
                java.lang.String r1 = "/*isHiddenToOvercomeSignatureClash*/ "
                r11.append(r1)
            L_0x00fa:
                boolean r1 = r10.D0()
                if (r1 == 0) goto L_0x0105
                java.lang.String r1 = "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "
                r11.append(r1)
            L_0x0105:
                java.lang.String r1 = "fun"
                java.lang.String r1 = r0.X(r1)
                r11.append(r1)
                java.lang.String r1 = " "
                r11.append(r1)
                java.util.List r1 = r10.B()
                e.x.c.i.d(r1, r2)
                r0.r0(r1, r11, r3)
                r0.k0(r10, r11)
            L_0x0120:
                r0.e0(r10, r11, r3)
                java.util.List r1 = r10.n()
                java.lang.String r3 = "function.valueParameters"
                e.x.c.i.d(r1, r3)
                boolean r3 = r10.b0()
                r0.u0(r1, r3, r11)
                r0.l0(r10, r11)
                e.a.a.a.y0.m.d0 r1 = r10.f()
                e.a.a.a.y0.i.j r3 = r0.d
                e.y.b r4 = r3.f9351l
                e.a.l[] r5 = e.a.a.a.y0.i.j.W
                r6 = 10
                r6 = r5[r6]
                java.lang.Object r3 = r4.b(r3, r6)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x017d
                e.a.a.a.y0.i.j r3 = r0.d
                e.y.b r4 = r3.f9350k
                r6 = 9
                r5 = r5[r6]
                java.lang.Object r3 = r4.b(r3, r5)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x016c
                if (r1 == 0) goto L_0x016c
                boolean r3 = e.a.a.a.y0.a.g.O(r1)
                if (r3 != 0) goto L_0x017d
            L_0x016c:
                java.lang.String r3 = ": "
                r11.append(r3)
                if (r1 != 0) goto L_0x0176
                java.lang.String r1 = "[NULL]"
                goto L_0x017a
            L_0x0176:
                java.lang.String r1 = r0.w(r1)
            L_0x017a:
                r11.append(r1)
            L_0x017d:
                java.util.List r10 = r10.B()
                e.x.c.i.d(r10, r2)
                r0.w0(r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.a.n(e.a.a.a.y0.b.s, java.lang.StringBuilder):void");
        }

        public final void o(e0 e0Var, StringBuilder sb, String str) {
            j jVar = d.this.d;
            int ordinal = ((p) jVar.G.b(jVar, j.W[31])).ordinal();
            if (ordinal == 0) {
                d.this.Z(e0Var, sb);
                sb.append(str + " for ");
                d dVar = d.this;
                f0 z0 = e0Var.z0();
                i.d(z0, "descriptor.correspondingProperty");
                d.y(dVar, z0, sb);
            } else if (ordinal == 1) {
                n(e0Var, sb);
            }
        }
    }

    public static final class b extends e.x.c.k implements e.x.b.l<y0, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f9328h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f9328h = dVar;
        }

        public Object invoke(Object obj) {
            y0 y0Var = (y0) obj;
            i.e(y0Var, "it");
            if (y0Var.c()) {
                return "*";
            }
            d dVar = this.f9328h;
            d0 d = y0Var.d();
            i.d(d, "it.type");
            String w = dVar.w(d);
            if (y0Var.b() == j1.INVARIANT) {
                return w;
            }
            return y0Var.b() + ' ' + w;
        }
    }

    public static final class c extends e.x.c.k implements e.x.b.a<d> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f9329h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f9329h = dVar;
        }

        public Object e() {
            d dVar = this.f9329h;
            e eVar = e.f9331h;
            Objects.requireNonNull(dVar);
            i.e(eVar, "changeOptions");
            j jVar = dVar.d;
            Objects.requireNonNull(jVar);
            Class<j> cls = j.class;
            j jVar2 = new j();
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            boolean z = false;
            while (i2 < length) {
                Field field = declaredFields[i2];
                i.d(field, "field");
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(jVar);
                    if (!(obj instanceof e.y.a)) {
                        obj = null;
                    }
                    e.y.a aVar = (e.y.a) obj;
                    if (aVar != null) {
                        String name = field.getName();
                        i.d(name, "field.name");
                        e.c0.h.C(name, "is", z, 2);
                        e.a.e a = e.x.c.v.a(cls);
                        String name2 = field.getName();
                        StringBuilder y = b.e.a.a.a.y("get");
                        String name3 = field.getName();
                        i.d(name3, "field.name");
                        y.append(e.c0.h.a(name3));
                        Object b2 = aVar.b(jVar, new q(a, name2, y.toString()));
                        field.set(jVar2, new k(b2, b2, jVar2));
                    }
                }
                i2++;
                z = false;
            }
            eVar.invoke(jVar2);
            jVar2.a = true;
            return new d(jVar2);
        }
    }

    /* renamed from: e.a.a.a.y0.i.d$d  reason: collision with other inner class name */
    public static final class C0210d extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.j.t.g<?>, CharSequence> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d f9330h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0210d(d dVar) {
            super(1);
            this.f9330h = dVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.j.t.g gVar = (e.a.a.a.y0.j.t.g) obj;
            i.e(gVar, "it");
            return this.f9330h.U(gVar);
        }
    }

    public d(j jVar) {
        i.e(jVar, "options");
        this.d = jVar;
    }

    public static /* synthetic */ void S(d dVar, StringBuilder sb, e.a.a.a.y0.b.a1.a aVar, e.a.a.a.y0.b.a1.e eVar, int i2) {
        int i3 = i2 & 2;
        dVar.R(sb, aVar, (e.a.a.a.y0.b.a1.e) null);
    }

    public static final void y(d dVar, f0 f0Var, StringBuilder sb) {
        if (!dVar.J()) {
            if (!dVar.I()) {
                if (dVar.G().contains(h.ANNOTATIONS)) {
                    dVar.R(sb, f0Var, (e.a.a.a.y0.b.a1.e) null);
                    p d0 = f0Var.d0();
                    if (d0 != null) {
                        i.d(d0, "it");
                        dVar.R(sb, d0, e.a.a.a.y0.b.a1.e.FIELD);
                    }
                    p W = f0Var.W();
                    if (W != null) {
                        i.d(W, "it");
                        dVar.R(sb, W, e.a.a.a.y0.b.a1.e.PROPERTY_DELEGATE_FIELD);
                    }
                    j jVar = dVar.d;
                    if (((p) jVar.G.b(jVar, j.W[31])) == p.NONE) {
                        g0 j2 = f0Var.j();
                        if (j2 != null) {
                            i.d(j2, "it");
                            dVar.R(sb, j2, e.a.a.a.y0.b.a1.e.PROPERTY_GETTER);
                        }
                        h0 m2 = f0Var.m();
                        if (m2 != null) {
                            i.d(m2, "it");
                            dVar.R(sb, m2, e.a.a.a.y0.b.a1.e.PROPERTY_SETTER);
                            i.d(m2, "setter");
                            List<w0> n2 = m2.n();
                            i.d(n2, "setter.valueParameters");
                            w0 w0Var = (w0) e.t.g.O(n2);
                            i.d(w0Var, "it");
                            dVar.R(sb, w0Var, e.a.a.a.y0.b.a1.e.SETTER_PARAMETER);
                        }
                    }
                }
                z0 visibility = f0Var.getVisibility();
                i.d(visibility, "property.visibility");
                dVar.v0(visibility, sb);
                dVar.d0(sb, dVar.G().contains(h.CONST) && f0Var.O(), "const");
                dVar.Z(f0Var, sb);
                dVar.c0(f0Var, sb);
                dVar.h0(f0Var, sb);
                dVar.d0(sb, dVar.G().contains(h.LATEINIT) && f0Var.h0(), "lateinit");
                dVar.Y(f0Var, sb);
            }
            dVar.s0(f0Var, sb, false);
            List<r0> B = f0Var.B();
            i.d(B, "property.typeParameters");
            dVar.r0(B, sb, true);
            dVar.k0(f0Var, sb);
        }
        dVar.e0(f0Var, sb, true);
        sb.append(": ");
        d0 d2 = f0Var.d();
        i.d(d2, "property.type");
        sb.append(dVar.w(d2));
        dVar.l0(f0Var, sb);
        dVar.W(f0Var, sb);
        List<r0> B2 = f0Var.B();
        i.d(B2, "property.typeParameters");
        dVar.w0(B2, sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (e.x.c.i.a(r5 + '?', r6) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "?"
            java.lang.String r1 = ""
            r2 = 0
            r3 = 4
            java.lang.String r1 = e.c0.h.w(r6, r0, r1, r2, r3)
            boolean r1 = e.x.c.i.a(r5, r1)
            if (r1 != 0) goto L_0x004a
            r1 = 2
            boolean r0 = e.c0.h.e(r6, r0, r2, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = e.x.c.i.a(r0, r6)
            if (r0 != 0) goto L_0x004a
        L_0x002e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ")?"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            boolean r5 = e.x.c.i.a(r5, r6)
            if (r5 == 0) goto L_0x004b
        L_0x004a:
            r2 = 1
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.A(java.lang.String, java.lang.String):boolean");
    }

    public final String B(String str) {
        return K().d(str);
    }

    public boolean C() {
        j jVar = this.d;
        return ((Boolean) jVar.N.b(jVar, j.W[38])).booleanValue();
    }

    public boolean D() {
        j jVar = this.d;
        return ((Boolean) jVar.U.b(jVar, j.W[46])).booleanValue();
    }

    public b E() {
        j jVar = this.d;
        return (b) jVar.f9344b.b(jVar, j.W[0]);
    }

    public boolean F() {
        j jVar = this.d;
        return ((Boolean) jVar.R.b(jVar, j.W[42])).booleanValue();
    }

    public Set<h> G() {
        j jVar = this.d;
        return (Set) jVar.f9345e.b(jVar, j.W[3]);
    }

    public boolean H() {
        j jVar = this.d;
        return ((Boolean) jVar.z.b(jVar, j.W[24])).booleanValue();
    }

    public boolean I() {
        j jVar = this.d;
        return ((Boolean) jVar.f9346g.b(jVar, j.W[5])).booleanValue();
    }

    public boolean J() {
        j jVar = this.d;
        return ((Boolean) jVar.f.b(jVar, j.W[4])).booleanValue();
    }

    public q K() {
        j jVar = this.d;
        return (q) jVar.C.b(jVar, j.W[27]);
    }

    public c.l L() {
        j jVar = this.d;
        return (c.l) jVar.B.b(jVar, j.W[26]);
    }

    public boolean M() {
        j jVar = this.d;
        return ((Boolean) jVar.f9349j.b(jVar, j.W[8])).booleanValue();
    }

    public boolean N() {
        j jVar = this.d;
        return ((Boolean) jVar.v.b(jVar, j.W[20])).booleanValue();
    }

    public final String O() {
        return K().d(">");
    }

    public final v P(u uVar) {
        v vVar = v.OPEN;
        v vVar2 = v.ABSTRACT;
        e.a.a.a.y0.b.f fVar = e.a.a.a.y0.b.f.INTERFACE;
        v vVar3 = v.FINAL;
        if (uVar instanceof e) {
            return ((e) uVar).i() == fVar ? vVar2 : vVar3;
        }
        k b2 = uVar.b();
        if (!(b2 instanceof e)) {
            b2 = null;
        }
        e eVar = (e) b2;
        if (eVar == null || !(uVar instanceof e.a.a.a.y0.b.b)) {
            return vVar3;
        }
        e.a.a.a.y0.b.b bVar = (e.a.a.a.y0.b.b) uVar;
        Collection<? extends e.a.a.a.y0.b.b> g2 = bVar.g();
        i.d(g2, "this.overriddenDescriptors");
        return (!(g2.isEmpty() ^ true) || eVar.q() == vVar3) ? (eVar.i() != fVar || !(i.a(bVar.getVisibility(), e.a.a.a.y0.b.y0.a) ^ true)) ? vVar3 : bVar.q() == vVar2 ? vVar2 : vVar : vVar;
    }

    public final String Q() {
        return K().d("<");
    }

    public final void R(StringBuilder sb, e.a.a.a.y0.b.a1.a aVar, e.a.a.a.y0.b.a1.e eVar) {
        Set set;
        if (G().contains(h.ANNOTATIONS)) {
            if (aVar instanceof d0) {
                j jVar = this.d;
                set = (Set) jVar.K.b(jVar, j.W[35]);
            } else {
                j jVar2 = this.d;
                set = (Set) jVar2.J.b(jVar2, j.W[34]);
            }
            j jVar3 = this.d;
            e.x.b.l lVar = (e.x.b.l) jVar3.L.b(jVar3, j.W[36]);
            for (e.a.a.a.y0.b.a1.c cVar : aVar.k()) {
                if (!e.t.g.e(set, cVar.e()) && !i.a(cVar.e(), e.a.a.a.y0.a.g.f7647k.x)) {
                    if (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue()) {
                        sb.append(r(cVar, eVar));
                        j jVar4 = this.d;
                        if (((Boolean) jVar4.I.b(jVar4, j.W[33])).booleanValue()) {
                            i.e(sb, "$this$appendln");
                            sb.append(e.c0.m.a);
                            i.d(sb, "append(SystemProperties.LINE_SEPARATOR)");
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    public final void T(e.a.a.a.y0.b.i iVar, StringBuilder sb) {
        List<r0> A = iVar.A();
        i.d(A, "classifier.declaredTypeParameters");
        v0 p2 = iVar.p();
        i.d(p2, "classifier.typeConstructor");
        List<r0> g2 = p2.g();
        i.d(g2, "classifier.typeConstructor.parameters");
        if (M() && iVar.t() && g2.size() > A.size()) {
            sb.append(" /*captured type parameters: ");
            q0(sb, g2.subList(A.size(), g2.size()));
            sb.append("*/");
        }
    }

    public final String U(e.a.a.a.y0.j.t.g<?> gVar) {
        if (gVar instanceof e.a.a.a.y0.j.t.b) {
            return e.t.g.x((Iterable) ((e.a.a.a.y0.j.t.b) gVar).a, ", ", "{", "}", 0, (CharSequence) null, new C0210d(this), 24);
        }
        if (gVar instanceof e.a.a.a.y0.j.t.a) {
            return e.c0.h.t(c.s(this, (e.a.a.a.y0.b.a1.c) ((e.a.a.a.y0.j.t.a) gVar).a, (e.a.a.a.y0.b.a1.e) null, 2, (Object) null), "@");
        }
        if (!(gVar instanceof e.a.a.a.y0.j.t.t)) {
            return gVar.toString();
        }
        t.a aVar = (t.a) ((e.a.a.a.y0.j.t.t) gVar).a;
        if (aVar instanceof t.a.C0211a) {
            return ((t.a.C0211a) aVar).a + "::class";
        } else if (aVar instanceof t.a.b) {
            t.a.b bVar = (t.a.b) aVar;
            String b2 = bVar.a.a.b().b();
            i.d(b2, "classValue.classId.asSingleFqName().asString()");
            for (int i2 = 0; i2 < bVar.a.f9411b; i2++) {
                b2 = "kotlin.Array<" + b2 + '>';
            }
            return b.e.a.a.a.m(b2, "::class");
        } else {
            throw new h();
        }
    }

    public final void V(StringBuilder sb, d0 d0Var) {
        String str;
        e.a.a.a.y0.b.i iVar = null;
        R(sb, d0Var, (e.a.a.a.y0.b.a1.e) null);
        if (b.q.a.a.I1(d0Var)) {
            if (d0Var instanceof h1) {
                j jVar = this.d;
                if (((Boolean) jVar.T.b(jVar, j.W[45])).booleanValue()) {
                    str = ((h1) d0Var).f9682n;
                    sb.append(str);
                    sb.append(n0(d0Var.V0()));
                }
            }
            if (d0Var instanceof e.a.a.a.y0.m.v) {
                j jVar2 = this.d;
                if (!((Boolean) jVar2.V.b(jVar2, j.W[47])).booleanValue()) {
                    str = ((e.a.a.a.y0.m.v) d0Var).f1();
                    sb.append(str);
                    sb.append(n0(d0Var.V0()));
                }
            }
            str = d0Var.W0().toString();
            sb.append(str);
            sb.append(n0(d0Var.V0()));
        } else {
            v0 W0 = d0Var.W0();
            i.e(d0Var, "$this$buildPossiblyInnerType");
            e.a.a.a.y0.b.h d2 = d0Var.W0().d();
            if (d2 instanceof e.a.a.a.y0.b.i) {
                iVar = d2;
            }
            e.a.a.a.y0.b.d0 v = b.q.a.a.v(d0Var, iVar, 0);
            if (v == null) {
                sb.append(o0(W0));
                sb.append(n0(d0Var.V0()));
            } else {
                j0(sb, v);
            }
        }
        if (d0Var.X0()) {
            sb.append("?");
        }
        i.e(d0Var, "$this$isDefinitelyNotNullType");
        if (((i1) d0Var) instanceof e.a.a.a.y0.m.p) {
            sb.append("!!");
        }
    }

    public final void W(x0 x0Var, StringBuilder sb) {
        e.a.a.a.y0.j.t.g<?> H0;
        j jVar = this.d;
        if (((Boolean) jVar.u.b(jVar, j.W[19])).booleanValue() && (H0 = x0Var.H0()) != null) {
            sb.append(" = ");
            i.d(H0, "constant");
            sb.append(B(U(H0)));
        }
    }

    public final String X(String str) {
        int ordinal = K().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return D() ? str : b.e.a.a.a.n("<b>", str, "</b>");
        }
        throw new h();
    }

    public final void Y(e.a.a.a.y0.b.b bVar, StringBuilder sb) {
        if (G().contains(h.MEMBER_KIND) && M() && bVar.i() != b.a.DECLARATION) {
            sb.append("/*");
            String name = bVar.i().name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("*/ ");
        }
    }

    public final void Z(u uVar, StringBuilder sb) {
        d0(sb, uVar.J(), "external");
        boolean z = true;
        d0(sb, G().contains(h.EXPECT) && uVar.m0(), "expect");
        if (!G().contains(h.ACTUAL) || !uVar.J0()) {
            z = false;
        }
        d0(sb, z, "actual");
    }

    public void a(boolean z) {
        j jVar = this.d;
        jVar.f9347h.a(jVar, j.W[6], Boolean.valueOf(z));
    }

    public String a0(String str) {
        i.e(str, "message");
        int ordinal = K().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return b.e.a.a.a.n("<i>", str, "</i>");
        }
        throw new h();
    }

    public void b(boolean z) {
        j jVar = this.d;
        jVar.F.a(jVar, j.W[30], Boolean.valueOf(z));
    }

    public final void b0(v vVar, StringBuilder sb, v vVar2) {
        j jVar = this.d;
        if (((Boolean) jVar.f9355p.b(jVar, j.W[14])).booleanValue() || vVar != vVar2) {
            boolean contains = G().contains(h.MODALITY);
            String name = vVar.name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            d0(sb, contains, lowerCase);
        }
    }

    public void c(boolean z) {
        j jVar = this.d;
        jVar.E.a(jVar, j.W[29], Boolean.valueOf(z));
    }

    public final void c0(e.a.a.a.y0.b.b bVar, StringBuilder sb) {
        if (!g.y(bVar) || bVar.q() != v.FINAL) {
            j jVar = this.d;
            if (((n) jVar.A.b(jVar, j.W[25])) != n.RENDER_OVERRIDE || bVar.q() != v.OPEN || !(!bVar.g().isEmpty())) {
                v q2 = bVar.q();
                i.d(q2, "callable.modality");
                b0(q2, sb, P(bVar));
            }
        }
    }

    public void d(q qVar) {
        i.e(qVar, "<set-?>");
        j jVar = this.d;
        Objects.requireNonNull(jVar);
        i.e(qVar, "<set-?>");
        jVar.C.a(jVar, j.W[27], qVar);
    }

    public final void d0(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(X(str));
            sb.append(" ");
        }
    }

    public void e(Set<e.a.a.a.y0.f.b> set) {
        i.e(set, "<set-?>");
        j jVar = this.d;
        Objects.requireNonNull(jVar);
        i.e(set, "<set-?>");
        jVar.K.a(jVar, j.W[35], set);
    }

    public final void e0(k kVar, StringBuilder sb, boolean z) {
        e.a.a.a.y0.f.d name = kVar.getName();
        i.d(name, "descriptor.name");
        sb.append(v(name, z));
    }

    public void f(boolean z) {
        j jVar = this.d;
        jVar.f.a(jVar, j.W[4], Boolean.valueOf(z));
    }

    public final void f0(StringBuilder sb, d0 d0Var) {
        i1 Z0 = d0Var.Z0();
        if (!(Z0 instanceof e.a.a.a.y0.m.a)) {
            Z0 = null;
        }
        e.a.a.a.y0.m.a aVar = (e.a.a.a.y0.m.a) Z0;
        if (aVar != null) {
            j jVar = this.d;
            e.y.b bVar = jVar.Q;
            e.a.l[] lVarArr = j.W;
            if (((Boolean) bVar.b(jVar, lVarArr[41])).booleanValue()) {
                g0(sb, aVar.f9643i);
                return;
            }
            g0(sb, aVar.f9644j);
            j jVar2 = this.d;
            if (((Boolean) jVar2.P.b(jVar2, lVarArr[40])).booleanValue()) {
                q K = K();
                q qVar = q.f9373i;
                if (K == qVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                g0(sb, aVar.f9643i);
                sb.append(" */");
                if (K() == qVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        g0(sb, d0Var);
    }

    public void g(Set<? extends h> set) {
        i.e(set, "<set-?>");
        this.d.g(set);
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(java.lang.StringBuilder r14, e.a.a.a.y0.m.d0 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof e.a.a.a.y0.m.k1
            if (r0 == 0) goto L_0x0019
            boolean r0 = r13.m()
            if (r0 == 0) goto L_0x0019
            r0 = r15
            e.a.a.a.y0.m.k1 r0 = (e.a.a.a.y0.m.k1) r0
            boolean r0 = r0.b1()
            if (r0 != 0) goto L_0x0019
            java.lang.String r15 = "<Not computed yet>"
            r14.append(r15)
            return
        L_0x0019:
            e.a.a.a.y0.m.i1 r15 = r15.Z0()
            boolean r0 = r15 instanceof e.a.a.a.y0.m.x
            if (r0 == 0) goto L_0x002c
            e.a.a.a.y0.m.x r15 = (e.a.a.a.y0.m.x) r15
            java.lang.String r15 = r15.e1(r13, r13)
            r14.append(r15)
            goto L_0x01f1
        L_0x002c:
            boolean r0 = r15 instanceof e.a.a.a.y0.m.k0
            if (r0 == 0) goto L_0x01f1
            e.a.a.a.y0.m.k0 r15 = (e.a.a.a.y0.m.k0) r15
            e.a.a.a.y0.m.k0 r0 = e.a.a.a.y0.m.f1.f9670b
            boolean r0 = e.x.c.i.a(r15, r0)
            java.lang.String r1 = "???"
            if (r0 != 0) goto L_0x01ee
            r0 = 0
            r2 = 1
            if (r15 == 0) goto L_0x004e
            e.a.a.a.y0.m.v0 r3 = r15.W0()
            e.a.a.a.y0.m.k0 r4 = e.a.a.a.y0.m.f1.a
            e.a.a.a.y0.m.v0 r4 = r4.W0()
            if (r3 != r4) goto L_0x004e
            r3 = r2
            goto L_0x004f
        L_0x004e:
            r3 = r0
        L_0x004f:
            if (r3 == 0) goto L_0x0053
            goto L_0x01ee
        L_0x0053:
            if (r15 == 0) goto L_0x005f
            e.a.a.a.y0.m.v0 r3 = r15.W0()
            boolean r3 = r3 instanceof e.a.a.a.y0.m.w.f
            if (r3 == 0) goto L_0x005f
            r3 = r2
            goto L_0x0060
        L_0x005f:
            r3 = r0
        L_0x0060:
            r4 = 0
            if (r3 == 0) goto L_0x008a
            e.a.a.a.y0.i.j r0 = r13.d
            e.y.b r3 = r0.t
            e.a.l[] r5 = e.a.a.a.y0.i.j.W
            r6 = 18
            r5 = r5[r6]
            java.lang.Object r0 = r3.b(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x007b
            goto L_0x01ee
        L_0x007b:
            e.a.a.a.y0.m.v0 r14 = r15.W0()
            java.lang.String r15 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor"
            java.util.Objects.requireNonNull(r14, r15)
            e.a.a.a.y0.m.w$f r14 = (e.a.a.a.y0.m.w.f) r14
            e.a.a.a.y0.m.w.f.e(r2)
            throw r4
        L_0x008a:
            boolean r1 = b.q.a.a.I1(r15)
            if (r1 == 0) goto L_0x0092
            goto L_0x01ea
        L_0x0092:
            boolean r1 = r13.y0(r15)
            if (r1 == 0) goto L_0x01ea
            int r1 = r14.length()
            e.f r3 = r13.c
            java.lang.Object r3 = r3.getValue()
            e.a.a.a.y0.i.d r3 = (e.a.a.a.y0.i.d) r3
            r5 = 2
            S(r3, r14, r15, r4, r5)
            int r3 = r14.length()
            if (r3 == r1) goto L_0x00b0
            r3 = r2
            goto L_0x00b1
        L_0x00b0:
            r3 = r0
        L_0x00b1:
            boolean r5 = e.a.a.a.y0.a.f.h(r15)
            boolean r6 = r15.X0()
            e.a.a.a.y0.m.d0 r7 = e.a.a.a.y0.a.f.d(r15)
            if (r6 != 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c4
            if (r7 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r8 = r0
            goto L_0x00c7
        L_0x00c6:
            r8 = r2
        L_0x00c7:
            java.lang.String r9 = "("
            if (r8 == 0) goto L_0x010e
            if (r5 == 0) goto L_0x00d3
            r3 = 40
            r14.insert(r1, r3)
            goto L_0x010e
        L_0x00d3:
            if (r3 == 0) goto L_0x010b
            java.lang.String r1 = "$this$last"
            e.x.c.i.e(r14, r1)
            int r1 = r14.length()
            if (r1 != 0) goto L_0x00e2
            r1 = r2
            goto L_0x00e3
        L_0x00e2:
            r1 = r0
        L_0x00e3:
            if (r1 != 0) goto L_0x0103
            int r1 = e.c0.h.g(r14)
            r14.charAt(r1)
            int r1 = e.c0.h.g(r14)
            int r1 = r1 - r2
            char r1 = r14.charAt(r1)
            r3 = 41
            if (r1 == r3) goto L_0x010b
            int r1 = e.c0.h.g(r14)
            java.lang.String r3 = "()"
            r14.insert(r1, r3)
            goto L_0x010b
        L_0x0103:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "Char sequence is empty."
            r14.<init>(r15)
            throw r14
        L_0x010b:
            r14.append(r9)
        L_0x010e:
            java.lang.String r1 = "suspend"
            r13.d0(r14, r5, r1)
            java.lang.String r1 = ")"
            if (r7 == 0) goto L_0x014e
            boolean r3 = r13.y0(r7)
            if (r3 == 0) goto L_0x0123
            boolean r3 = r7.X0()
            if (r3 == 0) goto L_0x0139
        L_0x0123:
            boolean r3 = e.a.a.a.y0.a.f.h(r7)
            if (r3 != 0) goto L_0x0136
            e.a.a.a.y0.b.a1.h r3 = r7.k()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r3 = r0
            goto L_0x0137
        L_0x0136:
            r3 = r2
        L_0x0137:
            if (r3 == 0) goto L_0x013b
        L_0x0139:
            r3 = r2
            goto L_0x013c
        L_0x013b:
            r3 = r0
        L_0x013c:
            if (r3 == 0) goto L_0x0141
            r14.append(r9)
        L_0x0141:
            r13.f0(r14, r7)
            if (r3 == 0) goto L_0x0149
            r14.append(r1)
        L_0x0149:
            java.lang.String r3 = "."
            r14.append(r3)
        L_0x014e:
            r14.append(r9)
            java.util.List r3 = e.a.a.a.y0.a.f.f(r15)
            java.util.Iterator r3 = r3.iterator()
            r5 = r0
        L_0x015a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01aa
            java.lang.Object r7 = r3.next()
            e.a.a.a.y0.m.y0 r7 = (e.a.a.a.y0.m.y0) r7
            if (r5 <= 0) goto L_0x016d
            java.lang.String r9 = ", "
            r14.append(r9)
        L_0x016d:
            e.a.a.a.y0.i.j r9 = r13.d
            e.y.b r10 = r9.S
            e.a.l[] r11 = e.a.a.a.y0.i.j.W
            r12 = 43
            r11 = r11[r12]
            java.lang.Object r9 = r10.b(r9, r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0191
            e.a.a.a.y0.m.d0 r9 = r7.d()
            java.lang.String r10 = "typeProjection.type"
            e.x.c.i.d(r9, r10)
            e.a.a.a.y0.f.d r9 = e.a.a.a.y0.a.f.b(r9)
            goto L_0x0192
        L_0x0191:
            r9 = r4
        L_0x0192:
            if (r9 == 0) goto L_0x01a0
            java.lang.String r9 = r13.v(r9, r0)
            r14.append(r9)
            java.lang.String r9 = ": "
            r14.append(r9)
        L_0x01a0:
            java.lang.String r7 = r13.x(r7)
            r14.append(r7)
            int r5 = r5 + 1
            goto L_0x015a
        L_0x01aa:
            java.lang.String r0 = ") "
            r14.append(r0)
            e.a.a.a.y0.i.q r0 = r13.K()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01c4
            if (r0 != r2) goto L_0x01be
            java.lang.String r0 = "&rarr;"
            goto L_0x01ce
        L_0x01be:
            e.h r14 = new e.h
            r14.<init>()
            throw r14
        L_0x01c4:
            e.a.a.a.y0.i.q r0 = r13.K()
            java.lang.String r2 = "->"
            java.lang.String r0 = r0.d(r2)
        L_0x01ce:
            r14.append(r0)
            java.lang.String r0 = " "
            r14.append(r0)
            e.a.a.a.y0.m.d0 r15 = e.a.a.a.y0.a.f.e(r15)
            r13.f0(r14, r15)
            if (r8 == 0) goto L_0x01e2
            r14.append(r1)
        L_0x01e2:
            if (r6 == 0) goto L_0x01f1
            java.lang.String r15 = "?"
            r14.append(r15)
            goto L_0x01f1
        L_0x01ea:
            r13.V(r14, r15)
            goto L_0x01f1
        L_0x01ee:
            r14.append(r1)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.g0(java.lang.StringBuilder, e.a.a.a.y0.m.d0):void");
    }

    public void h(o oVar) {
        i.e(oVar, "<set-?>");
        this.d.h(oVar);
    }

    public final void h0(e.a.a.a.y0.b.b bVar, StringBuilder sb) {
        if (G().contains(h.OVERRIDE) && (!bVar.g().isEmpty())) {
            j jVar = this.d;
            if (((n) jVar.A.b(jVar, j.W[25])) != n.RENDER_OPEN) {
                d0(sb, true, "override");
                if (M()) {
                    sb.append("/*");
                    sb.append(bVar.g().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public void i(a aVar) {
        i.e(aVar, "<set-?>");
        j jVar = this.d;
        Objects.requireNonNull(jVar);
        i.e(aVar, "<set-?>");
        jVar.M.a(jVar, j.W[37], aVar);
    }

    public final void i0(e.a.a.a.y0.f.b bVar, String str, StringBuilder sb) {
        sb.append(X(str));
        e.a.a.a.y0.f.c j2 = bVar.j();
        i.d(j2, "fqName.toUnsafe()");
        String u = u(j2);
        if (u.length() > 0) {
            sb.append(" ");
            sb.append(u);
        }
    }

    public void j(boolean z) {
        this.d.j(z);
    }

    public final void j0(StringBuilder sb, e.a.a.a.y0.b.d0 d0Var) {
        String str;
        e.a.a.a.y0.b.d0 d0Var2 = d0Var.c;
        if (d0Var2 != null) {
            j0(sb, d0Var2);
            sb.append('.');
            e.a.a.a.y0.f.d name = d0Var.a.getName();
            i.d(name, "possiblyInnerType.classifierDescriptor.name");
            str = v(name, false);
        } else {
            v0 p2 = d0Var.a.p();
            i.d(p2, "possiblyInnerType.classi…escriptor.typeConstructor");
            str = o0(p2);
        }
        sb.append(str);
        sb.append(n0(d0Var.f7818b));
    }

    public boolean k() {
        j jVar = this.d;
        return ((Boolean) jVar.f9352m.b(jVar, j.W[11])).booleanValue();
    }

    public final void k0(e.a.a.a.y0.b.a aVar, StringBuilder sb) {
        i0 U = aVar.U();
        if (U != null) {
            R(sb, U, e.a.a.a.y0.b.a1.e.RECEIVER);
            d0 d2 = U.d();
            i.d(d2, "receiver.type");
            String w = w(d2);
            if (y0(d2) && !f1.g(d2)) {
                w = '(' + w + ')';
            }
            sb.append(w);
            sb.append(".");
        }
    }

    public Set<e.a.a.a.y0.f.b> l() {
        j jVar = this.d;
        return (Set) jVar.K.b(jVar, j.W[35]);
    }

    public final void l0(e.a.a.a.y0.b.a aVar, StringBuilder sb) {
        i0 U;
        j jVar = this.d;
        if (((Boolean) jVar.E.b(jVar, j.W[29])).booleanValue() && (U = aVar.U()) != null) {
            sb.append(" on ");
            d0 d2 = U.d();
            i.d(d2, "receiver.type");
            sb.append(w(d2));
        }
    }

    public boolean m() {
        return this.d.m();
    }

    public final void m0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public void n(b bVar) {
        i.e(bVar, "<set-?>");
        this.d.n(bVar);
    }

    public String n0(List<? extends y0> list) {
        i.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Q());
        z(sb, list);
        sb.append(O());
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public void o(boolean z) {
        j jVar = this.d;
        jVar.v.a(jVar, j.W[20], Boolean.valueOf(z));
    }

    public String o0(v0 v0Var) {
        i.e(v0Var, "typeConstructor");
        e.a.a.a.y0.b.h d2 = v0Var.d();
        if ((d2 instanceof r0) || (d2 instanceof e) || (d2 instanceof q0)) {
            i.e(d2, "klass");
            return e.a.a.a.y0.m.w.j(d2) ? d2.p().toString() : E().a(d2, this);
        } else if (d2 == null) {
            return v0Var.toString();
        } else {
            StringBuilder y = b.e.a.a.a.y("Unexpected classifier: ");
            y.append(d2.getClass());
            throw new IllegalStateException(y.toString().toString());
        }
    }

    public void p(boolean z) {
        this.d.p(z);
    }

    public final void p0(r0 r0Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(Q());
        }
        if (M()) {
            sb.append("/*");
            sb.append(r0Var.h());
            sb.append("*/ ");
        }
        d0(sb, r0Var.Z(), "reified");
        String str = r0Var.u().f9689h;
        boolean z2 = true;
        d0(sb, str.length() > 0, str);
        R(sb, r0Var, (e.a.a.a.y0.b.a1.e) null);
        e0(r0Var, sb, z);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            d0 next = r0Var.getUpperBounds().iterator().next();
            if (next == null) {
                e.a.a.a.y0.a.g.a(135);
                throw null;
            } else if (!e.a.a.a.y0.a.g.H(next)) {
                sb.append(" : ");
                i.d(next, "upperBound");
                sb.append(w(next));
            }
        } else if (z) {
            for (d0 next2 : r0Var.getUpperBounds()) {
                if (next2 == null) {
                    e.a.a.a.y0.a.g.a(135);
                    throw null;
                } else if (!e.a.a.a.y0.a.g.H(next2)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    i.d(next2, "upperBound");
                    sb.append(w(next2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(O());
        }
    }

    public String q(k kVar) {
        i.e(kVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        kVar.l0(new a(), sb);
        j jVar = this.d;
        e.y.b bVar = jVar.c;
        e.a.l[] lVarArr = j.W;
        if (((Boolean) bVar.b(jVar, lVarArr[1])).booleanValue() && !(kVar instanceof y) && !(kVar instanceof b0)) {
            if (kVar instanceof w) {
                sb.append(" is a module");
            } else {
                k b2 = kVar.b();
                if (b2 != null && !(b2 instanceof w)) {
                    sb.append(" ");
                    sb.append(a0("defined in"));
                    sb.append(" ");
                    e.a.a.a.y0.f.c g2 = g.g(b2);
                    i.d(g2, "DescriptorUtils.getFqName(containingDeclaration)");
                    sb.append(g2.e() ? "root package" : u(g2));
                    j jVar2 = this.d;
                    if (((Boolean) jVar2.d.b(jVar2, lVarArr[2])).booleanValue() && (b2 instanceof y) && (kVar instanceof n)) {
                        m0 w = ((n) kVar).w();
                        i.d(w, "descriptor.source");
                        i.d(w.a(), "descriptor.source.containingFile");
                    }
                }
            }
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void q0(StringBuilder sb, List<? extends r0> list) {
        Iterator<? extends r0> it = list.iterator();
        while (it.hasNext()) {
            p0((r0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: e.t.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String r(e.a.a.a.y0.b.a1.c r11, e.a.a.a.y0.b.a1.e r12) {
        /*
            r10 = this;
            java.lang.String r0 = "annotation"
            e.x.c.i.e(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 64
            r0.append(r1)
            if (r12 == 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = r12.f7781h
            r1.append(r12)
            java.lang.String r12 = ":"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.append(r12)
        L_0x0027:
            e.a.a.a.y0.m.d0 r12 = r11.d()
            java.lang.String r1 = r10.w(r12)
            r0.append(r1)
            e.a.a.a.y0.i.j r1 = r10.d
            e.a.a.a.y0.i.a r1 = r1.q()
            boolean r1 = r1.f9315h
            if (r1 == 0) goto L_0x01b8
            java.util.Map r1 = r11.a()
            e.a.a.a.y0.i.j r2 = r10.d
            e.y.b r3 = r2.H
            e.a.l[] r4 = e.a.a.a.y0.i.j.W
            r5 = 32
            r4 = r4[r5]
            java.lang.Object r2 = r3.b(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L_0x005c
            e.a.a.a.y0.b.e r11 = e.a.a.a.y0.j.v.b.e(r11)
            goto L_0x005d
        L_0x005c:
            r11 = r3
        L_0x005d:
            java.lang.String r2 = "it"
            r4 = 10
            if (r11 == 0) goto L_0x00b4
            e.a.a.a.y0.b.d r11 = r11.x0()
            if (r11 == 0) goto L_0x00b4
            java.util.List r11 = r11.n()
            if (r11 == 0) goto L_0x00b4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0078:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r11.next()
            r6 = r5
            e.a.a.a.y0.b.w0 r6 = (e.a.a.a.y0.b.w0) r6
            boolean r6 = r6.k0()
            if (r6 == 0) goto L_0x0078
            r3.add(r5)
            goto L_0x0078
        L_0x008f:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r5 = b.q.a.a.C(r3, r4)
            r11.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x009c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r3.next()
            e.a.a.a.y0.b.w0 r5 = (e.a.a.a.y0.b.w0) r5
            e.x.c.i.d(r5, r2)
            e.a.a.a.y0.f.d r5 = r5.getName()
            r11.add(r5)
            goto L_0x009c
        L_0x00b3:
            r3 = r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            e.t.o r3 = e.t.o.f7934h
        L_0x00b9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r5 = r3.iterator()
        L_0x00c2:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x00de
            java.lang.Object r6 = r5.next()
            r8 = r6
            e.a.a.a.y0.f.d r8 = (e.a.a.a.y0.f.d) r8
            e.x.c.i.d(r8, r2)
            boolean r8 = r1.containsKey(r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x00c2
            r11.add(r6)
            goto L_0x00c2
        L_0x00de:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = b.q.a.a.C(r11, r4)
            r2.<init>(r5)
            java.util.Iterator r11 = r11.iterator()
        L_0x00eb:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r11.next()
            e.a.a.a.y0.f.d r5 = (e.a.a.a.y0.f.d) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.e()
            r6.append(r5)
            java.lang.String r5 = " = ..."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r2.add(r5)
            goto L_0x00eb
        L_0x0110:
            java.util.Set r11 = r1.entrySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = b.q.a.a.C(r11, r4)
            r1.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0121:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r11.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            e.a.a.a.y0.f.d r5 = (e.a.a.a.y0.f.d) r5
            java.lang.Object r4 = r4.getValue()
            e.a.a.a.y0.j.t.g r4 = (e.a.a.a.y0.j.t.g) r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r5.e()
            r6.append(r8)
            java.lang.String r8 = " = "
            r6.append(r8)
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L_0x0155
            java.lang.String r4 = r10.U(r4)
            goto L_0x0157
        L_0x0155:
            java.lang.String r4 = "..."
        L_0x0157:
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r1.add(r4)
            goto L_0x0121
        L_0x0162:
            java.util.List r11 = e.t.g.I(r2, r1)
            java.lang.String r1 = "$this$sorted"
            e.x.c.i.e(r11, r1)
            r1 = r11
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r2 > r7) goto L_0x017a
            java.util.List r11 = e.t.g.W(r11)
        L_0x0178:
            r1 = r11
            goto L_0x0198
        L_0x017a:
            r11 = 0
            java.lang.Comparable[] r11 = new java.lang.Comparable[r11]
            java.lang.Object[] r11 = r1.toArray(r11)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r11, r1)
            java.lang.Comparable[] r11 = (java.lang.Comparable[]) r11
            java.lang.String r1 = "$this$sort"
            e.x.c.i.e(r11, r1)
            int r1 = r11.length
            if (r1 <= r7) goto L_0x0193
            java.util.Arrays.sort(r11)
        L_0x0193:
            java.util.List r11 = e.t.g.c(r11)
            goto L_0x0178
        L_0x0198:
            e.a.a.a.y0.i.j r11 = r10.d
            e.a.a.a.y0.i.a r11 = r11.q()
            boolean r11 = r11.f9316i
            if (r11 != 0) goto L_0x01a9
            boolean r11 = r1.isEmpty()
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x01b8
        L_0x01a9:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r2 = r0
            e.t.g.v(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x01b8:
            boolean r11 = r10.M()
            if (r11 == 0) goto L_0x01d5
            boolean r11 = b.q.a.a.I1(r12)
            if (r11 != 0) goto L_0x01d0
            e.a.a.a.y0.m.v0 r11 = r12.W0()
            e.a.a.a.y0.b.h r11 = r11.d()
            boolean r11 = r11 instanceof e.a.a.a.y0.b.x.b
            if (r11 == 0) goto L_0x01d5
        L_0x01d0:
            java.lang.String r11 = " /* annotation class not found */"
            r0.append(r11)
        L_0x01d5:
            java.lang.String r11 = r0.toString()
            java.lang.String r12 = "StringBuilder().apply(builderAction).toString()"
            e.x.c.i.d(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.r(e.a.a.a.y0.b.a1.c, e.a.a.a.y0.b.a1.e):java.lang.String");
    }

    public final void r0(List<? extends r0> list, StringBuilder sb, boolean z) {
        if (!N() && (!list.isEmpty())) {
            sb.append(Q());
            q0(sb, list);
            sb.append(O());
            if (z) {
                sb.append(" ");
            }
        }
    }

    public final void s0(x0 x0Var, StringBuilder sb, boolean z) {
        if (z || !(x0Var instanceof w0)) {
            sb.append(X(x0Var.Q() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public String t(String str, String str2, e.a.a.a.y0.a.g gVar) {
        StringBuilder sb;
        i.e(str, "lowerRendered");
        i.e(str2, "upperRendered");
        i.e(gVar, "builtIns");
        if (!A(str, str2)) {
            b E = E();
            e i2 = gVar.i(e.a.a.a.y0.a.g.f7647k.I);
            if (i2 != null) {
                i.d(i2, "builtIns.collection");
                String J = e.c0.h.J(E.a(i2, this), "Collection", (String) null, 2);
                String m2 = b.e.a.a.a.m(J, "Mutable");
                String x0 = x0(str, m2, str2, J, J + '(' + "Mutable" + ')');
                if (x0 != null) {
                    return x0;
                }
                String x02 = x0(str, b.e.a.a.a.m(J, "MutableMap.MutableEntry"), str2, b.e.a.a.a.m(J, "Map.Entry"), b.e.a.a.a.m(J, "(Mutable)Map.(Mutable)Entry"));
                if (x02 != null) {
                    return x02;
                }
                b E2 = E();
                e j2 = gVar.j("Array");
                i.d(j2, "builtIns.array");
                String J2 = e.c0.h.J(E2.a(j2, this), "Array", (String) null, 2);
                StringBuilder y = b.e.a.a.a.y(J2);
                y.append(K().d("Array<"));
                String sb2 = y.toString();
                StringBuilder y2 = b.e.a.a.a.y(J2);
                y2.append(K().d("Array<out "));
                String sb3 = y2.toString();
                StringBuilder y3 = b.e.a.a.a.y(J2);
                y3.append(K().d("Array<(out) "));
                String x03 = x0(str, sb2, str2, sb3, y3.toString());
                if (x03 != null) {
                    return x03;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append('(');
                sb4.append(str);
                sb4.append("..");
                sb4.append(str2);
                sb4.append(')');
                sb = sb4;
            } else {
                e.a.a.a.y0.a.g.a(36);
                throw null;
            }
        } else if (e.c0.h.C(str2, "(", false, 2)) {
            sb = new StringBuilder();
            sb.append('(');
            sb.append(str);
            sb.append(")!");
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append('!');
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(e.a.a.a.y0.b.w0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.X(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.M()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.h()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r0 = 0
            r9.R(r12, r10, r0)
            boolean r1 = r10.E()
            java.lang.String r2 = "crossinline"
            r9.d0(r12, r1, r2)
            boolean r1 = r10.I0()
            java.lang.String r2 = "noinline"
            r9.d0(r12, r1, r2)
            e.a.a.a.y0.i.j r1 = r9.d
            e.y.b r2 = r1.r
            e.a.l[] r3 = e.a.a.a.y0.i.j.W
            r4 = 16
            r4 = r3[r4]
            java.lang.Object r1 = r2.b(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x006b
            e.a.a.a.y0.b.a r1 = r10.b()
            boolean r5 = r1 instanceof e.a.a.a.y0.b.d
            if (r5 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = r1
        L_0x005f:
            e.a.a.a.y0.b.d r0 = (e.a.a.a.y0.b.d) r0
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.S()
            if (r0 != r4) goto L_0x006b
            r0 = r4
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x0085
            e.a.a.a.y0.i.j r1 = r9.d
            e.y.b r5 = r1.s
            r6 = 17
            r6 = r3[r6]
            java.lang.Object r1 = r5.b(r1, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r5 = "actual"
            r9.d0(r12, r1, r5)
        L_0x0085:
            e.a.a.a.y0.m.d0 r1 = r10.d()
            java.lang.String r5 = "variable.type"
            e.x.c.i.d(r1, r5)
            e.a.a.a.y0.m.d0 r5 = r10.R()
            if (r5 == 0) goto L_0x0096
            r6 = r5
            goto L_0x0097
        L_0x0096:
            r6 = r1
        L_0x0097:
            if (r5 == 0) goto L_0x009b
            r7 = r4
            goto L_0x009c
        L_0x009b:
            r7 = r2
        L_0x009c:
            java.lang.String r8 = "vararg"
            r9.d0(r12, r7, r8)
            if (r0 != 0) goto L_0x00ab
            if (r13 == 0) goto L_0x00ae
            boolean r7 = r9.J()
            if (r7 != 0) goto L_0x00ae
        L_0x00ab:
            r9.s0(r10, r12, r0)
        L_0x00ae:
            if (r11 == 0) goto L_0x00b8
            r9.e0(r10, r12, r13)
            java.lang.String r11 = ": "
            r12.append(r11)
        L_0x00b8:
            java.lang.String r11 = r9.w(r6)
            r12.append(r11)
            r9.W(r10, r12)
            boolean r11 = r9.M()
            if (r11 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00db
            java.lang.String r11 = " /*"
            r12.append(r11)
            java.lang.String r11 = r9.w(r1)
            r12.append(r11)
            java.lang.String r11 = "*/"
            r12.append(r11)
        L_0x00db:
            e.a.a.a.y0.i.j r11 = r9.d
            e.y.b r13 = r11.y
            r0 = 23
            r1 = r3[r0]
            java.lang.Object r11 = r13.b(r11, r1)
            e.x.b.l r11 = (e.x.b.l) r11
            if (r11 == 0) goto L_0x00fd
            boolean r11 = r9.m()
            if (r11 == 0) goto L_0x00f6
            boolean r11 = r10.k0()
            goto L_0x00fa
        L_0x00f6:
            boolean r11 = e.a.a.a.y0.j.v.b.a(r10)
        L_0x00fa:
            if (r11 == 0) goto L_0x00fd
            r2 = r4
        L_0x00fd:
            if (r2 == 0) goto L_0x0124
            java.lang.String r11 = " = "
            java.lang.StringBuilder r11 = b.e.a.a.a.y(r11)
            e.a.a.a.y0.i.j r13 = r9.d
            e.y.b r1 = r13.y
            r0 = r3[r0]
            java.lang.Object r13 = r1.b(r13, r0)
            e.x.b.l r13 = (e.x.b.l) r13
            e.x.c.i.c(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.t0(e.a.a.a.y0.b.w0, boolean, java.lang.StringBuilder, boolean):void");
    }

    public String u(e.a.a.a.y0.f.c cVar) {
        i.e(cVar, "fqName");
        List<e.a.a.a.y0.f.d> g2 = cVar.g();
        i.d(g2, "fqName.pathSegments()");
        return K().d(b.q.a.a.C2(g2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r8 == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[LOOP:0: B:11:0x003a->B:13:0x0040, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u0(java.util.Collection<? extends e.a.a.a.y0.b.w0> r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            e.a.a.a.y0.i.j r0 = r6.d
            e.y.b r1 = r0.D
            e.a.l[] r2 = e.a.a.a.y0.i.j.W
            r3 = 28
            r2 = r2[r3]
            java.lang.Object r0 = r1.b(r0, r2)
            e.a.a.a.y0.i.o r0 = (e.a.a.a.y0.i.o) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            if (r0 == r1) goto L_0x0024
            r8 = 2
            if (r0 != r8) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            e.h r7 = new e.h
            r7.<init>()
            throw r7
        L_0x0024:
            if (r8 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r8 = r2
            goto L_0x002a
        L_0x0029:
            r8 = r1
        L_0x002a:
            int r0 = r7.size()
            e.a.a.a.y0.i.c$l r3 = r6.L()
            r3.b(r0, r9)
            java.util.Iterator r7 = r7.iterator()
            r3 = r2
        L_0x003a:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r7.next()
            e.a.a.a.y0.b.w0 r4 = (e.a.a.a.y0.b.w0) r4
            e.a.a.a.y0.i.c$l r5 = r6.L()
            r5.a(r4, r3, r0, r9)
            r6.t0(r4, r8, r9, r2)
            e.a.a.a.y0.i.c$l r5 = r6.L()
            r5.d(r4, r3, r0, r9)
            int r3 = r3 + r1
            goto L_0x003a
        L_0x0059:
            e.a.a.a.y0.i.c$l r7 = r6.L()
            r7.c(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.u0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    public String v(e.a.a.a.y0.f.d dVar, boolean z) {
        i.e(dVar, "name");
        String B = B(b.q.a.a.B2(dVar));
        return (!D() || K() != q.f9373i || !z) ? B : b.e.a.a.a.n("<b>", B, "</b>");
    }

    public final boolean v0(z0 z0Var, StringBuilder sb) {
        if (!G().contains(h.VISIBILITY)) {
            return false;
        }
        j jVar = this.d;
        e.y.b bVar = jVar.f9353n;
        e.a.l[] lVarArr = j.W;
        if (((Boolean) bVar.b(jVar, lVarArr[12])).booleanValue()) {
            z0Var = z0Var.d();
        }
        j jVar2 = this.d;
        if (!((Boolean) jVar2.f9354o.b(jVar2, lVarArr[13])).booleanValue() && i.a(z0Var, e.a.a.a.y0.b.y0.f7855k)) {
            return false;
        }
        sb.append(X(z0Var.b()));
        sb.append(" ");
        return true;
    }

    public String w(d0 d0Var) {
        i.e(d0Var, "type");
        StringBuilder sb = new StringBuilder();
        j jVar = this.d;
        f0(sb, (d0) ((e.x.b.l) jVar.x.b(jVar, j.W[22])).invoke(d0Var));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void w0(List<? extends r0> list, StringBuilder sb) {
        if (!N()) {
            ArrayList arrayList = new ArrayList(0);
            for (r0 r0Var : list) {
                List<d0> upperBounds = r0Var.getUpperBounds();
                i.d(upperBounds, "typeParameter.upperBounds");
                for (T t : e.t.g.k(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    e.a.a.a.y0.f.d name = r0Var.getName();
                    i.d(name, "typeParameter.name");
                    sb2.append(v(name, false));
                    sb2.append(" : ");
                    i.d(t, "it");
                    sb2.append(w(t));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(X("where"));
                sb.append(" ");
                e.t.g.v(arrayList, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (e.x.b.l) null, 124);
            }
        }
    }

    public String x(y0 y0Var) {
        i.e(y0Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        z(sb, b.q.a.a.l2(y0Var));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String x0(String str, String str2, String str3, String str4, String str5) {
        if (!e.c0.h.C(str, str2, false, 2) || !e.c0.h.C(str3, str4, false, 2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        i.d(substring2, "(this as java.lang.String).substring(startIndex)");
        String str6 = str5 + substring;
        if (i.a(substring, substring2)) {
            return str6;
        }
        if (!A(substring, substring2)) {
            return null;
        }
        return str6 + '!';
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y0(e.a.a.a.y0.m.d0 r4) {
        /*
            r3 = this;
            boolean r0 = e.a.a.a.y0.a.f.g(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.V0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            e.a.a.a.y0.m.y0 r0 = (e.a.a.a.y0.m.y0) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001c
            r4 = r1
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = r2
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.i.d.y0(e.a.a.a.y0.m.d0):boolean");
    }

    public final void z(StringBuilder sb, List<? extends y0> list) {
        e.t.g.v(list, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new b(this), 60);
    }
}
