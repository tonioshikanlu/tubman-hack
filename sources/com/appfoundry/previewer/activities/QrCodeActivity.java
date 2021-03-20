package com.appfoundry.previewer.activities;

import androidx.appcompat.app.AppCompatActivity;
import b.a.a.g.e;
import e.x.c.i;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/appfoundry/previewer/activities/QrCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "Lb/a/a/g/e;", "event", "onPageCloseEvent", "(Lb/a/a/g/e;)V", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class QrCodeActivity extends AppCompatActivity {
    public void onBackPressed() {
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = r0.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131427361(0x7f0b0021, float:1.8476336E38)
            r6.setContentView((int) r7)
            b.f.a.e.A0(r6)
            b.f.a.e.f0(r6)
            java.lang.String r7 = "page-qr"
            com.appfoundry.previewer.model.Page r7 = b.a.a.n.f.q(r7)
            if (r7 == 0) goto L_0x009c
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r7.f
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            if (r0 == 0) goto L_0x002c
            java.lang.String r3 = "scanned-qr"
            com.appfoundry.previewer.model.Component r0 = b.a.a.h.e.k(r0, r3)
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            java.lang.String r3 = "intent"
            if (r0 == 0) goto L_0x0048
            android.content.Intent r4 = r6.getIntent()
            e.x.c.i.d(r4, r3)
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x0045
            java.lang.String r5 = "qrCodeUrl"
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0046
        L_0x0045:
            r4 = r2
        L_0x0046:
            r0.f7085g = r4
        L_0x0048:
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = "componennt:qr"
            r0.f7083b = r4
        L_0x004e:
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r7.f
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = "scanned-title"
            com.appfoundry.previewer.model.Component r0 = b.a.a.h.e.k(r0, r1)
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r0 == 0) goto L_0x0091
            android.content.Intent r1 = r6.getIntent()
            e.x.c.i.d(r1, r3)
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x007a
            java.lang.String r3 = "appName"
            java.lang.String r1 = r1.getString(r3)
            if (r1 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            java.lang.String r1 = ""
        L_0x007c:
            java.lang.String r3 = "intent.extras?.getString(BundleKeys.APP_NAME)?:\"\""
            e.x.c.i.d(r1, r3)
            java.lang.String r3 = "$this$setText"
            e.x.c.i.e(r0, r3)
            java.lang.String r3 = "updatedText"
            e.x.c.i.e(r1, r3)
            com.appfoundry.previewer.model.Text r0 = r0.c
            if (r0 == 0) goto L_0x0091
            r0.a = r1
        L_0x0091:
            r0 = 1
            b.a.a.a.b r7 = b.a.a.h.e.f(r7, r2, r0)
            r0 = 2131230858(0x7f08008a, float:1.807778E38)
            b.f.a.e.t0(r6, r7, r0)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.QrCodeActivity.onCreate(android.os.Bundle):void");
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(e eVar) {
        i.e(eVar, "event");
        finish();
    }

    public void onStart() {
        super.onStart();
        b.f.a.e.r0(this);
    }
}
