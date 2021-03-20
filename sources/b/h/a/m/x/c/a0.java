package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.s.j;

public final class a0 implements r<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {

        /* renamed from: h  reason: collision with root package name */
        public final Bitmap f846h;

        public a(@NonNull Bitmap bitmap) {
            this.f846h = bitmap;
        }

        public int a() {
            return j.d(this.f846h);
        }

        @NonNull
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @NonNull
        public Object get() {
            return this.f846h;
        }

        public void recycle() {
        }
    }

    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        return new a((Bitmap) obj);
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj, @NonNull p pVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
