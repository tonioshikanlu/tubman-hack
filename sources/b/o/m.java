package b.o;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

public class m extends RelativeLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final int f6188l = g2.b(28);

    /* renamed from: m  reason: collision with root package name */
    public static final int f6189m = g2.b(64);

    /* renamed from: h  reason: collision with root package name */
    public a f6190h;

    /* renamed from: i  reason: collision with root package name */
    public ViewDragHelper f6191i = ViewDragHelper.create(this, 1.0f, new l(this));

    /* renamed from: j  reason: collision with root package name */
    public boolean f6192j;

    /* renamed from: k  reason: collision with root package name */
    public b f6193k;

    public interface a {
    }

    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f6194b;
        public int c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f6195e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f6196g;

        /* renamed from: h  reason: collision with root package name */
        public int f6197h;

        /* renamed from: i  reason: collision with root package name */
        public int f6198i;
    }

    public m(Context context) {
        super(context);
        setClipChildren(false);
    }

    public void a(b bVar) {
        int i2;
        this.f6193k = bVar;
        bVar.f6197h = ((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.f6195e) - bVar.a) + bVar.f6195e + bVar.a + f6189m;
        int b2 = g2.b(PathInterpolatorCompat.MAX_NUM_POINTS);
        bVar.f6196g = b2;
        if (bVar.f == 0) {
            int i3 = (-bVar.f6195e) - f6188l;
            bVar.f6197h = i3;
            bVar.f6196g = -b2;
            i2 = i3 / 3;
        } else {
            i2 = (bVar.f6194b * 2) + (bVar.f6195e / 3);
        }
        bVar.f6198i = i2;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f6191i.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f6192j) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (aVar = this.f6190h) != null) {
            ((y) aVar).a.f5998i = false;
        }
        this.f6191i.processTouchEvent(motionEvent);
        return false;
    }
}
