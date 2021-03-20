package b.h.a;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.h.a.m.s;
import b.h.a.m.u.e;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.p;
import b.h.a.m.w.r;
import b.h.a.m.x.h.f;
import b.h.a.p.a;
import b.h.a.p.e;
import b.h.a.p.f;
import b.h.a.s.k.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class g {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final b.h.a.p.a f498b;
    public final b.h.a.p.e c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final b.h.a.m.u.f f499e;
    public final b.h.a.m.x.h.f f;

    /* renamed from: g  reason: collision with root package name */
    public final b.h.a.p.b f500g;

    /* renamed from: h  reason: collision with root package name */
    public final b.h.a.p.d f501h = new b.h.a.p.d();

    /* renamed from: i  reason: collision with root package name */
    public final b.h.a.p.c f502i = new b.h.a.p.c();

    /* renamed from: j  reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f503j;

    public static class a extends RuntimeException {
        public a(@NonNull String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(@androidx.annotation.NonNull java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.a.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(@NonNull M m2, @NonNull List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }
    }

    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public g() {
        a.c cVar = new a.c(new Pools.SynchronizedPool(20), new b.h.a.s.k.b(), new b.h.a.s.k.c());
        this.f503j = cVar;
        this.a = new p(cVar);
        this.f498b = new b.h.a.p.a();
        b.h.a.p.e eVar = new b.h.a.p.e();
        this.c = eVar;
        this.d = new f();
        this.f499e = new b.h.a.m.u.f();
        this.f = new b.h.a.m.x.h.f();
        this.f500g = new b.h.a.p.b();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.a);
            eVar.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    eVar.a.add(str);
                }
            }
        }
    }

    @NonNull
    public <Data> g a(@NonNull Class<Data> cls, @NonNull b.h.a.m.d<Data> dVar) {
        b.h.a.p.a aVar = this.f498b;
        synchronized (aVar) {
            aVar.a.add(new a.C0037a(cls, dVar));
        }
        return this;
    }

    @NonNull
    public <TResource> g b(@NonNull Class<TResource> cls, @NonNull s<TResource> sVar) {
        f fVar = this.d;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, sVar));
        }
        return this;
    }

    @NonNull
    public <Model, Data> g c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<Model, Data> oVar) {
        p pVar = this.a;
        synchronized (pVar) {
            r rVar = pVar.a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                List<r.b<?, ?>> list = rVar.a;
                list.add(list.size(), bVar);
            }
            pVar.f811b.a.clear();
        }
        return this;
    }

    @NonNull
    public <Data, TResource> g d(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull b.h.a.m.r<Data, TResource> rVar) {
        b.h.a.p.e eVar = this.c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a(cls, cls2, rVar));
        }
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        b.h.a.p.b bVar = this.f500g;
        synchronized (bVar) {
            list = bVar.a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    @NonNull
    public <Model> List<n<Model, ?>> f(@NonNull Model model) {
        List<n<Model, ?>> list;
        p pVar = this.a;
        Objects.requireNonNull(pVar);
        Class cls = model.getClass();
        synchronized (pVar) {
            p.a.C0031a aVar = pVar.f811b.a.get(cls);
            list = aVar == null ? null : aVar.a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.a.c(cls));
                if (pVar.f811b.a.put(cls, new p.a.C0031a(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                n nVar = list.get(i2);
                if (nVar.b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i2);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    @NonNull
    public g g(@NonNull e.a<?> aVar) {
        b.h.a.m.u.f fVar = this.f499e;
        synchronized (fVar) {
            fVar.a.put(aVar.a(), aVar);
        }
        return this;
    }

    @NonNull
    public <TResource, Transcode> g h(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull b.h.a.m.x.h.e<TResource, Transcode> eVar) {
        b.h.a.m.x.h.f fVar = this.f;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, cls2, eVar));
        }
        return this;
    }
}
