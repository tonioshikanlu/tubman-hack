package b.h.a.m.x.g;

import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.m.c;
import b.h.a.m.p;
import b.h.a.m.s;
import b.h.a.m.v.w;
import b.h.a.s.a;
import java.io.File;
import java.io.IOException;

public class d implements s<c> {
    public boolean a(@NonNull Object obj, @NonNull File file, @NonNull p pVar) {
        try {
            a.b(((c) ((w) obj).get()).f899h.a.a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @NonNull
    public c b(@NonNull p pVar) {
        return c.SOURCE;
    }
}
