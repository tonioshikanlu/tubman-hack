package b.l.d.y;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import com.segment.analytics.AnalyticsContext;
import java.util.Arrays;

public class b {
    public String a;

    public b(@Nullable String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return a.T(this.a, ((b) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a(AnalyticsContext.Device.DEVICE_TOKEN_KEY, this.a);
        return rVar.toString();
    }
}
