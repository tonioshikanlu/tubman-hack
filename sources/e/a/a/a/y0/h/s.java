package e.a.a.a.y0.h;

import androidx.appcompat.widget.ActivityChooserView;
import e.a.a.a.y0.h.c;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class s extends c {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9259o;

    /* renamed from: i  reason: collision with root package name */
    public final int f9260i;

    /* renamed from: j  reason: collision with root package name */
    public final c f9261j;

    /* renamed from: k  reason: collision with root package name */
    public final c f9262k;

    /* renamed from: l  reason: collision with root package name */
    public final int f9263l;

    /* renamed from: m  reason: collision with root package name */
    public final int f9264m;

    /* renamed from: n  reason: collision with root package name */
    public int f9265n = 0;

    public static class b {
        public final Stack<c> a = new Stack<>();

        public b(a aVar) {
        }

        public final void a(c cVar) {
            if (cVar.v()) {
                int size = cVar.size();
                int[] iArr = s.f9259o;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i2 = iArr[binarySearch + 1];
                if (this.a.isEmpty() || this.a.peek().size() >= i2) {
                    this.a.push(cVar);
                    return;
                }
                int i3 = iArr[binarySearch];
                c pop = this.a.pop();
                while (!this.a.isEmpty() && this.a.peek().size() < i3) {
                    pop = new s(this.a.pop(), pop);
                }
                s sVar = new s(pop, cVar);
                while (!this.a.isEmpty()) {
                    int i4 = sVar.f9260i;
                    int[] iArr2 = s.f9259o;
                    int binarySearch2 = Arrays.binarySearch(iArr2, i4);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.a.peek().size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    sVar = new s(this.a.pop(), sVar);
                }
                this.a.push(sVar);
            } else if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                a(sVar2.f9261j);
                a(sVar2.f9262k);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                throw new IllegalArgumentException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    public static class c implements Iterator<o> {

        /* renamed from: h  reason: collision with root package name */
        public final Stack<s> f9266h = new Stack<>();

        /* renamed from: i  reason: collision with root package name */
        public o f9267i;

        public c(c cVar, a aVar) {
            while (cVar instanceof s) {
                s sVar = (s) cVar;
                this.f9266h.push(sVar);
                cVar = sVar.f9261j;
            }
            this.f9267i = (o) cVar;
        }

        /* renamed from: a */
        public o next() {
            o oVar;
            boolean z;
            o oVar2 = this.f9267i;
            if (oVar2 != null) {
                while (true) {
                    if (!this.f9266h.isEmpty()) {
                        c cVar = this.f9266h.pop().f9262k;
                        while (cVar instanceof s) {
                            s sVar = (s) cVar;
                            this.f9266h.push(sVar);
                            cVar = sVar.f9261j;
                        }
                        oVar = (o) cVar;
                        if (oVar.size() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        oVar = null;
                        break;
                    }
                }
                this.f9267i = oVar;
                return oVar2;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f9267i != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class d implements c.a {

        /* renamed from: h  reason: collision with root package name */
        public final c f9268h;

        /* renamed from: i  reason: collision with root package name */
        public c.a f9269i;

        /* renamed from: j  reason: collision with root package name */
        public int f9270j;

        public d(s sVar, a aVar) {
            c cVar = new c(sVar, (a) null);
            this.f9268h = cVar;
            this.f9269i = cVar.next().iterator();
            this.f9270j = sVar.f9260i;
        }

        public byte d() {
            if (!this.f9269i.hasNext()) {
                this.f9269i = this.f9268h.next().iterator();
            }
            this.f9270j--;
            return this.f9269i.d();
        }

        public boolean hasNext() {
            return this.f9270j > 0;
        }

        public Object next() {
            return Byte.valueOf(d());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        f9259o = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = f9259o;
            if (i5 < iArr.length) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                i5++;
            } else {
                return;
            }
        }
    }

    public s(c cVar, c cVar2) {
        this.f9261j = cVar;
        this.f9262k = cVar2;
        int size = cVar.size();
        this.f9263l = size;
        this.f9260i = cVar2.size() + size;
        this.f9264m = Math.max(cVar.s(), cVar2.s()) + 1;
    }

    public static o N(c cVar, c cVar2) {
        int size = cVar.size();
        int size2 = cVar2.size();
        byte[] bArr = new byte[(size + size2)];
        cVar.n(bArr, 0, 0, size);
        cVar2.n(bArr, 0, size, size2);
        return new o(bArr);
    }

    public c.a C() {
        return new d(this, (a) null);
    }

    public int G(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f9263l;
        if (i5 <= i6) {
            return this.f9261j.G(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f9262k.G(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f9262k.G(this.f9261j.G(i2, i3, i7), 0, i4 - i7);
    }

    public int H(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f9263l;
        if (i5 <= i6) {
            return this.f9261j.H(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f9262k.H(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f9262k.H(this.f9261j.H(i2, i3, i7), 0, i4 - i7);
    }

    public int I() {
        return this.f9265n;
    }

    public String J(String str) {
        byte[] bArr;
        int i2 = this.f9260i;
        if (i2 == 0) {
            bArr = i.a;
        } else {
            byte[] bArr2 = new byte[i2];
            p(bArr2, 0, 0, i2);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }

    public void L(OutputStream outputStream, int i2, int i3) {
        c cVar;
        int i4 = i2 + i3;
        int i5 = this.f9263l;
        if (i4 <= i5) {
            cVar = this.f9261j;
        } else if (i2 >= i5) {
            cVar = this.f9262k;
            i2 -= i5;
        } else {
            int i6 = i5 - i2;
            this.f9261j.L(outputStream, i2, i6);
            this.f9262k.L(outputStream, 0, i3 - i6);
            return;
        }
        cVar.L(outputStream, i2, i3);
    }

    public boolean equals(Object obj) {
        int I;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9260i != cVar.size()) {
            return false;
        }
        if (this.f9260i == 0) {
            return true;
        }
        if (this.f9265n != 0 && (I = cVar.I()) != 0 && this.f9265n != I) {
            return false;
        }
        c cVar2 = new c(this, (a) null);
        o oVar = (o) cVar2.next();
        c cVar3 = new c(cVar, (a) null);
        o oVar2 = (o) cVar3.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length = oVar.f9254i.length - i2;
            int length2 = oVar2.f9254i.length - i3;
            int min = Math.min(length, length2);
            if (!(i2 == 0 ? oVar.N(oVar2, i3, min) : oVar2.N(oVar, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f9260i;
            if (i4 < i5) {
                if (min == length) {
                    oVar = (o) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == length2) {
                    oVar2 = (o) cVar3.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i2 = this.f9265n;
        if (i2 == 0) {
            int i3 = this.f9260i;
            i2 = G(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f9265n = i2;
        }
        return i2;
    }

    public Iterator iterator() {
        return new d(this, (a) null);
    }

    public void p(byte[] bArr, int i2, int i3, int i4) {
        c cVar;
        int i5 = i2 + i4;
        int i6 = this.f9263l;
        if (i5 <= i6) {
            cVar = this.f9261j;
        } else if (i2 >= i6) {
            cVar = this.f9262k;
            i2 -= i6;
        } else {
            int i7 = i6 - i2;
            this.f9261j.p(bArr, i2, i3, i7);
            this.f9262k.p(bArr, 0, i3 + i7, i4 - i7);
            return;
        }
        cVar.p(bArr, i2, i3, i4);
    }

    public int s() {
        return this.f9264m;
    }

    public int size() {
        return this.f9260i;
    }

    public boolean v() {
        return this.f9260i >= f9259o[this.f9264m];
    }

    public boolean y() {
        int H = this.f9261j.H(0, 0, this.f9263l);
        c cVar = this.f9262k;
        return cVar.H(H, 0, cVar.size()) == 0;
    }
}
