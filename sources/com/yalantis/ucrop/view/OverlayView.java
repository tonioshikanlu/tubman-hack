package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.q.a.a;
import b.q.a.i.d;
import b.q.a.m.e;

public class OverlayView extends View {
    public float A = -1.0f;
    public float B = -1.0f;
    public int C = -1;
    public int D = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
    public int E = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
    public int F = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
    public d G;
    public boolean H;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f7416h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public final RectF f7417i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public int f7418j;

    /* renamed from: k  reason: collision with root package name */
    public int f7419k;

    /* renamed from: l  reason: collision with root package name */
    public float[] f7420l;

    /* renamed from: m  reason: collision with root package name */
    public int f7421m;

    /* renamed from: n  reason: collision with root package name */
    public int f7422n;

    /* renamed from: o  reason: collision with root package name */
    public float f7423o;

    /* renamed from: p  reason: collision with root package name */
    public float[] f7424p = null;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7425q;
    public boolean r;
    public boolean s;
    public int t;
    public Path u = new Path();
    public Paint v = new Paint(1);
    public Paint w = new Paint(1);
    public Paint x = new Paint(1);
    public Paint y = new Paint(1);
    public int z = 0;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a() {
        this.f7420l = a.F0(this.f7416h);
        a.B0(this.f7416h);
        this.f7424p = null;
        this.u.reset();
        this.u.addCircle(this.f7416h.centerX(), this.f7416h.centerY(), Math.min(this.f7416h.width(), this.f7416h.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f7416h;
    }

    public int getFreestyleCropMode() {
        return this.z;
    }

    public d getOverlayViewChangeListener() {
        return this.G;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.s) {
            canvas.clipPath(this.u, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f7416h, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.t);
        canvas.restore();
        if (this.s) {
            canvas.drawCircle(this.f7416h.centerX(), this.f7416h.centerY(), Math.min(this.f7416h.width(), this.f7416h.height()) / 2.0f, this.v);
        }
        if (this.r) {
            if (this.f7424p == null && !this.f7416h.isEmpty()) {
                this.f7424p = new float[((this.f7422n * 4) + (this.f7421m * 4))];
                int i2 = 0;
                for (int i3 = 0; i3 < this.f7421m; i3++) {
                    float[] fArr = this.f7424p;
                    int i4 = i2 + 1;
                    RectF rectF = this.f7416h;
                    fArr[i2] = rectF.left;
                    int i5 = i4 + 1;
                    float f = ((float) i3) + 1.0f;
                    float height = (f / ((float) (this.f7421m + 1))) * rectF.height();
                    RectF rectF2 = this.f7416h;
                    fArr[i4] = height + rectF2.top;
                    float[] fArr2 = this.f7424p;
                    int i6 = i5 + 1;
                    fArr2[i5] = rectF2.right;
                    i2 = i6 + 1;
                    fArr2[i6] = ((f / ((float) (this.f7421m + 1))) * rectF2.height()) + this.f7416h.top;
                }
                for (int i7 = 0; i7 < this.f7422n; i7++) {
                    float[] fArr3 = this.f7424p;
                    int i8 = i2 + 1;
                    float f2 = ((float) i7) + 1.0f;
                    float width = (f2 / ((float) (this.f7422n + 1))) * this.f7416h.width();
                    RectF rectF3 = this.f7416h;
                    fArr3[i2] = width + rectF3.left;
                    float[] fArr4 = this.f7424p;
                    int i9 = i8 + 1;
                    fArr4[i8] = rectF3.top;
                    int i10 = i9 + 1;
                    float width2 = (f2 / ((float) (this.f7422n + 1))) * rectF3.width();
                    RectF rectF4 = this.f7416h;
                    fArr4[i9] = width2 + rectF4.left;
                    i2 = i10 + 1;
                    this.f7424p[i10] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f7424p;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.w);
            }
        }
        if (this.f7425q) {
            canvas.drawRect(this.f7416h, this.x);
        }
        if (this.z != 0) {
            canvas.save();
            this.f7417i.set(this.f7416h);
            RectF rectF5 = this.f7417i;
            int i11 = this.F;
            rectF5.inset((float) i11, (float) (-i11));
            canvas.clipRect(this.f7417i, Region.Op.DIFFERENCE);
            this.f7417i.set(this.f7416h);
            RectF rectF6 = this.f7417i;
            int i12 = this.F;
            rectF6.inset((float) (-i12), (float) i12);
            canvas.clipRect(this.f7417i, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f7416h, this.y);
            canvas.restore();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f7418j = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f7419k = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.H) {
                this.H = false;
                setTargetAspectRatio(this.f7423o);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019f, code lost:
        if (r16 == false) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            android.graphics.RectF r1 = r0.f7416h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01cd
            int r1 = r0.z
            if (r1 != 0) goto L_0x0010
            goto L_0x01cd
        L_0x0010:
            float r1 = r19.getX()
            float r3 = r19.getY()
            int r4 = r19.getAction()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = -1
            r8 = 1
            if (r4 != 0) goto L_0x0081
            int r4 = r0.D
            double r9 = (double) r4
            r11 = r5
            r4 = 0
        L_0x0027:
            r12 = 8
            if (r4 >= r12) goto L_0x0054
            float[] r12 = r0.f7420l
            r12 = r12[r4]
            float r12 = r1 - r12
            double r12 = (double) r12
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = java.lang.Math.pow(r12, r14)
            float[] r2 = r0.f7420l
            int r17 = r4 + 1
            r2 = r2[r17]
            float r2 = r3 - r2
            double r6 = (double) r2
            double r6 = java.lang.Math.pow(r6, r14)
            double r6 = r6 + r12
            double r6 = java.lang.Math.sqrt(r6)
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0051
            int r11 = r4 / 2
            r9 = r6
        L_0x0051:
            int r4 = r4 + 2
            goto L_0x0027
        L_0x0054:
            int r2 = r0.z
            if (r2 != r8) goto L_0x0064
            if (r11 >= 0) goto L_0x0064
            android.graphics.RectF r2 = r0.f7416h
            boolean r2 = r2.contains(r1, r3)
            if (r2 == 0) goto L_0x0064
            r6 = 4
            goto L_0x0065
        L_0x0064:
            r6 = r11
        L_0x0065:
            r0.C = r6
            if (r6 == r5) goto L_0x006b
            r2 = r8
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x0075
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.A = r4
            r0.B = r4
            goto L_0x0080
        L_0x0075:
            float r4 = r0.A
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            r0.A = r1
            r0.B = r3
        L_0x0080:
            return r2
        L_0x0081:
            int r2 = r19.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = 2
            if (r2 != r4) goto L_0x01ac
            int r2 = r19.getPointerCount()
            if (r2 != r8) goto L_0x01ac
            int r2 = r0.C
            if (r2 == r5) goto L_0x01ac
            int r2 = r18.getPaddingLeft()
            float r2 = (float) r2
            float r1 = java.lang.Math.max(r1, r2)
            int r2 = r18.getWidth()
            int r5 = r18.getPaddingRight()
            int r2 = r2 - r5
            float r2 = (float) r2
            float r1 = java.lang.Math.min(r1, r2)
            int r2 = r18.getPaddingTop()
            float r2 = (float) r2
            float r2 = java.lang.Math.max(r3, r2)
            int r3 = r18.getHeight()
            int r5 = r18.getPaddingBottom()
            int r3 = r3 - r5
            float r3 = (float) r3
            float r2 = java.lang.Math.min(r2, r3)
            android.graphics.RectF r3 = r0.f7417i
            android.graphics.RectF r5 = r0.f7416h
            r3.set(r5)
            int r3 = r0.C
            if (r3 == 0) goto L_0x0147
            if (r3 == r8) goto L_0x013b
            if (r3 == r4) goto L_0x012f
            r4 = 3
            if (r3 == r4) goto L_0x0123
            r4 = 4
            if (r3 == r4) goto L_0x00d9
            goto L_0x0152
        L_0x00d9:
            android.graphics.RectF r3 = r0.f7417i
            float r4 = r0.A
            float r4 = r1 - r4
            float r5 = r0.B
            float r5 = r2 - r5
            r3.offset(r4, r5)
            android.graphics.RectF r3 = r0.f7417i
            float r3 = r3.left
            int r4 = r18.getLeft()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f7417i
            float r3 = r3.top
            int r4 = r18.getTop()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f7417i
            float r3 = r3.right
            int r4 = r18.getRight()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f7417i
            float r3 = r3.bottom
            int r4 = r18.getBottom()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
            android.graphics.RectF r3 = r0.f7416h
            android.graphics.RectF r4 = r0.f7417i
            r3.set(r4)
            goto L_0x01a1
        L_0x0123:
            android.graphics.RectF r3 = r0.f7417i
            android.graphics.RectF r4 = r0.f7416h
            float r5 = r4.top
            float r4 = r4.right
            r3.set(r1, r5, r4, r2)
            goto L_0x0152
        L_0x012f:
            android.graphics.RectF r3 = r0.f7417i
            android.graphics.RectF r4 = r0.f7416h
            float r5 = r4.left
            float r4 = r4.top
            r3.set(r5, r4, r1, r2)
            goto L_0x0152
        L_0x013b:
            android.graphics.RectF r3 = r0.f7417i
            android.graphics.RectF r4 = r0.f7416h
            float r5 = r4.left
            float r4 = r4.bottom
            r3.set(r5, r2, r1, r4)
            goto L_0x0152
        L_0x0147:
            android.graphics.RectF r3 = r0.f7417i
            android.graphics.RectF r4 = r0.f7416h
            float r5 = r4.right
            float r4 = r4.bottom
            r3.set(r1, r2, r5, r4)
        L_0x0152:
            android.graphics.RectF r3 = r0.f7417i
            float r3 = r3.height()
            int r4 = r0.E
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0161
            r3 = r8
            goto L_0x0162
        L_0x0161:
            r3 = 0
        L_0x0162:
            android.graphics.RectF r4 = r0.f7417i
            float r4 = r4.width()
            int r5 = r0.E
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0172
            r16 = r8
            goto L_0x0174
        L_0x0172:
            r16 = 0
        L_0x0174:
            android.graphics.RectF r4 = r0.f7416h
            if (r16 == 0) goto L_0x017d
            android.graphics.RectF r5 = r0.f7417i
            float r5 = r5.left
            goto L_0x017f
        L_0x017d:
            float r5 = r4.left
        L_0x017f:
            if (r3 == 0) goto L_0x0186
            android.graphics.RectF r6 = r0.f7417i
            float r6 = r6.top
            goto L_0x0188
        L_0x0186:
            float r6 = r4.top
        L_0x0188:
            if (r16 == 0) goto L_0x018f
            android.graphics.RectF r7 = r0.f7417i
            float r7 = r7.right
            goto L_0x0191
        L_0x018f:
            float r7 = r4.right
        L_0x0191:
            if (r3 == 0) goto L_0x0198
            android.graphics.RectF r9 = r0.f7417i
            float r9 = r9.bottom
            goto L_0x019a
        L_0x0198:
            float r9 = r4.bottom
        L_0x019a:
            r4.set(r5, r6, r7, r9)
            if (r3 != 0) goto L_0x01a1
            if (r16 == 0) goto L_0x01a7
        L_0x01a1:
            r18.a()
            r18.postInvalidate()
        L_0x01a7:
            r0.A = r1
            r0.B = r2
            return r8
        L_0x01ac:
            int r1 = r19.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r8) goto L_0x01cb
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.A = r1
            r0.B = r1
            r0.C = r5
            b.q.a.i.d r1 = r0.G
            if (r1 == 0) goto L_0x01cb
            android.graphics.RectF r2 = r0.f7416h
            b.q.a.m.e r1 = (b.q.a.m.e) r1
            com.yalantis.ucrop.view.UCropView r1 = r1.a
            com.yalantis.ucrop.view.GestureCropImageView r1 = r1.f7426h
            r1.setCropRect(r2)
        L_0x01cb:
            r1 = 0
            return r1
        L_0x01cd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.view.OverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z2) {
        this.s = z2;
    }

    public void setCropFrameColor(@ColorInt int i2) {
        this.x.setColor(i2);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i2) {
        this.x.setStrokeWidth((float) i2);
    }

    public void setCropGridColor(@ColorInt int i2) {
        this.w.setColor(i2);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i2) {
        this.f7422n = i2;
        this.f7424p = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i2) {
        this.f7421m = i2;
        this.f7424p = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i2) {
        this.w.setStrokeWidth((float) i2);
    }

    public void setDimmedColor(@ColorInt int i2) {
        this.t = i2;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z2) {
        this.z = z2 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i2) {
        this.z = i2;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.G = dVar;
    }

    public void setShowCropFrame(boolean z2) {
        this.f7425q = z2;
    }

    public void setShowCropGrid(boolean z2) {
        this.r = z2;
    }

    public void setTargetAspectRatio(float f) {
        this.f7423o = f;
        int i2 = this.f7418j;
        if (i2 > 0) {
            int i3 = (int) (((float) i2) / f);
            int i4 = this.f7419k;
            if (i3 > i4) {
                int i5 = (int) (((float) i4) * f);
                int i6 = (i2 - i5) / 2;
                this.f7416h.set((float) (getPaddingLeft() + i6), (float) getPaddingTop(), (float) (getPaddingLeft() + i5 + i6), (float) (getPaddingTop() + this.f7419k));
            } else {
                int i7 = (i4 - i3) / 2;
                this.f7416h.set((float) getPaddingLeft(), (float) (getPaddingTop() + i7), (float) (getPaddingLeft() + this.f7418j), (float) (getPaddingTop() + i3 + i7));
            }
            d dVar = this.G;
            if (dVar != null) {
                ((e) dVar).a.f7426h.setCropRect(this.f7416h);
            }
            a();
            postInvalidate();
            return;
        }
        this.H = true;
    }
}
