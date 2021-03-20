package b.h.a.m.w;

import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.m.d;
import b.h.a.m.p;
import b.h.a.s.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements d<ByteBuffer> {
    public boolean a(@NonNull Object obj, @NonNull File file, @NonNull p pVar) {
        try {
            a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
