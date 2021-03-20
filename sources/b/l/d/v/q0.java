package b.l.d.v;

import android.content.SharedPreferences;
import b.l.a.c.b.a;
import b.l.a.c.k.g;
import b.l.a.c.k.h;
import com.google.firebase.iid.FirebaseInstanceId;

public final /* synthetic */ class q0 implements g {
    public final FirebaseInstanceId a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5336b;
    public final String c;
    public final String d;

    public q0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.f5336b = str;
        this.c = str2;
        this.d = str3;
    }

    public final h a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.f5336b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = (String) obj;
        x xVar = FirebaseInstanceId.f7351j;
        String c2 = firebaseInstanceId.c.c();
        synchronized (xVar) {
            String a2 = a0.a(str4, c2, System.currentTimeMillis());
            if (a2 != null) {
                SharedPreferences.Editor edit = xVar.a.edit();
                edit.putString(x.a("", str, str2), a2);
                edit.commit();
            }
        }
        return a.X(new w0(str3, str4));
    }
}
