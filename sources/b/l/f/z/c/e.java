package b.l.f.z.c;

import androidx.renderscript.ScriptIntrinsicBLAS;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final e[] f5868h = {new e(1, 10, 10, 8, 8, new c(5, new b(1, 3, (a) null), (a) null)), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5, (a) null), (a) null)), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8, (a) null), (a) null)), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12, (a) null), (a) null)), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18, (a) null), (a) null)), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22, (a) null), (a) null)), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30, (a) null), (a) null)), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36, (a) null), (a) null)), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44, (a) null), (a) null)), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62, (a) null), (a) null)), new e(11, 36, 36, 16, 16, new c(42, new b(1, 86, (a) null), (a) null)), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114, (a) null), (a) null)), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144, (a) null), (a) null)), new e(14, 48, 48, 22, 22, new c(68, new b(1, 174, (a) null), (a) null)), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102, (a) null), (a) null)), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140, (a) null), (a) null)), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92, (a) null), (a) null)), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114, (a) null), (a) null)), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144, (a) null), (a) null)), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174, (a) null), (a) null)), new e(21, 104, 104, 24, 24, new c(56, new b(6, 136, (a) null), (a) null)), new e(22, 120, 120, 18, 18, new c(68, new b(6, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, (a) null), (a) null)), new e(23, ScriptIntrinsicBLAS.UNIT, ScriptIntrinsicBLAS.UNIT, 20, 20, new c(62, new b(8, 163, (a) null), (a) null)), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156, (a) null), new b(2, 155, (a) null), (a) null)), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5, (a) null), (a) null)), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10, (a) null), (a) null)), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16, (a) null), (a) null)), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22, (a) null), (a) null)), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32, (a) null), (a) null)), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49, (a) null), (a) null))};
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5869b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5870e;
    public final c f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5871g;

    public static final class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5872b;

        public b(int i2, int i3, a aVar) {
            this.a = i2;
            this.f5872b = i3;
        }
    }

    public static final class c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final b[] f5873b;

        public c(int i2, b bVar, a aVar) {
            this.a = i2;
            this.f5873b = new b[]{bVar};
        }

        public c(int i2, b bVar, b bVar2, a aVar) {
            this.a = i2;
            this.f5873b = new b[]{bVar, bVar2};
        }
    }

    public e(int i2, int i3, int i4, int i5, int i6, c cVar) {
        this.a = i2;
        this.f5869b = i3;
        this.c = i4;
        this.d = i5;
        this.f5870e = i6;
        this.f = cVar;
        int i7 = cVar.a;
        int i8 = 0;
        for (b bVar : cVar.f5873b) {
            i8 += (bVar.f5872b + i7) * bVar.a;
        }
        this.f5871g = i8;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}
