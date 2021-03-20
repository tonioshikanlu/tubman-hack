package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\t\u0010\u0006\u001a*\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\n*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\r\u0010\f\u001al\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0014\b\u0006\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Le/r;", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;Le/x/b/l;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;Le/x/b/l;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;Le/x/b/l;Le/x/b/l;Le/x/b/l;Le/x/b/l;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;Le/x/b/l;Le/x/b/l;)Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, l<? super Animator, r> lVar, l<? super Animator, r> lVar2, l<? super Animator, r> lVar3, l<? super Animator, r> lVar4) {
        i.f(animator, "$this$addListener");
        i.f(lVar, "onEnd");
        i.f(lVar2, "onStart");
        i.f(lVar3, "onCancel");
        i.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            lVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            lVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        i.f(animator, "$this$addListener");
        i.f(lVar, "onEnd");
        i.f(lVar2, "onStart");
        i.f(lVar3, "onCancel");
        i.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, l<? super Animator, r> lVar, l<? super Animator, r> lVar2) {
        i.f(animator, "$this$addPauseListener");
        i.f(lVar, "onResume");
        i.f(lVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(lVar2, lVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, l lVar, l lVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        i.f(animator, "$this$addPauseListener");
        i.f(lVar, "onResume");
        i.f(lVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(lVar2, lVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnCancel");
        i.f(lVar, "action");
        AnimatorKt$doOnCancel$$inlined$addListener$1 animatorKt$doOnCancel$$inlined$addListener$1 = new AnimatorKt$doOnCancel$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnCancel$$inlined$addListener$1);
        return animatorKt$doOnCancel$$inlined$addListener$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnEnd");
        i.f(lVar, "action");
        AnimatorKt$doOnEnd$$inlined$addListener$1 animatorKt$doOnEnd$$inlined$addListener$1 = new AnimatorKt$doOnEnd$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnEnd$$inlined$addListener$1);
        return animatorKt$doOnEnd$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnPause");
        i.f(lVar, "action");
        AnimatorKt$doOnPause$$inlined$addPauseListener$1 animatorKt$doOnPause$$inlined$addPauseListener$1 = new AnimatorKt$doOnPause$$inlined$addPauseListener$1(lVar);
        animator.addPauseListener(animatorKt$doOnPause$$inlined$addPauseListener$1);
        return animatorKt$doOnPause$$inlined$addPauseListener$1;
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnRepeat");
        i.f(lVar, "action");
        AnimatorKt$doOnRepeat$$inlined$addListener$1 animatorKt$doOnRepeat$$inlined$addListener$1 = new AnimatorKt$doOnRepeat$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnRepeat$$inlined$addListener$1);
        return animatorKt$doOnRepeat$$inlined$addListener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnResume");
        i.f(lVar, "action");
        AnimatorKt$doOnResume$$inlined$addPauseListener$1 animatorKt$doOnResume$$inlined$addPauseListener$1 = new AnimatorKt$doOnResume$$inlined$addPauseListener$1(lVar);
        animator.addPauseListener(animatorKt$doOnResume$$inlined$addPauseListener$1);
        return animatorKt$doOnResume$$inlined$addPauseListener$1;
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, l<? super Animator, r> lVar) {
        i.f(animator, "$this$doOnStart");
        i.f(lVar, "action");
        AnimatorKt$doOnStart$$inlined$addListener$1 animatorKt$doOnStart$$inlined$addListener$1 = new AnimatorKt$doOnStart$$inlined$addListener$1(lVar);
        animator.addListener(animatorKt$doOnStart$$inlined$addListener$1);
        return animatorKt$doOnStart$$inlined$addListener$1;
    }
}
