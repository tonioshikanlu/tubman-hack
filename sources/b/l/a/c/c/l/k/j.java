package b.l.a.c.c.l.k;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

public final class j<L> {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public volatile L f2672b;
    public final a<L> c;

    public static final class a<L> {
        public final L a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2673b;

        public a(L l2, String str) {
            this.a = l2;
            this.f2673b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f2673b.equals(aVar.f2673b);
        }

        public final int hashCode() {
            return this.f2673b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    public interface b<L> {
        void a(L l2);

        void b();
    }

    public final class c extends b.l.a.c.f.c.c {
        public c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            b.l.a.c.b.a.j(z);
            b bVar = (b) message.obj;
            L l2 = j.this.f2672b;
            if (l2 == null) {
                bVar.b();
                return;
            }
            try {
                bVar.a(l2);
            } catch (RuntimeException e2) {
                bVar.b();
                throw e2;
            }
        }
    }

    public j(@NonNull Looper looper, @NonNull L l2, @NonNull String str) {
        this.a = new c(looper);
        b.l.a.c.b.a.B(l2, "Listener must not be null");
        this.f2672b = l2;
        b.l.a.c.b.a.x(str);
        this.c = new a<>(l2, str);
    }

    public final void a(b<? super L> bVar) {
        b.l.a.c.b.a.B(bVar, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, bVar));
    }
}
