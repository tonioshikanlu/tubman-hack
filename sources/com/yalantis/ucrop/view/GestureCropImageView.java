package com.yalantis.ucrop.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import b.q.a.l.c;
import b.q.a.m.a;
import java.util.Objects;

public class GestureCropImageView extends b.q.a.m.a {
    public ScaleGestureDetector I;
    public b.q.a.l.c J;
    public GestureDetector K;
    public float L;
    public float M;
    public boolean N = true;
    public boolean O = true;
    public int P = 5;

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b(a aVar) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                doubleTapTargetScale = gestureCropImageView.getMaxScale();
            }
            float currentScale = gestureCropImageView.getCurrentScale();
            a.b bVar = new a.b(gestureCropImageView, 200, currentScale, doubleTapTargetScale - currentScale, x, y);
            gestureCropImageView.C = bVar;
            gestureCropImageView.post(bVar);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.g(-f, -f2);
            return true;
        }
    }

    public class c extends c.b {
        public c(a aVar) {
        }
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d(a aVar) {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            GestureCropImageView gestureCropImageView2 = GestureCropImageView.this;
            gestureCropImageView.f(scaleFactor, gestureCropImageView2.L, gestureCropImageView2.M);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void c() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.K = new GestureDetector(getContext(), new b((a) null), (Handler) null, true);
        this.I = new ScaleGestureDetector(getContext(), new d((a) null));
        this.J = new b.q.a.l.c(new c((a) null));
    }

    public int getDoubleTapScaleSteps() {
        return this.P;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.P))));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if ((motionEvent.getAction() & 255) == 0) {
            i();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.L = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.M = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.K.onTouchEvent(motionEvent);
        if (this.O) {
            this.I.onTouchEvent(motionEvent);
        }
        if (this.N) {
            b.q.a.l.c cVar = this.J;
            Objects.requireNonNull(cVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                cVar.c = motionEvent.getX();
                cVar.d = motionEvent.getY();
                cVar.f6815e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
            } else if (actionMasked == 1) {
                cVar.f6815e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    cVar.a = motionEvent.getX();
                    cVar.f6814b = motionEvent.getY();
                    cVar.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    cVar.f = -1;
                }
            } else if (!(cVar.f6815e == -1 || cVar.f == -1 || motionEvent.getPointerCount() <= cVar.f)) {
                float x = motionEvent.getX(cVar.f6815e);
                float y = motionEvent.getY(cVar.f6815e);
                float x2 = motionEvent.getX(cVar.f);
                float y2 = motionEvent.getY(cVar.f);
                if (cVar.f6817h) {
                    cVar.f6816g = 0.0f;
                    cVar.f6817h = false;
                } else {
                    float f2 = cVar.a;
                    float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (cVar.f6814b - cVar.d), (double) (f2 - cVar.c))))) % 360.0f);
                    cVar.f6816g = degrees;
                    if (degrees < -180.0f) {
                        f = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        f = degrees - 360.0f;
                    }
                    cVar.f6816g = f;
                }
                c.a aVar = cVar.f6818i;
                if (aVar != null) {
                    GestureCropImageView gestureCropImageView = GestureCropImageView.this;
                    gestureCropImageView.e(cVar.f6816g, gestureCropImageView.L, gestureCropImageView.M);
                }
                cVar.a = x2;
                cVar.f6814b = y2;
                cVar.c = x;
                cVar.d = y;
            }
            cVar.f6816g = 0.0f;
            cVar.f6817h = true;
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i2) {
        this.P = i2;
    }

    public void setRotateEnabled(boolean z) {
        this.N = z;
    }

    public void setScaleEnabled(boolean z) {
        this.O = z;
    }
}
