package b.m.a;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import b.m.a.d;

public class p extends OrientationEventListener {
    public final /* synthetic */ q a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(q qVar, Context context, int i2) {
        super(context, i2);
        this.a = qVar;
    }

    public void onOrientationChanged(int i2) {
        q qVar = this.a;
        WindowManager windowManager = qVar.f5929b;
        o oVar = qVar.d;
        if (windowManager != null && oVar != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            q qVar2 = this.a;
            if (rotation != qVar2.a) {
                qVar2.a = rotation;
                d.c cVar = (d.c) oVar;
                d.this.f5895j.postDelayed(new e(cVar), 250);
            }
        }
    }
}
