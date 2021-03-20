package j.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import j.a.a.a.d.a;
import j.a.a.a.d.f;
import java.io.File;

public class b extends ViewPager implements a.C0158a {

    /* renamed from: h  reason: collision with root package name */
    public Context f8055h;

    /* renamed from: i  reason: collision with root package name */
    public a.C0158a f8056i;

    public b(Context context, String str, a.C0158a aVar) {
        super(context);
        this.f8055h = context;
        this.f8056i = aVar;
        f fVar = new f(context, new Handler(), this);
        setDownloader(fVar);
        new Thread(new j.a.a.a.d.b(fVar, new File(this.f8055h.getCacheDir(), str.substring(str.lastIndexOf(47) + 1)).getAbsolutePath(), str)).start();
    }

    public void a(int i2, int i3) {
        this.f8056i.a(i2, i3);
    }

    public void b(Exception exc) {
        this.f8056i.b(exc);
    }

    public void c(String str, String str2) {
        this.f8056i.c(str, str2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setDownloader(a aVar) {
    }
}
