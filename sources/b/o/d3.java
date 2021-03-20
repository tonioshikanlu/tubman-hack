package b.o;

import b.o.c3;
import org.json.JSONObject;

public final class d3 extends c3.e {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6080j;

    public d3(JSONObject jSONObject) {
        this.f6080j = jSONObject;
        this.f6049b = jSONObject.optBoolean("enterp", false);
        jSONObject.optBoolean("require_email_auth", false);
        jSONObject.optBoolean("require_user_id_auth", false);
        this.c = jSONObject.optJSONArray("chnl_lst");
        this.d = jSONObject.optBoolean("fba", false);
        this.f6050e = jSONObject.optBoolean("restore_ttl_filter", true);
        this.a = jSONObject.optString("android_sender_id", (String) null);
        this.f = jSONObject.optBoolean("clear_group_on_summary_click", true);
        this.f6051g = jSONObject.optBoolean("receive_receipts_enable", false);
        this.f6052h = new c3.d();
        if (jSONObject.has("outcomes")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("outcomes");
            c3.d dVar = this.f6052h;
            if (optJSONObject.has("v2_enabled")) {
                dVar.f6048h = optJSONObject.optBoolean("v2_enabled");
            }
            if (optJSONObject.has("direct")) {
                dVar.f6046e = optJSONObject.optJSONObject("direct").optBoolean("enabled");
            }
            if (optJSONObject.has("indirect")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("indirect");
                dVar.f = optJSONObject2.optBoolean("enabled");
                if (optJSONObject2.has("notification_attribution")) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("notification_attribution");
                    dVar.a = optJSONObject3.optInt("minutes_since_displayed", 1440);
                    dVar.f6045b = optJSONObject3.optInt("limit", 10);
                }
                if (optJSONObject2.has("in_app_message_attribution")) {
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("in_app_message_attribution");
                    dVar.c = optJSONObject4.optInt("minutes_since_displayed", 1440);
                    dVar.d = optJSONObject4.optInt("limit", 10);
                }
            }
            if (optJSONObject.has("unattributed")) {
                dVar.f6047g = optJSONObject.optJSONObject("unattributed").optBoolean("enabled");
            }
        }
        this.f6053i = new c3.c();
        if (jSONObject.has("fcm")) {
            JSONObject optJSONObject5 = jSONObject.optJSONObject("fcm");
            this.f6053i.c = optJSONObject5.optString("api_key", (String) null);
            this.f6053i.f6044b = optJSONObject5.optString("app_id", (String) null);
            this.f6053i.a = optJSONObject5.optString("project_id", (String) null);
        }
    }
}
