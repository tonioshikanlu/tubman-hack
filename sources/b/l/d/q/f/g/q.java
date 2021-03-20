package b.l.d.q.f.g;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.k.e0;
import b.l.a.c.k.g;
import b.l.a.c.k.i;
import b.l.a.c.k.j;
import b.l.d.q.f.g.e;
import b.l.d.q.f.h.b;
import b.l.d.q.f.i.b;
import b.l.d.q.f.i.f;
import b.l.d.q.f.i.g;
import b.l.d.q.f.i.i;
import b.l.d.q.f.i.t;
import b.l.d.q.f.i.v;
import b.l.d.q.f.k.h;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class q {
    public static final /* synthetic */ int r = 0;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f5104b;
    public final x c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f5105e;
    public final h f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5106g;

    /* renamed from: h  reason: collision with root package name */
    public final b.C0077b f5107h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5108i;

    /* renamed from: j  reason: collision with root package name */
    public final b.l.d.q.f.a f5109j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5110k;

    /* renamed from: l  reason: collision with root package name */
    public final b.l.d.q.f.e.a f5111l;

    /* renamed from: m  reason: collision with root package name */
    public final k0 f5112m;

    /* renamed from: n  reason: collision with root package name */
    public a0 f5113n;

    /* renamed from: o  reason: collision with root package name */
    public final i<Boolean> f5114o = new i<>();

    /* renamed from: p  reason: collision with root package name */
    public final i<Boolean> f5115p = new i<>();

    /* renamed from: q  reason: collision with root package name */
    public final i<Void> f5116q = new i<>();

    public class a implements g<Boolean, Void> {
        public final /* synthetic */ b.l.a.c.k.h a;

        public a(b.l.a.c.k.h hVar) {
            this.a = hVar;
        }

        @NonNull
        public b.l.a.c.k.h a(@Nullable Object obj) {
            return q.this.d.c(new p(this, (Boolean) obj));
        }
    }

    public q(Context context, f fVar, f0 f0Var, b0 b0Var, h hVar, x xVar, a aVar, m0 m0Var, b bVar, b.C0077b bVar2, k0 k0Var, b.l.d.q.f.a aVar2, b.l.d.q.f.e.a aVar3) {
        new AtomicBoolean(false);
        this.a = context;
        this.d = fVar;
        this.f5105e = f0Var;
        this.f5104b = b0Var;
        this.f = hVar;
        this.c = xVar;
        this.f5106g = aVar;
        this.f5108i = bVar;
        this.f5107h = bVar2;
        this.f5109j = aVar2;
        this.f5110k = aVar.f5058g.a();
        this.f5111l = aVar3;
        this.f5112m = k0Var;
    }

    public static void a(q qVar) {
        String str;
        String str2;
        Integer num;
        q qVar2 = qVar;
        Objects.requireNonNull(qVar);
        long time = new Date().getTime() / 1000;
        new d(qVar2.f5105e);
        String str3 = d.f5070b;
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        bVar.b("Opening a new session with ID " + str3);
        qVar2.f5109j.g(str3);
        Locale locale = Locale.US;
        qVar2.f5109j.e(str3, String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"17.3.1"}), time);
        f0 f0Var = qVar2.f5105e;
        String str4 = f0Var.c;
        a aVar = qVar2.f5106g;
        qVar2.f5109j.d(str3, str4, aVar.f5057e, aVar.f, f0Var.b(), (qVar2.f5106g.c != null ? c0.APP_STORE : c0.DEVELOPER).f5069h, qVar2.f5110k);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        qVar2.f5109j.f(str3, str5, str6, e.l(qVar2.a));
        Context context = qVar2.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        e.a aVar2 = e.a.UNKNOWN;
        String str7 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str7)) {
            bVar.b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            e.a aVar3 = e.a.r.get(str7.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        }
        int ordinal = aVar2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long i2 = e.i();
        String str9 = str5;
        Locale locale2 = locale;
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean k2 = e.k(context);
        int e2 = e.e(context);
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        String str12 = str10;
        b.l.d.q.f.b bVar2 = bVar;
        String str13 = str7;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        Locale locale3 = locale2;
        qVar2.f5109j.c(str3, ordinal, str8, availableProcessors, i2, blockCount, k2, e2, str12, str11);
        qVar2.f5108i.a(str3);
        k0 k0Var = qVar2.f5112m;
        y yVar = k0Var.a;
        Objects.requireNonNull(yVar);
        Charset charset = v.a;
        b.C0080b bVar3 = new b.C0080b();
        bVar3.a = "17.3.1";
        String str17 = yVar.c.a;
        Objects.requireNonNull(str17, "Null gmpAppId");
        bVar3.f5202b = str17;
        String b2 = yVar.f5132b.b();
        Objects.requireNonNull(b2, "Null installationUuid");
        bVar3.d = b2;
        String str18 = yVar.c.f5057e;
        Objects.requireNonNull(str18, "Null buildVersion");
        bVar3.f5203e = str18;
        String str19 = yVar.c.f;
        Objects.requireNonNull(str19, "Null displayVersion");
        bVar3.f = str19;
        bVar3.c = 4;
        f.b bVar4 = new f.b();
        bVar4.b(false);
        bVar4.c = Long.valueOf(time);
        Objects.requireNonNull(str3, "Null identifier");
        bVar4.f5216b = str3;
        String str20 = y.f;
        Objects.requireNonNull(str20, "Null generator");
        bVar4.a = str20;
        String str21 = yVar.f5132b.c;
        Objects.requireNonNull(str21, "Null identifier");
        String str22 = yVar.c.f5057e;
        Objects.requireNonNull(str22, "Null version");
        String str23 = yVar.c.f;
        String b3 = yVar.f5132b.b();
        String a2 = yVar.c.f5058g.a();
        if (a2 != null) {
            str = a2;
            str2 = "Unity";
        } else {
            str2 = null;
            str = null;
        }
        bVar4.f = new b.l.d.q.f.i.g(str21, str22, str23, (v.d.a.C0081a) null, b3, str2, str, (g.a) null);
        Integer num2 = 3;
        String str24 = str9;
        Objects.requireNonNull(str24, "Null version");
        String str25 = str16;
        Objects.requireNonNull(str25, "Null buildVersion");
        Boolean valueOf = Boolean.valueOf(e.l(yVar.a));
        String str26 = num2 == null ? " platform" : "";
        if (valueOf == null) {
            str26 = b.e.a.a.a.m(str26, " jailbroken");
        }
        if (str26.isEmpty()) {
            bVar4.f5219h = new t(num2.intValue(), str24, str25, valueOf.booleanValue(), (t.a) null);
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            int i3 = 7;
            if (!TextUtils.isEmpty(str13) && (num = y.f5131e.get(str13.toLowerCase(locale3))) != null) {
                i3 = num.intValue();
            }
            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
            long i4 = e.i();
            long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
            boolean k3 = e.k(yVar.a);
            int e3 = e.e(yVar.a);
            i.b bVar5 = new i.b();
            bVar5.a = Integer.valueOf(i3);
            String str27 = str14;
            Objects.requireNonNull(str27, "Null model");
            bVar5.f5231b = str27;
            bVar5.c = Integer.valueOf(availableProcessors2);
            bVar5.d = Long.valueOf(i4);
            bVar5.f5232e = Long.valueOf(blockCount2);
            bVar5.f = Boolean.valueOf(k3);
            bVar5.f5233g = Integer.valueOf(e3);
            String str28 = str12;
            Objects.requireNonNull(str28, "Null manufacturer");
            bVar5.f5234h = str28;
            String str29 = str11;
            Objects.requireNonNull(str29, "Null modelClass");
            bVar5.f5235i = str29;
            bVar4.f5220i = bVar5.a();
            bVar4.f5222k = 3;
            bVar3.f5204g = bVar4.a();
            v a3 = bVar3.a();
            b.l.d.q.f.k.g gVar = k0Var.f5095b;
            Objects.requireNonNull(gVar);
            v.d h2 = a3.h();
            if (h2 == null) {
                bVar2.b("Could not get session for report");
                return;
            }
            b.l.d.q.f.b bVar6 = bVar2;
            String g2 = h2.g();
            try {
                File f2 = gVar.f(g2);
                b.l.d.q.f.k.g.g(f2);
                b.l.d.q.f.k.g.j(new File(f2, "report"), b.l.d.q.f.k.g.f5262i.g(a3));
            } catch (IOException e4) {
                bVar6.c("Could not persist report for session " + g2, e4);
            }
        } else {
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str26));
        }
    }

    public static b.l.a.c.k.h b(q qVar) {
        boolean z;
        b.l.a.c.k.h hVar;
        Objects.requireNonNull(qVar);
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = qVar.g().listFiles(i.a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file : listFiles) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    bVar.b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    hVar = b.l.a.c.b.a.X(null);
                } else {
                    hVar = b.l.a.c.b.a.i(new ScheduledThreadPoolExecutor(1), new j(qVar, parseLong));
                }
                arrayList.add(hVar);
            } catch (NumberFormatException unused2) {
                StringBuilder y = b.e.a.a.a.y("Could not parse timestamp from file ");
                y.append(file.getName());
                bVar.b(y.toString());
            }
            file.delete();
        }
        return b.l.a.c.b.a.D0(arrayList);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [boolean, int] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x015f */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e9 A[Catch:{ IOException -> 0x0229 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r15) {
        /*
            r14 = this;
            b.l.d.q.f.b r0 = b.l.d.q.f.b.a
            b.l.d.q.f.g.k0 r1 = r14.f5112m
            java.util.List r1 = r1.b()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r2 > r15) goto L_0x0016
            java.lang.String r15 = "No open sessions to be closed."
            r0.b(r15)
            return
        L_0x0016:
            java.lang.Object r2 = r1.get(r15)
            java.lang.String r2 = (java.lang.String) r2
            b.l.d.q.f.a r3 = r14.f5109j
            boolean r3 = r3.h(r2)
            if (r3 == 0) goto L_0x0071
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Finalizing native report for session "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.b(r3)
            b.l.d.q.f.a r3 = r14.f5109j
            b.l.d.q.f.d r3 = r3.b(r2)
            java.util.Objects.requireNonNull(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No minidump data found for session "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.f(r3)
            b.l.d.q.f.a r3 = r14.f5109j
            boolean r3 = r3.a(r2)
            if (r3 != 0) goto L_0x0071
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not finalize native session: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.b(r2)
        L_0x0071:
            r2 = 0
            r3 = 0
            if (r15 == 0) goto L_0x007c
            java.lang.Object r15 = r1.get(r2)
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x007d
        L_0x007c:
            r15 = r3
        L_0x007d:
            b.l.d.q.f.g.k0 r1 = r14.f5112m
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            b.l.d.q.f.k.g r1 = r1.f5095b
            b.l.d.q.f.k.b r6 = new b.l.d.q.f.k.b
            r6.<init>(r15)
            java.io.File r15 = r1.f5265b
            java.util.List r15 = b.l.d.q.f.k.g.d(r15, r6)
            java.util.Comparator<? super java.io.File> r6 = b.l.d.q.f.k.g.f5263j
            java.util.Collections.sort(r15, r6)
            int r6 = r15.size()
            r7 = 8
            if (r6 > r7) goto L_0x00a6
            goto L_0x00c6
        L_0x00a6:
            int r6 = r15.size()
            java.util.List r6 = r15.subList(r7, r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x00b2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r6.next()
            java.io.File r8 = (java.io.File) r8
            b.l.d.q.f.k.g.i(r8)
            goto L_0x00b2
        L_0x00c2:
            java.util.List r15 = r15.subList(r2, r7)
        L_0x00c6:
            java.util.Iterator r15 = r15.iterator()
        L_0x00ca:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x0243
            java.lang.Object r6 = r15.next()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r7 = "Finalizing report for session "
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            java.lang.String r8 = r6.getName()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.b(r7)
            java.io.FilenameFilter r7 = b.l.d.q.f.k.g.f5264k
            java.util.List r7 = b.l.d.q.f.k.g.e(r6, r7)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0107
            java.lang.String r7 = "Session "
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            java.lang.String r8 = r6.getName()
            r7.append(r8)
            java.lang.String r8 = " has no events."
            goto L_0x018d
        L_0x0107:
            java.util.Collections.sort(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0113:
            r9 = r2
        L_0x0114:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x017d
            java.lang.Object r10 = r7.next()
            java.io.File r10 = (java.io.File) r10
            b.l.d.q.f.i.x.h r11 = b.l.d.q.f.k.g.f5262i     // Catch:{ IOException -> 0x0167 }
            java.lang.String r12 = b.l.d.q.f.k.g.h(r10)     // Catch:{ IOException -> 0x0167 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ IOException -> 0x0167 }
            android.util.JsonReader r11 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0160 }
            java.io.StringReader r13 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0160 }
            r13.<init>(r12)     // Catch:{ IllegalStateException -> 0x0160 }
            r11.<init>(r13)     // Catch:{ IllegalStateException -> 0x0160 }
            b.l.d.q.f.i.v$d$d r12 = b.l.d.q.f.i.x.h.b(r11)     // Catch:{ all -> 0x015b }
            r11.close()     // Catch:{ IllegalStateException -> 0x0160 }
            r8.add(r12)     // Catch:{ IOException -> 0x0167 }
            r11 = 1
            if (r9 != 0) goto L_0x0159
            java.lang.String r12 = r10.getName()     // Catch:{ IOException -> 0x0167 }
            java.lang.String r13 = "event"
            boolean r13 = r12.startsWith(r13)     // Catch:{ IOException -> 0x0167 }
            if (r13 == 0) goto L_0x0156
            java.lang.String r13 = "_"
            boolean r9 = r12.endsWith(r13)     // Catch:{ IOException -> 0x0167 }
            if (r9 == 0) goto L_0x0156
            r9 = r11
            goto L_0x0157
        L_0x0156:
            r9 = r2
        L_0x0157:
            if (r9 == 0) goto L_0x0113
        L_0x0159:
            r9 = r11
            goto L_0x0114
        L_0x015b:
            r12 = move-exception
            r11.close()     // Catch:{ all -> 0x015f }
        L_0x015f:
            throw r12     // Catch:{ IllegalStateException -> 0x0160 }
        L_0x0160:
            r11 = move-exception
            java.io.IOException r12 = new java.io.IOException     // Catch:{ IOException -> 0x0167 }
            r12.<init>(r11)     // Catch:{ IOException -> 0x0167 }
            throw r12     // Catch:{ IOException -> 0x0167 }
        L_0x0167:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Could not add event to report for "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r0.c(r10, r11)
            goto L_0x0114
        L_0x017d:
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x0199
            java.lang.String r7 = "Could not parse event files for session "
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            java.lang.String r8 = r6.getName()
        L_0x018d:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.b(r7)
            goto L_0x023e
        L_0x0199:
            java.io.File r7 = new java.io.File
            java.lang.String r10 = "user"
            r7.<init>(r6, r10)
            boolean r10 = r7.isFile()
            if (r10 == 0) goto L_0x01c0
            java.lang.String r7 = b.l.d.q.f.k.g.h(r7)     // Catch:{ IOException -> 0x01ab }
            goto L_0x01c1
        L_0x01ab:
            r7 = move-exception
            java.lang.String r10 = "Could not read user ID file in "
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            java.lang.String r11 = r6.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.c(r10, r7)
        L_0x01c0:
            r7 = r3
        L_0x01c1:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = "report"
            r10.<init>(r6, r11)
            if (r9 == 0) goto L_0x01cd
            java.io.File r11 = r1.c
            goto L_0x01cf
        L_0x01cd:
            java.io.File r11 = r1.d
        L_0x01cf:
            b.l.d.q.f.i.x.h r12 = b.l.d.q.f.k.g.f5262i     // Catch:{ IOException -> 0x0229 }
            java.lang.String r13 = b.l.d.q.f.k.g.h(r10)     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v r13 = r12.f(r13)     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v r7 = r13.j(r4, r9, r7)     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.w r9 = new b.l.d.q.f.i.w     // Catch:{ IOException -> 0x0229 }
            r9.<init>(r8)     // Catch:{ IOException -> 0x0229 }
            r8 = r7
            b.l.d.q.f.i.b r8 = (b.l.d.q.f.i.b) r8     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v$d r8 = r8.f5200h     // Catch:{ IOException -> 0x0229 }
            if (r8 == 0) goto L_0x0221
            b.l.d.q.f.i.v$a r8 = r7.i()     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.b r7 = (b.l.d.q.f.i.b) r7     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v$d r7 = r7.f5200h     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v$d$b r7 = r7.l()     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.f$b r7 = (b.l.d.q.f.i.f.b) r7     // Catch:{ IOException -> 0x0229 }
            r7.f5221j = r9     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v$d r7 = r7.a()     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.b$b r8 = (b.l.d.q.f.i.b.C0080b) r8     // Catch:{ IOException -> 0x0229 }
            r8.f5204g = r7     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v r7 = r8.a()     // Catch:{ IOException -> 0x0229 }
            r8 = r7
            b.l.d.q.f.i.b r8 = (b.l.d.q.f.i.b) r8     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.i.v$d r8 = r8.f5200h     // Catch:{ IOException -> 0x0229 }
            if (r8 != 0) goto L_0x020d
            goto L_0x023e
        L_0x020d:
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.k.g.g(r11)     // Catch:{ IOException -> 0x0229 }
            java.lang.String r8 = r8.g()     // Catch:{ IOException -> 0x0229 }
            r9.<init>(r11, r8)     // Catch:{ IOException -> 0x0229 }
            java.lang.String r7 = r12.g(r7)     // Catch:{ IOException -> 0x0229 }
            b.l.d.q.f.k.g.j(r9, r7)     // Catch:{ IOException -> 0x0229 }
            goto L_0x023e
        L_0x0221:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0229 }
            java.lang.String r8 = "Reports without sessions cannot have events added to them."
            r7.<init>(r8)     // Catch:{ IOException -> 0x0229 }
            throw r7     // Catch:{ IOException -> 0x0229 }
        L_0x0229:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Could not synthesize final report file for "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.c(r8, r7)
        L_0x023e:
            b.l.d.q.f.k.g.i(r6)
            goto L_0x00ca
        L_0x0243:
            b.l.d.q.f.m.f r15 = r1.f
            b.l.d.q.f.m.e r15 = (b.l.d.q.f.m.e) r15
            b.l.d.q.f.m.j.d r15 = r15.b()
            b.l.d.q.f.m.j.c r15 = r15.a()
            java.util.Objects.requireNonNull(r15)
            java.util.List r15 = r1.c()
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r0 = r15.size()
            r1 = 4
            if (r0 > r1) goto L_0x0260
            goto L_0x0278
        L_0x0260:
            java.util.List r15 = r15.subList(r1, r0)
            java.util.Iterator r15 = r15.iterator()
        L_0x0268:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r0 = r15.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x0268
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.g.q.c(boolean):void");
    }

    public final void d(long j2) {
        try {
            File g2 = g();
            new File(g2, ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            b.l.d.q.f.b.a.b("Could not write app exception marker.");
        }
    }

    public boolean e() {
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        this.d.a();
        a0 a0Var = this.f5113n;
        if (a0Var != null && a0Var.d.get()) {
            bVar.b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        bVar.b("Finalizing previously open sessions.");
        try {
            c(true);
            bVar.b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            }
            return false;
        }
    }

    @Nullable
    public final String f() {
        ArrayList arrayList = (ArrayList) this.f5112m.b();
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    public File g() {
        return this.f.a();
    }

    public b.l.a.c.k.h<Void> h(b.l.a.c.k.h<b.l.d.q.f.m.j.a> hVar) {
        Object obj;
        e0<TResult> e0Var;
        Boolean bool = Boolean.FALSE;
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        if (!(!((ArrayList) this.f5112m.f5095b.c()).isEmpty())) {
            bVar.b("No reports are available.");
            this.f5114o.b(bool);
            return b.l.a.c.b.a.X(null);
        }
        bVar.b("Unsent reports are available.");
        Boolean bool2 = Boolean.TRUE;
        if (this.f5104b.a()) {
            bVar.b("Automatic data collection is enabled. Allowing upload.");
            this.f5114o.b(bool);
            obj = b.l.a.c.b.a.X(bool2);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.b("Notifying that unsent reports are available.");
            this.f5114o.b(bool2);
            b0 b0Var = this.f5104b;
            synchronized (b0Var.c) {
                e0Var = b0Var.d.a;
            }
            n nVar = new n(this);
            Objects.requireNonNull(e0Var);
            b.l.a.c.k.h<TContinuationResult> o2 = e0Var.o(j.a, nVar);
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            e0<TResult> e0Var2 = this.f5115p.a;
            ExecutorService executorService = q0.a;
            b.l.a.c.k.i iVar = new b.l.a.c.k.i();
            o0 o0Var = new o0(iVar);
            o2.f(o0Var);
            e0Var2.f(o0Var);
            obj = iVar.a;
        }
        a aVar = new a(hVar);
        e0 e0Var3 = (e0) obj;
        Objects.requireNonNull(e0Var3);
        return e0Var3.o(j.a, aVar);
    }
}
