package b.l.a.c.e;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0124b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = bVar.a(context, str);
        aVar.a = a;
        aVar.f7284b = a != 0 ? bVar.b(context, str, false) : bVar.b(context, str, true);
        int i2 = aVar.a;
        if (i2 == 0 && aVar.f7284b == 0) {
            aVar.c = 0;
        } else if (i2 >= aVar.f7284b) {
            aVar.c = -1;
        } else {
            aVar.c = 1;
        }
        return aVar;
    }
}
