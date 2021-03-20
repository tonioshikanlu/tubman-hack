package b.j.a.c.i0;

import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class m implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f2171l;

    /* renamed from: m  reason: collision with root package name */
    public static final i[] f2172m;

    /* renamed from: n  reason: collision with root package name */
    public static final m f2173n;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f2174h;

    /* renamed from: i  reason: collision with root package name */
    public final i[] f2175i;

    /* renamed from: j  reason: collision with root package name */
    public final String[] f2176j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2177k;

    public static final class a {
        public final Class<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final i[] f2178b;
        public final int c;

        public a(Class<?> cls, i[] iVarArr, int i2) {
            this.a = cls;
            this.f2178b = iVarArr;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.c == aVar.c && this.a == aVar.a) {
                i[] iVarArr = aVar.f2178b;
                int length = this.f2178b.length;
                if (length == iVarArr.length) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!this.f2178b[i2].equals(iVarArr[i2])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.c;
        }

        public String toString() {
            return b.e.a.a.a.e(this.a, new StringBuilder(), "<>");
        }
    }

    public static class b {
        public static final TypeVariable<?>[] a = AbstractList.class.getTypeParameters();

        /* renamed from: b  reason: collision with root package name */
        public static final TypeVariable<?>[] f2179b = Collection.class.getTypeParameters();
        public static final TypeVariable<?>[] c = Iterable.class.getTypeParameters();
        public static final TypeVariable<?>[] d = List.class.getTypeParameters();

        /* renamed from: e  reason: collision with root package name */
        public static final TypeVariable<?>[] f2180e = ArrayList.class.getTypeParameters();
        public static final TypeVariable<?>[] f = Map.class.getTypeParameters();

        /* renamed from: g  reason: collision with root package name */
        public static final TypeVariable<?>[] f2181g = HashMap.class.getTypeParameters();

        /* renamed from: h  reason: collision with root package name */
        public static final TypeVariable<?>[] f2182h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        f2171l = strArr;
        i[] iVarArr = new i[0];
        f2172m = iVarArr;
        f2173n = new m(strArr, iVarArr, (String[]) null);
    }

    public m(String[] strArr, i[] iVarArr, String[] strArr2) {
        strArr = strArr == null ? f2171l : strArr;
        this.f2174h = strArr;
        iVarArr = iVarArr == null ? f2172m : iVarArr;
        this.f2175i = iVarArr;
        if (strArr.length == iVarArr.length) {
            int length = iVarArr.length;
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                i2 += this.f2175i[i3].f2153i;
            }
            this.f2176j = strArr2;
            this.f2177k = i2;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Mismatching names (");
        y.append(strArr.length);
        y.append("), types (");
        throw new IllegalArgumentException(b.e.a.a.a.o(y, iVarArr.length, ")"));
    }

    public static m a(Class<?> cls, i iVar) {
        int i2;
        TypeVariable<?>[] typeVariableArr = b.a;
        TypeVariable<?>[] typeParameters = cls == Collection.class ? b.f2179b : cls == List.class ? b.d : cls == ArrayList.class ? b.f2180e : cls == AbstractList.class ? b.a : cls == Iterable.class ? b.c : cls.getTypeParameters();
        if (typeParameters == null) {
            i2 = 0;
        } else {
            i2 = typeParameters.length;
        }
        if (i2 == 1) {
            return new m(new String[]{typeParameters[0].getName()}, new i[]{iVar}, (String[]) null);
        }
        StringBuilder y = b.e.a.a.a.y("Cannot create TypeBindings for class ");
        y.append(cls.getName());
        y.append(" with 1 type parameter: class expects ");
        y.append(i2);
        throw new IllegalArgumentException(y.toString());
    }

    public static m b(Class<?> cls, i iVar, i iVar2) {
        int i2;
        TypeVariable<?>[] typeVariableArr = b.a;
        TypeVariable<?>[] typeParameters = cls == Map.class ? b.f : cls == HashMap.class ? b.f2181g : cls == LinkedHashMap.class ? b.f2182h : cls.getTypeParameters();
        if (typeParameters == null) {
            i2 = 0;
        } else {
            i2 = typeParameters.length;
        }
        if (i2 == 2) {
            return new m(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new i[]{iVar, iVar2}, (String[]) null);
        }
        StringBuilder y = b.e.a.a.a.y("Cannot create TypeBindings for class ");
        y.append(cls.getName());
        y.append(" with 2 type parameters: class expects ");
        y.append(i2);
        throw new IllegalArgumentException(y.toString());
    }

    public static m c(Class<?> cls, i[] iVarArr) {
        String[] strArr;
        if (iVarArr == null) {
            iVarArr = f2172m;
        } else {
            int length = iVarArr.length;
            if (length == 1) {
                return a(cls, iVarArr[0]);
            }
            if (length == 2) {
                return b(cls, iVarArr[0], iVarArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f2171l;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                strArr[i2] = typeParameters[i2].getName();
            }
        }
        if (strArr.length == iVarArr.length) {
            return new m(strArr, iVarArr, (String[]) null);
        }
        StringBuilder y = b.e.a.a.a.y("Cannot create TypeBindings for class ");
        b.e.a.a.a.I(cls, y, " with ");
        y.append(iVarArr.length);
        y.append(" type parameter");
        y.append(iVarArr.length == 1 ? "" : "s");
        y.append(": class expects ");
        y.append(strArr.length);
        throw new IllegalArgumentException(y.toString());
    }

    public List<i> d() {
        i[] iVarArr = this.f2175i;
        return iVarArr.length == 0 ? Collections.emptyList() : Arrays.asList(iVarArr);
    }

    public boolean e() {
        return this.f2175i.length == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!g.s(obj, m.class)) {
            return false;
        }
        int length = this.f2175i.length;
        i[] iVarArr = ((m) obj).f2175i;
        if (length != iVarArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (!iVarArr[i2].equals(this.f2175i[i2])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f2177k;
    }

    public String toString() {
        if (this.f2175i.length == 0) {
            return "<>";
        }
        StringBuilder v = b.e.a.a.a.v('<');
        int length = this.f2175i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                v.append(',');
            }
            i iVar = this.f2175i[i2];
            StringBuilder sb = new StringBuilder(40);
            iVar.l(sb);
            v.append(sb.toString());
        }
        v.append('>');
        return v.toString();
    }
}
