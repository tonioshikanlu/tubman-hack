package b.a.a.h;

import android.view.View;
import android.widget.EditText;

public final class p implements View.OnFocusChangeListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f286h;

    public p(EditText editText) {
        this.f286h = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f286h.callOnClick();
        }
    }
}
