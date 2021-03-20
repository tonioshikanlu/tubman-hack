package b.h.a.m.v.d0;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import b.h.a.m.m;
import b.h.a.s.g;
import b.h.a.s.j;
import b.h.a.s.k.a;
import b.h.a.s.k.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class k {
    public final g<m, String> a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final Pools.Pool<b> f667b = b.h.a.s.k.a.a(10, new a(this));

    public class a implements a.b<b> {
        public a(k kVar) {
        }

        public Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: h  reason: collision with root package name */
        public final MessageDigest f668h;

        /* renamed from: i  reason: collision with root package name */
        public final d f669i = new d.b();

        public b(MessageDigest messageDigest) {
            this.f668h = messageDigest;
        }

        @NonNull
        public d j() {
            return this.f669i;
        }
    }

    public String a(m mVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(mVar);
        }
        if (a2 == null) {
            b acquire = this.f667b.acquire();
            Objects.requireNonNull(acquire, "Argument must not be null");
            b bVar = acquire;
            try {
                mVar.b(bVar.f668h);
                byte[] digest = bVar.f668h.digest();
                char[] cArr = j.f1018b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        byte b2 = digest[i2] & ExifInterface.MARKER;
                        int i3 = i2 * 2;
                        char[] cArr2 = j.a;
                        cArr[i3] = cArr2[b2 >>> 4];
                        cArr[i3 + 1] = cArr2[b2 & 15];
                    }
                    a2 = new String(cArr);
                }
                this.f667b.release(bVar);
            } catch (Throwable th) {
                this.f667b.release(bVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.d(mVar, a2);
        }
        return a2;
    }
}
