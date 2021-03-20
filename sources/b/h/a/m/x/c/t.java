package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.s.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(api = 28)
public final class t implements r<InputStream, Bitmap> {
    public final d a = new d();

    @Nullable
    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.a.a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i2, i3, pVar);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj, @NonNull p pVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
