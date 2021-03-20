package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.b.v.b;
import b.j.a.c.i;
import b.j.a.c.m;
import b.j.a.c.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class l extends i implements m {

    /* renamed from: p  reason: collision with root package name */
    public static final m f2167p = m.f2173n;

    /* renamed from: m  reason: collision with root package name */
    public final i f2168m;

    /* renamed from: n  reason: collision with root package name */
    public final i[] f2169n;

    /* renamed from: o  reason: collision with root package name */
    public final m f2170o;

    public l(Class<?> cls, m mVar, i iVar, i[] iVarArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, i2, obj, obj2, z);
        this.f2170o = mVar == null ? f2167p : mVar;
        this.f2168m = iVar;
        this.f2169n = iVarArr;
    }

    public static StringBuilder S(Class<?> cls, StringBuilder sb, boolean z) {
        char c;
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = name.charAt(i2);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                c = ';';
            }
            return sb;
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else {
            throw new IllegalStateException(a.d(cls, a.y("Unrecognized primitive type: ")));
        }
        sb.append(c);
        return sb;
    }

    public String T() {
        return this.f2152h.getName();
    }

    public String c() {
        return T();
    }

    public void d(f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        b bVar = new b(this, b.j.a.b.l.VALUE_STRING);
        fVar2.e(fVar, bVar);
        fVar.Q0(T());
        fVar2.f(fVar, bVar);
    }

    public void e(f fVar, y yVar) {
        fVar.Q0(T());
    }

    public i f(int i2) {
        m mVar = this.f2170o;
        Objects.requireNonNull(mVar);
        if (i2 >= 0) {
            i[] iVarArr = mVar.f2175i;
            if (i2 < iVarArr.length) {
                return iVarArr[i2];
            }
        }
        return null;
    }

    public int g() {
        return this.f2170o.f2175i.length;
    }

    public final i i(Class<?> cls) {
        i i2;
        i[] iVarArr;
        if (cls == this.f2152h) {
            return this;
        }
        if (cls.isInterface() && (iVarArr = this.f2169n) != null) {
            int length = iVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                i i4 = this.f2169n[i3].i(cls);
                if (i4 != null) {
                    return i4;
                }
            }
        }
        i iVar = this.f2168m;
        if (iVar == null || (i2 = iVar.i(cls)) == null) {
            return null;
        }
        return i2;
    }

    public m j() {
        return this.f2170o;
    }

    public List<i> m() {
        i[] iVarArr = this.f2169n;
        if (iVarArr == null) {
            return Collections.emptyList();
        }
        int length = iVarArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(iVarArr) : Collections.singletonList(iVarArr[0]) : Collections.emptyList();
    }

    public i q() {
        return this.f2168m;
    }
}
