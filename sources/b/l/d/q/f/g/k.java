package b.l.d.q.f.g;

import android.util.Log;
import androidx.annotation.NonNull;
import b.l.d.q.f.b;
import b.l.d.q.f.g.a0;
import b.l.d.q.f.m.f;
import java.util.Date;

public class k implements a0.a {
    public final /* synthetic */ q a;

    public k(q qVar) {
        this.a = qVar;
    }

    public void a(@NonNull f fVar, @NonNull Thread thread, @NonNull Throwable th) {
        q qVar = this.a;
        synchronized (qVar) {
            b bVar = b.a;
            bVar.b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            try {
                q0.a(qVar.d.c(new m(qVar, new Date(), th, thread, fVar)));
            } catch (Exception e2) {
                Log.e("WILLIS", "ERROR", e2);
            }
        }
        return;
    }
}
