package b.l.d.q.f.g;

import b.l.a.c.b.a;
import b.l.a.c.k.h;
import b.l.d.q.f.b;
import b.l.d.q.f.g.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class p implements Callable<h<Void>> {
    public final /* synthetic */ Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.a f5101b;

    public p(q.a aVar, Boolean bool) {
        this.f5101b = aVar;
        this.a = bool;
    }

    public Object call() {
        b bVar = b.a;
        if (!this.a.booleanValue()) {
            bVar.b("Reports are being deleted.");
            File[] listFiles = q.this.g().listFiles(i.a);
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File delete : listFiles) {
                delete.delete();
            }
            Iterator it = ((ArrayList) q.this.f5112m.f5095b.c()).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            q.this.f5116q.b(null);
            return a.X(null);
        }
        bVar.b("Reports are being sent.");
        boolean booleanValue = this.a.booleanValue();
        b0 b0Var = q.this.f5104b;
        Objects.requireNonNull(b0Var);
        if (booleanValue) {
            b0Var.f5063g.b(null);
            q.a aVar = this.f5101b;
            Executor executor = q.this.d.a;
            return aVar.a.o(executor, new o(this, executor));
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
