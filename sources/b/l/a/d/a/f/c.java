package b.l.a.d.a.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import b.l.a.d.a.e.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class c<StateT> {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f4680b;
    public final Context c;
    public final Set<a<StateT>> d = new HashSet();
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public b f4681e = null;
    public volatile boolean f = false;

    public c(f fVar, IntentFilter intentFilter, Context context) {
        this.a = fVar;
        this.f4680b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        b bVar;
        if ((this.f || !this.d.isEmpty()) && this.f4681e == null) {
            b bVar2 = new b(this);
            this.f4681e = bVar2;
            this.c.registerReceiver(bVar2, this.f4680b);
        }
        if (!this.f && this.d.isEmpty() && (bVar = this.f4681e) != null) {
            this.c.unregisterReceiver(bVar);
            this.f4681e = null;
        }
    }

    public final synchronized void c(StateT statet) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }
}
