package b.l.a.c.i.b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;

public final class u3 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4292b;
    public boolean c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x3 f4293e;

    public u3(x3 x3Var, String str, long j2) {
        this.f4293e = x3Var;
        a.x(str);
        this.a = str;
        this.f4292b = j2;
    }

    @WorkerThread
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.f4293e.o().getLong(this.a, this.f4292b);
        }
        return this.d;
    }

    @WorkerThread
    public final void b(long j2) {
        SharedPreferences.Editor edit = this.f4293e.o().edit();
        edit.putLong(this.a, j2);
        edit.apply();
        this.d = j2;
    }
}
