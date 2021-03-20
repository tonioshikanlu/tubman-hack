package b.h.a.m.w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import b.h.a.f;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.v.r;
import b.h.a.m.w.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f812b;

    public static class a<Data> implements d<Data>, d.a<Data> {

        /* renamed from: h  reason: collision with root package name */
        public final List<d<Data>> f813h;

        /* renamed from: i  reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f814i;

        /* renamed from: j  reason: collision with root package name */
        public int f815j;

        /* renamed from: k  reason: collision with root package name */
        public f f816k;

        /* renamed from: l  reason: collision with root package name */
        public d.a<? super Data> f817l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public List<Throwable> f818m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f819n;

        public a(@NonNull List<d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f814i = pool;
            if (!list.isEmpty()) {
                this.f813h = list;
                this.f815j = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @NonNull
        public Class<Data> a() {
            return this.f813h.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.f818m;
            if (list != null) {
                this.f814i.release(list);
            }
            this.f818m = null;
            for (d<Data> b2 : this.f813h) {
                b2.b();
            }
        }

        public void c(@NonNull Exception exc) {
            List<Throwable> list = this.f818m;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public void cancel() {
            this.f819n = true;
            for (d<Data> cancel : this.f813h) {
                cancel.cancel();
            }
        }

        public void d(@Nullable Data data) {
            if (data != null) {
                this.f817l.d(data);
            } else {
                g();
            }
        }

        @NonNull
        public b.h.a.m.a e() {
            return this.f813h.get(0).e();
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super Data> aVar) {
            this.f816k = fVar;
            this.f817l = aVar;
            this.f818m = this.f814i.acquire();
            this.f813h.get(this.f815j).f(fVar, this);
            if (this.f819n) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f819n) {
                if (this.f815j < this.f813h.size() - 1) {
                    this.f815j++;
                    f(this.f816k, this.f817l);
                    return;
                }
                Objects.requireNonNull(this.f818m, "Argument must not be null");
                this.f817l.c(new r("Fetch failed", (List<Throwable>) new ArrayList(this.f818m)));
            }
        }
    }

    public q(@NonNull List<n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.a = list;
        this.f812b = pool;
    }

    public n.a<Data> a(@NonNull Model model, int i2, int i3, @NonNull p pVar) {
        n.a a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        m mVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = this.a.get(i4);
            if (nVar.b(model) && (a2 = nVar.a(model, i2, i3, pVar)) != null) {
                mVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || mVar == null) {
            return null;
        }
        return new n.a<>(mVar, new a(arrayList, this.f812b));
    }

    public boolean b(@NonNull Model model) {
        for (n<Model, Data> b2 : this.a) {
            if (b2.b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("MultiModelLoader{modelLoaders=");
        y.append(Arrays.toString(this.a.toArray()));
        y.append('}');
        return y.toString();
    }
}
