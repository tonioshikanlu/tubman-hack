package b.l.d.q.f.k;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class c implements FilenameFilter {
    public static final c a = new c();

    public boolean accept(File file, String str) {
        Charset charset = g.f5260g;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
