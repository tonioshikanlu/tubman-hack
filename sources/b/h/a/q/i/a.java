package b.h.a.q.i;

import android.graphics.drawable.Drawable;

public class a implements e<Drawable> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public b f998b;

    public a(int i2, boolean z) {
        this.a = i2;
    }

    public d<Drawable> a(b.h.a.m.a aVar, boolean z) {
        if (aVar == b.h.a.m.a.MEMORY_CACHE) {
            return c.a;
        }
        if (this.f998b == null) {
            this.f998b = new b(this.a, false);
        }
        return this.f998b;
    }
}
