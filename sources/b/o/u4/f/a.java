package b.o.u4.f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {
    public b a;

    /* renamed from: b  reason: collision with root package name */
    public c f6316b;
    @Nullable
    public JSONArray c;

    /* renamed from: b.o.u4.f.a$a  reason: collision with other inner class name */
    public static class C0111a {
        public JSONArray a;

        /* renamed from: b  reason: collision with root package name */
        public c f6317b;
        public b c;
    }

    public a() {
    }

    public a(@NonNull C0111a aVar) {
        this.c = aVar.a;
        this.f6316b = aVar.f6317b;
        this.a = aVar.c;
    }

    public a a() {
        a aVar = new a();
        aVar.c = this.c;
        aVar.f6316b = this.f6316b;
        aVar.a = this.a;
        return aVar;
    }

    public String b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("influence_channel", this.a.f6321h);
        jSONObject.put("influence_type", this.f6316b.toString());
        JSONArray jSONArray = this.c;
        jSONObject.put("influence_ids", jSONArray != null ? jSONArray.toString() : "");
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f6316b == aVar.f6316b;
    }

    public int hashCode() {
        return this.f6316b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("SessionInfluence{influenceChannel=");
        y.append(this.a);
        y.append(", influenceType=");
        y.append(this.f6316b);
        y.append(", ids=");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }

    public a(@NonNull String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        b bVar = b.NOTIFICATION;
        if (string != null && !string.isEmpty()) {
            b[] values = b.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    break;
                }
                b bVar2 = values[i2];
                if (bVar2.f6321h.equals(string)) {
                    bVar = bVar2;
                    break;
                }
                i2++;
            }
        }
        this.a = bVar;
        this.f6316b = c.d(string2);
        this.c = string3.isEmpty() ? null : new JSONArray(string3);
    }
}
