package b.l.a.c.e;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class b implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0124b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = bVar.a(context, str);
        aVar.a = a;
        if (a != 0) {
            aVar.c = -1;
        } else {
            int b2 = bVar.b(context, str, true);
            aVar.f7284b = b2;
            if (b2 != 0) {
                aVar.c = 1;
            }
        }
        return aVar;
    }
}
