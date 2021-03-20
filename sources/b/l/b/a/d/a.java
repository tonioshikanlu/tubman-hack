package b.l.b.a.d;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public int f4770h;

    /* renamed from: i  reason: collision with root package name */
    public Object[] f4771i;

    /* renamed from: b.l.b.a.d.a$a  reason: collision with other inner class name */
    public final class C0070a implements Map.Entry<K, V> {

        /* renamed from: h  reason: collision with root package name */
        public int f4772h;

        public C0070a(int i2) {
            this.f4772h = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!b.l.a.c.b.a.U(getKey(), entry.getKey()) || !b.l.a.c.b.a.U(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            a aVar = a.this;
            int i2 = this.f4772h;
            Objects.requireNonNull(aVar);
            if (i2 < 0 || i2 >= aVar.f4770h) {
                return null;
            }
            return aVar.f4771i[i2 << 1];
        }

        public V getValue() {
            return a.this.c(this.f4772h);
        }

        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            int i2 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            if (value != null) {
                i2 = value.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            return a.this.f(this.f4772h, v);
        }
    }

    public final class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h  reason: collision with root package name */
        public boolean f4774h;

        /* renamed from: i  reason: collision with root package name */
        public int f4775i;

        public b() {
        }

        public boolean hasNext() {
            return this.f4775i < a.this.f4770h;
        }

        public Object next() {
            int i2 = this.f4775i;
            a aVar = a.this;
            if (i2 != aVar.f4770h) {
                this.f4775i = i2 + 1;
                this.f4774h = false;
                return new C0070a(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            int i2 = this.f4775i - 1;
            if (this.f4774h || i2 < 0) {
                throw new IllegalArgumentException();
            }
            a.this.d(i2 << 1);
            this.f4775i--;
            this.f4774h = true;
        }
    }

    public final class c extends AbstractSet<Map.Entry<K, V>> {
        public c() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        public int size() {
            return a.this.f4770h;
        }
    }

    /* renamed from: a */
    public a<K, V> clone() {
        try {
            a<K, V> aVar = (a) super.clone();
            Object[] objArr = this.f4771i;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f4771i = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final int b(Object obj) {
        int i2 = this.f4770h << 1;
        Object[] objArr = this.f4771i;
        int i3 = 0;
        while (i3 < i2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                    i3 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i3 += 2;
            }
            return i3;
        }
        return -2;
    }

    public final V c(int i2) {
        if (i2 < 0 || i2 >= this.f4770h) {
            return null;
        }
        return g((i2 << 1) + 1);
    }

    public void clear() {
        this.f4770h = 0;
        this.f4771i = null;
    }

    public final boolean containsKey(Object obj) {
        return -2 != b(obj);
    }

    public final boolean containsValue(Object obj) {
        int i2 = this.f4770h << 1;
        Object[] objArr = this.f4771i;
        int i3 = 1;
        while (i3 < i2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 != null) {
                    i3 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i3 += 2;
            }
            return true;
        }
        return false;
    }

    public final V d(int i2) {
        int i3 = this.f4770h << 1;
        if (i2 < 0 || i2 >= i3) {
            return null;
        }
        V g2 = g(i2 + 1);
        Object[] objArr = this.f4771i;
        int i4 = (i3 - i2) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i2 + 2, objArr, i2, i4);
        }
        this.f4770h--;
        int i5 = i3 - 2;
        Object[] objArr2 = this.f4771i;
        objArr2[i5] = null;
        objArr2[i5 + 1] = null;
        return g2;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new c();
    }

    public final V f(int i2, V v) {
        int i3 = this.f4770h;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = (i2 << 1) + 1;
        V g2 = g(i4);
        this.f4771i[i4] = v;
        return g2;
    }

    public final V g(int i2) {
        if (i2 < 0) {
            return null;
        }
        return this.f4771i[i2];
    }

    public final V get(Object obj) {
        return g(b(obj) + 1);
    }

    public final V put(K k2, V v) {
        int b2 = b(k2) >> 1;
        if (b2 == -1) {
            b2 = this.f4770h;
        }
        if (b2 >= 0) {
            int i2 = b2 + 1;
            if (i2 >= 0) {
                Object[] objArr = this.f4771i;
                int i3 = i2 << 1;
                int length = objArr == null ? 0 : objArr.length;
                if (i3 > length) {
                    int i4 = ((length / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.f4771i = null;
                    } else {
                        int i5 = this.f4770h;
                        if (i5 == 0 || i3 != objArr.length) {
                            Object[] objArr2 = new Object[i3];
                            this.f4771i = objArr2;
                            if (i5 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = b2 << 1;
                int i7 = i6 + 1;
                V g2 = g(i7);
                Object[] objArr3 = this.f4771i;
                objArr3[i6] = k2;
                objArr3[i7] = v;
                if (i2 > this.f4770h) {
                    this.f4770h = i2;
                }
                return g2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(Object obj) {
        return d(b(obj));
    }

    public final int size() {
        return this.f4770h;
    }
}
