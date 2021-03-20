package b.l.a.c.i.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class o6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final p6 f4196h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4197i;

    /* renamed from: j  reason: collision with root package name */
    public final Exception f4198j;

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f4199k;

    /* renamed from: l  reason: collision with root package name */
    public final Map f4200l;

    public o6(p6 p6Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.f4196h = p6Var;
        this.f4197i = i2;
        this.f4198j = exc;
        this.f4199k = bArr;
        this.f4200l = map;
    }

    public final void run() {
        p6 p6Var = this.f4196h;
        int i2 = this.f4197i;
        Exception exc = this.f4198j;
        byte[] bArr = this.f4199k;
        l4 l4Var = p6Var.f4213k.a;
        if (!(i2 == 200 || i2 == 204)) {
            if (i2 == 304) {
                i2 = 304;
            }
            l4Var.a().f4091i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
        }
        if (exc == null) {
            l4Var.q().w.b(true);
            if (bArr == null || bArr.length == 0) {
                l4Var.a().f4095m.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(BasePayload.TIMESTAMP_KEY, ShadowDrawableWrapper.COS_45);
                if (TextUtils.isEmpty(optString)) {
                    l4Var.a().f4095m.a("Deferred Deep Link is empty.");
                    return;
                }
                k9 t = l4Var.t();
                l4 l4Var2 = t.a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = t.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        l4Var.f4123p.A("auto", "_cmp", bundle);
                        k9 t2 = l4Var.t();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = t2.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(BasePayload.TIMESTAMP_KEY, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    t2.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (Exception e2) {
                                t2.a.a().f.b("Failed to persist Deferred Deep Link. exception", e2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                l4Var.a().f4091i.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e3) {
                l4Var.a().f.b("Failed to parse the Deferred Deep Link response. exception", e3);
                return;
            }
        }
        l4Var.a().f4091i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
    }
}
