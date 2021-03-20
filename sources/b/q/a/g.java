package b.q.a;

import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;

public class g implements HorizontalProgressWheelView.a {
    public final /* synthetic */ UCropActivity a;

    public g(UCropActivity uCropActivity) {
        this.a = uCropActivity;
    }

    public void a(float f, float f2) {
        if (f > 0.0f) {
            GestureCropImageView gestureCropImageView = this.a.t;
            gestureCropImageView.l((((this.a.t.getMaxScale() - this.a.t.getMinScale()) / 15000.0f) * f) + gestureCropImageView.getCurrentScale(), gestureCropImageView.w.centerX(), gestureCropImageView.w.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView2 = this.a.t;
        float maxScale = (((this.a.t.getMaxScale() - this.a.t.getMinScale()) / 15000.0f) * f) + gestureCropImageView2.getCurrentScale();
        float centerX = gestureCropImageView2.w.centerX();
        float centerY = gestureCropImageView2.w.centerY();
        if (maxScale >= gestureCropImageView2.getMinScale()) {
            gestureCropImageView2.f(maxScale / gestureCropImageView2.getCurrentScale(), centerX, centerY);
        }
    }

    public void b() {
        this.a.t.setImageToWrapCropBounds(true);
    }

    public void c() {
        this.a.t.i();
    }
}
