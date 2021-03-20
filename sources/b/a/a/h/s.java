package b.a.a.h;

import android.view.View;
import android.widget.EditText;

public final class s implements View.OnFocusChangeListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f292h;

    public s(EditText editText) {
        this.f292h = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f292h.callOnClick();
        }
    }
}
