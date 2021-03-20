package b.h.a.m.v.c0;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import b.h.a.s.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
public class m implements k {
    public static final Bitmap.Config[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f644e;
    public static final Bitmap.Config[] f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f645g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f646h = {Bitmap.Config.ALPHA_8};
    public final c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final g<b, Bitmap> f647b = new g<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.c0.m.a.<clinit>():void");
        }
    }

    @VisibleForTesting
    public static final class b implements l {
        public final c a;

        /* renamed from: b  reason: collision with root package name */
        public int f648b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f648b == bVar.f648b && j.b(this.c, bVar.c);
        }

        public int hashCode() {
            int i2 = this.f648b * 31;
            Bitmap.Config config = this.c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.f648b, this.c);
        }
    }

    @VisibleForTesting
    public static class c extends c<b> {
        public l a() {
            return new b(this);
        }

        public b d(int i2, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.f648b = i2;
            bVar.c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        f644e = configArr;
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d2.remove(num);
        } else {
            d2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Nullable
    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c2 = j.c(i2, i3, config);
        b bVar = (b) this.a.b();
        bVar.f648b = c2;
        bVar.c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i5 = a.a[config.ordinal()];
            if (i5 == 1) {
                configArr = d;
            } else if (i5 == 2) {
                configArr = f;
            } else if (i5 != 3) {
                configArr = i5 != 4 ? new Bitmap.Config[]{config} : f646h;
            } else {
                configArr = f645g;
            }
        } else {
            configArr = f644e;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(c2));
            if (ceilingKey == null || ceilingKey.intValue() > c2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != c2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.a.c(bVar);
                bVar = this.a.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a2 = this.f647b.a(bVar);
        if (a2 != null) {
            a(Integer.valueOf(bVar.f648b), a2);
            a2.reconfigure(i2, i3, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    public String e(Bitmap bitmap) {
        return c(j.d(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b d2 = this.a.d(j.d(bitmap), bitmap.getConfig());
        this.f647b.b(d2, bitmap);
        NavigableMap<Integer, Integer> d3 = d(bitmap.getConfig());
        Integer num = (Integer) d3.get(Integer.valueOf(d2.f648b));
        Integer valueOf = Integer.valueOf(d2.f648b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        d3.put(valueOf, Integer.valueOf(i2));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("SizeConfigStrategy{groupedMap=");
        y.append(this.f647b);
        y.append(", sortedSizes=(");
        for (Map.Entry next : this.c.entrySet()) {
            y.append(next.getKey());
            y.append('[');
            y.append(next.getValue());
            y.append("], ");
        }
        if (!this.c.isEmpty()) {
            y.replace(y.length() - 2, y.length(), "");
        }
        y.append(")}");
        return y.toString();
    }
}
