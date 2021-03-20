package b.l.a.c.f.i;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

public final class f3 {
    @GuardedBy("PhenotypeConstants.class")
    public static final ArrayMap<String, Uri> a = new ArrayMap<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (f3.class) {
            ArrayMap<String, Uri> arrayMap = a;
            uri = arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
