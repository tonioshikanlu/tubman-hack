package b.q.a;

import android.view.View;
import com.yalantis.ucrop.UCropActivity;

public class f implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ UCropActivity f6786h;

    public f(UCropActivity uCropActivity) {
        this.f6786h = uCropActivity;
    }

    public void onClick(View view) {
        UCropActivity uCropActivity = this.f6786h;
        uCropActivity.t.k((float) 90);
        uCropActivity.t.setImageToWrapCropBounds(true);
    }
}
