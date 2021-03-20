package b.l.a.c.c.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import java.util.Objects;

public abstract class k {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static k f2798b;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final Uri f2799e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2800b;
        public final int c;
        public final boolean d;

        public a(String str, String str2, int i2) {
            b.l.a.c.b.a.x(str);
            this.a = str;
            b.l.a.c.b.a.x(str2);
            this.f2800b = str2;
            this.c = i2;
            this.d = false;
        }

        public a(String str, String str2, int i2, boolean z) {
            b.l.a.c.b.a.x(str);
            this.a = str;
            b.l.a.c.b.a.x(str2);
            this.f2800b = str2;
            this.c = i2;
            this.d = z;
        }

        public final Intent a(Context context) {
            Intent intent = null;
            if (this.a == null) {
                return new Intent().setComponent((ComponentName) null);
            }
            if (this.d) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.a);
                Bundle call = context.getContentResolver().call(f2799e, "serviceIntentCall", (String) null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return intent == null ? new Intent(this.a).setPackage(this.f2800b) : intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return b.l.a.c.b.a.T(this.a, aVar.a) && b.l.a.c.b.a.T(this.f2800b, aVar.f2800b) && b.l.a.c.b.a.T((Object) null, (Object) null) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.f2800b, null, Integer.valueOf(this.c), Boolean.valueOf(this.d)});
        }

        public final String toString() {
            String str = this.a;
            Objects.requireNonNull(str);
            return str;
        }
    }

    public static k a(Context context) {
        synchronized (a) {
            if (f2798b == null) {
                f2798b = new f0(context.getApplicationContext());
            }
        }
        return f2798b;
    }

    public abstract boolean b(a aVar, ServiceConnection serviceConnection, String str);

    public abstract void c(a aVar, ServiceConnection serviceConnection, String str);
}
