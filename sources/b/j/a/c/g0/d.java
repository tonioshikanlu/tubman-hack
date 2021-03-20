package b.j.a.c.g0;

import b.j.a.b.a;
import b.j.a.b.b;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.y;
import java.util.Arrays;

public class d extends r {

    /* renamed from: i  reason: collision with root package name */
    public static final d f2003i = new d(new byte[0]);

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f2004h;

    public d(byte[] bArr) {
        this.f2004h = bArr;
    }

    public final void e(f fVar, y yVar) {
        a aVar = yVar.f2320h.f1609i.f1594p;
        byte[] bArr = this.f2004h;
        fVar.m0(aVar, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            return Arrays.equals(((d) obj).f2004h, this.f2004h);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f2004h;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public String n() {
        return b.f1372b.f(this.f2004h, false);
    }

    public String toString() {
        return b.f1372b.f(this.f2004h, true);
    }

    public l v() {
        return l.VALUE_EMBEDDED_OBJECT;
    }
}
