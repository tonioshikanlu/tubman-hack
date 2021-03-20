package b.o;

import java.util.ArrayList;
import java.util.Date;

public class p0 {
    public static Date c = new Date();
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f6225b = new ArrayList<>();

    public interface a {
        void a();
    }

    public p0(a aVar) {
        this.a = aVar;
    }

    public static boolean a(double d, double d2) {
        return Math.abs(d - d2) < 0.3d;
    }
}
