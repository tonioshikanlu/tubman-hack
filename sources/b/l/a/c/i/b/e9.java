package b.l.a.c.i.b;

import android.content.Context;
import java.util.Objects;

public final class e9 {
    public final Context a;

    public e9(Context context) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.a = applicationContext;
    }
}
