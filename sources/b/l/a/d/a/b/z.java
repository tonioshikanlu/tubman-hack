package b.l.a.d.a.b;

import android.os.ParcelFileDescriptor;
import b.l.a.c.b.a;
import b.l.a.d.a.e.c0;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class z {
    public final c0<n2> a;

    public z(c0<n2> c0Var) {
        this.a = c0Var;
    }

    public final InputStream a(int i2, String str, String str2, int i3) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a.d(this.a.a().b(i2, str, str2, i3));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new g0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}), i2);
        } catch (ExecutionException e2) {
            throw new g0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}), e2, i2);
        } catch (InterruptedException e3) {
            throw new g0("Extractor was interrupted while waiting for chunk file.", e3, i2);
        }
    }
}
