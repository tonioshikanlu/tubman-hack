package e.a.a.a.y0.l;

import e.a.a.a.y0.o.n;
import e.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class e implements m {
    public static final String d;

    /* renamed from: e  reason: collision with root package name */
    public static final m f9624e = new a("NO_LOCKS", f.a, d.f9623b);
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9625b;
    public final String c;

    public static class a extends e {
        public a(String str, f fVar, k kVar) {
            super(str, fVar, kVar);
        }

        public <T> o<T> l() {
            return new o<>(null, true);
        }
    }

    public class b extends j<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f9626k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, e eVar2, e.x.b.a aVar, Object obj) {
            super(eVar2, aVar);
            this.f9626k = obj;
        }

        public o<T> c(boolean z) {
            return new o<>(this.f9626k, false);
        }
    }

    public class c extends k<T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e.x.b.l f9627l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ e.x.b.l f9628m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, e eVar2, e.x.b.a aVar, e.x.b.l lVar, e.x.b.l lVar2) {
            super(eVar2, aVar);
            this.f9627l = lVar;
            this.f9628m = lVar2;
        }

        public static /* synthetic */ void a(int i2) {
            String str = i2 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 != 2 ? 2 : 3)];
            if (i2 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4";
            } else {
                objArr[0] = "value";
            }
            if (i2 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4";
            }
            if (i2 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i2 != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public o<T> c(boolean z) {
            e.x.b.l lVar = this.f9627l;
            if (lVar != null) {
                return new o<>(lVar.invoke(Boolean.valueOf(z)), false);
            }
            o<T> c = super.c(z);
            if (c != null) {
                return c;
            }
            a(0);
            throw null;
        }
    }

    public static class d<K, V> extends C0222e<K, V> implements a<K, V> {
        public d(e eVar, ConcurrentMap concurrentMap, a aVar) {
            super(eVar, concurrentMap, (a) null);
        }

        public static /* synthetic */ void a(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 3 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "computation";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i2 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i2 != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V c(K k2, e.x.b.a<? extends V> aVar) {
            V invoke = invoke(new g(k2, aVar));
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    /* renamed from: e.a.a.a.y0.l.e$e  reason: collision with other inner class name */
    public static class C0222e<K, V> extends l<g<K, V>, V> implements b<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0222e(e eVar, ConcurrentMap concurrentMap, a aVar) {
            super(eVar, concurrentMap, new f());
            if (eVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i2 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public interface f {
        public static final f a = new a();

        public static class a implements f {
            public RuntimeException a(Throwable th) {
                e.x.c.i.e(th, "e");
                throw th;
            }
        }
    }

    public static class g<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public final e.x.b.a<? extends V> f9629b;

        public g(K k2, e.x.b.a<? extends V> aVar) {
            this.a = k2;
            this.f9629b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.a.equals(((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static class h<T> implements j<T> {

        /* renamed from: h  reason: collision with root package name */
        public final e f9630h;

        /* renamed from: i  reason: collision with root package name */
        public final e.x.b.a<? extends T> f9631i;

        /* renamed from: j  reason: collision with root package name */
        public volatile Object f9632j;

        public h(e eVar, e.x.b.a<? extends T> aVar) {
            if (eVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.f9632j = n.NOT_COMPUTED;
                this.f9630h = eVar;
                this.f9631i = aVar;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 2 || i2 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 2 || i2 == 3) ? 2 : 3)];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 == 2 || i2 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i2 == 2 || i2 == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i2 == 2 || i2 == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public void b(T t) {
        }

        public o<T> c(boolean z) {
            o<T> l2 = this.f9630h.l();
            if (l2 != null) {
                return l2;
            }
            a(2);
            throw null;
        }

        public T e() {
            T t;
            T t2 = n.RECURSION_WAS_DETECTED;
            T t3 = n.COMPUTING;
            T t4 = this.f9632j;
            if (!(t4 instanceof n)) {
                e.a.a.a.y0.o.n.b(t4);
                return t4;
            }
            this.f9630h.a.lock();
            try {
                T t5 = this.f9632j;
                if (!(t5 instanceof n)) {
                    e.a.a.a.y0.o.n.b(t5);
                    this.f9630h.a.unlock();
                    return t5;
                }
                if (t5 == t3) {
                    this.f9632j = t2;
                    o c = c(true);
                    if (!c.f9641b) {
                        t = c.a;
                        this.f9630h.a.unlock();
                        return t;
                    }
                }
                if (t5 == t2) {
                    o c2 = c(false);
                    if (!c2.f9641b) {
                        t = c2.a;
                        this.f9630h.a.unlock();
                        return t;
                    }
                }
                this.f9632j = t3;
                t = this.f9631i.e();
                b(t);
                this.f9632j = t;
                this.f9630h.a.unlock();
                return t;
            } catch (Throwable th) {
                this.f9630h.a.unlock();
                throw th;
            }
        }
    }

    public static abstract class i<T> extends h<T> {

        /* renamed from: k  reason: collision with root package name */
        public volatile l<T> f9633k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(e eVar, e.x.b.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.f9633k = null;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public final void b(T t) {
            this.f9633k = new l<>(t);
            try {
                c cVar = (c) this;
                if (t != null) {
                    cVar.f9628m.invoke(t);
                } else {
                    c.a(2);
                    throw null;
                }
            } finally {
                this.f9633k = null;
            }
        }

        public T e() {
            l<T> lVar = this.f9633k;
            if (lVar != null) {
                boolean z = true;
                if (lVar.f9642b == Thread.currentThread()) {
                    if (lVar.f9642b != Thread.currentThread()) {
                        z = false;
                    }
                    if (z) {
                        return lVar.a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return super.e();
        }
    }

    public static class j<T> extends h<T> implements i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(e eVar, e.x.b.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 2 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i2 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T e() {
            T e2 = super.e();
            if (e2 != null) {
                return e2;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class k<T> extends i<T> implements i<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(e eVar, e.x.b.a<? extends T> aVar) {
            super(eVar, aVar);
            if (eVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 2 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i2 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T e() {
            T e2 = super.e();
            if (e2 != null) {
                return e2;
            }
            a(2);
            throw null;
        }
    }

    public static class l<K, V> implements h<K, V> {

        /* renamed from: h  reason: collision with root package name */
        public final e f9634h;

        /* renamed from: i  reason: collision with root package name */
        public final ConcurrentMap<K, Object> f9635i;

        /* renamed from: j  reason: collision with root package name */
        public final e.x.b.l<? super K, ? extends V> f9636j;

        public l(e eVar, ConcurrentMap<K, Object> concurrentMap, e.x.b.l<? super K, ? extends V> lVar) {
            if (eVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
                this.f9634h = eVar;
                this.f9635i = concurrentMap;
                this.f9636j = lVar;
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 3 || i2 == 4) ? 2 : 3)];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 == 3 || i2 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i2 == 3 || i2 == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i2 == 3 || i2 == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public final AssertionError b(K k2, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k2 + ". Old value is " + obj + " under " + this.f9634h);
            e.m(assertionError);
            return assertionError;
        }

        public V invoke(K k2) {
            AssertionError th;
            AssertionError assertionError;
            n nVar = n.COMPUTING;
            Object obj = this.f9635i.get(k2);
            if (obj != null && obj != nVar) {
                return e.a.a.a.y0.o.n.a(obj);
            }
            this.f9634h.a.lock();
            try {
                Object obj2 = this.f9635i.get(k2);
                if (obj2 == nVar) {
                    AssertionError assertionError2 = new AssertionError("Recursion detected on input: " + k2 + " under " + this.f9634h);
                    e.m(assertionError2);
                    throw assertionError2;
                } else if (obj2 != null) {
                    return e.a.a.a.y0.o.n.a(obj2);
                } else {
                    try {
                        this.f9635i.put(k2, nVar);
                        V invoke = this.f9636j.invoke(k2);
                        Object put = this.f9635i.put(k2, invoke == null ? e.a.a.a.y0.o.n.a : invoke);
                        if (put == nVar) {
                            this.f9634h.a.unlock();
                            return invoke;
                        }
                        assertionError = b(k2, put);
                        try {
                            throw assertionError;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        assertionError = null;
                        if (e.a.a.a.y0.m.o1.c.O(th)) {
                            this.f9635i.remove(k2);
                            throw ((RuntimeException) th);
                        } else if (th != assertionError) {
                            Object put2 = this.f9635i.put(k2, new n.b(th, (n.a) null));
                            if (put2 != nVar) {
                                throw b(k2, put2);
                            }
                            ((f.a) this.f9634h.f9625b).a(th);
                            throw null;
                        } else {
                            ((f.a) this.f9634h.f9625b).a(th);
                            throw null;
                        }
                    }
                }
            } finally {
                this.f9634h.a.unlock();
            }
        }
    }

    public static class m<K, V> extends l<K, V> implements g<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(e eVar, ConcurrentMap<K, Object> concurrentMap, e.x.b.l<? super K, ? extends V> lVar) {
            super(eVar, concurrentMap, lVar);
            if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 != 3 ? 3 : 2)];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i2 != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k2) {
            V invoke = super.invoke(k2);
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class o<T> {
        public final T a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9641b;

        public o(T t, boolean z) {
            this.a = t;
            this.f9641b = z;
        }

        public String toString() {
            if (this.f9641b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.a);
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        String str = "";
        e.x.c.i.e(canonicalName, "$this$substringBeforeLast");
        e.x.c.i.e(".", "delimiter");
        e.x.c.i.e(str, "missingDelimiterValue");
        int p2 = e.c0.h.p(canonicalName, ".", 0, false, 6);
        if (p2 != -1) {
            str = canonicalName.substring(0, p2);
            e.x.c.i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        d = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.lang.String r5) {
        /*
            r4 = this;
            e.a.a.a.y0.l.e$f r0 = e.a.a.a.y0.l.e.f.a
            int r1 = e.a.a.a.y0.l.k.a
            e.a.a.a.y0.l.c r1 = new e.a.a.a.y0.l.c
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.l.e.<init>(java.lang.String):void");
    }

    public e(String str, f fVar, k kVar) {
        if (str == null) {
            j(4);
            throw null;
        } else if (fVar == null) {
            j(5);
            throw null;
        } else if (kVar != null) {
            this.a = kVar;
            this.f9625b = fVar;
            this.c = str;
        } else {
            j(6);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void j(int r12) {
        /*
            r0 = 30
            r1 = 14
            r2 = 10
            if (r12 == r2) goto L_0x000f
            if (r12 == r1) goto L_0x000f
            if (r12 == r0) goto L_0x000f
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0011
        L_0x000f:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x0011:
            r4 = 3
            r5 = 2
            if (r12 == r2) goto L_0x001b
            if (r12 == r1) goto L_0x001b
            if (r12 == r0) goto L_0x001b
            r6 = r4
            goto L_0x001c
        L_0x001b:
            r6 = r5
        L_0x001c:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r8 = "compute"
            r9 = 1
            r10 = 0
            if (r12 == r9) goto L_0x005a
            if (r12 == r4) goto L_0x005a
            r4 = 5
            if (r12 == r4) goto L_0x005a
            r4 = 6
            if (r12 == r4) goto L_0x0055
            switch(r12) {
                case 8: goto L_0x005a;
                case 9: goto L_0x0052;
                case 10: goto L_0x004f;
                case 11: goto L_0x0052;
                case 12: goto L_0x004a;
                case 13: goto L_0x0052;
                case 14: goto L_0x004f;
                case 15: goto L_0x0052;
                case 16: goto L_0x004a;
                case 17: goto L_0x0045;
                case 18: goto L_0x0045;
                case 19: goto L_0x0040;
                case 20: goto L_0x0045;
                case 21: goto L_0x0040;
                case 22: goto L_0x0045;
                case 23: goto L_0x003b;
                case 24: goto L_0x0045;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x003b;
                case 28: goto L_0x0045;
                case 29: goto L_0x0036;
                case 30: goto L_0x004f;
                default: goto L_0x0031;
            }
        L_0x0031:
            java.lang.String r4 = "debugText"
            r6[r10] = r4
            goto L_0x005e
        L_0x0036:
            java.lang.String r4 = "throwable"
            r6[r10] = r4
            goto L_0x005e
        L_0x003b:
            java.lang.String r4 = "postCompute"
            r6[r10] = r4
            goto L_0x005e
        L_0x0040:
            java.lang.String r4 = "onRecursiveCall"
            r6[r10] = r4
            goto L_0x005e
        L_0x0045:
            java.lang.String r4 = "computable"
            r6[r10] = r4
            goto L_0x005e
        L_0x004a:
            java.lang.String r4 = "map"
            r6[r10] = r4
            goto L_0x005e
        L_0x004f:
            r6[r10] = r7
            goto L_0x005e
        L_0x0052:
            r6[r10] = r8
            goto L_0x005e
        L_0x0055:
            java.lang.String r4 = "lock"
            r6[r10] = r4
            goto L_0x005e
        L_0x005a:
            java.lang.String r4 = "exceptionHandlingStrategy"
            r6[r10] = r4
        L_0x005e:
            java.lang.String r4 = "sanitizeStackTrace"
            java.lang.String r10 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r11 = "createMemoizedFunction"
            if (r12 == r2) goto L_0x0073
            if (r12 == r1) goto L_0x0070
            if (r12 == r0) goto L_0x006d
            r6[r9] = r7
            goto L_0x0075
        L_0x006d:
            r6[r9] = r4
            goto L_0x0075
        L_0x0070:
            r6[r9] = r10
            goto L_0x0075
        L_0x0073:
            r6[r9] = r11
        L_0x0075:
            switch(r12) {
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00a7;
                case 9: goto L_0x00a4;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00a4;
                case 12: goto L_0x00a4;
                case 13: goto L_0x00a1;
                case 14: goto L_0x00b0;
                case 15: goto L_0x00a1;
                case 16: goto L_0x00a1;
                case 17: goto L_0x009c;
                case 18: goto L_0x009c;
                case 19: goto L_0x009c;
                case 20: goto L_0x0097;
                case 21: goto L_0x0097;
                case 22: goto L_0x0092;
                case 23: goto L_0x0092;
                case 24: goto L_0x008d;
                case 25: goto L_0x0088;
                case 26: goto L_0x0083;
                case 27: goto L_0x0083;
                case 28: goto L_0x0080;
                case 29: goto L_0x007d;
                case 30: goto L_0x00b0;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.String r4 = "createWithExceptionHandling"
            r6[r5] = r4
            goto L_0x00b0
        L_0x007d:
            r6[r5] = r4
            goto L_0x00b0
        L_0x0080:
            r6[r5] = r8
            goto L_0x00b0
        L_0x0083:
            java.lang.String r4 = "createNullableLazyValueWithPostCompute"
            r6[r5] = r4
            goto L_0x00b0
        L_0x0088:
            java.lang.String r4 = "createRecursionTolerantNullableLazyValue"
            r6[r5] = r4
            goto L_0x00b0
        L_0x008d:
            java.lang.String r4 = "createNullableLazyValue"
            r6[r5] = r4
            goto L_0x00b0
        L_0x0092:
            java.lang.String r4 = "createLazyValueWithPostCompute"
            r6[r5] = r4
            goto L_0x00b0
        L_0x0097:
            java.lang.String r4 = "createRecursionTolerantLazyValue"
            r6[r5] = r4
            goto L_0x00b0
        L_0x009c:
            java.lang.String r4 = "createLazyValue"
            r6[r5] = r4
            goto L_0x00b0
        L_0x00a1:
            r6[r5] = r10
            goto L_0x00b0
        L_0x00a4:
            r6[r5] = r11
            goto L_0x00b0
        L_0x00a7:
            java.lang.String r4 = "replaceExceptionHandling"
            r6[r5] = r4
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r4 = "<init>"
            r6[r5] = r4
        L_0x00b0:
            java.lang.String r3 = java.lang.String.format(r3, r6)
            if (r12 == r2) goto L_0x00c0
            if (r12 == r1) goto L_0x00c0
            if (r12 == r0) goto L_0x00c0
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            goto L_0x00c5
        L_0x00c0:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r3)
        L_0x00c5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.l.e.j(int):void");
    }

    public static <K> ConcurrentMap<K, Object> k() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static <T extends Throwable> T m(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!stackTrace[i3].getClassName().startsWith(d)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i2, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        j(29);
        throw null;
    }

    public <T> i<T> a(e.x.b.a<? extends T> aVar) {
        if (aVar != null) {
            return new j(this, aVar);
        }
        j(17);
        throw null;
    }

    public <T> T b(e.x.b.a<? extends T> aVar) {
        this.a.lock();
        try {
            ((e.a.a.a.y0.a.h) aVar).e();
            this.a.unlock();
            return null;
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public <K, V> b<K, V> c() {
        return new C0222e(this, k(), (a) null);
    }

    public <T> j<T> d(e.x.b.a<? extends T> aVar) {
        return new h(this, aVar);
    }

    public <T> i<T> e(e.x.b.a<? extends T> aVar, e.x.b.l<? super Boolean, ? extends T> lVar, e.x.b.l<? super T, r> lVar2) {
        return new c(this, this, aVar, lVar, lVar2);
    }

    public <K, V> a<K, V> f() {
        return new d(this, k(), (a) null);
    }

    public <T> i<T> g(e.x.b.a<? extends T> aVar, T t) {
        return new b(this, this, aVar, t);
    }

    public <K, V> g<K, V> h(e.x.b.l<? super K, ? extends V> lVar) {
        return new m(this, k(), lVar);
    }

    public <K, V> h<K, V> i(e.x.b.l<? super K, ? extends V> lVar) {
        return new l(this, k(), lVar);
    }

    public <T> o<T> l() {
        IllegalStateException illegalStateException = new IllegalStateException("Recursive call in a lazy value under " + this);
        m(illegalStateException);
        throw illegalStateException;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return b.e.a.a.a.q(sb, this.c, ")");
    }
}
