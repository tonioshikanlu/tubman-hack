package b.l.a.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import b.l.a.d.a.e.f;
import b.l.a.d.a.e.p;
import b.l.a.d.a.e.q0;
import b.l.a.d.a.e.r;
import b.l.a.d.a.i.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m implements n2 {
    public static final f f = new f("AssetPackServiceImpl");

    /* renamed from: g  reason: collision with root package name */
    public static final Intent f4576g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f4577b;
    @Nullable
    public p<q0> c;
    @Nullable
    public p<q0> d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4578e = new AtomicBoolean();

    public m(Context context, k0 k0Var) {
        this.a = context.getPackageName();
        this.f4577b = k0Var;
        if (r.a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            f fVar = f;
            Intent intent = f4576g;
            this.c = new p(context2, fVar, "AssetPackService", intent, o2.c);
            Context applicationContext2 = context.getApplicationContext();
            this.d = new p(applicationContext2 != null ? applicationContext2 : context, fVar, "AssetPackService-keepAlive", intent, o2.f4593b);
        }
        f.b(3, "AssetPackService initiated.", new Object[0]);
    }

    public static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    public static /* synthetic */ Bundle i(Map map) {
        Bundle h2 = h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        h2.putParcelableArrayList("installed_asset_module", arrayList);
        return h2;
    }

    public static Bundle j(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i3);
        return bundle;
    }

    public static <T> b.l.a.d.a.i.r<T> l() {
        f.b(6, "onError(%d)", new Object[]{-11});
        a aVar = new a(-11);
        b.l.a.d.a.i.r<T> rVar = new b.l.a.d.a.i.r<>();
        rVar.d(aVar);
        return rVar;
    }

    public final void a(int i2, String str) {
        k(i2, str, 10);
    }

    public final b.l.a.d.a.i.r<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        if (this.c == null) {
            return l();
        }
        f.b(4, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i3), Integer.valueOf(i2)});
        n nVar = new n();
        this.c.a(new f(this, nVar, i2, str, str2, i3, nVar));
        return nVar.a;
    }

    public final synchronized void c() {
        if (this.d == null) {
            f.b(5, "Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f fVar = f;
        fVar.b(4, "keepAlive", new Object[0]);
        if (!this.f4578e.compareAndSet(false, true)) {
            fVar.b(4, "Service is already kept alive.", new Object[0]);
            return;
        }
        n nVar = new n();
        this.d.a(new g(this, nVar, nVar));
    }

    public final void d(int i2) {
        if (this.c != null) {
            f.b(4, "notifySessionFailed", new Object[0]);
            n nVar = new n();
            this.c.a(new e(this, nVar, i2, nVar));
            return;
        }
        throw new g0("The Play Store app is not installed or is an unofficial version.", i2);
    }

    public final b.l.a.d.a.i.r<List<String>> e(Map<String, Long> map) {
        if (this.c == null) {
            return l();
        }
        f.b(4, "syncPacks", new Object[0]);
        n nVar = new n();
        this.c.a(new q2(this, nVar, map, nVar));
        return nVar.a;
    }

    public final void f(List<String> list) {
        if (this.c != null) {
            f.b(4, "cancelDownloads(%s)", new Object[]{list});
            n nVar = new n();
            this.c.a(new p2(this, nVar, list, nVar));
        }
    }

    public final void g(int i2, String str, String str2, int i3) {
        if (this.c != null) {
            f.b(4, "notifyChunkTransferred", new Object[0]);
            n nVar = new n();
            this.c.a(new c(this, nVar, i2, str, str2, i3, nVar));
            return;
        }
        throw new g0("The Play Store app is not installed or is an unofficial version.", i2);
    }

    public final void k(int i2, String str, int i3) {
        if (this.c != null) {
            f.b(4, "notifyModuleCompleted", new Object[0]);
            n nVar = new n();
            this.c.a(new d(this, nVar, i2, str, nVar, i3));
            return;
        }
        throw new g0("The Play Store app is not installed or is an unofficial version.", i2);
    }
}
