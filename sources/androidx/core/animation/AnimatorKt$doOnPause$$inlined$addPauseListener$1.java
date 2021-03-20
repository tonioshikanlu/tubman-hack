package androidx.core.animation;

import android.animation.Animator;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Le/r;", "onAnimationPause", "(Landroid/animation/Animator;)V", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class AnimatorKt$doOnPause$$inlined$addPauseListener$1 implements Animator.AnimatorPauseListener {
    public final /* synthetic */ l $onPause;

    public AnimatorKt$doOnPause$$inlined$addPauseListener$1(l lVar) {
        this.$onPause = lVar;
    }

    public void onAnimationPause(Animator animator) {
        i.f(animator, "animator");
        this.$onPause.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        i.f(animator, "animator");
    }
}
