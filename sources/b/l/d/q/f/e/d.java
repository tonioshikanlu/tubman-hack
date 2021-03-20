package b.l.d.q.f.e;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.b;
import b.l.d.q.f.f.a;
import b.l.d.q.f.g.q;
import b.l.d.q.f.g.r;
import b.l.d.q.f.g.t;
import b.l.d.q.f.g.v;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, a {
    @Nullable
    public t a;

    @NonNull
    public static String c(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void a(@Nullable t tVar) {
        this.a = tVar;
        b.a.b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void b(@NonNull String str, @NonNull Bundle bundle) {
        t tVar = this.a;
        if (tVar != null) {
            try {
                String str2 = "$A$:" + c(str, bundle);
                v vVar = tVar.a;
                Objects.requireNonNull(vVar);
                long currentTimeMillis = System.currentTimeMillis() - vVar.c;
                q qVar = vVar.f;
                qVar.d.b(new r(qVar, currentTimeMillis, str2));
            } catch (JSONException unused) {
                b.a.f("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
