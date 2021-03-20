package b.l.a.d.a.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import b.l.a.d.a.f.c;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class q extends c<AssetPackState> {

    /* renamed from: g  reason: collision with root package name */
    public final v0 f4601g;

    /* renamed from: h  reason: collision with root package name */
    public final h0 f4602h;

    /* renamed from: i  reason: collision with root package name */
    public final c0<n2> f4603i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f4604j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f4605k;

    /* renamed from: l  reason: collision with root package name */
    public final c0<Executor> f4606l;

    /* renamed from: m  reason: collision with root package name */
    public final c0<Executor> f4607m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f4608n = new Handler(Looper.getMainLooper());

    public q(Context context, v0 v0Var, h0 h0Var, c0<n2> c0Var, k0 k0Var, b0 b0Var, c0<Executor> c0Var2, c0<Executor> c0Var3) {
        super(new f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f4601g = v0Var;
        this.f4602h = h0Var;
        this.f4603i = c0Var;
        this.f4605k = k0Var;
        this.f4604j = b0Var;
        this.f4606l = c0Var2;
        this.f4607m = c0Var3;
    }

    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.a.b(6, "Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState d = AssetPackState.d(bundleExtra, stringArrayList.get(0), this.f4605k, s.c);
            this.a.b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{d});
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                Objects.requireNonNull(this.f4604j);
            }
            this.f4607m.a().execute(new o(this, bundleExtra, d));
            this.f4606l.a().execute(new p(this, bundleExtra));
            return;
        }
        this.a.b(6, "Empty bundle received from broadcast.", new Object[0]);
    }
}
