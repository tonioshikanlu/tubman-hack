package b.l.b.a.d;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class r implements v {
    public final v a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4827b;
    public final Logger c;

    public r(v vVar, Logger logger, Level level, int i2) {
        this.a = vVar;
        this.c = logger;
        this.f4827b = i2;
    }

    /* JADX INFO: finally extract failed */
    public void a(OutputStream outputStream) {
        q qVar = new q(outputStream, this.c, Level.CONFIG, this.f4827b);
        try {
            this.a.a(qVar);
            qVar.f4826h.close();
            outputStream.flush();
        } catch (Throwable th) {
            qVar.f4826h.close();
            throw th;
        }
    }
}
