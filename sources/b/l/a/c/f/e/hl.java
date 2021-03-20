package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.c.p.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class hl implements bj<hl> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f3048i = "hl";

    /* renamed from: h  reason: collision with root package name */
    public String f3049h;

    public final /* bridge */ /* synthetic */ bj d(String str) {
        try {
            this.f3049h = f.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw a.A1(e2, f3048i, str);
        }
    }
}
