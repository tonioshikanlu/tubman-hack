package b.h.a.m.x.h;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.v.w;
import b.h.a.m.x.d.b;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f929b = 100;

    @Nullable
    public w<byte[]> a(@NonNull w<Bitmap> wVar, @NonNull p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.a, this.f929b, byteArrayOutputStream);
        wVar.recycle();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
