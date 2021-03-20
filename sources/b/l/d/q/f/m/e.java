package b.l.d.q.f.m;

import android.content.Context;
import b.l.a.c.k.i;
import b.l.d.q.f.g.b0;
import b.l.d.q.f.g.l0;
import b.l.d.q.f.m.j.b;
import b.l.d.q.f.m.j.c;
import b.l.d.q.f.m.j.d;
import b.l.d.q.f.m.j.f;
import b.l.d.q.f.m.k.a;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class e implements f {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5274b;
    public final g c;
    public final l0 d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5275e;
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f5276g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<d> f5277h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<i<b.l.d.q.f.m.j.a>> f5278i = new AtomicReference<>(new i());

    public e(Context context, f fVar, l0 l0Var, g gVar, a aVar, a aVar2, b0 b0Var) {
        l0 l0Var2 = l0Var;
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f5277h = atomicReference;
        this.a = context;
        this.f5274b = fVar;
        this.d = l0Var2;
        this.c = gVar;
        this.f5275e = aVar;
        this.f = aVar2;
        this.f5276g = b0Var;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new b.l.d.q.f.m.j.e(b.b(l0Var2, 3600, jSONObject), (b.l.d.q.f.m.j.a) null, new c(jSONObject.optInt("max_custom_exception_events", 8), 4), new b(jSONObject.optBoolean("collect_reports", true)), 0, 3600));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.q.f.m.j.e a(b.l.d.q.f.m.c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            b.l.d.q.f.b r1 = b.l.d.q.f.b.a
            r2 = 6
            r3 = 0
            b.l.d.q.f.m.c r4 = b.l.d.q.f.m.c.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x0046 }
            boolean r4 = r4.equals(r11)     // Catch:{ Exception -> 0x0046 }
            if (r4 != 0) goto L_0x006c
            b.l.d.q.f.m.a r4 = r10.f5275e     // Catch:{ Exception -> 0x0046 }
            org.json.JSONObject r4 = r4.b()     // Catch:{ Exception -> 0x0046 }
            if (r4 == 0) goto L_0x005e
            b.l.d.q.f.m.g r5 = r10.c     // Catch:{ Exception -> 0x0046 }
            b.l.d.q.f.m.j.e r5 = r5.a(r4)     // Catch:{ Exception -> 0x0046 }
            if (r5 == 0) goto L_0x0052
            java.lang.String r6 = "Loaded cached settings: "
            r10.c(r4, r6)     // Catch:{ Exception -> 0x0046 }
            b.l.d.q.f.g.l0 r4 = r10.d     // Catch:{ Exception -> 0x0046 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x0046 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0046 }
            b.l.d.q.f.m.c r4 = b.l.d.q.f.m.c.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x0046 }
            boolean r11 = r4.equals(r11)     // Catch:{ Exception -> 0x0046 }
            if (r11 != 0) goto L_0x0048
            long r8 = r5.d     // Catch:{ Exception -> 0x0046 }
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r11 = 1
            goto L_0x003d
        L_0x003c:
            r11 = 0
        L_0x003d:
            if (r11 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            java.lang.String r11 = "Cached settings have expired."
        L_0x0042:
            r1.b(r11)     // Catch:{ Exception -> 0x0046 }
            goto L_0x006c
        L_0x0046:
            r11 = move-exception
            goto L_0x0061
        L_0x0048:
            java.lang.String r11 = "Returning cached settings."
            r1.b(r11)     // Catch:{ Exception -> 0x004f }
            r3 = r5
            goto L_0x006c
        L_0x004f:
            r11 = move-exception
            r3 = r5
            goto L_0x0061
        L_0x0052:
            java.lang.String r11 = "Failed to parse cached settings data."
            boolean r4 = r1.a(r2)     // Catch:{ Exception -> 0x0046 }
            if (r4 == 0) goto L_0x006c
            android.util.Log.e(r0, r11, r3)     // Catch:{ Exception -> 0x0046 }
            goto L_0x006c
        L_0x005e:
            java.lang.String r11 = "No cached settings data found."
            goto L_0x0042
        L_0x0061:
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "Failed to get cached settings"
            android.util.Log.e(r0, r1, r11)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.m.e.a(b.l.d.q.f.m.c):b.l.d.q.f.m.j.e");
    }

    public d b() {
        return this.f5277h.get();
    }

    public final void c(JSONObject jSONObject, String str) {
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        StringBuilder y = b.e.a.a.a.y(str);
        y.append(jSONObject.toString());
        bVar.b(y.toString());
    }
}
