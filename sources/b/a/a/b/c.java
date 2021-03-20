package b.a.a.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.g.f;
import b.a.a.g.i;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c extends WebChromeClient {
    public View a;

    /* renamed from: b  reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f145b;
    public int c;
    public Context d;

    /* renamed from: e  reason: collision with root package name */
    public ValueCallback<Uri[]> f146e;
    public String f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f147g = null;

    /* renamed from: h  reason: collision with root package name */
    public Dialog f148h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f149i = true;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f150h;

        public a(c cVar, PermissionRequest permissionRequest) {
            this.f150h = permissionRequest;
        }

        public void run() {
            PermissionRequest permissionRequest = this.f150h;
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ValueCallback<Uri[]> valueCallback;
            c cVar = c.this;
            if (cVar.f149i && (valueCallback = cVar.f146e) != null) {
                valueCallback.onReceiveValue((Object) null);
                c.this.f146e = null;
            }
            c.this.f149i = true;
        }
    }

    /* renamed from: b.a.a.b.c$c  reason: collision with other inner class name */
    public class C0010c implements View.OnClickListener {
        public C0010c() {
        }

        public void onClick(View view) {
            c cVar = c.this;
            cVar.f149i = false;
            cVar.f148h.dismiss();
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            ((AppCompatActivity) c.this.d).startActivityForResult(intent, 21);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r6) {
            /*
                r5 = this;
                b.a.a.b.c r6 = b.a.a.b.c.this
                r0 = 0
                r6.f149i = r0
                android.app.Dialog r6 = r6.f148h
                r6.dismiss()
                android.content.Intent r6 = new android.content.Intent
                java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
                r6.<init>(r1)
                b.a.a.b.c r1 = b.a.a.b.c.this
                android.content.Context r1 = r1.d
                androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                android.content.ComponentName r1 = r6.resolveActivity(r1)
                r2 = 0
                if (r1 == 0) goto L_0x008a
                b.a.a.b.c r1 = b.a.a.b.c.this     // Catch:{ IOException -> 0x0034 }
                java.io.File r1 = b.a.a.b.c.a(r1)     // Catch:{ IOException -> 0x0034 }
                java.lang.String r3 = "PhotoPath"
                b.a.a.b.c r4 = b.a.a.b.c.this     // Catch:{ IOException -> 0x0032 }
                java.lang.String r4 = r4.f     // Catch:{ IOException -> 0x0032 }
                r6.putExtra(r3, r4)     // Catch:{ IOException -> 0x0032 }
                goto L_0x0047
            L_0x0032:
                r3 = move-exception
                goto L_0x0037
            L_0x0034:
                r1 = move-exception
                r3 = r1
                r1 = r2
            L_0x0037:
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r3 = r3.getLocalizedMessage()
                r4[r0] = r3
                q.a.a$b r0 = q.a.a.d
                java.lang.String r3 = "Image file creation failed: %s"
                r0.b(r3, r4)
            L_0x0047:
                if (r1 == 0) goto L_0x0085
                b.a.a.b.c r0 = b.a.a.b.c.this
                java.lang.String r2 = "file:"
                java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
                java.lang.String r3 = r1.getAbsolutePath()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.f = r2
                b.a.a.b.c r0 = b.a.a.b.c.this
                android.content.Context r0 = r0.d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                android.content.Context r3 = b.f.a.e.c()
                java.lang.String r3 = r3.getPackageName()
                r2.append(r3)
                java.lang.String r3 = ".provider"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r0, r2, r1)
                java.lang.String r1 = "output"
                r6.putExtra(r1, r0)
                goto L_0x008a
            L_0x0085:
                b.a.a.b.c r6 = b.a.a.b.c.this
                r6.f = r2
                r6 = r2
            L_0x008a:
                b.a.a.b.c r0 = b.a.a.b.c.this
                android.content.Context r0 = r0.d
                androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
                r1 = 22
                r0.startActivityForResult(r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.c.d.onClick(android.view.View):void");
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            File file;
            c cVar = c.this;
            cVar.f149i = false;
            cVar.f148h.dismiss();
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(((AppCompatActivity) c.this.d).getPackageManager()) != null) {
                try {
                    file = c.b(c.this);
                } catch (IOException e2) {
                    q.a.a.d.b("Video file creation failed: %s", e2.getLocalizedMessage());
                    file = null;
                }
                if (file != null) {
                    c cVar2 = c.this;
                    StringBuilder y = b.e.a.a.a.y("file:");
                    y.append(file.getAbsolutePath());
                    cVar2.f147g = y.toString();
                    intent.putExtra("output", FileProvider.getUriForFile(c.this.d, b.f.a.e.c().getPackageName() + ".provider", file));
                } else {
                    c.this.f147g = null;
                    intent = null;
                }
            }
            ((AppCompatActivity) c.this.d).startActivityForResult(intent, 23);
        }
    }

    public c(Context context) {
        this.d = context;
    }

    public static File a(c cVar) {
        if (cVar.c()) {
            return File.createTempFile(b.e.a.a.a.n("bravo_img_", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), "_"), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
        }
        return null;
    }

    public static File b(c cVar) {
        if (cVar.c()) {
            return File.createTempFile(b.e.a.a.a.n("bravo_video_", new SimpleDateFormat("yyyy_mm_ss").format(new Date()), "_"), ".mp4", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
        }
        return null;
    }

    public boolean c() {
        if (ContextCompat.checkSelfPermission(this.d, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        ActivityCompat.requestPermissions((AppCompatActivity) this.d, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    public Bitmap getDefaultVideoPoster() {
        if (this.a == null) {
            return null;
        }
        return BitmapFactory.decodeResource(b.f.a.e.c().getResources(), 2130837573);
    }

    public void onHideCustomView() {
        p.a.a.c.b().g(new f());
        ((FrameLayout) ((AppCompatActivity) this.d).getWindow().getDecorView()).removeView(this.a);
        this.a = null;
        ((AppCompatActivity) this.d).getWindow().getDecorView().setSystemUiVisibility(this.c);
        this.f145b.onCustomViewHidden();
        this.f145b = null;
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        q.a.a.d.a("chromium WEBVIEW: onpermissionrequest: %s", permissionRequest.getOrigin().toString());
        ((AppCompatActivity) this.d).runOnUiThread(new a(this, permissionRequest));
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        p.a.a.c.b().g(new i());
        if (this.a != null) {
            onHideCustomView();
            return;
        }
        this.a = view;
        this.c = ((AppCompatActivity) this.d).getWindow().getDecorView().getSystemUiVisibility();
        this.f145b = customViewCallback;
        ((FrameLayout) ((AppCompatActivity) this.d).getWindow().getDecorView()).addView(this.a, new FrameLayout.LayoutParams(-1, -1));
        ((AppCompatActivity) this.d).getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z;
        if (ContextCompat.checkSelfPermission(this.d, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission(this.d, "android.permission.CAMERA") == 0) {
            z = true;
        } else {
            ActivityCompat.requestPermissions((AppCompatActivity) this.d, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, 1);
            z = false;
        }
        if (!z) {
            return false;
        }
        this.f146e = valueCallback;
        if (this.f148h == null) {
            Dialog dialog = new Dialog(this.d);
            this.f148h = dialog;
            dialog.setTitle("Upload...");
            this.f148h.setContentView(R.layout.dialog_file_upload);
            if (this.f148h.getWindow() != null) {
                this.f148h.getWindow().setLayout(-1, -2);
            }
            this.f148h.setOnDismissListener(new b());
            this.f148h.findViewById(R.id.add_picture).setOnClickListener(new C0010c());
            this.f148h.findViewById(R.id.take_photo).setOnClickListener(new d());
            this.f148h.findViewById(R.id.take_video).setOnClickListener(new e());
        }
        this.f148h.show();
        return true;
    }
}
