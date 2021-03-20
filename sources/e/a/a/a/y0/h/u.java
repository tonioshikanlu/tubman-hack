package e.a.a.a.y0.h;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f9271m = 0;

    /* renamed from: h  reason: collision with root package name */
    public final int f9272h;

    /* renamed from: i  reason: collision with root package name */
    public List<u<K, V>.b> f9273i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f9274j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public boolean f9275k;

    /* renamed from: l  reason: collision with root package name */
    public volatile u<K, V>.defpackage.d f9276l;

    public static class a {
        public static final Iterator<Object> a = new C0207a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f9277b = new b();

        /* renamed from: e.a.a.a.y0.h.u$a$a  reason: collision with other inner class name */
        public static class C0207a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    public class b implements Comparable<u<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        public final K f9278h;

        /* renamed from: i  reason: collision with root package name */
        public V f9279i;

        public b(K k2, V v) {
            this.f9278h = k2;
            this.f9279i = v;
        }

        public b(u uVar, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            u.this = uVar;
            this.f9278h = (Comparable) entry.getKey();
            this.f9279i = value;
        }

        public int compareTo(Object obj) {
            return this.f9278h.compareTo(((b) obj).f9278h);
        }

        public boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f9278h;
            Object key = entry.getKey();
            if (k2 == null ? key == null : k2.equals(key)) {
                V v = this.f9279i;
                Object value = entry.getValue();
                if (v == null) {
                    z = value == null;
                } else {
                    z = v.equals(value);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f9278h;
        }

        public V getValue() {
            return this.f9279i;
        }

        public int hashCode() {
            K k2 = this.f9278h;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f9279i;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            u uVar = u.this;
            int i2 = u.f9271m;
            uVar.b();
            V v2 = this.f9279i;
            this.f9279i = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f9278h);
            String valueOf2 = String.valueOf(this.f9279i);
            return b.e.a.a.a.r(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        public int f9281h = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9282i;

        /* renamed from: j  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f9283j;

        public c(t tVar) {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f9283j == null) {
                this.f9283j = u.this.f9274j.entrySet().iterator();
            }
            return this.f9283j;
        }

        public boolean hasNext() {
            if (this.f9281h + 1 < u.this.f9273i.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            this.f9282i = true;
            int i2 = this.f9281h + 1;
            this.f9281h = i2;
            return (Map.Entry) (i2 < u.this.f9273i.size() ? u.this.f9273i.get(this.f9281h) : a().next());
        }

        public void remove() {
            if (this.f9282i) {
                this.f9282i = false;
                u uVar = u.this;
                int i2 = u.f9271m;
                uVar.b();
                if (this.f9281h < u.this.f9273i.size()) {
                    u uVar2 = u.this;
                    int i3 = this.f9281h;
                    this.f9281h = i3 - 1;
                    uVar2.h(i3);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d(t tVar) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            u.this.g((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            u.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c((t) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return u.this.size();
        }
    }

    public u(int i2, t tVar) {
        this.f9272h = i2;
    }

    public final int a(K k2) {
        int size = this.f9273i.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f9273i.get(size).f9278h);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f9273i.get(i3).f9278h);
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

    public final void b() {
        if (this.f9275k) {
            throw new UnsupportedOperationException();
        }
    }

    public Map.Entry<K, V> c(int i2) {
        return this.f9273i.get(i2);
    }

    public void clear() {
        b();
        if (!this.f9273i.isEmpty()) {
            this.f9273i.clear();
        }
        if (!this.f9274j.isEmpty()) {
            this.f9274j.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f9274j.containsKey(comparable);
    }

    public int d() {
        return this.f9273i.size();
    }

    public Iterable<Map.Entry<K, V>> e() {
        return this.f9274j.isEmpty() ? a.f9277b : this.f9274j.entrySet();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f9276l == null) {
            this.f9276l = new d((t) null);
        }
        return this.f9276l;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f9274j.isEmpty() && !(this.f9274j instanceof TreeMap)) {
            this.f9274j = new TreeMap();
        }
        return (SortedMap) this.f9274j;
    }

    public V g(K k2, V v) {
        b();
        int a2 = a(k2);
        if (a2 >= 0) {
            b bVar = this.f9273i.get(a2);
            u.this.b();
            V v2 = bVar.f9279i;
            bVar.f9279i = v;
            return v2;
        }
        b();
        if (this.f9273i.isEmpty() && !(this.f9273i instanceof ArrayList)) {
            this.f9273i = new ArrayList(this.f9272h);
        }
        int i2 = -(a2 + 1);
        if (i2 >= this.f9272h) {
            return f().put(k2, v);
        }
        int size = this.f9273i.size();
        int i3 = this.f9272h;
        if (size == i3) {
            b remove = this.f9273i.remove(i3 - 1);
            f().put(remove.f9278h, remove.f9279i);
        }
        this.f9273i.add(i2, new b(k2, v));
        return null;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.f9273i.get(a2).f9279i;
        }
        return this.f9274j.get(comparable);
    }

    public final V h(int i2) {
        b();
        V v = this.f9273i.remove(i2).f9279i;
        if (!this.f9274j.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.f9273i.add(new b(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v;
    }

    public V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f9274j.isEmpty()) {
            return null;
        }
        return this.f9274j.remove(comparable);
    }

    public int size() {
        return this.f9274j.size() + this.f9273i.size();
    }
}
