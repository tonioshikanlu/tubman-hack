package b.h.a.q.i;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import b.h.a.q.h.e;
import b.h.a.q.i.d;

public class b implements d<Drawable> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f999b;

    public b(int i2, boolean z) {
        this.a = i2;
        this.f999b = z;
    }

    public boolean a(Object obj, d.a aVar) {
        Drawable drawable = (Drawable) obj;
        e eVar = (e) aVar;
        Drawable drawable2 = ((ImageView) eVar.f994h).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f999b);
        transitionDrawable.startTransition(this.a);
        ((ImageView) eVar.f994h).setImageDrawable(transitionDrawable);
        return true;
    }
}
