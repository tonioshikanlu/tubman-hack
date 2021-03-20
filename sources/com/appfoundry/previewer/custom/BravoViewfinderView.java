package com.appfoundry.previewer.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.s;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/appfoundry/previewer/custom/BravoViewfinderView;", "Lcom/journeyapps/barcodescanner/ViewfinderView;", "Landroid/graphics/Canvas;", "canvas", "Le/r;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class BravoViewfinderView extends ViewfinderView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BravoViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, BasePayload.CONTEXT_KEY);
    }

    public void onDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        a();
        Rect rect = this.f7380q;
        if (rect != null && this.r != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Paint paint = this.f7371h;
            i.d(paint, "paint");
            paint.setColor(ContextCompat.getColor(getContext(), R.color.previewer_qr_background));
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f7371h);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f7371h);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f7371h);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f7371h);
            i.d(rect, "frame");
            Paint paint2 = this.f7371h;
            i.d(paint2, "paint");
            paint2.setColor(this.f7374k);
            Paint paint3 = this.f7371h;
            i.d(paint3, "paint");
            int[] iArr = ViewfinderView.s;
            paint3.setAlpha(iArr[this.f7376m]);
            this.f7376m = (this.f7376m + 1) % iArr.length;
            float width2 = ((float) rect.width()) / ((float) this.r.f5930h);
            float height2 = ((float) rect.height()) / ((float) this.r.f5931i);
            int i2 = rect.left;
            int i3 = rect.top;
            List<s> list = this.f7378o;
            i.d(list, "lastPossibleResultPoints");
            if (!list.isEmpty()) {
                Paint paint4 = this.f7371h;
                i.d(paint4, "paint");
                paint4.setAlpha(80);
                Paint paint5 = this.f7371h;
                i.d(paint5, "paint");
                paint5.setColor(this.f7375l);
                for (s next : this.f7378o) {
                    i.d(next, "point");
                    canvas.drawCircle((float) (((int) (next.a * width2)) + i2), (float) (((int) (next.f5775b * height2)) + i3), 3.0f, this.f7371h);
                }
                this.f7378o.clear();
            }
            List<s> list2 = this.f7377n;
            i.d(list2, "possibleResultPoints");
            if (!list2.isEmpty()) {
                Paint paint6 = this.f7371h;
                i.d(paint6, "paint");
                paint6.setAlpha(160);
                Paint paint7 = this.f7371h;
                i.d(paint7, "paint");
                paint7.setColor(this.f7375l);
                for (s next2 : this.f7377n) {
                    i.d(next2, "point");
                    canvas.drawCircle((float) (((int) (next2.a * width2)) + i2), (float) (((int) (next2.f5775b * height2)) + i3), (float) 6, this.f7371h);
                }
                List<s> list3 = this.f7377n;
                List<s> list4 = this.f7378o;
                this.f7377n = list4;
                this.f7378o = list3;
                list4.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }
}
