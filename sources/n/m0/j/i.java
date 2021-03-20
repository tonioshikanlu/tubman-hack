package n.m0.j;

import java.util.List;
import n.m0.f.a;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f10321e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f10322g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f10323h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z, String str2, boolean z2, f fVar, int i2, List list, boolean z3) {
        super(str2, z2);
        this.f10321e = fVar;
        this.f = i2;
        this.f10322g = list;
        this.f10323h = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a() {
        /*
            r4 = this;
            n.m0.j.f r0 = r4.f10321e
            n.m0.j.s r0 = r0.s
            int r1 = r4.f
            java.util.List r2 = r4.f10322g
            boolean r3 = r4.f10323h
            boolean r0 = r0.b(r1, r2, r3)
            if (r0 == 0) goto L_0x001b
            n.m0.j.f r1 = r4.f10321e     // Catch:{ IOException -> 0x0036 }
            n.m0.j.p r1 = r1.G     // Catch:{ IOException -> 0x0036 }
            int r2 = r4.f     // Catch:{ IOException -> 0x0036 }
            n.m0.j.b r3 = n.m0.j.b.CANCEL     // Catch:{ IOException -> 0x0036 }
            r1.H(r2, r3)     // Catch:{ IOException -> 0x0036 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            boolean r0 = r4.f10323h     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0036
        L_0x0021:
            n.m0.j.f r0 = r4.f10321e     // Catch:{ IOException -> 0x0036 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0036 }
            n.m0.j.f r1 = r4.f10321e     // Catch:{ all -> 0x0033 }
            java.util.Set<java.lang.Integer> r1 = r1.I     // Catch:{ all -> 0x0033 }
            int r2 = r4.f     // Catch:{ all -> 0x0033 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0033 }
            r1.remove(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0036
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0036 }
            throw r1     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.i.a():long");
    }
}
