package b.l.d.q.f.i.x;

import android.util.JsonReader;
import b.l.d.q.f.i.c;
import b.l.d.q.f.i.x.h;
import b.l.d.s.a;
import java.util.Objects;

public final /* synthetic */ class c implements h.a {
    public static final c a = new c();

    public Object a(JsonReader jsonReader) {
        a aVar = h.a;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = b.e.a.a.a.m(str3, " value");
        }
        if (str3.isEmpty()) {
            return new b.l.d.q.f.i.c(str, str2, (c.a) null);
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str3));
    }
}
