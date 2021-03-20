package b.l.a.c.i.b;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import b.l.a.c.c.o.a;
import b.l.a.c.f.i.h3;
import b.l.a.c.f.i.i9;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.util.Objects;

public final class y3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h3 f4376h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f4377i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z3 f4378j;

    public y3(z3 z3Var, h3 h3Var, ServiceConnection serviceConnection) {
        this.f4378j = z3Var;
        this.f4376h = h3Var;
        this.f4377i = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        String str;
        i3 i3Var;
        z3 z3Var = this.f4378j;
        b4 b4Var = z3Var.f4387b;
        String str2 = z3Var.a;
        h3 h3Var = this.f4376h;
        ServiceConnection serviceConnection = this.f4377i;
        b4Var.a.d().h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str2);
        try {
            bundle = h3Var.M0(bundle2);
            if (bundle == null) {
                b4Var.a.a().f.a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e2) {
            b4Var.a.a().f.b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
        }
        b4Var.a.d().h();
        if (bundle != null) {
            long j2 = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j2 == 0) {
                i3Var = b4Var.a.a().f4091i;
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    i3Var = b4Var.a.a().f;
                    str = "No referrer defined in Install Referrer response";
                } else {
                    b4Var.a.a().f4096n.b("InstallReferrer API result", string);
                    Bundle f0 = b4Var.a.t().f0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (f0 == null) {
                        i3Var = b4Var.a.a().f;
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = f0.getString(AnimationStrength.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                i3Var = b4Var.a.a().f;
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                f0.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == b4Var.a.q().f4358k.a()) {
                            i3Var = b4Var.a.a().f4096n;
                            str = "Install Referrer campaign has already been logged";
                        } else {
                            i9.f3612i.a().a();
                            if (!b4Var.a.f4114g.r((String) null, x2.s0) || b4Var.a.j()) {
                                b4Var.a.q().f4358k.b(j2);
                                b4Var.a.a().f4096n.b("Logging Install Referrer campaign from sdk with ", "referrer API");
                                f0.putString("_cis", "referrer API");
                                b4Var.a.s().A("auto", "_cmp", f0);
                            }
                        }
                    }
                }
            }
            i3Var.a(str);
        }
        a b2 = a.b();
        Context context = b4Var.a.a;
        Objects.requireNonNull(b2);
        context.unbindService(serviceConnection);
    }
}
