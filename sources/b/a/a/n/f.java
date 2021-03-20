package b.a.a.n;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.a.a.h.m;
import b.a.a.h.o;
import b.a.a.i.h;
import b.e.a.a.a;
import b.g.a.i.b.d;
import b.g.a.i.b.e;
import b.g.a.k.b;
import b.h.a.m.x.c.w;
import b.j.a.a.r;
import b.j.a.c.j0.g;
import b.l.e.k;
import b.l.e.l;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.States;
import com.appfoundry.previewer.model.Store;
import com.appfoundry.previewer.model.Style;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import e.x.c.i;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {
    public static final void A(Map<String, List<h>> map, String str) {
        i.e(map, "$this$hideDefaultStateSet");
        List<h> list = map.get("default");
        if (list != null) {
            for (h hVar : list) {
                i.e(hVar, "$this$hideIfStateSetId");
                i.e(hVar, "$this$hasStateSetId");
                if (i.a(hVar.a.s, str)) {
                    z(hVar);
                } else {
                    M(hVar);
                }
            }
        }
    }

    public static void B(String str, String str2) {
        Log.i(v(str), str2);
    }

    public static boolean C(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean D(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static String E(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        while (true) {
            i2++;
            if (i2 >= length) {
                break;
            }
            char charAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append(str, i2, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String F(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static String G(b.j.a.c.e0.i iVar, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> e2 = iVar.e();
        if (e2 == Boolean.class || e2 == Boolean.TYPE) {
            return z ? O(str, 2) : E(str, 2);
        }
        return null;
    }

    public static String H(b.j.a.c.e0.i iVar, String str, boolean z) {
        String d = iVar.d();
        if (!d.startsWith(str)) {
            return null;
        }
        int length = str.length();
        return z ? O(d, length) : E(d, length);
    }

    public static String I(b.j.a.c.e0.i iVar, String str, boolean z) {
        String q2;
        if (!str.startsWith("get")) {
            return null;
        }
        boolean z2 = true;
        if ("getCallbacks".equals(str)) {
            Class<?> e2 = iVar.e();
            if (!e2.isArray() || (q2 = g.q(e2.getComponentType())) == null || !q2.contains(".cglib") || (!q2.startsWith("net.sf.cglib") && !q2.startsWith("org.hibernate.repackage.cglib") && !q2.startsWith("org.springframework.cglib"))) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
        } else if ("getMetaClass".equals(str)) {
            String q3 = g.q(iVar.e());
            if (q3 == null || !q3.startsWith("groovy.lang")) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
        }
        return z ? O(str, 3) : E(str, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <TInput, TResult, TException extends java.lang.Throwable> TResult J(int r5, TInput r6, b.l.a.a.e.b<TInput, TResult, TException> r7, b.l.a.a.f.p.a<TInput, TResult> r8) {
        /*
            r8 = 1
            if (r5 >= r8) goto L_0x0008
            java.lang.Object r5 = r7.a(r6)
            return r5
        L_0x0008:
            java.lang.Object r0 = r7.a(r6)
            b.l.a.a.e.d$a r6 = (b.l.a.a.e.d.a) r6
            r1 = r0
            b.l.a.a.e.d$b r1 = (b.l.a.a.e.d.b) r1
            java.net.URL r2 = r1.f2395b
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r4 = "Following redirect to: %s"
            c(r3, r4, r2)
            java.net.URL r1 = r1.f2395b
            b.l.a.a.e.d$a r2 = new b.l.a.a.e.d$a
            b.l.a.a.e.e.j r3 = r6.f2394b
            java.lang.String r6 = r6.c
            r2.<init>(r1, r3, r6)
            r6 = r2
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r6 == 0) goto L_0x0030
            int r5 = r5 + -1
            if (r5 >= r8) goto L_0x0008
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.n.f.J(int, java.lang.Object, b.l.a.a.e.b, b.l.a.a.f.p.a):java.lang.Object");
    }

    public static final void K(Map<String, List<h>> map, String str, boolean z) {
        i.e(map, "$this$setAll");
        i.e(str, "stateType");
        List<h> list = map.get(str);
        if (list != null) {
            for (h hVar : list) {
                if (z) {
                    M(hVar);
                } else {
                    z(hVar);
                }
            }
        }
    }

    public static final void L(String str) {
        Page page;
        App app2;
        Data data;
        List<Page> list;
        String str2 = str;
        if (str2 != null && m.h(str)) {
            BravoApp.b bVar = BravoApp.Q;
            Map<String, Page> map = BravoApp.f6916p;
            if ((map != null ? map.get(str2) : null) == null) {
                i.e(str2, "hrefRemote");
                i.e(str2, "$this$getPageIdFromHrefRemote");
                String substring = str2.substring(m.k(str2, "/", 7, false, 4) + 1, e.c0.h.d(str2, "?", false, 2) ? m.k(str2, "?", 1, false, 4) : str.length() > 0 ? str.length() : 0);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Page n2 = n(substring);
                Page page2 = r0;
                Page page3 = new Page(str, a.m("remotePage:", str2), n2 != null ? n2.c : null, (Container) null, (Container) null, (List) null, (List) null, (Container) null, (Container) null, Boolean.FALSE, str, (String) null, n2 != null ? n2.f7134m : null, (String) null, (List) null, (States) null, (String) null, n2 != null ? n2.r : null, (String) null, (String) null, n2 != null ? n2.u : null, false, (List) null, false, (String) null, false, 65011712, (DefaultConstructorMarker) null);
                JsonApp f = c.f();
                if (f == null || (app2 = f.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null) {
                    page = page2;
                } else {
                    i.e(list, "$this$addOrReplace");
                    page = page2;
                    i.e(page, "newPage");
                    if (list.contains(page)) {
                        Iterator<Page> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Page next = it.next();
                            if (i.a(next.a, page.a)) {
                                list.remove(next);
                                break;
                            }
                        }
                    }
                    list.add(page);
                }
                BravoApp.b bVar2 = BravoApp.Q;
                Map<String, Page> map2 = BravoApp.f6916p;
                if (map2 != null) {
                    Page put = map2.put(str, page);
                }
            }
        }
    }

    public static final void M(h hVar) {
        i.e(hVar, "$this$show");
        o.l(hVar.f318b);
    }

    public static final void N(Map<String, List<h>> map, String str) {
        i.e(map, "$this$showActiveStateSet");
        List<h> list = map.get("active");
        if (list != null) {
            for (h hVar : list) {
                i.e(hVar, "$this$showIfStateSetId");
                i.e(hVar, "$this$hasStateSetId");
                if (i.a(hVar.a.s, str)) {
                    M(hVar);
                } else {
                    z(hVar);
                }
            }
        }
    }

    public static String O(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        int i3 = i2 + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        sb.append(str, i3, length);
        return sb.toString();
    }

    public static k a() {
        Type type = new e().f5519b;
        l lVar = new l();
        lVar.f5561e.add(new b());
        lVar.b(b.g.a.j.b.class, new b.g.a.i.b.m());
        lVar.b(b.g.a.j.a.class, new d());
        lVar.b(type, new b.g.a.i.b.g());
        lVar.f5562g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        return lVar.a();
    }

    public static void b(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, String str2, Object obj) {
        Log.d(v(str), String.format(str2, new Object[]{obj}));
    }

    public static void d(String str, String str2, Object... objArr) {
        Log.d(v(str), String.format(str2, objArr));
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(v(str), str2, th);
    }

    public static final String f(Map<String, List<h>> map, String str) {
        Object obj;
        Component component;
        i.e(map, "$this$findStateSetIdToShow");
        List list = map.get("default");
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            h hVar = (h) obj;
            i.e(hVar, "$this$hasHref");
            if (i.a(hVar.a.f7084e, str)) {
                break;
            }
        }
        h hVar2 = (h) obj;
        if (hVar2 == null || (component = hVar2.a) == null) {
            return null;
        }
        return component.s;
    }

    public static final String g() {
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        if (jsonApp != null) {
            return jsonApp.a;
        }
        return null;
    }

    public static final Asset h(String str, Boolean bool) {
        App app2;
        List<Asset> list;
        BravoApp.b bVar = BravoApp.Q;
        T t = null;
        if (BravoApp.w || BravoApp.x || i.a(bool, Boolean.TRUE)) {
            JsonApp h2 = c.h();
            if (h2 == null || (app2 = h2.d) == null || (list = app2.f7061b) == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i.a(((Asset) next).a, str)) {
                    t = next;
                    break;
                }
            }
            return (Asset) t;
        }
        Map<String, Asset> map = BravoApp.r;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static Object i(b.j.a.c.i iVar) {
        Class<?> cls = iVar.f2152h;
        Class<?> z = g.z(cls);
        if (z != null) {
            if (z == Integer.TYPE) {
                return 0;
            }
            if (z == Long.TYPE) {
                return 0L;
            }
            if (z == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (z == Double.TYPE) {
                return Double.valueOf(ShadowDrawableWrapper.COS_45);
            }
            if (z == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (z == Byte.TYPE) {
                return (byte) 0;
            }
            if (z == Short.TYPE) {
                return (short) 0;
            }
            if (z == Character.TYPE) {
                return 0;
            }
            throw new IllegalArgumentException(a.e(z, a.y("Class "), " is not a primitive type"));
        } else if (iVar.A() || iVar.b()) {
            return r.a.NON_EMPTY;
        } else {
            if (cls == String.class) {
                return "";
            }
            if (iVar.I(Date.class)) {
                return new Date(0);
            }
            if (!iVar.I(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }
    }

    public static final Page j() {
        App app2;
        Data data;
        List<Page> list;
        boolean z;
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        T t = null;
        if (jsonApp == null || (app2 = jsonApp.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Page page = (Page) next;
            i.e(page, "$this$hasTagWithExactName");
            i.e("state:loading", "tag");
            List<String> list2 = page.f7134m;
            if (list2 != null) {
                i.c(list2);
                Iterator<String> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    z = true;
                    if (e.c0.h.f(it2.next(), "state:loading", true)) {
                        continue;
                        break;
                    }
                }
            }
            z = false;
            continue;
            if (z) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = (r2 = r0.d).f7062e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Page k() {
        /*
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.appfoundry.previewer.model.App r2 = r0.d
            if (r2 == 0) goto L_0x0012
            com.appfoundry.previewer.model.Data r2 = r2.f7062e
            if (r2 == 0) goto L_0x0012
            java.util.List<com.appfoundry.previewer.model.Page> r2 = r2.f7108b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            if (r2 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x0022
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            e.x.c.i.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            java.lang.String r3 = r2.f7135n
            if (r3 != 0) goto L_0x0042
            java.lang.String r3 = "intro"
            boolean r3 = b.a.a.h.e.x(r2, r3)
            if (r3 == 0) goto L_0x002a
        L_0x0042:
            return r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.n.f.k():com.appfoundry.previewer.model.Page");
    }

    public static int l(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull b.h.a.m.v.c0.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m(list, new b.h.a.m.i(inputStream, bVar));
    }

    public static int m(@NonNull List<ImageHeaderParser> list, b.h.a.m.k kVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a = kVar.a(list.get(i2));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    public static final Page n(String str) {
        BravoApp.b bVar = BravoApp.Q;
        if (BravoApp.w || BravoApp.x || c.s()) {
            return p(str);
        }
        Map<String, Page> map = BravoApp.f6916p;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static final Page o(String str) {
        App app2;
        Data data;
        List<Page> list;
        i.e(str, "tag");
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        T t = null;
        if (jsonApp == null || (app2 = jsonApp.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (b.a.a.h.e.x((Page) next, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    public static final Page p(String str) {
        App app2;
        Data data;
        List<Page> list;
        JsonApp h2 = c.h();
        T t = null;
        if (h2 == null || (app2 = h2.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (i.a(((Page) next).a, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    public static final Page q(String str) {
        App app2;
        Data data;
        List<Page> list;
        i.e(str, "tag");
        JsonApp h2 = c.h();
        T t = null;
        if (h2 == null || (app2 = h2.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (b.a.a.h.e.x((Page) next, str)) {
                t = next;
                break;
            }
        }
        return (Page) t;
    }

    public static final Integer r() {
        App app2;
        Store store;
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        if (jsonApp == null || (app2 = jsonApp.d) == null || (store = app2.c) == null) {
            return null;
        }
        return store.f;
    }

    public static final Page s() {
        return q("error:remotePage");
    }

    public static final Style t(String str, Boolean bool) {
        App app2;
        List<Style> list;
        BravoApp.b bVar = BravoApp.Q;
        T t = null;
        if (BravoApp.w || BravoApp.x || i.a(bool, Boolean.TRUE)) {
            JsonApp h2 = c.h();
            if (h2 == null || (app2 = h2.d) == null || (list = app2.f) == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i.a(((Style) next).a, str)) {
                    t = next;
                    break;
                }
            }
            return (Style) t;
        }
        Map<String, Style> map = BravoApp.f6917q;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static /* synthetic */ Style u(String str, Boolean bool, int i2) {
        return t(str, (i2 & 2) != 0 ? Boolean.FALSE : null);
    }

    public static String v(String str) {
        return a.m("TransportRuntime.", str);
    }

    @NonNull
    public static ImageHeaderParser.ImageType w(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull b.h.a.m.v.c0.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return x(list, new b.h.a.m.f(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType x(@NonNull List<ImageHeaderParser> list, b.h.a.m.l lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a = lVar.a(list.get(i2));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean y(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final void z(h hVar) {
        i.e(hVar, "$this$hide");
        o.e(hVar.f318b);
    }
}
