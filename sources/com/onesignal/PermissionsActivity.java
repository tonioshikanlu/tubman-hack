package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.o.a;
import b.o.c;
import b.o.c0;
import b.o.f;
import b.o.i2;
import b.o.r3;
import b.o.s3;
import java.util.Objects;

public class PermissionsActivity extends Activity {

    /* renamed from: h  reason: collision with root package name */
    public static final String f7394h = PermissionsActivity.class.getCanonicalName();

    /* renamed from: i  reason: collision with root package name */
    public static boolean f7395i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f7396j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f7397k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f7398l;

    /* renamed from: m  reason: collision with root package name */
    public static a.b f7399m;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int[] f7400h;

        public a(int[] iArr) {
            this.f7400h = iArr;
        }

        public void run() {
            int[] iArr = this.f7400h;
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            c0.i(true, z ? i2.s.PERMISSION_GRANTED : i2.s.PERMISSION_DENIED);
            if (z) {
                c0.j();
                return;
            }
            PermissionsActivity permissionsActivity = PermissionsActivity.this;
            String str = PermissionsActivity.f7394h;
            Objects.requireNonNull(permissionsActivity);
            if (PermissionsActivity.f7397k && PermissionsActivity.f7398l && !ActivityCompat.shouldShowRequestPermissionRationale(permissionsActivity, c0.f6034i)) {
                new AlertDialog.Builder(i2.k()).setTitle(R.string.location_not_available_title).setMessage(R.string.location_not_available_open_settings_message).setPositiveButton(R.string.location_not_available_open_settings_option, new s3(permissionsActivity)).setNegativeButton(17039369, new r3(permissionsActivity)).show();
            }
            c0.c();
        }
    }

    public final void a() {
        if (!f7395i) {
            f7395i = true;
            f7398l = !ActivityCompat.shouldShowRequestPermissionRationale(this, c0.f6034i);
            String[] strArr = {c0.f6034i};
            if (this instanceof f) {
                ((f) this).validateRequestPermissionsRequestCode(2);
            }
            requestPermissions(strArr, 2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.E(this);
        if (bundle == null || !bundle.getBoolean("android:hasCurrentPermissionsRequest", false)) {
            a();
        } else {
            f7395i = true;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (i2.f6119g) {
            a();
        }
    }

    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        f7396j = true;
        f7395i = false;
        if (i2 == 2) {
            new Handler().postDelayed(new a(iArr), 500);
        }
        if (c.f6028i != null) {
            b.o.a.c.remove(f7394h);
        }
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }
}
