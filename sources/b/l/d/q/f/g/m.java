package b.l.d.q.f.g;

import b.l.a.c.k.h;
import b.l.d.q.f.m.f;
import java.util.Date;
import java.util.concurrent.Callable;

public class m implements Callable<h<Void>> {
    public final /* synthetic */ Date a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f5098b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ f d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f5099e;

    public m(q qVar, Date date, Throwable th, Thread thread, f fVar) {
        this.f5099e = qVar;
        this.a = date;
        this.f5098b = th;
        this.c = thread;
        this.d = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0293  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r33 = this;
            r1 = r33
            b.l.d.q.f.b r2 = b.l.d.q.f.b.a
            java.util.Date r0 = r1.a
            long r3 = r0.getTime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            b.l.d.q.f.g.q r0 = r1.f5099e
            java.lang.String r5 = r0.f()
            r0 = 0
            if (r5 != 0) goto L_0x0022
            java.lang.String r3 = "Tried to write a fatal exception while no session was open."
            r2.d(r3)
            b.l.a.c.k.h r0 = b.l.a.c.b.a.X(r0)
            r2 = r1
            goto L_0x040e
        L_0x0022:
            b.l.d.q.f.g.q r6 = r1.f5099e
            b.l.d.q.f.g.x r6 = r6.c
            r6.a()
            b.l.d.q.f.g.q r6 = r1.f5099e
            b.l.d.q.f.g.k0 r6 = r6.f5112m
            java.lang.Throwable r7 = r1.f5098b
            java.lang.Thread r8 = r1.c
            java.util.Objects.requireNonNull(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Persisting fatal event for session "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r2.b(r9)
            b.l.d.q.f.g.y r9 = r6.a
            android.content.Context r10 = r9.a
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            int r10 = r10.orientation
            b.l.d.q.f.n.e r11 = new b.l.d.q.f.n.e
            b.l.d.q.f.n.d r12 = r9.d
            r11.<init>(r7, r12)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            b.l.d.q.f.g.a r4 = r9.c
            java.lang.String r4 = r4.d
            android.content.Context r7 = r9.a
            java.lang.String r12 = "activity"
            java.lang.Object r7 = r7.getSystemService(r12)
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7
            java.util.List r7 = r7.getRunningAppProcesses()
            if (r7 == 0) goto L_0x008e
            java.util.Iterator r7 = r7.iterator()
        L_0x0079:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x008e
            java.lang.Object r13 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r13 = (android.app.ActivityManager.RunningAppProcessInfo) r13
            java.lang.String r14 = r13.processName
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x0079
            goto L_0x008f
        L_0x008e:
            r13 = r0
        L_0x008f:
            if (r13 == 0) goto L_0x009e
            int r0 = r13.importance
            r7 = 100
            if (r0 == r7) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x009e:
            r16 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.StackTraceElement[] r13 = r11.c
            r14 = 4
            b.l.d.q.f.i.v$d$d$a$b$d r13 = r9.c(r8, r13, r14)
            r7.add(r13)
            java.util.Map r13 = java.lang.Thread.getAllStackTraces()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x00bf:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r13.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            java.lang.Thread r15 = (java.lang.Thread) r15
            boolean r17 = r15.equals(r8)
            if (r17 != 0) goto L_0x00ec
            b.l.d.q.f.n.d r4 = r9.d
            java.lang.Object r14 = r14.getValue()
            java.lang.StackTraceElement[] r14 = (java.lang.StackTraceElement[]) r14
            java.lang.StackTraceElement[] r4 = r4.a(r14)
            r14 = 0
            b.l.d.q.f.i.v$d$d$a$b$d r4 = r9.c(r15, r4, r14)
            r7.add(r4)
            goto L_0x00bf
        L_0x00ec:
            r14 = 0
            goto L_0x00bf
        L_0x00ee:
            r14 = 0
            b.l.d.q.f.i.w r4 = new b.l.d.q.f.i.w
            r4.<init>(r7)
            r7 = 8
            r8 = 4
            b.l.d.q.f.i.v$d$d$a$b$b r19 = r9.a(r11, r8, r7, r14)
            r7 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            java.lang.String r23 = ""
            if (r11 != 0) goto L_0x0108
            java.lang.String r13 = " address"
            goto L_0x010a
        L_0x0108:
            r13 = r23
        L_0x010a:
            boolean r14 = r13.isEmpty()
            java.lang.String r15 = "Missing required properties:"
            if (r14 == 0) goto L_0x0447
            b.l.d.q.f.i.o r20 = new b.l.d.q.f.i.o
            long r27 = r11.longValue()
            r29 = 0
            java.lang.String r25 = "0"
            java.lang.String r26 = "0"
            r24 = r20
            r24.<init>(r25, r26, r27, r29)
            r11 = 1
            b.l.d.q.f.i.v$d$d$a$b$a[] r11 = new b.l.d.q.f.i.v.d.C0082d.a.b.C0084a[r11]
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            b.l.d.q.f.g.a r8 = r9.c
            java.lang.String r8 = r8.d
            java.lang.String r14 = "Null name"
            java.util.Objects.requireNonNull(r8, r14)
            b.l.d.q.f.g.a r14 = r9.c
            java.lang.String r14 = r14.f5056b
            if (r13 != 0) goto L_0x0144
            java.lang.String r17 = " baseAddress"
            r32 = r15
            r15 = r17
            goto L_0x0148
        L_0x0144:
            r32 = r15
            r15 = r23
        L_0x0148:
            if (r7 != 0) goto L_0x0150
            java.lang.String r1 = " size"
            java.lang.String r15 = b.e.a.a.a.m(r15, r1)
        L_0x0150:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x0439
            b.l.d.q.f.i.m r1 = new b.l.d.q.f.i.m
            long r25 = r13.longValue()
            long r27 = r7.longValue()
            r31 = 0
            r24 = r1
            r29 = r8
            r30 = r14
            r24.<init>(r25, r27, r29, r30, r31)
            r7 = 0
            r11[r7] = r1
            b.l.d.q.f.i.w r1 = new b.l.d.q.f.i.w
            java.util.List r7 = java.util.Arrays.asList(r11)
            r1.<init>(r7)
            b.l.d.q.f.i.l r14 = new b.l.d.q.f.i.l
            r22 = 0
            r17 = r14
            r18 = r4
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            if (r0 != 0) goto L_0x0189
            java.lang.String r1 = " uiOrientation"
            goto L_0x018b
        L_0x0189:
            r1 = r23
        L_0x018b:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x042b
            b.l.d.q.f.i.k r1 = new b.l.d.q.f.i.k
            int r17 = r0.intValue()
            r18 = 0
            r15 = 0
            r13 = r1
            r0 = r32
            r13.<init>(r14, r15, r16, r17, r18)
            android.content.Context r4 = r9.a
            android.content.IntentFilter r7 = new android.content.IntentFilter
            java.lang.String r8 = "android.intent.action.BATTERY_CHANGED"
            r7.<init>(r8)
            r8 = 0
            android.content.Intent r4 = r4.registerReceiver(r8, r7)
            r7 = 2
            if (r4 == 0) goto L_0x01dd
            java.lang.String r8 = "status"
            r11 = -1
            int r8 = r4.getIntExtra(r8, r11)
            if (r8 != r11) goto L_0x01bb
            goto L_0x01c1
        L_0x01bb:
            if (r8 == r7) goto L_0x01c3
            r13 = 5
            if (r8 != r13) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r8 = 0
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            java.lang.String r13 = "level"
            int r13 = r4.getIntExtra(r13, r11)
            java.lang.String r14 = "scale"
            int r4 = r4.getIntExtra(r14, r11)
            if (r13 == r11) goto L_0x01df
            if (r4 != r11) goto L_0x01d5
            goto L_0x01df
        L_0x01d5:
            float r11 = (float) r13
            float r4 = (float) r4
            float r11 = r11 / r4
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            goto L_0x01e0
        L_0x01dd:
            r4 = 0
            r8 = r4
        L_0x01df:
            r4 = 0
        L_0x01e0:
            if (r4 == 0) goto L_0x01eb
            double r13 = r4.doubleValue()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ec
        L_0x01eb:
            r11 = 0
        L_0x01ec:
            if (r8 == 0) goto L_0x0202
            if (r4 != 0) goto L_0x01f1
            goto L_0x0202
        L_0x01f1:
            float r4 = r4.floatValue()
            double r13 = (double) r4
            r15 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r4 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0200
            goto L_0x0203
        L_0x0200:
            r7 = 3
            goto L_0x0203
        L_0x0202:
            r7 = 1
        L_0x0203:
            android.content.Context r4 = r9.a
            boolean r8 = b.l.d.q.f.g.e.k(r4)
            if (r8 == 0) goto L_0x020c
            goto L_0x021e
        L_0x020c:
            java.lang.String r8 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r8)
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4
            r8 = 8
            android.hardware.Sensor r4 = r4.getDefaultSensor(r8)
            if (r4 == 0) goto L_0x021e
            r4 = 1
            goto L_0x021f
        L_0x021e:
            r4 = 0
        L_0x021f:
            long r13 = b.l.d.q.f.g.e.i()
            android.content.Context r8 = r9.a
            android.app.ActivityManager$MemoryInfo r9 = new android.app.ActivityManager$MemoryInfo
            r9.<init>()
            java.lang.Object r8 = r8.getSystemService(r12)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            r8.getMemoryInfo(r9)
            long r8 = r9.availMem
            long r13 = r13 - r8
            java.io.File r8 = android.os.Environment.getDataDirectory()
            java.lang.String r8 = r8.getPath()
            android.os.StatFs r9 = new android.os.StatFs
            r9.<init>(r8)
            int r8 = r9.getBlockSize()
            r32 = r0
            r12 = r1
            long r0 = (long) r8
            int r8 = r9.getBlockCount()
            r16 = r5
            r17 = r6
            long r5 = (long) r8
            long r5 = r5 * r0
            int r8 = r9.getAvailableBlocks()
            long r8 = (long) r8
            long r0 = r0 * r8
            long r5 = r5 - r0
            b.l.d.q.f.i.r$b r0 = new b.l.d.q.f.i.r$b
            r0.<init>()
            r0.a = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.f5252b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.c = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.d = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r0.f5253e = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.f = r1
            b.l.d.q.f.i.v$d$d$b r9 = r0.a()
            java.lang.String r0 = " timestamp"
            if (r3 != 0) goto L_0x028b
            r1 = r0
            goto L_0x028d
        L_0x028b:
            r1 = r23
        L_0x028d:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x041d
            long r3 = r3.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = r17
            b.l.d.q.f.h.b r4 = r3.d
            b.l.d.q.f.h.a r4 = r4.c
            java.lang.String r4 = r4.b()
            if (r4 == 0) goto L_0x02af
            b.l.d.q.f.i.s r5 = new b.l.d.q.f.i.s
            r6 = 0
            r5.<init>(r4, r6)
            r10 = r5
            goto L_0x02b6
        L_0x02af:
            java.lang.String r4 = "No log data to include with this event."
            r2.b(r4)
            r4 = 0
            r10 = r4
        L_0x02b6:
            b.l.d.q.f.g.m0 r4 = r3.f5096e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = r4.a
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r4.size()
            r5.ensureCapacity(r6)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x02d2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02fe
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "Null key"
            java.util.Objects.requireNonNull(r7, r8)
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = "Null value"
            java.util.Objects.requireNonNull(r6, r8)
            b.l.d.q.f.i.c r8 = new b.l.d.q.f.i.c
            r11 = 0
            r8.<init>(r7, r6, r11)
            r5.add(r8)
            goto L_0x02d2
        L_0x02fe:
            b.l.d.q.f.g.j0 r4 = b.l.d.q.f.g.j0.f5094h
            java.util.Collections.sort(r5, r4)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x031c
            b.l.d.q.f.i.v$d$d$a$a r4 = r12.e()
            b.l.d.q.f.i.w r6 = new b.l.d.q.f.i.w
            r6.<init>(r5)
            b.l.d.q.f.i.k$b r4 = (b.l.d.q.f.i.k.b) r4
            r4.f5239b = r6
            b.l.d.q.f.i.v$d$d$a r4 = r4.a()
            r8 = r4
            goto L_0x031d
        L_0x031c:
            r8 = r12
        L_0x031d:
            b.l.d.q.f.k.g r3 = r3.f5095b
            if (r1 != 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r0 = r23
        L_0x0324:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x040f
            b.l.d.q.f.i.j r0 = new b.l.d.q.f.i.j
            long r5 = r1.longValue()
            r11 = 0
            java.lang.String r7 = "crash"
            r4 = r0
            r4.<init>(r5, r7, r8, r9, r10, r11)
            b.l.d.q.f.m.f r1 = r3.f
            b.l.d.q.f.m.e r1 = (b.l.d.q.f.m.e) r1
            b.l.d.q.f.m.j.d r1 = r1.b()
            b.l.d.q.f.m.j.c r1 = r1.a()
            int r1 = r1.a
            r4 = r16
            java.io.File r5 = r3.f(r4)
            b.l.d.q.f.i.x.h r6 = b.l.d.q.f.k.g.f5262i
            java.util.Objects.requireNonNull(r6)
            b.l.d.s.a r6 = b.l.d.q.f.i.x.h.a
            b.l.d.s.j.d r6 = (b.l.d.s.j.d) r6
            java.util.Objects.requireNonNull(r6)
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            r6.a(r0, r7)     // Catch:{ IOException -> 0x035f }
        L_0x035f:
            java.lang.String r0 = r7.toString()
            java.util.concurrent.atomic.AtomicInteger r3 = r3.a
            int r3 = r3.getAndIncrement()
            java.util.Locale r6 = java.util.Locale.US
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 0
            r7[r8] = r3
            java.lang.String r3 = "%010d"
            java.lang.String r3 = java.lang.String.format(r6, r3, r7)
            java.lang.String r6 = "event"
            java.lang.String r7 = "_"
            java.lang.String r3 = b.e.a.a.a.n(r6, r3, r7)
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x038c }
            r6.<init>(r5, r3)     // Catch:{ IOException -> 0x038c }
            b.l.d.q.f.k.g.j(r6, r0)     // Catch:{ IOException -> 0x038c }
            goto L_0x03a1
        L_0x038c:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Could not persist event for session "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.c(r3, r0)
        L_0x03a1:
            b.l.d.q.f.k.c r0 = b.l.d.q.f.k.c.a
            java.util.List r0 = b.l.d.q.f.k.g.e(r5, r0)
            b.l.d.q.f.k.d r2 = b.l.d.q.f.k.d.f5258h
            java.util.Collections.sort(r0, r2)
            int r2 = r0.size()
            java.util.Iterator r0 = r0.iterator()
        L_0x03b4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03c9
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            if (r2 > r1) goto L_0x03c3
            goto L_0x03c9
        L_0x03c3:
            b.l.d.q.f.k.g.i(r3)
            int r2 = r2 + -1
            goto L_0x03b4
        L_0x03c9:
            r2 = r33
            b.l.d.q.f.g.q r0 = r2.f5099e
            java.util.Date r1 = r2.a
            long r3 = r1.getTime()
            r0.d(r3)
            b.l.d.q.f.g.q r0 = r2.f5099e
            r1 = 0
            r0.c(r1)
            b.l.d.q.f.g.q r0 = r2.f5099e
            b.l.d.q.f.g.q.a(r0)
            b.l.d.q.f.g.q r0 = r2.f5099e
            b.l.d.q.f.g.b0 r0 = r0.f5104b
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x03f1
            r0 = 0
            b.l.a.c.k.h r0 = b.l.a.c.b.a.X(r0)
            goto L_0x040e
        L_0x03f1:
            b.l.d.q.f.g.q r0 = r2.f5099e
            b.l.d.q.f.g.f r0 = r0.d
            java.util.concurrent.Executor r0 = r0.a
            b.l.d.q.f.m.f r1 = r2.d
            b.l.d.q.f.m.e r1 = (b.l.d.q.f.m.e) r1
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.k.i<b.l.d.q.f.m.j.a>> r1 = r1.f5278i
            java.lang.Object r1 = r1.get()
            b.l.a.c.k.i r1 = (b.l.a.c.k.i) r1
            b.l.a.c.k.e0<TResult> r1 = r1.a
            b.l.d.q.f.g.l r3 = new b.l.d.q.f.g.l
            r3.<init>(r2, r0)
            b.l.a.c.k.h r0 = r1.o(r0, r3)
        L_0x040e:
            return r0
        L_0x040f:
            r2 = r33
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r3 = r32
            java.lang.String r0 = b.e.a.a.a.m(r3, r0)
            r1.<init>(r0)
            throw r1
        L_0x041d:
            r2 = r33
            r3 = r32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x042b:
            r2 = r33
            r3 = r32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0439:
            r2 = r33
            r3 = r32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r3, r15)
            r0.<init>(r1)
            throw r0
        L_0x0447:
            r2 = r1
            r3 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r3, r13)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.g.m.call():java.lang.Object");
    }
}
