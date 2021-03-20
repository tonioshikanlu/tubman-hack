package b.h.a.q;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.f;
import b.h.a.m.m;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.t;
import b.h.a.m.v.k;
import b.h.a.m.x.c.i;
import b.h.a.m.x.c.l;
import b.h.a.m.x.c.q;
import b.h.a.q.a;
import b.h.a.s.b;
import b.h.a.s.j;
import java.util.Map;
import java.util.Objects;

public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    @Nullable
    public Resources.Theme B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: h  reason: collision with root package name */
    public int f960h;

    /* renamed from: i  reason: collision with root package name */
    public float f961i = 1.0f;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public k f962j = k.c;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public f f963k = f.NORMAL;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public Drawable f964l;

    /* renamed from: m  reason: collision with root package name */
    public int f965m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public Drawable f966n;

    /* renamed from: o  reason: collision with root package name */
    public int f967o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f968p = true;

    /* renamed from: q  reason: collision with root package name */
    public int f969q = -1;
    public int r = -1;
    @NonNull
    public m s;
    public boolean t;
    public boolean u;
    @Nullable
    public Drawable v;
    public int w;
    @NonNull
    public p x;
    @NonNull
    public Map<Class<?>, t<?>> y;
    @NonNull
    public Class<?> z;

    public a() {
        b.h.a.r.a aVar = b.h.a.r.a.f1001b;
        this.s = b.h.a.r.a.f1001b;
        this.u = true;
        this.x = new p();
        this.y = new b();
        this.z = Object.class;
        this.F = true;
    }

    public static boolean i(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    @CheckResult
    @NonNull
    public T a(@NonNull a<?> aVar) {
        if (this.C) {
            return clone().a(aVar);
        }
        if (i(aVar.f960h, 2)) {
            this.f961i = aVar.f961i;
        }
        if (i(aVar.f960h, 262144)) {
            this.D = aVar.D;
        }
        if (i(aVar.f960h, 1048576)) {
            this.G = aVar.G;
        }
        if (i(aVar.f960h, 4)) {
            this.f962j = aVar.f962j;
        }
        if (i(aVar.f960h, 8)) {
            this.f963k = aVar.f963k;
        }
        if (i(aVar.f960h, 16)) {
            this.f964l = aVar.f964l;
            this.f965m = 0;
            this.f960h &= -33;
        }
        if (i(aVar.f960h, 32)) {
            this.f965m = aVar.f965m;
            this.f964l = null;
            this.f960h &= -17;
        }
        if (i(aVar.f960h, 64)) {
            this.f966n = aVar.f966n;
            this.f967o = 0;
            this.f960h &= -129;
        }
        if (i(aVar.f960h, 128)) {
            this.f967o = aVar.f967o;
            this.f966n = null;
            this.f960h &= -65;
        }
        if (i(aVar.f960h, 256)) {
            this.f968p = aVar.f968p;
        }
        if (i(aVar.f960h, 512)) {
            this.r = aVar.r;
            this.f969q = aVar.f969q;
        }
        if (i(aVar.f960h, 1024)) {
            this.s = aVar.s;
        }
        if (i(aVar.f960h, 4096)) {
            this.z = aVar.z;
        }
        if (i(aVar.f960h, 8192)) {
            this.v = aVar.v;
            this.w = 0;
            this.f960h &= -16385;
        }
        if (i(aVar.f960h, 16384)) {
            this.w = aVar.w;
            this.v = null;
            this.f960h &= -8193;
        }
        if (i(aVar.f960h, 32768)) {
            this.B = aVar.B;
        }
        if (i(aVar.f960h, 65536)) {
            this.u = aVar.u;
        }
        if (i(aVar.f960h, 131072)) {
            this.t = aVar.t;
        }
        if (i(aVar.f960h, 2048)) {
            this.y.putAll(aVar.y);
            this.F = aVar.F;
        }
        if (i(aVar.f960h, 524288)) {
            this.E = aVar.E;
        }
        if (!this.u) {
            this.y.clear();
            int i2 = this.f960h & -2049;
            this.f960h = i2;
            this.t = false;
            this.f960h = i2 & -131073;
            this.F = true;
        }
        this.f960h |= aVar.f960h;
        this.x.d(aVar.x);
        q();
        return this;
    }

    @NonNull
    public T b() {
        if (!this.A || this.C) {
            this.C = true;
            return j();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    @NonNull
    public T c() {
        return w(l.c, new i());
    }

    @CheckResult
    /* renamed from: d */
    public T clone() {
        try {
            T t2 = (a) super.clone();
            p pVar = new p();
            t2.x = pVar;
            pVar.d(this.x);
            b bVar = new b();
            t2.y = bVar;
            bVar.putAll(this.y);
            t2.A = false;
            t2.C = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f961i, this.f961i) == 0 && this.f965m == aVar.f965m && j.b(this.f964l, aVar.f964l) && this.f967o == aVar.f967o && j.b(this.f966n, aVar.f966n) && this.w == aVar.w && j.b(this.v, aVar.v) && this.f968p == aVar.f968p && this.f969q == aVar.f969q && this.r == aVar.r && this.t == aVar.t && this.u == aVar.u && this.D == aVar.D && this.E == aVar.E && this.f962j.equals(aVar.f962j) && this.f963k == aVar.f963k && this.x.equals(aVar.x) && this.y.equals(aVar.y) && this.z.equals(aVar.z) && j.b(this.s, aVar.s) && j.b(this.B, aVar.B);
    }

    @CheckResult
    @NonNull
    public T f(@NonNull Class<?> cls) {
        if (this.C) {
            return clone().f(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.z = cls;
        this.f960h |= 4096;
        q();
        return this;
    }

    @CheckResult
    @NonNull
    public T g(@NonNull k kVar) {
        if (this.C) {
            return clone().g(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f962j = kVar;
        this.f960h |= 4;
        q();
        return this;
    }

    @CheckResult
    @NonNull
    public T h(@NonNull l lVar) {
        o oVar = l.f;
        Objects.requireNonNull(lVar, "Argument must not be null");
        return r(oVar, lVar);
    }

    public int hashCode() {
        return j.g(this.B, j.g(this.s, j.g(this.z, j.g(this.y, j.g(this.x, j.g(this.f963k, j.g(this.f962j, (((((((((((((j.g(this.v, (j.g(this.f966n, (j.g(this.f964l, (j.f(this.f961i) * 31) + this.f965m) * 31) + this.f967o) * 31) + this.w) * 31) + (this.f968p ? 1 : 0)) * 31) + this.f969q) * 31) + this.r) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0))))))));
    }

    @NonNull
    public T j() {
        this.A = true;
        return this;
    }

    @CheckResult
    @NonNull
    public T k() {
        return n(l.c, new i());
    }

    @CheckResult
    @NonNull
    public T l() {
        T n2 = n(l.f858b, new b.h.a.m.x.c.j());
        n2.F = true;
        return n2;
    }

    @CheckResult
    @NonNull
    public T m() {
        T n2 = n(l.a, new q());
        n2.F = true;
        return n2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T n(@androidx.annotation.NonNull b.h.a.m.x.c.l r2, @androidx.annotation.NonNull b.h.a.m.t<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.n(r2, r3)
            return r2
        L_0x000d:
            r1.h(r2)
            r2 = 0
            b.h.a.q.a r2 = r1.v(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.n(b.h.a.m.x.c.l, b.h.a.m.t):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    public T o(int i2, int i3) {
        if (this.C) {
            return clone().o(i2, i3);
        }
        this.r = i2;
        this.f969q = i3;
        this.f960h |= 512;
        q();
        return this;
    }

    @CheckResult
    @NonNull
    public T p(@NonNull f fVar) {
        if (this.C) {
            return clone().p(fVar);
        }
        Objects.requireNonNull(fVar, "Argument must not be null");
        this.f963k = fVar;
        this.f960h |= 8;
        q();
        return this;
    }

    @NonNull
    public final T q() {
        if (!this.A) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b.h.a.m.o, b.h.a.m.o<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T r(@androidx.annotation.NonNull b.h.a.m.o<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.r(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            b.h.a.m.p r0 = r1.x
            androidx.collection.ArrayMap<b.h.a.m.o<?>, java.lang.Object> r0 = r0.f586b
            r0.put(r2, r3)
            r1.q()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.r(b.h.a.m.o, java.lang.Object):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    public T s(@NonNull m mVar) {
        if (this.C) {
            return clone().s(mVar);
        }
        Objects.requireNonNull(mVar, "Argument must not be null");
        this.s = mVar;
        this.f960h |= 1024;
        q();
        return this;
    }

    @CheckResult
    @NonNull
    public T t(boolean z2) {
        if (this.C) {
            return clone().t(true);
        }
        this.f968p = !z2;
        this.f960h |= 256;
        q();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T u(@androidx.annotation.NonNull b.h.a.m.t<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            b.h.a.q.a r2 = r1.v(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.u(b.h.a.m.t):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T v(@androidx.annotation.NonNull b.h.a.m.t<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r2.clone()
            b.h.a.q.a r3 = r0.v(r3, r4)
            return r3
        L_0x000d:
            b.h.a.m.x.c.o r0 = new b.h.a.m.x.c.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.x(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.x(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.x(r1, r0, r4)
            java.lang.Class<b.h.a.m.x.g.c> r0 = b.h.a.m.x.g.c.class
            b.h.a.m.x.g.f r1 = new b.h.a.m.x.g.f
            r1.<init>(r3)
            r2.x(r0, r1, r4)
            r2.q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.v(b.h.a.m.t, boolean):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T w(@androidx.annotation.NonNull b.h.a.m.x.c.l r2, @androidx.annotation.NonNull b.h.a.m.t<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.w(r2, r3)
            return r2
        L_0x000d:
            r1.h(r2)
            b.h.a.q.a r2 = r1.u(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.w(b.h.a.m.x.c.l, b.h.a.m.t):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<Y>, b.h.a.m.t, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T x(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull b.h.a.m.t<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.x(r2, r3, r4)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Map<java.lang.Class<?>, b.h.a.m.t<?>> r0 = r1.y
            r0.put(r2, r3)
            int r2 = r1.f960h
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f960h = r2
            r3 = 1
            r1.u = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f960h = r2
            r0 = 0
            r1.F = r0
            if (r4 == 0) goto L_0x0034
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f960h = r2
            r1.t = r3
        L_0x0034:
            r1.q()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.a.x(java.lang.Class, b.h.a.m.t, boolean):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    public T y(boolean z2) {
        if (this.C) {
            return clone().y(z2);
        }
        this.G = z2;
        this.f960h |= 1048576;
        q();
        return this;
    }
}
