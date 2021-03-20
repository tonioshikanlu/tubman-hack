package b.l.a.c.e;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class e implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0124b bVar) {
        int i2;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.a = bVar.a(context, str);
        int b2 = bVar.b(context, str, true);
        aVar.f7284b = b2;
        int i3 = aVar.a;
        if (i3 == 0 && b2 == 0) {
            i2 = 0;
        } else if (b2 >= i3) {
            aVar.c = 1;
            return aVar;
        } else {
            i2 = -1;
        }
        aVar.c = i2;
        return aVar;
    }
}
