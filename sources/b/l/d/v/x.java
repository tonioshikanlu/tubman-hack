package b.l.d.v;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.io.File;
import java.util.Map;

public final class x {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5348b;
    public final y0 c;
    @GuardedBy("this")
    public final Map<String, x0> d = new ArrayMap();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r4.length() != 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r4 = "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r4 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        android.util.Log.d("FirebaseInstanceId", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(android.content.Context r4) {
        /*
            r3 = this;
            b.l.d.v.y0 r0 = new b.l.d.v.y0
            r0.<init>()
            r3.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r3.d = r1
            r3.f5348b = r4
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)
            r3.a = r1
            r3.c = r0
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.io.File r4 = androidx.core.content.ContextCompat.getNoBackupFilesDir(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r0)
            boolean r4 = r2.exists()
            if (r4 != 0) goto L_0x007d
            boolean r4 = r2.createNewFile()     // Catch:{ IOException -> 0x0054 }
            if (r4 == 0) goto L_0x007d
            monitor-enter(r3)     // Catch:{ IOException -> 0x0054 }
            java.util.Map r4 = r1.getAll()     // Catch:{ all -> 0x0051 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0051 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0054 }
            if (r4 != 0) goto L_0x007d
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r0 = "App restored, clearing state"
            android.util.Log.i(r4, r0)     // Catch:{ IOException -> 0x0054 }
            r3.c()     // Catch:{ IOException -> 0x0054 }
            com.google.firebase.iid.FirebaseInstanceId r4 = com.google.firebase.iid.FirebaseInstanceId.a()     // Catch:{ IOException -> 0x0054 }
            r4.o()     // Catch:{ IOException -> 0x0054 }
            goto L_0x007d
        L_0x0051:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0054 }
            throw r4     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r4 = move-exception
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Error creating file in no backup dir: "
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r2 = r4.length()
            if (r2 == 0) goto L_0x0075
            java.lang.String r4 = r1.concat(r4)
            goto L_0x007a
        L_0x0075:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L_0x007a:
            android.util.Log.d(r0, r4)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.x.<init>(android.content.Context):void");
    }

    public static String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + String.valueOf(str2).length() + String.valueOf(str).length() + 4);
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str).length() + 3);
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized String b() {
        return this.a.getString("topic_operation_queue", "");
    }

    public final synchronized void c() {
        this.d.clear();
        for (File file : y0.i(this.f5348b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }
}
