package b.l.a.d.a.a;

import android.content.Context;
import java.io.File;

public final class r {
    public final Context a;

    public r(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (File a2 : listFiles) {
                j2 += a(a2);
            }
        }
        return j2;
    }
}
