package j.a.a.a.c;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class a extends PagerAdapter {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8057b;
    public PdfRenderer c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f8058e;
    public float f = 2.0f;

    /* renamed from: g  reason: collision with root package name */
    public int f8059g = 1;

    public a(Context context, String str) {
        this.a = str;
        this.f8057b = context;
        try {
            this.c = new PdfRenderer(a(this.a));
            this.f8058e = (LayoutInflater) this.f8057b.getSystemService("layout_inflater");
            PdfRenderer pdfRenderer = this.c;
            float f2 = this.f;
            PdfRenderer.Page openPage = pdfRenderer.openPage(0);
            d dVar = new d();
            dVar.c = this.f8059g;
            dVar.a = (int) (((float) openPage.getWidth()) * f2);
            dVar.f8061b = (int) (((float) openPage.getHeight()) * f2);
            openPage.close();
            this.d = new e(dVar);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public ParcelFileDescriptor a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        if (!str.startsWith("/")) {
            return ParcelFileDescriptor.open(new File(this.f8057b.getCacheDir(), str), 268435456);
        }
        return this.f8057b.getContentResolver().openFileDescriptor(Uri.parse(URI.create(String.format("file://%s", new Object[]{str})).toString()), "rw");
    }

    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
    }

    public int getCount() {
        PdfRenderer pdfRenderer = this.c;
        if (pdfRenderer != null) {
            return pdfRenderer.getPageCount();
        }
        return 0;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }
}
