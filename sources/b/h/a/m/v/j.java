package b.h.a.m.v;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.x.h.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends r<DataType, ResourceType>> f715b;
    public final e<ResourceType, Transcode> c;
    public final Pools.Pool<List<Throwable>> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f716e;

    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends r<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.f715b = list;
        this.c = eVar;
        this.d = pool;
        StringBuilder y = b.e.a.a.a.y("Failed DecodePath{");
        y.append(cls.getSimpleName());
        y.append("->");
        y.append(cls2.getSimpleName());
        y.append("->");
        y.append(cls3.getSimpleName());
        y.append("}");
        this.f716e = y.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: b.h.a.m.u.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: b.h.a.m.v.w<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: b.h.a.m.v.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: b.h.a.m.v.w<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: b.h.a.m.v.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: b.h.a.m.v.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: b.h.a.m.v.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: b.h.a.m.v.y} */
    /* JADX WARNING: type inference failed for: r11v13, types: [b.h.a.m.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.h.a.m.v.w<Transcode> a(b.h.a.m.u.e<DataType> r11, int r12, int r13, @androidx.annotation.NonNull b.h.a.m.p r14, b.h.a.m.v.j.a<ResourceType> r15) {
        /*
            r10 = this;
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r10.d
            java.lang.Object r0 = r0.acquire()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            b.h.a.m.v.w r11 = r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011e }
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r12 = r10.d
            r12.release(r0)
            b.h.a.m.v.i$b r15 = (b.h.a.m.v.i.b) r15
            b.h.a.m.v.i r12 = b.h.a.m.v.i.this
            b.h.a.m.a r13 = r15.a
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            b.h.a.m.a r15 = b.h.a.m.a.RESOURCE_DISK_CACHE
            r0 = 0
            if (r13 == r15) goto L_0x0045
            b.h.a.m.v.h<R> r15 = r12.f691h
            b.h.a.m.t r15 = r15.f(r7)
            b.h.a.e r1 = r12.f698o
            int r2 = r12.s
            int r3 = r12.t
            b.h.a.m.v.w r1 = r15.a(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L_0x0047
        L_0x0045:
            r15 = r11
            r6 = r0
        L_0x0047:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x0050
            r11.recycle()
        L_0x0050:
            b.h.a.m.v.h<R> r11 = r12.f691h
            b.h.a.e r11 = r11.c
            b.h.a.g r11 = r11.f487b
            b.h.a.p.f r11 = r11.d
            java.lang.Class r1 = r15.b()
            b.h.a.m.s r11 = r11.a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0066
            r11 = r2
            goto L_0x0067
        L_0x0066:
            r11 = r1
        L_0x0067:
            if (r11 == 0) goto L_0x008c
            b.h.a.m.v.h<R> r11 = r12.f691h
            b.h.a.e r11 = r11.c
            b.h.a.g r11 = r11.f487b
            b.h.a.p.f r11 = r11.d
            java.lang.Class r0 = r15.b()
            b.h.a.m.s r0 = r11.a(r0)
            if (r0 == 0) goto L_0x0082
            b.h.a.m.p r11 = r12.v
            b.h.a.m.c r11 = r0.b(r11)
            goto L_0x008e
        L_0x0082:
            b.h.a.g$d r11 = new b.h.a.g$d
            java.lang.Class r12 = r15.b()
            r11.<init>(r12)
            throw r11
        L_0x008c:
            b.h.a.m.c r11 = b.h.a.m.c.NONE
        L_0x008e:
            r9 = r0
            b.h.a.m.v.h<R> r0 = r12.f691h
            b.h.a.m.m r3 = r12.E
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = r1
        L_0x009c:
            if (r5 >= r4) goto L_0x00b1
            java.lang.Object r8 = r0.get(r5)
            b.h.a.m.w.n$a r8 = (b.h.a.m.w.n.a) r8
            b.h.a.m.m r8 = r8.a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00ae
            r1 = r2
            goto L_0x00b1
        L_0x00ae:
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00b1:
            r0 = r1 ^ 1
            b.h.a.m.v.k r1 = r12.u
            boolean r13 = r1.d(r0, r13, r11)
            if (r13 == 0) goto L_0x0117
            if (r9 == 0) goto L_0x0109
            int r13 = r11.ordinal()
            if (r13 == 0) goto L_0x00f3
            if (r13 != r2) goto L_0x00dc
            b.h.a.m.v.y r11 = new b.h.a.m.v.y
            b.h.a.m.v.h<R> r13 = r12.f691h
            b.h.a.e r13 = r13.c
            b.h.a.m.v.c0.b r1 = r13.a
            b.h.a.m.m r2 = r12.E
            b.h.a.m.m r3 = r12.f699p
            int r4 = r12.s
            int r5 = r12.t
            b.h.a.m.p r8 = r12.v
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00fc
        L_0x00dc:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f3:
            b.h.a.m.v.e r11 = new b.h.a.m.v.e
            b.h.a.m.m r13 = r12.E
            b.h.a.m.m r0 = r12.f699p
            r11.<init>(r13, r0)
        L_0x00fc:
            b.h.a.m.v.v r15 = b.h.a.m.v.v.c(r15)
            b.h.a.m.v.i$c<?> r12 = r12.f696m
            r12.a = r11
            r12.f702b = r9
            r12.c = r15
            goto L_0x0117
        L_0x0109:
            b.h.a.g$d r11 = new b.h.a.g$d
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x0117:
            b.h.a.m.x.h.e<ResourceType, Transcode> r11 = r10.c
            b.h.a.m.v.w r11 = r11.a(r15, r14)
            return r11
        L_0x011e:
            r11 = move-exception
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r12 = r10.d
            r12.release(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.j.a(b.h.a.m.u.e, int, int, b.h.a.m.p, b.h.a.m.v.j$a):b.h.a.m.v.w");
    }

    @NonNull
    public final w<ResourceType> b(b.h.a.m.u.e<DataType> eVar, int i2, int i3, @NonNull p pVar, List<Throwable> list) {
        int size = this.f715b.size();
        w<ResourceType> wVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            r rVar = (r) this.f715b.get(i4);
            try {
                if (rVar.b(eVar.a(), pVar)) {
                    wVar = rVar.a(eVar.a(), i2, i3, pVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + rVar, e2);
                }
                list.add(e2);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f716e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("DecodePath{ dataClass=");
        y.append(this.a);
        y.append(", decoders=");
        y.append(this.f715b);
        y.append(", transcoder=");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }
}
