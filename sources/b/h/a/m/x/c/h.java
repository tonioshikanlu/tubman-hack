package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import java.nio.ByteBuffer;

@RequiresApi(api = 28)
public final class h implements r<ByteBuffer, Bitmap> {
    public final d a = new d();

    @Nullable
    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, pVar);
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj, @NonNull p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
