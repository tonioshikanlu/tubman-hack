package b.a.a.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import b.a.a.i.l;

public class k extends View {

    /* renamed from: h  reason: collision with root package name */
    public Paint f158h;

    /* renamed from: i  reason: collision with root package name */
    public Path f159i;

    /* renamed from: j  reason: collision with root package name */
    public RectF f160j;

    /* renamed from: k  reason: collision with root package name */
    public l f161k;

    public k(Context context, l lVar) {
        super(context);
        this.f161k = lVar;
        Paint paint = new Paint(1);
        this.f158h = paint;
        paint.setColor(0);
        float f = this.f161k.f322e;
        float f2 = 0.0f;
        f = f == 0.0f ? 0.001f : f;
        this.f159i = new Path();
        l lVar2 = this.f161k;
        RectF rectF = new RectF(f, f, ((float) lVar2.a) - f, ((float) lVar2.f321b) - f);
        this.f160j = rectF;
        this.f159i.addRoundRect(rectF, this.f161k.f324h, Path.Direction.CW);
        l lVar3 = this.f161k;
        float f3 = lVar3.f323g;
        this.f158h.setShadowLayer(f, lVar3.f, f3 >= 0.0f ? f3 : f2, lVar3.d);
        if (Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, (Paint) null);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f159i, this.f158h);
    }
}
