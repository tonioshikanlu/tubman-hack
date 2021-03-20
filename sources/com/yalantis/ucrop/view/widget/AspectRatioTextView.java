package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.q.a.b;
import b.q.a.j.a;
import java.util.Locale;

public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: h  reason: collision with root package name */
    public final Rect f7428h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public Paint f7429i;

    /* renamed from: j  reason: collision with root package name */
    public int f7430j;

    /* renamed from: k  reason: collision with root package name */
    public float f7431k;

    /* renamed from: l  reason: collision with root package name */
    public String f7432l;

    /* renamed from: m  reason: collision with root package name */
    public float f7433m;

    /* renamed from: n  reason: collision with root package name */
    public float f7434n;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
        setGravity(1);
        this.f7432l = obtainStyledAttributes.getString(0);
        this.f7433m = obtainStyledAttributes.getFloat(1, 0.0f);
        float f = obtainStyledAttributes.getFloat(2, 0.0f);
        this.f7434n = f;
        float f2 = this.f7433m;
        if (f2 == 0.0f || f == 0.0f) {
            this.f7431k = 0.0f;
        } else {
            this.f7431k = f2 / f;
        }
        this.f7430j = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f7429i = paint;
        paint.setStyle(Paint.Style.FILL);
        b();
        a(getResources().getColor(R.color.ucrop_color_widget_active));
        obtainStyledAttributes.recycle();
    }

    public final void a(@ColorInt int i2) {
        Paint paint = this.f7429i;
        if (paint != null) {
            paint.setColor(i2);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i2, ContextCompat.getColor(getContext(), R.color.ucrop_color_widget)}));
    }

    public final void b() {
        String str;
        if (!TextUtils.isEmpty(this.f7432l)) {
            str = this.f7432l;
        } else {
            str = String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f7433m), Integer.valueOf((int) this.f7434n)});
        }
        setText(str);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f7428h);
            Rect rect = this.f7428h;
            float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i2 = this.f7430j;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i2) * 1.5f), ((float) i2) / 2.0f, this.f7429i);
        }
    }

    public void setActiveColor(@ColorInt int i2) {
        a(i2);
        invalidate();
    }

    public void setAspectRatio(@NonNull a aVar) {
        this.f7432l = aVar.f6787h;
        float f = aVar.f6788i;
        this.f7433m = f;
        float f2 = aVar.f6789j;
        this.f7434n = f2;
        if (f == 0.0f || f2 == 0.0f) {
            this.f7431k = 0.0f;
        } else {
            this.f7431k = f / f2;
        }
        b();
    }
}
