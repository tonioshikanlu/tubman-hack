package b.l.a.c.i.b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;

public final class w3 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4328b;
    public String c;
    public final /* synthetic */ x3 d;

    public w3(x3 x3Var, String str) {
        this.d = x3Var;
        a.x(str);
        this.a = str;
    }

    @WorkerThread
    public final String a() {
        if (!this.f4328b) {
            this.f4328b = true;
            this.c = this.d.o().getString(this.a, (String) null);
        }
        return this.c;
    }

    @WorkerThread
    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.o().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
