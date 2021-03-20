package b.o.u4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.o.b3;
import b.o.i1;
import b.o.i2;
import b.o.j1;
import b.o.u4.f.a;
import b.o.u4.f.b;
import b.o.u4.f.c;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a {
    public j1 a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public c f6313b;
    @Nullable
    public c c;
    @Nullable
    public JSONArray d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f6314e;

    public a(@NonNull c cVar, j1 j1Var) {
        this.f6313b = cVar;
        this.a = j1Var;
    }

    public abstract void a(@NonNull JSONObject jSONObject, b.o.u4.f.a aVar);

    public abstract void b();

    public abstract int c();

    public abstract b d();

    @NonNull
    public b.o.u4.f.a e() {
        c cVar;
        a.C0111a aVar = new a.C0111a();
        aVar.f6317b = c.DISABLED;
        if (this.c == null) {
            k();
        }
        if (this.c.h()) {
            Objects.requireNonNull(this.f6313b.a);
            if (b3.b(b3.a, "PREFS_OS_DIRECT_ENABLED", false)) {
                JSONArray put = new JSONArray().put(this.f6314e);
                a.C0111a aVar2 = new a.C0111a();
                aVar2.a = put;
                aVar2.f6317b = c.DIRECT;
                aVar = aVar2;
            }
        } else {
            if (this.c.j()) {
                Objects.requireNonNull(this.f6313b.a);
                if (b3.b(b3.a, "PREFS_OS_INDIRECT_ENABLED", false)) {
                    aVar = new a.C0111a();
                    aVar.a = this.d;
                    cVar = c.INDIRECT;
                }
            } else {
                Objects.requireNonNull(this.f6313b.a);
                if (b3.b(b3.a, "PREFS_OS_UNATTRIBUTED_ENABLED", false)) {
                    aVar = new a.C0111a();
                    cVar = c.UNATTRIBUTED;
                }
            }
            aVar.f6317b = cVar;
        }
        aVar.c = d();
        return new b.o.u4.f.a(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && aVar.f().equals(f());
    }

    public abstract String f();

    public abstract int g();

    public abstract JSONArray h();

    public int hashCode() {
        return f().hashCode() + (this.c.hashCode() * 31);
    }

    public abstract JSONArray i(String str);

    public JSONArray j() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray h2 = h();
            j1 j1Var = this.a;
            ((i1) j1Var).a("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + h2);
            long g2 = ((long) (g() * 60)) * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            for (int i2 = 0; i2 < h2.length(); i2++) {
                JSONObject jSONObject = h2.getJSONObject(i2);
                if (currentTimeMillis - jSONObject.getLong("time") <= g2) {
                    jSONArray.put(jSONObject.getString(f()));
                }
            }
        } catch (JSONException e2) {
            Objects.requireNonNull((i1) this.a);
            i2.a(i2.k.ERROR, "Generating tracker getLastReceivedIds JSONObject ", e2);
        }
        return jSONArray;
    }

    public abstract void k();

    public void l() {
        this.f6314e = null;
        JSONArray j2 = j();
        this.d = j2;
        this.c = j2.length() > 0 ? c.INDIRECT : c.UNATTRIBUTED;
        b();
        j1 j1Var = this.a;
        StringBuilder y = b.e.a.a.a.y("OneSignal OSChannelTracker resetAndInitInfluence: ");
        y.append(f());
        y.append(" finish with influenceType: ");
        y.append(this.c);
        ((i1) j1Var).a(y.toString());
    }

    public abstract void m(JSONArray jSONArray);

    public void n(String str) {
        i2.k kVar = i2.k.ERROR;
        j1 j1Var = this.a;
        StringBuilder y = b.e.a.a.a.y("OneSignal OSChannelTracker for: ");
        y.append(f());
        y.append(" saveLastId: ");
        y.append(str);
        ((i1) j1Var).a(y.toString());
        if (str != null && !str.isEmpty()) {
            JSONArray i2 = i(str);
            j1 j1Var2 = this.a;
            StringBuilder y2 = b.e.a.a.a.y("OneSignal OSChannelTracker for: ");
            y2.append(f());
            y2.append(" saveLastId with lastChannelObjectsReceived: ");
            y2.append(i2);
            ((i1) j1Var2).a(y2.toString());
            try {
                i2.put(new JSONObject().put(f(), str).put("time", System.currentTimeMillis()));
                int c2 = c();
                if (i2.length() > c2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int length = i2.length() - c2; length < i2.length(); length++) {
                        try {
                            jSONArray.put(i2.get(length));
                        } catch (JSONException e2) {
                            Objects.requireNonNull((i1) this.a);
                            i2.a(kVar, "Before KITKAT API, Generating tracker lastChannelObjectsReceived get JSONObject ", e2);
                        }
                    }
                    i2 = jSONArray;
                }
                j1 j1Var3 = this.a;
                StringBuilder y3 = b.e.a.a.a.y("OneSignal OSChannelTracker for: ");
                y3.append(f());
                y3.append(" with channelObjectToSave: ");
                y3.append(i2);
                ((i1) j1Var3).a(y3.toString());
                m(i2);
            } catch (JSONException e3) {
                Objects.requireNonNull((i1) this.a);
                i2.a(kVar, "Generating tracker newInfluenceId JSONObject ", e3);
            }
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("OSChannelTracker{tag=");
        y.append(f());
        y.append(", influenceType=");
        y.append(this.c);
        y.append(", indirectIds=");
        y.append(this.d);
        y.append(", directId='");
        y.append(this.f6314e);
        y.append('\'');
        y.append('}');
        return y.toString();
    }
}
