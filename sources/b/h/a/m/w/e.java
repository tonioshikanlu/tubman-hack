package b.h.a.m.w;

import android.util.Base64;
import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    public interface a<Data> {
    }

    public static final class b<Data> implements d<Data> {

        /* renamed from: h  reason: collision with root package name */
        public final String f794h;

        /* renamed from: i  reason: collision with root package name */
        public final a<Data> f795i;

        /* renamed from: j  reason: collision with root package name */
        public Data f796j;

        public b(String str, a<Data> aVar) {
            this.f794h = str;
            this.f795i = aVar;
        }

        @NonNull
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f795i);
            return InputStream.class;
        }

        public void b() {
            try {
                a<Data> aVar = this.f795i;
                Data data = this.f796j;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super Data> aVar) {
            try {
                Data a = ((c.a) this.f795i).a(this.f794h);
                this.f796j = a;
                aVar.d(a);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @NonNull
        public n<Model, InputStream> b(@NonNull r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    public n.a<Data> a(@NonNull Model model, int i2, int i3, @NonNull p pVar) {
        return new n.a<>(new b.h.a.r.b(model), new b(model.toString(), this.a));
    }

    public boolean b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}
