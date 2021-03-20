package b.h.a.m.v;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.h.a.m.m;
import b.h.a.m.v.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {
    public final boolean a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final Map<m, b> f620b = new HashMap();
    public final ReferenceQueue<q<?>> c = new ReferenceQueue<>();
    public q.a d;

    /* renamed from: b.h.a.m.v.a$a  reason: collision with other inner class name */
    public class C0021a implements ThreadFactory {

        /* renamed from: b.h.a.m.v.a$a$a  reason: collision with other inner class name */
        public class C0022a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ Runnable f621h;

            public C0022a(C0021a aVar, Runnable runnable) {
                this.f621h = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f621h.run();
            }
        }

        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new C0022a(this, runnable), "glide-active-resources");
        }
    }

    @VisibleForTesting
    public static final class b extends WeakReference<q<?>> {
        public final m a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f622b;
        @Nullable
        public w<?> c;

        public b(@NonNull m mVar, @NonNull q<?> qVar, @NonNull ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w<Z> wVar;
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.a = mVar;
            if (!qVar.f751h || !z) {
                wVar = null;
            } else {
                wVar = qVar.f753j;
                Objects.requireNonNull(wVar, "Argument must not be null");
            }
            this.c = wVar;
            this.f622b = qVar.f751h;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0021a());
        this.a = z;
        newSingleThreadExecutor.execute(new b(this));
    }

    public synchronized void a(m mVar, q<?> qVar) {
        b put = this.f620b.put(mVar, new b(mVar, qVar, this.c, this.a));
        if (put != null) {
            put.c = null;
            put.clear();
        }
    }

    public void b(@NonNull b bVar) {
        synchronized (this) {
            this.f620b.remove(bVar.a);
            if (bVar.f622b) {
                w<?> wVar = bVar.c;
                if (wVar != null) {
                    this.d.a(bVar.a, new q(wVar, true, false, bVar.a, this.d));
                }
            }
        }
    }
}
