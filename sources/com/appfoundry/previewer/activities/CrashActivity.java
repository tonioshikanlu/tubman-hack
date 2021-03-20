package com.appfoundry.previewer.activities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.n.f;
import e.x.c.i;
import i.a.a.c;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/appfoundry/previewer/activities/CrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class CrashActivity extends AppCompatActivity {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f7010i = 0;

    /* renamed from: h  reason: collision with root package name */
    public HashMap f7011h;

    public static final class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ CrashActivity f7012h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ i.a.a.e.a f7013i;

        public a(CrashActivity crashActivity, i.a.a.e.a aVar) {
            this.f7012h = crashActivity;
            this.f7013i = aVar;
        }

        public final void onClick(View view) {
            i.a.a.e.a aVar = this.f7013i;
            if (aVar != null) {
                c.e(this.f7012h, aVar);
            }
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ CrashActivity f7014h;

        public static final class a implements DialogInterface.OnClickListener {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ b f7015h;

            public a(b bVar) {
                this.f7015h = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                CrashActivity crashActivity = this.f7015h.f7014h;
                int i3 = CrashActivity.f7010i;
                String b2 = c.b(crashActivity, crashActivity.getIntent());
                i.d(b2, "CustomActivityOnCrash.ge…sFromIntent(this, intent)");
                Object systemService = crashActivity.getSystemService("clipboard");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(crashActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b2));
                Toast.makeText(crashActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
            }
        }

        public b(CrashActivity crashActivity) {
            this.f7014h = crashActivity;
        }

        public final void onClick(View view) {
            AlertDialog.Builder title = new AlertDialog.Builder(this.f7014h).setTitle((int) R.string.customactivityoncrash_error_activity_error_details_title);
            CrashActivity crashActivity = this.f7014h;
            TextView textView = (TextView) title.setMessage((CharSequence) c.b(crashActivity, crashActivity.getIntent())).setPositiveButton((int) R.string.customactivityoncrash_error_activity_error_details_close, (DialogInterface.OnClickListener) null).setNeutralButton((int) R.string.customactivityoncrash_error_activity_error_details_copy, (DialogInterface.OnClickListener) new a(this)).show().findViewById(16908299);
            if (textView != null) {
                textView.setTextSize(0, this.f7014h.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
            }
        }
    }

    public View a(int i2) {
        if (this.f7011h == null) {
            this.f7011h = new HashMap();
        }
        View view = (View) this.f7011h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7011h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_crash);
        q.a.a.d.b("AppCrash: %s, with app id: %s", c.b(this, getIntent()), f.g());
        i.a.a.e.a c = c.c(getIntent());
        Typeface a2 = b.a.a.m.a.a(new b.a.a.m.a(), "01E25XRF6ZJM19R4ZQCJPPT1XF", 0, 2);
        TextView textView = (TextView) a(R.id.crash_error_text);
        i.d(textView, "crash_error_text");
        textView.setTypeface(a2);
        TextView textView2 = (TextView) a(R.id.restart_app);
        i.d(textView2, "restart_app");
        textView2.setTypeface(a2);
        ((TextView) a(R.id.restart_app)).setOnClickListener(new a(this, c));
        TextView textView3 = (TextView) a(R.id.more_info);
        i.d(textView3, "more_info");
        textView3.setVisibility(0);
        TextView textView4 = (TextView) a(R.id.more_info);
        i.d(textView4, "more_info");
        textView4.setTypeface(a2);
        ((TextView) a(R.id.more_info)).setOnClickListener(new b(this));
    }
}
