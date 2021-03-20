package b.l.d.q;

import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.k.a;
import b.l.a.c.k.h;
import b.l.d.q.f.b;

public class c implements a<Void, Object> {
    public Object a(@NonNull h<Void> hVar) {
        if (hVar.n()) {
            return null;
        }
        b bVar = b.a;
        Exception i2 = hVar.i();
        if (!bVar.a(6)) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", i2);
        return null;
    }
}
