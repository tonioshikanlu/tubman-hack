package b.h.a.m.x.g;

import android.util.Log;
import androidx.annotation.NonNull;
import b.a.a.n.f;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.c0.b;
import b.h.a.m.v.w;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements r<InputStream, c> {
    public final List<ImageHeaderParser> a;

    /* renamed from: b  reason: collision with root package name */
    public final r<ByteBuffer, c> f928b;
    public final b c;

    public j(List<ImageHeaderParser> list, r<ByteBuffer, c> rVar, b bVar) {
        this.a = list;
        this.f928b = rVar;
        this.c = bVar;
    }

    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f928b.a(ByteBuffer.wrap(bArr), i2, i3, pVar);
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        return !((Boolean) pVar.c(i.f927b)).booleanValue() && f.w(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
