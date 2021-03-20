package com.appfoundry.previewer.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.f.a.e;
import b.m.a.a;
import b.m.a.f;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import e.x.c.i;
import java.util.HashMap;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\bJ-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/appfoundry/previewer/activities/QrScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "onDestroy", "outState", "onSaveInstanceState", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onBackPressed", "onStart", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lb/a/a/g/e;", "onPageCloseEvent", "(Lb/a/a/g/e;)V", "Lb/m/a/f;", "h", "Lb/m/a/f;", "capture", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class QrScannerActivity extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public f f7042h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap f7043i;

    public View a(int i2) {
        if (this.f7043i == null) {
            this.f7043i = new HashMap();
        }
        View view = (View) this.f7043i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7043i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_qr_scanner);
        e.A0(this);
        e.f0(this);
        f fVar = new f(this, (DecoratedBarcodeView) a(R.id.zxing_barcode_scanner));
        this.f7042h = fVar;
        fVar.c(getIntent(), bundle);
        f fVar2 = this.f7042h;
        if (fVar2 != null) {
            DecoratedBarcodeView decoratedBarcodeView = fVar2.f5905b;
            a aVar = fVar2.f5910j;
            BarcodeView barcodeView = decoratedBarcodeView.f7366h;
            DecoratedBarcodeView.b bVar = new DecoratedBarcodeView.b(aVar);
            barcodeView.I = BarcodeView.b.SINGLE;
            barcodeView.J = bVar;
            barcodeView.j();
            return;
        }
        i.m("capture");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        f fVar = this.f7042h;
        if (fVar != null) {
            fVar.f5906e = true;
            fVar.f.a();
            fVar.f5908h.removeCallbacksAndMessages((Object) null);
            e.L0(this);
            return;
        }
        i.m("capture");
        throw null;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        i.e(keyEvent, "event");
        return ((DecoratedBarcodeView) a(R.id.zxing_barcode_scanner)).onKeyDown(i2, keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(b.a.a.g.e eVar) {
        i.e(eVar, "event");
        finish();
    }

    public void onPause() {
        super.onPause();
        f fVar = this.f7042h;
        if (fVar != null) {
            fVar.d();
        } else {
            i.m("capture");
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        i.e(strArr, "permissions");
        i.e(iArr, "grantResults");
        if (!(!(iArr.length == 0)) || iArr[0] != 0) {
            if (!shouldShowRequestPermissionRationale(strArr[0])) {
                SharedPreferences sharedPreferences = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                i.e("user_disabled_ask_for_camera_permission", "key");
                sharedPreferences.edit().putBoolean("user_disabled_ask_for_camera_permission", true).apply();
            } else {
                q.a.a.d.a("JUST DENIED", new Object[0]);
            }
            finish();
            return;
        }
        q.a.a.d.a("ACCEPTED", new Object[0]);
    }

    public void onResume() {
        super.onResume();
        f fVar = this.f7042h;
        if (fVar != null) {
            fVar.e();
        } else {
            i.m("capture");
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        f fVar = this.f7042h;
        if (fVar != null) {
            bundle.putInt("SAVED_ORIENTATION_LOCK", fVar.c);
        } else {
            i.m("capture");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        e.r0(this);
    }
}
