package b.p.a;

import b.e.a.a.a;
import b.l.f.x.a.g;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

public abstract class u implements Closeable, Flushable {

    /* renamed from: h  reason: collision with root package name */
    public int f6410h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int[] f6411i = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public String[] f6412j = new String[32];

    /* renamed from: k  reason: collision with root package name */
    public int[] f6413k = new int[32];

    /* renamed from: l  reason: collision with root package name */
    public boolean f6414l;

    /* renamed from: m  reason: collision with root package name */
    public int f6415m = -1;

    public abstract u H();

    public final String N() {
        return g.y(this.f6410h, this.f6411i, this.f6412j, this.f6413k);
    }

    public abstract u O(String str);

    public abstract u S();

    public final int Y() {
        int i2 = this.f6410h;
        if (i2 != 0) {
            return this.f6411i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract u b();

    public abstract u e();

    public final void e0(int i2) {
        int[] iArr = this.f6411i;
        int i3 = this.f6410h;
        this.f6410h = i3 + 1;
        iArr[i3] = i2;
    }

    public abstract u g0(double d);

    public abstract u k0(long j2);

    public abstract u m0(Number number);

    public abstract u n0(String str);

    public abstract u o0(boolean z);

    public final boolean q() {
        int i2 = this.f6410h;
        int[] iArr = this.f6411i;
        if (i2 != iArr.length) {
            return false;
        }
        if (i2 != 256) {
            this.f6411i = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f6412j;
            this.f6412j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f6413k;
            this.f6413k = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof t)) {
                return true;
            }
            t tVar = (t) this;
            Object[] objArr = tVar.f6408n;
            tVar.f6408n = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        StringBuilder y = a.y("Nesting too deep at ");
        y.append(N());
        y.append(": circular reference?");
        throw new n(y.toString());
    }

    public abstract u z();
}
