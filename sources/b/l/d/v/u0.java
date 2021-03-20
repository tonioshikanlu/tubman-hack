package b.l.d.v;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.k.a;
import b.l.a.c.k.h;
import java.io.IOException;

public final class u0 implements a<Bundle, String> {
    public final /* synthetic */ t0 a;

    public u0(t0 t0Var) {
        this.a = t0Var;
    }

    public final Object a(@NonNull h hVar) {
        Bundle bundle = (Bundle) hVar.k(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
