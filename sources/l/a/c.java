package l.a;

import java.util.Arrays;

public final class c<K, V> {
    public final d<K, V> a;

    public static final class a<K, V> implements d<K, V> {
        public final K[] a;

        /* renamed from: b  reason: collision with root package name */
        public final V[] f8106b;

        public a(K k2, V v, K k3, V v2) {
            K[] kArr = {k2, k3};
            this.a = kArr;
            this.f8106b = new Object[]{v, v2};
        }

        public a(K[] kArr, V[] vArr) {
            this.a = kArr;
            this.f8106b = vArr;
        }

        public V a(K k2, int i2, int i3) {
            int i4 = 0;
            while (true) {
                K[] kArr = this.a;
                if (i4 >= kArr.length) {
                    return null;
                }
                if (kArr[i4] == k2) {
                    return this.f8106b[i4];
                }
                i4++;
            }
        }

        public d<K, V> b(K k2, V v, int i2, int i3) {
            K[] kArr;
            int i4 = 0;
            int hashCode = this.a[0].hashCode();
            if (hashCode != i2) {
                return b.c(new C0160c(k2, v), i2, this, hashCode, i3);
            }
            while (true) {
                kArr = this.a;
                if (i4 >= kArr.length) {
                    i4 = -1;
                    break;
                } else if (kArr[i4] == k2) {
                    break;
                } else {
                    i4++;
                }
            }
            int length = kArr.length;
            if (i4 != -1) {
                Object[] copyOf = Arrays.copyOf(kArr, length);
                Object[] copyOf2 = Arrays.copyOf(this.f8106b, this.a.length);
                copyOf[i4] = k2;
                copyOf2[i4] = v;
                return new a(copyOf, copyOf2);
            }
            Object[] copyOf3 = Arrays.copyOf(kArr, length + 1);
            Object[] copyOf4 = Arrays.copyOf(this.f8106b, this.a.length + 1);
            K[] kArr2 = this.a;
            copyOf3[kArr2.length] = k2;
            copyOf4[kArr2.length] = v;
            return new a(copyOf3, copyOf4);
        }

        public int size() {
            return this.f8106b.length;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("CollisionLeaf(");
            for (int i2 = 0; i2 < this.f8106b.length; i2++) {
                y.append("(key=");
                y.append(this.a[i2]);
                y.append(" value=");
                y.append(this.f8106b[i2]);
                y.append(") ");
            }
            y.append(")");
            return y.toString();
        }
    }

    public static final class b<K, V> implements d<K, V> {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final d<K, V>[] f8107b;
        public final int c;

        public b(int i2, d<K, V>[] dVarArr, int i3) {
            this.a = i2;
            this.f8107b = dVarArr;
            this.c = i3;
        }

        public static <K, V> d<K, V> c(d<K, V> dVar, int i2, d<K, V> dVar2, int i3, int i4) {
            int d = d(i2, i4);
            int d2 = d(i3, i4);
            if (d == d2) {
                d<K, V> c2 = c(dVar, i2, dVar2, i3, i4 + 5);
                return new b(d, new d[]{c2}, c2.size());
            }
            if (((i2 >>> i4) & 31) > ((i3 >>> i4) & 31)) {
                d<K, V> dVar3 = dVar2;
                dVar2 = dVar;
                dVar = dVar3;
            }
            return new b(d | d2, new d[]{dVar, dVar2}, dVar2.size() + dVar.size());
        }

        public static int d(int i2, int i3) {
            return 1 << ((i2 >>> i3) & 31);
        }

        public V a(K k2, int i2, int i3) {
            int d = d(i2, i3);
            int i4 = this.a;
            if ((i4 & d) == 0) {
                return null;
            }
            return this.f8107b[Integer.bitCount((d - 1) & i4)].a(k2, i2, i3 + 5);
        }

        public d<K, V> b(K k2, V v, int i2, int i3) {
            int d = d(i2, i3);
            int bitCount = Integer.bitCount(this.a & (d - 1));
            int i4 = this.a;
            if ((i4 & d) == 0) {
                int i5 = i4 | d;
                d<K, V>[] dVarArr = this.f8107b;
                d[] dVarArr2 = new d[(dVarArr.length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, bitCount);
                dVarArr2[bitCount] = new C0160c(k2, v);
                d<K, V>[] dVarArr3 = this.f8107b;
                System.arraycopy(dVarArr3, bitCount, dVarArr2, bitCount + 1, dVarArr3.length - bitCount);
                return new b(i5, dVarArr2, this.c + 1);
            }
            d<K, V>[] dVarArr4 = this.f8107b;
            d[] dVarArr5 = (d[]) Arrays.copyOf(dVarArr4, dVarArr4.length);
            dVarArr5[bitCount] = this.f8107b[bitCount].b(k2, v, i2, i3 + 5);
            int i6 = this.c;
            return new b(this.a, dVarArr5, (dVarArr5[bitCount].size() + i6) - this.f8107b[bitCount].size());
        }

        public int size() {
            return this.c;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("CompressedIndex(");
            y.append(String.format("bitmap=%s ", new Object[]{Integer.toBinaryString(this.a)}));
            for (d<K, V> append : this.f8107b) {
                y.append(append);
                y.append(" ");
            }
            y.append(")");
            return y.toString();
        }
    }

    /* renamed from: l.a.c$c  reason: collision with other inner class name */
    public static final class C0160c<K, V> implements d<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public final V f8108b;

        public C0160c(K k2, V v) {
            this.a = k2;
            this.f8108b = v;
        }

        public V a(K k2, int i2, int i3) {
            if (this.a == k2) {
                return this.f8108b;
            }
            return null;
        }

        public d<K, V> b(K k2, V v, int i2, int i3) {
            int hashCode = this.a.hashCode();
            if (hashCode != i2) {
                return b.c(new C0160c(k2, v), i2, this, hashCode, i3);
            }
            K k3 = this.a;
            return k3 == k2 ? new C0160c(k2, v) : new a(k3, this.f8108b, k2, v);
        }

        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", new Object[]{this.a, this.f8108b});
        }
    }

    public interface d<K, V> {
        V a(K k2, int i2, int i3);

        d<K, V> b(K k2, V v, int i2, int i3);

        int size();
    }

    public c() {
        this.a = null;
    }

    public c(d<K, V> dVar) {
        this.a = dVar;
    }
}
