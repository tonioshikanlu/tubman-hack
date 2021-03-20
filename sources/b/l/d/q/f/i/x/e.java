package b.l.d.q.f.i.x;

import android.util.Base64;
import android.util.JsonReader;
import b.l.d.q.f.i.m;
import b.l.d.q.f.i.v;
import b.l.d.q.f.i.x.h;
import b.l.d.s.a;
import java.util.Objects;

public final /* synthetic */ class e implements h.a {
    public static final e a = new e();

    public Object a(JsonReader jsonReader) {
        a aVar = h.a;
        jsonReader.beginObject();
        Long l2 = null;
        Long l3 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String S = b.e.a.a.a.S(jsonReader);
            char c = 65535;
            switch (S.hashCode()) {
                case 3373707:
                    if (S.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (S.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (S.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (S.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 1:
                    l3 = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), v.a);
                    break;
                case 3:
                    l2 = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = l2 == null ? " baseAddress" : "";
        if (l3 == null) {
            str3 = b.e.a.a.a.m(str3, " size");
        }
        if (str == null) {
            str3 = b.e.a.a.a.m(str3, " name");
        }
        if (str3.isEmpty()) {
            return new m(l2.longValue(), l3.longValue(), str, str2, (m.a) null);
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str3));
    }
}
