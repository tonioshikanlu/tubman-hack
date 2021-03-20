package b.e.a.a;

import android.net.Uri;
import android.util.JsonReader;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.renderscript.Allocation;
import androidx.renderscript.Element;
import b.f.a.e;
import com.segment.analytics.Analytics;
import com.segment.analytics.Options;
import com.segment.analytics.Properties;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.z.b;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.k;
import e.x.c.i;
import e.x.c.v;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: outline */
public class a {
    public static StringBuilder A(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder B(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder C(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder D(String str, h hVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(hVar);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder E(String str, k kVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(kVar);
        sb.append(str2);
        return sb;
    }

    public static q F(q qVar, q qVar2) {
        q.c z = q.z(qVar);
        z.m(qVar2);
        return z.l();
    }

    public static void G(int i2, HashMap hashMap, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        hashMap.put(str, Integer.valueOf(i2));
        hashMap.put(str2, Integer.valueOf(i3));
        hashMap.put(str3, Integer.valueOf(i4));
        hashMap.put(str4, Integer.valueOf(i5));
    }

    public static int H(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }

    public static void I(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    public static void J(String str, Fragment fragment, String str2) {
        Log.v(str2, str + fragment);
    }

    public static void K(String str, boolean z, Analytics analytics, String str2, Properties properties) {
        analytics.track(str2, properties, new Options().setIntegration(str, z));
    }

    public static void L(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean M(Allocation allocation, Element element) {
        return allocation.getType().getElement().isCompatible(element);
    }

    public static boolean N(b.C0203b bVar, int i2, String str) {
        Boolean f = bVar.d(i2);
        i.d(f, str);
        return f.booleanValue();
    }

    public static Analytics O(String str, String str2) {
        i.e(str, str2);
        return Analytics.with(e.c());
    }

    public static Properties P(String str, String str2, String str3, String str4, String str5, String str6) {
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, str);
        return b.a.a.e.a.b(str2, uuid).putValue(str3, (Object) str4).putValue(str5, (Object) str6);
    }

    public static String Q(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    public static String R(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb.toString();
    }

    public static String S(JsonReader jsonReader) {
        String nextName = jsonReader.nextName();
        nextName.hashCode();
        return nextName;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(int i2, int i3, int i4, int i5) {
        return i2 + i3 + i4 + i5;
    }

    public static String c(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String d(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    public static String e(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static String f(Object obj, StringBuilder sb, String str) {
        sb.append(obj.getClass().getName());
        sb.append(str);
        return sb.toString();
    }

    public static String g(String str, int i2) {
        return str + i2;
    }

    public static String h(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String i(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    public static String j(String str, long j2) {
        return str + j2;
    }

    public static String k(String str, Uri uri) {
        return str + uri;
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String s(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String t(h hVar, StringBuilder sb) {
        sb.append(v.a(hVar.getClass()));
        return sb.toString();
    }

    public static String u(k kVar, StringBuilder sb) {
        sb.append(v.a(kVar.getClass()));
        return sb.toString();
    }

    public static StringBuilder v(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        return ((i2 - i3) * i4) + i5;
    }

    public static StringBuilder x(int i2, String str) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        return sb;
    }

    public static StringBuilder y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder z(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }
}
