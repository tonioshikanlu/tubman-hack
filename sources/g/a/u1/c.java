package g.a.u1;

import e.v.f;
import g.a.c0;
import g.a.r0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class c extends r0 {

    /* renamed from: i  reason: collision with root package name */
    public a f10015i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10016j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10017k;

    /* renamed from: l  reason: collision with root package name */
    public final long f10018l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10019m;

    public c(int i2, int i3, String str, int i4) {
        int i5 = (i4 & 1) != 0 ? k.f10030b : i2;
        int i6 = (i4 & 2) != 0 ? k.c : i3;
        String str2 = (i4 & 4) != 0 ? "DefaultDispatcher" : null;
        long j2 = k.d;
        this.f10016j = i5;
        this.f10017k = i6;
        this.f10018l = j2;
        this.f10019m = str2;
        this.f10015i = new a(i5, i6, j2, str2);
    }

    public void m0(f fVar, Runnable runnable) {
        try {
            a aVar = this.f10015i;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f9989o;
            aVar.z(runnable, g.f10026h, false);
        } catch (RejectedExecutionException unused) {
            c0.f9929o.v0(runnable);
        }
    }
}
