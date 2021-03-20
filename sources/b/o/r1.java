package b.o;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import b.o.i2;
import b.o.v4.c;
import b.o.v4.d;
import b.o.v4.j.b;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;

public class r1 {
    public Set<String> a = f2.p();
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final c f6266b;
    @NonNull
    public final y1 c;

    public class a implements t2 {
        public final /* synthetic */ b a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i2.q f6267b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;

        /* renamed from: b.o.r1$a$a  reason: collision with other inner class name */
        public class C0110a implements Runnable {
            public C0110a() {
            }

            public void run() {
                b.o.u4.f.c cVar;
                Thread.currentThread().setPriority(10);
                a aVar = a.this;
                aVar.a.d = aVar.c;
                d b2 = r1.this.f6266b.b();
                b bVar = a.this.a;
                b.o.v4.a aVar2 = b2.f6333b;
                b.o.u4.f.c cVar2 = b.o.u4.f.c.INDIRECT;
                b.o.u4.f.c cVar3 = b.o.u4.f.c.DIRECT;
                synchronized (aVar2) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    b.o.u4.f.c cVar4 = b.o.u4.f.c.UNATTRIBUTED;
                    b.o.v4.j.c cVar5 = bVar.f6335b;
                    if (cVar5 != null) {
                        b.o.v4.j.d dVar = cVar5.a;
                        if (dVar != null) {
                            JSONArray jSONArray3 = dVar.a;
                            if (jSONArray3 == null || jSONArray3.length() <= 0) {
                                cVar = cVar4;
                            } else {
                                jSONArray = cVar5.a.a;
                                cVar = cVar3;
                            }
                            JSONArray jSONArray4 = dVar.f6337b;
                            if (jSONArray4 == null || jSONArray4.length() <= 0) {
                                cVar3 = cVar4;
                            } else {
                                jSONArray2 = cVar5.a.f6337b;
                            }
                            cVar4 = cVar3;
                        } else {
                            cVar = cVar4;
                        }
                        b.o.v4.j.d dVar2 = cVar5.f6336b;
                        if (dVar2 != null) {
                            JSONArray jSONArray5 = dVar2.a;
                            if (jSONArray5 != null && jSONArray5.length() > 0) {
                                jSONArray = cVar5.f6336b.a;
                                cVar = cVar2;
                            }
                            JSONArray jSONArray6 = dVar2.f6337b;
                            if (jSONArray6 != null && jSONArray6.length() > 0) {
                                jSONArray2 = cVar5.f6336b.f6337b;
                                cVar4 = cVar;
                            }
                        }
                        cVar2 = cVar4;
                        cVar4 = cVar;
                    } else {
                        cVar2 = cVar4;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("notification_ids", jSONArray.toString());
                    contentValues.put("iam_ids", jSONArray2.toString());
                    contentValues.put("notification_influence_type", cVar4.toString().toLowerCase());
                    contentValues.put("iam_influence_type", cVar2.toString().toLowerCase());
                    contentValues.put("name", bVar.a);
                    contentValues.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, bVar.c);
                    contentValues.put(BasePayload.TIMESTAMP_KEY, Long.valueOf(bVar.d));
                    ((z2) aVar2.f6331b).H("outcome", (String) null, contentValues);
                }
            }
        }

        public a(b bVar, i2.q qVar, long j2, String str) {
            this.a = bVar;
            this.f6267b = qVar;
            this.c = j2;
            this.d = str;
        }

        public void a(String str) {
            r1 r1Var = r1.this;
            b bVar = this.a;
            Objects.requireNonNull(r1Var);
            b.o.v4.j.c cVar = bVar.f6335b;
            if (cVar == null || (cVar.a == null && cVar.f6336b == null)) {
                r1Var.a();
            } else {
                new Thread(new s1(r1Var, bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
            }
            i2.q qVar = this.f6267b;
            if (qVar != null) {
                qVar.a(q3.a(this.a));
            }
        }

        public void b(int i2, String str, Throwable th) {
            new Thread(new C0110a(), "OS_SAVE_OUTCOMES").start();
            i2.k kVar = i2.k.WARN;
            StringBuilder y = b.e.a.a.a.y("Sending outcome with name: ");
            y.append(this.d);
            y.append(" failed with status code: ");
            y.append(i2);
            y.append(" and response: ");
            y.append(str);
            y.append("\nOutcome event was cached and will be reattempted on app cold start");
            i2.a(kVar, y.toString(), (Throwable) null);
            i2.q qVar = this.f6267b;
            if (qVar != null) {
                qVar.a((q3) null);
            }
        }
    }

    public r1(@NonNull y1 y1Var, @NonNull c cVar) {
        this.c = y1Var;
        this.f6266b = cVar;
        d b2 = cVar.b();
        Objects.requireNonNull(b2.f6333b.c);
        Set<String> g2 = b3.g(b3.a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
        j1 j1Var = b2.a;
        ((i1) j1Var).a("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + g2);
        if (g2 != null) {
            this.a = g2;
        }
    }

    public final void a() {
        d b2 = this.f6266b.b();
        Set<String> set = this.a;
        j1 j1Var = b2.a;
        ((i1) j1Var).a("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        Objects.requireNonNull(b2.f6333b.c);
        b3.h(b3.a, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (b.o.f2.s("com.huawei.hwid") == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@androidx.annotation.NonNull java.lang.String r17, @androidx.annotation.NonNull float r18, @androidx.annotation.NonNull java.util.List<b.o.u4.f.a> r19, @androidx.annotation.Nullable b.o.i2.q r20) {
        /*
            r16 = this;
            r7 = r16
            r3 = r20
            b.o.i2$k r0 = b.o.i2.k.VERBOSE
            long r1 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r1 / r4
            r1 = 1
            r2 = 0
            java.lang.String r6 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0017 }
            r6 = r1
            goto L_0x0018
        L_0x0017:
            r6 = r2
        L_0x0018:
            r8 = 2
            if (r6 == 0) goto L_0x001d
            r9 = r8
            goto L_0x0058
        L_0x001d:
            boolean r6 = b.o.f2.n()
            if (r6 == 0) goto L_0x0024
            goto L_0x0057
        L_0x0024:
            boolean r6 = b.o.f2.j()
            if (r6 == 0) goto L_0x0041
            boolean r6 = b.o.f2.i()
            if (r6 == 0) goto L_0x0038
            boolean r6 = b.o.f2.l()
            if (r6 == 0) goto L_0x0038
            r6 = r1
            goto L_0x0039
        L_0x0038:
            r6 = r2
        L_0x0039:
            if (r6 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            boolean r6 = b.o.f2.o()
            goto L_0x0042
        L_0x0041:
            r6 = r2
        L_0x0042:
            r9 = 13
            if (r6 == 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            boolean r6 = b.o.f2.n()
            if (r6 == 0) goto L_0x004e
            goto L_0x0057
        L_0x004e:
            java.lang.String r6 = "com.huawei.hwid"
            boolean r6 = b.o.f2.s(r6)
            if (r6 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r9 = r1
        L_0x0058:
            java.lang.String r10 = b.o.i2.a
            java.util.Iterator r6 = r19.iterator()
            r11 = 0
            r12 = r11
            r13 = r12
        L_0x0061:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x00af
            java.lang.Object r14 = r6.next()
            b.o.u4.f.a r14 = (b.o.u4.f.a) r14
            b.o.u4.f.c r15 = r14.f6316b
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x00a3
            if (r15 == r1) goto L_0x0098
            if (r15 == r8) goto L_0x0095
            r1 = 3
            if (r15 == r1) goto L_0x007d
            goto L_0x00ad
        L_0x007d:
            java.lang.String r1 = "Outcomes disabled for channel: "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            b.o.u4.f.b r2 = r14.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b.o.i2.a(r0, r1, r11)
            if (r3 == 0) goto L_0x0094
            r3.a(r11)
        L_0x0094:
            return
        L_0x0095:
            r1 = 1
            r2 = r1
            goto L_0x00ad
        L_0x0098:
            if (r13 != 0) goto L_0x009f
            b.o.v4.j.d r13 = new b.o.v4.j.d
            r13.<init>()
        L_0x009f:
            r7.c(r14, r13)
            goto L_0x00ad
        L_0x00a3:
            if (r12 != 0) goto L_0x00aa
            b.o.v4.j.d r12 = new b.o.v4.j.d
            r12.<init>()
        L_0x00aa:
            r7.c(r14, r12)
        L_0x00ad:
            r1 = 1
            goto L_0x0061
        L_0x00af:
            if (r12 != 0) goto L_0x00c0
            if (r13 != 0) goto L_0x00c0
            if (r2 != 0) goto L_0x00c0
            java.lang.String r1 = "Outcomes disabled for all channels"
            b.o.i2.a(r0, r1, r11)
            if (r3 == 0) goto L_0x00bf
            r3.a(r11)
        L_0x00bf:
            return
        L_0x00c0:
            b.o.v4.j.c r0 = new b.o.v4.j.c
            r0.<init>(r12, r13)
            b.o.v4.j.b r8 = new b.o.v4.j.b
            r6 = r17
            r1 = r18
            r8.<init>(r6, r0, r1)
            b.o.r1$a r11 = new b.o.r1$a
            r0 = r11
            r1 = r16
            r2 = r8
            r3 = r20
            r0.<init>(r2, r3, r4, r6)
            b.o.v4.c r0 = r7.f6266b
            b.o.v4.d r0 = r0.b()
            r0.a(r10, r9, r8, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.r1.b(java.lang.String, float, java.util.List, b.o.i2$q):void");
    }

    public final b.o.v4.j.d c(b.o.u4.f.a aVar, b.o.v4.j.d dVar) {
        int ordinal = aVar.a.ordinal();
        if (ordinal == 0) {
            dVar.f6337b = aVar.c;
        } else if (ordinal == 1) {
            dVar.a = aVar.c;
        }
        return dVar;
    }
}
