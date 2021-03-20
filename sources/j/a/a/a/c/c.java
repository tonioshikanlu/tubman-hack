package j.a.a.a.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.view.View;
import android.view.ViewGroup;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import j.a.a.a.e.a;
import java.util.Objects;

public class c extends a {
    public c(Context context, String str) {
        super(context, str);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        View inflate = this.f8058e.inflate(R.layout.view_pdf_page, viewGroup, false);
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) inflate.findViewById(R.id.subsamplingImageView);
        if (this.c != null && getCount() >= i2) {
            PdfRenderer.Page openPage = this.c.openPage(i2);
            e eVar = (e) this.d;
            int i3 = i2 % eVar.f8062b;
            if (eVar.a[i3] == null) {
                eVar.a[i3] = Bitmap.createBitmap(eVar.c, eVar.d, eVar.f8063e);
            }
            eVar.a[i3].eraseColor(0);
            Bitmap bitmap = eVar.a[i3];
            Objects.requireNonNull(bitmap, "Bitmap must not be null");
            subsamplingScaleImageView.setImage(new a(bitmap, false));
            openPage.render(bitmap, (Rect) null, (Matrix) null, 1);
            openPage.close();
            viewGroup.addView(inflate, 0);
        }
        return inflate;
    }
}
