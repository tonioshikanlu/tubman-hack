package b.h.a.m.x.g;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.h.a.h;
import b.h.a.i;
import b.h.a.m.t;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.k;
import b.h.a.q.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class g {
    public final b.h.a.l.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f910b;
    public final List<b> c = new ArrayList();
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final d f911e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f912g;

    /* renamed from: h  reason: collision with root package name */
    public h<Bitmap> f913h;

    /* renamed from: i  reason: collision with root package name */
    public a f914i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f915j;

    /* renamed from: k  reason: collision with root package name */
    public a f916k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f917l;

    /* renamed from: m  reason: collision with root package name */
    public t<Bitmap> f918m;

    /* renamed from: n  reason: collision with root package name */
    public a f919n;

    /* renamed from: o  reason: collision with root package name */
    public int f920o;

    /* renamed from: p  reason: collision with root package name */
    public int f921p;

    /* renamed from: q  reason: collision with root package name */
    public int f922q;

    @VisibleForTesting
    public static class a extends b.h.a.q.h.c<Bitmap> {

        /* renamed from: k  reason: collision with root package name */
        public final Handler f923k;

        /* renamed from: l  reason: collision with root package name */
        public final int f924l;

        /* renamed from: m  reason: collision with root package name */
        public final long f925m;

        /* renamed from: n  reason: collision with root package name */
        public Bitmap f926n;

        public a(Handler handler, int i2, long j2) {
            this.f923k = handler;
            this.f924l = i2;
            this.f925m = j2;
        }

        public void b(@NonNull Object obj, @Nullable b.h.a.q.i.d dVar) {
            this.f926n = (Bitmap) obj;
            this.f923k.sendMessageAtTime(this.f923k.obtainMessage(1, this), this.f925m);
        }

        public void g(@Nullable Drawable drawable) {
            this.f926n = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                g.this.d.n((a) message.obj);
                return false;
            }
        }
    }

    public g(b.h.a.c cVar, b.h.a.l.a aVar, int i2, int i3, t<Bitmap> tVar, Bitmap bitmap) {
        d dVar = cVar.f467h;
        i d2 = b.h.a.c.d(cVar.f469j.getBaseContext());
        h<Bitmap> A = b.h.a.c.d(cVar.f469j.getBaseContext()).l().a(((e) ((e) ((e) new e().g(k.a)).y(true)).t(true)).o(i2, i3));
        this.d = d2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f911e = dVar;
        this.f910b = handler;
        this.f913h = A;
        this.a = aVar;
        c(tVar, bitmap);
    }

    public final void a() {
        if (this.f && !this.f912g) {
            a aVar = this.f919n;
            if (aVar != null) {
                this.f919n = null;
                b(aVar);
                return;
            }
            this.f912g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.e());
            this.a.c();
            this.f916k = new a(this.f910b, this.a.a(), uptimeMillis);
            h<Bitmap> F = this.f913h.a((e) new e().s(new b.h.a.r.b(Double.valueOf(Math.random())))).F(this.a);
            a aVar2 = this.f916k;
            Objects.requireNonNull(F);
            F.D(aVar2, (b.h.a.q.d<Bitmap>) null, F, b.h.a.s.e.a);
        }
    }

    @VisibleForTesting
    public void b(a aVar) {
        this.f912g = false;
        if (this.f915j) {
            this.f910b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            this.f919n = aVar;
        } else {
            if (aVar.f926n != null) {
                Bitmap bitmap = this.f917l;
                if (bitmap != null) {
                    this.f911e.e(bitmap);
                    this.f917l = null;
                }
                a aVar2 = this.f914i;
                this.f914i = aVar;
                int size = this.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f910b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(b.h.a.m.t<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f918m = r4
            java.util.Objects.requireNonNull(r5, r0)
            r3.f917l = r5
            b.h.a.h<android.graphics.Bitmap> r0 = r3.f913h
            b.h.a.q.e r1 = new b.h.a.q.e
            r1.<init>()
            r2 = 1
            b.h.a.q.a r4 = r1.v(r4, r2)
            b.h.a.h r4 = r0.a(r4)
            r3.f913h = r4
            int r4 = b.h.a.s.j.d(r5)
            r3.f920o = r4
            int r4 = r5.getWidth()
            r3.f921p = r4
            int r4 = r5.getHeight()
            r3.f922q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.g.g.c(b.h.a.m.t, android.graphics.Bitmap):void");
    }
}
