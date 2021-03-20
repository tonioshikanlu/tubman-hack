package androidx.core.net;

import android.net.Uri;
import b.e.a.a.a;
import e.x.c.i;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Landroid/net/Uri;", "toUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Ljava/io/File;", "(Ljava/io/File;)Landroid/net/Uri;", "toFile", "(Landroid/net/Uri;)Ljava/io/File;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class UriKt {
    public static final File toFile(Uri uri) {
        i.f(uri, "$this$toFile");
        if (i.a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(a.k("Uri path is null: ", uri).toString());
        }
        throw new IllegalArgumentException(a.k("Uri lacks 'file' scheme: ", uri).toString());
    }

    public static final Uri toUri(File file) {
        i.f(file, "$this$toUri");
        Uri fromFile = Uri.fromFile(file);
        i.b(fromFile, "Uri.fromFile(this)");
        return fromFile;
    }

    public static final Uri toUri(String str) {
        i.f(str, "$this$toUri");
        Uri parse = Uri.parse(str);
        i.b(parse, "Uri.parse(this)");
        return parse;
    }
}
