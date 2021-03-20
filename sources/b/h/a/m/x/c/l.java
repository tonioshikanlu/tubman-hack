package b.h.a.m.x.c;

import b.h.a.m.o;

public abstract class l {
    public static final l a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final l f858b = new a();
    public static final l c;
    public static final l d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final l f859e;
    public static final o<l> f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f860g = true;

    public static class a extends l {
        public e a(int i2, int i3, int i4, int i5) {
            e eVar = e.QUALITY;
            return (b(i2, i3, i4, i5) != 1.0f && !l.f860g) ? e.MEMORY : eVar;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, l.a.b(i2, i3, i4, i5));
        }
    }

    public static class b extends l {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
        }
    }

    public static class c extends l {
        public e a(int i2, int i3, int i4, int i5) {
            return l.f860g ? e.QUALITY : e.MEMORY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            if (l.f860g) {
                return Math.min(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class d extends l {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        b bVar = new b();
        c = bVar;
        f859e = bVar;
        f = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    public abstract e a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
