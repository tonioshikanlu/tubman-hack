package b.l.a.c.c.l;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import b.l.a.c.c.l.k.b;
import java.util.ArrayList;

public class c extends Exception {

    /* renamed from: h  reason: collision with root package name */
    public final ArrayMap<b<?>, b.l.a.c.c.b> f2607h;

    public c(ArrayMap<b<?>, b.l.a.c.c.b> arrayMap) {
        this.f2607h = arrayMap;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b next : this.f2607h.keySet()) {
            b.l.a.c.c.b bVar = this.f2607h.get(next);
            if (bVar.W()) {
                z = false;
            }
            String str = next.c.c;
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 2);
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
