package b.q.a;

import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;

public class d implements HorizontalProgressWheelView.a {
    public final /* synthetic */ UCropActivity a;

    public d(UCropActivity uCropActivity) {
        this.a = uCropActivity;
    }

    public void a(float f, float f2) {
        this.a.t.k(f / 42.0f);
    }

    public void b() {
        this.a.t.setImageToWrapCropBounds(true);
    }

    public void c() {
        this.a.t.i();
    }
}
