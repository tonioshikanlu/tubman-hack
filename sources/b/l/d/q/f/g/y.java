package b.l.d.q.f.g;

import android.content.Context;
import b.e.a.a.a;
import b.l.d.q.f.i.n;
import b.l.d.q.f.i.p;
import b.l.d.q.f.i.q;
import b.l.d.q.f.i.v;
import b.l.d.q.f.i.w;
import b.l.d.q.f.n.d;
import b.l.d.q.f.n.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class y {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Integer> f5131e;
    public static final String f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.3.1"});
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f5132b;
    public final a c;
    public final d d;

    static {
        HashMap hashMap = new HashMap();
        f5131e = hashMap;
        a.G(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
    }

    public y(Context context, f0 f0Var, a aVar, d dVar) {
        this.a = context;
        this.f5132b = f0Var;
        this.c = aVar;
        this.d = dVar;
    }

    public final v.d.C0082d.a.b.C0085b a(e eVar, int i2, int i3, int i4) {
        String str = eVar.f5287b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.d;
        if (i4 >= i3) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.d;
                i5++;
            }
        }
        v.d.C0082d.a.b.C0085b bVar = null;
        Objects.requireNonNull(str, "Null type");
        w wVar = new w(b(stackTraceElementArr, i2));
        Integer valueOf = Integer.valueOf(i5);
        if (eVar2 != null && i5 == 0) {
            bVar = a(eVar2, i2, i3, i4 + 1);
        }
        String str3 = valueOf == null ? " overflowCount" : "";
        if (str3.isEmpty()) {
            return new n(str, str2, wVar, bVar, valueOf.intValue(), (n.a) null);
        }
        throw new IllegalStateException(a.m("Missing required properties:", str3));
    }

    public final w<v.d.C0082d.a.b.C0086d.C0087a> b(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            q.b bVar = new q.b();
            bVar.f5249e = Integer.valueOf(i2);
            long j2 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = (long) stackTraceElement.getLineNumber();
            }
            bVar.a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            bVar.f5248b = str;
            bVar.c = fileName;
            bVar.d = Long.valueOf(j2);
            arrayList.add(bVar.a());
        }
        return new w<>(arrayList);
    }

    public final v.d.C0082d.a.b.C0086d c(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        Integer valueOf = Integer.valueOf(i2);
        w wVar = new w(b(stackTraceElementArr, i2));
        String str = valueOf == null ? " importance" : "";
        if (str.isEmpty()) {
            return new p(name, valueOf.intValue(), wVar, (p.a) null);
        }
        throw new IllegalStateException(a.m("Missing required properties:", str));
    }
}
