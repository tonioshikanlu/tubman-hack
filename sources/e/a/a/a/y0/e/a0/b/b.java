package e.a.a.a.y0.e.a0.b;

import androidx.exifinterface.media.ExifInterface;
import e.a0.e;
import e.c0.h;
import e.r;
import e.t.g;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import e.x.c.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b {
    public static final String a = g.x(g.B('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f8762b;
    public static final b c = new b();

    public static final class a extends k implements p<String, String, r> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Map f8763h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Map map) {
            super(2);
            this.f8763h = map;
        }

        public final void a(String str, String str2) {
            i.e(str, "kotlinSimpleName");
            i.e(str2, "javaInternalName");
            Map map = this.f8763h;
            StringBuilder sb = new StringBuilder();
            b bVar = b.c;
            sb.append(b.a);
            sb.append('/');
            sb.append(str);
            String sb2 = sb.toString();
            map.put(sb2, 'L' + str2 + ';');
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (String) obj2);
            return r.a;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List B = g.B("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        e.a0.b c2 = e.c(g.r(B), 2);
        int i2 = c2.f7883h;
        int i3 = c2.f7884i;
        int i4 = c2.f7885j;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) B.get(i2));
                int i5 = i2 + 1;
                linkedHashMap.put(sb.toString(), B.get(i5));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                String q2 = b.e.a.a.a.q(sb2, (String) B.get(i2), "Array");
                StringBuilder v = b.e.a.a.a.v('[');
                v.append((String) B.get(i5));
                linkedHashMap.put(q2, v.toString());
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        linkedHashMap.put(a + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        a aVar = new a(linkedHashMap);
        aVar.a("Any", "java/lang/Object");
        aVar.a("Nothing", "java/lang/Void");
        aVar.a("Annotation", "java/lang/annotation/Annotation");
        for (String str2 : g.B("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            aVar.a(str2, "java/lang/" + str2);
        }
        for (String str3 : g.B("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            aVar.a(b.e.a.a.a.m("collections/", str3), "java/util/" + str3);
            aVar.a("collections/Mutable" + str3, "java/util/" + str3);
        }
        aVar.a("collections/Iterable", "java/lang/Iterable");
        aVar.a("collections/MutableIterable", "java/lang/Iterable");
        aVar.a("collections/Map.Entry", "java/util/Map$Entry");
        aVar.a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i6 = 0; i6 <= 22; i6++) {
            String g2 = b.e.a.a.a.g("Function", i6);
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i6);
            aVar.a(g2, sb3.toString());
            aVar.a("reflect/KFunction" + i6, str4 + "/reflect/KFunction");
        }
        for (String str5 : g.B("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            aVar.a(b.e.a.a.a.m(str5, ".Companion"), a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f8762b = linkedHashMap;
    }

    public static final String a(String str) {
        i.e(str, "classId");
        String str2 = f8762b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder v = b.e.a.a.a.v('L');
        v.append(h.v(str, '.', '$', false, 4));
        v.append(';');
        return v.toString();
    }
}
