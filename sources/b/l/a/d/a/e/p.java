package b.l.a.d.a.e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p<T extends IInterface> {

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, Handler> f4668l = new HashMap();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4669b;
    public final String c;
    public final List<g> d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f4670e;
    public final Intent f;

    /* renamed from: g  reason: collision with root package name */
    public final l<T> f4671g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference<k> f4672h;

    /* renamed from: i  reason: collision with root package name */
    public final IBinder.DeathRecipient f4673i = new h(this);
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public ServiceConnection f4674j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public T f4675k;

    public p(Context context, f fVar, String str, Intent intent, l<T> lVar) {
        this.a = context;
        this.f4669b = fVar;
        this.c = str;
        this.f = intent;
        this.f4671g = lVar;
        this.f4672h = new WeakReference<>((Object) null);
    }

    public final void a(g gVar) {
        c(new i(this, gVar.f4660h, gVar));
    }

    public final void b() {
        c(new j(this));
    }

    public final void c(g gVar) {
        Handler handler;
        Map<String, Handler> map = f4668l;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.c);
        }
        handler.post(gVar);
    }
}
