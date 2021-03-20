package b.o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import b.o.c2;
import b.o.i2;
import b.o.n;
import com.amplitude.api.Constants;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class a implements c2.a {
    public static final Map<String, b> c = new ConcurrentHashMap();
    public static final Map<String, c2.b> d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, e> f5983e = new ConcurrentHashMap();
    public static d f = new d();
    @SuppressLint({"StaticFieldLeak"})
    public Activity a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5984b = false;

    public static abstract class b {
        public void a(@NonNull Activity activity) {
        }

        public void b() {
        }

        public void c(@NonNull Activity activity) {
        }
    }

    public static class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public boolean f5985h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5986i;

        public c(C0106a aVar) {
        }

        public void run() {
            if (i2.k() == null) {
                this.f5985h = true;
                for (Map.Entry<String, b> value : a.c.entrySet()) {
                    ((b) value.getValue()).b();
                }
                i2.a(i2.k.DEBUG, "Application lost focus", (Throwable) null);
                boolean z = false;
                i2.f6120h = false;
                i2.f6121i = i2.f.APP_CLOSE;
                i2.F(System.currentTimeMillis());
                c0.g();
                if (i2.f6119g) {
                    a4 a4Var = i2.f6126n;
                    if (a4Var != null) {
                        a4Var.a();
                    }
                    if (i2.c == null) {
                        i2.a(i2.k.ERROR, "Android Context not found, please call OneSignal.init when your app starts.", (Throwable) null);
                    } else {
                        n a = n.a();
                        Objects.requireNonNull(a);
                        b.o.u4.e eVar = i2.v.a;
                        Objects.requireNonNull(eVar);
                        ArrayList arrayList = new ArrayList();
                        for (b.o.u4.a next : eVar.a.values()) {
                            if (!(next instanceof b.o.u4.b)) {
                                arrayList.add(next.e());
                            }
                        }
                        a.b(arrayList, n.b.BACKGROUND);
                        a.a = null;
                        boolean t = o3.b().t();
                        boolean t2 = o3.a().t();
                        if (t2) {
                            t2 = o3.a().m() != null;
                        }
                        if (t || t2) {
                            z = true;
                        }
                        if (z) {
                            p3.b(i2.c);
                        }
                        c0.h(i2.c);
                    }
                }
                this.f5986i = true;
            }
        }
    }

    public static class d extends HandlerThread {

        /* renamed from: h  reason: collision with root package name */
        public Handler f5987h = new Handler(getLooper());

        /* renamed from: i  reason: collision with root package name */
        public c f5988i;

        public d() {
            super("FocusHandlerThread");
            start();
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: h  reason: collision with root package name */
        public final c2.b f5989h;

        /* renamed from: i  reason: collision with root package name */
        public final c2.a f5990i;

        /* renamed from: j  reason: collision with root package name */
        public final String f5991j;

        public e(c2.a aVar, c2.b bVar, String str, C0106a aVar2) {
            this.f5990i = aVar;
            this.f5989h = bVar;
            this.f5991j = str;
        }

        public void onGlobalLayout() {
            if (!g2.e(new WeakReference(i2.k()))) {
                c2.a aVar = this.f5990i;
                String str = this.f5991j;
                Activity activity = ((a) aVar).a;
                if (activity != null) {
                    activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                a.f5983e.remove(str);
                a.d.remove(str);
                this.f5989h.b();
            }
        }
    }

    public void a(String str, b bVar) {
        c.put(str, bVar);
        Activity activity = this.a;
        if (activity != null) {
            bVar.a(activity);
        }
    }

    public final void b() {
        boolean z;
        AtomicLong atomicLong;
        d dVar = f;
        c cVar = dVar.f5988i;
        if ((cVar != null && cVar.f5985h) || this.f5984b) {
            this.f5984b = false;
            if (cVar != null) {
                cVar.f5985h = false;
            }
            i2.a(i2.k.DEBUG, "Application on focus", (Throwable) null);
            i2.f6120h = true;
            if (!i2.f6121i.equals(i2.f.NOTIFICATION_CLICK)) {
                i2.f6121i = i2.f.APP_OPEN;
            }
            c0.g();
            if (!i2.G("onAppFocus")) {
                if (i2.a != null) {
                    z = false;
                } else {
                    i2.a(i2.k.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.", (Throwable) null);
                    z = true;
                }
                if (!z) {
                    n a2 = n.a();
                    Objects.requireNonNull(a2);
                    a2.a = Long.valueOf(SystemClock.elapsedRealtime());
                    i2.g();
                    c4 c4Var = i2.f6125m;
                    if (c4Var != null) {
                        c4Var.b();
                    }
                    new Thread(new m0(i2.c), "OS_RESTORE_NOTIFS").start();
                    i2.l(i2.c).a();
                    if (i2.f6127o != null && i2.o()) {
                        b4 b4Var = i2.f6127o;
                        Objects.requireNonNull(b4Var);
                        if (!(b4.d == null || b4.f == null)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - b4.d.get() <= 120000 && ((atomicLong = b4.f6025e) == null || currentTimeMillis - atomicLong.get() >= Constants.EVENT_UPLOAD_PERIOD_MILLIS)) {
                                try {
                                    Object b2 = b4Var.b(b4Var.f6026b);
                                    Method c2 = b4.c(b4.c);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("source", "OneSignal");
                                    bundle.putString(AnimationStrength.MEDIUM, "notification");
                                    bundle.putString("notification_id", b4.f.a);
                                    bundle.putString("campaign", b4Var.a(b4.f));
                                    c2.invoke(b2, new Object[]{"os_notification_influence_open", bundle});
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    }
                    Context context = i2.c;
                    Long l2 = p3.a;
                    synchronized (p3.class) {
                        p3.a = 0L;
                        if (!c0.h(context)) {
                            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2071862118);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        dVar.f5987h.removeCallbacksAndMessages((Object) null);
    }

    public final void c() {
        d dVar = f;
        c cVar = new c((C0106a) null);
        c cVar2 = dVar.f5988i;
        if (cVar2 == null || !cVar2.f5985h || cVar2.f5986i) {
            dVar.f5988i = cVar;
            dVar.f5987h.removeCallbacksAndMessages((Object) null);
            dVar.f5987h.postDelayed(cVar, 2000);
        }
    }

    public final void d() {
        String str;
        i2.k kVar = i2.k.DEBUG;
        StringBuilder y = b.e.a.a.a.y("curActivity is NOW: ");
        if (this.a != null) {
            StringBuilder y2 = b.e.a.a.a.y("");
            y2.append(this.a.getClass().getName());
            y2.append(":");
            y2.append(this.a);
            str = y2.toString();
        } else {
            str = "null";
        }
        y.append(str);
        i2.a(kVar, y.toString(), (Throwable) null);
    }

    public void e(Activity activity) {
        this.a = activity;
        for (Map.Entry<String, b> value : c.entrySet()) {
            ((b) value.getValue()).a(this.a);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.a.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry next : d.entrySet()) {
                e eVar = new e(this, (c2.b) next.getValue(), (String) next.getKey(), (C0106a) null);
                viewTreeObserver.addOnGlobalLayoutListener(eVar);
                f5983e.put(next.getKey(), eVar);
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}
