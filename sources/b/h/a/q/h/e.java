package b.h.a.q.h;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.q.i.d;

public abstract class e<Z> extends i<ImageView, Z> implements d.a {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public Animatable f993j;

    public e(ImageView imageView) {
        super(imageView);
    }

    public void b(@NonNull Z z, @Nullable d<? super Z> dVar) {
        if (dVar == null || !dVar.a(z, this)) {
            l(z);
        } else if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f993j = animatable;
            animatable.start();
        } else {
            this.f993j = null;
        }
    }

    public void c(@Nullable Drawable drawable) {
        l((Object) null);
        ((ImageView) this.f994h).setImageDrawable(drawable);
    }

    public void d() {
        Animatable animatable = this.f993j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void e(@Nullable Drawable drawable) {
        l((Object) null);
        ((ImageView) this.f994h).setImageDrawable(drawable);
    }

    public void g(@Nullable Drawable drawable) {
        this.f995i.a();
        Animatable animatable = this.f993j;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        ((ImageView) this.f994h).setImageDrawable(drawable);
    }

    public abstract void k(@Nullable Z z);

    public final void l(@Nullable Z z) {
        k(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f993j = animatable;
            animatable.start();
            return;
        }
        this.f993j = null;
    }

    public void onStart() {
        Animatable animatable = this.f993j;
        if (animatable != null) {
            animatable.start();
        }
    }
}
