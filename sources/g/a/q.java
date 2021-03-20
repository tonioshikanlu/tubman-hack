package g.a;

import b.e.a.a.a;
import e.r;
import e.x.b.l;
import e.x.c.i;
import java.util.Objects;

public final class q {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9976b;
    public final l<Throwable, r> c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f9977e;

    public q(Object obj, e eVar, l<? super Throwable, r> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f9976b = eVar;
        this.c = lVar;
        this.d = obj2;
        this.f9977e = th;
    }

    public q(Object obj, e eVar, l<Throwable, r> lVar, Object obj2, Throwable th, int i2) {
        eVar = (i2 & 2) != 0 ? null : eVar;
        lVar = (i2 & 4) != 0 ? null : lVar;
        obj2 = (i2 & 8) != 0 ? null : obj2;
        th = (i2 & 16) != 0 ? null : th;
        this.a = obj;
        this.f9976b = eVar;
        this.c = lVar;
        this.d = obj2;
        this.f9977e = th;
    }

    public static q a(q qVar, Object obj, e eVar, l lVar, Object obj2, Throwable th, int i2) {
        Object obj3 = null;
        Object obj4 = (i2 & 1) != 0 ? qVar.a : null;
        if ((i2 & 2) != 0) {
            eVar = qVar.f9976b;
        }
        e eVar2 = eVar;
        l<Throwable, r> lVar2 = (i2 & 4) != 0 ? qVar.c : null;
        if ((i2 & 8) != 0) {
            obj3 = qVar.d;
        }
        Object obj5 = obj3;
        if ((i2 & 16) != 0) {
            th = qVar.f9977e;
        }
        Objects.requireNonNull(qVar);
        return new q(obj4, eVar2, lVar2, obj5, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i.a(this.a, qVar.a) && i.a(this.f9976b, qVar.f9976b) && i.a(this.c, qVar.c) && i.a(this.d, qVar.d) && i.a(this.f9977e, qVar.f9977e);
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        e eVar = this.f9976b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        l<Throwable, r> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f9977e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("CompletedContinuation(result=");
        y.append(this.a);
        y.append(", cancelHandler=");
        y.append(this.f9976b);
        y.append(", onCancellation=");
        y.append(this.c);
        y.append(", idempotentResume=");
        y.append(this.d);
        y.append(", cancelCause=");
        y.append(this.f9977e);
        y.append(")");
        return y.toString();
    }
}
