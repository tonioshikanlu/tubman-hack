package b.l.a.c.i.b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;

public final class s3 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4252b;
    public boolean c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x3 f4253e;

    public s3(x3 x3Var, String str, boolean z) {
        this.f4253e = x3Var;
        a.x(str);
        this.a = str;
        this.f4252b = z;
    }

    @WorkerThread
    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.f4253e.o().getBoolean(this.a, this.f4252b);
        }
        return this.d;
    }

    @WorkerThread
    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.f4253e.o().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
