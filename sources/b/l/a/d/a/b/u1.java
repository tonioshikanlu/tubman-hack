package b.l.a.d.a.b;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class u1 implements FilenameFilter {
    public static final FilenameFilter a = new u1();

    public final boolean accept(File file, String str) {
        return v1.a.matcher(str).matches();
    }
}
