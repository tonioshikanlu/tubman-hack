package b.l.d.q.f.k;

import android.content.Context;
import b.l.d.q.f.b;
import java.io.File;

public class h {
    public final Context a;

    public h(Context context) {
        this.a = context;
    }

    public File a() {
        File file = new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics");
        b bVar = b.a;
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        bVar.f("Couldn't create file");
        return null;
    }
}
