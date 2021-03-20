package b.l.a.c.i.b;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import b.l.a.c.c.p.e;

public final class h3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f4029h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4030i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f4031j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f4032k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f4033l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ k3 f4034m;

    public h3(k3 k3Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f4034m = k3Var;
        this.f4029h = i2;
        this.f4030i = str;
        this.f4031j = obj;
        this.f4032k = obj2;
        this.f4033l = obj3;
    }

    public final void run() {
        char c;
        k3 k3Var;
        x3 q2 = this.f4034m.a.q();
        if (q2.k()) {
            k3 k3Var2 = this.f4034m;
            if (k3Var2.c == 0) {
                f fVar = k3Var2.a.f4114g;
                if (fVar.d == null) {
                    synchronized (fVar) {
                        if (fVar.d == null) {
                            ApplicationInfo applicationInfo = fVar.a.a.getApplicationInfo();
                            String a = e.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                fVar.d = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (fVar.d == null) {
                                fVar.d = Boolean.TRUE;
                                fVar.a.a().f.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.d.booleanValue()) {
                    k3Var = this.f4034m;
                    y9 y9Var = k3Var.a.f;
                    c = 'C';
                } else {
                    k3Var = this.f4034m;
                    y9 y9Var2 = k3Var.a.f;
                    c = 'c';
                }
                k3Var.c = c;
            }
            k3 k3Var3 = this.f4034m;
            if (k3Var3.d < 0) {
                k3Var3.a.f4114g.n();
                k3Var3.d = 39000;
            }
            char charAt = "01VDIWEA?".charAt(this.f4029h);
            k3 k3Var4 = this.f4034m;
            char c2 = k3Var4.c;
            long j2 = k3Var4.d;
            String w = k3.w(true, this.f4030i, this.f4031j, this.f4032k, this.f4033l);
            StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 24);
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
            sb.append(charAt);
            sb.append(c2);
            sb.append(j2);
            sb.append(":");
            sb.append(w);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f4030i.substring(0, 1024);
            }
            v3 v3Var = q2.d;
            if (v3Var != null) {
                v3Var.f4309e.h();
                if (v3Var.f4309e.o().getLong(v3Var.a, 0) == 0) {
                    v3Var.a();
                }
                if (sb2 == null) {
                    sb2 = "";
                }
                long j3 = v3Var.f4309e.o().getLong(v3Var.f4308b, 0);
                if (j3 <= 0) {
                    SharedPreferences.Editor edit = v3Var.f4309e.o().edit();
                    edit.putString(v3Var.c, sb2);
                    edit.putLong(v3Var.f4308b, 1);
                    edit.apply();
                    return;
                }
                long nextLong = v3Var.f4309e.a.t().d0().nextLong();
                long j4 = j3 + 1;
                long j5 = RecyclerView.FOREVER_NS / j4;
                SharedPreferences.Editor edit2 = v3Var.f4309e.o().edit();
                if ((RecyclerView.FOREVER_NS & nextLong) < j5) {
                    edit2.putString(v3Var.c, sb2);
                }
                edit2.putLong(v3Var.f4308b, j4);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f4034m.v(), "Persisted config not initialized. Not logging error/warn");
    }
}
