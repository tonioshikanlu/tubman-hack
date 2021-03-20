package b.h.a.m;

import b.h.a.m.v.c0.b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

public class i implements k {
    public final /* synthetic */ InputStream a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f581b;

    public i(InputStream inputStream, b bVar) {
        this.a = inputStream;
        this.f581b = bVar;
    }

    public int a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.b(this.a, this.f581b);
        } finally {
            this.a.reset();
        }
    }
}
