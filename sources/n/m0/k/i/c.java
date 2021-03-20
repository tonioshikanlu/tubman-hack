package n.m0.k.i;

import b.q.a.a;
import e.t.g;
import e.t.p;
import e.x.c.i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import n.c0;
import n.m0.f.d;
import n.m0.j.e;

public final class c {
    public static final CopyOnWriteArraySet<Logger> a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f10391b;
    public static final c c = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = c0.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = c0.class.getName();
        i.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = e.class.getName();
        i.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = d.class.getName();
        i.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        i.e(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        f10391b = size != 0 ? size != 1 ? g.b0(linkedHashMap) : a.j3(linkedHashMap) : p.f7935h;
    }
}
