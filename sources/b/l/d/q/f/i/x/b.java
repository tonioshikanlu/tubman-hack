package b.l.d.q.f.i.x;

import android.util.Base64;
import android.util.JsonReader;
import b.l.d.q.f.i.e;
import b.l.d.q.f.i.x.h;
import b.l.d.s.a;
import java.util.Objects;

public final /* synthetic */ class b implements h.a {
    public static final b a = new b();

    public Object a(JsonReader jsonReader) {
        a aVar = h.a;
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null filename");
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                Objects.requireNonNull(bArr, "Null contents");
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " filename" : "";
        if (bArr == null) {
            str2 = b.e.a.a.a.m(str2, " contents");
        }
        if (str2.isEmpty()) {
            return new e(str, bArr, (e.a) null);
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str2));
    }
}
