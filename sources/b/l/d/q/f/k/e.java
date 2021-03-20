package b.l.d.q.f.k;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class e implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final e f5259h = new e();

    public int compare(Object obj, Object obj2) {
        Charset charset = g.f5260g;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
