package b.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.o.q4;

public class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ q4.f a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f6017b;

    public b0(a0 a0Var, q4.f fVar) {
        this.f6017b = a0Var;
        this.a = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        a0.a(this.f6017b);
        q4.f fVar = this.a;
        if (fVar != null) {
            fVar.a();
        }
    }
}
