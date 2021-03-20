package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;

public class HorizontalProgressWheelView extends View {

    /* renamed from: h  reason: collision with root package name */
    public final Rect f7435h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public a f7436i;

    /* renamed from: j  reason: collision with root package name */
    public float f7437j;

    /* renamed from: k  reason: collision with root package name */
    public Paint f7438k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f7439l;

    /* renamed from: m  reason: collision with root package name */
    public int f7440m = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);

    /* renamed from: n  reason: collision with root package name */
    public int f7441n = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);

    /* renamed from: o  reason: collision with root package name */
    public int f7442o = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);

    /* renamed from: p  reason: collision with root package name */
    public boolean f7443p;

    /* renamed from: q  reason: collision with root package name */
    public float f7444q;
    public int r = ContextCompat.getColor(getContext(), R.color.ucrop_color_widget_rotate_mid_line);

    public interface a {
        void a(float f, float f2);

        void b();

        void c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.f7438k = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f7438k.setStrokeWidth((float) this.f7440m);
        this.f7438k.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f7438k);
        this.f7439l = paint2;
        paint2.setColor(this.r);
        this.f7439l.setStrokeCap(Paint.Cap.ROUND);
        this.f7439l.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f7435h);
        int width = this.f7435h.width();
        int i2 = this.f7440m;
        int i3 = this.f7442o;
        int i4 = width / (i2 + i3);
        float f2 = this.f7444q % ((float) (i3 + i2));
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i4 / 4;
            if (i5 < i6) {
                paint = this.f7438k;
                f = (float) i5;
            } else if (i5 > (i4 * 3) / 4) {
                paint = this.f7438k;
                f = (float) (i4 - i5);
            } else {
                this.f7438k.setAlpha(255);
                float f3 = -f2;
                Rect rect = this.f7435h;
                float f4 = ((float) rect.left) + f3 + ((float) ((this.f7440m + this.f7442o) * i5));
                float centerY = ((float) rect.centerY()) - (((float) this.f7441n) / 4.0f);
                Rect rect2 = this.f7435h;
                Canvas canvas2 = canvas;
                canvas2.drawLine(f4, centerY, f3 + ((float) rect2.left) + ((float) ((this.f7440m + this.f7442o) * i5)), (((float) this.f7441n) / 4.0f) + ((float) rect2.centerY()), this.f7438k);
            }
            paint.setAlpha((int) ((f / ((float) i6)) * 255.0f));
            float f32 = -f2;
            Rect rect3 = this.f7435h;
            float f42 = ((float) rect3.left) + f32 + ((float) ((this.f7440m + this.f7442o) * i5));
            float centerY2 = ((float) rect3.centerY()) - (((float) this.f7441n) / 4.0f);
            Rect rect22 = this.f7435h;
            Canvas canvas22 = canvas;
            canvas22.drawLine(f42, centerY2, f32 + ((float) rect22.left) + ((float) ((this.f7440m + this.f7442o) * i5)), (((float) this.f7441n) / 4.0f) + ((float) rect22.centerY()), this.f7438k);
        }
        float centerX = (float) this.f7435h.centerX();
        float centerY3 = ((float) this.f7435h.centerY()) - (((float) this.f7441n) / 2.0f);
        Canvas canvas3 = canvas;
        float f5 = centerY3;
        canvas3.drawLine(centerX, f5, (float) this.f7435h.centerX(), (((float) this.f7441n) / 2.0f) + ((float) this.f7435h.centerY()), this.f7439l);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7437j = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f7436i;
            if (aVar != null) {
                this.f7443p = false;
                aVar.b();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f7437j;
            if (x != 0.0f) {
                if (!this.f7443p) {
                    this.f7443p = true;
                    a aVar2 = this.f7436i;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                this.f7444q -= x;
                postInvalidate();
                this.f7437j = motionEvent.getX();
                a aVar3 = this.f7436i;
                if (aVar3 != null) {
                    aVar3.a(-x, this.f7444q);
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i2) {
        this.r = i2;
        this.f7439l.setColor(i2);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f7436i = aVar;
    }
}
