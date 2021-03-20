package b.g.a.h;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

public class e {
    public static final String c = "e";
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f423b;

    public e(@Nullable Intent intent) {
        this.f423b = intent;
        this.a = a() != null ? -1 : 0;
    }

    @Nullable
    public Uri a() {
        Intent intent = this.f423b;
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    public boolean b() {
        return this.a == 0 && this.f423b != null && a() == null;
    }
}
