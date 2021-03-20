package b.l.a.c.f.e;

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

public class z0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f3429n = 0;

    /* renamed from: h  reason: collision with root package name */
    public final int f3430h;

    /* renamed from: i  reason: collision with root package name */
    public List<v0> f3431i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f3432j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public boolean f3433k;

    /* renamed from: l  reason: collision with root package name */
    public volatile y0 f3434l;

    /* renamed from: m  reason: collision with root package name */
    public Map<K, V> f3435m = Collections.emptyMap();

    public /* synthetic */ z0(int i2) {
        this.f3430h = i2;
    }

    public void a() {
        if (!this.f3433k) {
            this.f3432j = this.f3432j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3432j);
            this.f3435m = this.f3435m.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3435m);
            this.f3433k = true;
        }
    }

    public final int b() {
        return this.f3431i.size();
    }

    public final Map.Entry<K, V> c(int i2) {
        return this.f3431i.get(i2);
    }

    public final void clear() {
        g();
        if (!this.f3431i.isEmpty()) {
            this.f3431i.clear();
        }
        if (!this.f3432j.isEmpty()) {
            this.f3432j.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f3432j.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k2, V v) {
        g();
        int f = f(k2);
        if (f >= 0) {
            v0 v0Var = this.f3431i.get(f);
            v0Var.f3349j.g();
            V v2 = v0Var.f3348i;
            v0Var.f3348i = v;
            return v2;
        }
        g();
        if (this.f3431i.isEmpty() && !(this.f3431i instanceof ArrayList)) {
            this.f3431i = new ArrayList(this.f3430h);
        }
        int i2 = -(f + 1);
        if (i2 >= this.f3430h) {
            return h().put(k2, v);
        }
        int size = this.f3431i.size();
        int i3 = this.f3430h;
        if (size == i3) {
            v0 remove = this.f3431i.remove(i3 - 1);
            h().put(remove.f3347h, remove.f3348i);
        }
        this.f3431i.add(i2, new v0(this, k2, v));
        return null;
    }

    public final V e(int i2) {
        g();
        V v = this.f3431i.remove(i2).f3348i;
        if (!this.f3432j.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List<v0> list = this.f3431i;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new v0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3434l == null) {
            this.f3434l = new y0(this);
        }
        return this.f3434l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size != z0Var.size()) {
            return false;
        }
        int b2 = b();
        if (b2 == z0Var.b()) {
            for (int i2 = 0; i2 < b2; i2++) {
                if (!c(i2).equals(z0Var.c(i2))) {
                    return false;
                }
            }
            if (b2 != size) {
                return this.f3432j.equals(z0Var.f3432j);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(z0Var.entrySet());
    }

    public final int f(K k2) {
        int size = this.f3431i.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f3431i.get(size).f3347h);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f3431i.get(i3).f3347h);
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
        if (this.f3433k) {
            throw new UnsupportedOperationException();
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return this.f3431i.get(f).f3348i;
        }
        return this.f3432j.get(comparable);
    }

    public final SortedMap<K, V> h() {
        g();
        if (this.f3432j.isEmpty() && !(this.f3432j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3432j = treeMap;
            this.f3435m = treeMap.descendingMap();
        }
        return (SortedMap) this.f3432j;
    }

    public final int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += this.f3431i.get(i3).hashCode();
        }
        return this.f3432j.size() > 0 ? this.f3432j.hashCode() + i2 : i2;
    }

    public final V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return e(f);
        }
        if (this.f3432j.isEmpty()) {
            return null;
        }
        return this.f3432j.remove(comparable);
    }

    public final int size() {
        return this.f3432j.size() + this.f3431i.size();
    }
}
