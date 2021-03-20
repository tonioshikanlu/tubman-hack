package androidx.core.util;

import android.util.AtomicFile;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import e.c0.a;
import e.r;
import e.x.b.l;
import e.x.c.i;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Le/r;", "block", "tryWrite", "(Landroid/util/AtomicFile;Le/x/b/l;)V", "", "array", "writeBytes", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", "charset", "writeText", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "readBytes", "(Landroid/util/AtomicFile;)[B", "readText", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class AtomicFileKt {
    @RequiresApi(17)
    public static final byte[] readBytes(AtomicFile atomicFile) {
        i.f(atomicFile, "$this$readBytes");
        byte[] readFully = atomicFile.readFully();
        i.b(readFully, "readFully()");
        return readFully;
    }

    @RequiresApi(17)
    public static final String readText(AtomicFile atomicFile, Charset charset) {
        i.f(atomicFile, "$this$readText");
        i.f(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        i.b(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = a.a;
        }
        return readText(atomicFile, charset);
    }

    @RequiresApi(17)
    public static final void tryWrite(AtomicFile atomicFile, l<? super FileOutputStream, r> lVar) {
        i.f(atomicFile, "$this$tryWrite");
        i.f(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            i.b(startWrite, "stream");
            lVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        i.f(atomicFile, "$this$writeBytes");
        i.f(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            i.b(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        i.f(atomicFile, "$this$writeText");
        i.f(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        i.f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        i.b(bytes, "(this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = a.a;
        }
        writeText(atomicFile, str, charset);
    }
}
