package b.a.a.b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import b.l.a.c.h.b;
import e.x.c.i;
import q.a.a;

public final class d extends b {

    /* renamed from: i  reason: collision with root package name */
    public boolean f155i;

    public d(Context context, boolean z) {
        super(context);
        this.f155i = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i.e(motionEvent, "event");
        if (this.f155i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                ViewParent parent = getParent();
                i.d(parent, "parent");
                parent.getParent().requestDisallowInterceptTouchEvent(true);
                a.d.a("Inside if of action down", new Object[0]);
            } else if (action == 1) {
                ViewParent parent2 = getParent();
                i.d(parent2, "parent");
                parent2.getParent().requestDisallowInterceptTouchEvent(false);
                a.d.a("Inside if of action up", new Object[0]);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
