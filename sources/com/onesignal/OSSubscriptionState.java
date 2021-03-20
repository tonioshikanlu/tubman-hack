package com.onesignal;

import b.o.b3;
import b.o.i2;
import b.o.o1;
import b.o.o3;
import b.o.t1;
import com.segment.analytics.integrations.BasePayload;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public o1<Object, OSSubscriptionState> f7389h = new o1<>("changed", false);

    /* renamed from: i  reason: collision with root package name */
    public boolean f7390i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7391j;

    /* renamed from: k  reason: collision with root package name */
    public String f7392k;

    /* renamed from: l  reason: collision with root package name */
    public String f7393l;

    public OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = b3.a;
            this.f7391j = b3.b(str, "ONESIGNAL_SUBSCRIPTION_LAST", false);
            this.f7392k = b3.f(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f7393l = b3.f(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f7390i = b3.b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f7391j = o3.b().n().e().a.optBoolean("userSubscribePref", true);
        this.f7392k = i2.r();
        this.f7393l = o3.c();
        this.f7390i = z2;
    }

    public boolean a() {
        return this.f7392k != null && this.f7393l != null && this.f7391j && this.f7390i;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.f7392k;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        try {
            jSONObject.put(BasePayload.USER_ID_KEY, obj);
            Object obj2 = this.f7393l;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("userSubscriptionSetting", this.f7391j);
            jSONObject.put("subscribed", a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void changed(t1 t1Var) {
        boolean z = t1Var.f6295i;
        boolean a = a();
        this.f7390i = z;
        if (a != a()) {
            this.f7389h.a(this);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        return b().toString();
    }
}
