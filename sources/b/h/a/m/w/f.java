package b.h.a.m.w;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @NonNull
        public final n<File, Data> b(@NonNull r rVar) {
            return new f(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public Object b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public void c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements b.h.a.m.u.d<Data> {

        /* renamed from: h  reason: collision with root package name */
        public final File f797h;

        /* renamed from: i  reason: collision with root package name */
        public final d<Data> f798i;

        /* renamed from: j  reason: collision with root package name */
        public Data f799j;

        public c(File file, d<Data> dVar) {
            this.f797h = file;
            this.f798i = dVar;
        }

        @NonNull
        public Class<Data> a() {
            return this.f798i.a();
        }

        public void b() {
            Data data = this.f799j;
            if (data != null) {
                try {
                    this.f798i.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull b.h.a.f fVar, @NonNull d.a<? super Data> aVar) {
            try {
                Data b2 = this.f798i.b(this.f797h);
                this.f799j = b2;
                aVar.d(b2);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(File file) {
                return new FileInputStream(file);
            }

            public void c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        File file = (File) obj;
        return new n.a(new b.h.a.r.b(file), new c(file, this.a));
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        File file = (File) obj;
        return true;
    }
}
