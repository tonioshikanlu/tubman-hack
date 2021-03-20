package e.a.a.a.z0;

import java.io.Serializable;

public final class e<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final K f9844h;

    /* renamed from: i  reason: collision with root package name */
    public final V f9845i;

    public e(K k2, V v) {
        this.f9844h = k2;
        this.f9845i = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof e.a.a.a.z0.e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            e.a.a.a.z0.e r4 = (e.a.a.a.z0.e) r4
            K r0 = r3.f9844h
            if (r0 != 0) goto L_0x0011
            K r0 = r4.f9844h
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.f9844h
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.f9845i
            V r4 = r4.f9845i
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.z0.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k2 = this.f9844h;
        int i2 = 0;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f9845i;
        if (v != null) {
            i2 = v.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return this.f9844h + "=" + this.f9845i;
    }
}
