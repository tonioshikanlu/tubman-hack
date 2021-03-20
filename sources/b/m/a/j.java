package b.m.a;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.x.a.g;
import b.m.a.t.c;
import b.m.a.t.d;
import b.m.a.t.m;

public class j {

    /* renamed from: k  reason: collision with root package name */
    public static final String f5920k = "j";
    public d a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f5921b;
    public Handler c;
    public g d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f5922e;
    public Rect f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5923g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Object f5924h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final Handler.Callback f5925i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final m f5926j = new b();

    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce A[LOOP:5: B:31:0x00cc->B:32:0x00ce, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x016a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                int r2 = r0.what
                r3 = 1
                r4 = 2131231308(0x7f08024c, float:1.8078693E38)
                if (r2 != r4) goto L_0x01c4
                b.m.a.j r2 = b.m.a.j.this
                java.lang.Object r0 = r0.obj
                b.m.a.s r0 = (b.m.a.s) r0
                java.util.Objects.requireNonNull(r2)
                long r4 = java.lang.System.currentTimeMillis()
                android.graphics.Rect r6 = r2.f
                r0.d = r6
                r7 = 0
                if (r6 != 0) goto L_0x0023
                r6 = r7
                goto L_0x00ee
            L_0x0023:
                b.m.a.n r6 = r0.a
                int r8 = r0.c
                java.util.Objects.requireNonNull(r6)
                r9 = 90
                r10 = 0
                if (r8 == r9) goto L_0x0087
                r9 = 180(0xb4, float:2.52E-43)
                if (r8 == r9) goto L_0x0066
                r9 = 270(0x10e, float:3.78E-43)
                if (r8 == r9) goto L_0x0039
                goto L_0x00b3
            L_0x0039:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.a
                int r11 = r6.f5928b
                int r12 = r6.c
                int r13 = r11 * r12
                byte[] r14 = new byte[r13]
                int r13 = r13 + -1
                r15 = r10
            L_0x0048:
                if (r15 >= r11) goto L_0x005e
                int r16 = r12 + -1
            L_0x004c:
                if (r16 < 0) goto L_0x005b
                int r17 = r16 * r11
                int r17 = r17 + r15
                byte r17 = r9[r17]
                r14[r13] = r17
                int r13 = r13 + -1
                int r16 = r16 + -1
                goto L_0x004c
            L_0x005b:
                int r15 = r15 + 1
                goto L_0x0048
            L_0x005e:
                int r9 = r6.c
                int r6 = r6.f5928b
                r8.<init>(r14, r9, r6)
                goto L_0x00b2
            L_0x0066:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.a
                int r11 = r6.f5928b
                int r12 = r6.c
                int r11 = r11 * r12
                byte[] r12 = new byte[r11]
                int r13 = r11 + -1
                r14 = r10
            L_0x0074:
                if (r14 >= r11) goto L_0x007f
                byte r15 = r9[r14]
                r12[r13] = r15
                int r13 = r13 + -1
                int r14 = r14 + 1
                goto L_0x0074
            L_0x007f:
                int r9 = r6.f5928b
                int r6 = r6.c
                r8.<init>(r12, r9, r6)
                goto L_0x00b2
            L_0x0087:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.a
                int r11 = r6.f5928b
                int r12 = r6.c
                int r13 = r11 * r12
                byte[] r13 = new byte[r13]
                r14 = r10
                r15 = r14
            L_0x0095:
                if (r14 >= r11) goto L_0x00ab
                int r16 = r12 + -1
            L_0x0099:
                if (r16 < 0) goto L_0x00a8
                int r17 = r16 * r11
                int r17 = r17 + r14
                byte r17 = r9[r17]
                r13[r15] = r17
                int r15 = r15 + 1
                int r16 = r16 + -1
                goto L_0x0099
            L_0x00a8:
                int r14 = r14 + 1
                goto L_0x0095
            L_0x00ab:
                int r9 = r6.c
                int r6 = r6.f5928b
                r8.<init>(r13, r9, r6)
            L_0x00b2:
                r6 = r8
            L_0x00b3:
                android.graphics.Rect r8 = r0.d
                int r9 = r8.width()
                int r9 = r9 / r3
                int r11 = r8.height()
                int r15 = r11 / 1
                int r11 = r8.top
                int r12 = r9 * r15
                byte[] r12 = new byte[r12]
                int r13 = r6.f5928b
                int r11 = r11 * r13
                int r8 = r8.left
                int r11 = r11 + r8
            L_0x00cc:
                if (r10 >= r15) goto L_0x00db
                int r8 = r10 * r9
                byte[] r13 = r6.a
                java.lang.System.arraycopy(r13, r11, r12, r8, r9)
                int r8 = r6.f5928b
                int r11 = r11 + r8
                int r10 = r10 + 1
                goto L_0x00cc
            L_0x00db:
                b.l.f.n r6 = new b.l.f.n
                r8 = 0
                r16 = 0
                r19 = 0
                r11 = r6
                r13 = r9
                r14 = r15
                r10 = r15
                r15 = r8
                r17 = r9
                r18 = r10
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x00ee:
                if (r6 == 0) goto L_0x0121
                b.m.a.g r8 = r2.d
                b.l.f.c r6 = r8.b(r6)
                java.util.List<b.l.f.s> r9 = r8.f5919b
                r9.clear()
                b.l.f.o r9 = r8.a     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                boolean r10 = r9 instanceof b.l.f.k     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                if (r10 == 0) goto L_0x010f
                b.l.f.k r9 = (b.l.f.k) r9     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                b.l.f.o[] r10 = r9.f5758b     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                if (r10 != 0) goto L_0x010a
                r9.e(r7)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            L_0x010a:
                b.l.f.q r6 = r9.d(r6)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                goto L_0x0113
            L_0x010f:
                b.l.f.q r6 = r9.b(r6)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            L_0x0113:
                r7 = r6
                goto L_0x011c
            L_0x0115:
                r0 = move-exception
                b.l.f.o r2 = r8.a
                r2.c()
                throw r0
            L_0x011c:
                b.l.f.o r6 = r8.a
                r6.c()
            L_0x0121:
                if (r7 == 0) goto L_0x0158
                long r8 = java.lang.System.currentTimeMillis()
                java.lang.String r6 = b.m.a.j.f5920k
                java.lang.String r10 = "Found barcode in "
                java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
                long r8 = r8 - r4
                r10.append(r8)
                java.lang.String r4 = " ms"
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                android.util.Log.d(r6, r4)
                android.os.Handler r4 = r2.f5922e
                if (r4 == 0) goto L_0x0166
                b.m.a.b r5 = new b.m.a.b
                r5.<init>(r7, r0)
                r6 = 2131231310(0x7f08024e, float:1.8078697E38)
                android.os.Message r4 = android.os.Message.obtain(r4, r6, r5)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                r4.setData(r5)
                goto L_0x0163
            L_0x0158:
                android.os.Handler r4 = r2.f5922e
                if (r4 == 0) goto L_0x0166
                r5 = 2131231309(0x7f08024d, float:1.8078695E38)
                android.os.Message r4 = android.os.Message.obtain(r4, r5)
            L_0x0163:
                r4.sendToTarget()
            L_0x0166:
                android.os.Handler r4 = r2.f5922e
                if (r4 == 0) goto L_0x01c0
                b.m.a.g r4 = r2.d
                java.util.Objects.requireNonNull(r4)
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<b.l.f.s> r4 = r4.f5919b
                r5.<init>(r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                int r6 = r5.size()
                r4.<init>(r6)
                java.util.Iterator r5 = r5.iterator()
            L_0x0183:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01b4
                java.lang.Object r6 = r5.next()
                b.l.f.s r6 = (b.l.f.s) r6
                float r7 = r6.a
                float r8 = (float) r3
                float r7 = r7 * r8
                android.graphics.Rect r9 = r0.d
                int r10 = r9.left
                float r10 = (float) r10
                float r7 = r7 + r10
                float r6 = r6.f5775b
                float r6 = r6 * r8
                int r8 = r9.top
                float r8 = (float) r8
                float r6 = r6 + r8
                boolean r8 = r0.f5933e
                if (r8 == 0) goto L_0x01ab
                b.m.a.n r8 = r0.a
                int r8 = r8.f5928b
                float r8 = (float) r8
                float r7 = r8 - r7
            L_0x01ab:
                b.l.f.s r8 = new b.l.f.s
                r8.<init>(r7, r6)
                r4.add(r8)
                goto L_0x0183
            L_0x01b4:
                android.os.Handler r0 = r2.f5922e
                r5 = 2131231311(0x7f08024f, float:1.80787E38)
                android.os.Message r0 = android.os.Message.obtain(r0, r5, r4)
                r0.sendToTarget()
            L_0x01c0:
                r2.a()
                goto L_0x01ce
            L_0x01c4:
                r0 = 2131231312(0x7f080250, float:1.8078701E38)
                if (r2 != r0) goto L_0x01ce
                b.m.a.j r0 = b.m.a.j.this
                r0.a()
            L_0x01ce:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b.m.a.j.a.handleMessage(android.os.Message):boolean");
        }
    }

    public class b implements m {
        public b() {
        }

        public void a(Exception exc) {
            synchronized (j.this.f5924h) {
                j jVar = j.this;
                if (jVar.f5923g) {
                    jVar.c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public j(d dVar, g gVar, Handler handler) {
        g.r0();
        this.a = dVar;
        this.d = gVar;
        this.f5922e = handler;
    }

    public final void a() {
        d dVar = this.a;
        dVar.f5949h.post(new c(dVar, this.f5926j));
    }
}
