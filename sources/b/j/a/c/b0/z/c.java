package b.j.a.c.b0.z;

import b.e.a.a.a;
import b.j.a.c.b0.u;
import b.j.a.c.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class c implements Iterable<u>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1808h;

    /* renamed from: i  reason: collision with root package name */
    public int f1809i;

    /* renamed from: j  reason: collision with root package name */
    public int f1810j;

    /* renamed from: k  reason: collision with root package name */
    public int f1811k;

    /* renamed from: l  reason: collision with root package name */
    public Object[] f1812l;

    /* renamed from: m  reason: collision with root package name */
    public final u[] f1813m;

    /* renamed from: n  reason: collision with root package name */
    public final Map<String, List<t>> f1814n;

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, String> f1815o;

    public c(c cVar, u uVar, int i2, int i3) {
        this.f1808h = cVar.f1808h;
        this.f1809i = cVar.f1809i;
        this.f1810j = cVar.f1810j;
        this.f1811k = cVar.f1811k;
        this.f1814n = cVar.f1814n;
        this.f1815o = cVar.f1815o;
        Object[] objArr = cVar.f1812l;
        this.f1812l = Arrays.copyOf(objArr, objArr.length);
        u[] uVarArr = cVar.f1813m;
        u[] uVarArr2 = (u[]) Arrays.copyOf(uVarArr, uVarArr.length);
        this.f1813m = uVarArr2;
        this.f1812l[i2] = uVar;
        uVarArr2[i3] = uVar;
    }

    public c(c cVar, u uVar, String str, int i2) {
        this.f1808h = cVar.f1808h;
        this.f1809i = cVar.f1809i;
        this.f1810j = cVar.f1810j;
        this.f1811k = cVar.f1811k;
        this.f1814n = cVar.f1814n;
        this.f1815o = cVar.f1815o;
        Object[] objArr = cVar.f1812l;
        this.f1812l = Arrays.copyOf(objArr, objArr.length);
        u[] uVarArr = cVar.f1813m;
        int length = uVarArr.length;
        u[] uVarArr2 = (u[]) Arrays.copyOf(uVarArr, length + 1);
        this.f1813m = uVarArr2;
        uVarArr2[length] = uVar;
        int i3 = this.f1809i + 1;
        int i4 = i2 << 1;
        Object[] objArr2 = this.f1812l;
        if (objArr2[i4] != null) {
            i4 = ((i2 >> 1) + i3) << 1;
            if (objArr2[i4] != null) {
                int i5 = this.f1811k;
                i4 = ((i3 + (i3 >> 1)) << 1) + i5;
                this.f1811k = i5 + 2;
                if (i4 >= objArr2.length) {
                    this.f1812l = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f1812l;
        objArr3[i4] = str;
        objArr3[i4 + 1] = uVar;
    }

    public c(c cVar, boolean z) {
        this.f1808h = z;
        this.f1814n = cVar.f1814n;
        this.f1815o = cVar.f1815o;
        u[] uVarArr = cVar.f1813m;
        u[] uVarArr2 = (u[]) Arrays.copyOf(uVarArr, uVarArr.length);
        this.f1813m = uVarArr2;
        D(Arrays.asList(uVarArr2));
    }

    public c(boolean z, Collection<u> collection, Map<String, List<t>> map) {
        HashMap hashMap;
        this.f1808h = z;
        this.f1813m = (u[]) collection.toArray(new u[collection.size()]);
        this.f1814n = map;
        if (map == null || map.isEmpty()) {
            hashMap = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                str = this.f1808h ? str.toLowerCase() : str;
                for (t tVar : (List) next.getValue()) {
                    String str2 = tVar.f2305h;
                    if (this.f1808h) {
                        str2 = str2.toLowerCase();
                    }
                    hashMap2.put(str2, str);
                }
            }
            hashMap = hashMap2;
        }
        this.f1815o = hashMap;
        D(collection);
    }

    public void D(Collection<u> collection) {
        int i2;
        int size = collection.size();
        this.f1810j = size;
        if (size <= 5) {
            i2 = 8;
        } else if (size <= 12) {
            i2 = 16;
        } else {
            int i3 = 32;
            while (i3 < size + (size >> 2)) {
                i3 += i3;
            }
            i2 = i3;
        }
        this.f1809i = i2 - 1;
        int i4 = (i2 >> 1) + i2;
        Object[] objArr = new Object[(i4 * 2)];
        int i5 = 0;
        for (u next : collection) {
            if (next != null) {
                String y = y(next);
                int l2 = l(y);
                int i6 = l2 << 1;
                if (objArr[i6] != null) {
                    i6 = ((l2 >> 1) + i2) << 1;
                    if (objArr[i6] != null) {
                        i6 = (i4 << 1) + i5;
                        i5 += 2;
                        if (i6 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i6] = y;
                objArr[i6 + 1] = next;
            }
        }
        this.f1812l = objArr;
        this.f1811k = i5;
    }

    public void G(u uVar) {
        ArrayList arrayList = new ArrayList(this.f1810j);
        String y = y(uVar);
        int length = this.f1812l.length;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2 += 2) {
            Object[] objArr = this.f1812l;
            u uVar2 = (u) objArr[i2];
            if (uVar2 != null) {
                if (z || !(z = y.equals(objArr[i2 - 1]))) {
                    arrayList.add(uVar2);
                } else {
                    this.f1813m[d(uVar2)] = null;
                }
            }
        }
        if (z) {
            D(arrayList);
            return;
        }
        throw new NoSuchElementException(a.q(a.y("No entry '"), uVar.f1796k.f2305h, "' found, can't remove"));
    }

    public c H(u uVar) {
        String y = y(uVar);
        int length = this.f1812l.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            u uVar2 = (u) this.f1812l[i2];
            if (uVar2 != null && uVar2.f1796k.f2305h.equals(y)) {
                return new c(this, uVar, i2, d(uVar2));
            }
        }
        return new c(this, uVar, y, l(y));
    }

    public final int d(u uVar) {
        int length = this.f1813m.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f1813m[i2] == uVar) {
                return i2;
            }
        }
        throw new IllegalStateException(a.q(a.y("Illegal state: property '"), uVar.f1796k.f2305h, "' missing from _propsInOrder"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: b.j.a.c.b0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: b.j.a.c.b0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.b0.u e(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5.l(r6)
            int r2 = r1 << 1
            java.lang.Object[] r3 = r5.f1812l
            r3 = r3[r2]
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x001d
            java.lang.Object[] r6 = r5.f1812l
            int r2 = r2 + 1
            r6 = r6[r2]
            b.j.a.c.b0.u r6 = (b.j.a.c.b0.u) r6
            return r6
        L_0x001d:
            if (r3 != 0) goto L_0x0020
            return r0
        L_0x0020:
            int r2 = r5.f1809i
            int r2 = r2 + 1
            int r1 = r1 >> 1
            int r1 = r1 + r2
            int r1 = r1 << 1
            java.lang.Object[] r3 = r5.f1812l
            r3 = r3[r1]
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L_0x003a
            java.lang.Object[] r6 = r5.f1812l
            int r1 = r1 + 1
            r6 = r6[r1]
            goto L_0x005c
        L_0x003a:
            if (r3 == 0) goto L_0x005f
            int r1 = r2 >> 1
            int r2 = r2 + r1
            int r1 = r2 << 1
            int r2 = r5.f1811k
            int r2 = r2 + r1
        L_0x0044:
            if (r1 >= r2) goto L_0x005f
            java.lang.Object[] r3 = r5.f1812l
            r3 = r3[r1]
            if (r3 == r6) goto L_0x0056
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            int r1 = r1 + 2
            goto L_0x0044
        L_0x0056:
            java.lang.Object[] r6 = r5.f1812l
            int r1 = r1 + 1
            r6 = r6[r1]
        L_0x005c:
            r0 = r6
            b.j.a.c.b0.u r0 = (b.j.a.c.b0.u) r0
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.z.c.e(java.lang.String):b.j.a.c.b0.u");
    }

    public Iterator<u> iterator() {
        ArrayList arrayList = new ArrayList(this.f1810j);
        int length = this.f1812l.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            u uVar = (u) this.f1812l[i2];
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList.iterator();
    }

    public final int l(String str) {
        return str.hashCode() & this.f1809i;
    }

    public c n() {
        int length = this.f1812l.length;
        int i2 = 0;
        for (int i3 = 1; i3 < length; i3 += 2) {
            u uVar = (u) this.f1812l[i3];
            if (uVar != null) {
                uVar.b(i2);
                i2++;
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder y = a.y("Properties=[");
        Iterator<u> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            u next = it.next();
            int i3 = i2 + 1;
            if (i2 > 0) {
                y.append(", ");
            }
            y.append(next.f1796k.f2305h);
            y.append('(');
            y.append(next.f1797l);
            y.append(')');
            i2 = i3;
        }
        y.append(']');
        if (!this.f1814n.isEmpty()) {
            y.append("(aliases: ");
            y.append(this.f1814n);
            y.append(")");
        }
        return y.toString();
    }

    public u v(String str) {
        Object obj;
        if (str != null) {
            if (this.f1808h) {
                str = str.toLowerCase();
            }
            int hashCode = str.hashCode() & this.f1809i;
            int i2 = hashCode << 1;
            Object obj2 = this.f1812l[i2];
            if (obj2 == str || str.equals(obj2)) {
                return (u) this.f1812l[i2 + 1];
            }
            if (obj2 != null) {
                int i3 = this.f1809i + 1;
                int i4 = ((hashCode >> 1) + i3) << 1;
                Object obj3 = this.f1812l[i4];
                if (str.equals(obj3)) {
                    obj = this.f1812l[i4 + 1];
                } else if (obj3 != null) {
                    int i5 = (i3 + (i3 >> 1)) << 1;
                    int i6 = this.f1811k + i5;
                    while (i5 < i6) {
                        Object obj4 = this.f1812l[i5];
                        if (obj4 == str || str.equals(obj4)) {
                            obj = this.f1812l[i5 + 1];
                        } else {
                            i5 += 2;
                        }
                    }
                }
                return (u) obj;
            }
            return e(this.f1815o.get(str));
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public final String y(u uVar) {
        if (this.f1808h) {
            return uVar.f1796k.f2305h.toLowerCase();
        }
        return uVar.f1796k.f2305h;
    }
}
