package b.l.e.e0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final Comparator<Comparable> f5437o = new a();

    /* renamed from: h  reason: collision with root package name */
    public Comparator<? super K> f5438h;

    /* renamed from: i  reason: collision with root package name */
    public e<K, V> f5439i;

    /* renamed from: j  reason: collision with root package name */
    public int f5440j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f5441k = 0;

    /* renamed from: l  reason: collision with root package name */
    public final e<K, V> f5442l = new e<>();

    /* renamed from: m  reason: collision with root package name */
    public s<K, V>.b f5443m;

    /* renamed from: n  reason: collision with root package name */
    public s<K, V>.defpackage.c f5444n;

    public class a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends s<K, V>.defpackage.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public Object next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e b2;
            if (!(obj instanceof Map.Entry) || (b2 = s.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.e(b2, true);
            return true;
        }

        public int size() {
            return s.this.f5440j;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends s<K, V>.defpackage.d<K> {
            public a(c cVar) {
                super();
            }

            public K next() {
                return a().f5456m;
            }
        }

        public c() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return s.this.c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            s sVar = s.this;
            e c = sVar.c(obj);
            if (c != null) {
                sVar.e(c, true);
            }
            return c != null;
        }

        public int size() {
            return s.this.f5440j;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public e<K, V> f5447h;

        /* renamed from: i  reason: collision with root package name */
        public e<K, V> f5448i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f5449j;

        public d() {
            this.f5447h = s.this.f5442l.f5454k;
            this.f5449j = s.this.f5441k;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f5447h;
            s sVar = s.this;
            if (eVar == sVar.f5442l) {
                throw new NoSuchElementException();
            } else if (sVar.f5441k == this.f5449j) {
                this.f5447h = eVar.f5454k;
                this.f5448i = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f5447h != s.this.f5442l;
        }

        public final void remove() {
            e<K, V> eVar = this.f5448i;
            if (eVar != null) {
                s.this.e(eVar, true);
                this.f5448i = null;
                this.f5449j = s.this.f5441k;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        public e<K, V> f5451h;

        /* renamed from: i  reason: collision with root package name */
        public e<K, V> f5452i;

        /* renamed from: j  reason: collision with root package name */
        public e<K, V> f5453j;

        /* renamed from: k  reason: collision with root package name */
        public e<K, V> f5454k;

        /* renamed from: l  reason: collision with root package name */
        public e<K, V> f5455l;

        /* renamed from: m  reason: collision with root package name */
        public final K f5456m;

        /* renamed from: n  reason: collision with root package name */
        public V f5457n;

        /* renamed from: o  reason: collision with root package name */
        public int f5458o;

        public e() {
            this.f5456m = null;
            this.f5455l = this;
            this.f5454k = this;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f5451h = eVar;
            this.f5456m = k2;
            this.f5458o = 1;
            this.f5454k = eVar2;
            this.f5455l = eVar3;
            eVar3.f5454k = this;
            eVar2.f5455l = this;
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
                K r0 = r3.f5456m
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f5457n
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
            throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.s.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f5456m;
        }

        public V getValue() {
            return this.f5457n;
        }

        public int hashCode() {
            K k2 = this.f5456m;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f5457n;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f5457n;
            this.f5457n = v;
            return v2;
        }

        public String toString() {
            return this.f5456m + "=" + this.f5457n;
        }
    }

    static {
        Class<s> cls = s.class;
    }

    public s() {
        Comparator<Comparable> comparator = f5437o;
        this.f5438h = comparator;
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<Comparable> comparator = f5437o;
        Comparator<? super K> comparator2 = this.f5438h;
        e<K, V> eVar2 = this.f5439i;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k2 : null;
            while (true) {
                K k3 = eVar2.f5456m;
                i2 = comparable != null ? comparable.compareTo(k3) : comparator2.compare(k2, k3);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f5452i : eVar2.f5453j;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f5442l;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f5455l);
            if (i2 < 0) {
                eVar2.f5452i = eVar;
            } else {
                eVar2.f5453j = eVar;
            }
            d(eVar2, true);
        } else if (comparator2 != comparator || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f5455l);
            this.f5439i = eVar;
        } else {
            throw new ClassCastException(b.e.a.a.a.f(k2, new StringBuilder(), " is not Comparable"));
        }
        this.f5440j++;
        this.f5441k++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.e.e0.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.l.e.e0.s$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f5457n
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
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.s.b(java.util.Map$Entry):b.l.e.e0.s$e");
    }

    public e<K, V> c(Object obj) {
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
        this.f5439i = null;
        this.f5440j = 0;
        this.f5441k++;
        e<K, V> eVar = this.f5442l;
        eVar.f5455l = eVar;
        eVar.f5454k = eVar;
    }

    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f5452i;
            e<K, V> eVar3 = eVar.f5453j;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f5458o : 0;
            int i4 = eVar3 != null ? eVar3.f5458o : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f5452i;
                e<K, V> eVar5 = eVar3.f5453j;
                int i6 = eVar5 != null ? eVar5.f5458o : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f5458o;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    h(eVar3);
                }
                g(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f5452i;
                e<K, V> eVar7 = eVar2.f5453j;
                int i8 = eVar7 != null ? eVar7.f5458o : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f5458o;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    g(eVar2);
                }
                h(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f5458o = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f5458o = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f5451h;
        }
    }

    public void e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i2;
        e<K, V> eVar3;
        if (z) {
            e<K, V> eVar4 = eVar.f5455l;
            eVar4.f5454k = eVar.f5454k;
            eVar.f5454k.f5455l = eVar4;
        }
        e<K, V> eVar5 = eVar.f5452i;
        e<K, V> eVar6 = eVar.f5453j;
        e<K, V> eVar7 = eVar.f5451h;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f5452i = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f5453j = null;
            } else {
                f(eVar, (e<K, V>) null);
            }
            d(eVar7, false);
            this.f5440j--;
            this.f5441k++;
            return;
        }
        if (eVar5.f5458o > eVar6.f5458o) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f5453j;
            } while (eVar5 != null);
        } else {
            do {
                e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.f5452i;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        e(eVar2, false);
        e<K, V> eVar9 = eVar.f5452i;
        if (eVar9 != null) {
            i2 = eVar9.f5458o;
            eVar2.f5452i = eVar9;
            eVar9.f5451h = eVar2;
            eVar.f5452i = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar10 = eVar.f5453j;
        if (eVar10 != null) {
            i3 = eVar10.f5458o;
            eVar2.f5453j = eVar10;
            eVar10.f5451h = eVar2;
            eVar.f5453j = null;
        }
        eVar2.f5458o = Math.max(i2, i3) + 1;
        f(eVar, eVar2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f5443m;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f5443m = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f5451h;
        eVar.f5451h = null;
        if (eVar2 != null) {
            eVar2.f5451h = eVar3;
        }
        if (eVar3 == null) {
            this.f5439i = eVar2;
        } else if (eVar3.f5452i == eVar) {
            eVar3.f5452i = eVar2;
        } else {
            eVar3.f5453j = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5452i;
        e<K, V> eVar3 = eVar.f5453j;
        e<K, V> eVar4 = eVar3.f5452i;
        e<K, V> eVar5 = eVar3.f5453j;
        eVar.f5453j = eVar4;
        if (eVar4 != null) {
            eVar4.f5451h = eVar;
        }
        f(eVar, eVar3);
        eVar3.f5452i = eVar;
        eVar.f5451h = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f5458o : 0, eVar4 != null ? eVar4.f5458o : 0) + 1;
        eVar.f5458o = max;
        if (eVar5 != null) {
            i2 = eVar5.f5458o;
        }
        eVar3.f5458o = Math.max(max, i2) + 1;
    }

    public V get(Object obj) {
        e c2 = c(obj);
        if (c2 != null) {
            return c2.f5457n;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5452i;
        e<K, V> eVar3 = eVar.f5453j;
        e<K, V> eVar4 = eVar2.f5452i;
        e<K, V> eVar5 = eVar2.f5453j;
        eVar.f5452i = eVar5;
        if (eVar5 != null) {
            eVar5.f5451h = eVar;
        }
        f(eVar, eVar2);
        eVar2.f5453j = eVar;
        eVar.f5451h = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f5458o : 0, eVar5 != null ? eVar5.f5458o : 0) + 1;
        eVar.f5458o = max;
        if (eVar4 != null) {
            i2 = eVar4.f5458o;
        }
        eVar2.f5458o = Math.max(max, i2) + 1;
    }

    public Set<K> keySet() {
        s<K, V>.defpackage.c cVar = this.f5444n;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.defpackage.c cVar2 = new c();
        this.f5444n = cVar2;
        return cVar2;
    }

    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e a2 = a(k2, true);
        V v2 = a2.f5457n;
        a2.f5457n = v;
        return v2;
    }

    public V remove(Object obj) {
        e c2 = c(obj);
        if (c2 != null) {
            e(c2, true);
        }
        if (c2 != null) {
            return c2.f5457n;
        }
        return null;
    }

    public int size() {
        return this.f5440j;
    }
}
