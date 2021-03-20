package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.d;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.h;
import b.j.a.c.j0.k;
import b.j.a.c.p;
import b.j.a.c.z.a;
import java.util.ArrayList;
import java.util.Objects;

@a
public class i extends c0<Object> implements b.j.a.c.b0.i {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f1677p = 0;

    /* renamed from: k  reason: collision with root package name */
    public Object[] f1678k;

    /* renamed from: l  reason: collision with root package name */
    public final Enum<?> f1679l;

    /* renamed from: m  reason: collision with root package name */
    public final h f1680m;

    /* renamed from: n  reason: collision with root package name */
    public h f1681n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f1682o;

    public i(i iVar, Boolean bool) {
        super((c0<?>) iVar);
        this.f1680m = iVar.f1680m;
        this.f1678k = iVar.f1678k;
        this.f1679l = iVar.f1679l;
        this.f1682o = bool;
    }

    public i(k kVar, Boolean bool) {
        super((Class<?>) kVar.f2219h);
        this.f1680m = kVar.a();
        this.f1678k = kVar.f2220i;
        this.f1679l = kVar.f2222k;
        this.f1682o = bool;
    }

    public j<?> a(g gVar, d dVar) {
        Class<?> cls = this.f1761h;
        k.a aVar = k.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES;
        k.d Y = Y(gVar, dVar, cls);
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        if (b2 == null) {
            b2 = this.f1682o;
        }
        return this.f1682o == b2 ? this : new i(this, b2);
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        h hVar;
        Object obj;
        char charAt;
        Object obj2;
        l g0 = iVar.g0();
        if (g0 == l.VALUE_STRING || g0 == l.FIELD_NAME) {
            if (gVar.O(b.j.a.c.h.READ_ENUMS_USING_TO_STRING)) {
                hVar = this.f1681n;
                if (hVar == null) {
                    synchronized (this) {
                        hVar = b.j.a.c.j0.k.b(this.f1761h, gVar.x()).a();
                    }
                    this.f1681n = hVar;
                }
            } else {
                hVar = this.f1680m;
            }
            String x0 = iVar.x0();
            Objects.requireNonNull(hVar);
            int hashCode = x0.hashCode() & hVar.f2216h;
            int i2 = hashCode << 1;
            Object obj3 = hVar.f2218j[i2];
            if (obj3 == x0 || x0.equals(obj3)) {
                obj = hVar.f2218j[i2 + 1];
            } else {
                if (obj3 != null) {
                    int i3 = hVar.f2216h + 1;
                    int i4 = ((hashCode >> 1) + i3) << 1;
                    Object obj4 = hVar.f2218j[i4];
                    if (x0.equals(obj4)) {
                        obj = hVar.f2218j[i4 + 1];
                    } else if (obj4 != null) {
                        int i5 = (i3 + (i3 >> 1)) << 1;
                        int i6 = hVar.f2217i + i5;
                        while (true) {
                            if (i5 >= i6) {
                                break;
                            }
                            Object obj5 = hVar.f2218j[i5];
                            if (obj5 == x0 || x0.equals(obj5)) {
                                obj = hVar.f2218j[i5 + 1];
                            } else {
                                i5 += 2;
                            }
                        }
                    }
                }
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
            String trim = x0.trim();
            if (trim.length() == 0) {
                if (gVar.O(b.j.a.c.h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                    return null;
                }
            } else if (Boolean.TRUE.equals(this.f1682o)) {
                int length = hVar.f2218j.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj6 = hVar.f2218j[i7];
                        if (obj6 != null && ((String) obj6).equalsIgnoreCase(trim)) {
                            obj2 = hVar.f2218j[i7 + 1];
                            break;
                        }
                        i7 += 2;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 != null) {
                    return obj2;
                }
            } else if (!gVar.O(b.j.a.c.h.FAIL_ON_NUMBERS_FOR_ENUMS) && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
                try {
                    int parseInt = Integer.parseInt(trim);
                    if (!gVar.P(p.ALLOW_COERCION_OF_SCALARS)) {
                        gVar.L(this.f1761h, trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                        throw null;
                    } else if (parseInt >= 0) {
                        Object[] objArr = this.f1678k;
                        if (parseInt < objArr.length) {
                            return objArr[parseInt];
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (this.f1679l != null && gVar.O(b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f1679l;
            }
            if (gVar.O(b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            Class<?> cls = this.f1761h;
            Object[] objArr2 = new Object[1];
            int length2 = hVar.f2218j.length;
            ArrayList arrayList = new ArrayList(length2 >> 2);
            for (int i8 = 0; i8 < length2; i8 += 2) {
                Object obj7 = hVar.f2218j[i8];
                if (obj7 != null) {
                    arrayList.add((String) obj7);
                }
            }
            objArr2[0] = arrayList;
            gVar.L(cls, trim, "value not one of declared Enum instance names: %s", objArr2);
            throw null;
        } else if (g0 == l.VALUE_NUMBER_INT) {
            int q0 = iVar.q0();
            if (!gVar.O(b.j.a.c.h.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                if (q0 >= 0) {
                    Object[] objArr3 = this.f1678k;
                    if (q0 < objArr3.length) {
                        return objArr3[q0];
                    }
                }
                if (this.f1679l != null && gVar.O(b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    return this.f1679l;
                }
                if (gVar.O(b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return null;
                }
                gVar.K(this.f1761h, Integer.valueOf(q0), "index value outside legal index range [0..%s]", Integer.valueOf(this.f1678k.length - 1));
                throw null;
            }
            gVar.K(this.f1761h, Integer.valueOf(q0), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            throw null;
        } else if (iVar.L0(l.START_ARRAY)) {
            return v(iVar, gVar);
        } else {
            gVar.G(this.f1761h, iVar);
            throw null;
        }
    }

    public boolean m() {
        return true;
    }
}
