package b.l.f.d0.e;

public final class h extends g {
    public final boolean c;

    public h(c cVar, boolean z) {
        super(cVar);
        this.c = z;
    }

    public a c() {
        d[] dVarArr = this.f5676b;
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.b();
                int i2 = dVar.d % 30;
                int i3 = dVar.f5666e;
                if (!this.c) {
                    i3 += 2;
                }
                int i4 = i3 % 3;
                if (i4 == 0) {
                    bVar2.b((i2 * 3) + 1);
                } else if (i4 == 1) {
                    bVar4.b(i2 / 3);
                    bVar3.b(i2 % 3);
                } else if (i4 == 2) {
                    bVar.b(i2 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        d(dVarArr, aVar);
        return aVar;
    }

    public final void d(d[] dVarArr, a aVar) {
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            d dVar = dVarArr[i2];
            if (dVarArr[i2] != null) {
                int i3 = dVar.d % 30;
                int i4 = dVar.f5666e;
                if (i4 > aVar.f5659e) {
                    dVarArr[i2] = null;
                } else {
                    if (!this.c) {
                        i4 += 2;
                    }
                    int i5 = i4 % 3;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 == 2 && i3 + 1 != aVar.a) {
                                dVarArr[i2] = null;
                            }
                        } else if (i3 / 3 != aVar.f5658b || i3 % 3 != aVar.d) {
                            dVarArr[i2] = null;
                        }
                    } else if ((i3 * 3) + 1 != aVar.c) {
                        dVarArr[i2] = null;
                    }
                }
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.c + 10 + super.toString();
    }
}
