package b.h.a.m.v.d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;

public final class j {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f664b;
    public final Context c;
    public final int d;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f665e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f666b;
        public c c;
        public float d = ((float) f665e);

        public a(Context context) {
            this.a = context;
            this.f666b = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f666b.isLowRamDevice()) {
                this.d = 0.0f;
            }
        }
    }

    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public interface c {
    }

    public j(a aVar) {
        this.c = aVar.a;
        int i2 = aVar.f666b.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i2;
        ActivityManager activityManager = aVar.f666b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.c).a;
        float f = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.d * f);
        int round3 = Math.round(f * 2.0f);
        int i3 = round - i2;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.f664b = round3;
            this.a = round2;
        } else {
            float f2 = ((float) i3) / (aVar.d + 2.0f);
            this.f664b = Math.round(2.0f * f2);
            this.a = Math.round(f2 * aVar.d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder y = b.e.a.a.a.y("Calculation complete, Calculated memory cache size: ");
            y.append(a(this.f664b));
            y.append(", pool size: ");
            y.append(a(this.a));
            y.append(", byte array size: ");
            y.append(a(i2));
            y.append(", memory class limited? ");
            y.append(i4 > round);
            y.append(", max size: ");
            y.append(a(round));
            y.append(", memoryClass: ");
            y.append(aVar.f666b.getMemoryClass());
            y.append(", isLowMemoryDevice: ");
            y.append(aVar.f666b.isLowRamDevice());
            Log.d("MemorySizeCalculator", y.toString());
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.c, (long) i2);
    }
}
