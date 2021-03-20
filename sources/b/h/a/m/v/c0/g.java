package b.h.a.m.v.c0;

import androidx.annotation.Nullable;
import b.h.a.m.v.c0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g<K extends l, V> {
    public final a<K, V> a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f633b = new HashMap();

    public static class a<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f634b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this((Object) null);
        }

        public a(K k2) {
            this.d = this;
            this.c = this;
            this.a = k2;
        }

        @Nullable
        public V a() {
            List<V> list = this.f634b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f634b.remove(size - 1);
            }
            return null;
        }
    }

    @Nullable
    public V a(K k2) {
        a<K, V> aVar = this.f633b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f633b.put(k2, aVar);
        } else {
            k2.a();
        }
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.d = aVar3;
        a<K, V> aVar4 = aVar3.c;
        aVar.c = aVar4;
        aVar4.d = aVar;
        aVar.d.c = aVar;
        return aVar.a();
    }

    public void b(K k2, V v) {
        a<K, V> aVar = this.f633b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            a<K, V> aVar2 = aVar.d;
            aVar2.c = aVar.c;
            aVar.c.d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.d = aVar3.d;
            aVar.c = aVar3;
            aVar3.d = aVar;
            aVar.d.c = aVar;
            this.f633b.put(k2, aVar);
        } else {
            k2.a();
        }
        if (aVar.f634b == null) {
            aVar.f634b = new ArrayList();
        }
        aVar.f634b.add(v);
    }

    @Nullable
    public V c() {
        a<K, V> aVar = this.a;
        while (true) {
            aVar = aVar.d;
            if (aVar.equals(this.a)) {
                return null;
            }
            V a2 = aVar.a();
            if (a2 != null) {
                return a2;
            }
            a<K, V> aVar2 = aVar.d;
            aVar2.c = aVar.c;
            aVar.c.d = aVar2;
            this.f633b.remove(aVar.a);
            ((l) aVar.a).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.a.c; !aVar.equals(this.a); aVar = aVar.c) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            List<V> list = aVar.f634b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
