package b.l.a.d.a.b;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class b1 implements FilenameFilter {
    public final String a;

    public b1(String str) {
        this.a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.a).concat("-")) && str.endsWith(".apk");
    }
}
