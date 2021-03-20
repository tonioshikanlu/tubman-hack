package b.j.a.c.b0.a0;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import b.j.a.a.h0;
import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.b.s.f;
import b.j.a.c.b;
import b.j.a.c.b0.m;
import b.j.a.c.b0.r;
import b.j.a.c.b0.z.o;
import b.j.a.c.b0.z.q;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.n;
import b.j.a.c.k;
import b.j.a.c.p;
import b.j.a.c.t;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public abstract class z<T> extends j<T> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final int f1759i = (h.USE_BIG_INTEGER_FOR_INTS.f2032i | h.USE_LONG_FOR_INTS.f2032i);

    /* renamed from: j  reason: collision with root package name */
    public static final int f1760j = (h.UNWRAP_SINGLE_VALUE_ARRAYS.f2032i | h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.f2032i);

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f1761h;

    public z(z<?> zVar) {
        this.f1761h = zVar.f1761h;
    }

    public z(i iVar) {
        this.f1761h = iVar == null ? Object.class : iVar.f2152h;
    }

    public z(Class<?> cls) {
        this.f1761h = cls;
    }

    public static final boolean G(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public final boolean A(long j2) {
        return j2 < -2147483648L || j2 > 2147483647L;
    }

    public boolean B(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    public final boolean D(String str) {
        return "NaN".equals(str);
    }

    public final boolean E(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean F(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public final boolean H(b.j.a.b.i iVar, g gVar) {
        l g0 = iVar.g0();
        if (g0 == l.VALUE_TRUE) {
            return true;
        }
        if (g0 == l.VALUE_FALSE) {
            return false;
        }
        if (g0 == l.VALUE_NULL) {
            R(gVar);
            return false;
        } else if (g0 == l.VALUE_NUMBER_INT) {
            U(gVar, iVar);
            return !"0".equals(iVar.x0());
        } else if (g0 == l.VALUE_STRING) {
            String trim = iVar.x0().trim();
            if ("true".equals(trim) || "True".equals(trim)) {
                return true;
            }
            if ("false".equals(trim) || "False".equals(trim)) {
                return false;
            }
            if (B(trim)) {
                S(gVar, trim);
                return false;
            }
            gVar.L(this.f1761h, trim, "only \"true\" or \"false\" recognized", new Object[0]);
            throw null;
        } else if (g0 != l.START_ARRAY || !gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            gVar.G(this.f1761h, iVar);
            throw null;
        } else {
            iVar.T0();
            boolean H = H(iVar, gVar);
            Q(iVar, gVar);
            return H;
        }
    }

    public Date I(b.j.a.b.i iVar, g gVar) {
        l lVar;
        int k0 = iVar.k0();
        if (k0 == 3) {
            if (gVar.M(f1760j)) {
                lVar = iVar.T0();
                if (lVar == l.END_ARRAY && gVar.O(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                    return (Date) c(gVar);
                }
                if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    Date I = I(iVar, gVar);
                    Q(iVar, gVar);
                    return I;
                }
            } else {
                lVar = iVar.g0();
            }
            gVar.H(this.f1761h, lVar, iVar, (String) null, new Object[0]);
            throw null;
        } else if (k0 == 11) {
            return (Date) c(gVar);
        } else {
            if (k0 == 6) {
                String trim = iVar.x0().trim();
                try {
                    return B(trim) ? (Date) c(gVar) : gVar.S(trim);
                } catch (IllegalArgumentException e2) {
                    gVar.L(this.f1761h, trim, "not a valid representation (error: %s)", b.j.a.c.j0.g.i(e2));
                    throw null;
                }
            } else if (k0 == 7) {
                try {
                    return new Date(iVar.r0());
                } catch (b.j.a.b.h unused) {
                    gVar.K(this.f1761h, iVar.t0(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0]);
                    throw null;
                }
            } else {
                gVar.G(this.f1761h, iVar);
                throw null;
            }
        }
    }

    public final double J(b.j.a.b.i iVar, g gVar) {
        if (iVar.L0(l.VALUE_NUMBER_FLOAT)) {
            return iVar.n0();
        }
        int k0 = iVar.k0();
        if (k0 != 3) {
            if (k0 == 11) {
                R(gVar);
                return ShadowDrawableWrapper.COS_45;
            } else if (k0 == 6) {
                String trim = iVar.x0().trim();
                if (B(trim)) {
                    S(gVar, trim);
                    return ShadowDrawableWrapper.COS_45;
                }
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt != 'I') {
                        if (charAt == 'N' && D(trim)) {
                            return Double.NaN;
                        }
                    } else if (F(trim)) {
                        return Double.POSITIVE_INFINITY;
                    }
                } else if (E(trim)) {
                    return Double.NEGATIVE_INFINITY;
                }
                try {
                    if ("2.2250738585072012e-308".equals(trim)) {
                        return Double.MIN_NORMAL;
                    }
                    return Double.parseDouble(trim);
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid double value (as String to convert)", new Object[0]);
                    throw null;
                }
            } else if (k0 == 7) {
                return iVar.n0();
            }
        } else if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            iVar.T0();
            double J = J(iVar, gVar);
            Q(iVar, gVar);
            return J;
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public final float K(b.j.a.b.i iVar, g gVar) {
        if (iVar.L0(l.VALUE_NUMBER_FLOAT)) {
            return iVar.p0();
        }
        int k0 = iVar.k0();
        if (k0 != 3) {
            if (k0 == 11) {
                R(gVar);
                return 0.0f;
            } else if (k0 == 6) {
                String trim = iVar.x0().trim();
                if (B(trim)) {
                    S(gVar, trim);
                    return 0.0f;
                }
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt != 'I') {
                        if (charAt == 'N' && D(trim)) {
                            return Float.NaN;
                        }
                    } else if (F(trim)) {
                        return Float.POSITIVE_INFINITY;
                    }
                } else if (E(trim)) {
                    return Float.NEGATIVE_INFINITY;
                }
                try {
                    return Float.parseFloat(trim);
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid float value", new Object[0]);
                    throw null;
                }
            } else if (k0 == 7) {
                return iVar.p0();
            }
        } else if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            iVar.T0();
            float K = K(iVar, gVar);
            Q(iVar, gVar);
            return K;
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public final int L(b.j.a.b.i iVar, g gVar) {
        if (iVar.L0(l.VALUE_NUMBER_INT)) {
            return iVar.q0();
        }
        int k0 = iVar.k0();
        if (k0 != 3) {
            if (k0 == 6) {
                String trim = iVar.x0().trim();
                if (B(trim)) {
                    S(gVar, trim);
                    return 0;
                }
                try {
                    if (trim.length() <= 9) {
                        return f.d(trim);
                    }
                    long parseLong = Long.parseLong(trim);
                    if (!A(parseLong)) {
                        return (int) parseLong;
                    }
                    gVar.L(this.f1761h, trim, "Overflow: numeric value (%s) out of range of int (%d -%d)", trim, Integer.MIN_VALUE, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
                    throw null;
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid int value", new Object[0]);
                    throw null;
                }
            } else if (k0 != 8) {
                if (k0 == 11) {
                    R(gVar);
                    return 0;
                }
            } else if (gVar.O(h.ACCEPT_FLOAT_AS_INT)) {
                return iVar.D0();
            } else {
                x(iVar, gVar, "int");
                throw null;
            }
        } else if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            iVar.T0();
            int L = L(iVar, gVar);
            Q(iVar, gVar);
            return L;
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public final long M(b.j.a.b.i iVar, g gVar) {
        if (iVar.L0(l.VALUE_NUMBER_INT)) {
            return iVar.r0();
        }
        int k0 = iVar.k0();
        if (k0 != 3) {
            if (k0 == 6) {
                String trim = iVar.x0().trim();
                if (B(trim)) {
                    S(gVar, trim);
                    return 0;
                }
                try {
                    return f.f(trim);
                } catch (IllegalArgumentException unused) {
                    gVar.L(this.f1761h, trim, "not a valid long value", new Object[0]);
                    throw null;
                }
            } else if (k0 != 8) {
                if (k0 == 11) {
                    R(gVar);
                    return 0;
                }
            } else if (gVar.O(h.ACCEPT_FLOAT_AS_INT)) {
                return iVar.F0();
            } else {
                x(iVar, gVar, "long");
                throw null;
            }
        } else if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            iVar.T0();
            long M = M(iVar, gVar);
            Q(iVar, gVar);
            return M;
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public final short N(b.j.a.b.i iVar, g gVar) {
        int L = L(iVar, gVar);
        if (!(L < -32768 || L > 32767)) {
            return (short) L;
        }
        gVar.L(this.f1761h, String.valueOf(L), "overflow, value cannot be represented as 16-bit value", new Object[0]);
        throw null;
    }

    public final String O(b.j.a.b.i iVar, g gVar) {
        if (iVar.g0() == l.VALUE_STRING) {
            return iVar.x0();
        }
        String H0 = iVar.H0();
        if (H0 != null) {
            return H0;
        }
        gVar.G(String.class, iVar);
        throw null;
    }

    public void P(g gVar, boolean z, Enum<?> enumR, String str) {
        gVar.Y(this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, u(), z ? "enable" : "disable", enumR.getClass().getSimpleName(), enumR.name());
        throw null;
    }

    public void Q(b.j.a.b.i iVar, g gVar) {
        if (iVar.T0() != l.END_ARRAY) {
            a0(gVar);
            throw null;
        }
    }

    public final void R(g gVar) {
        if (gVar.O(h.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            gVar.Y(this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", u());
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: b.j.a.c.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: b.j.a.c.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(b.j.a.c.g r6, java.lang.String r7) {
        /*
            r5 = this;
            b.j.a.c.p r0 = b.j.a.c.p.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r6.P(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = r3
            goto L_0x0015
        L_0x000c:
            b.j.a.c.h r0 = b.j.a.c.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r1 = r6.O(r0)
            if (r1 == 0) goto L_0x002d
            r1 = r2
        L_0x0015:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x001e
            java.lang.String r7 = "empty String (\"\")"
            goto L_0x0028
        L_0x001e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.String r7 = "String \"%s\""
            java.lang.String r7 = java.lang.String.format(r7, r3)
        L_0x0028:
            r5.P(r6, r1, r0, r7)
            r6 = 0
            throw r6
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.z.S(b.j.a.c.g, java.lang.String):void");
    }

    public final void T(g gVar, String str) {
        String str2;
        p pVar = p.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.P(pVar)) {
            if (str.isEmpty()) {
                str2 = "empty String (\"\")";
            } else {
                str2 = String.format("String \"%s\"", new Object[]{str});
            }
            P(gVar, true, pVar, str2);
            throw null;
        }
    }

    public void U(g gVar, b.j.a.b.i iVar) {
        p pVar = p.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.P(pVar)) {
            gVar.Y(this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", iVar.x0(), u(), pVar.getClass().getSimpleName(), pVar.name());
            throw null;
        }
    }

    public void V(g gVar, String str) {
        p pVar = p.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.P(pVar)) {
            gVar.Y(this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, u(), pVar.getClass().getSimpleName(), pVar.name());
            throw null;
        }
    }

    public r W(g gVar, d dVar, j<?> jVar) {
        h0 h0Var = dVar != null ? dVar.l().f2301n : null;
        if (h0Var == h0.SKIP) {
            b.j.a.c.b0.z.p pVar = b.j.a.c.b0.z.p.f1837i;
            return b.j.a.c.b0.z.p.f1837i;
        }
        r y = y(gVar, dVar, h0Var, jVar);
        return y != null ? y : jVar;
    }

    public j<?> X(g gVar, d dVar, j<?> jVar) {
        b.j.a.c.e0.h e2;
        Object h2;
        b x = gVar.x();
        if (!G(x, dVar) || (e2 = dVar.e()) == null || (h2 = x.h(e2)) == null) {
            return jVar;
        }
        b.j.a.c.j0.j<Object, Object> f = gVar.f(dVar.e(), h2);
        i b2 = f.b(gVar.h());
        j<Object> jVar2 = jVar;
        if (jVar == null) {
            jVar2 = gVar.q(b2, dVar);
        }
        return new y(f, b2, jVar2);
    }

    public k.d Y(g gVar, d dVar, Class<?> cls) {
        if (dVar != null) {
            return dVar.j(gVar.f1993j, cls);
        }
        gVar.f1993j.f1616q.a(cls);
        return b.j.a.c.a0.g.f1607j;
    }

    public i Z() {
        return null;
    }

    public void a0(g gVar) {
        gVar.b0(this, l.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", l().getName());
        throw null;
    }

    public void b0(b.j.a.b.i iVar, g gVar, Object obj, String str) {
        if (obj == null) {
            obj = l();
        }
        for (n nVar = gVar.f1993j.t; nVar != null; nVar = nVar.f2227b) {
            Objects.requireNonNull((m) nVar.a);
        }
        if (!gVar.O(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
            iVar.a1();
            return;
        }
        Collection<Object> j2 = j();
        b.j.a.b.i iVar2 = gVar.f1996m;
        int i2 = b.j.a.c.c0.h.f1862m;
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        b.j.a.c.c0.h hVar = new b.j.a.c.c0.h(iVar2, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", new Object[]{str, cls.getName()}), iVar2.Y(), cls, str, j2);
        hVar.e(new k.a(obj, str));
        throw hVar;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.b(iVar, gVar);
    }

    public Class<?> l() {
        return this.f1761h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: b.j.a.c.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: b.j.a.c.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(b.j.a.c.g r3, boolean r4) {
        /*
            r2 = this;
            b.j.a.c.p r0 = b.j.a.c.p.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.P(r0)
            if (r1 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0015
            b.j.a.c.h r0 = b.j.a.c.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r4 = r3.O(r0)
            if (r4 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r4 = 0
            goto L_0x001b
        L_0x0015:
            java.lang.Object r3 = r2.c(r3)
            return r3
        L_0x001a:
            r4 = 1
        L_0x001b:
            java.lang.String r1 = "empty String (\"\")"
            r2.P(r3, r4, r0, r1)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.z.q(b.j.a.c.g, boolean):java.lang.Object");
    }

    public Object r(b.j.a.b.i iVar, g gVar) {
        int i2 = gVar.f1994k;
        if (h.USE_BIG_INTEGER_FOR_INTS.h(i2)) {
            return iVar.H();
        }
        return h.USE_LONG_FOR_INTS.h(i2) ? Long.valueOf(iVar.r0()) : iVar.H();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: b.j.a.c.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b.j.a.c.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: b.j.a.c.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object t(b.j.a.c.g r3, boolean r4) {
        /*
            r2 = this;
            b.j.a.c.p r0 = b.j.a.c.p.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.P(r0)
            if (r1 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0015
            b.j.a.c.h r0 = b.j.a.c.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r4 = r3.O(r0)
            if (r4 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r4 = 0
            goto L_0x001b
        L_0x0015:
            java.lang.Object r3 = r2.c(r3)
            return r3
        L_0x001a:
            r4 = 1
        L_0x001b:
            java.lang.String r1 = "String \"null\""
            r2.P(r3, r4, r0, r1)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.z.t(b.j.a.c.g, boolean):java.lang.Object");
    }

    public String u() {
        String str;
        String str2;
        StringBuilder sb;
        i Z = Z();
        boolean z = false;
        if (Z == null || Z.H()) {
            Class<?> l2 = l();
            if (l2.isArray() || Collection.class.isAssignableFrom(l2) || Map.class.isAssignableFrom(l2)) {
                z = true;
            }
            str = b.j.a.c.j0.g.y(l2);
        } else {
            if (Z.A() || Z.b()) {
                z = true;
            }
            StringBuilder y = a.y("'");
            y.append(Z.toString());
            y.append("'");
            str = y.toString();
        }
        if (z) {
            sb = new StringBuilder();
            str2 = "as content of type ";
        } else {
            sb = new StringBuilder();
            str2 = "for type ";
        }
        return a.q(sb, str2, str);
    }

    public T v(b.j.a.b.i iVar, g gVar) {
        l lVar;
        if (gVar.M(f1760j)) {
            lVar = iVar.T0();
            l lVar2 = l.END_ARRAY;
            if (lVar == lVar2 && gVar.O(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return c(gVar);
            }
            if (gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T d = d(iVar, gVar);
                if (iVar.T0() == lVar2) {
                    return d;
                }
                a0(gVar);
                throw null;
            }
        } else {
            lVar = iVar.g0();
        }
        g gVar2 = gVar;
        gVar2.H(this.f1761h, lVar, iVar, (String) null, new Object[0]);
        throw null;
    }

    public T w(b.j.a.b.i iVar, g gVar) {
        l g0 = iVar.g0();
        if (g0 == l.START_ARRAY) {
            if (gVar.O(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (iVar.T0() == l.END_ARRAY) {
                    return null;
                }
                gVar.G(this.f1761h, iVar);
                throw null;
            }
        } else if (g0 == l.VALUE_STRING && gVar.O(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.x0().trim().isEmpty()) {
            return null;
        }
        gVar.G(this.f1761h, iVar);
        throw null;
    }

    public void x(b.j.a.b.i iVar, g gVar, String str) {
        gVar.Z(l(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", iVar.H0(), str);
        throw null;
    }

    public final r y(g gVar, d dVar, h0 h0Var, j<?> jVar) {
        if (h0Var == h0.FAIL) {
            if (dVar == null) {
                return new q((t) null, gVar.n(jVar.l()));
            }
            return new q(dVar.h(), dVar.d());
        } else if (h0Var == h0.AS_EMPTY) {
            if (jVar == null) {
                return null;
            }
            if (!(jVar instanceof b.j.a.c.b0.d) || ((b.j.a.c.b0.d) jVar).f1771m.i()) {
                b.j.a.c.j0.a h2 = jVar.h();
                if (h2 == b.j.a.c.j0.a.ALWAYS_NULL) {
                    b.j.a.c.b0.z.p pVar = b.j.a.c.b0.z.p.f1837i;
                    return b.j.a.c.b0.z.p.f1838j;
                } else if (h2 != b.j.a.c.j0.a.CONSTANT) {
                    return new o(jVar);
                } else {
                    Object i2 = jVar.i(gVar);
                    return i2 == null ? b.j.a.c.b0.z.p.f1838j : new b.j.a.c.b0.z.p(i2);
                }
            } else {
                i d = dVar.d();
                gVar.l(d, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{d}));
                throw null;
            }
        } else if (h0Var != h0.SKIP) {
            return null;
        } else {
            b.j.a.c.b0.z.p pVar2 = b.j.a.c.b0.z.p.f1837i;
            return b.j.a.c.b0.z.p.f1837i;
        }
    }

    public boolean z(String str) {
        return "null".equals(str);
    }
}
