package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.e.b0;
import b.l.a.d.a.e.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public final class t {
    public static final f c = new f("AssetPackStorage");
    public static final long d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f4624e;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final p1 f4625b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = timeUnit.toMillis(14);
        f4624e = timeUnit.toMillis(28);
    }

    public t(Context context, p1 p1Var) {
        this.a = context;
        this.f4625b = p1Var;
    }

    public static void b(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long c2 = c(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(c2)) && !file2.getName().equals("stale.tmp")) {
                    h(file2);
                }
            }
        }
    }

    public static long c(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            c.b(5, "Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            c.a(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static boolean h(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File h2 : listFiles) {
                z &= h(h2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    public final File a(String str) {
        return new File(g(), str);
    }

    public final List<File> d() {
        ArrayList arrayList = new ArrayList();
        try {
            if (g().exists()) {
                if (g().listFiles() != null) {
                    for (File file : g().listFiles()) {
                        if (!file.getCanonicalPath().equals(f().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e2) {
            c.b(6, "Could not process directory while scanning installed packs. %s", new Object[]{e2});
        }
    }

    public final File e(String str, int i2, long j2) {
        return new File(new File(new File(f(), str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File f() {
        return new File(g(), "_tmp");
    }

    public final File g() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0096  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.d.a.b.b i(java.lang.String r9) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.g()
            r0.<init>(r1, r9)
            boolean r1 = r0.exists()
            r2 = 3
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 != 0) goto L_0x0022
            b.l.a.d.a.e.f r0 = c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            java.lang.String r9 = "Pack not found with pack name: %s"
            r0.b(r2, r9, r1)
        L_0x001f:
            r9 = r6
            goto L_0x0093
        L_0x0022:
            java.io.File r1 = new java.io.File
            b.l.a.d.a.b.p1 r7 = r8.f4625b
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.<init>(r0, r7)
            boolean r0 = r1.exists()
            r7 = 2
            if (r0 != 0) goto L_0x0050
            b.l.a.d.a.e.f r0 = c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.p1 r9 = r8.f4625b
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Pack not found with pack name: %s app version: %s"
            r0.b(r2, r9, r1)
            goto L_0x001f
        L_0x0050:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L_0x007b
            int r1 = r0.length
            if (r1 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            if (r1 <= r4) goto L_0x0074
            b.l.a.d.a.e.f r0 = c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.p1 r9 = r8.f4625b
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.b(r3, r9, r1)
            goto L_0x001f
        L_0x0074:
            r9 = r0[r5]
            java.lang.String r9 = r9.getCanonicalPath()
            goto L_0x0093
        L_0x007b:
            b.l.a.d.a.e.f r0 = c
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            b.l.a.d.a.b.p1 r9 = r8.f4625b
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "No pack version found for pack name: %s app version: %s"
            r0.b(r2, r9, r1)
            goto L_0x001f
        L_0x0093:
            if (r9 != 0) goto L_0x0096
            return r6
        L_0x0096:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "assets"
            r0.<init>(r9, r1)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x00af
            b.l.a.d.a.e.f r9 = c
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            java.lang.String r0 = "Failed to find assets directory: %s"
            r9.b(r3, r0, r1)
            return r6
        L_0x00af:
            java.lang.String r0 = r0.getCanonicalPath()
            b.l.a.d.a.b.w r1 = new b.l.a.d.a.b.w
            r1.<init>(r5, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.t.i(java.lang.String):b.l.a.d.a.b.b");
    }

    public final File j(String str, int i2, long j2) {
        return new File(new File(a(str), String.valueOf(i2)), String.valueOf(j2));
    }

    public final File k(String str, int i2, long j2, String str2) {
        return new File(new File(new File(e(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    public final File l(String str, int i2, long j2, String str2) {
        return new File(new File(new File(e(str, i2, j2), "_slices"), "_verified"), str2);
    }

    public final File m(String str, int i2, long j2) {
        return new File(e(str, i2, j2), "_packs");
    }

    public final int n(String str, int i2, long j2) {
        File file = new File(m(str, i2, j2), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e2) {
                    throw new g0("Merge checkpoint file corrupt.", (Exception) e2);
                }
            } else {
                throw new g0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void o(String str, int i2, long j2, int i3) {
        File file = new File(m(str, i2, j2), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final File p(String str, int i2, long j2, String str2) {
        return new File(q(str, i2, j2, str2), "checkpoint.dat");
    }

    public final File q(String str, int i2, long j2, String str2) {
        return new File(new File(new File(e(str, i2, j2), "_slices"), "_metadata"), str2);
    }

    public final void r() {
        Iterator it = ((ArrayList) d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                b(file);
                long c2 = c(file, false);
                if (((long) this.f4625b.a()) != c2) {
                    try {
                        new File(new File(file, String.valueOf(c2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        c.b(6, "Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File b2 : file.listFiles()) {
                    b(b2);
                }
            }
        }
    }

    public final long s(String str) {
        return c(new File(a(str), String.valueOf((int) c(a(str), true))), true);
    }
}
