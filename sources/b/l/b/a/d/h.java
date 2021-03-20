package b.l.b.a.d;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class h extends AbstractMap<String, Object> {

    /* renamed from: h  reason: collision with root package name */
    public final Object f4793h;

    /* renamed from: i  reason: collision with root package name */
    public final e f4794i;

    public final class a implements Map.Entry<String, Object> {

        /* renamed from: h  reason: collision with root package name */
        public Object f4795h;

        /* renamed from: i  reason: collision with root package name */
        public final j f4796i;

        public a(j jVar, Object obj) {
            this.f4796i = jVar;
            Objects.requireNonNull(obj);
            this.f4795h = obj;
        }

        /* renamed from: a */
        public String getKey() {
            String str = this.f4796i.d;
            return h.this.f4794i.a ? str.toLowerCase(Locale.US) : str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !this.f4795h.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f4795h;
        }

        public int hashCode() {
            return getKey().hashCode() ^ this.f4795h.hashCode();
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f4795h;
            Objects.requireNonNull(obj);
            this.f4795h = obj;
            this.f4796i.f(h.this.f4793h, obj);
            return obj2;
        }
    }

    public final class b implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: h  reason: collision with root package name */
        public int f4798h = -1;

        /* renamed from: i  reason: collision with root package name */
        public j f4799i;

        /* renamed from: j  reason: collision with root package name */
        public Object f4800j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4801k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4802l;

        /* renamed from: m  reason: collision with root package name */
        public j f4803m;

        public b() {
        }

        public boolean hasNext() {
            if (!this.f4802l) {
                this.f4802l = true;
                Object obj = null;
                while (true) {
                    this.f4800j = obj;
                    if (this.f4800j != null) {
                        break;
                    }
                    int i2 = this.f4798h + 1;
                    this.f4798h = i2;
                    if (i2 >= h.this.f4794i.c.size()) {
                        break;
                    }
                    e eVar = h.this.f4794i;
                    j a = eVar.a(eVar.c.get(this.f4798h));
                    this.f4799i = a;
                    obj = a.b(h.this.f4793h);
                }
            }
            return this.f4800j != null;
        }

        public Object next() {
            if (hasNext()) {
                j jVar = this.f4799i;
                this.f4803m = jVar;
                Object obj = this.f4800j;
                this.f4802l = false;
                this.f4801k = false;
                this.f4799i = null;
                this.f4800j = null;
                return new a(jVar, obj);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b.l.a.c.b.a.H(this.f4803m != null && !this.f4801k);
            this.f4801k = true;
            this.f4803m.f(h.this.f4793h, (Object) null);
        }
    }

    public final class c extends AbstractSet<Map.Entry<String, Object>> {
        public c() {
        }

        public void clear() {
            for (String a : h.this.f4794i.c) {
                h.this.f4794i.a(a).f(h.this.f4793h, (Object) null);
            }
        }

        public boolean isEmpty() {
            for (String a : h.this.f4794i.c) {
                if (h.this.f4794i.a(a).b(h.this.f4793h) != null) {
                    return false;
                }
            }
            return true;
        }

        public Iterator iterator() {
            return new b();
        }

        public int size() {
            int i2 = 0;
            for (String a : h.this.f4794i.c) {
                if (h.this.f4794i.a(a).b(h.this.f4793h) != null) {
                    i2++;
                }
            }
            return i2;
        }
    }

    public h(Object obj, boolean z) {
        this.f4793h = obj;
        this.f4794i = e.c(obj.getClass(), z);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Set entrySet() {
        return new c();
    }

    public Object get(Object obj) {
        j a2;
        if ((obj instanceof String) && (a2 = this.f4794i.a((String) obj)) != null) {
            return a2.b(this.f4793h);
        }
        return null;
    }

    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        j a2 = this.f4794i.a(str);
        b.l.a.c.b.a.C(a2, "no field of key " + str);
        Object b2 = a2.b(this.f4793h);
        Object obj3 = this.f4793h;
        Objects.requireNonNull(obj2);
        a2.f(obj3, obj2);
        return b2;
    }
}
