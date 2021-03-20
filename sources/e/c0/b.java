package e.c0;

import e.a0.d;
import e.a0.e;
import e.b0.h;
import e.j;
import e.x.b.p;
import e.x.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class b implements h<d> {
    public final CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9878b;
    public final int c;
    public final p<CharSequence, Integer, j<Integer, Integer>> d;

    public static final class a implements Iterator<d>, e.x.c.z.a {

        /* renamed from: h  reason: collision with root package name */
        public int f9879h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f9880i;

        /* renamed from: j  reason: collision with root package name */
        public int f9881j;

        /* renamed from: k  reason: collision with root package name */
        public d f9882k;

        /* renamed from: l  reason: collision with root package name */
        public int f9883l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ b f9884m;

        public a(b bVar) {
            this.f9884m = bVar;
            int a = e.a(bVar.f9878b, 0, bVar.a.length());
            this.f9880i = a;
            this.f9881j = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f9881j
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f9879h = r1
                r0 = 0
                r7.f9882k = r0
                goto L_0x007e
            L_0x000c:
                e.c0.b r2 = r7.f9884m
                int r3 = r2.c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f9883l
                int r6 = r6 + r5
                r7.f9883l = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0033
            L_0x0023:
                int r0 = r7.f9880i
                e.a0.d r1 = new e.a0.d
                e.c0.b r2 = r7.f9884m
                java.lang.CharSequence r2 = r2.a
                int r2 = e.c0.h.g(r2)
                r1.<init>(r0, r2)
                goto L_0x0056
            L_0x0033:
                e.c0.b r0 = r7.f9884m
                e.x.b.p<java.lang.CharSequence, java.lang.Integer, e.j<java.lang.Integer, java.lang.Integer>> r2 = r0.d
                java.lang.CharSequence r0 = r0.a
                int r3 = r7.f9881j
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                e.j r0 = (e.j) r0
                if (r0 != 0) goto L_0x005b
                int r0 = r7.f9880i
                e.a0.d r1 = new e.a0.d
                e.c0.b r2 = r7.f9884m
                java.lang.CharSequence r2 = r2.a
                int r2 = e.c0.h.g(r2)
                r1.<init>(r0, r2)
            L_0x0056:
                r7.f9882k = r1
                r7.f9881j = r4
                goto L_0x007c
            L_0x005b:
                A r2 = r0.f7906h
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f7907i
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f9880i
                e.a0.d r3 = e.a0.e.d(r3, r2)
                r7.f9882k = r3
                int r2 = r2 + r0
                r7.f9880i = r2
                if (r0 != 0) goto L_0x0079
                r1 = r5
            L_0x0079:
                int r2 = r2 + r1
                r7.f9881j = r2
            L_0x007c:
                r7.f9879h = r5
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c0.b.a.a():void");
        }

        public boolean hasNext() {
            if (this.f9879h == -1) {
                a();
            }
            return this.f9879h == 1;
        }

        public Object next() {
            if (this.f9879h == -1) {
                a();
            }
            if (this.f9879h != 0) {
                d dVar = this.f9882k;
                Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f9882k = null;
                this.f9879h = -1;
                return dVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i2, int i3, p<? super CharSequence, ? super Integer, j<Integer, Integer>> pVar) {
        i.e(charSequence, "input");
        i.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.f9878b = i2;
        this.c = i3;
        this.d = pVar;
    }

    public Iterator<d> iterator() {
        return new a(this);
    }
}
