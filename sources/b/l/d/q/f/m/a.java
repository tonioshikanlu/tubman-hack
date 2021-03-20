package b.l.d.q.f.m;

import android.content.Context;
import b.l.d.q.f.b;
import java.io.File;

public class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public final File a() {
        File file = new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics");
        b bVar = b.a;
        if (!file.exists() && !file.mkdirs()) {
            bVar.f("Couldn't create file");
            file = null;
        }
        return new File(file, "com.crashlytics.settings.json");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[Catch:{ all -> 0x005b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject b() {
        /*
            r7 = this;
            b.l.d.q.f.b r0 = b.l.d.q.f.b.a
            java.lang.String r1 = "Error while closing settings cache file."
            java.lang.String r2 = "Reading cached settings..."
            r0.b(r2)
            r2 = 0
            java.io.File r3 = r7.a()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r4 == 0) goto L_0x003a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            java.util.Scanner r3 = new java.util.Scanner     // Catch:{ Exception -> 0x002f }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = "\\A"
            java.util.Scanner r3 = r3.useDelimiter(r5)     // Catch:{ Exception -> 0x002f }
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x002f }
            if (r5 == 0) goto L_0x0031
            java.lang.String r3 = r3.next()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            goto L_0x0049
        L_0x0031:
            java.lang.String r3 = ""
        L_0x0033:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x002f }
            r5.<init>(r3)     // Catch:{ Exception -> 0x002f }
            r2 = r4
            goto L_0x0040
        L_0x003a:
            java.lang.String r3 = "No cached settings found."
            r0.b(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r5 = r2
        L_0x0040:
            b.l.d.q.f.g.e.a(r2, r1)
            r2 = r5
            goto L_0x005a
        L_0x0045:
            r0 = move-exception
            goto L_0x005d
        L_0x0047:
            r3 = move-exception
            r4 = r2
        L_0x0049:
            java.lang.String r5 = "Failed to fetch cached settings"
            r6 = 6
            boolean r0 = r0.a(r6)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.e(r0, r5, r3)     // Catch:{ all -> 0x005b }
        L_0x0057:
            b.l.d.q.f.g.e.a(r4, r1)
        L_0x005a:
            return r2
        L_0x005b:
            r0 = move-exception
            r2 = r4
        L_0x005d:
            b.l.d.q.f.g.e.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.m.a.b():org.json.JSONObject");
    }
}
