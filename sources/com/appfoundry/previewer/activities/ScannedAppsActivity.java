package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.e.a;
import b.a.a.g.n0;
import b.a.a.m.b;
import b.a.a.n.f;
import b.f.a.e;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.segment.analytics.Analytics;
import com.segment.analytics.Options;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/appfoundry/previewer/activities/ScannedAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "Lb/a/a/g/n0;", "event", "onShowQrEvent", "(Lb/a/a/g/n0;)V", "Lb/a/a/g/e;", "onPageCloseEvent", "(Lb/a/a/g/e;)V", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ScannedAppsActivity extends AppCompatActivity {
    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        List<Container> list;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_with_container);
        e.A0(this);
        e.f0(this);
        Page q2 = f.q("page-scanned-apps");
        if (q2 != null) {
            Container container = null;
            e.t0(this, b.a.a.h.e.f(q2, (Boolean) null, 1), R.id.container);
            List<Container> list2 = q2.f;
            if (!(list2 == null || !(!list2.isEmpty()) || (list = q2.f) == null)) {
                container = list.get(0);
            }
            if (container != null) {
                b bVar = b.f349m;
                b.c.d(container);
                q2.f = new ArrayList();
            }
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(b.a.a.g.e eVar) {
        i.e(eVar, "event");
        finish();
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onShowQrEvent(n0 n0Var) {
        i.e(n0Var, "event");
        a aVar = a.f235b;
        Analytics.with(e.c()).track("Show QR", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", a.c(), "app_url", n0Var.a, "app_name", n0Var.f243b), new Options().setIntegration("Slack", false));
        Bundle bundle = new Bundle();
        bundle.putString("qrCodeUrl", n0Var.a);
        bundle.putString("appName", n0Var.f243b);
        Intent intent = new Intent(this, QrCodeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onStart() {
        super.onStart();
        e.r0(this);
    }
}
