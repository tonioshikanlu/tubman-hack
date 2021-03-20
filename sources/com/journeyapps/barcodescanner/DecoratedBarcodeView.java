package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.s;
import b.l.f.x.a.h;
import b.m.a.t.f;
import java.util.List;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public BarcodeView f7366h;

    /* renamed from: i  reason: collision with root package name */
    public ViewfinderView f7367i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f7368j;

    /* renamed from: k  reason: collision with root package name */
    public a f7369k;

    public interface a {
        void a();

        void b();
    }

    public class b implements b.m.a.a {
        public b.m.a.a a;

        public b(b.m.a.a aVar) {
            this.a = aVar;
        }

        public void a(b.m.a.b bVar) {
            this.a.a(bVar);
        }

        public void b(List<s> list) {
            for (s next : list) {
                ViewfinderView viewfinderView = DecoratedBarcodeView.this.f7367i;
                if (viewfinderView.f7377n.size() < 20) {
                    viewfinderView.f7377n.add(next);
                }
            }
            this.a.b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f7366h = barcodeView;
        if (barcodeView != null) {
            barcodeView.c(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.f7367i = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f7366h);
                this.f7368j = (TextView) findViewById(R.id.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public f getCameraSettings() {
        return this.f7366h.getCameraSettings();
    }

    public b.m.a.h getDecoderFactory() {
        return this.f7366h.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f7368j;
    }

    public ViewfinderView getViewFinder() {
        return this.f7367i;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 24) {
            this.f7366h.setTorch(true);
            a aVar = this.f7369k;
            if (aVar != null) {
                aVar.b();
            }
            return true;
        } else if (i2 == 25) {
            this.f7366h.setTorch(false);
            a aVar2 = this.f7369k;
            if (aVar2 != null) {
                aVar2.a();
            }
            return true;
        } else if (i2 == 27 || i2 == 80) {
            return true;
        } else {
            return super.onKeyDown(i2, keyEvent);
        }
    }

    public void setCameraSettings(f fVar) {
        this.f7366h.setCameraSettings(fVar);
    }

    public void setDecoderFactory(b.m.a.h hVar) {
        this.f7366h.setDecoderFactory(hVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f7368j;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.f7369k = aVar;
    }
}
