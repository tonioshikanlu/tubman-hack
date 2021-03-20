package b.l.d.q.f.i.x;

import android.util.JsonReader;
import b.l.d.q.f.i.p;
import b.l.d.q.f.i.w;
import b.l.d.q.f.i.x.h;
import b.l.d.s.a;
import java.util.Objects;

public final /* synthetic */ class d implements h.a {
    public static final d a = new d();

    public Object a(JsonReader jsonReader) {
        a aVar = h.a;
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        w wVar = null;
        while (jsonReader.hasNext()) {
            String S = b.e.a.a.a.S(jsonReader);
            char c = 65535;
            switch (S.hashCode()) {
                case -1266514778:
                    if (S.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (S.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (S.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    wVar = h.a(jsonReader, g.a);
                    break;
                case 1:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 2:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " name" : "";
        if (num == null) {
            str2 = b.e.a.a.a.m(str2, " importance");
        }
        if (wVar == null) {
            str2 = b.e.a.a.a.m(str2, " frames");
        }
        if (str2.isEmpty()) {
            return new p(str, num.intValue(), wVar, (p.a) null);
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str2));
    }
}
