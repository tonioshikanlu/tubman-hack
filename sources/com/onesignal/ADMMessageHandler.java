package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b.l.f.x.a.g;
import b.o.h0;
import b.o.i2;
import b.o.v3;
import com.amazon.device.messaging.ADMMessageHandlerBase;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (!g.c0(applicationContext, extras).a()) {
            h0 h0Var = new h0(applicationContext);
            h0Var.f6106b = g.f(extras);
            g.c(h0Var);
        }
    }

    public void onRegistered(String str) {
        i2.k kVar = i2.k.INFO;
        i2.a(kVar, "ADM registration ID: " + str, (Throwable) null);
        v3.b(str);
    }

    public void onRegistrationError(String str) {
        i2.k kVar = i2.k.ERROR;
        i2.a(kVar, "ADM:onRegistrationError: " + str, (Throwable) null);
        if ("INVALID_SENDER".equals(str)) {
            i2.a(kVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", (Throwable) null);
        }
        v3.b((String) null);
    }

    public void onUnregistered(String str) {
        i2.k kVar = i2.k.INFO;
        i2.a(kVar, "ADM:onUnregistered: " + str, (Throwable) null);
    }
}
