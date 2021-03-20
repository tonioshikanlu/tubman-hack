package androidx.renderscript;

import android.content.res.Resources;

public class ScriptC extends Script {
    private static final String TAG = "ScriptC";

    public ScriptC(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public ScriptC(RenderScript renderScript, Resources resources, int i2) {
        super(0, renderScript);
        long internalCreate = internalCreate(renderScript, resources, i2);
        if (internalCreate != 0) {
            setID(internalCreate);
            return;
        }
        throw new RSRuntimeException("Loading of ScriptC script failed.");
    }

    public ScriptC(RenderScript renderScript, String str, byte[] bArr, byte[] bArr2) {
        super(0, renderScript);
        long internalStringCreate = RenderScript.sPointerSize == 4 ? internalStringCreate(renderScript, str, bArr) : internalStringCreate(renderScript, str, bArr2);
        if (internalStringCreate != 0) {
            setID(internalStringCreate);
            return;
        }
        throw new RSRuntimeException("Loading of ScriptC script failed.");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized long internalCreate(androidx.renderscript.RenderScript r8, android.content.res.Resources r9, int r10) {
        /*
            java.lang.Class<androidx.renderscript.ScriptC> r0 = androidx.renderscript.ScriptC.class
            monitor-enter(r0)
            java.io.InputStream r1 = r9.openRawResource(r10)     // Catch:{ all -> 0x0048 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003d }
            r3 = 0
            r4 = r3
        L_0x000d:
            int r5 = r2.length     // Catch:{ all -> 0x003d }
            int r5 = r5 - r4
            if (r5 != 0) goto L_0x001c
            int r5 = r2.length     // Catch:{ all -> 0x003d }
            int r5 = r5 * 2
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x003d }
            int r7 = r2.length     // Catch:{ all -> 0x003d }
            java.lang.System.arraycopy(r2, r3, r6, r3, r7)     // Catch:{ all -> 0x003d }
            int r5 = r5 - r4
            r2 = r6
        L_0x001c:
            int r5 = r1.read(r2, r4, r5)     // Catch:{ all -> 0x003d }
            if (r5 > 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x0042 }
            java.lang.String r9 = r9.getResourceEntryName(r10)     // Catch:{ all -> 0x0048 }
            android.content.Context r10 = r8.getApplicationContext()     // Catch:{ all -> 0x0048 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ all -> 0x0048 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0048 }
            long r8 = r8.nScriptCCreate(r9, r10, r2, r4)     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)
            return r8
        L_0x003b:
            int r4 = r4 + r5
            goto L_0x000d
        L_0x003d:
            r8 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0042 }
            throw r8     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            android.content.res.Resources$NotFoundException r8 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0048 }
            r8.<init>()     // Catch:{ all -> 0x0048 }
            throw r8     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.ScriptC.internalCreate(androidx.renderscript.RenderScript, android.content.res.Resources, int):long");
    }

    private static synchronized long internalStringCreate(RenderScript renderScript, String str, byte[] bArr) {
        long nScriptCCreate;
        synchronized (ScriptC.class) {
            nScriptCCreate = renderScript.nScriptCCreate(str, renderScript.getApplicationContext().getCacheDir().toString(), bArr, bArr.length);
        }
        return nScriptCCreate;
    }
}
