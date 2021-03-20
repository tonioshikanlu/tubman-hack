package b.l.f.y.l;

import java.util.ArrayList;
import java.util.List;

public final class d {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f5854b;

    public d(a aVar) {
        this.a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f5854b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public void a(int[] iArr, int i2) {
        if (i2 != 0) {
            int length = iArr.length - i2;
            if (length > 0) {
                if (i2 >= this.f5854b.size()) {
                    List<b> list = this.f5854b;
                    b bVar = list.get(list.size() - 1);
                    for (int size = this.f5854b.size(); size <= i2; size++) {
                        a aVar = this.a;
                        bVar = bVar.g(new b(aVar, new int[]{1, aVar.a[(size - 1) + aVar.f5852g]}));
                        this.f5854b.add(bVar);
                    }
                }
                b bVar2 = this.f5854b.get(i2);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                b h2 = new b(this.a, iArr2).h(i2, 1);
                if (!h2.a.equals(bVar2.a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                } else if (!bVar2.e()) {
                    b bVar3 = h2.a.c;
                    int b2 = h2.a.b(bVar2.c(bVar2.d()));
                    b bVar4 = h2;
                    while (bVar4.d() >= bVar2.d() && !bVar4.e()) {
                        int d = bVar4.d() - bVar2.d();
                        int c = h2.a.c(bVar4.c(bVar4.d()), b2);
                        b h3 = bVar2.h(d, c);
                        bVar3 = bVar3.a(h2.a.a(d, c));
                        bVar4 = bVar4.a(h3);
                    }
                    int[] iArr3 = new b[]{bVar3, bVar4}[1].f5853b;
                    int length2 = i2 - iArr3.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        iArr[length + i3] = 0;
                    }
                    System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
                } else {
                    throw new IllegalArgumentException("Divide by 0");
                }
            } else {
                throw new IllegalArgumentException("No data bytes provided");
            }
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }
}
