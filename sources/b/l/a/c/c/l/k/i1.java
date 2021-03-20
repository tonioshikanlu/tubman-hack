package b.l.a.c.c.l.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.k.g;
import b.l.a.c.j.b.e;
import b.l.a.c.j.b.l;
import b.l.a.c.j.d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public final class i1 extends e implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: h  reason: collision with root package name */
    public static a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> f2668h = d.c;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2669b;
    public final a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> c;
    public Set<Scope> d;

    /* renamed from: e  reason: collision with root package name */
    public b.l.a.c.c.m.d f2670e;
    public b.l.a.c.j.e f;

    /* renamed from: g  reason: collision with root package name */
    public j1 f2671g;

    @WorkerThread
    public i1(Context context, Handler handler, @NonNull b.l.a.c.c.m.d dVar, a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> aVar) {
        this.a = context;
        this.f2669b = handler;
        b.l.a.c.b.a.B(dVar, "ClientSettings must not be null");
        this.f2670e = dVar;
        this.d = dVar.f2770b;
        this.c = aVar;
    }

    @WorkerThread
    public final void g(int i2) {
        this.f.b();
    }

    @BinderThread
    public final void h0(l lVar) {
        this.f2669b.post(new k1(this, lVar));
    }

    @WorkerThread
    public final void k(@Nullable Bundle bundle) {
        this.f.l(this);
    }

    @WorkerThread
    public final void n(@NonNull b bVar) {
        ((g.b) this.f2671g).b(bVar);
    }
}
