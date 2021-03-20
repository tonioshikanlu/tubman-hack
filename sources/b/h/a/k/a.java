package b.h.a.k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public final File f518h;

    /* renamed from: i  reason: collision with root package name */
    public final File f519i;

    /* renamed from: j  reason: collision with root package name */
    public final File f520j;

    /* renamed from: k  reason: collision with root package name */
    public final File f521k;

    /* renamed from: l  reason: collision with root package name */
    public final int f522l;

    /* renamed from: m  reason: collision with root package name */
    public long f523m;

    /* renamed from: n  reason: collision with root package name */
    public final int f524n;

    /* renamed from: o  reason: collision with root package name */
    public long f525o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Writer f526p;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, d> f527q = new LinkedHashMap<>(0, 0.75f, true);
    public int r;
    public long s = 0;
    public final ThreadPoolExecutor t = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((C0018a) null));
    public final Callable<Void> u = new C0018a();

    /* renamed from: b.h.a.k.a$a  reason: collision with other inner class name */
    public class C0018a implements Callable<Void> {
        public C0018a() {
        }

        public Object call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f526p != null) {
                    aVar.o0();
                    if (a.this.S()) {
                        a.this.m0();
                        a.this.r = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public b(C0018a aVar) {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f528b;
        public boolean c;

        public c(d dVar, C0018a aVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.f530e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f524n];
            }
            this.f528b = zArr;
        }

        public void a() {
            a.b(a.this, this, false);
        }

        public File b(int i2) {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f == this) {
                    if (!dVar.f530e) {
                        this.f528b[i2] = true;
                    }
                    file = dVar.d[i2];
                    if (!a.this.f518h.exists()) {
                        a.this.f518h.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f529b;
        public File[] c;
        public File[] d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f530e;
        public c f;

        /* renamed from: g  reason: collision with root package name */
        public long f531g;

        public d(String str, C0018a aVar) {
            this.a = str;
            int i2 = a.this.f524n;
            this.f529b = new long[i2];
            this.c = new File[i2];
            this.d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f524n; i3++) {
                sb.append(i3);
                this.c[i3] = new File(a.this.f518h, sb.toString());
                sb.append(".tmp");
                this.d[i3] = new File(a.this.f518h, sb.toString());
                sb.setLength(length);
            }
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f529b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) {
            StringBuilder y = b.e.a.a.a.y("unexpected journal line: ");
            y.append(Arrays.toString(strArr));
            throw new IOException(y.toString());
        }
    }

    public final class e {
        public final File[] a;

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr, C0018a aVar2) {
            this.a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        File file2 = file;
        this.f518h = file2;
        this.f522l = i2;
        this.f519i = new File(file2, "journal");
        this.f520j = new File(file2, "journal.tmp");
        this.f521k = new File(file2, "journal.bkp");
        this.f524n = i3;
        this.f523m = j2;
    }

    @TargetApi(26)
    public static void N(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a Y(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    n0(file2, file3, false);
                }
            }
            a aVar = new a(file, i2, i3, j2);
            if (aVar.f519i.exists()) {
                try {
                    aVar.g0();
                    aVar.e0();
                    return aVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f518h);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j2);
            aVar2.m0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static void b(a aVar, c cVar, boolean z) {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f == cVar) {
                if (z && !dVar.f530e) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= aVar.f524n) {
                            break;
                        } else if (!cVar.f528b[i2]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        } else if (!dVar.d[i2].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < aVar.f524n; i3++) {
                    File file = dVar.d[i3];
                    if (!z) {
                        z(file);
                    } else if (file.exists()) {
                        File file2 = dVar.c[i3];
                        file.renameTo(file2);
                        long j2 = dVar.f529b[i3];
                        long length = file2.length();
                        dVar.f529b[i3] = length;
                        aVar.f525o = (aVar.f525o - j2) + length;
                    }
                }
                aVar.r++;
                dVar.f = null;
                if (dVar.f530e || z) {
                    dVar.f530e = true;
                    aVar.f526p.append("CLEAN");
                    aVar.f526p.append(' ');
                    aVar.f526p.append(dVar.a);
                    aVar.f526p.append(dVar.a());
                    aVar.f526p.append(10);
                    if (z) {
                        long j3 = aVar.s;
                        aVar.s = 1 + j3;
                        dVar.f531g = j3;
                    }
                } else {
                    aVar.f527q.remove(dVar.a);
                    aVar.f526p.append("REMOVE");
                    aVar.f526p.append(' ');
                    aVar.f526p.append(dVar.a);
                    aVar.f526p.append(10);
                }
                N(aVar.f526p);
                if (aVar.f525o > aVar.f523m || aVar.S()) {
                    aVar.t.submit(aVar.u);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void n0(File file, File file2, boolean z) {
        if (z) {
            z(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void q(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void z(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c H(String str) {
        synchronized (this) {
            e();
            d dVar = this.f527q.get(str);
            if (dVar == null) {
                dVar = new d(str, (C0018a) null);
                this.f527q.put(str, dVar);
            } else if (dVar.f != null) {
                return null;
            }
            c cVar = new c(dVar, (C0018a) null);
            dVar.f = cVar;
            this.f526p.append("DIRTY");
            this.f526p.append(' ');
            this.f526p.append(str);
            this.f526p.append(10);
            N(this.f526p);
            return cVar;
        }
    }

    public synchronized e O(String str) {
        e();
        d dVar = this.f527q.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f530e) {
            return null;
        }
        for (File exists : dVar.c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.r++;
        this.f526p.append("READ");
        this.f526p.append(' ');
        this.f526p.append(str);
        this.f526p.append(10);
        if (S()) {
            this.t.submit(this.u);
        }
        return new e(this, str, dVar.f531g, dVar.c, dVar.f529b, (C0018a) null);
    }

    public final boolean S() {
        int i2 = this.r;
        return i2 >= 2000 && i2 >= this.f527q.size();
    }

    public synchronized void close() {
        if (this.f526p != null) {
            Iterator it = new ArrayList(this.f527q.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            o0();
            q(this.f526p);
            this.f526p = null;
        }
    }

    public final void e() {
        if (this.f526p == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void e0() {
        z(this.f520j);
        Iterator<d> it = this.f527q.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f == null) {
                while (i2 < this.f524n) {
                    this.f525o += next.f529b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < this.f524n) {
                    z(next.c[i2]);
                    z(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.r = r2 - r9.f527q.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f537l == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        m0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f526p = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f519i, true), b.h.a.k.c.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:28:0x0091=Splitter:B:28:0x0091} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            b.h.a.k.b r1 = new b.h.a.k.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f519i
            r2.<init>(r3)
            java.nio.charset.Charset r3 = b.h.a.k.c.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.e()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = r1.e()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r1.e()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = r1.e()     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = r1.e()     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f522l     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bf }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f524n     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.e()     // Catch:{ EOFException -> 0x0060 }
            r9.k0(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, b.h.a.k.a$d> r3 = r9.f527q     // Catch:{ all -> 0x00bf }
            int r3 = r3.size()     // Catch:{ all -> 0x00bf }
            int r2 = r2 - r3
            r9.r = r2     // Catch:{ all -> 0x00bf }
            int r2 = r1.f537l     // Catch:{ all -> 0x00bf }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.m0()     // Catch:{ all -> 0x00bf }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bf }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bf }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            java.io.File r5 = r9.f519i     // Catch:{ all -> 0x00bf }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00bf }
            java.nio.charset.Charset r4 = b.h.a.k.c.a     // Catch:{ all -> 0x00bf }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bf }
            r0.<init>(r2)     // Catch:{ all -> 0x00bf }
            r9.f526p = r0     // Catch:{ all -> 0x00bf }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r7.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bf }
            r7.append(r2)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r3)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bf }
            r4.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r4     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r1.close()     // Catch:{ RuntimeException -> 0x00c4, Exception -> 0x00c3 }
        L_0x00c3:
            throw r0
        L_0x00c4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.k.a.g0():void");
    }

    public final void k0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f527q.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.f527q.get(str2);
            if (dVar == null) {
                dVar = new d(str2, (C0018a) null);
                this.f527q.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f530e = true;
                dVar.f = null;
                if (split.length == a.this.f524n) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            dVar.f529b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar, (C0018a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(b.e.a.a.a.m("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(b.e.a.a.a.m("unexpected journal line: ", str));
        }
    }

    public final synchronized void m0() {
        String str;
        Writer writer = this.f526p;
        if (writer != null) {
            q(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f520j), c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f522l));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f524n));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.f527q.values()) {
                if (next.f != null) {
                    str = "DIRTY " + next.a + 10;
                } else {
                    str = "CLEAN " + next.a + next.a() + 10;
                }
                bufferedWriter.write(str);
            }
            q(bufferedWriter);
            if (this.f519i.exists()) {
                n0(this.f519i, this.f521k, true);
            }
            n0(this.f520j, this.f519i, false);
            this.f521k.delete();
            this.f526p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f519i, true), c.a));
        } catch (Throwable th) {
            q(bufferedWriter);
            throw th;
        }
    }

    public final void o0() {
        while (this.f525o > this.f523m) {
            String str = (String) this.f527q.entrySet().iterator().next().getKey();
            synchronized (this) {
                e();
                d dVar = this.f527q.get(str);
                if (dVar != null) {
                    if (dVar.f == null) {
                        for (int i2 = 0; i2 < this.f524n; i2++) {
                            File file = dVar.c[i2];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j2 = this.f525o;
                            long[] jArr = dVar.f529b;
                            this.f525o = j2 - jArr[i2];
                            jArr[i2] = 0;
                        }
                        this.r++;
                        this.f526p.append("REMOVE");
                        this.f526p.append(' ');
                        this.f526p.append(str);
                        this.f526p.append(10);
                        this.f527q.remove(str);
                        if (S()) {
                            this.t.submit(this.u);
                        }
                    }
                }
            }
        }
    }
}
