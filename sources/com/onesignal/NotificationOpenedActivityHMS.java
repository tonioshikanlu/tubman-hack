package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b.l.f.x.a.g;
import b.o.i2;
import b.o.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        JSONObject jSONObject;
        Intent intent = getIntent();
        i2.E(this);
        if (intent != null) {
            if (!g.P(intent.getExtras())) {
                jSONObject = null;
            } else {
                jSONObject = g.f(intent.getExtras());
                try {
                    String str = (String) g.t(jSONObject).remove("actionId");
                    if (str != null) {
                        jSONObject.put("actionId", str);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (jSONObject != null && !k0.a(this, jSONObject)) {
                i2.s(this, new JSONArray().put(jSONObject), false, g.w(jSONObject));
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}
