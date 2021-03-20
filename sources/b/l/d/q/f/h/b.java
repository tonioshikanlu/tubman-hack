package b.l.d.q.f.h;

import android.content.Context;
import b.l.d.q.f.g.e;
import b.l.d.q.f.g.v;
import java.io.File;
import java.util.Objects;

public class b {
    public static final c d = new c((a) null);
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final C0077b f5133b;
    public a c = d;

    /* renamed from: b.l.d.q.f.h.b$b  reason: collision with other inner class name */
    public interface C0077b {
    }

    public static final class c implements a {
        public c(a aVar) {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public void c(long j2, String str) {
        }
    }

    public b(Context context, C0077b bVar) {
        this.a = context;
        this.f5133b = bVar;
        a((String) null);
    }

    public final void a(String str) {
        this.c.a();
        this.c = d;
        if (str != null) {
            if (!e.d(this.a, "com.crashlytics.CollectCustomLogs", true)) {
                b.l.d.q.f.b.a.b("Preferences requested no custom logs. Aborting log file creation.");
                return;
            }
            String n2 = b.e.a.a.a.n("crashlytics-userlog-", str, ".temp");
            v.c cVar = (v.c) this.f5133b;
            Objects.requireNonNull(cVar);
            File file = new File(cVar.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.c = new e(new File(file, n2), 65536);
        }
    }
}
