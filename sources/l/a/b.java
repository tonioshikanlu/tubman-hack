package l.a;

import java.io.Closeable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f8097l = Logger.getLogger(b.class.getName());

    /* renamed from: m  reason: collision with root package name */
    public static final c<c<?>, Object> f8098m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f8099n;

    /* renamed from: h  reason: collision with root package name */
    public C0159b f8100h = new e((a) null);

    /* renamed from: i  reason: collision with root package name */
    public final a f8101i;

    /* renamed from: j  reason: collision with root package name */
    public final c<c<?>, Object> f8102j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8103k;

    public static final class a extends b implements Closeable {

        /* renamed from: o  reason: collision with root package name */
        public boolean f8104o;

        /* renamed from: p  reason: collision with root package name */
        public Throwable f8105p;

        public boolean H(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f8104o) {
                    this.f8104o = true;
                    this.f8105p = th;
                } else {
                    z = false;
                }
            }
            if (z) {
                z();
            }
            return z;
        }

        public boolean b() {
            return true;
        }

        public void close() {
            H((Throwable) null);
        }

        public void q(b bVar) {
            throw null;
        }
    }

    /* renamed from: l.a.b$b  reason: collision with other inner class name */
    public interface C0159b {
    }

    public static final class c<T> {
        public final String a;

        public c(String str) {
            Objects.requireNonNull(str, "name");
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class d {
        public static final f a;

        static {
            f fVar;
            AtomicReference atomicReference = new AtomicReference();
            try {
                fVar = (f) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                atomicReference.set(e2);
                fVar = new d();
            } catch (Exception e3) {
                throw new RuntimeException("Storage override failed to initialize", e3);
            }
            a = fVar;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                b.f8097l.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    public final class e implements C0159b {
        public e(a aVar) {
        }
    }

    public static abstract class f {
        public abstract b a();

        public abstract void b(b bVar, b bVar2);

        public b c(b bVar) {
            a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    static {
        c<c<?>, Object> cVar = new c<>();
        f8098m = cVar;
        f8099n = new b((b) null, cVar);
    }

    public b(b bVar, c<c<?>, Object> cVar) {
        a aVar = null;
        this.f8101i = bVar != null ? bVar instanceof a ? (a) bVar : bVar.f8101i : aVar;
        this.f8102j = cVar;
        int i2 = bVar == null ? 0 : bVar.f8103k + 1;
        this.f8103k = i2;
        if (i2 == 1000) {
            f8097l.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    public static b e() {
        b a2 = d.a.a();
        return a2 == null ? f8099n : a2;
    }

    public boolean b() {
        return this.f8101i != null;
    }

    public void q(b bVar) {
        Objects.requireNonNull(bVar, "toAttach");
        d.a.b(this, bVar);
    }

    public void z() {
        if (b()) {
            synchronized (this) {
            }
        }
    }
}
