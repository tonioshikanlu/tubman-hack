package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.s;
import b.l.f.x.a.h;
import b.m.a.d;
import b.m.a.r;
import java.util.ArrayList;
import java.util.List;

public class ViewfinderView extends View {
    public static final int[] s = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: h  reason: collision with root package name */
    public final Paint f7371h = new Paint(1);

    /* renamed from: i  reason: collision with root package name */
    public int f7372i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7373j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7374k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7375l;

    /* renamed from: m  reason: collision with root package name */
    public int f7376m;

    /* renamed from: n  reason: collision with root package name */
    public List<s> f7377n;

    /* renamed from: o  reason: collision with root package name */
    public List<s> f7378o;

    /* renamed from: p  reason: collision with root package name */
    public d f7379p;

    /* renamed from: q  reason: collision with root package name */
    public Rect f7380q;
    public r r;

    public class a implements d.e {
        public a() {
        }

        public void a() {
            ViewfinderView.this.a();
            ViewfinderView.this.invalidate();
        }

        public void b(Exception exc) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    static {
        Class<ViewfinderView> cls = ViewfinderView.class;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f5808b);
        this.f7372i = obtainStyledAttributes.getColor(3, resources.getColor(R.color.zxing_viewfinder_mask));
        this.f7373j = obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f7374k = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f7375l = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.f7376m = 0;
        this.f7377n = new ArrayList(20);
        this.f7378o = new ArrayList(20);
    }

    public void a() {
        d dVar = this.f7379p;
        if (dVar != null) {
            Rect framingRect = dVar.getFramingRect();
            r previewSize = this.f7379p.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f7380q = framingRect;
                this.r = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        r rVar;
        a();
        Rect rect = this.f7380q;
        if (rect != null && (rVar = this.r) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f7371h.setColor(this.f7372i);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f7371h);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f7371h);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f7371h);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f7371h);
            this.f7371h.setColor(this.f7374k);
            Paint paint = this.f7371h;
            int[] iArr = s;
            paint.setAlpha(iArr[this.f7376m]);
            this.f7376m = (this.f7376m + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f7371h);
            float width2 = ((float) getWidth()) / ((float) rVar.f5930h);
            float height3 = ((float) getHeight()) / ((float) rVar.f5931i);
            if (!this.f7378o.isEmpty()) {
                this.f7371h.setAlpha(80);
                this.f7371h.setColor(this.f7375l);
                for (s next : this.f7378o) {
                    canvas.drawCircle((float) ((int) (next.a * width2)), (float) ((int) (next.f5775b * height3)), 3.0f, this.f7371h);
                }
                this.f7378o.clear();
            }
            if (!this.f7377n.isEmpty()) {
                this.f7371h.setAlpha(160);
                this.f7371h.setColor(this.f7375l);
                for (s next2 : this.f7377n) {
                    canvas.drawCircle((float) ((int) (next2.a * width2)), (float) ((int) (next2.f5775b * height3)), 6.0f, this.f7371h);
                }
                List<s> list = this.f7377n;
                List<s> list2 = this.f7378o;
                this.f7377n = list2;
                this.f7378o = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(d dVar) {
        this.f7379p = dVar;
        dVar.f5902q.add(new a());
    }

    public void setMaskColor(int i2) {
        this.f7372i = i2;
    }
}
