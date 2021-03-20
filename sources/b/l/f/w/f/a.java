package b.l.f.w.f;

public final class a extends g {
    public final short c;
    public final short d;

    public a(g gVar, int i2, int i3) {
        super(gVar);
        this.c = (short) i2;
        this.d = (short) i3;
    }

    public void a(b.l.f.y.a aVar, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            short s = this.d;
            if (i3 < s) {
                if (i3 == 0 || (i3 == 31 && s <= 62)) {
                    int i4 = 5;
                    aVar.c(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        i2 = s2 - 31;
                        i4 = 16;
                    } else if (i3 == 0) {
                        aVar.c(Math.min(s2, 31), 5);
                    } else {
                        i2 = s2 - 31;
                    }
                    aVar.c(i2, i4);
                }
                aVar.c(bArr[this.c + i3], 8);
                i3++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
