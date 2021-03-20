package b.h.a.p;

import androidx.annotation.NonNull;
import b.h.a.m.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f957b = new HashMap();

    public static class a<T, R> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f958b;
        public final r<T, R> c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, r<T, R> rVar) {
            this.a = cls;
            this.f958b = cls2;
            this.c = rVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f958b);
        }
    }

    @NonNull
    public final synchronized List<a<?, ?>> a(@NonNull String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.f957b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f957b.put(str, list);
        }
        return list;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a> list = this.f957b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f958b)) {
                        arrayList.add(aVar.f958b);
                    }
                }
            }
        }
        return arrayList;
    }
}
