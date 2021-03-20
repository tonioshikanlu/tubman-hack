package b.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.o.i2;
import b.o.n;
import b.o.u4.e;
import b.o.u4.f.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

public class y1 {
    public e a;

    /* renamed from: b  reason: collision with root package name */
    public b f6357b;
    public j1 c;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ List f6358h;

        public a(List list) {
            this.f6358h = list;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            b bVar = y1.this.f6357b;
            List list = this.f6358h;
            Objects.requireNonNull((i2.b) bVar);
            if (i2.w == null) {
                i2.a(i2.k.WARN, "OneSignal onSessionEnding called before init!", (Throwable) null);
            }
            r1 r1Var = i2.w;
            if (r1Var != null) {
                i2.a(i2.k.DEBUG, "OneSignal cleanOutcomes for session", (Throwable) null);
                r1Var.a = f2.p();
                r1Var.a();
            }
            n a = n.a();
            n.b bVar2 = n.b.END_SESSION;
            if (!a.b(list, bVar2)) {
                for (n.d next : a.f6203b) {
                    Objects.requireNonNull(next);
                    if (i2.r() != null) {
                        next.i(bVar2);
                    }
                }
            }
        }
    }

    public interface b {
    }

    public y1(@NonNull b bVar, e eVar, j1 j1Var) {
        this.f6357b = bVar;
        this.a = eVar;
        this.c = j1Var;
    }

    public final void a(i2.f fVar, @Nullable String str) {
        b.o.u4.f.a aVar;
        ((i1) this.c).a("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + fVar);
        e eVar = this.a;
        Objects.requireNonNull(eVar);
        b.o.u4.a d = fVar.equals(i2.f.NOTIFICATION_CLICK) ? eVar.d() : null;
        List<b.o.u4.a> b2 = this.a.b(fVar);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (d != null) {
            b.o.u4.f.a e2 = d.e();
            c cVar = c.DIRECT;
            if (str == null) {
                str = d.f6314e;
            }
            b.o.u4.f.a aVar2 = e2;
            z = e(d, cVar, str, (JSONArray) null);
            aVar = aVar2;
        } else {
            aVar = null;
        }
        if (z) {
            ((i1) this.c).a("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + b2);
            arrayList.add(aVar);
            Iterator it = ((ArrayList) b2).iterator();
            while (it.hasNext()) {
                b.o.u4.a aVar3 = (b.o.u4.a) it.next();
                if (aVar3.c.h()) {
                    arrayList.add(aVar3.e());
                    aVar3.l();
                }
            }
        }
        ((i1) this.c).a("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        Iterator it2 = ((ArrayList) b2).iterator();
        while (it2.hasNext()) {
            b.o.u4.a aVar4 = (b.o.u4.a) it2.next();
            if (aVar4.c.equals(c.UNATTRIBUTED)) {
                JSONArray j2 = aVar4.j();
                if (j2.length() > 0 && !fVar.equals(i2.f.APP_CLOSE)) {
                    b.o.u4.f.a e3 = aVar4.e();
                    if (e(aVar4, c.INDIRECT, (String) null, j2)) {
                        arrayList.add(e3);
                    }
                }
            }
        }
        i2.k kVar = i2.k.DEBUG;
        StringBuilder y = b.e.a.a.a.y("Trackers after update attempt: ");
        y.append(this.a.a().toString());
        i2.a(kVar, y.toString(), (Throwable) null);
        d(arrayList);
    }

    @NonNull
    public List<b.o.u4.f.a> b() {
        e eVar = this.a;
        Objects.requireNonNull(eVar);
        ArrayList arrayList = new ArrayList();
        for (b.o.u4.a e2 : eVar.a.values()) {
            arrayList.add(e2.e());
        }
        return arrayList;
    }

    public void c(@NonNull String str) {
        ((i1) this.c).a(b.e.a.a.a.m("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: ", str));
        e(this.a.c(), c.DIRECT, str, (JSONArray) null);
    }

    public final void d(List<b.o.u4.f.a> list) {
        j1 j1Var = this.c;
        ((i1) j1Var).a("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (r0 != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(@androidx.annotation.NonNull b.o.u4.a r8, @androidx.annotation.NonNull b.o.u4.f.c r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable org.json.JSONArray r11) {
        /*
            r7 = this;
            b.o.u4.f.c r0 = r8.c
            boolean r0 = r9.equals(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000c
            goto L_0x0079
        L_0x000c:
            b.o.u4.f.c r0 = r8.c
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r8.f6314e
            if (r3 == 0) goto L_0x001f
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x001f
            goto L_0x0079
        L_0x001f:
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x007b
            org.json.JSONArray r0 = r8.d
            if (r0 == 0) goto L_0x007b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x007b
            org.json.JSONArray r0 = r8.d
            if (r0 != 0) goto L_0x0036
            if (r11 != 0) goto L_0x0036
            goto L_0x0070
        L_0x0036:
            if (r0 == 0) goto L_0x0076
            if (r11 != 0) goto L_0x003b
            goto L_0x0076
        L_0x003b:
            int r3 = r0.length()
            int r4 = r11.length()
            if (r3 == r4) goto L_0x0046
            goto L_0x0076
        L_0x0046:
            r3 = r2
        L_0x0047:
            int r4 = r0.length()     // Catch:{ JSONException -> 0x0072 }
            if (r3 >= r4) goto L_0x0070
            r4 = r2
        L_0x004e:
            int r5 = r11.length()     // Catch:{ JSONException -> 0x0072 }
            if (r4 >= r5) goto L_0x0076
            java.lang.Object r5 = r0.get(r3)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r5 = b.l.f.x.a.g.W(r5)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r6 = r11.get(r4)     // Catch:{ JSONException -> 0x0072 }
            java.lang.Object r6 = b.l.f.x.a.g.W(r6)     // Catch:{ JSONException -> 0x0072 }
            boolean r5 = r5.equals(r6)     // Catch:{ JSONException -> 0x0072 }
            if (r5 == 0) goto L_0x006d
            int r3 = r3 + 1
            goto L_0x0047
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x004e
        L_0x0070:
            r0 = r1
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0076:
            r0 = r2
        L_0x0077:
            if (r0 != 0) goto L_0x007b
        L_0x0079:
            r0 = r1
            goto L_0x007c
        L_0x007b:
            r0 = r2
        L_0x007c:
            if (r0 != 0) goto L_0x007f
            return r2
        L_0x007f:
            b.o.i2$k r0 = b.o.i2.k.DEBUG
            java.lang.String r2 = "OSChannelTracker changed: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.String r3 = r8.f()
            r2.append(r3)
            java.lang.String r3 = "\nfrom:\ninfluenceType: "
            r2.append(r3)
            b.o.u4.f.c r3 = r8.c
            r2.append(r3)
            java.lang.String r3 = ", directNotificationId: "
            r2.append(r3)
            java.lang.String r4 = r8.f6314e
            r2.append(r4)
            java.lang.String r4 = ", indirectNotificationIds: "
            r2.append(r4)
            org.json.JSONArray r5 = r8.d
            r2.append(r5)
            java.lang.String r5 = "\nto:\ninfluenceType: "
            r2.append(r5)
            r2.append(r9)
            r2.append(r3)
            r2.append(r10)
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r3 = 0
            b.o.i2.a(r0, r2, r3)
            r8.c = r9
            r8.f6314e = r10
            r8.d = r11
            r8.b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Trackers changed to: "
            r8.append(r9)
            b.o.u4.e r9 = r7.a
            java.util.List r9 = r9.a()
            java.lang.String r9 = r9.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            b.o.i2.a(r0, r8, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.y1.e(b.o.u4.a, b.o.u4.f.c, java.lang.String, org.json.JSONArray):boolean");
    }
}
