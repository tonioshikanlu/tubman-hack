package b.l.a.d.a.g;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;

public final class a extends ReviewInfo {

    /* renamed from: h  reason: collision with root package name */
    public final PendingIntent f4682h;

    public a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f4682h = pendingIntent;
    }

    public final PendingIntent a() {
        return this.f4682h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f4682h.equals(((ReviewInfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4682h.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4682h);
        return b.e.a.a.a.r(new StringBuilder(valueOf.length() + 26), "ReviewInfo{pendingIntent=", valueOf, "}");
    }
}
