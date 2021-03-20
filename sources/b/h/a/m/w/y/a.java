package b.h.a.m.w.y;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.u.j;
import b.h.a.m.w.g;
import b.h.a.m.w.m;
import b.h.a.m.w.n;
import b.h.a.m.w.r;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final o<Integer> f827b = o.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @Nullable
    public final m<g, g> a;

    /* renamed from: b.h.a.m.w.y.a$a  reason: collision with other inner class name */
    public static class C0032a implements b.h.a.m.w.o<g, InputStream> {
        public final m<g, g> a = new m<>(500);

        @NonNull
        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }
    }

    public a(@Nullable m<g, g> mVar) {
        this.a = mVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        g gVar = (g) obj;
        m<g, g> mVar = this.a;
        if (mVar != null) {
            m.b a2 = m.b.a(gVar, 0, 0);
            B a3 = mVar.a.a(a2);
            Queue<m.b<?>> queue = m.b.d;
            synchronized (queue) {
                queue.offer(a2);
            }
            g gVar2 = (g) a3;
            if (gVar2 == null) {
                m<g, g> mVar2 = this.a;
                Objects.requireNonNull(mVar2);
                mVar2.a.d(m.b.a(gVar, 0, 0), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new n.a(gVar, new j(gVar, ((Integer) pVar.c(f827b)).intValue()));
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
