package b.l.f.z.d;

import b.l.f.s;
import b.l.f.y.b;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final b.l.f.y.k.a f5874b;

    public a(b bVar) {
        this.a = bVar;
        this.f5874b = new b.l.f.y.k.a(bVar, 10, bVar.f5811h / 2, bVar.f5812i / 2);
    }

    public static s b(s sVar, float f, float f2) {
        float f3 = sVar.a;
        float f4 = sVar.f5775b;
        return new s(f3 < f ? f3 - 1.0f : f3 + 1.0f, f4 < f2 ? f4 - 1.0f : f4 + 1.0f);
    }

    public static s c(s sVar, s sVar2, int i2) {
        float f = sVar2.a;
        float f2 = sVar.a;
        float f3 = (float) (i2 + 1);
        float f4 = sVar2.f5775b;
        float f5 = sVar.f5775b;
        return new s(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    public final boolean a(s sVar) {
        float f = sVar.a;
        if (f < 0.0f) {
            return false;
        }
        b bVar = this.a;
        if (f >= ((float) bVar.f5811h)) {
            return false;
        }
        float f2 = sVar.f5775b;
        return f2 > 0.0f && f2 < ((float) bVar.f5812i);
    }

    public final int d(s sVar, s sVar2) {
        s sVar3 = sVar;
        s sVar4 = sVar2;
        int i2 = (int) sVar3.a;
        int i3 = (int) sVar3.f5775b;
        int i4 = (int) sVar4.a;
        int i5 = (int) sVar4.f5775b;
        int i6 = 0;
        int i7 = 1;
        boolean z = Math.abs(i5 - i3) > Math.abs(i4 - i2);
        if (z) {
            int i8 = i2;
            i2 = i3;
            i3 = i8;
            int i9 = i4;
            i4 = i5;
            i5 = i9;
        }
        int abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i5 - i3);
        int i10 = (-abs) / 2;
        int i11 = i3 < i5 ? 1 : -1;
        if (i2 >= i4) {
            i7 = -1;
        }
        boolean b2 = this.a.b(z ? i3 : i2, z ? i2 : i3);
        while (i2 != i4) {
            boolean b3 = this.a.b(z ? i3 : i2, z ? i2 : i3);
            if (b3 != b2) {
                i6++;
                b2 = b3;
            }
            i10 += abs2;
            if (i10 > 0) {
                if (i3 == i5) {
                    break;
                }
                i3 += i11;
                i10 -= abs;
            }
            i2 += i7;
        }
        return i6;
    }
}
