package b.p.a;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class v<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: p  reason: collision with root package name */
    public static final Comparator<Comparable> f6416p = new a();

    /* renamed from: h  reason: collision with root package name */
    public Comparator<? super K> f6417h = f6416p;

    /* renamed from: i  reason: collision with root package name */
    public f<K, V>[] f6418i = new f[16];

    /* renamed from: j  reason: collision with root package name */
    public final f<K, V> f6419j = new f<>();

    /* renamed from: k  reason: collision with root package name */
    public int f6420k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f6421l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6422m = 12;

    /* renamed from: n  reason: collision with root package name */
    public v<K, V>.defpackage.c f6423n;

    /* renamed from: o  reason: collision with root package name */
    public v<K, V>.defpackage.d f6424o;

    public class a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public static final class b<K, V> {
        public f<K, V> a;

        /* renamed from: b  reason: collision with root package name */
        public int f6425b;
        public int c;
        public int d;

        public void a(f<K, V> fVar) {
            fVar.f6434j = null;
            fVar.f6432h = null;
            fVar.f6433i = null;
            fVar.f6440p = 1;
            int i2 = this.f6425b;
            if (i2 > 0) {
                int i3 = this.d;
                if ((i3 & 1) == 0) {
                    this.d = i3 + 1;
                    this.f6425b = i2 - 1;
                    this.c++;
                }
            }
            fVar.f6432h = this.a;
            this.a = fVar;
            int i4 = this.d + 1;
            this.d = i4;
            int i5 = this.f6425b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i4 + 1;
                this.f6425b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) == i7) {
                    int i8 = this.c;
                    if (i8 == 0) {
                        f<K, V> fVar2 = this.a;
                        f<K, V> fVar3 = fVar2.f6432h;
                        f<K, V> fVar4 = fVar3.f6432h;
                        fVar3.f6432h = fVar4.f6432h;
                        this.a = fVar3;
                        fVar3.f6433i = fVar4;
                        fVar3.f6434j = fVar2;
                        fVar3.f6440p = fVar2.f6440p + 1;
                        fVar4.f6432h = fVar3;
                        fVar2.f6432h = fVar3;
                    } else {
                        if (i8 == 1) {
                            f<K, V> fVar5 = this.a;
                            f<K, V> fVar6 = fVar5.f6432h;
                            this.a = fVar6;
                            fVar6.f6434j = fVar5;
                            fVar6.f6440p = fVar5.f6440p + 1;
                            fVar5.f6432h = fVar6;
                        } else if (i8 != 2) {
                        }
                        this.c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        public void b(int i2) {
            this.f6425b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }
    }

    public final class c extends AbstractSet<Map.Entry<K, V>> {

        public class a extends v<K, V>.e<Map.Entry<K, V>> {
            public a(c cVar) {
                super();
            }

            public Object next() {
                return a();
            }
        }

        public c() {
        }

        public void clear() {
            v.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && v.this.b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            f b2;
            if (!(obj instanceof Map.Entry) || (b2 = v.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            v.this.e(b2, true);
            return true;
        }

        public int size() {
            return v.this.f6420k;
        }
    }

    public final class d extends AbstractSet<K> {

        public class a extends v<K, V>.e<K> {
            public a(d dVar) {
                super();
            }

            public K next() {
                return a().f6437m;
            }
        }

        public d() {
        }

        public void clear() {
            v.this.clear();
        }

        public boolean contains(Object obj) {
            return v.this.c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            v vVar = v.this;
            f c = vVar.c(obj);
            if (c != null) {
                vVar.e(c, true);
            }
            return c != null;
        }

        public int size() {
            return v.this.f6420k;
        }
    }

    public abstract class e<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public f<K, V> f6428h;

        /* renamed from: i  reason: collision with root package name */
        public f<K, V> f6429i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f6430j;

        public e() {
            this.f6428h = v.this.f6419j.f6435k;
            this.f6430j = v.this.f6421l;
        }

        public final f<K, V> a() {
            f<K, V> fVar = this.f6428h;
            v vVar = v.this;
            if (fVar == vVar.f6419j) {
                throw new NoSuchElementException();
            } else if (vVar.f6421l == this.f6430j) {
                this.f6428h = fVar.f6435k;
                this.f6429i = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f6428h != v.this.f6419j;
        }

        public final void remove() {
            f<K, V> fVar = this.f6429i;
            if (fVar != null) {
                v.this.e(fVar, true);
                this.f6429i = null;
                this.f6430j = v.this.f6421l;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class f<K, V> implements Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        public f<K, V> f6432h;

        /* renamed from: i  reason: collision with root package name */
        public f<K, V> f6433i;

        /* renamed from: j  reason: collision with root package name */
        public f<K, V> f6434j;

        /* renamed from: k  reason: collision with root package name */
        public f<K, V> f6435k;

        /* renamed from: l  reason: collision with root package name */
        public f<K, V> f6436l;

        /* renamed from: m  reason: collision with root package name */
        public final K f6437m;

        /* renamed from: n  reason: collision with root package name */
        public final int f6438n;

        /* renamed from: o  reason: collision with root package name */
        public V f6439o;

        /* renamed from: p  reason: collision with root package name */
        public int f6440p;

        public f() {
            this.f6437m = null;
            this.f6438n = -1;
            this.f6436l = this;
            this.f6435k = this;
        }

        public f(f<K, V> fVar, K k2, int i2, f<K, V> fVar2, f<K, V> fVar3) {
            this.f6432h = fVar;
            this.f6437m = k2;
            this.f6438n = i2;
            this.f6440p = 1;
            this.f6435k = fVar2;
            this.f6436l = fVar3;
            fVar3.f6435k = this;
            fVar2.f6436l = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f6437m
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f6439o
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.a.v.f.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f6437m;
        }

        public V getValue() {
            return this.f6439o;
        }

        public int hashCode() {
            K k2 = this.f6437m;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f6439o;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f6439o;
            this.f6439o = v;
            return v2;
        }

        public String toString() {
            return this.f6437m + "=" + this.f6439o;
        }
    }

    static {
        Class<v> cls = v.class;
    }

    public f<K, V> a(K k2, boolean z) {
        int i2;
        f<K, V> fVar;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V> fVar4;
        f<K, V> fVar5;
        K k3 = k2;
        Comparator<Comparable> comparator = f6416p;
        Comparator<? super K> comparator2 = this.f6417h;
        f<K, V>[] fVarArr = this.f6418i;
        int hashCode = k2.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i4 = (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
        int length = i4 & (fVarArr.length - 1);
        f<K, V> fVar6 = fVarArr[length];
        if (fVar6 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k3 : null;
            while (true) {
                K k4 = fVar6.f6437m;
                i2 = comparable != null ? comparable.compareTo(k4) : comparator2.compare(k3, k4);
                if (i2 == 0) {
                    return fVar6;
                }
                f<K, V> fVar7 = i2 < 0 ? fVar6.f6433i : fVar6.f6434j;
                if (fVar7 == null) {
                    break;
                }
                fVar6 = fVar7;
            }
        } else {
            i2 = 0;
        }
        int i5 = i2;
        f<K, V> fVar8 = fVar6;
        if (!z) {
            return null;
        }
        f<K, V> fVar9 = this.f6419j;
        if (fVar8 != null) {
            f<K, V> fVar10 = new f<>(fVar8, k2, i4, fVar9, fVar9.f6436l);
            if (i5 < 0) {
                fVar8.f6433i = fVar10;
            } else {
                fVar8.f6434j = fVar10;
            }
            d(fVar8, true);
            fVar = fVar10;
        } else if (comparator2 != comparator || (k3 instanceof Comparable)) {
            fVar = new f<>(fVar8, k2, i4, fVar9, fVar9.f6436l);
            fVarArr[length] = fVar;
        } else {
            throw new ClassCastException(b.e.a.a.a.f(k3, new StringBuilder(), " is not Comparable"));
        }
        int i6 = this.f6420k;
        this.f6420k = i6 + 1;
        if (i6 > this.f6422m) {
            f<K, V>[] fVarArr2 = this.f6418i;
            int length2 = fVarArr2.length;
            int i7 = length2 * 2;
            f<K, V>[] fVarArr3 = new f[i7];
            b bVar = new b();
            b bVar2 = new b();
            for (int i8 = 0; i8 < length2; i8++) {
                f<K, V> fVar11 = fVarArr2[i8];
                if (fVar11 != null) {
                    f<K, V> fVar12 = null;
                    for (f<K, V> fVar13 = fVar11; fVar13 != null; fVar13 = fVar13.f6433i) {
                        fVar13.f6432h = fVar12;
                        fVar12 = fVar13;
                    }
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (fVar12 != null) {
                            f<K, V> fVar14 = fVar12.f6432h;
                            fVar12.f6432h = null;
                            f<K, V> fVar15 = fVar12.f6434j;
                            while (true) {
                                f<K, V> fVar16 = fVar15;
                                fVar2 = fVar14;
                                fVar14 = fVar16;
                                if (fVar14 == null) {
                                    break;
                                }
                                fVar14.f6432h = fVar2;
                                fVar15 = fVar14.f6433i;
                            }
                        } else {
                            fVar2 = fVar12;
                            fVar12 = null;
                        }
                        if (fVar12 == null) {
                            break;
                        }
                        if ((fVar12.f6438n & length2) == 0) {
                            i9++;
                        } else {
                            i10++;
                        }
                        fVar12 = fVar2;
                    }
                    bVar.b(i9);
                    bVar2.b(i10);
                    f<K, V> fVar17 = null;
                    while (fVar11 != null) {
                        fVar11.f6432h = fVar17;
                        fVar17 = fVar11;
                        fVar11 = fVar11.f6433i;
                    }
                    while (true) {
                        if (fVar17 != null) {
                            f<K, V> fVar18 = fVar17.f6432h;
                            fVar17.f6432h = null;
                            f<K, V> fVar19 = fVar17.f6434j;
                            while (true) {
                                f<K, V> fVar20 = fVar19;
                                fVar3 = fVar18;
                                fVar18 = fVar20;
                                if (fVar18 == null) {
                                    break;
                                }
                                fVar18.f6432h = fVar3;
                                fVar19 = fVar18.f6433i;
                            }
                        } else {
                            fVar3 = fVar17;
                            fVar17 = null;
                        }
                        if (fVar17 == null) {
                            break;
                        }
                        if ((fVar17.f6438n & length2) == 0) {
                            bVar.a(fVar17);
                        } else {
                            bVar2.a(fVar17);
                        }
                        fVar17 = fVar3;
                    }
                    if (i9 > 0) {
                        fVar4 = bVar.a;
                        if (fVar4.f6432h != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar4 = null;
                    }
                    fVarArr3[i8] = fVar4;
                    int i11 = i8 + length2;
                    if (i10 > 0) {
                        fVar5 = bVar2.a;
                        if (fVar5.f6432h != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar5 = null;
                    }
                    fVarArr3[i11] = fVar5;
                }
            }
            this.f6418i = fVarArr3;
            this.f6422m = (i7 / 4) + (i7 / 2);
        }
        this.f6421l++;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.p.a.v.f<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.p.a.v$f r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f6439o
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.a.v.b(java.util.Map$Entry):b.p.a.v$f");
    }

    public f<K, V> c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        Arrays.fill(this.f6418i, (Object) null);
        this.f6420k = 0;
        this.f6421l++;
        f<K, V> fVar = this.f6419j;
        f<K, V> fVar2 = fVar.f6435k;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.f6435k;
            fVar2.f6436l = null;
            fVar2.f6435k = null;
            fVar2 = fVar3;
        }
        fVar.f6436l = fVar;
        fVar.f6435k = fVar;
    }

    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.f6433i;
            f<K, V> fVar3 = fVar.f6434j;
            int i2 = 0;
            int i3 = fVar2 != null ? fVar2.f6440p : 0;
            int i4 = fVar3 != null ? fVar3.f6440p : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                f<K, V> fVar4 = fVar3.f6433i;
                f<K, V> fVar5 = fVar3.f6434j;
                int i6 = fVar5 != null ? fVar5.f6440p : 0;
                if (fVar4 != null) {
                    i2 = fVar4.f6440p;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    h(fVar3);
                }
                g(fVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                f<K, V> fVar6 = fVar2.f6433i;
                f<K, V> fVar7 = fVar2.f6434j;
                int i8 = fVar7 != null ? fVar7.f6440p : 0;
                if (fVar6 != null) {
                    i2 = fVar6.f6440p;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    g(fVar2);
                }
                h(fVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                fVar.f6440p = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f6440p = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f6432h;
        }
    }

    public void e(f<K, V> fVar, boolean z) {
        f<K, V> fVar2;
        int i2;
        f<K, V> fVar3;
        if (z) {
            f<K, V> fVar4 = fVar.f6436l;
            fVar4.f6435k = fVar.f6435k;
            fVar.f6435k.f6436l = fVar4;
            fVar.f6436l = null;
            fVar.f6435k = null;
        }
        f<K, V> fVar5 = fVar.f6433i;
        f<K, V> fVar6 = fVar.f6434j;
        f<K, V> fVar7 = fVar.f6432h;
        int i3 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                f(fVar, fVar5);
                fVar.f6433i = null;
            } else if (fVar6 != null) {
                f(fVar, fVar6);
                fVar.f6434j = null;
            } else {
                f(fVar, (f<K, V>) null);
            }
            d(fVar7, false);
            this.f6420k--;
            this.f6421l++;
            return;
        }
        if (fVar5.f6440p > fVar6.f6440p) {
            do {
                fVar2 = fVar5;
                fVar5 = fVar5.f6434j;
            } while (fVar5 != null);
        } else {
            do {
                f<K, V> fVar8 = fVar6;
                fVar6 = fVar6.f6433i;
                fVar3 = fVar8;
            } while (fVar6 != null);
            fVar2 = fVar3;
        }
        e(fVar2, false);
        f<K, V> fVar9 = fVar.f6433i;
        if (fVar9 != null) {
            i2 = fVar9.f6440p;
            fVar2.f6433i = fVar9;
            fVar9.f6432h = fVar2;
            fVar.f6433i = null;
        } else {
            i2 = 0;
        }
        f<K, V> fVar10 = fVar.f6434j;
        if (fVar10 != null) {
            i3 = fVar10.f6440p;
            fVar2.f6434j = fVar10;
            fVar10.f6432h = fVar2;
            fVar.f6434j = null;
        }
        fVar2.f6440p = Math.max(i2, i3) + 1;
        f(fVar, fVar2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        v<K, V>.defpackage.c cVar = this.f6423n;
        if (cVar != null) {
            return cVar;
        }
        v<K, V>.defpackage.c cVar2 = new c();
        this.f6423n = cVar2;
        return cVar2;
    }

    public final void f(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.f6432h;
        fVar.f6432h = null;
        if (fVar2 != null) {
            fVar2.f6432h = fVar3;
        }
        if (fVar3 == null) {
            int i2 = fVar.f6438n;
            f<K, V>[] fVarArr = this.f6418i;
            fVarArr[i2 & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f6433i == fVar) {
            fVar3.f6433i = fVar2;
        } else {
            fVar3.f6434j = fVar2;
        }
    }

    public final void g(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f6433i;
        f<K, V> fVar3 = fVar.f6434j;
        f<K, V> fVar4 = fVar3.f6433i;
        f<K, V> fVar5 = fVar3.f6434j;
        fVar.f6434j = fVar4;
        if (fVar4 != null) {
            fVar4.f6432h = fVar;
        }
        f(fVar, fVar3);
        fVar3.f6433i = fVar;
        fVar.f6432h = fVar3;
        int i2 = 0;
        int max = Math.max(fVar2 != null ? fVar2.f6440p : 0, fVar4 != null ? fVar4.f6440p : 0) + 1;
        fVar.f6440p = max;
        if (fVar5 != null) {
            i2 = fVar5.f6440p;
        }
        fVar3.f6440p = Math.max(max, i2) + 1;
    }

    public V get(Object obj) {
        f c2 = c(obj);
        if (c2 != null) {
            return c2.f6439o;
        }
        return null;
    }

    public final void h(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f6433i;
        f<K, V> fVar3 = fVar.f6434j;
        f<K, V> fVar4 = fVar2.f6433i;
        f<K, V> fVar5 = fVar2.f6434j;
        fVar.f6433i = fVar5;
        if (fVar5 != null) {
            fVar5.f6432h = fVar;
        }
        f(fVar, fVar2);
        fVar2.f6434j = fVar;
        fVar.f6432h = fVar2;
        int i2 = 0;
        int max = Math.max(fVar3 != null ? fVar3.f6440p : 0, fVar5 != null ? fVar5.f6440p : 0) + 1;
        fVar.f6440p = max;
        if (fVar4 != null) {
            i2 = fVar4.f6440p;
        }
        fVar2.f6440p = Math.max(max, i2) + 1;
    }

    public Set<K> keySet() {
        v<K, V>.defpackage.d dVar = this.f6424o;
        if (dVar != null) {
            return dVar;
        }
        v<K, V>.defpackage.d dVar2 = new d();
        this.f6424o = dVar2;
        return dVar2;
    }

    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        f a2 = a(k2, true);
        V v2 = a2.f6439o;
        a2.f6439o = v;
        return v2;
    }

    public V remove(Object obj) {
        f c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.f6439o;
        }
        return null;
    }

    public int size() {
        return this.f6420k;
    }
}
