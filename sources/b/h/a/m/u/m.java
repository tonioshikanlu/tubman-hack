package b.h.a.m.u;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import b.h.a.m.u.e;
import java.io.IOException;
import java.util.Objects;

public final class m implements e<ParcelFileDescriptor> {
    public final b a;

    @RequiresApi(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @NonNull
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @NonNull
        public e b(@NonNull Object obj) {
            return new m((ParcelFileDescriptor) obj);
        }
    }

    @RequiresApi(21)
    public static final class b {
        public final ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }
    }

    @RequiresApi(21)
    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public void b() {
    }

    @RequiresApi(21)
    @NonNull
    /* renamed from: c */
    public ParcelFileDescriptor a() {
        b bVar = this.a;
        Objects.requireNonNull(bVar);
        try {
            Os.lseek(bVar.a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
            return bVar.a;
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }
}
