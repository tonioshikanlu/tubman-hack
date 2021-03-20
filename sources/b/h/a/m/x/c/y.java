package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.c0.b;
import b.h.a.m.v.w;
import b.h.a.m.x.c.m;
import b.h.a.s.d;
import b.h.a.s.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

public class y implements r<InputStream, Bitmap> {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final b f889b;

    public static class a implements m.b {
        public final w a;

        /* renamed from: b  reason: collision with root package name */
        public final d f890b;

        public a(w wVar, d dVar) {
            this.a = wVar;
            this.f890b = dVar;
        }

        public void a(b.h.a.m.v.c0.d dVar, Bitmap bitmap) {
            IOException iOException = this.f890b.f1011i;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public void b() {
            w wVar = this.a;
            synchronized (wVar) {
                wVar.f884j = wVar.f882h.length;
            }
        }
    }

    public y(m mVar, b bVar) {
        this.a = mVar;
        this.f889b = bVar;
    }

    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        w wVar;
        boolean z;
        d poll;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z = false;
        } else {
            z = true;
            wVar = new w(inputStream, this.f889b);
        }
        Queue<d> queue = d.f1009j;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.f1010h = wVar;
        try {
            return this.a.b(new h(poll), i2, i3, pVar, new a(wVar, poll));
        } finally {
            poll.b();
            if (z) {
                wVar.e();
            }
        }
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        InputStream inputStream = (InputStream) obj;
        Objects.requireNonNull(this.a);
        return true;
    }
}
