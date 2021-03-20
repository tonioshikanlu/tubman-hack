package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import b.l.a.c.c.b;
import b.l.a.c.c.e;
import b.l.a.c.c.l.k.g;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f7245i = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f7246h = 0;

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f7246h = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                g a = g.a(this);
                if (i3 == -1) {
                    Handler handler = a.f2649j;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i3 == 0) {
                    b bVar = new b(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a.c(bVar, intExtra)) {
                        Handler handler2 = a.f2649j;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, bVar));
                    }
                }
            }
        } else if (i2 == 2) {
            this.f7246h = 0;
            setResult(i3, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f7246h = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7246h = bundle.getInt("resolution");
        }
        if (this.f7246h != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f7246h = 1;
                        return;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    }
                } else {
                    Object obj = e.c;
                    e.d.e(this, num.intValue(), 2, this);
                    this.f7246h = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f7246h);
        super.onSaveInstanceState(bundle);
    }
}
