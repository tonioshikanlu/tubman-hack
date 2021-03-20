package b.o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import b.o.a;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class g2 {
    public static final int a = b(24);

    public static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f6100h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Runnable f6101i;

        /* renamed from: b.o.g2$a$a  reason: collision with other inner class name */
        public class C0109a extends a.b {
            public final /* synthetic */ a a;

            public C0109a(a aVar) {
                this.a = aVar;
            }

            public void a(@NonNull Activity activity) {
                a aVar = this.a;
                String str = a.this.f6100h;
                Objects.requireNonNull(aVar);
                a.c.remove(str);
                if (g2.d(activity)) {
                    a.this.f6101i.run();
                } else {
                    g2.a(activity, a.this.f6101i);
                }
            }
        }

        public a(String str, Runnable runnable) {
            this.f6100h = str;
            this.f6101i = runnable;
        }

        public void run() {
            a aVar = c.f6028i;
            if (aVar != null) {
                aVar.a(this.f6100h, new C0109a(aVar));
            }
        }
    }

    public static void a(@NonNull Activity activity, @NonNull Runnable runnable) {
        activity.getWindow().getDecorView().post(new a("decorViewReady:" + runnable, runnable));
    }

    public static int b(int i2) {
        return (int) (((float) i2) * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int c(@NonNull Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    public static boolean d(@NonNull Activity activity) {
        return (activity.getWindow().getDecorView().getApplicationWindowToken() != null) && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    public static boolean e(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        return view != null && displayMetrics.heightPixels - rect.bottom > a;
    }
}
