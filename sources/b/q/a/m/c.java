package b.q.a.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.yalantis.ucrop.UCropActivity;

public class c extends AppCompatImageView {

    /* renamed from: h  reason: collision with root package name */
    public final float[] f6837h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f6838i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f6839j;

    /* renamed from: k  reason: collision with root package name */
    public Matrix f6840k;

    /* renamed from: l  reason: collision with root package name */
    public int f6841l;

    /* renamed from: m  reason: collision with root package name */
    public int f6842m;

    /* renamed from: n  reason: collision with root package name */
    public a f6843n;

    /* renamed from: o  reason: collision with root package name */
    public float[] f6844o;

    /* renamed from: p  reason: collision with root package name */
    public float[] f6845p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6846q;
    public boolean r;
    public int s;
    public String t;
    public String u;
    public b.q.a.j.c v;

    public interface a {
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6837h = new float[8];
        this.f6838i = new float[2];
        this.f6839j = new float[9];
        this.f6840k = new Matrix();
        this.f6846q = false;
        this.r = false;
        this.s = 0;
        c();
    }

    public float a(@NonNull Matrix matrix) {
        matrix.getValues(this.f6839j);
        float[] fArr = this.f6839j;
        matrix.getValues(fArr);
        return (float) (-(Math.atan2((double) fArr[1], (double) this.f6839j[0]) * 57.29577951308232d));
    }

    public float b(@NonNull Matrix matrix) {
        matrix.getValues(this.f6839j);
        double pow = Math.pow((double) this.f6839j[0], 2.0d);
        matrix.getValues(this.f6839j);
        return (float) Math.sqrt(Math.pow((double) this.f6839j[3], 2.0d) + pow);
    }

    public void c() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f6844o = b.q.a.a.F0(rectF);
            this.f6845p = b.q.a.a.B0(rectF);
            this.r = true;
            a aVar = this.f6843n;
            if (aVar != null) {
                UCropActivity.a aVar2 = (UCropActivity.a) aVar;
                UCropActivity.this.s.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
                UCropActivity.this.E.setClickable(false);
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.r = false;
                uCropActivity.supportInvalidateOptionsMenu();
            }
        }
    }

    public void e(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f6840k.postRotate(f, f2, f3);
            setImageMatrix(this.f6840k);
            a aVar = this.f6843n;
            if (aVar != null) {
                ((UCropActivity.a) aVar).a(a(this.f6840k));
            }
        }
    }

    public void f(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f6840k.postScale(f, f, f2, f3);
            setImageMatrix(this.f6840k);
            a aVar = this.f6843n;
            if (aVar != null) {
                ((UCropActivity.a) aVar).b(b(this.f6840k));
            }
        }
    }

    public void g(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f6840k.postTranslate(f, f2);
            setImageMatrix(this.f6840k);
        }
    }

    public float getCurrentAngle() {
        return a(this.f6840k);
    }

    public float getCurrentScale() {
        return b(this.f6840k);
    }

    public b.q.a.j.c getExifInfo() {
        return this.v;
    }

    public String getImageInputPath() {
        return this.t;
    }

    public String getImageOutputPath() {
        return this.u;
    }

    public int getMaxBitmapSize() {
        int i2;
        if (this.s <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i3 = point.x;
            int i4 = point.y;
            int sqrt = (int) Math.sqrt(Math.pow((double) i4, 2.0d) + Math.pow((double) i3, 2.0d));
            Canvas canvas = new Canvas();
            int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (min > 0) {
                sqrt = Math.min(sqrt, min);
            }
            try {
                i2 = b.q.a.a.W0();
            } catch (Exception e2) {
                Log.d("EglUtils", "getMaxTextureSize: ", e2);
                i2 = 0;
            }
            if (i2 > 0) {
                sqrt = Math.min(sqrt, i2);
            }
            Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
            this.s = sqrt;
        }
        return this.s;
    }

    @Nullable
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof b.q.a.l.a)) {
            return null;
        }
        return ((b.q.a.l.a) getDrawable()).f6811b;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || (this.f6846q && !this.r)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f6841l = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f6842m = (getHeight() - getPaddingBottom()) - paddingTop;
            d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new b.q.a.l.a(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f6840k.set(matrix);
        this.f6840k.mapPoints(this.f6837h, this.f6844o);
        this.f6840k.mapPoints(this.f6838i, this.f6845p);
    }

    public void setMaxBitmapSize(int i2) {
        this.s = i2;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(a aVar) {
        this.f6843n = aVar;
    }
}
