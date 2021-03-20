package b.l.b.a.d;

import b.l.b.a.d.h;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class k extends AbstractMap<String, Object> implements Cloneable {
    public final e classInfo;
    public Map<String, Object> unknownFields;

    public final class a implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: h  reason: collision with root package name */
        public boolean f4813h;

        /* renamed from: i  reason: collision with root package name */
        public final Iterator<Map.Entry<String, Object>> f4814i;

        /* renamed from: j  reason: collision with root package name */
        public final Iterator<Map.Entry<String, Object>> f4815j;

        public a(k kVar, h.c cVar) {
            this.f4814i = new h.b();
            this.f4815j = kVar.unknownFields.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f4814i.hasNext() || this.f4815j.hasNext();
        }

        public Object next() {
            Iterator<Map.Entry<String, Object>> it;
            if (!this.f4813h) {
                if (this.f4814i.hasNext()) {
                    it = this.f4814i;
                    return it.next();
                }
                this.f4813h = true;
            }
            it = this.f4815j;
            return it.next();
        }

        public void remove() {
            if (this.f4813h) {
                this.f4815j.remove();
            }
            this.f4814i.remove();
        }
    }

    public final class b extends AbstractSet<Map.Entry<String, Object>> {

        /* renamed from: h  reason: collision with root package name */
        public final h.c f4816h;

        public b() {
            this.f4816h = new h.c();
        }

        public void clear() {
            k.this.unknownFields.clear();
            this.f4816h.clear();
        }

        public Iterator<Map.Entry<String, Object>> iterator() {
            return new a(k.this, this.f4816h);
        }

        public int size() {
            return this.f4816h.size() + k.this.unknownFields.size();
        }
    }

    public enum c {
        IGNORE_CASE
    }

    public k() {
        this(EnumSet.noneOf(c.class));
    }

    public k(EnumSet<c> enumSet) {
        this.unknownFields = new a();
        this.classInfo = e.c(getClass(), enumSet.contains(c.IGNORE_CASE));
    }

    public k clone() {
        try {
            k kVar = (k) super.clone();
            g.b(this, kVar);
            kVar.unknownFields = (Map) g.a(this.unknownFields);
            return kVar;
        } catch (CloneNotSupportedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return super.equals(kVar) && Objects.equals(this.classInfo, kVar.classInfo);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        j a2 = this.classInfo.a(str);
        if (a2 != null) {
            return a2.b(this);
        }
        if (this.classInfo.a) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.get(str);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.classInfo});
    }

    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        j a2 = this.classInfo.a(str);
        if (a2 != null) {
            Object b2 = a2.b(this);
            a2.f(this, obj2);
            return b2;
        }
        if (this.classInfo.a) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.put(str, obj2);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            set((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.classInfo.a(str) == null) {
            if (this.classInfo.a) {
                str = str.toLowerCase(Locale.US);
            }
            return this.unknownFields.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public k set(String str, Object obj) {
        j a2 = this.classInfo.a(str);
        if (a2 != null) {
            a2.f(this, obj);
        } else {
            if (this.classInfo.a) {
                str = str.toLowerCase(Locale.US);
            }
            this.unknownFields.put(str, obj);
        }
        return this;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("GenericData{classInfo=");
        y.append(this.classInfo.c);
        y.append(", ");
        return b.e.a.a.a.q(y, super.toString(), "}");
    }
}
