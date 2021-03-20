package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.t;
import b.h.a.m.v.c0.b;
import b.h.a.s.g;
import b.h.a.s.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class y implements m {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f783j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f784b;
    public final m c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final int f785e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f786g;

    /* renamed from: h  reason: collision with root package name */
    public final p f787h;

    /* renamed from: i  reason: collision with root package name */
    public final t<?> f788i;

    public y(b bVar, m mVar, m mVar2, int i2, int i3, t<?> tVar, Class<?> cls, p pVar) {
        this.f784b = bVar;
        this.c = mVar;
        this.d = mVar2;
        this.f785e = i2;
        this.f = i3;
        this.f788i = tVar;
        this.f786g = cls;
        this.f787h = pVar;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f784b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f785e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        t<?> tVar = this.f788i;
        if (tVar != null) {
            tVar.b(messageDigest);
        }
        this.f787h.b(messageDigest);
        g<Class<?>, byte[]> gVar = f783j;
        byte[] a = gVar.a(this.f786g);
        if (a == null) {
            a = this.f786g.getName().getBytes(m.a);
            gVar.d(this.f786g, a);
        }
        messageDigest.update(a);
        this.f784b.d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f == yVar.f && this.f785e == yVar.f785e && j.b(this.f788i, yVar.f788i) && this.f786g.equals(yVar.f786g) && this.c.equals(yVar.c) && this.d.equals(yVar.d) && this.f787h.equals(yVar.f787h);
    }

    public int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.f785e) * 31) + this.f;
        t<?> tVar = this.f788i;
        if (tVar != null) {
            hashCode = (hashCode * 31) + tVar.hashCode();
        }
        int hashCode2 = this.f786g.hashCode();
        return this.f787h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder y = a.y("ResourceCacheKey{sourceKey=");
        y.append(this.c);
        y.append(", signature=");
        y.append(this.d);
        y.append(", width=");
        y.append(this.f785e);
        y.append(", height=");
        y.append(this.f);
        y.append(", decodedResourceClass=");
        y.append(this.f786g);
        y.append(", transformation='");
        y.append(this.f788i);
        y.append('\'');
        y.append(", options=");
        y.append(this.f787h);
        y.append('}');
        return y.toString();
    }
}
