package b.l.f.y;

public final class i {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5833b;
    public final float c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5834e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5835g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5836h;

    /* renamed from: i  reason: collision with root package name */
    public final float f5837i;

    public i(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.f5833b = f5;
        this.c = f8;
        this.d = f3;
        this.f5834e = f6;
        this.f = f9;
        this.f5835g = f4;
        this.f5836h = f7;
        this.f5837i = f10;
    }

    public static i a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        i b2 = b(f2, f3, f4, f5, f6, f7, f8, f9);
        float f18 = b2.f5834e;
        float f19 = b2.f5837i;
        float f20 = b2.f;
        float f21 = b2.f5836h;
        float f22 = (f18 * f19) - (f20 * f21);
        float f23 = b2.f5835g;
        float f24 = b2.d;
        float f25 = (f20 * f23) - (f24 * f19);
        float f26 = (f24 * f21) - (f18 * f23);
        float f27 = b2.c;
        float f28 = b2.f5833b;
        float f29 = (f27 * f21) - (f28 * f19);
        float f30 = b2.a;
        float f31 = (f19 * f30) - (f27 * f23);
        float f32 = (f23 * f28) - (f21 * f30);
        float f33 = (f28 * f20) - (f27 * f18);
        float f34 = (f27 * f24) - (f20 * f30);
        float f35 = (f30 * f18) - (f28 * f24);
        i b3 = b(f10, f11, f12, f13, f14, f15, f16, f17);
        float f36 = b3.a;
        float f37 = b3.d;
        float f38 = b3.f5835g;
        float f39 = (f37 * f29) + (f36 * f22) + (f38 * f33);
        float f40 = (f38 * f34) + (f37 * f31) + (f36 * f25);
        float f41 = f38 * f35;
        float f42 = f41 + (f37 * f32) + (f36 * f26);
        float f43 = b3.f5833b;
        float f44 = f42;
        float f45 = b3.f5834e;
        float f46 = b3.f5836h;
        float f47 = (f46 * f33) + (f45 * f29) + (f43 * f22);
        float f48 = (f45 * f31) + (f43 * f25);
        float f49 = (f45 * f32) + (f43 * f26) + (f46 * f35);
        float f50 = b3.c;
        float f51 = b3.f;
        float f52 = f29 * f51;
        float f53 = b3.f5837i;
        return new i(f39, f40, f44, f47, (f46 * f34) + f48, f49, (f33 * f53) + f52 + (f22 * f50), (f31 * f51) + (f25 * f50) + (f34 * f53), (f53 * f35) + (f51 * f32) + (f50 * f26));
    }

    public static i b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = ((f2 - f4) + f6) - f8;
        float f11 = ((f3 - f5) + f7) - f9;
        if (f10 == 0.0f && f11 == 0.0f) {
            return new i(f4 - f2, f6 - f4, f2, f5 - f3, f7 - f5, f3, 0.0f, 0.0f, 1.0f);
        }
        float f12 = f4 - f6;
        float f13 = f8 - f6;
        float f14 = f5 - f7;
        float f15 = f9 - f7;
        float f16 = (f12 * f15) - (f13 * f14);
        float f17 = ((f15 * f10) - (f13 * f11)) / f16;
        float f18 = ((f12 * f11) - (f10 * f14)) / f16;
        return new i((f17 * f4) + (f4 - f2), (f18 * f8) + (f8 - f2), f2, (f17 * f5) + (f5 - f3), (f18 * f9) + (f9 - f3), f3, f17, f18, 1.0f);
    }
}
