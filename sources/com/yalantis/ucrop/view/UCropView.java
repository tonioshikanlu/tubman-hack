package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.q.a.b;
import b.q.a.m.d;
import b.q.a.m.e;
import java.util.Objects;

public class UCropView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public GestureCropImageView f7426h = ((GestureCropImageView) findViewById(R.id.image_view_crop));

    /* renamed from: i  reason: collision with root package name */
    public final OverlayView f7427i;

    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, this, true);
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.f7427i = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f6783b);
        Objects.requireNonNull(overlayView);
        overlayView.s = obtainStyledAttributes.getBoolean(2, false);
        int color = obtainStyledAttributes.getColor(3, overlayView.getResources().getColor(R.color.ucrop_color_default_dimmed));
        overlayView.t = color;
        overlayView.v.setColor(color);
        overlayView.v.setStyle(Paint.Style.STROKE);
        overlayView.v.setStrokeWidth(1.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color2 = obtainStyledAttributes.getColor(4, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_frame));
        overlayView.x.setStrokeWidth((float) dimensionPixelSize);
        overlayView.x.setColor(color2);
        overlayView.x.setStyle(Paint.Style.STROKE);
        overlayView.y.setStrokeWidth((float) (dimensionPixelSize * 3));
        overlayView.y.setColor(color2);
        overlayView.y.setStyle(Paint.Style.STROKE);
        overlayView.f7425q = obtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color3 = obtainStyledAttributes.getColor(6, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_grid));
        overlayView.w.setStrokeWidth((float) dimensionPixelSize2);
        overlayView.w.setColor(color3);
        overlayView.f7421m = obtainStyledAttributes.getInt(8, 2);
        overlayView.f7422n = obtainStyledAttributes.getInt(7, 2);
        overlayView.r = obtainStyledAttributes.getBoolean(11, true);
        GestureCropImageView gestureCropImageView = this.f7426h;
        Objects.requireNonNull(gestureCropImageView);
        float abs = Math.abs(obtainStyledAttributes.getFloat(0, 0.0f));
        float abs2 = Math.abs(obtainStyledAttributes.getFloat(1, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            gestureCropImageView.y = 0.0f;
        } else {
            gestureCropImageView.y = abs / abs2;
        }
        obtainStyledAttributes.recycle();
        this.f7426h.setCropBoundsChangeListener(new d(this));
        overlayView.setOverlayViewChangeListener(new e(this));
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f7426h;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f7427i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
