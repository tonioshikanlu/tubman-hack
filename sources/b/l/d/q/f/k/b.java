package b.l.d.q.f.k;

import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class b implements FileFilter {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public boolean accept(File file) {
        String str = this.a;
        Charset charset = g.f5260g;
        return file.isDirectory() && !file.getName().equals(str);
    }
}
