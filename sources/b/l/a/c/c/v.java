package b.l.a.c.c;

import androidx.exifinterface.media.ExifInterface;
import b.l.a.c.c.p.a;
import b.l.a.c.c.p.d;
import java.util.concurrent.Callable;

public final /* synthetic */ class v implements Callable {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2830b;
    public final u c;

    public v(boolean z, String str, u uVar) {
        this.a = z;
        this.f2830b = str;
        this.c = uVar;
    }

    public final Object call() {
        boolean z = this.a;
        String str = this.f2830b;
        u uVar = this.c;
        Object[] objArr = new Object[5];
        objArr[0] = !z && t.a(str, uVar, true, false).a ? "debug cert rejected" : "not whitelisted";
        objArr[1] = str;
        byte[] digest = a.b("SHA-1").digest(uVar.k());
        char[] cArr = new char[(digest.length << 1)];
        int i2 = 0;
        for (byte b2 : digest) {
            byte b3 = b2 & ExifInterface.MARKER;
            int i3 = i2 + 1;
            char[] cArr2 = d.f2822b;
            cArr[i2] = cArr2[b3 >>> 4];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b3 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
