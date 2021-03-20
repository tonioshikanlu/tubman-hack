package b.l.a.c.i.b;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.t8;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Objects;

public final class c8 extends u8 {
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3955e;
    public long f;

    public c8(d9 d9Var) {
        super(d9Var);
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final Pair<String, Boolean> l(String str, g gVar) {
        t8.b();
        return (!this.a.f4114g.r((String) null, x2.y0) || gVar.d()) ? m(str) : new Pair<>("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final Pair<String, Boolean> m(String str) {
        h();
        Objects.requireNonNull((c) this.a.f4121n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.d;
        if (str2 != null && elapsedRealtime < this.f) {
            return new Pair<>(str2, Boolean.valueOf(this.f3955e));
        }
        this.f = this.a.f4114g.o(str, x2.f4340b) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.a);
            if (advertisingIdInfo != null) {
                this.d = advertisingIdInfo.getId();
                this.f3955e = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.d == null) {
                this.d = "";
            }
        } catch (Exception e2) {
            this.a.a().f4095m.b("Unable to get advertising id", e2);
            this.d = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.d, Boolean.valueOf(this.f3955e));
    }

    @WorkerThread
    @Deprecated
    public final String n(String str) {
        h();
        String str2 = (String) m(str).first;
        MessageDigest B = k9.B();
        if (B == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, B.digest(str2.getBytes()))});
    }
}
