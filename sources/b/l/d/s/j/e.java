package b.l.d.s.j;

import androidx.annotation.NonNull;
import b.l.d.s.g;
import b.l.d.s.h;
import b.l.d.s.i.b;
import com.google.android.material.datepicker.UtcDates;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class e implements b<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5290e = new a((d) null);
    public final Map<Class<?>, b.l.d.s.e<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f5291b;
    public b.l.d.s.e<Object> c = a.a;
    public boolean d = false;

    public static final class a implements g<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        }

        public a(d dVar) {
        }

        public void a(@NonNull Object obj, @NonNull Object obj2) {
            ((h) obj2).d(a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f5291b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, b.a);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, c.a);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f5290e);
        hashMap.remove(cls3);
    }
}
