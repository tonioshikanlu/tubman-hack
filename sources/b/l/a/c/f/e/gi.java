package b.l.a.c.f.e;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import b.l.a.c.c.l.k.f;
import b.l.a.c.c.l.k.l;
import b.l.a.c.c.m.d;
import b.l.a.c.c.m.i;
import b.l.a.c.c.n.a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.Objects;

public final class gi extends i<ti> implements fi {
    public static final a F = new a("FirebaseAuth", "FirebaseAuth:");
    public final Context D;
    public final xi E;

    public gi(Context context, Looper looper, d dVar, xi xiVar, f fVar, l lVar) {
        super(context, looper, 112, dVar, fVar, lVar);
        Objects.requireNonNull(context, "null reference");
        this.D = context;
        this.E = xiVar;
    }

    public final String C() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    public final String D() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    public final String E() {
        if (this.E.f3257h) {
            a aVar = F;
            Log.i(aVar.a, aVar.c("Preparing to create service connection to fallback implementation", new Object[0]));
            return this.D.getPackageName();
        }
        a aVar2 = F;
        Log.i(aVar2.a, aVar2.c("Preparing to create service connection to gms implementation", new Object[0]));
        return "com.google.android.gms";
    }

    public final boolean m() {
        return DynamiteModule.a(this.D, ModuleDescriptor.MODULE_ID) == 0;
    }

    public final int n() {
        return 12451000;
    }

    public final /* bridge */ /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof ti ? (ti) queryLocalInterface : new ri(iBinder);
    }

    public final b.l.a.c.c.d[] y() {
        return p4.d;
    }

    public final Bundle z() {
        Bundle bundle = new Bundle();
        xi xiVar = this.E;
        if (xiVar != null) {
            bundle.putString("com.google.firebase.auth.API_KEY", xiVar.f3403i);
        }
        bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", cj.b());
        return bundle;
    }
}
