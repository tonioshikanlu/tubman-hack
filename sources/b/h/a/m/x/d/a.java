package b.h.a.m.x.d;

import androidx.annotation.NonNull;
import b.h.a.m.u.e;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    /* renamed from: b.h.a.m.x.d.a$a  reason: collision with other inner class name */
    public static class C0035a implements e.a<ByteBuffer> {
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @NonNull
        public e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @NonNull
    public Object a() {
        this.a.position(0);
        return this.a;
    }

    public void b() {
    }
}
