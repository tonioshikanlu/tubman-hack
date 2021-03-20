package e.a.a.a.z0;

import b.e.a.a.a;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class b<K, V> {
    public static final b<Object, Object> c = new b<>(d.f9843b, 0);
    public final d<a<e<K, V>>> a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9840b;

    static {
        d<Object> dVar = d.f9843b;
    }

    public b(d<a<e<K, V>>> dVar, int i2) {
        this.a = dVar;
        this.f9840b = i2;
    }

    public b<K, V> a(K k2, V v) {
        a<Object> aVar = (a) this.a.a.a((long) k2.hashCode());
        if (aVar == null) {
            aVar = a.f9835k;
        }
        int i2 = aVar.f9838j;
        int i3 = 0;
        a aVar2 = aVar;
        while (true) {
            if (aVar2 == null || aVar2.f9838j <= 0) {
                i3 = -1;
            } else if (((e) aVar2.f9836h).f9844h.equals(k2)) {
                break;
            } else {
                aVar2 = aVar2.f9837i;
                i3++;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            if (i3 < 0 || i3 > aVar.f9838j) {
                throw new IndexOutOfBoundsException();
            }
            try {
                aVar = aVar.d(aVar.e(i3).f9836h);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(a.g("Index: ", i3));
            }
        }
        e eVar = new e(k2, v);
        Objects.requireNonNull(aVar);
        a aVar3 = new a(eVar, aVar);
        d<a<e<K, V>>> dVar = this.a;
        c<V> b2 = dVar.a.b((long) k2.hashCode(), aVar3);
        if (b2 != dVar.a) {
            dVar = new d<>(b2);
        }
        return new b<>(dVar, (this.f9840b - i2) + aVar3.f9838j);
    }
}
