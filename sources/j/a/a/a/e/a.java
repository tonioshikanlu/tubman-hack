package j.a.a.a.e;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class a {
    public final Uri a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f8076b;
    public final Integer c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f8077e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8078g;

    public a(int i2) {
        this.f8076b = null;
        this.a = null;
        this.c = Integer.valueOf(i2);
        this.d = true;
    }

    public a(Bitmap bitmap, boolean z) {
        this.f8076b = bitmap;
        this.a = null;
        this.c = null;
        this.d = false;
        this.f8077e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.f8078g = z;
    }

    public a(@NonNull Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f8076b = null;
        this.a = uri;
        this.c = null;
        this.d = true;
    }
}
