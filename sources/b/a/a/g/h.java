package b.a.a.g;

import androidx.core.app.NotificationCompat;
import b.e.a.a.a;
import e.x.c.i;

public final class h {
    public final String a;

    public h(String str) {
        i.e(str, NotificationCompat.CATEGORY_EMAIL);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && i.a(this.a, ((h) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.q(a.y("EmailEvent(email="), this.a, ")");
    }
}
