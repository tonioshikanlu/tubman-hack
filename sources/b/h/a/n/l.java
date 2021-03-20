package b.h.a.n;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b.h.a.c;
import b.h.a.i;
import b.h.a.s.j;
import java.util.HashMap;
import java.util.Map;

public class l implements Handler.Callback {
    public static final b f = new a();
    public volatile i a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final Map<FragmentManager, k> f944b = new HashMap();
    @VisibleForTesting
    public final Map<androidx.fragment.app.FragmentManager, o> c = new HashMap();
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final b f945e;

    public class a implements b {
        @NonNull
        public i a(@NonNull c cVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context) {
            return new i(cVar, hVar, mVar, context);
        }
    }

    public interface b {
        @NonNull
        i a(@NonNull c cVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context);
    }

    public l(@Nullable b bVar) {
        new ArrayMap();
        new ArrayMap();
        new Bundle();
        this.f945e = bVar == null ? f : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    @Nullable
    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean e(Context context) {
        Activity a2 = a(context);
        return a2 == null || !a2.isFinishing();
    }

    @NonNull
    public i b(@NonNull Context context) {
        if (context != null) {
            if (j.i() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    if (j.h()) {
                        return b(fragmentActivity.getApplicationContext());
                    }
                    if (!fragmentActivity.isDestroyed()) {
                        o d2 = d(fragmentActivity.getSupportFragmentManager(), (Fragment) null, e(fragmentActivity));
                        i iVar = d2.f951l;
                        if (iVar != null) {
                            return iVar;
                        }
                        i a2 = this.f945e.a(c.b(fragmentActivity), d2.f947h, d2.f948i, fragmentActivity);
                        d2.f951l = a2;
                        return a2;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (j.h()) {
                        return b(activity.getApplicationContext());
                    }
                    if (!activity.isDestroyed()) {
                        k c2 = c(activity.getFragmentManager(), (android.app.Fragment) null, e(activity));
                        i iVar2 = c2.f941k;
                        if (iVar2 != null) {
                            return iVar2;
                        }
                        i a3 = this.f945e.a(c.b(activity), c2.f938h, c2.f939i, activity);
                        c2.f941k = a3;
                        return a3;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = this.f945e.a(c.b(context.getApplicationContext()), new b(), new g(), context.getApplicationContext());
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    public final k c(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f944b.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.f943m = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                kVar.a(fragment.getActivity());
            }
            if (z) {
                kVar.f938h.d();
            }
            this.f944b.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @NonNull
    public final o d(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.c.get(fragmentManager)) == null) {
            oVar = new o();
            oVar.f952m = fragment;
            if (!(fragment == null || fragment.getContext() == null)) {
                Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    oVar.d(fragment.getContext(), fragmentManager2);
                }
            }
            if (z) {
                oVar.f947h.d();
            }
            this.c.put(fragmentManager, oVar);
            fragmentManager.beginTransaction().add((Fragment) oVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f944b;
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.c;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }
}
