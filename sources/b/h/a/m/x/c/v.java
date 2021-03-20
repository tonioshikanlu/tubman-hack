package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.m.x.c.s;
import java.util.Objects;

@RequiresApi(21)
public final class v implements r<ParcelFileDescriptor, Bitmap> {
    public final m a;

    public v(m mVar) {
        this.a = mVar;
    }

    @Nullable
    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        m mVar = this.a;
        return mVar.a(new s.b((ParcelFileDescriptor) obj, mVar.d, mVar.c), i2, i3, pVar, m.f868k);
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        Objects.requireNonNull(this.a);
        return true;
    }
}
