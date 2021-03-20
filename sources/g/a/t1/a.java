package g.a.t1;

import android.os.Handler;
import android.os.Looper;
import e.v.f;
import e.x.c.i;
import g.a.h1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends b {
    public volatile a _immediate;

    /* renamed from: i  reason: collision with root package name */
    public final a f9985i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f9986j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9987k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9988l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        a aVar = null;
        this.f9986j = handler;
        this.f9987k = str;
        this.f9988l = z;
        this._immediate = z ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f9985i = aVar2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f9986j == this.f9986j;
    }

    public int hashCode() {
        return System.identityHashCode(this.f9986j);
    }

    public void m0(f fVar, Runnable runnable) {
        this.f9986j.post(runnable);
    }

    public boolean n0(f fVar) {
        return !this.f9988l || (i.a(Looper.myLooper(), this.f9986j.getLooper()) ^ true);
    }

    public h1 o0() {
        return this.f9985i;
    }

    public String toString() {
        String p0 = p0();
        if (p0 != null) {
            return p0;
        }
        String str = this.f9987k;
        if (str == null) {
            str = this.f9986j.toString();
        }
        return this.f9988l ? b.e.a.a.a.m(str, ".immediate") : str;
    }
}
