package b.l.a.c.f.i;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class k7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f3633n = 0;

    /* renamed from: h  reason: collision with root package name */
    public final int f3634h;

    /* renamed from: i  reason: collision with root package name */
    public List<h7> f3635i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f3636j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public boolean f3637k;

    /* renamed from: l  reason: collision with root package name */
    public volatile j7 f3638l;

    /* renamed from: m  reason: collision with root package name */
    public Map<K, V> f3639m = Collections.emptyMap();

    public /* synthetic */ k7(int i2) {
        this.f3634h = i2;
    }

    public void a() {
        if (!this.f3637k) {
            this.f3636j = this.f3636j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3636j);
            this.f3639m = this.f3639m.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3639m);
            this.f3637k = true;
        }
    }

    public final int b() {
        return this.f3635i.size();
    }

    public final Map.Entry<K, V> c(int i2) {
        return this.f3635i.get(i2);
    }

    public final void clear() {
        g();
        if (!this.f3635i.isEmpty()) {
            this.f3635i.clear();
        }
        if (!this.f3636j.isEmpty()) {
            this.f3636j.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f3636j.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k2, V v) {
        g();
        int f = f(k2);
        if (f >= 0) {
            h7 h7Var = this.f3635i.get(f);
            h7Var.f3591j.g();
            V v2 = h7Var.f3590i;
            h7Var.f3590i = v;
            return v2;
        }
        g();
        if (this.f3635i.isEmpty() && !(this.f3635i instanceof ArrayList)) {
            this.f3635i = new ArrayList(this.f3634h);
        }
        int i2 = -(f + 1);
        if (i2 >= this.f3634h) {
            return h().put(k2, v);
        }
        int size = this.f3635i.size();
        int i3 = this.f3634h;
        if (size == i3) {
            h7 remove = this.f3635i.remove(i3 - 1);
            h().put(remove.f3589h, remove.f3590i);
        }
        this.f3635i.add(i2, new h7(this, k2, v));
        return null;
    }

    public final V e(int i2) {
        g();
        V v = this.f3635i.remove(i2).f3590i;
        if (!this.f3636j.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List<h7> list = this.f3635i;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new h7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3638l == null) {
            this.f3638l = new j7(this);
        }
        return this.f3638l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return super.equals(obj);
        }
        k7 k7Var = (k7) obj;
        int size = size();
        if (size != k7Var.size()) {
            return false;
        }
        int b2 = b();
        if (b2 == k7Var.b()) {
            for (int i2 = 0; i2 < b2; i2++) {
                if (!c(i2).equals(k7Var.c(i2))) {
                    return false;
                }
            }
            if (b2 != size) {
                return this.f3636j.equals(k7Var.f3636j);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(k7Var.entrySet());
    }

    public final int f(K k2) {
        int size = this.f3635i.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f3635i.get(size).f3589h);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f3635i.get(i3).f3589h);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public final void g() {
        if (this.f3637k) {
            throw new UnsupportedOperationException();
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return this.f3635i.get(f).f3590i;
        }
        return this.f3636j.get(comparable);
    }

    public final SortedMap<K, V> h() {
        g();
        if (this.f3636j.isEmpty() && !(this.f3636j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3636j = treeMap;
            this.f3639m = treeMap.descendingMap();
        }
        return (SortedMap) this.f3636j;
    }

    public final int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += this.f3635i.get(i3).hashCode();
        }
        return this.f3636j.size() > 0 ? this.f3636j.hashCode() + i2 : i2;
    }

    public final V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return e(f);
        }
        if (this.f3636j.isEmpty()) {
            return null;
        }
        return this.f3636j.remove(comparable);
    }

    public final int size() {
        return this.f3636j.size() + this.f3635i.size();
    }
}
