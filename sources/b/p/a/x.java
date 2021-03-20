package b.p.a;

import b.p.a.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class x {
    public static final List<l.a> d;
    public final List<l.a> a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal<c> f6442b = new ThreadLocal<>();
    public final Map<Object, l<?>> c = new LinkedHashMap();

    public static final class a {
        public final List<l.a> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public int f6443b = 0;

        public a a(l.a aVar) {
            List<l.a> list = this.a;
            int i2 = this.f6443b;
            this.f6443b = i2 + 1;
            list.add(i2, aVar);
            return this;
        }
    }

    public static final class b<T> extends l<T> {
        public final Type a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6444b;
        public final Object c;
        public l<T> d;

        public b(Type type, String str, Object obj) {
            this.a = type;
            this.f6444b = str;
            this.c = obj;
        }

        public T a(q qVar) {
            l<T> lVar = this.d;
            if (lVar != null) {
                return lVar.a(qVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void e(u uVar, T t) {
            l<T> lVar = this.d;
            if (lVar != null) {
                lVar.e(uVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            l<T> lVar = this.d;
            return lVar != null ? lVar.toString() : super.toString();
        }
    }

    public final class c {
        public final List<b<?>> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Deque<b<?>> f6445b = new ArrayDeque();
        public boolean c;

        public c() {
        }

        public IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (this.c) {
                return illegalArgumentException;
            }
            this.c = true;
            if (this.f6445b.size() == 1 && this.f6445b.getFirst().f6444b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> descendingIterator = this.f6445b.descendingIterator();
            while (descendingIterator.hasNext()) {
                b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.a);
                if (next.f6444b != null) {
                    sb.append(' ');
                    sb.append(next.f6444b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        public void b(boolean z) {
            this.f6445b.removeLast();
            if (this.f6445b.isEmpty()) {
                x.this.f6442b.remove();
                if (z) {
                    synchronized (x.this.c) {
                        int size = this.a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b bVar = this.a.get(i2);
                            l<T> put = x.this.c.put(bVar.c, bVar.d);
                            if (put != null) {
                                bVar.d = put;
                                x.this.c.put(bVar.c, put);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(y.a);
        arrayList.add(h.f6383b);
        arrayList.add(w.c);
        arrayList.add(a.c);
        arrayList.add(g.d);
    }

    public x(a aVar) {
        int size = aVar.a.size();
        List<l.a> list = d;
        ArrayList arrayList = new ArrayList(list.size() + size);
        arrayList.addAll(aVar.a);
        arrayList.addAll(list);
        this.a = Collections.unmodifiableList(arrayList);
    }

    public <T> l<T> a(Class<T> cls) {
        return d(cls, b.p.a.z.b.a, (String) null);
    }

    public <T> l<T> b(Type type) {
        return c(type, b.p.a.z.b.a);
    }

    public <T> l<T> c(Type type, Set<? extends Annotation> set) {
        return d(type, set, (String) null);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [b.p.a.l<T>] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r3 = r8.f6442b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r3 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r3 = new b.p.a.x.c(r8);
        r8.f6442b.set(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = r3.a.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r5 >= r4) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r6 = r3.a.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r6.c.equals(r0) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r3.f6445b.add(r6);
        r11 = r6.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r11 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r4 = new b.p.a.x.b(r9, r11, r0);
        r3.a.add(r4);
        r3.f6445b.add(r4);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r6 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r3.b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11 = r8.a.size();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r0 >= r11) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r4 = r8.a.get(r0).a(r9, r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r4 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        r3.f6445b.getLast().d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        r3.b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + b.p.a.z.b.k(r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        throw r3.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        r3.b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        throw r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> b.p.a.l<T> d(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.reflect.Type r9 = b.p.a.z.b.a(r9)
            boolean r0 = r9 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            r0 = r9
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r3 = r0.getLowerBounds()
            int r3 = r3.length
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            java.lang.reflect.Type[] r9 = r0.getUpperBounds()
            int r0 = r9.length
            if (r0 != r2) goto L_0x00ef
            r9 = r9[r1]
        L_0x0029:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0031
            r0 = r9
            goto L_0x003c
        L_0x0031:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r9
            r0[r2] = r10
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x003c:
            java.util.Map<java.lang.Object, b.p.a.l<?>> r3 = r8.c
            monitor-enter(r3)
            java.util.Map<java.lang.Object, b.p.a.l<?>> r4 = r8.c     // Catch:{ all -> 0x00ec }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x00ec }
            b.p.a.l r4 = (b.p.a.l) r4     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x004b
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            return r4
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            java.lang.ThreadLocal<b.p.a.x$c> r3 = r8.f6442b
            java.lang.Object r3 = r3.get()
            b.p.a.x$c r3 = (b.p.a.x.c) r3
            if (r3 != 0) goto L_0x0060
            b.p.a.x$c r3 = new b.p.a.x$c
            r3.<init>()
            java.lang.ThreadLocal<b.p.a.x$c> r4 = r8.f6442b
            r4.set(r3)
        L_0x0060:
            java.util.List<b.p.a.x$b<?>> r4 = r3.a
            int r4 = r4.size()
            r5 = r1
        L_0x0067:
            if (r5 >= r4) goto L_0x0087
            java.util.List<b.p.a.x$b<?>> r6 = r3.a
            java.lang.Object r6 = r6.get(r5)
            b.p.a.x$b r6 = (b.p.a.x.b) r6
            java.lang.Object r7 = r6.c
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0084
            java.util.Deque<b.p.a.x$b<?>> r11 = r3.f6445b
            r11.add(r6)
            b.p.a.l<T> r11 = r6.d
            if (r11 == 0) goto L_0x0097
            r6 = r11
            goto L_0x0097
        L_0x0084:
            int r5 = r5 + 1
            goto L_0x0067
        L_0x0087:
            b.p.a.x$b r4 = new b.p.a.x$b
            r4.<init>(r9, r11, r0)
            java.util.List<b.p.a.x$b<?>> r11 = r3.a
            r11.add(r4)
            java.util.Deque<b.p.a.x$b<?>> r11 = r3.f6445b
            r11.add(r4)
            r6 = 0
        L_0x0097:
            if (r6 == 0) goto L_0x009d
            r3.b(r1)
            return r6
        L_0x009d:
            java.util.List<b.p.a.l$a> r11 = r8.a     // Catch:{ IllegalArgumentException -> 0x00e2 }
            int r11 = r11.size()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0 = r1
        L_0x00a4:
            if (r0 >= r11) goto L_0x00c5
            java.util.List<b.p.a.l$a> r4 = r8.a     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.l$a r4 = (b.p.a.l.a) r4     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.l r4 = r4.a(r9, r10, r8)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            if (r4 != 0) goto L_0x00b7
            int r0 = r0 + 1
            goto L_0x00a4
        L_0x00b7:
            java.util.Deque<b.p.a.x$b<?>> r9 = r3.f6445b     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.Object r9 = r9.getLast()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            b.p.a.x$b r9 = (b.p.a.x.b) r9     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r9.d = r4     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r3.b(r2)
            return r4
        L_0x00c5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r2 = "No JsonAdapter for "
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r9 = b.p.a.z.b.k(r9, r10)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r0.append(r9)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            java.lang.String r9 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x00e2 }
            r11.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x00e2 }
        L_0x00e0:
            r9 = move-exception
            goto L_0x00e8
        L_0x00e2:
            r9 = move-exception
            java.lang.IllegalArgumentException r9 = r3.a(r9)     // Catch:{ all -> 0x00e0 }
            throw r9     // Catch:{ all -> 0x00e0 }
        L_0x00e8:
            r3.b(r1)
            throw r9
        L_0x00ec:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            throw r9
        L_0x00ef:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.a.x.d(java.lang.reflect.Type, java.util.Set, java.lang.String):b.p.a.l");
    }
}
