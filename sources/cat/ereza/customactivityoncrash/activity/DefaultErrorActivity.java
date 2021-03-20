package cat.ereza.customactivityoncrash.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import i.a.a.c;
import i.a.a.d;

public final class DefaultErrorActivity extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f6850h = 0;

    public class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i.a.a.e.a f6851h;

        public a(i.a.a.e.a aVar) {
            this.f6851h = aVar;
        }

        public void onClick(View view) {
            i.a.a.c.e(DefaultErrorActivity.this, this.f6851h);
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i.a.a.e.a f6853h;

        public b(i.a.a.e.a aVar) {
            this.f6853h = aVar;
        }

        public void onClick(View view) {
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            i.a.a.e.a aVar = this.f6853h;
            Application application = i.a.a.c.a;
            c.a aVar2 = aVar.r;
            if (aVar2 != null) {
                aVar2.s();
            }
            defaultErrorActivity.finish();
            i.a.a.c.d();
        }
    }

    public class c implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
                int i3 = DefaultErrorActivity.f6850h;
                String b2 = i.a.a.c.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                ClipboardManager clipboardManager = (ClipboardManager) defaultErrorActivity.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), b2));
                    Toast.makeText(defaultErrorActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
                }
            }
        }

        public c() {
        }

        public void onClick(View view) {
            AlertDialog.Builder title = new AlertDialog.Builder(DefaultErrorActivity.this).setTitle((int) R.string.customactivityoncrash_error_activity_error_details_title);
            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
            TextView textView = (TextView) title.setMessage((CharSequence) i.a.a.c.b(defaultErrorActivity, defaultErrorActivity.getIntent())).setPositiveButton((int) R.string.customactivityoncrash_error_activity_error_details_close, (DialogInterface.OnClickListener) null).setNeutralButton((int) R.string.customactivityoncrash_error_activity_error_details_copy, (DialogInterface.OnClickListener) new a()).show().findViewById(16908299);
            if (textView != null) {
                textView.setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
            }
        }
    }

    @SuppressLint({"PrivateResource"})
    public void onCreate(@Nullable Bundle bundle) {
        View.OnClickListener onClickListener;
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(d.a);
        if (!obtainStyledAttributes.hasValue(115)) {
            setTheme(2131820970);
        }
        obtainStyledAttributes.recycle();
        setContentView((int) R.layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        i.a.a.e.a c2 = i.a.a.c.c(getIntent());
        if (!c2.f8048k || c2.f8054q == null) {
            onClickListener = new b(c2);
        } else {
            button.setText(R.string.customactivityoncrash_error_activity_restart_app);
            onClickListener = new a(c2);
        }
        button.setOnClickListener(onClickListener);
        Button button2 = (Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button);
        if (c2.f8047j) {
            button2.setOnClickListener(new c());
        } else {
            button2.setVisibility(8);
        }
        Integer num = c2.f8052o;
        ImageView imageView = (ImageView) findViewById(R.id.customactivityoncrash_error_activity_image);
        if (num != null) {
            imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), num.intValue(), getTheme()));
        }
    }
}
