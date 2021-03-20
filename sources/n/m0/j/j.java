package n.m0.j;

import java.util.List;
import n.m0.f.a;

public final class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f10324e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f10325g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, boolean z, String str2, boolean z2, f fVar, int i2, List list) {
        super(str2, z2);
        this.f10324e = fVar;
        this.f = i2;
        this.f10325g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a() {
        /*
            r3 = this;
            n.m0.j.f r0 = r3.f10324e
            n.m0.j.s r0 = r0.s
            int r1 = r3.f
            java.util.List r2 = r3.f10325g
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto L_0x002e
            n.m0.j.f r0 = r3.f10324e     // Catch:{ IOException -> 0x002e }
            n.m0.j.p r0 = r0.G     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f     // Catch:{ IOException -> 0x002e }
            n.m0.j.b r2 = n.m0.j.b.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.H(r1, r2)     // Catch:{ IOException -> 0x002e }
            n.m0.j.f r0 = r3.f10324e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            n.m0.j.f r1 = r3.f10324e     // Catch:{ all -> 0x002b }
            java.util.Set<java.lang.Integer> r1 = r1.I     // Catch:{ all -> 0x002b }
            int r2 = r3.f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.j.a():long");
    }
}
