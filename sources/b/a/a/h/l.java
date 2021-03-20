package b.a.a.h;

import android.view.MotionEvent;
import android.view.View;
import e.x.c.i;

public final class l implements View.OnTouchListener {

    /* renamed from: h  reason: collision with root package name */
    public static final l f282h = new l();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i.d(motionEvent, "event");
        return motionEvent.getAction() == 2;
    }
}
