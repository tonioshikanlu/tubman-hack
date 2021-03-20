package b.l.d.v;

import android.os.Bundle;
import android.util.Log;
import b.l.a.c.k.i;

public abstract class m<T> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final i<T> f5330b = new i<>();
    public final int c;
    public final Bundle d;

    public m(int i2, int i3, Bundle bundle) {
        this.a = i2;
        this.c = i3;
        this.d = bundle;
    }

    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f5330b.a.q(t);
    }

    public final void b(p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f5330b.a.p(pVar);
    }

    public abstract boolean c();

    public abstract void d(Bundle bundle);

    public String toString() {
        int i2 = this.c;
        int i3 = this.a;
        boolean c2 = c();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(c2);
        sb.append("}");
        return sb.toString();
    }
}
