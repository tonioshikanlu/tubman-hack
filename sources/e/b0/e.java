package e.b0;

import e.x.b.l;
import e.x.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e<T> implements h<T> {
    public final h<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9849b;
    public final l<T, Boolean> c;

    public static final class a implements Iterator<T>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public final Iterator<T> f9850h;

        /* renamed from: i  reason: collision with root package name */
        public int f9851i = -1;

        /* renamed from: j  reason: collision with root package name */
        public T f9852j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e f9853k;

        public a(e eVar) {
            this.f9853k = eVar;
            this.f9850h = eVar.a.iterator();
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r3 = this;
            L_0x0000:
                java.util.Iterator<T> r0 = r3.f9850h
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L_0x0028
                java.util.Iterator<T> r0 = r3.f9850h
                java.lang.Object r0 = r0.next()
                e.b0.e r1 = r3.f9853k
                e.x.b.l<T, java.lang.Boolean> r1 = r1.c
                java.lang.Object r1 = r1.invoke(r0)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                e.b0.e r2 = r3.f9853k
                boolean r2 = r2.f9849b
                if (r1 != r2) goto L_0x0000
                r3.f9852j = r0
                r0 = 1
            L_0x0025:
                r3.f9851i = r0
                return
            L_0x0028:
                r0 = 0
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b0.e.a.a():void");
        }

        public boolean hasNext() {
            if (this.f9851i == -1) {
                a();
            }
            return this.f9851i == 1;
        }

        public T next() {
            if (this.f9851i == -1) {
                a();
            }
            if (this.f9851i != 0) {
                T t = this.f9852j;
                this.f9852j = null;
                this.f9851i = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h<? extends T> hVar, boolean z, l<? super T, Boolean> lVar) {
        i.e(hVar, "sequence");
        i.e(lVar, "predicate");
        this.a = hVar;
        this.f9849b = z;
        this.c = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
