package b.l.f.y.k;

import b.l.f.m;
import b.l.f.s;
import b.l.f.x.a.g;
import b.l.f.y.b;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5839b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5840e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5841g;

    public a(b bVar, int i2, int i3, int i4) {
        this.a = bVar;
        int i5 = bVar.f5812i;
        this.f5839b = i5;
        int i6 = bVar.f5811h;
        this.c = i6;
        int i7 = i2 / 2;
        int i8 = i3 - i7;
        this.d = i8;
        int i9 = i3 + i7;
        this.f5840e = i9;
        int i10 = i4 - i7;
        this.f5841g = i10;
        int i11 = i4 + i7;
        this.f = i11;
        if (i10 < 0 || i8 < 0 || i11 >= i5 || i9 >= i6) {
            throw m.f5759j;
        }
    }

    public final boolean a(int i2, int i3, int i4, boolean z) {
        if (z) {
            while (i2 <= i3) {
                if (this.a.b(i2, i4)) {
                    return true;
                }
                i2++;
            }
            return false;
        }
        while (i2 <= i3) {
            if (this.a.b(i4, i2)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public s[] b() {
        boolean z;
        int i2 = this.d;
        int i3 = this.f5840e;
        int i4 = this.f5841g;
        int i5 = this.f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            if (!z6) {
                z = false;
                break;
            }
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i3 < this.c) {
                    z8 = a(i4, i5, i3, false);
                    if (z8) {
                        i3++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i3++;
                    }
                }
            }
            if (i3 < this.c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z3) && i5 < this.f5839b) {
                        z9 = a(i2, i3, i5, true);
                        if (z9) {
                            i5++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i5++;
                        }
                    }
                }
                if (i5 < this.f5839b) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z4) && i2 >= 0) {
                            z10 = a(i4, i5, i2, false);
                            if (z10) {
                                i2--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i2--;
                            }
                        }
                    }
                    if (i2 >= 0) {
                        z6 = z7;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z5) && i4 >= 0) {
                                z11 = a(i2, i3, i4, true);
                                if (z11) {
                                    i4--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i4--;
                                }
                            }
                        }
                        if (i4 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i6 = i3 - i2;
            s sVar = null;
            int i7 = 1;
            s sVar2 = null;
            while (sVar2 == null && i7 < i6) {
                sVar2 = c((float) i2, (float) (i5 - i7), (float) (i2 + i7), (float) i5);
                i7++;
            }
            if (sVar2 != null) {
                int i8 = 1;
                s sVar3 = null;
                while (sVar3 == null && i8 < i6) {
                    sVar3 = c((float) i2, (float) (i4 + i8), (float) (i2 + i8), (float) i4);
                    i8++;
                }
                if (sVar3 != null) {
                    int i9 = 1;
                    s sVar4 = null;
                    while (sVar4 == null && i9 < i6) {
                        sVar4 = c((float) i3, (float) (i4 + i9), (float) (i3 - i9), (float) i4);
                        i9++;
                    }
                    if (sVar4 != null) {
                        int i10 = 1;
                        while (sVar == null && i10 < i6) {
                            sVar = c((float) i3, (float) (i5 - i10), (float) (i3 - i10), (float) i5);
                            i10++;
                        }
                        if (sVar != null) {
                            float f2 = sVar.a;
                            float f3 = sVar.f5775b;
                            float f4 = sVar2.a;
                            float f5 = sVar2.f5775b;
                            float f6 = sVar4.a;
                            float f7 = sVar4.f5775b;
                            float f8 = sVar3.a;
                            float f9 = sVar3.f5775b;
                            if (f2 < ((float) this.c) / 2.0f) {
                                return new s[]{new s(f8 - 1.0f, f9 + 1.0f), new s(f4 + 1.0f, f5 + 1.0f), new s(f6 - 1.0f, f7 - 1.0f), new s(f2 + 1.0f, f3 - 1.0f)};
                            }
                            return new s[]{new s(f8 + 1.0f, f9 + 1.0f), new s(f4 + 1.0f, f5 - 1.0f), new s(f6 - 1.0f, f7 + 1.0f), new s(f2 - 1.0f, f3 - 1.0f)};
                        }
                        throw m.f5759j;
                    }
                    throw m.f5759j;
                }
                throw m.f5759j;
            }
            throw m.f5759j;
        }
        throw m.f5759j;
    }

    public final s c(float f2, float f3, float f4, float f5) {
        int g0 = g.g0(g.l(f2, f3, f4, f5));
        float f6 = (float) g0;
        float f7 = (f4 - f2) / f6;
        float f8 = (f5 - f3) / f6;
        for (int i2 = 0; i2 < g0; i2++) {
            float f9 = (float) i2;
            int g02 = g.g0((f9 * f7) + f2);
            int g03 = g.g0((f9 * f8) + f3);
            if (this.a.b(g02, g03)) {
                return new s((float) g02, (float) g03);
            }
        }
        return null;
    }
}
