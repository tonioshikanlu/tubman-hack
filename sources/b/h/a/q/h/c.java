package b.h.a.q.h;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import b.h.a.q.b;
import b.h.a.q.g;
import b.h.a.s.j;

public abstract class c<T> implements h<T> {

    /* renamed from: h  reason: collision with root package name */
    public final int f990h;

    /* renamed from: i  reason: collision with root package name */
    public final int f991i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public b f992j;

    public c() {
        if (j.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f990h = Integer.MIN_VALUE;
            this.f991i = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException(a.i("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", Integer.MIN_VALUE, " and height: ", Integer.MIN_VALUE));
    }

    public final void a(@NonNull g gVar) {
    }

    public void c(@Nullable Drawable drawable) {
    }

    public void d() {
    }

    public void e(@Nullable Drawable drawable) {
    }

    @Nullable
    public final b f() {
        return this.f992j;
    }

    public final void h(@NonNull g gVar) {
        ((g) gVar).d(this.f990h, this.f991i);
    }

    public final void i(@Nullable b bVar) {
        this.f992j = bVar;
    }

    public void j() {
    }

    public void onStart() {
    }
}
