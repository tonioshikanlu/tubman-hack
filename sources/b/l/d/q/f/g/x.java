package b.l.d.q.f.g;

import b.e.a.a.a;
import b.l.d.q.f.b;
import b.l.d.q.f.k.h;
import java.io.File;
import java.io.IOException;

public class x {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5130b;

    public x(String str, h hVar) {
        this.a = str;
        this.f5130b = hVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            b bVar = b.a;
            StringBuilder y = a.y("Error creating marker: ");
            y.append(this.a);
            bVar.e(y.toString(), e2);
            return false;
        }
    }

    public final File b() {
        return new File(this.f5130b.a(), this.a);
    }
}
