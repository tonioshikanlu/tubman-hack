package b.g.a.h;

import androidx.annotation.NonNull;
import b.g.a.a;
import b.g.a.b;
import java.util.HashMap;
import java.util.Map;

public class l extends p {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final u f435b;
    public final Map<String, String> c;
    public i d;

    public l(@NonNull a aVar, @NonNull u uVar, @NonNull String str) {
        this.a = aVar;
        this.f435b = uVar;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put("returnTo", str);
    }

    public boolean a(e eVar) {
        if (eVar.b()) {
            this.f435b.b(new b("The user closed the browser app so the logout was cancelled."));
            return true;
        }
        this.f435b.a(null);
        return true;
    }
}
