package b.o;

import androidx.core.app.NotificationCompat;
import b.e.a.a.a;

public class g4 extends f4 {
    public g4(String str, boolean z) {
        super(a.m(NotificationCompat.CATEGORY_EMAIL, str), z);
    }

    public void a() {
    }

    public f4 j(String str) {
        return new g4(str, false);
    }
}
