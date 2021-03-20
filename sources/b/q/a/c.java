package b.q.a;

import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Iterator;

public class c implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ UCropActivity f6784h;

    public c(UCropActivity uCropActivity) {
        this.f6784h = uCropActivity;
    }

    public void onClick(View view) {
        GestureCropImageView gestureCropImageView = this.f6784h.t;
        AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
        if (view.isSelected()) {
            if (aspectRatioTextView.f7431k != 0.0f) {
                float f = aspectRatioTextView.f7433m;
                float f2 = aspectRatioTextView.f7434n;
                aspectRatioTextView.f7433m = f2;
                aspectRatioTextView.f7434n = f;
                aspectRatioTextView.f7431k = f2 / f;
            }
            aspectRatioTextView.b();
        }
        gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f7431k);
        this.f6784h.t.setImageToWrapCropBounds(true);
        if (!view.isSelected()) {
            Iterator<ViewGroup> it = this.f6784h.B.iterator();
            while (it.hasNext()) {
                ViewGroup next = it.next();
                next.setSelected(next == view);
            }
        }
    }
}
