package b.l.c.b;

import b.l.a.c.b.a;
import b.l.c.b.g0;
import b.l.c.b.o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class h0 implements Iterator<o.a<E>> {

    /* renamed from: h  reason: collision with root package name */
    public g0.c<E> f4867h;

    /* renamed from: i  reason: collision with root package name */
    public o.a<E> f4868i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0 f4869j;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r6.f4853m.a(r0.a) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r6.f4842j.compare(r2, r0.a) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0(b.l.c.b.g0 r6) {
        /*
            r5 = this;
            r5.f4869j = r6
            r5.<init>()
            b.l.c.b.g0$d<b.l.c.b.g0$c<E>> r0 = r6.f4852l
            T r0 = r0.a
            b.l.c.b.g0$c r0 = (b.l.c.b.g0.c) r0
            r1 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x0045
        L_0x000f:
            b.l.c.b.l<E> r2 = r6.f4853m
            boolean r3 = r2.f4877l
            if (r3 == 0) goto L_0x0033
            T r2 = r2.f4878m
            java.util.Comparator<? super E> r3 = r6.f4842j
            b.l.c.b.g0$c r0 = r0.h(r3, r2)
            if (r0 != 0) goto L_0x0020
            goto L_0x0045
        L_0x0020:
            b.l.c.b.l<E> r3 = r6.f4853m
            b.l.c.b.f r3 = r3.f4879n
            b.l.c.b.f r4 = b.l.c.b.f.OPEN
            if (r3 != r4) goto L_0x0037
            java.util.Comparator<? super E> r3 = r6.f4842j
            E r4 = r0.a
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L_0x0037
            goto L_0x0035
        L_0x0033:
            b.l.c.b.g0$c<E> r0 = r6.f4854n
        L_0x0035:
            b.l.c.b.g0$c<E> r0 = r0.f4864h
        L_0x0037:
            b.l.c.b.g0$c<E> r2 = r6.f4854n
            if (r0 == r2) goto L_0x0045
            b.l.c.b.l<E> r6 = r6.f4853m
            E r2 = r0.a
            boolean r6 = r6.a(r2)
            if (r6 != 0) goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            r5.f4867h = r0
            r5.f4868i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.c.b.h0.<init>(b.l.c.b.g0):void");
    }

    public boolean hasNext() {
        g0.c<E> cVar = this.f4867h;
        if (cVar == null) {
            return false;
        }
        if (!this.f4869j.f4853m.d(cVar.a)) {
            return true;
        }
        this.f4867h = null;
        return false;
    }

    public Object next() {
        if (hasNext()) {
            g0 g0Var = this.f4869j;
            g0.c<E> cVar = this.f4867h;
            Objects.requireNonNull(g0Var);
            f0 f0Var = new f0(g0Var, cVar);
            this.f4868i = f0Var;
            g0.c<E> cVar2 = this.f4867h.f4864h;
            if (cVar2 == this.f4869j.f4854n) {
                cVar2 = null;
            }
            this.f4867h = cVar2;
            return f0Var;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        a.E(this.f4868i != null);
        this.f4869j.G(this.f4868i.m(), 0);
        this.f4868i = null;
    }
}
