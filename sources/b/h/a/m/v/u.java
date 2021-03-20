package b.h.a.m.v;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.e.a.a.a;
import b.h.a.m.p;
import b.h.a.m.u.e;
import b.h.a.m.v.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class u<Data, ResourceType, Transcode> {
    public final Pools.Pool<List<Throwable>> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<Data, ResourceType, Transcode>> f767b;
    public final String c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = pool;
        if (!list.isEmpty()) {
            this.f767b = list;
            StringBuilder y = a.y("Failed LoadPath{");
            y.append(cls.getSimpleName());
            y.append("->");
            y.append(cls2.getSimpleName());
            y.append("->");
            y.append(cls3.getSimpleName());
            y.append("}");
            this.c = y.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public w<Transcode> a(e<Data> eVar, @NonNull p pVar, int i2, int i3, j.a<ResourceType> aVar) {
        w<Transcode> wVar;
        List<Throwable> acquire = this.a.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List list = acquire;
        try {
            int size = this.f767b.size();
            wVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                wVar = ((j) this.f767b.get(i4)).a(eVar, i2, i3, pVar, aVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (r e2) {
            list.add(e2);
        } catch (Throwable th) {
            this.a.release(list);
            throw th;
        }
        if (wVar != null) {
            this.a.release(list);
            return wVar;
        }
        throw new r(this.c, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder y = a.y("LoadPath{decodePaths=");
        y.append(Arrays.toString(this.f767b.toArray()));
        y.append('}');
        return y.toString();
    }
}
