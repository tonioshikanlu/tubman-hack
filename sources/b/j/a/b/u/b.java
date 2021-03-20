package b.j.a.b.u;

import b.j.a.b.d;
import b.j.a.b.w.g;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class b {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<C0048b> f1528b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1529e;
    public String[] f;

    /* renamed from: g  reason: collision with root package name */
    public a[] f1530g;

    /* renamed from: h  reason: collision with root package name */
    public int f1531h;

    /* renamed from: i  reason: collision with root package name */
    public int f1532i;

    /* renamed from: j  reason: collision with root package name */
    public int f1533j;

    /* renamed from: k  reason: collision with root package name */
    public int f1534k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1535l;

    /* renamed from: m  reason: collision with root package name */
    public BitSet f1536m;

    public static final class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final a f1537b;
        public final int c;

        public a(String str, a aVar) {
            this.a = str;
            this.f1537b = aVar;
            this.c = aVar != null ? 1 + aVar.c : 1;
        }

        public String a(char[] cArr, int i2, int i3) {
            if (this.a.length() != i3) {
                return null;
            }
            int i4 = 0;
            while (this.a.charAt(i4) == cArr[i2 + i4]) {
                i4++;
                if (i4 >= i3) {
                    return this.a;
                }
            }
            return null;
        }
    }

    /* renamed from: b.j.a.b.u.b$b  reason: collision with other inner class name */
    public static final class C0048b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1538b;
        public final String[] c;
        public final a[] d;

        public C0048b(int i2, int i3, String[] strArr, a[] aVarArr) {
            this.a = i2;
            this.f1538b = i3;
            this.c = strArr;
            this.d = aVarArr;
        }

        public C0048b(b bVar) {
            this.a = bVar.f1531h;
            this.f1538b = bVar.f1534k;
            this.c = bVar.f;
            this.d = bVar.f1530g;
        }
    }

    public b(int i2) {
        this.a = null;
        this.c = i2;
        this.f1529e = true;
        this.d = -1;
        this.f1535l = false;
        this.f1534k = 0;
        this.f1528b = new AtomicReference<>(new C0048b(0, 0, new String[64], new a[32]));
    }

    public b(b bVar, int i2, int i3, C0048b bVar2) {
        this.a = bVar;
        this.c = i3;
        this.f1528b = null;
        this.d = i2;
        this.f1529e = d.a.CANONICALIZE_FIELD_NAMES.d(i2);
        String[] strArr = bVar2.c;
        this.f = strArr;
        this.f1530g = bVar2.d;
        this.f1531h = bVar2.a;
        this.f1534k = bVar2.f1538b;
        int length = strArr.length;
        this.f1532i = length - (length >> 2);
        this.f1533j = length - 1;
        this.f1535l = true;
    }

    public int a(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return (i4 + (i4 >>> 3)) & this.f1533j;
    }

    public int b(String str) {
        int length = str.length();
        int i2 = this.c;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 33) + str.charAt(i3);
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public String c(char[] cArr, int i2, int i3, int i4) {
        BitSet bitSet;
        String str;
        if (i3 < 1) {
            return "";
        }
        if (!this.f1529e) {
            return new String(cArr, i2, i3);
        }
        int a2 = a(i4);
        String str2 = this.f[a2];
        if (str2 != null) {
            if (str2.length() == i3) {
                int i5 = 0;
                while (str2.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str2;
                    }
                }
            }
            a aVar = this.f1530g[a2 >> 1];
            if (aVar != null) {
                String a3 = aVar.a(cArr, i2, i3);
                if (a3 != null) {
                    return a3;
                }
                a aVar2 = aVar.f1537b;
                while (true) {
                    if (aVar2 == null) {
                        str = null;
                        break;
                    }
                    str = aVar2.a(cArr, i2, i3);
                    if (str != null) {
                        break;
                    }
                    aVar2 = aVar2.f1537b;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this.f1535l) {
            String[] strArr = this.f;
            this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
            a[] aVarArr = this.f1530g;
            this.f1530g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            this.f1535l = false;
        } else if (this.f1531h >= this.f1532i) {
            int i6 = r1 + r1;
            if (i6 > 65536) {
                this.f1531h = 0;
                this.f1529e = false;
                this.f = new String[64];
                this.f1530g = new a[32];
                this.f1533j = 63;
                this.f1535l = false;
            } else {
                a[] aVarArr2 = this.f1530g;
                this.f = new String[i6];
                this.f1530g = new a[(i6 >> 1)];
                this.f1533j = i6 - 1;
                this.f1532i = i6 - (i6 >> 2);
                int i7 = 0;
                int i8 = 0;
                for (String str3 : this.f) {
                    if (str3 != null) {
                        i7++;
                        int a4 = a(b(str3));
                        String[] strArr2 = this.f;
                        if (strArr2[a4] == null) {
                            strArr2[a4] = str3;
                        } else {
                            int i9 = a4 >> 1;
                            a[] aVarArr3 = this.f1530g;
                            a aVar3 = new a(str3, aVarArr3[i9]);
                            aVarArr3[i9] = aVar3;
                            i8 = Math.max(i8, aVar3.c);
                        }
                    }
                }
                int i10 = r1 >> 1;
                for (int i11 = 0; i11 < i10; i11++) {
                    for (a aVar4 = aVarArr2[i11]; aVar4 != null; aVar4 = aVar4.f1537b) {
                        i7++;
                        String str4 = aVar4.a;
                        int a5 = a(b(str4));
                        String[] strArr3 = this.f;
                        if (strArr3[a5] == null) {
                            strArr3[a5] = str4;
                        } else {
                            int i12 = a5 >> 1;
                            a[] aVarArr4 = this.f1530g;
                            a aVar5 = new a(str4, aVarArr4[i12]);
                            aVarArr4[i12] = aVar5;
                            i8 = Math.max(i8, aVar5.c);
                        }
                    }
                }
                this.f1534k = i8;
                this.f1536m = null;
                if (i7 != this.f1531h) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this.f1531h), Integer.valueOf(i7)}));
                }
            }
            int i13 = this.c;
            int i14 = i3 + i2;
            for (int i15 = i2; i15 < i14; i15++) {
                i13 = (i13 * 33) + cArr[i15];
            }
            if (i13 == 0) {
                i13 = 1;
            }
            a2 = a(i13);
        }
        String str5 = new String(cArr, i2, i3);
        if (d.a.INTERN_FIELD_NAMES.d(this.d)) {
            str5 = g.f1569i.a(str5);
        }
        this.f1531h++;
        String[] strArr4 = this.f;
        if (strArr4[a2] == null) {
            strArr4[a2] = str5;
        } else {
            int i16 = a2 >> 1;
            a[] aVarArr5 = this.f1530g;
            a aVar6 = new a(str5, aVarArr5[i16]);
            int i17 = aVar6.c;
            if (i17 > 100) {
                BitSet bitSet2 = this.f1536m;
                if (bitSet2 == null) {
                    bitSet = new BitSet();
                    this.f1536m = bitSet;
                } else if (!bitSet2.get(i16)) {
                    bitSet = this.f1536m;
                } else if (!d.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.d(this.d)) {
                    this.f1529e = false;
                    this.f[a2] = aVar6.a;
                    this.f1530g[i16] = null;
                    this.f1531h -= aVar6.c;
                    this.f1534k = -1;
                } else {
                    StringBuilder y = b.e.a.a.a.y("Longest collision chain in symbol table (of size ");
                    y.append(this.f1531h);
                    y.append(") now exceeds maximum, ");
                    y.append(100);
                    y.append(" -- suspect a DoS attack based on hash collisions");
                    throw new IllegalStateException(y.toString());
                }
                bitSet.set(i16);
                this.f[a2] = aVar6.a;
                this.f1530g[i16] = null;
                this.f1531h -= aVar6.c;
                this.f1534k = -1;
            } else {
                aVarArr5[i16] = aVar6;
                this.f1534k = Math.max(i17, this.f1534k);
            }
        }
        return str5;
    }

    public b d(int i2) {
        return new b(this, i2, this.c, this.f1528b.get());
    }
}
