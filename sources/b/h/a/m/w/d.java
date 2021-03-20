package b.h.a.m.w;

import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements n<File, ByteBuffer> {

    public static final class a implements b.h.a.m.u.d<ByteBuffer> {

        /* renamed from: h  reason: collision with root package name */
        public final File f793h;

        public a(File file) {
            this.f793h = file;
        }

        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(b.h.a.s.a.a(this.f793h));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        @NonNull
        public n<File, ByteBuffer> b(@NonNull r rVar) {
            return new d();
        }
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        File file = (File) obj;
        return new n.a(new b.h.a.r.b(file), new a(file));
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        File file = (File) obj;
        return true;
    }
}
