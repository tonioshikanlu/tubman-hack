package b.l.d.q.f.k;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class a implements FilenameFilter {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public boolean accept(File file, String str) {
        String str2 = this.a;
        Charset charset = g.f5260g;
        return str.startsWith(str2);
    }
}
