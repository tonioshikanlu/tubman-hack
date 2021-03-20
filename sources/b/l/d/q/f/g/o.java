package b.l.d.q.f.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.k.g;
import b.l.a.c.k.h;
import b.l.d.q.f.b;
import b.l.d.q.f.m.j.a;
import java.util.concurrent.Executor;

public class o implements g<a, Void> {
    public final /* synthetic */ Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f5100b;

    public o(p pVar, Executor executor) {
        this.f5100b = pVar;
        this.a = executor;
    }

    @NonNull
    public h a(@Nullable Object obj) {
        if (((a) obj) == null) {
            b.a.f("Received null app settings, cannot send reports during app startup.");
        } else {
            q.b(q.this);
            q.this.f5112m.c(this.a);
            q.this.f5116q.b(null);
        }
        return b.l.a.c.b.a.X(null);
    }
}
