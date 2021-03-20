package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.m.a.a;
import b.m.a.f;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.Objects;

public class CaptureActivity extends Activity {

    /* renamed from: h  reason: collision with root package name */
    public f f7364h;

    /* renamed from: i  reason: collision with root package name */
    public DecoratedBarcodeView f7365i;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f7365i = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        f fVar = new f(this, this.f7365i);
        this.f7364h = fVar;
        fVar.c(getIntent(), bundle);
        f fVar2 = this.f7364h;
        DecoratedBarcodeView decoratedBarcodeView = fVar2.f5905b;
        a aVar = fVar2.f5910j;
        BarcodeView barcodeView = decoratedBarcodeView.f7366h;
        DecoratedBarcodeView.b bVar = new DecoratedBarcodeView.b(aVar);
        barcodeView.I = BarcodeView.b.SINGLE;
        barcodeView.J = bVar;
        barcodeView.j();
    }

    public void onDestroy() {
        super.onDestroy();
        f fVar = this.f7364h;
        fVar.f5906e = true;
        fVar.f.a();
        fVar.f5908h.removeCallbacksAndMessages((Object) null);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.f7365i.onKeyDown(i2, keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f7364h.d();
    }

    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        f fVar = this.f7364h;
        Objects.requireNonNull(fVar);
        if (i2 != 250) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            fVar.b();
        } else {
            fVar.f5905b.f7366h.f();
        }
    }

    public void onResume() {
        super.onResume();
        this.f7364h.e();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f7364h.c);
    }
}
