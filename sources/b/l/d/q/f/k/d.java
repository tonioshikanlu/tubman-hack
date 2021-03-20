package b.l.d.q.f.k;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final d f5258h = new d();

    public int compare(Object obj, Object obj2) {
        Charset charset = g.f5260g;
        String name = ((File) obj).getName();
        int i2 = g.f5261h;
        return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
    }
}
