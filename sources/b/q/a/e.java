package b.q.a;

import android.view.View;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;

public class e implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ UCropActivity f6785h;

    public e(UCropActivity uCropActivity) {
        this.f6785h = uCropActivity;
    }

    public void onClick(View view) {
        UCropActivity uCropActivity = this.f6785h;
        GestureCropImageView gestureCropImageView = uCropActivity.t;
        gestureCropImageView.k(-gestureCropImageView.getCurrentAngle());
        uCropActivity.t.setImageToWrapCropBounds(true);
    }
}
