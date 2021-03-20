package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f7327i = 0;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public ResultReceiver f7328h;

    public final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i4;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && (resultReceiver = this.f7328h) != null) {
            if (i3 == -1) {
                bundle = new Bundle();
                i4 = 1;
            } else if (i3 == 0) {
                bundle = new Bundle();
                i4 = 2;
            }
            resultReceiver.send(i4, bundle);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f7328h = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f7328h;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f7328h = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f7328h);
    }
}
