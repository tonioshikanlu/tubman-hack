package b.h.a.m.w;

import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements n<byte[], Data> {
    public final C0030b<Data> a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: b.h.a.m.w.b$a$a  reason: collision with other inner class name */
        public class C0029a implements C0030b<ByteBuffer> {
            public C0029a(a aVar) {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @NonNull
        public n<byte[], ByteBuffer> b(@NonNull r rVar) {
            return new b(new C0029a(this));
        }
    }

    /* renamed from: b.h.a.m.w.b$b  reason: collision with other inner class name */
    public interface C0030b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements b.h.a.m.u.d<Data> {

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f791h;

        /* renamed from: i  reason: collision with root package name */
        public final C0030b<Data> f792i;

        public c(byte[] bArr, C0030b<Data> bVar) {
            this.f791h = bArr;
            this.f792i = bVar;
        }

        @NonNull
        public Class<Data> a() {
            return this.f792i.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super Data> aVar) {
            aVar.d(this.f792i.b(this.f791h));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0030b<InputStream> {
            public a(d dVar) {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @NonNull
        public n<byte[], InputStream> b(@NonNull r rVar) {
            return new b(new a(this));
        }
    }

    public b(C0030b<Data> bVar) {
        this.a = bVar;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new b.h.a.r.b(bArr), new c(bArr, this.a));
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
