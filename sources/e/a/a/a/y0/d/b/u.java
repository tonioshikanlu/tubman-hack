package e.a.a.a.y0.d.b;

import androidx.core.app.FrameMetricsAggregator;
import androidx.media.AudioAttributesCompat;

public final class u {

    /* renamed from: k  reason: collision with root package name */
    public static final u f8649k;

    /* renamed from: l  reason: collision with root package name */
    public static final u f8650l = new u(false, false, false, false, false, (u) null, false, (u) null, (u) null, true, FrameMetricsAggregator.EVERY_DURATION);

    /* renamed from: m  reason: collision with root package name */
    public static final u f8651m;
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8652b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8653e;
    public final u f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8654g;

    /* renamed from: h  reason: collision with root package name */
    public final u f8655h;

    /* renamed from: i  reason: collision with root package name */
    public final u f8656i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8657j;

    static {
        u uVar = new u(false, false, false, false, false, (u) null, false, (u) null, (u) null, false, AudioAttributesCompat.FLAG_ALL);
        f8649k = uVar;
        f8651m = new u(false, false, false, false, false, uVar, false, (u) null, (u) null, false, 988);
    }

    public u(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, u uVar, boolean z6, u uVar2, u uVar3, boolean z7, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        z2 = (i2 & 2) != 0 ? true : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        z4 = (i2 & 8) != 0 ? false : z4;
        z5 = (i2 & 16) != 0 ? false : z5;
        uVar = (i2 & 32) != 0 ? null : uVar;
        z6 = (i2 & 64) != 0 ? true : z6;
        uVar2 = (i2 & 128) != 0 ? uVar : uVar2;
        uVar3 = (i2 & 256) != 0 ? uVar : uVar3;
        z7 = (i2 & 512) != 0 ? false : z7;
        this.a = z;
        this.f8652b = z2;
        this.c = z3;
        this.d = z4;
        this.f8653e = z5;
        this.f = uVar;
        this.f8654g = z6;
        this.f8655h = uVar2;
        this.f8656i = uVar3;
        this.f8657j = z7;
    }
}
